package X;

import android.app.Activity;
import com.google.android.play.core.assetpacks.r2;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class S1D implements C7G1 {
    public static final ArrayList<S1I> LIZLLL = new ArrayList<>();
    public final S1B LIZ = new S1B();
    public final S1C LIZIZ = new S1C();
    public C7F9 LIZJ;

    @Override // X.C7G1
    public final boolean LIZJ() {
        List<S1E> LIZJ;
        C7F9 c7f9 = this.LIZJ;
        if (c7f9 != null && (LIZJ = c7f9.LIZJ()) != null) {
            return !LIZJ.isEmpty();
        }
        return false;
    }

    @Override // X.C7G1
    public final void LIZLLL() {
        C7F9 c7f9 = this.LIZJ;
        if (c7f9 != null) {
            LJI().LJIIJJI(c7f9);
        }
    }

    @Override // X.C7G1
    public final List<AnchorCommonStruct> h4() {
        List<S1E> LIZJ;
        ArrayList arrayList = new ArrayList();
        C7F9 c7f9 = this.LIZJ;
        if (c7f9 != null && (LIZJ = c7f9.LIZJ()) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (S1E s1e : LIZJ) {
                if (s1e instanceof HSS) {
                    arrayList2.add(s1e);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                AnchorCommonStruct anchorCommonStruct = ((HSS) it.next()).LJLJJL;
                if (anchorCommonStruct != null) {
                    arrayList.add(anchorCommonStruct);
                }
            }
        }
        return arrayList;
    }

    @Override // X.C7G1
    public final void LJ() {
        if (C209078Il.LIZ()) {
            this.LIZJ = null;
        }
    }

    public final r2 LJI() {
        if (C53258KvG.LIZJ()) {
            if (C53258KvG.LIZ() == 6 || C53258KvG.LIZ() == 7) {
                C7F9 c7f9 = this.LIZJ;
                if (c7f9 != null && C77412UZs.LJJIFFI(c7f9)) {
                    return this.LIZ;
                }
                return this.LIZIZ;
            }
            return this.LIZIZ;
        }
        return this.LIZ;
    }

    @Override // X.C7G1
    public final void LIZ(S1F s1f) {
        C7F9 c7f9 = this.LIZJ;
        if (c7f9 != null) {
            o.LJIIIIZZ(c7f9.LIZ.getAid(), "it.aweme().aid");
            C10K.LIZIZ(new S1H(this, c7f9, s1f), C10K.LJIIIIZZ, null);
        }
    }

    @Override // X.C7G1
    public final void LIZIZ(S1F s1f) {
        int LIZIZ;
        C7F9 c7f9 = this.LIZJ;
        if (c7f9 != null && (LIZIZ = c7f9.LIZIZ()) != 0) {
            if (LIZIZ != 1) {
                LJI().LJIILIIL(s1f, c7f9);
            } else {
                LJI().LJIILJJIL(s1f, c7f9);
            }
        }
    }

    @Override // X.C7G1
    public final int LJFF(Aweme aweme, Activity activity, String str, JSONObject jSONObject, boolean z, S1F s1f) {
        o.LJIIIZ(aweme, "aweme");
        C7F9 c7f9 = new C7F9(aweme, activity, str, "video_anchor", jSONObject, z);
        aweme.getAid();
        s1f.LIZJ();
        if (c7f9.LIZIZ() == 0) {
            this.LIZJ = null;
            return 0;
        }
        this.LIZJ = c7f9;
        return -1000;
    }
}
