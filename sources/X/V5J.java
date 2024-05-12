package X;

import android.content.Context;
import defpackage.a1;
import kotlin.jvm.internal.AqS116S0101000_13;

/* loaded from: classes14.dex */
public final class V5J extends AbstractC282819c {
    public InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> LJLLI;
    public InterfaceC10230ah LJLLILLLL;
    public boolean LJLLJ;

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    public final InterfaceC10230ah getFirstItemState() {
        return this.LJLLILLLL;
    }

    @Override // X.C04D
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.LJLLJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V5J(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "context");
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        if (i == -1) {
            InterfaceC10230ah interfaceC10230ah = this.LJLLILLLL;
            if (interfaceC10230ah == null) {
                return false;
            }
            if (interfaceC10230ah.getIndex() == 0 && interfaceC10230ah.getOffset() >= 0) {
                return false;
            }
            return true;
        }
        return super.canScrollVertically(i);
    }

    public final void setContent(InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr) {
        this.LJLLJ = true;
        this.LJLLI = interfaceC88471Ynr;
        if (isAttachedToWindow()) {
            LIZJ();
        }
    }

    public final void setFirstItemState(InterfaceC10230ah interfaceC10230ah) {
        this.LJLLILLLL = interfaceC10230ah;
    }

    @Override // X.C04D
    public final void LIZ(InterfaceC24520xk interfaceC24520xk, int i) {
        C35931b3 LJIL = interfaceC24520xk.LJIL(280894540);
        InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr = this.LJLLI;
        if (interfaceC88471Ynr != null) {
            interfaceC88471Ynr.invoke(LJIL, 0);
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new AqS116S0101000_13(this, i, 1);
    }
}
