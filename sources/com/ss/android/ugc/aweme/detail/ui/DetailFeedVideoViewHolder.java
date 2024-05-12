package com.ss.android.ugc.aweme.detail.ui;

import X.C16880lQ;
import X.C203727z6;
import X.C2067589n;
import X.C2067689o;
import X.C222588oQ;
import X.C26338AVi;
import X.C61447O9r;
import X.C63081OpJ;
import X.InterfaceC203737z7;
import Y.ACListenerS38S0200000_3;
import Y.AUListenerS90S0100000_1;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.detail.ui.DetailFeedVideoViewHolder;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class DetailFeedVideoViewHolder extends VideoViewCell {
    public final BaseFeedPageParams LLZZ;
    public final C2067589n LLZZJLIL;
    public final ImageView LLZZLLIL;

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final String gR() {
        return "cell_detail";
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void LJIIJJI() {
        C2067589n c2067589n = this.LLZZJLIL;
        RelativeLayout mWidgetContainer = this.LLF;
        o.LJIIIIZZ(mWidgetContainer, "mWidgetContainer");
        c2067589n.getClass();
        if (mWidgetContainer.getChildCount() == 0 || !c2067589n.LIZIZ) {
            return;
        }
        C2067589n.LIZ(mWidgetContainer);
    }

    public final boolean LLLLIL() {
        if (TextUtils.equals(this.LLZZ.param.getFrom(), "from_duet_mode") || this.LLZZ.param.isFromEffectDiscover()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final C2067689o X8() {
        return new C2067689o();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C2MA
    public final void onDestroyView() {
        super.onDestroyView();
        ValueAnimator valueAnimator = this.LLZZJLIL.LIZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailFeedVideoViewHolder(C222588oQ params) {
        super(params);
        o.LJIIIZ(params, "params");
        this.LLZZ = params.LJ;
        View findViewById = params.LIZ.findViewById(R.id.d56);
        o.LJIIIIZZ(findViewById, "params.view.findViewById(R.id.favorite)");
        View findViewById2 = params.LIZ.findViewById(R.id.d58);
        o.LJIIIIZZ(findViewById2, "params.view.findViewById(R.id.favorite_button)");
        this.LLZZLLIL = (ImageView) findViewById2;
        this.LLZZJLIL = new C2067589n();
        if (params.LJ.param.isFromDuetModeOrDuetModeDetail()) {
            if (C61447O9r.LJIILIIL == 0) {
                Context context = findViewById.getContext();
                o.LJIIIIZZ(context, "mFavoriteParent.context");
                C26338AVi.LJI(findViewById, 0, Integer.valueOf(C63081OpJ.LJJJJLI(context)), 0, 0, false, 16);
                return;
            }
            return;
        }
        findViewById.setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void LIZLLL(Aweme aweme) {
        int i;
        super.LIZLLL(aweme);
        if (this.LJLLILLLL.LJ.param.isFromDuetModeOrDuetModeDetail()) {
            LLLLII(8);
            C16880lQ.LJIILLIIL(this.LLZZLLIL, new ACListenerS38S0200000_3(this, aweme, 27));
            Aweme aweme2 = this.LJLLL;
            o.LJIIIIZZ(aweme2, "getAweme()");
            ImageView imageView = this.LLZZLLIL;
            if (aweme2.isCollected()) {
                i = R.drawable.an7;
            } else {
                i = R.drawable.an8;
            }
            imageView.setImageResource(i);
            this.LLIIII.setBackgroundResource(R.drawable.an5);
        }
    }

    public final void LLLLIIL(final Aweme aweme) {
        C203727z6 c203727z6 = new C203727z6();
        c203727z6.LJLJJLL = this.LLLLZLLIL.param.getFrom();
        c203727z6.LJLILLLLZI = new InterfaceC203737z7(this) { // from class: X.88L
            public final /* synthetic */ DetailFeedVideoViewHolder LJLILLLLZI;

            @Override // X.InterfaceC203737z7
            public final void aB(Exception e) {
                o.LJIIIZ(e, "e");
            }

            @Override // X.InterfaceC203737z7
            public final void ix() {
                int i;
                int i2 = !aweme.isCollected() ? 1 : 0;
                AwemeService.LIZ().g6(i2, aweme.getAid());
                aweme.setCollectStatus(i2);
                DetailFeedVideoViewHolder detailFeedVideoViewHolder = this.LJLILLLLZI;
                Aweme aweme2 = aweme;
                ImageView imageView = detailFeedVideoViewHolder.LLZZLLIL;
                if (aweme2.isCollected()) {
                    i = R.drawable.an7;
                } else {
                    i = R.drawable.an8;
                }
                imageView.setImageResource(i);
            }

            @Override // X.InterfaceC203737z7
            public final void gd(String msg) {
                ActivityC45651qj mo49getActivity;
                o.LJIIIZ(msg, "msg");
                Fragment fragment = this.LJLILLLLZI.LJLLLLLL;
                if (fragment != null && (mo49getActivity = fragment.mo49getActivity()) != null) {
                    C26045AKb c26045AKb = new C26045AKb(mo49getActivity);
                    c26045AKb.LJIIIZ(msg);
                    c26045AKb.LJIIJ();
                }
            }

            {
                this.LJLILLLLZI = this;
            }
        };
        c203727z6.LJIILL(2, aweme.getAid(), Integer.valueOf(!aweme.isCollected() ? 1 : 0));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C2MA
    public final void Z1(boolean z) {
        if (!LLLLIL()) {
            super.Z1(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C2MA
    public final void b2(boolean z) {
        if (LLLLIL()) {
            super.b2(true);
        } else {
            super.b2(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void w8(boolean z) {
        C2067589n c2067589n = this.LLZZJLIL;
        RelativeLayout mWidgetContainer = this.LLF;
        o.LJIIIIZZ(mWidgetContainer, "mWidgetContainer");
        c2067589n.getClass();
        c2067589n.LIZIZ = z;
        ValueAnimator valueAnimator = c2067589n.LIZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z) {
            mWidgetContainer.setAlpha(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(mWidgetContainer.getAlpha(), 1.0f);
            c2067589n.LIZ = ofFloat;
            if (ofFloat != null) {
                ofFloat.setDuration(400L);
            }
        } else {
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(mWidgetContainer.getAlpha(), 0.0f);
            c2067589n.LIZ = ofFloat2;
            if (ofFloat2 != null) {
                ofFloat2.setDuration(200L);
            }
        }
        ValueAnimator valueAnimator2 = c2067589n.LIZ;
        if (valueAnimator2 != null) {
            valueAnimator2.setInterpolator(new AccelerateInterpolator());
        }
        ValueAnimator valueAnimator3 = c2067589n.LIZ;
        if (valueAnimator3 != null) {
            valueAnimator3.addUpdateListener(new AUListenerS90S0100000_1(mWidgetContainer, 32));
        }
        ValueAnimator valueAnimator4 = c2067589n.LIZ;
        if (valueAnimator4 != null) {
            valueAnimator4.start();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void LLILLL(View view, boolean z) {
        if (LLLLIL()) {
            super.LLILLL(view, true);
        } else {
            super.LLILLL(view, z);
        }
    }
}
