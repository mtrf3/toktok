package X;

import android.accounts.Account;
import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QIE {
    public InterfaceC66833QKv LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public InterfaceC66836QKy LJ;
    public boolean LJFF;
    public int LJI;
    public PA0 LJII;
    public Context LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public long LJIILL;
    public String LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public String LJIJI;
    public QKZ LJIJJ;
    public String LJIJJLI;
    public String LJIL;
    public String LJJ;
    public JSONObject LJJI;
    public java.util.Map<String, Object> LJJIFFI;
    public Account LJJII;
    public boolean LJJIII;
    public boolean LJJIIJ;
    public boolean LJJIIJZLJL;
    public boolean LJJIIZ;
    public EnumC86802Y4w LJJIIZI;
    public C39246Fak LJJIJ;
    public TelephonyManager LJJIJIIJI;

    public final QIF LIZ() {
        boolean z;
        if (this.LJIIIIZZ == null || this.LJI <= 0 || TextUtils.isEmpty(this.LJIIZILJ)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("parameters error:");
            if (this.LJIIIIZZ == null) {
                z = true;
            } else {
                z = false;
            }
            LIZ.append(z);
            LIZ.append(", ");
            LIZ.append(this.LJI);
            LIZ.append(", ");
            LIZ.append(this.LJIIZILJ);
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
        }
        if (!TextUtils.isEmpty(this.LJIILLIIL)) {
            if (this.LJII != null) {
                if (this.LIZ != null) {
                    if (TextUtils.isEmpty(this.LJIJ)) {
                        this.LJIJ = this.LJIIZILJ;
                    }
                    if (this.LJJIJIIJI == null) {
                        this.LJJIJIIJI = (TelephonyManager) C16880lQ.LLILL(this.LJIIIIZZ, "phone");
                    }
                    C66789QJd LIZIZ = C66789QJd.LIZIZ();
                    int i = this.LJI;
                    LIZIZ.getClass();
                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                    concurrentHashMap.put("register", new C66808QJw());
                    concurrentHashMap.put("activate", new C66809QJx());
                    concurrentHashMap.put("params", new QK1());
                    ((ConcurrentHashMap) LIZIZ.LIZ).put(String.valueOf(i), concurrentHashMap);
                    return new QIF(this);
                }
                throw new IllegalArgumentException("please set event depend");
            }
            throw new IllegalArgumentException("please set network client");
        }
        throw new IllegalArgumentException("appName is empty");
    }

    public QIE() {
        new C1FE();
        this.LJJIIJZLJL = true;
        this.LJJIIZ = false;
    }
}
