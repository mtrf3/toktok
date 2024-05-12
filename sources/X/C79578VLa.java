package X;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: X.VLa, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79578VLa extends VLZ {
    public final C79579VLb LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public int LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public final JSONObject LJIILJJIL;
    public final java.util.Set<String> LJIILL;

    public C79578VLa(VMT vmt) {
        super(vmt);
        this.LIZLLL = new C79579VLb(this);
        this.LJIIJJI = 0;
        this.LJIILJJIL = new JSONObject();
        this.LJIILL = new HashSet();
    }

    public final void LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C77123UOp.LJJJJLL(C77123UOp.LJJJJI(str, this.LJIILJJIL) + 1, str, this.LJIILJJIL);
        ((HashSet) this.LJIILL).add(str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("addCount: ");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
    }
}
