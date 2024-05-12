package Y;

import X.C16880lQ;
import X.C64862Pcw;
import X.C64863Pcx;
import X.C64869Pd3;
import X.PXI;
import X.PXW;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.applog.et_verify.EventVerify;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class ARunnableS10S1200000_11 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    public final void LIZ$0() {
        String str;
        JSONObject jSONObject = null;
        try {
            str = ((EventVerify) this.l2).appLogInstance.LJFF().get(this.s0, null);
        } catch (Exception e) {
            ((EventVerify) this.l2).appLogInstance.LJJIZ.LIZJ(6, "login et failed", e, new Object[0]);
            str = null;
        }
        ((EventVerify) this.l2).appLogInstance.LJJIZ.LJIJI(6, null, "login et resp: {}", str);
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
                if (0 == 0) {
                    return;
                }
            }
            if (jSONObject.optInt("status") == 200) {
                ((EventVerify) this.l2).setEnable(true, (Context) this.l1);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$1() {
        C64862Pcw c64862Pcw = ((C64863Pcx) this.l2).LJLIL;
        if (c64862Pcw.LJLLILLLL == ((PXW) this.l1)) {
            c64862Pcw.LJIIJ(3);
            C64862Pcw c64862Pcw2 = ((C64863Pcx) this.l2).LJLIL;
            c64862Pcw2.LJLLILLLL = null;
            c64862Pcw2.LJLLL.LIZLLL();
            C64869Pd3 c64869Pd3 = ((C64863Pcx) this.l2).LJLIL.LJLLI;
            if (c64869Pd3 != null) {
                String str = this.s0;
                if (c64869Pd3.LIZ != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("type", 0);
                        jSONObject.put("state", 3);
                        jSONObject.put("url", str);
                        jSONObject.put("channel_type", 2);
                        c64869Pd3.LIZ.onConnection(jSONObject);
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
            C64862Pcw c64862Pcw3 = ((C64863Pcx) this.l2).LJLIL;
            if (c64862Pcw3.LJLLJ) {
                c64862Pcw3.LJLLJ = false;
                c64862Pcw3.LJIIL(c64862Pcw3.LJLJI.LIZJ());
            } else if (!c64862Pcw3.LJLJL) {
                Pair<String, Long> LIZIZ = c64862Pcw3.LJLJI.LIZIZ(null);
                ((C64863Pcx) this.l2).LJLIL.LJIILIIL(((Long) LIZIZ.second).longValue(), (String) LIZIZ.first, true);
            }
        }
    }

    public static final void run$0(ARunnableS10S1200000_11 aRunnableS10S1200000_11) {
        boolean LIZ;
        try {
            aRunnableS10S1200000_11.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS10S1200000_11 aRunnableS10S1200000_11) {
        boolean LIZ;
        try {
            ((Bitmap[]) aRunnableS10S1200000_11.l1)[0] = BitmapFactory.decodeFile(aRunnableS10S1200000_11.s0, (BitmapFactory.Options) aRunnableS10S1200000_11.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS10S1200000_11 aRunnableS10S1200000_11) {
        boolean LIZ;
        try {
            aRunnableS10S1200000_11.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS10S1200000_11(Object obj, String str, Object obj2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.l1 = obj2;
    }

    public ARunnableS10S1200000_11(C64863Pcx c64863Pcx, PXI pxi, String str, int i, String str2, int i2) {
        this.$t = i2;
        this.l2 = c64863Pcx;
        this.l1 = pxi;
        this.s0 = str;
    }
}
