package X;

import com.bytedance.pia.core.worker.network.WorkerDelegate;
import com.bytedance.retrofit2.RequestBuilder;
import com.bytedance.retrofit2.SsHttpCall;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.vmsdk.net.Response;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.EiN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37171EiN implements InterfaceC37346ElC<TypedInput> {
    public final /* synthetic */ WorkerDelegate LJLIL;
    public final /* synthetic */ InterfaceC37172EiO LJLILLLLZI;
    public final /* synthetic */ InterfaceC37172EiO LJLJI;

    @Override // X.InterfaceC36621EYv
    public final void LJII(InterfaceC37276Ek4<TypedInput> interfaceC37276Ek4, C64797Pbt<TypedInput> c64797Pbt) {
    }

    @Override // X.InterfaceC37346ElC
    public final void LJIIIIZZ(RequestBuilder requestBuilder) {
    }

    @Override // X.InterfaceC36621EYv
    public final void LIZJ(InterfaceC37276Ek4<TypedInput> interfaceC37276Ek4, Throwable th) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL.LIZ);
        LIZ.append("Fetch failed (Reason: ");
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(')');
        C37238EjS.LIZLLL(6, X1D.LIZIZ(LIZ), null);
        this.LJLILLLLZI.LIZ(th);
    }

    @Override // X.InterfaceC37346ElC
    public final void LJ(SsHttpCall ssHttpCall, C64797Pbt c64797Pbt) {
        String str;
        if (c64797Pbt == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJLIL.LIZ);
            LIZ.append("Fetch failed (Reason: Invalid response!)");
            C37238EjS.LIZLLL(6, X1D.LIZIZ(LIZ), null);
            this.LJLILLLLZI.LIZ(new Error("Invalid response!"));
            return;
        }
        C36910EeA c36910EeA = c64797Pbt.LIZ;
        o.LJFF(c36910EeA, "response.raw()");
        String str2 = c36910EeA.LIZ;
        C36910EeA c36910EeA2 = c64797Pbt.LIZ;
        o.LJFF(c36910EeA2, "response.raw()");
        int i = c36910EeA2.LIZIZ;
        C36910EeA c36910EeA3 = c64797Pbt.LIZ;
        o.LJFF(c36910EeA3, "response.raw()");
        List<EJ6> list = c36910EeA3.LIZLLL;
        o.LJFF(list, "response.raw().headers");
        int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(list, 10));
        if (LJJIIZ < 16) {
            LJJIIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
        for (EJ6 it : list) {
            o.LJFF(it, "it");
            OSZ osz = new OSZ(it.LIZ, it.LIZIZ);
            linkedHashMap.put(osz.getFirst(), osz.getSecond());
        }
        WorkerDelegate workerDelegate = this.LJLIL;
        List<EJ6> list2 = c64797Pbt.LIZ.LIZLLL;
        o.LJFF(list2, "response.headers()");
        workerDelegate.getClass();
        C39745Fin LIZJ = C39745Fin.LIZJ(WorkerDelegate.LIZ(list2));
        if (LIZJ != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LIZJ.LIZIZ);
            LIZ2.append("/");
            LIZ2.append(LIZJ.LIZJ);
            str = X1D.LIZIZ(LIZ2);
        } else {
            str = null;
        }
        C36910EeA c36910EeA4 = c64797Pbt.LIZ;
        o.LJFF(c36910EeA4, "response.raw()");
        InputStream in = c36910EeA4.LJ.in();
        if (str == null) {
            str = "application/json";
        }
        Response response = new Response(str2, i, linkedHashMap, in, str);
        C37238EjS.LJI(6, this.LJLIL.LIZ + "Fetch successfully (URL: " + str2 + ')', null);
        this.LJLJI.LIZ(response);
    }

    public C37171EiN(WorkerDelegate workerDelegate, C37620Epc c37620Epc, C37621Epd c37621Epd) {
        this.LJLIL = workerDelegate;
        this.LJLILLLLZI = c37620Epc;
        this.LJLJI = c37621Epd;
    }
}
