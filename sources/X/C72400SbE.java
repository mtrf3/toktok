package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.slot.IIconSlot;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SbE, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72400SbE {
    public final ViewModel LIZ;
    public XKQ LIZIZ;

    public C72400SbE(IIconSlot.SlotViewModel viewModel) {
        o.LJIIIZ(viewModel, "viewModel");
        this.LIZ = viewModel;
    }

    public static Object LIZJ(C72831SiB c72831SiB, InterfaceC67352kd interfaceC67352kd) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        ((AbstractC48384Iyq) W5I.LIZ().LJ(c72831SiB.LJ.LIZ(), null)).LJ(new C72398SbC(xks), C38995FSd.LIZJ());
        return xks.LJIIJJI();
    }

    public final void LIZIZ(List<? extends C72831SiB> list, InterfaceC72403SbH interfaceC72403SbH) {
        this.LIZIZ = XKX.LIZLLL(ViewModelKt.getViewModelScope(this.LIZ), C36636EZk.LIZ, null, new C72401SbF(this, list, interfaceC72403SbH, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List<? extends X.C72831SiB> r9, X.InterfaceC70422pa r10, X.InterfaceC67352kd<? super java.util.List<android.graphics.Bitmap>> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.C72402SbG
            if (r0 == 0) goto L68
            r7 = r11
            X.SbG r7 = (X.C72402SbG) r7
            int r2 = r7.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L68
            int r2 = r2 - r1
            r7.LJLJI = r2
        L12:
            java.lang.Object r1 = r7.LJLIL
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJI
            r5 = 1
            if (r0 == 0) goto L3c
            if (r0 != r5) goto L6f
            X.C141335gf.LIZJ(r1)
        L20:
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L2b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L6e
            java.lang.Object r0 = r1.next()
            if (r0 != 0) goto L38
            return r2
        L38:
            r2.add(r0)
            goto L2b
        L3c:
            java.util.ArrayList r4 = X.C1JX.LJFF(r1)
            java.util.Iterator r3 = r9.iterator()
        L44:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L5f
            java.lang.Object r0 = r3.next()
            X.SiB r0 = (X.C72831SiB) r0
            X.SbD r2 = new X.SbD
            r1 = 0
            r2.<init>(r8, r0, r1)
            r0 = 3
            X.XKn r0 = X.XKX.LIZIZ(r10, r1, r1, r2, r0)
            r4.add(r0)
            goto L44
        L5f:
            r7.LJLJI = r5
            java.lang.Object r1 = X.T1W.LIZ(r4, r7)
            if (r1 != r6) goto L20
            return r6
        L68:
            X.SbG r7 = new X.SbG
            r7.<init>(r8, r11)
            goto L12
        L6e:
            return r2
        L6f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72400SbE.LIZ(java.util.List, X.2pa, X.2kd):java.lang.Object");
    }
}
