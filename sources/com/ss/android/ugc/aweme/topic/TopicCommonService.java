package com.ss.android.ugc.aweme.topic;

import X.C139825eE;
import X.C58096Mr6;
import X.C82682Wcg;
import X.EnumC42934Gt8;
import X.FMX;
import X.WHL;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.topic.book.experiment.BookTokPublishSettings;
import com.ss.android.ugc.aweme.topic.movie.experiment.MovieTokPublishSettings;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes8.dex */
public final class TopicCommonService implements ITopicCommonService {
    public static ITopicCommonService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(ITopicCommonService.class, false);
        if (LIZ != null) {
            return (ITopicCommonService) LIZ;
        }
        if (C58096Mr6.y7 == null) {
            synchronized (ITopicCommonService.class) {
                if (C58096Mr6.y7 == null) {
                    C58096Mr6.y7 = new TopicCommonService();
                }
            }
        }
        return C58096Mr6.y7;
    }

    @Override // com.ss.android.ugc.aweme.topic.ITopicCommonService
    public final HashMap<Integer, Boolean> LIZ() {
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        if (e1.LIZ(31744, "enable_show_movietok", true, false)) {
            hashMap.put(Integer.valueOf(EnumC42934Gt8.ANCHOR_MOVIETOK.getTYPE()), Boolean.FALSE);
        }
        if (e1.LIZ(31744, "enable_show_booktok", true, false)) {
            hashMap.put(Integer.valueOf(EnumC42934Gt8.ANCHOR_BOOKTOK.getTYPE()), Boolean.FALSE);
        }
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.topic.ITopicCommonService
    public final void LIZIZ(String text, View view, HashMap<Integer, Boolean> hasShown) {
        boolean z;
        long j;
        List<String> list;
        AppCompatTextView appCompatTextView;
        long j2;
        List<String> list2;
        AppCompatTextView appCompatTextView2;
        o.LJIIIZ(text, "text");
        o.LJIIIZ(hasShown, "hasShown");
        if (e1.LIZ(31744, "enable_show_movietok", true, false)) {
            z = true;
        } else {
            z = false;
        }
        if (z && !o.LJ(hasShown.get(Integer.valueOf(EnumC42934Gt8.ANCHOR_MOVIETOK.getTYPE())), Boolean.TRUE)) {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            MovieTokPublishSettings.MovieTokPublishSettingsModel movieTokPublishSettingsModel = MovieTokPublishSettings.LIZ;
            MovieTokPublishSettings.MovieTokPublishSettingsModel movieTokPublishSettingsModel2 = (MovieTokPublishSettings.MovieTokPublishSettingsModel) LIZLLL.LJIIIIZZ("movietok_publish_settings", MovieTokPublishSettings.MovieTokPublishSettingsModel.class, movieTokPublishSettingsModel);
            if (movieTokPublishSettingsModel2 != null) {
                movieTokPublishSettingsModel = movieTokPublishSettingsModel2;
            }
            Keva repo = Keva.getRepo("topic_movietok");
            int i = repo.getInt("guide_show_count", 0);
            long j3 = i;
            Long l = movieTokPublishSettingsModel.maxCountGuideShow;
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            if (j3 < j && (list = movieTokPublishSettingsModel.keywords) != null && !list.isEmpty()) {
                List<String> list3 = movieTokPublishSettingsModel.keywords;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator<String> it = list3.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String next = it.next();
                        if (next != null && s.LJJJLZIJ(text, next, true)) {
                            repo.storeInt("guide_show_count", i + 1);
                            hasShown.put(Integer.valueOf(EnumC42934Gt8.ANCHOR_MOVIETOK.getTYPE()), Boolean.TRUE);
                            FMX.onEventV3("add_movie_guide_show");
                            if ((view instanceof TuxTextView) && (appCompatTextView = (AppCompatTextView) view) != null) {
                                int measureText = (int) ((appCompatTextView.getPaint().measureText(appCompatTextView.getText().toString()) - appCompatTextView.getMeasuredWidth()) / 2);
                                Context context = view.getContext();
                                o.LJIIIIZZ(context, "target.context");
                                C139825eE c139825eE = new C139825eE(context);
                                c139825eE.LIZ.LIZIZ = view;
                                c139825eE.LJIIJJI(R.string.i99);
                                c139825eE.LJI(WHL.TOP);
                                C82682Wcg c82682Wcg = c139825eE.LIZ;
                                c82682Wcg.LJ = measureText;
                                c82682Wcg.LJI = measureText;
                                c82682Wcg.LJII = 3000L;
                                c139825eE.LIZJ().show();
                                return;
                            }
                        }
                    }
                }
            }
        }
        if (!e1.LIZ(31744, "enable_show_booktok", true, false) || o.LJ(hasShown.get(Integer.valueOf(EnumC42934Gt8.ANCHOR_BOOKTOK.getTYPE())), Boolean.TRUE)) {
            return;
        }
        SettingsManager LIZLLL2 = SettingsManager.LIZLLL();
        BookTokPublishSettings.BookTokPublishSettingsModel bookTokPublishSettingsModel = BookTokPublishSettings.LIZ;
        BookTokPublishSettings.BookTokPublishSettingsModel bookTokPublishSettingsModel2 = (BookTokPublishSettings.BookTokPublishSettingsModel) LIZLLL2.LJIIIIZZ("booktok_publish_settings", BookTokPublishSettings.BookTokPublishSettingsModel.class, bookTokPublishSettingsModel);
        if (bookTokPublishSettingsModel2 == null) {
            if (bookTokPublishSettingsModel == null) {
                return;
            }
        } else {
            bookTokPublishSettingsModel = bookTokPublishSettingsModel2;
        }
        Keva repo2 = Keva.getRepo("topic_booktok");
        int i2 = repo2.getInt("guide_show_count", 0);
        long j4 = i2;
        Long l2 = bookTokPublishSettingsModel.maxCountGuideShow;
        if (l2 != null) {
            j2 = l2.longValue();
        } else {
            j2 = 0;
        }
        if (j4 >= j2 || (list2 = bookTokPublishSettingsModel.keywords) == null || list2.isEmpty()) {
            return;
        }
        List<String> list4 = bookTokPublishSettingsModel.keywords;
        if ((list4 instanceof Collection) && list4.isEmpty()) {
            return;
        }
        for (String str : list4) {
            if (str != null && s.LJJJLZIJ(text, str, true)) {
                FMX.onEventV3("add_book_guide_show");
                repo2.storeInt("guide_show_count", i2 + 1);
                hasShown.put(Integer.valueOf(EnumC42934Gt8.ANCHOR_BOOKTOK.getTYPE()), Boolean.TRUE);
                if (!(view instanceof TuxTextView) || (appCompatTextView2 = (AppCompatTextView) view) == null) {
                    return;
                }
                int measureText2 = (int) ((appCompatTextView2.getPaint().measureText(appCompatTextView2.getText().toString()) - appCompatTextView2.getMeasuredWidth()) / 2);
                Context context2 = view.getContext();
                o.LJIIIIZZ(context2, "target.context");
                C139825eE c139825eE2 = new C139825eE(context2);
                c139825eE2.LIZ.LIZIZ = view;
                c139825eE2.LJIIJJI(R.string.ccw);
                c139825eE2.LJI(WHL.TOP);
                C82682Wcg c82682Wcg2 = c139825eE2.LIZ;
                c82682Wcg2.LJ = measureText2;
                c82682Wcg2.LJI = measureText2;
                c82682Wcg2.LJII = 3000L;
                c139825eE2.LIZJ().show();
                return;
            }
        }
    }
}
