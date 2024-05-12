package X;

import com.ss.android.ugc.aweme.experiment.ChannelReRankAndFlipConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OYS implements InterfaceC73509St7<List<? extends C62707OjH>> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ InterfaceC88472Yns<ArrayList<String>, C76800UCe> LJLILLLLZI;
    public final /* synthetic */ ArrayList<String> LJLJI;
    public final /* synthetic */ int LJLJJI = 10;

    @Override // X.InterfaceC73509St7
    public final void onComplete() {
    }

    @Override // X.InterfaceC73509St7
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
    }

    @Override // X.InterfaceC73509St7
    public final void onSubscribe(InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
    }

    @Override // X.InterfaceC73509St7
    public final void onSuccess(List<? extends C62707OjH> list) {
        java.util.Map LJIIL;
        List<? extends C62707OjH> records = list;
        o.LJIIIZ(records, "records");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("database cost = ");
        LIZ.append(System.currentTimeMillis() - this.LJLIL);
        C43252GyG.LIZ("Tool", X1D.LIZIZ(LIZ));
        C62397OeH.LIZJ().getClass();
        InterfaceC88472Yns<ArrayList<String>, C76800UCe> interfaceC88472Yns = this.LJLILLLLZI;
        ArrayList<String> arrayList = this.LJLJI;
        if (((ChannelReRankAndFlipConfig) C62068OXo.LIZIZ.getValue()).getRerankLogic() == 2) {
            LJIIL = C1JI.LJIIJJI(this.LJLJJI, records, this.LJLJI);
        } else {
            LJIIL = C1JI.LJIIL(records, this.LJLJI, this.LJLJJI);
        }
        o.LJIIIZ(arrayList, "<this>");
        C40675Fxn.LJJLIIIJ(arrayList, new C42032Gea(arrayList, LJIIL));
        interfaceC88472Yns.invoke(arrayList);
    }

    public OYS(long j, OYQ oyq, ArrayList arrayList) {
        this.LJLIL = j;
        this.LJLILLLLZI = oyq;
        this.LJLJI = arrayList;
    }
}
