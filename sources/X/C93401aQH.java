package X;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.maps.model.MapStyleOptions;
import kotlin.jvm.internal.o;

/* renamed from: X.aQH, reason: case insensitive filesystem */
/* loaded from: classes32.dex */
public final class C93401aQH extends AbstractC65781Prl implements InterfaceC88472Yns<C68824Qzk, C76800UCe> {
    public final /* synthetic */ C93388aQ4 LJLIL;
    public final /* synthetic */ InterfaceC88472Yns<C8DU, C76800UCe> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C93401aQH(C93388aQ4 c93388aQ4, InterfaceC88472Yns<? super C8DU, C76800UCe> interfaceC88472Yns) {
        super(1);
        this.LJLIL = c93388aQ4;
        this.LJLILLLLZI = interfaceC88472Yns;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C68824Qzk c68824Qzk) {
        C68824Qzk c68824Qzk2 = c68824Qzk;
        o.LJIIIZ(c68824Qzk2, "$this$null");
        String str = this.LJLIL.LIZ.LIZLLL;
        if (str != null) {
            if (!(!TextUtils.isEmpty(str))) {
                str = null;
            }
            if (str != null) {
                try {
                    c68824Qzk2.LIZ.LLJJIJI(new MapStyleOptions(str));
                } catch (RemoteException e) {
                    throw new C68463Qtv(e);
                }
            }
        }
        this.LJLIL.LIZ.getClass();
        try {
            c68824Qzk2.LIZ.e0();
            C0R4 LJ = c68824Qzk2.LJ();
            this.LJLIL.LIZ.getClass();
            LJ.getClass();
            try {
                ((InterfaceC68835Qzv) LJ.LIZ).B();
                C0R4 LJ2 = c68824Qzk2.LJ();
                this.LJLIL.LIZ.getClass();
                LJ2.getClass();
                try {
                    ((InterfaceC68835Qzv) LJ2.LIZ).LLIIIZ();
                    try {
                        c68824Qzk2.LIZ.LLLLIILLL(this.LJLIL.LIZ.LJ);
                        this.LJLILLLLZI.invoke(new C93382aPy(c68824Qzk2));
                        return C76800UCe.LIZ;
                    } catch (RemoteException e2) {
                        throw new C68463Qtv(e2);
                    }
                } catch (RemoteException e3) {
                    throw new C68463Qtv(e3);
                }
            } catch (RemoteException e4) {
                throw new C68463Qtv(e4);
            }
        } catch (RemoteException e5) {
            throw new C68463Qtv(e5);
        }
    }
}
