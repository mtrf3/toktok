package com.bytedance.android.live.commentcombo.view;

import X.AnonymousClass148;
import X.C16880lQ;
import X.C259610e;
import X.C37861eA;
import X.C47121t6;
import X.C86881Y7x;
import X.C8HI;
import X.CCJ;
import X.X1D;
import Y.IDCListenerS135S0100000;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.CommentComboTrayVisibilityChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class CommentComboTrayWidget extends AnimatableRecyclableWidget implements AnonymousClass148 {
    public ViewGroup LJLIL;
    public C47121t6 LJLILLLLZI;
    public ViewGroup LJLJI;
    public C47121t6 LJLJJI;
    public C47121t6 LJLJJL;
    public long LJLJJLL;
    public C259610e LJLJL;
    public Animator LJLJLJ;

    @Override // X.AnonymousClass148
    public void LJJIIJ() {
        this.LJLJL = null;
        LJLZ();
        animateHide();
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.dnt;
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onUnload() {
        C37861eA.LJLILLLLZI = null;
        LJLZ();
        hide();
    }

    public void LJLZ() {
        Animator animator = this.LJLJLJ;
        if (animator != null && animator.isRunning()) {
            animator.cancel();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        DataChannel dataChannel;
        super.hide();
        if (!(this instanceof ExtendedCommentComboTrayWidget) && (dataChannel = this.dataChannel) != null) {
            dataChannel.rv0(CommentComboTrayVisibilityChannel.class, Boolean.FALSE);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        DataChannel dataChannel;
        super.show();
        if (!(this instanceof ExtendedCommentComboTrayWidget) && (dataChannel = this.dataChannel) != null) {
            dataChannel.rv0(CommentComboTrayVisibilityChannel.class, Boolean.TRUE);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public final void onHideAnimationEnd() {
        hide();
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public final void onShowAnimationStart() {
        show();
    }

    public static String LJZ(String str) {
        if (str != null) {
            if (str.length() == 0 || str.length() <= 40) {
                return str;
            }
            StringBuilder LIZ = X1D.LIZ();
            String substring = str.substring(0, 40);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            LIZ.append(substring);
            LIZ.append("...");
            return X1D.LIZIZ(LIZ);
        }
        return "";
    }

    @Override // X.AnonymousClass148
    public final void LJJJI(long j) {
        StringBuilder LIZ;
        C47121t6 c47121t6 = this.LJLJJL;
        if (c47121t6 != null) {
            if (CCJ.LIZ(this.context)) {
                LIZ = X1D.LIZ();
                LIZ.append(' ');
                LIZ.append(j);
            } else {
                LIZ = X1D.LIZ();
                LIZ.append(j);
                LIZ.append(' ');
            }
            c47121t6.setText(X1D.LIZIZ(LIZ));
        }
        LJLZ();
        Animator animator = this.LJLJLJ;
        if (animator != null) {
            animator.start();
        }
    }

    @Override // X.AnonymousClass148
    public void LJJJJZ(C259610e c259610e) {
        this.LJLJL = c259610e;
        LJLZ();
        LJZI(c259610e.LIZ, c259610e.LIZJ, c259610e.LIZLLL, c259610e.LIZIZ);
        animateShow();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LJLIL = (ViewGroup) findViewById(R.id.lke);
        this.LJLILLLLZI = (C47121t6) findViewById(R.id.bjd);
        this.LJLJI = (ViewGroup) findViewById(R.id.bj7);
        this.LJLJJI = (C47121t6) findViewById(R.id.gpr);
        this.LJLJJL = (C47121t6) findViewById(R.id.bvq);
        C47121t6 c47121t6 = this.LJLJJI;
        if (c47121t6 != null) {
            c47121t6.setTypeface(C8HI.LIZJ().LIZLLL("bold"), 2);
        }
        C47121t6 c47121t62 = this.LJLJJL;
        if (c47121t62 != null) {
            c47121t62.setTypeface(C8HI.LIZJ().LIZLLL("bold"), 2);
        }
        View view = getView();
        if (view != null) {
            view.requestLayout();
        }
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.LJLJI, (Property<ViewGroup, Float>) View.SCALE_X, 1.5f, 1.0f).setDuration(200L), ObjectAnimator.ofFloat(this.LJLJI, (Property<ViewGroup, Float>) View.SCALE_Y, 1.5f, 1.0f).setDuration(200L), ObjectAnimator.ofFloat(this.LJLJI, (Property<ViewGroup, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(200L));
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(ObjectAnimator.ofFloat(this.LJLJI, (Property<ViewGroup, Float>) View.SCALE_X, 1.0f, 1.2f).setDuration(100L), ObjectAnimator.ofFloat(this.LJLJI, (Property<ViewGroup, Float>) View.SCALE_Y, 1.0f, 1.2f).setDuration(100L));
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playTogether(ObjectAnimator.ofFloat(this.LJLJI, (Property<ViewGroup, Float>) View.SCALE_X, 1.2f, 1.0f).setDuration(100L), ObjectAnimator.ofFloat(this.LJLJI, (Property<ViewGroup, Float>) View.SCALE_Y, 1.2f, 1.0f).setDuration(100L));
        animatorSet.playSequentially(animatorSet2, animatorSet3, animatorSet4);
        this.LJLJLJ = animatorSet;
        ViewGroup viewGroup = this.LJLIL;
        if (viewGroup != null) {
            C16880lQ.LJIIL(viewGroup, new IDCListenerS135S0100000(this, 46));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onLoad(Object[] objArr) {
        C37861eA.LJLILLLLZI = this;
        C37861eA.LJ();
    }

    public final void LJZI(long j, long j2, long j3, String content) {
        String str;
        StringBuilder sb;
        o.LJIIIZ(content, "content");
        this.LJLJJLL = j;
        C47121t6 c47121t6 = this.LJLILLLLZI;
        if (c47121t6 != null) {
            if (j2 == 2) {
                str = LJZ(C86881Y7x.LIZIZ().LIZ(content));
            } else if (j2 == 1) {
                str = LJZ(content);
            } else {
                str = "";
            }
            c47121t6.setText(str);
        }
        C47121t6 c47121t62 = this.LJLJJL;
        if (c47121t62 == null) {
            return;
        }
        if (CCJ.LIZ(this.context)) {
            sb = new StringBuilder(" ");
            sb.append(j3);
        } else {
            sb = new StringBuilder();
            sb.append(j3);
            sb.append(' ');
        }
        c47121t62.setText(sb.toString());
    }
}
