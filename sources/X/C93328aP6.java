package X;

import com.bytedance.pitaya.bdcomponentimpl.network.TTNetHttpClientImpl;
import com.bytedance.retrofit2.client.Request;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.aP6, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class C93328aP6 implements InterfaceC37216Ej6 {
    public final /* synthetic */ TTNetHttpClientImpl LJLIL;

    public C93328aP6(TTNetHttpClientImpl tTNetHttpClientImpl) {
        this.LJLIL = tTNetHttpClientImpl;
    }

    @Override // X.InterfaceC37216Ej6
    public final C64797Pbt<Object> intercept(FBZ fbz) {
        ArrayList arrayList = new ArrayList();
        F7S f7s = (F7S) fbz;
        Request request = f7s.LIZJ;
        o.LJFF(request, "chain.request()");
        List<EJ6> headers = request.getHeaders();
        o.LJFF(headers, "chain.request().headers");
        arrayList.addAll(headers);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("t=0;n=");
        LIZ.append(this.LJLIL.isNewUser() ? 1 : 0);
        arrayList.add(new EJ6("x-tt-request-tag", X1D.LIZIZ(LIZ)));
        C64908Pdg newBuilder = f7s.LIZJ.newBuilder();
        newBuilder.LIZJ = arrayList;
        return f7s.LIZ(newBuilder.LIZ());
    }
}
