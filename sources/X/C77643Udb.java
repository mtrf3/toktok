package X;

import com.bytedance.android.livesdk.wallet.Diamond;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Udb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77643Udb<T> implements InterfaceC66992k3 {
    public final /* synthetic */ List<String> LJLIL;

    public C77643Udb(List<String> list) {
        this.LJLIL = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC66992k3
    public final void subscribe(InterfaceC65052gv<List<Diamond>> interfaceC65052gv) {
        UIO.LIZ("ttlive_wallet_recharge_query_iap_start", null);
        C62822Ol8 c62822Ol8 = C77683UeF.LIZ;
        InterfaceC77665Udx interfaceC77665Udx = (InterfaceC77665Udx) c62822Ol8.getValue();
        EnumC77641UdZ enumC77641UdZ = EnumC77641UdZ.USE;
        Object LIZIZ = interfaceC77665Udx.LIZIZ(enumC77641UdZ, this.LJLIL);
        if (LIZIZ != null) {
            UIO.LIZ("ttlive_wallet_recharge_query_iap_get_cache", null);
            AbstractC73638SvC.LJI(new C77646Ude(this.LJLIL)).LJJII(C77644Udc.LJLIL, new InterfaceC64592gB() { // from class: X.9Cn
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            });
            ((C73578SuE) interfaceC65052gv).onSuccess(LIZIZ);
        } else {
            T LJ = AbstractC73638SvC.LJI(new C77646Ude(this.LJLIL)).LJ();
            ((InterfaceC77665Udx) c62822Ol8.getValue()).LIZ(enumC77641UdZ, new ArrayList(), LJ);
            ((C73578SuE) interfaceC65052gv).onSuccess(LJ);
        }
    }
}
