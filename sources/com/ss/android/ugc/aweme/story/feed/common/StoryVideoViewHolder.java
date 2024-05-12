package com.ss.android.ugc.aweme.story.feed.common;

import X.ActivityC45651qj;
import X.AnonymousClass901;
import X.C210108Mk;
import X.C221108m2;
import X.C222188nm;
import X.C222228nq;
import X.C222298nx;
import X.C222308ny;
import X.C222318nz;
import X.C222588oQ;
import X.C2TO;
import X.C50420Jqa;
import X.C57432Nf;
import X.C62822Ol8;
import X.C92W;
import X.C9XU;
import X.EnumC222138nh;
import X.G27;
import X.IT4;
import X.InterfaceC72642tA;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.aweme.story.feed.common.StoryVideoViewHolder;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class StoryVideoViewHolder extends VideoViewCell {
    public static final C62822Ol8 LLZZZZ = C221108m2.LIZIZ(C222318nz.LJLIL);
    public boolean LLZZ;
    public final C62822Ol8 LLZZJLIL;
    public final C222298nx LLZZLLIL;
    public final C62822Ol8 LLZZZIL;

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final int LJLJJLL() {
        return 4;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void LJLLLLLL() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final String gR() {
        return "cell_story_video";
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void LLL() {
        this.LLJJJJ.onInternalEvent(new C50420Jqa(60, new C57432Nf(EnumC222138nh.NOTIFY_OUTER_VIEW_HOLDER, new C222228nq("on_start_play_animation"))));
    }

    public final ValueAnimator LLLLIL() {
        return (ValueAnimator) this.LLZZJLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C2MA
    public final void onDestroyView() {
        super.onDestroyView();
        C9XU.LIZLLL(this.LLZZLLIL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.8nx] */
    public StoryVideoViewHolder(C222588oQ params) {
        super(params);
        o.LJIIIZ(params, "params");
        this.LLZZJLIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 869));
        this.LLZZLLIL = new G27() { // from class: X.8nx
            @Override // X.G27
            public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
                o.LJIIIZ(newConfig, "newConfig");
                StoryVideoViewHolder storyVideoViewHolder = StoryVideoViewHolder.this;
                storyVideoViewHolder.LLLLIIL(storyVideoViewHolder.LJLLL);
            }
        };
        this.LLZZZIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 868));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C2MA
    public final void LJJIII(int i) {
        super.LJJIII(i);
        C222188nm.LIZ(this.LJLLL, new AqS169S0100000_3(this, 423));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C2MA
    public final void LJJIJIIJIL(int i) {
        super.LJJIJIIJIL(i);
        C222188nm.LIZ(this.LJLLL, new AqS169S0100000_3(this, 424));
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0096, code lost:
    
        if (r11 == false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLIIL(com.ss.android.ugc.aweme.feed.model.Aweme r13) {
        /*
            r12 = this;
            android.content.Context r0 = r12.LLJJJIL
            if (r0 != 0) goto L5
            return
        L5:
            r11 = 1
            r6 = 0
            if (r13 == 0) goto L22
            int r1 = r13.getStoryType()
            r0 = 3
            if (r1 != r0) goto L22
            r10 = 1
        L11:
            android.view.View r1 = r12.LLLLIL
            r8 = 0
            if (r1 == 0) goto L21
            r0 = 2131367182(0x7f0a150e, float:1.8354279E38)
            android.view.View r5 = r1.findViewById(r0)
            X.TDr r5 = (X.C74291TDr) r5
            if (r5 != 0) goto L24
        L21:
            return
        L22:
            r10 = 0
            goto L11
        L24:
            android.view.ViewParent r4 = r5.getParent()
            boolean r0 = r4 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r0 == 0) goto L30
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            if (r4 != 0) goto L31
        L30:
            return
        L31:
            android.content.Context r0 = r12.LLJJJIL
            java.lang.String r9 = "context"
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r9)
            int r0 = X.C63081OpJ.LJJJJL(r0)
            float r1 = (float) r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 * r0
            android.content.Context r0 = r12.LLJJJIL
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r9)
            int r0 = X.C63081OpJ.LJJJJJL(r0)
            float r0 = (float) r0
            float r1 = r1 / r0
            r7 = 1061158912(0x3f400000, float:0.75)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 > 0) goto Lbf
        L51:
            r1 = 0
            if (r10 == 0) goto Lbd
            r0 = 28
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r2 = X.C32151Nz.LJIIZILJ(r0)
            if (r11 == 0) goto Lbb
        L60:
            r3 = -1
            if (r10 != 0) goto L96
        L63:
            r6 = -1
            if (r10 != 0) goto L99
        L66:
            r5.setRadius(r2)
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            if (r2 == 0) goto Lc1
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r2.width = r3
            r2.height = r6
            int r0 = (int) r1
            r2.topMargin = r0
            r5.setLayoutParams(r2)
            X.064 r1 = new X.064
            r1.<init>()
            r1.LJII(r4)
            int r0 = r5.getId()
            r1.LJIJI(r0, r8)
            r1.LIZIZ(r4)
            r4.invalidate()
            com.bytedance.lighten.loader.SmartImageView r0 = r12.LLFII
            r0.invalidate()
            return
        L96:
            if (r11 == 0) goto L63
            goto L9b
        L99:
            if (r11 == 0) goto Lb8
        L9b:
            android.content.Context r0 = r12.LLJJJIL
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r9)
            int r0 = X.C63081OpJ.LJJJJJL(r0)
            float r1 = (float) r0
            android.content.Context r0 = r12.LLJJJIL
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r9)
            int r0 = X.C63081OpJ.LJJJJL(r0)
            float r0 = (float) r0
            float r0 = r0 / r7
            float r1 = r1 - r0
            r0 = 1053609165(0x3ecccccd, float:0.4)
            float r1 = r1 * r0
            java.lang.String r8 = "H, 3:4"
            goto L66
        Lb8:
            java.lang.String r8 = "W, 3:4"
            goto L66
        Lbb:
            r3 = 0
            goto L63
        Lbd:
            r2 = 0
            goto L60
        Lbf:
            r11 = 0
            goto L51
        Lc1:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.common.StoryVideoViewHolder.LLLLIIL(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void k7(View view) {
        super.k7(view);
        ActivityC45651qj activity = getActivity();
        if (activity != null) {
            C9XU.LIZIZ(activity, this.LLZZLLIL);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void l8(int i) {
        super.l8(i);
        C222188nm.LIZ(this.LJLLL, new AqS169S0100000_3(this, 425));
        ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        super.onPlayCompleted(str);
        this.LLJJJJ.onInternalEvent(new C50420Jqa(60, new C57432Nf(EnumC222138nh.ON_PLAY_COMPLETED, new C2TO(str))));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        super.onPlayCompletedFirstTime(str);
        this.LJLLILLLL.LIZIZ.onInternalEvent(new C50420Jqa(60, new C57432Nf(EnumC222138nh.ON_PLAY_COMPLETED_FIRST_TIME, null)));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(IT4 it4) {
        super.onRenderFirstFrame(it4);
        this.LJLLILLLL.LIZIZ.onInternalEvent(new C50420Jqa(60, new C57432Nf(EnumC222138nh.ON_RENDER_FIRST_FRAME, null)));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C2MA
    public final void t7(boolean z) {
        super.t7(z);
        C222188nm.LIZ(this.LJLLL, new AqS169S0100000_3(this, 426));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.InterfaceC55219Lln
    public void ug(Video video) {
        Aweme aweme = this.LJLLL;
        if (aweme != null && !aweme.isSharedStoryVisible()) {
            return;
        }
        super.ug(video);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void LLILLL(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setVisibility(4);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void LLLZ(int i, Aweme aweme) {
        View view;
        LLLLIIL(aweme);
        C222188nm.LIZ(aweme, C222308ny.LJLIL);
        FrameLayout frameLayout = this.LLILZ;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        super.LLLZ(i, aweme);
        View view2 = this.LLIIII;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        if (aweme == null || 2 != aweme.getStoryType() || (view = this.LLIFFJFJJ) == null) {
            return;
        }
        view.setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final AnonymousClass901 LLFII(View view, InterfaceC72642tA<C50420Jqa> interfaceC72642tA, Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        return new C92W();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        super.onPlayProgressChange(str, j, j2);
        this.LLJJJJ.onInternalEvent(new C50420Jqa(60, new C57432Nf(EnumC222138nh.ON_PLAY_PROGRESS_CHANGED, new C210108Mk(str, j, j2))));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void x7(float f, float f2, int i) {
        super.x7(f, f2, i);
        C222188nm.LIZ(this.LJLLL, new AqS169S0100000_3(this, 422));
    }
}
