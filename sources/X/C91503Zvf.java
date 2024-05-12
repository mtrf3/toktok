package X;

import android.view.MotionEvent;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Zvf, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91503Zvf extends C91362ZtO {
    public InterfaceC91242ZrS LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;

    @Override // X.C91362ZtO, X.InterfaceC92113jT
    public final boolean LIZJ() {
        this.LLIZ = false;
        return super.LIZJ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91503Zvf(ActivityC45651qj activityC45651qj) {
        super(activityC45651qj);
        new LinkedHashMap();
    }

    @Override // X.C91362ZtO, X.InterfaceC92113jT
    public final void LJFF(float f) {
        if (this.LLIZ) {
            if (getMFakeDragging()) {
                LIZLLL();
                return;
            }
            return;
        }
        super.LJFF(f);
    }

    @Override // X.C91362ZtO, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        if (ev.getActionMasked() == 0) {
            this.LLILZLL = 0;
            this.LLIZ = false;
        }
        try {
            return super.onInterceptTouchEvent(ev);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // X.C91362ZtO, android.view.View
    public final boolean onTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        if ((ev.getActionMasked() == 2 || ev.getActionMasked() == 1) && this.LLIZ) {
            ev.setAction(3);
        }
        try {
            return super.onTouchEvent(ev);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public final void setFilterScrollInterceptor(InterfaceC91242ZrS interfaceC91242ZrS) {
        this.LLILZIL = interfaceC91242ZrS;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    @Override // X.C91362ZtO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(int r6, float r7, int r8) {
        /*
            r5 = this;
            super.LJIJJ(r6, r7, r8)
            boolean r0 = r5.LLF
            if (r0 != 0) goto Ld
            boolean r0 = r5.getMFakeDragging()
            if (r0 == 0) goto L2a
        Ld:
            boolean r0 = r5.LLIZ
            if (r0 != 0) goto L2a
            float r1 = (float) r6
            float r1 = r1 + r7
            int r0 = r5.getCurrentItem()
            float r0 = (float) r0
            r4 = -1
            r3 = 0
            r2 = 1
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L5c
            r1 = 1
        L20:
            int r0 = r5.LLILZLL
            if (r0 == r1) goto L28
            if (r1 == r4) goto L34
            if (r1 == r2) goto L2b
        L28:
            r5.LLILZLL = r1
        L2a:
            return
        L2b:
            X.ZrS r0 = r5.LLILZIL
            if (r0 == 0) goto L28
            boolean r0 = r0.LIZLLL()
            goto L3c
        L34:
            X.ZrS r0 = r5.LLILZIL
            if (r0 == 0) goto L28
            boolean r0 = r0.LIZIZ()
        L3c:
            if (r0 != 0) goto L28
            r5.LLIZ = r2
            int r0 = r5.getCurrentItem()
            r5.LJJIIJ(r0, r3, r2, r3)
            if (r1 == r4) goto L54
            if (r1 == r2) goto L4c
            goto L28
        L4c:
            X.ZrS r0 = r5.LLILZIL
            if (r0 == 0) goto L28
            r0.LIZ()
            goto L28
        L54:
            X.ZrS r0 = r5.LLILZIL
            if (r0 == 0) goto L28
            r0.LIZJ()
            goto L28
        L5c:
            int r0 = r5.getCurrentItem()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L67
            r1 = -1
            goto L20
        L67:
            r1 = 0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91503Zvf.LJIJJ(int, float, int):void");
    }
}
