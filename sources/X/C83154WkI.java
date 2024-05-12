package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.tools.beauty.service.BeautyFilterConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WkI, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83154WkI {
    public static final Keva LJ;
    public final C81017Vqv<C82942Wgs> LIZ;
    public ILU LIZIZ;
    public final BeautyFilterConfig LIZJ;
    public final Gson LIZLLL;

    public final synchronized void LIZJ() {
        this.LIZ.clear();
        List<C82942Wgs> LIZIZ = LIZIZ();
        if (LIZIZ != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("init sequence: ");
            LIZ.append(LIZIZ);
            C83175Wkd.LIZIZ(X1D.LIZIZ(LIZ));
            this.LIZ.addAll(ORZ.LJLL(LIZIZ));
        }
    }

    static {
        Keva repo = Keva.getRepo("ulike_repo");
        o.LJIIIIZZ(repo, "Keva.getRepo(KEVA_ULIKE_REPO)");
        LJ = repo;
    }

    public final List<C82942Wgs> LIZIZ() {
        String string = LJ.getString(LIZ(), null);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("get sequence: ");
        LIZ.append(string);
        C83175Wkd.LIZIZ(X1D.LIZIZ(LIZ));
        try {
            return (List) this.LIZLLL.LJII(string, new C83171WkZ().getType());
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void LIZLLL() {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            arrayList.addAll(this.LIZ);
        }
        String json = GsonProtectorUtils.toJson(this.LIZLLL, arrayList);
        o.LJIIIIZZ(json, "gson.toJson(copy)");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("save sequence:");
        LIZ.append(json);
        C83175Wkd.LIZIZ(X1D.LIZIZ(LIZ));
        LJ.storeString(LIZ(), json);
    }

    public final String LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZJ.getSequenceKey());
        LIZ.append(this.LIZIZ.getFlag());
        LIZ.append("_");
        LIZ.append("key_beauty_sequence");
        return X1D.LIZIZ(LIZ);
    }

    public C83154WkI(BeautyFilterConfig beautyFilterConfig, Gson gson) {
        o.LJIIIZ(beautyFilterConfig, "beautyFilterConfig");
        o.LJIIIZ(gson, "gson");
        this.LIZJ = beautyFilterConfig;
        this.LIZLLL = gson;
        this.LIZ = new C81017Vqv<>();
        this.LIZIZ = ILU.FEMALE;
        LIZJ();
    }
}
