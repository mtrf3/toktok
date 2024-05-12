package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ProgressBar;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE;
import kotlin.jvm.internal.o;

/* renamed from: X.Tz9, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76431Tz9 extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewOnClickListenerC76430Tz8 LJLIL;
    public final /* synthetic */ C76433TzB LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ C72242sW LJLJJI;
    public final /* synthetic */ View LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ ProgressBar LJLJL;
    public final /* synthetic */ ObjectAnimator LJLJLJ;

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0157, code lost:
    
        if (X.C29306Beo.LJJIFFI(r5) == false) goto L63;
     */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAnimationEnd(android.animation.Animator r7) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76431Tz9.onAnimationEnd(android.animation.Animator):void");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        String str;
        Boolean bool;
        boolean z;
        Boolean bool2;
        Boolean bool3;
        String str2;
        o.LJIIIZ(animation, "animation");
        Boolean bool4 = null;
        if (C29306Beo.LJIIJ(this.LJLIL.LJLILLLLZI)) {
            ItemInfo4FE itemInfo4FE = this.LJLILLLLZI.LIZIZ;
            if (itemInfo4FE != null) {
                bool2 = Boolean.valueOf(itemInfo4FE.isTeamMate);
            } else {
                bool2 = null;
            }
            if (!C29306Beo.LJJIFFI(bool2)) {
                ItemInfo4FE itemInfo4FE2 = this.LJLILLLLZI.LIZIZ;
                if (itemInfo4FE2 != null) {
                    bool3 = Boolean.valueOf(itemInfo4FE2.isSelfRoom);
                } else {
                    bool3 = null;
                }
                if (!C29306Beo.LJJIFFI(bool3)) {
                    int i = this.LJLJI;
                    ItemInfo4FE itemInfo4FE3 = this.LJLILLLLZI.LIZIZ;
                    if (itemInfo4FE3 != null) {
                        str2 = itemInfo4FE3.senderUid;
                    } else {
                        str2 = null;
                    }
                    C1JD.LJIILLIIL(i, str2, itemInfo4FE3, true, null, 16);
                }
            }
        }
        ItemInfo4FE itemInfo4FE4 = this.LJLILLLLZI.LIZIZ;
        if (itemInfo4FE4 != null) {
            str = itemInfo4FE4.senderUid;
        } else {
            str = null;
        }
        boolean LJIIJ = C29306Beo.LJIIJ(this.LJLIL.LJLILLLLZI);
        int i2 = this.LJLJI;
        ItemInfo4FE itemInfo4FE5 = this.LJLILLLLZI.LIZIZ;
        if (itemInfo4FE5 != null) {
            bool = Boolean.valueOf(itemInfo4FE5.isTeamMate);
        } else {
            bool = null;
        }
        if (!C29306Beo.LJJIFFI(bool)) {
            ItemInfo4FE itemInfo4FE6 = this.LJLILLLLZI.LIZIZ;
            if (itemInfo4FE6 != null) {
                bool4 = Boolean.valueOf(itemInfo4FE6.isSelfRoom);
            }
            if (!C29306Beo.LJJIFFI(bool4)) {
                z = true;
                C76272Twa.LJJIL(i2, str, LJIIJ, z);
                this.LJLJJI.element = System.currentTimeMillis();
            }
        }
        z = false;
        C76272Twa.LJJIL(i2, str, LJIIJ, z);
        this.LJLJJI.element = System.currentTimeMillis();
    }

    public C76431Tz9(ViewOnClickListenerC76430Tz8 viewOnClickListenerC76430Tz8, C76433TzB c76433TzB, int i, C72242sW c72242sW, View view, boolean z, ProgressBar progressBar, ObjectAnimator objectAnimator) {
        this.LJLIL = viewOnClickListenerC76430Tz8;
        this.LJLILLLLZI = c76433TzB;
        this.LJLJI = i;
        this.LJLJJI = c72242sW;
        this.LJLJJL = view;
        this.LJLJJLL = z;
        this.LJLJL = progressBar;
        this.LJLJLJ = objectAnimator;
    }
}
