package X;

import android.os.Parcel;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

/* renamed from: X.19x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C284919x implements InterfaceC67935QlP {
    public final Object LJLIL;
    public final Object LJLILLLLZI;

    public /* synthetic */ C284919x(C67798QjC c67798QjC, BeginSignInRequest beginSignInRequest) {
        this.LJLIL = c67798QjC;
        this.LJLILLLLZI = beginSignInRequest;
    }

    public final void LIZIZ() {
        while (true) {
            Reference poll = ((ReferenceQueue) this.LJLILLLLZI).poll();
            if (poll != null) {
                ((C25710zf) this.LJLIL).LJIIL(poll);
            } else {
                return;
            }
        }
    }

    public /* synthetic */ C284919x() {
        this.LJLIL = new C25710zf(new Reference[16]);
        this.LJLILLLLZI = new ReferenceQueue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC67935QlP
    public final void LIZ(InterfaceC67836Qjo interfaceC67836Qjo, Object obj) {
        AbstractSafeParcelable abstractSafeParcelable = (AbstractSafeParcelable) this.LJLILLLLZI;
        BinderC68011Qmd binderC68011Qmd = new BinderC68011Qmd((C67649Qgn) obj);
        C68000QmS c68000QmS = (C68000QmS) ((AbstractC67863QkF) interfaceC67836Qjo).LJJIIJ();
        QH7.LJIIIIZZ(abstractSafeParcelable);
        Parcel LJLJI = c68000QmS.LJLJI();
        C67988QmG.LIZLLL(LJLJI, binderC68011Qmd);
        C67988QmG.LIZJ(LJLJI, abstractSafeParcelable);
        c68000QmS.LLJI(LJLJI, 1);
    }
}
