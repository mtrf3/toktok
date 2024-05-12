package X;

import Y.IDAListenerS43S0200000_13;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Tzq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76474Tzq extends FrameLayout {
    public AnimatorSet LJLIL;
    public final java.util.Map<Integer, View> LJLILLLLZI;

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void LIZIZ() {
        AnimatorSet animatorSet = this.LJLIL;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.LJLIL;
            if (animatorSet2 != null) {
                C16880lQ.LJLJJL(animatorSet2);
            }
            AnimatorSet animatorSet3 = this.LJLIL;
            if (animatorSet3 != null) {
                animatorSet3.end();
            }
            this.LJLIL = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LIZIZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76474Tzq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLILLLLZI = C62850Ola.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.dc6, this, true);
    }

    public static final void LIZJ(C76474Tzq c76474Tzq, C31597Caf c31597Caf) {
        ViewGroup.LayoutParams layoutParams = c31597Caf.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (c31597Caf.getId() == c76474Tzq.LIZ(R.id.f5x).getId()) {
            marginLayoutParams.rightMargin = C15380j0.LIZ(28.0f);
        } else {
            marginLayoutParams.leftMargin = C15380j0.LIZ(28.0f);
        }
        c31597Caf.setLayoutParams(marginLayoutParams);
    }

    public static final void LJ(C76474Tzq c76474Tzq, C47121t6 c47121t6) {
        ViewGroup.LayoutParams layoutParams = c47121t6.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (c47121t6.getId() == c76474Tzq.LIZ(R.id.m_r).getId()) {
            marginLayoutParams.rightMargin = C15380j0.LIZ(12.0f);
        } else {
            marginLayoutParams.leftMargin = C15380j0.LIZ(12.0f);
        }
        c47121t6.setLayoutParams(marginLayoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
    
        ((android.widget.TextView) LIZ(com.zhiliaoapp.musically.R.id.m_r)).setText(X.C05170If.LIZIZ(r1, r0));
        r1 = (android.widget.ImageView) LIZ(com.zhiliaoapp.musically.R.id.f5x);
        r0 = r6.user;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (r0 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        r0 = r0.avatarThumb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        X.C31665Cbl.LJIIIZ(r1, r0, com.zhiliaoapp.musically.R.drawable.cuk);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0070, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0011, code lost:
    
        if (r0 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0045, code lost:
    
        if (r0 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r0 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        r0 = "";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo r6, com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo r7) {
        /*
            r5 = this;
            r3 = 2131235184(0x7f081170, float:1.8086555E38)
            r2 = 0
            java.lang.String r4 = ""
            if (r6 == 0) goto L3a
            com.bytedance.android.livesdkapi.depend.model.live.match.BattleBaseUserInfo r0 = r6.user
            if (r0 == 0) goto L10
            java.lang.String r1 = r0.displayId
            if (r1 != 0) goto L13
        L10:
            r1 = r4
            if (r0 == 0) goto L17
        L13:
            java.lang.String r0 = r0.nickName
            if (r0 != 0) goto L18
        L17:
            r0 = r4
        L18:
            java.lang.String r1 = X.C05170If.LIZIZ(r1, r0)
            r0 = 2131379248(0x7f0a4430, float:1.8378751E38)
            android.view.View r0 = r5.LIZ(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r1)
            r0 = 2131369473(0x7f0a1e01, float:1.8358925E38)
            android.view.View r1 = r5.LIZ(r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            com.bytedance.android.livesdkapi.depend.model.live.match.BattleBaseUserInfo r0 = r6.user
            if (r0 == 0) goto L70
            com.bytedance.android.live.base.model.ImageModel r0 = r0.avatarThumb
        L37:
            X.C31665Cbl.LJIIIZ(r1, r0, r3)
        L3a:
            if (r7 == 0) goto L6d
            com.bytedance.android.livesdkapi.depend.model.live.match.BattleBaseUserInfo r0 = r7.user
            if (r0 == 0) goto L44
            java.lang.String r1 = r0.displayId
            if (r1 != 0) goto L47
        L44:
            r1 = r4
            if (r0 == 0) goto L4b
        L47:
            java.lang.String r0 = r0.nickName
            if (r0 != 0) goto L6e
        L4b:
            java.lang.String r1 = X.C05170If.LIZIZ(r1, r4)
            r0 = 2131379560(0x7f0a4568, float:1.8379384E38)
            android.view.View r0 = r5.LIZ(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r1)
            r0 = 2131369625(0x7f0a1e99, float:1.8359234E38)
            android.view.View r1 = r5.LIZ(r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            com.bytedance.android.livesdkapi.depend.model.live.match.BattleBaseUserInfo r0 = r7.user
            if (r0 == 0) goto L6a
            com.bytedance.android.live.base.model.ImageModel r2 = r0.avatarThumb
        L6a:
            X.C31665Cbl.LJIIIZ(r1, r2, r3)
        L6d:
            return
        L6e:
            r4 = r0
            goto L4b
        L70:
            r0 = r2
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76474Tzq.LJFF(com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo, com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo):void");
    }

    public final void LJI(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        LIZIZ();
        ConstraintLayout layout_left_anchor_user_info = (ConstraintLayout) LIZ(R.id.fj4);
        o.LJIIIIZZ(layout_left_anchor_user_info, "layout_left_anchor_user_info");
        C47061t0 layout_left_anchor_user_info_bg = (C47061t0) LIZ(R.id.fj5);
        o.LJIIIIZZ(layout_left_anchor_user_info_bg, "layout_left_anchor_user_info_bg");
        LIZLLL(this, layout_left_anchor_user_info, layout_left_anchor_user_info_bg);
        ConstraintLayout layout_right_anchor_user_info = (ConstraintLayout) LIZ(R.id.fl4);
        o.LJIIIIZZ(layout_right_anchor_user_info, "layout_right_anchor_user_info");
        C47061t0 layout_right_anchor_user_info_bg = (C47061t0) LIZ(R.id.fl5);
        o.LJIIIIZZ(layout_right_anchor_user_info_bg, "layout_right_anchor_user_info_bg");
        LIZLLL(this, layout_right_anchor_user_info, layout_right_anchor_user_info_bg);
        C47121t6 tv_left_anchor_nike_name = (C47121t6) LIZ(R.id.m_r);
        o.LJIIIIZZ(tv_left_anchor_nike_name, "tv_left_anchor_nike_name");
        LJ(this, tv_left_anchor_nike_name);
        C47121t6 tv_right_anchor_nike_name = (C47121t6) LIZ(R.id.mi7);
        o.LJIIIIZZ(tv_right_anchor_nike_name, "tv_right_anchor_nike_name");
        LJ(this, tv_right_anchor_nike_name);
        C31597Caf iv_left_anchor_avatar = (C31597Caf) LIZ(R.id.f5x);
        o.LJIIIIZZ(iv_left_anchor_avatar, "iv_left_anchor_avatar");
        LIZJ(this, iv_left_anchor_avatar);
        C31597Caf iv_right_anchor_avatar = (C31597Caf) LIZ(R.id.f_1);
        o.LJIIIIZZ(iv_right_anchor_avatar, "iv_right_anchor_avatar");
        LIZJ(this, iv_right_anchor_avatar);
        AnimatorSet animatorSet = new AnimatorSet();
        this.LJLIL = animatorSet;
        LIZ(R.id.fj4).setAlpha(1.0f);
        LIZ(R.id.fl4).setAlpha(1.0f);
        AnimatorSet animatorSet2 = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(LIZ(R.id.fj4), (Property<View, Float>) View.TRANSLATION_X, -200.0f, 0.0f);
        o.LJIIIIZZ(ofFloat, "ofFloat(layout_left_anch…TRANSLATION_X, -200f, 0f)");
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(LIZ(R.id.fl4), (Property<View, Float>) View.TRANSLATION_X, 200.0f, 0.0f);
        o.LJIIIIZZ(ofFloat2, "ofFloat(layout_right_anc….TRANSLATION_X, 200f, 0f)");
        animatorSet2.playTogether(ofFloat, ofFloat2);
        animatorSet2.setDuration(640L);
        animatorSet2.setInterpolator(new PathInterpolator(0.32f, 0.94f, 0.0f, 1.0f));
        animatorSet2.start();
        AnimatorSet animatorSet3 = new AnimatorSet();
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(LIZ(R.id.fj4), (Property<View, Float>) View.ALPHA, 1.0f, 1.0f);
        o.LJIIIIZZ(ofFloat3, "ofFloat(layout_left_anch…info, View.ALPHA, 1f, 1f)");
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(LIZ(R.id.fl4), (Property<View, Float>) View.ALPHA, 1.0f, 1.0f);
        o.LJIIIIZZ(ofFloat4, "ofFloat(layout_right_anc…info, View.ALPHA, 1f, 1f)");
        animatorSet3.playTogether(ofFloat3, ofFloat4);
        animatorSet3.setDuration(1480L);
        AnimatorSet animatorSet4 = new AnimatorSet();
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(LIZ(R.id.fj4), (Property<View, Float>) View.TRANSLATION_X, 0.0f, -200.0f);
        o.LJIIIIZZ(ofFloat5, "ofFloat(layout_left_anch…TRANSLATION_X, 0f, -200f)");
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(LIZ(R.id.fj4), (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        o.LJIIIIZZ(ofFloat6, "ofFloat(layout_left_anch…info, View.ALPHA, 1f, 0f)");
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(LIZ(R.id.fl4), (Property<View, Float>) View.TRANSLATION_X, 0.0f, 200.0f);
        o.LJIIIIZZ(ofFloat7, "ofFloat(layout_right_anc….TRANSLATION_X, 0f, 200f)");
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(LIZ(R.id.fl4), (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        o.LJIIIIZZ(ofFloat8, "ofFloat(layout_right_anc…info, View.ALPHA, 1f, 0f)");
        animatorSet4.playTogether(ofFloat5, ofFloat6, ofFloat7, ofFloat8);
        animatorSet4.setDuration(320L);
        animatorSet.playSequentially(animatorSet2, animatorSet3, animatorSet4);
        AnimatorSet animatorSet5 = this.LJLIL;
        o.LJI(animatorSet5);
        animatorSet5.addListener(new IDAListenerS43S0200000_13(interfaceC65784Pro2, interfaceC65784Pro, 2));
        AnimatorSet animatorSet6 = this.LJLIL;
        o.LJI(animatorSet6);
        animatorSet6.start();
    }

    public static final void LIZLLL(C76474Tzq c76474Tzq, ConstraintLayout constraintLayout, C47061t0 c47061t0) {
        String LJIIIZ;
        if (constraintLayout.getId() == c76474Tzq.LIZ(R.id.fj4).getId()) {
            LJIIIZ = C15510jD.LJIIIZ(CFX.LIZ("tiktok_live_watch_resource", "tiktok_live_interaction_normal_1"), "ttlive_bg_gradient_pink_3.png");
        } else {
            LJIIIZ = C15510jD.LJIIIZ(CFX.LIZ("tiktok_live_watch_resource", "tiktok_live_interaction_normal_1"), "ttlive_bg_gradient_blue_3.png");
        }
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        layoutParams.width = C15380j0.LIZ(152.0f);
        constraintLayout.setLayoutParams(layoutParams);
        C15490jB.LIZJ(c47061t0, LJIIIZ);
    }
}
