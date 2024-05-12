package X;

import android.widget.Scroller;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcMixBitrateSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;

/* renamed from: X.81C, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C81C extends Scroller {
    public static final int LJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(75));
    public final C216848fA LIZ;
    public boolean LIZIZ;
    public C81E LIZJ;
    public final int LIZLLL;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C81C(android.content.Context r3) {
        /*
            r2 = this;
            X.8fA r1 = new X.8fA
            r1.<init>()
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            r2.<init>(r3, r1)
            r2.LIZ = r1
            X.81E r0 = X.C81E.IDLE
            r2.LIZJ = r0
            r0 = 800(0x320, float:1.121E-42)
            r2.LIZLLL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81C.<init>(android.content.Context):void");
    }

    @Override // android.widget.Scroller
    public final void startScroll(int i, int i2, int i3, int i4, int i5) {
        int i6;
        C81E c81e = this.LIZJ;
        if (c81e == C81E.ANIMATING_IN) {
            i6 = LinkMicRtcMixBitrateSetting.DEFAULT;
        } else if (c81e == C81E.ANIMATING_OUT) {
            i6 = LiveChatShowDelayForHotLiveSetting.DEFAULT;
        } else if (this.LIZIZ) {
            i6 = this.LIZLLL;
        } else {
            i6 = 600;
        }
        super.startScroll(i, i2, i3, i4, i6);
    }
}
