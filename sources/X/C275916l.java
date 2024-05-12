package X;

import aj2.c;
import android.app.Application;
import android.text.TextUtils;
import com.bytedance.bpea.basics.Cert;
import org.json.JSONArray;
import org.json.JSONObject;
import rj2.a$a;

/* renamed from: X.16l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C275916l {
    public final Application LIZ;
    public String LIZIZ;
    public JSONObject LIZJ;
    public JSONArray LIZLLL;
    public JSONArray LJ;
    public JSONArray LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public InterfaceC06380Mw LJIIJ;
    public String LJIIJJI;
    public AbstractC66805QJt LJIIL;
    public C0RF LJIILIIL;
    public String LJIILJJIL;
    public Cert LJIILL;
    public Cert LJIILLIIL;
    public Cert LJIIZILJ;
    public String LJIJ;
    public InterfaceC269413y LJIJI;
    public c LJIJJ;
    public a$a LJIJJLI;

    public final C276016m LIZ() {
        JSONObject jSONObject = this.LIZJ;
        if (jSONObject != null) {
            if (this.LIZLLL == null) {
                this.LIZLLL = jSONObject.optJSONArray("bank_card_rules");
            }
            if (this.LJ == null) {
                this.LJ = this.LIZJ.optJSONArray("methods");
            }
            if (this.LJFF == null) {
                this.LJFF = this.LIZJ.optJSONArray("stored_methods");
            }
        }
        if (this.LIZLLL == null) {
            this.LIZLLL = new JSONArray();
        }
        if (this.LJ == null) {
            this.LJ = new JSONArray();
        }
        if (this.LJFF == null) {
            this.LJFF = new JSONArray();
        }
        TextUtils.isEmpty(this.LJIIIIZZ);
        if (TextUtils.isEmpty(this.LJI)) {
            this.LJI = "k8vif92e";
        }
        if (TextUtils.isEmpty(this.LJII)) {
            this.LJII = "bytedance";
        }
        if (TextUtils.isEmpty(this.LJIIJJI)) {
            this.LJIIJJI = "en";
        }
        if (this.LJIIJ == null) {
            this.LJIIJ = new C78842Uww();
        }
        if (this.LJIIL == null) {
            this.LJIIL = AbstractC66805QJt.LIZ;
        }
        return new C276016m(this);
    }

    public C275916l(Application application) {
        this.LIZ = application;
    }
}
