package X;

import com.bytedance.retrofit2.client.Request;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.FBa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38550FBa implements FBZ {
    public final /* synthetic */ FBZ LIZ;
    public final /* synthetic */ String LIZIZ;

    @Override // X.FBZ
    public final C64738Paw LIZIZ() {
        C64738Paw LIZIZ = this.LIZ.LIZIZ();
        o.LJIIIIZZ(LIZIZ, "chain.metrics()");
        return LIZIZ;
    }

    @Override // X.FBZ
    public final Request request() {
        ArrayList arrayList = new ArrayList();
        List<EJ6> headers = this.LIZ.request().getHeaders();
        o.LJIIIIZZ(headers, "chain.request().headers");
        arrayList.addAll(headers);
        arrayList.add(new EJ6("x-tt-cs", this.LIZIZ));
        C64908Pdg newBuilder = this.LIZ.request().newBuilder();
        newBuilder.LIZJ = arrayList;
        return newBuilder.LIZ();
    }

    @Override // X.FBZ
    public final C64797Pbt<?> LIZ(Request request) {
        C64797Pbt<?> LIZ = this.LIZ.LIZ(request);
        o.LJIIIIZZ(LIZ, "chain.proceed(request)");
        return LIZ;
    }

    public C38550FBa(F7S f7s, String str) {
        this.LIZ = f7s;
        this.LIZIZ = str;
    }
}
