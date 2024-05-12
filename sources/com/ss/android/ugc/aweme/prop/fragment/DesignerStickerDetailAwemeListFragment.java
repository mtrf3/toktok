package com.ss.android.ugc.aweme.prop.fragment;

import X.C188727au;
import X.C243439gx;
import X.C245319jz;
import X.C252669vq;
import X.C53378KxC;
import X.FMX;
import X.MGX;
import X.MHT;
import X.MHU;
import X.MHZ;
import Y.ACListenerS39S0200000_4;
import Y.ACListenerS44S0200000_9;
import Y.AObserverS72S0100000_4;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.featureeffectvideo.model.FeatureVideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.prop.fragment.DesignerStickerDetailAwemeListFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class DesignerStickerDetailAwemeListFragment extends DetailAwemeListFragment {
    public static final /* synthetic */ int LLJIJIL = 0;
    public Aweme LLILLL;
    public String LLILZ;
    public UrlModel LLILZIL;
    public String LLILZLL;
    public FeatureVideoViewModel LLIZLLLIL;
    public MHZ LLJ;
    public final Map<Integer, View> LLJI = new LinkedHashMap();
    public int LLIZ = 2;

    @Override // com.ss.android.ugc.aweme.challenge.ui.AbsDetailAwemeListFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, com.ss.android.ugc.aweme.challenge.ui.AbsDetailAwemeListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final boolean Al() {
        if (C53378KxC.LIZIZ() && C53378KxC.LIZ(this.LLILZLL)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final List<Aweme> Ml(List<Aweme> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) list;
        if (arrayList2.isEmpty()) {
            MHU mhu = new MHU();
            mhu.setFeatureVideo(Aweme.VideoType.NO_FEATURE_VIDEO_SELECTED);
            mhu.setIcon(this.LLILZIL);
            arrayList.add(mhu);
        } else {
            if (C53378KxC.LIZIZ()) {
                MHU mhu2 = new MHU();
                if (this.LLILLL != null && this.LLIZ == 1) {
                    mhu2.setFeatureVideo(Aweme.VideoType.FEATURE_VIDEO_CLIENT_SELECTED);
                    mhu2.update(this.LLILLL);
                } else {
                    mhu2.setFeatureVideo(Aweme.VideoType.NO_FEATURE_VIDEO_SELECTED);
                    mhu2.setIcon(this.LLILZIL);
                }
                arrayList.add(mhu2);
            }
            if (this.LLILLL != null && this.LLIZ == 1) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    Aweme aweme = (Aweme) it.next();
                    Aweme aweme2 = this.LLILLL;
                    if (aweme2 != null && !o.LJ(aweme.getAid(), aweme2.getAid())) {
                        arrayList.add(aweme);
                    }
                }
            } else {
                arrayList.addAll(list);
            }
        }
        AVExternalServiceImpl.LIZ().provideAVPerformance().end("tool_performance_effect_shoot_same", "setData");
        return arrayList;
    }

    public final void Rl(Aweme aweme) {
        Aweme aweme2;
        String str;
        String str2 = "";
        if (this.LLIZ == 1) {
            Aweme aweme3 = this.LLILLL;
            if (aweme3 == null) {
                str = "";
            } else {
                str = aweme3.getVideo().getVideoId();
            }
            aweme2 = this.LLILLL;
        } else {
            aweme2 = null;
            str = "";
        }
        String str3 = this.LLILZ;
        if (str3 != null) {
            String secAuthorUid = aweme.getSecAuthorUid();
            o.LJIIIIZZ(secAuthorUid, "aweme.secAuthorUid");
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "prop_page");
            c188727au.LJIIIZ("prop_id", str3);
            c188727au.LJIIIZ("prop_author_id", secAuthorUid);
            c188727au.LJIIIZ("enter_method", C243439gx.LIZ);
            c188727au.LIZLLL(1, "is_prop_author_video");
            FMX.LJIIL("apply_specific_featured_video", c188727au.LIZ);
            SmartRoute buildRoute = SmartRouter.buildRoute(mo49getActivity(), "//effect/featurevideo/awemelist");
            buildRoute.withParam("sticker_id", this.LLILZ);
            buildRoute.withParam("extra_related_item", aweme2);
            buildRoute.withParam("author_id", this.LLILZLL);
            if (str != null) {
                str2 = str;
            }
            buildRoute.withParam("video_id", str2);
            buildRoute.open(0, new MHT(this));
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        FeatureVideoViewModel featureVideoViewModel = (FeatureVideoViewModel) ViewModelProviders.of(this).get(FeatureVideoViewModel.class);
        o.LJIIIZ(featureVideoViewModel, "<set-?>");
        this.LLIZLLLIL = featureVideoViewModel;
        featureVideoViewModel.LJLJI.observe(getViewLifecycleOwner(), new AObserverS72S0100000_4(this, 48));
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final SmartRoute wl(MGX mgx, Aweme aweme) {
        SmartRoute wl = super.wl(mgx, aweme);
        o.LJIIIIZZ(wl, "super.createRoute(aweme, param)");
        wl.withParam("feed_data_sticker_model", new ArrayList(this.LLIIII));
        wl.withParam("extra_edit_effect_uid", this.LLIIIJ);
        return wl;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, X.MH9
    public final void yb(View view, final Aweme aweme, String str) {
        String str2 = this.LLILZ;
        if (str2 != null && aweme != null) {
            String secAuthorUid = aweme.getSecAuthorUid();
            if (secAuthorUid != null) {
                C243439gx.LIZ = "clickType";
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", "prop_page");
                c188727au.LJIIIZ("prop_id", str2);
                c188727au.LJIIIZ("prop_author_id", secAuthorUid);
                c188727au.LJIIIZ("enter_method", "clickType");
                c188727au.LIZLLL(1, "is_prop_author_video");
                FMX.LJIIL("edit_featured_video", c188727au.LIZ);
            }
            if (view != null) {
                if (aweme.getFeatureVideo() == Aweme.VideoType.FEATURE_VIDEO_CLIENT_SELECTED) {
                    C245319jz c245319jz = new C245319jz();
                    c245319jz.LIZ.LJLIL = new DialogInterface.OnCancelListener() { // from class: X.9uW
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            DesignerStickerDetailAwemeListFragment designerStickerDetailAwemeListFragment = this;
                            Aweme aweme2 = aweme;
                            String str3 = designerStickerDetailAwemeListFragment.LLILZ;
                            if (str3 != null) {
                                String secAuthorUid2 = aweme2.getSecAuthorUid();
                                o.LJIIIIZZ(secAuthorUid2, "aweme.secAuthorUid");
                                C188727au c188727au2 = new C188727au();
                                c188727au2.LJIIIZ("enter_from", "prop_page");
                                c188727au2.LJIIIZ("prop_id", str3);
                                c188727au2.LJIIIZ("prop_author_id", secAuthorUid2);
                                c188727au2.LJIIIZ("enter_method", C243439gx.LIZ);
                                c188727au2.LIZLLL(1, "is_prop_author_video");
                                FMX.LJIIL("cancel_editing_featured_video", c188727au2.LIZ);
                            }
                        }
                    };
                    C252669vq c252669vq = new C252669vq();
                    String string = getString(R.string.fs6);
                    o.LJIIIIZZ(string, "getString(R.string.effec…dd_featured_select_video)");
                    c252669vq.LIZ = string;
                    c252669vq.LJ = new ACListenerS44S0200000_9(aweme, this, 43);
                    C252669vq c252669vq2 = new C252669vq();
                    String string2 = getString(R.string.fs2);
                    o.LJIIIIZZ(string2, "getString(R.string.effec…dd_featured_remove_video)");
                    c252669vq2.LIZ = string2;
                    c252669vq2.LJ = new ACListenerS39S0200000_4(aweme, this, 111);
                    c245319jz.LIZIZ(c252669vq, c252669vq2);
                    TuxActionSheet LIZJ = c245319jz.LIZJ();
                    FragmentManager fragmentManager = getFragmentManager();
                    if (fragmentManager != null) {
                        LIZJ.show(fragmentManager, "edit_featured_video");
                        return;
                    }
                    return;
                }
                Rl(aweme);
            }
        }
    }
}
