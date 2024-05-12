package X;

import com.bytedance.android.livesdk.wallet.Diamond;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.UdQ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77632UdQ<T> implements InterfaceC66992k3 {
    public final /* synthetic */ C58528My4 LJLIL;

    public C77632UdQ(C58528My4 c58528My4) {
        this.LJLIL = c58528My4;
    }

    @Override // X.InterfaceC66992k3
    public final void subscribe(InterfaceC65052gv<String> interfaceC65052gv) {
        String str;
        if (C58528My4.LIZIZ.length() > 0) {
            ((C73578SuE) interfaceC65052gv).onSuccess(C58528My4.LIZIZ);
            return;
        }
        String str2 = "";
        if (C32358Cmw.LIZ()) {
            ((C73578SuE) interfaceC65052gv).onSuccess("");
            return;
        }
        T LJ = C77607Ud1.LIZIZ().LIZ((List) new OFW(C47261Igj.LJJIJ(this.LJLIL.LIZ.getValue())).LIZ).LJ();
        o.LJIIIIZZ(LJ, "WalletServiceManager.pay…,\n        ).blockingGet()");
        Diamond diamond = (Diamond) ORZ.LJLLLL((List) LJ);
        if (diamond != null && (str = diamond.LJLILLLLZI) != null) {
            str2 = str;
        }
        C58528My4.LIZIZ = str2;
        ((C73578SuE) interfaceC65052gv).onSuccess(str2);
    }
}
