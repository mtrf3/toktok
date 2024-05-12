package X;

import com.bytedance.liko.leakdetector.FileApi;
import com.google.gson.Gson;
import java.util.List;

/* renamed from: X.Pfc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65028Pfc implements InterfaceC39611Fgd {
    public final C64600PWy LIZIZ = new C64600PWy();

    @Override // X.InterfaceC39611Fgd
    public final void LIZ(List list, C39602FgU c39602FgU) {
        C65018PfS LIZJ;
        C65027Pfb c65027Pfb = new C65027Pfb();
        c65027Pfb.LIZIZ("https://api-va.tiktokv.com/monitor/collect/c/mom_dump_collect/");
        C64600PWy c64600PWy = this.LIZIZ;
        C65138PhO.LIZ(c64600PWy, "client == null");
        c65027Pfb.LIZIZ = c64600PWy;
        c65027Pfb.LIZ(new C65239Pj1(new Gson()));
        C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(400200, "retrofit2/Retrofit$Builder", "build", c65027Pfb, new Object[0], "retrofit2.Retrofit", new C65300Pk0(false, "()Lretrofit2/Retrofit;", "-4973147288044898188"));
        if (LIZJ2.LIZ) {
            LIZJ = (C65018PfS) LIZJ2.LIZIZ;
        } else {
            LIZJ = c65027Pfb.LIZJ();
        }
        ((FileApi) LIZJ.LIZIZ(FileApi.class)).upload("https://api-va.tiktokv.com/monitor/collect/c/mom_dump_collect/", list).LLLZ(new PZJ(c39602FgU));
    }
}
