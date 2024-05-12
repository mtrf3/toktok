package com.ss.android.ugc.aweme.qna.services;

import X.C17N;
import X.C213238Yl;
import X.C234869Jq;
import X.C56564MHw;
import X.C58096Mr6;
import X.C9Y2;
import X.DZB;
import X.MI1;
import X.MI2;
import X.MI5;
import X.MI7;
import X.MI8;
import X.T8U;
import X.ViewOnClickListenerC13880ga;
import X.XKX;
import Y.ACListenerS44S0200000_9;
import Y.AObserverS75S0200000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.qna.vm.QnaSuggestedTabViewModel;
import com.ss.android.ugc.aweme.question.model.QuestionVideosResponse;
import com.ss.android.ugc.aweme.services.IQnaService;
import defpackage.e1;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class QnaService implements IQnaService {
    @Override // com.ss.android.ugc.aweme.services.IQnaService
    public final String getQaPersonalProfileEventName() {
        return "qa_personal_profile";
    }

    @Override // com.ss.android.ugc.aweme.services.IQnaService
    public final String getQaPersonalProfileSearchEventName() {
        return "qa_personal_profile_search";
    }

    public static IQnaService LIZ() {
        Object LIZ = C58096Mr6.LIZ(IQnaService.class, false);
        if (LIZ != null) {
            return (IQnaService) LIZ;
        }
        return new QnaService();
    }

    @Override // com.ss.android.ugc.aweme.services.IQnaService
    public final void clearSearchHistoryKeva() {
        C9Y2.LIZ.clear();
    }

    @Override // com.ss.android.ugc.aweme.services.IQnaService
    public final boolean isQnaAugmentationFYPBannerEnabled() {
        boolean z;
        MI2.LIZ.getClass();
        if (MI2.LIZ().getQna_experiment_ver() == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    @Override // com.ss.android.ugc.aweme.services.IQnaService
    public final boolean enablePublicQna() {
        if (C234869Jq.LIZ() || !e1.LIZ(31744, "public_qna_enabled", true, false) || !C213238Yl.LIZ) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.IQnaService
    public final boolean isQnaAugmentationQuestionDetailBannerEnabled() {
        return DZB.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.IQnaService
    public final void injectQnaBanner(FrameLayout frameLayout, List<Long> questionIds) {
        o.LJIIIZ(frameLayout, "frameLayout");
        o.LJIIIZ(questionIds, "questionIds");
        Context ctx = frameLayout.getContext();
        o.LJIIIIZZ(ctx, "ctx");
        MI5 mi5 = new MI5(ctx);
        mi5.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS44S0200000_9(ctx, questionIds, 2)));
        if (frameLayout.getChildCount() == 0) {
            frameLayout.addView(mi5);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IQnaService
    public final void setQuestionAwemeListCacheCache(long j, int i, int i2, List<Aweme> awemes) {
        o.LJIIIZ(awemes, "awemes");
        MI1 mi1 = new MI1();
        mi1.LIZ = i2;
        mi1.LIZIZ = i;
        mi1.LIZJ = j;
        QuestionVideosResponse questionVideosResponse = new QuestionVideosResponse();
        questionVideosResponse.setCursor(Integer.valueOf(i));
        questionVideosResponse.setHasMore(1);
        questionVideosResponse.setVideos(awemes);
        C56564MHw.LIZ(mi1, questionVideosResponse);
    }

    @Override // com.ss.android.ugc.aweme.services.IQnaService
    public final void setupQnaBanner(ViewGroup viewGroup, Fragment fragment, String textToDisplay, View.OnClickListener clickListener) {
        T8U t8u;
        ViewGroup.LayoutParams layoutParams;
        o.LJIIIZ(viewGroup, "viewGroup");
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(textToDisplay, "textToDisplay");
        o.LJIIIZ(clickListener, "clickListener");
        int childCount = viewGroup.getChildCount();
        int i = 0;
        while (true) {
            if (i < childCount) {
                if (viewGroup.getChildAt(i) instanceof T8U) {
                    t8u = null;
                    break;
                }
                i++;
            } else {
                Context context = viewGroup.getContext();
                o.LJIIIIZZ(context, "viewGroup.context");
                t8u = new T8U(context, null, 0);
                t8u.setEnterFrom(textToDisplay);
                if (viewGroup instanceof LinearLayout) {
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams2.bottomMargin = C17N.LJIILL(10.0d);
                    layoutParams = layoutParams2;
                } else {
                    layoutParams = new ViewGroup.LayoutParams(-1, -2);
                }
                viewGroup.addView(t8u, 0, layoutParams);
                t8u.setOnClickListener(new ViewOnClickListenerC13880ga(clickListener));
            }
        }
        QnaSuggestedTabViewModel qnaSuggestedTabViewModel = (QnaSuggestedTabViewModel) new ViewModelProvider(fragment, new MI7()).get(QnaSuggestedTabViewModel.class);
        qnaSuggestedTabViewModel.LJLLILLLL.observe(fragment, new AObserverS75S0200000_12(qnaSuggestedTabViewModel, t8u, 49));
        XKX.LIZLLL(ViewModelKt.getViewModelScope(qnaSuggestedTabViewModel), null, null, new MI8(qnaSuggestedTabViewModel, null), 3);
    }
}
