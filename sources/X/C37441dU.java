package X;

import android.os.SystemClock;
import android.view.MotionEvent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.IDqS416S0100000;

/* renamed from: X.1dU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37441dU extends C11V {
    public AnonymousClass113 LJLILLLLZI = AnonymousClass113.Unknown;
    public final /* synthetic */ C533227k LJLJI;

    @Override // X.C11V
    public final void LIZLLL() {
        if (this.LJLILLLLZI == AnonymousClass113.Dispatching) {
            long uptimeMillis = SystemClock.uptimeMillis();
            IDqS416S0100000 iDqS416S0100000 = new IDqS416S0100000(this.LJLJI, 341);
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            obtain.setSource(0);
            iDqS416S0100000.invoke(obtain);
            obtain.recycle();
            this.LJLILLLLZI = AnonymousClass113.Unknown;
            this.LJLJI.LJLJI = false;
        }
    }

    public C37441dU(C533227k c533227k) {
        this.LJLJI = c533227k;
    }

    public final void LJJIJIL(C11H c11h) {
        boolean z;
        List<C11P> list = c11h.LIZ;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (((C11P) ListProtector.get(list, i)).LIZIZ()) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            if (this.LJLILLLLZI == AnonymousClass113.Dispatching) {
                AbstractC538029g abstractC538029g = this.LJLIL;
                if (abstractC538029g != null) {
                    V3N.LJJIJIL(c11h, abstractC538029g.LJIILL(C10370av.LIZIZ), new IDqS416S0100000(this.LJLJI, 340), true);
                } else {
                    "layoutCoordinates not set".toString();
                    throw new IllegalStateException("layoutCoordinates not set");
                }
            }
            this.LJLILLLLZI = AnonymousClass113.NotDispatching;
            return;
        }
        AbstractC538029g abstractC538029g2 = this.LJLIL;
        if (abstractC538029g2 != null) {
            V3N.LJJIJIL(c11h, abstractC538029g2.LJIILL(C10370av.LIZIZ), new IDqS172S0200000(this, this.LJLJI, 93), false);
            if (this.LJLILLLLZI != AnonymousClass113.Dispatching) {
                return;
            }
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((C11P) ListProtector.get(list, i2)).LIZ();
            }
            C11B c11b = c11h.LIZIZ;
            if (c11b == null) {
                return;
            }
            c11b.LIZJ = !this.LJLJI.LJLJI;
            return;
        }
        "layoutCoordinates not set".toString();
        throw new IllegalStateException("layoutCoordinates not set");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0057 A[ORIG_RETURN, RETURN] */
    @Override // X.C11V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZ(X.C11H r7, X.C11I r8, long r9) {
        /*
            r6 = this;
            java.lang.String r0 = "pass"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.util.List<X.11P> r4 = r7.LIZ
            X.27k r0 = r6.LJLJI
            boolean r0 = r0.LJLJI
            r3 = 0
            if (r0 != 0) goto L27
            int r5 = r4.size()
            r2 = 0
        L13:
            if (r2 >= r5) goto L67
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r2)
            X.11P r1 = (X.C11P) r1
            boolean r0 = com.google.android.play.core.appupdate.u.LIZ(r1)
            if (r0 != 0) goto L27
            boolean r0 = com.google.android.play.core.appupdate.u.LIZIZ(r1)
            if (r0 == 0) goto L64
        L27:
            r2 = 1
        L28:
            X.113 r1 = r6.LJLILLLLZI
            X.113 r0 = X.AnonymousClass113.NotDispatching
            if (r1 == r0) goto L40
            X.11I r0 = X.C11I.Initial
            if (r8 != r0) goto L37
            if (r2 == 0) goto L37
            r6.LJJIJIL(r7)
        L37:
            X.11I r0 = X.C11I.Final
            if (r8 != r0) goto L40
            if (r2 != 0) goto L40
            r6.LJJIJIL(r7)
        L40:
            X.11I r0 = X.C11I.Final
            if (r8 != r0) goto L57
            int r2 = r4.size()
            r1 = 0
        L49:
            if (r1 >= r2) goto L5b
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r1)
            X.11P r0 = (X.C11P) r0
            boolean r0 = com.google.android.play.core.appupdate.u.LIZIZ(r0)
            if (r0 != 0) goto L58
        L57:
            return
        L58:
            int r1 = r1 + 1
            goto L49
        L5b:
            X.113 r0 = X.AnonymousClass113.Unknown
            r6.LJLILLLLZI = r0
            X.27k r0 = r6.LJLJI
            r0.LJLJI = r3
            goto L57
        L64:
            int r2 = r2 + 1
            goto L13
        L67:
            r2 = 0
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37441dU.LJJIIZ(X.11H, X.11I, long):void");
    }
}
