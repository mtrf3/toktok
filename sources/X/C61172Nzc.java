package X;

import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import com.bytedance.android.live.slot.IFrameSlot;

/* renamed from: X.Nzc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61172Nzc implements IFrameSlot {
    public String LJLIL = "";
    public Bundle LJLILLLLZI;

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final InterfaceC31687Cc7 LIZ() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final /* synthetic */ void LJII(String str) {
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final /* synthetic */ void getLocation() {
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final String getScheme() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final Animation LIZJ() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.0f, 1, 1.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(300L);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final Animation LIZLLL() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.0f, 1, 1.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(300L);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0048, code lost:
    
        if (r0 != null) goto L9;
     */
    @Override // com.bytedance.android.live.slot.IFrameSlot
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LJFF(android.content.Context r11) {
        /*
            r10 = this;
            java.lang.String r0 = "context"
            r5 = r11
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r0 = 4643985272004935680(0x4072c00000000000, double:300.0)
            int r2 = X.C17N.LJIILL(r0)
            r0 = 4638144666238189568(0x405e000000000000, double:120.0)
            int r0 = X.C17N.LJIILL(r0)
            r3.<init>(r2, r0)
            r0 = 80
            r3.gravity = r0
            r0 = 4622945017495814144(0x4028000000000000, double:12.0)
            int r0 = X.C17N.LJIILL(r0)
            r3.leftMargin = r0
            r0 = 4620693217682128896(0x4020000000000000, double:8.0)
            int r0 = X.C17N.LJIILL(r0)
            r3.bottomMargin = r0
            X.FsQ r2 = X.C40343FsR.LJIILJJIL
            com.ss.android.ugc.aweme.spark.IAdSparkUtils r4 = com.ss.android.ugc.aweme.spark.AdSparkUtils.LJFF()
            if (r4 == 0) goto L5f
            android.os.Bundle r1 = r10.LJLILLLLZI
            if (r1 == 0) goto L5c
            java.lang.String r0 = r10.LJLIL
            java.lang.String r6 = X.C40180Fpo.LIZ(r1, r0)
        L40:
            r7 = 0
            r8 = 0
            r9 = 28
            com.ss.android.ugc.aweme.spark.AdSparkContext r0 = X.NGQ.LIZ(r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L5f
        L4a:
            r2.getClass()
            X.FsR r0 = X.C40342FsQ.LIZ(r5, r0)
            X.NtS r0 = X.C40343FsR.LIZ(r0)
            r0.setLayoutParams(r3)
            r0.LIZIZ()
            return r0
        L5c:
            java.lang.String r6 = r10.LJLIL
            goto L40
        L5f:
            com.bytedance.hybrid.spark.SparkContext r0 = new com.bytedance.hybrid.spark.SparkContext
            r0.<init>()
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61172Nzc.LJFF(android.content.Context):android.view.View");
    }
}
