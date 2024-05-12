package Y;

import X.C64214PIc;
import X.C64240PJc;
import X.C64241PJd;
import X.C64245PJh;
import X.C64246PJi;
import X.C64250PJm;
import X.C64268PKe;
import X.C78685UuP;
import X.PJA;
import X.PJV;
import X.PKW;
import X.PKZ;
import X.PL3;
import X.V1M;
import android.text.TextUtils;
import com.bytedance.crash.CrashType;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class ARunnableS0S6411000_11 implements Runnable {
    public final int $t;
    public int i11;
    public Object l6;
    public Object l7;
    public Object l8;
    public Object l9;
    public String s0;
    public String s1;
    public String s2;
    public String s3;
    public String s4;
    public String s5;
    public boolean z10;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        String LJJII;
        C64246PJi LJJIFFI;
        StackTraceElement[] stackTraceElementArr;
        if (!PKZ.LIZ) {
            C64214PIc.LIZ().LIZJ(this, 500L);
            return;
        }
        try {
            String str = this.s0;
            if (str != null) {
                LJJIFFI = C64246PJi.LJJII(this.s1, str, this.s2, this.s3, this.s4);
            } else {
                Throwable th = (Throwable) this.l6;
                if (th != null || ((stackTraceElementArr = (StackTraceElement[]) this.l7) != null && stackTraceElementArr.length > this.i11 + 1)) {
                    StackTraceElement[] stackTraceElementArr2 = (StackTraceElement[]) this.l7;
                    if (stackTraceElementArr2 == null) {
                        stackTraceElementArr2 = th.getStackTrace();
                    }
                    int i = this.i11;
                    StackTraceElement stackTraceElement = stackTraceElementArr2[i];
                    if (stackTraceElement != null) {
                        Throwable th2 = (Throwable) this.l6;
                        if (th2 != null) {
                            LJJII = PKW.LIZJ(th2);
                        } else {
                            LJJII = V1M.LJJII(i, stackTraceElementArr2);
                        }
                        if (!TextUtils.isEmpty(LJJII)) {
                            LJJIFFI = C64246PJi.LJJIFFI(stackTraceElement, LJJII, this.s2, this.s3, this.z10, this.s5, this.s4);
                            if (this.l8 != null) {
                                LJJIFFI.LJIIJJI("exception_line_num", null);
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            }
            V1M.LIZIZ((Map) this.l9, LJJIFFI);
            C64268PKe.LIZLLL().LIZ(CrashType.ENSURE, LJJIFFI);
            C64241PJd.LIZJ(LJJIFFI, this.l8);
            C78685UuP.LJIJJLI();
        } catch (Throwable unused) {
            C78685UuP.LJLIL();
        }
    }

    public final void LIZ$1() {
        String LJJII;
        C64246PJi LJJIFFI;
        StackTraceElement[] stackTraceElementArr;
        String LIZ;
        try {
            String str = this.s0;
            JSONArray jSONArray = null;
            if (str != null) {
                LJJIFFI = C64246PJi.LJJII(this.s1, str, this.s2, this.s3, this.s4);
            } else {
                Throwable th = (Throwable) this.l6;
                if (th != null || ((stackTraceElementArr = (StackTraceElement[]) this.l7) != null && stackTraceElementArr.length > this.i11 + 1)) {
                    StackTraceElement[] stackTraceElementArr2 = (StackTraceElement[]) this.l7;
                    if (stackTraceElementArr2 == null) {
                        stackTraceElementArr2 = th.getStackTrace();
                    }
                    int i = this.i11;
                    StackTraceElement stackTraceElement = stackTraceElementArr2[i];
                    if (stackTraceElement != null) {
                        Throwable th2 = (Throwable) this.l6;
                        if (th2 != null) {
                            LJJII = PKW.LIZJ(th2);
                        } else {
                            LJJII = V1M.LJJII(i, stackTraceElementArr2);
                        }
                        if (!TextUtils.isEmpty(LJJII)) {
                            LJJIFFI = C64246PJi.LJJIFFI(stackTraceElement, LJJII, this.s2, this.s3, this.z10, this.s5, this.s4);
                            if (this.l8 != null) {
                                LJJIFFI.LJIIJJI("exception_line_num", null);
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            }
            V1M.LIZIZ((Map) this.l9, LJJIFFI);
            C64268PKe.LIZLLL().LIZ(CrashType.ENSURE, LJJIFFI);
            String optString = LJJIFFI.LIZ.optString("message");
            if (TextUtils.isEmpty(optString)) {
                LIZ = null;
            } else {
                LIZ = PL3.LIZ(optString);
            }
            String optString2 = LJJIFFI.LIZ.optString("crash_md5");
            if (!C64250PJm.LJI().LIZLLL(optString2, LIZ)) {
                C78685UuP.LJLILLLLZI();
                return;
            }
            if (!TextUtils.isEmpty(this.s4) && PJA.LJIIIZ(this.l8, this.s4)) {
                if (!PJA.LJII(this.l8, optString)) {
                    C78685UuP.LJJJLL();
                    return;
                }
                if (!C64250PJm.LJI().LIZJ(optString2, LIZ)) {
                    C78685UuP.LJLILLLLZI();
                    return;
                }
                C78685UuP.LJJJLZIJ();
                Object obj = this.l8;
                LinkedList linkedList = new LinkedList();
                linkedList.add(LJJIFFI);
                C64268PKe.LIZLLL();
                JSONObject jSONObject = C64268PKe.LIZJ(linkedList).LIZ;
                if (obj != C64241PJd.LJI) {
                    jSONArray = PJV.LIZIZ(obj);
                }
                C64240PJc.LIZ(jSONObject, jSONArray, new C64245PJh());
                C78685UuP.LJJJLZIJ();
                C64250PJm.LJI().LJIIIZ();
            } else {
                C78685UuP.LJJJLZIJ();
            }
            C78685UuP.LJIJJLI();
        } catch (Throwable unused) {
            C78685UuP.LJLIL();
        }
    }

    public static final void run$0(ARunnableS0S6411000_11 aRunnableS0S6411000_11) {
        boolean LIZ;
        try {
            aRunnableS0S6411000_11.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S6411000_11 aRunnableS0S6411000_11) {
        boolean LIZ;
        try {
            aRunnableS0S6411000_11.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S6411000_11(Object obj, String str, String str2, String str3, String str4, Throwable th, int i) {
        this.$t = i;
        this.s0 = str;
        this.s1 = null;
        this.s2 = str2;
        this.s3 = str3;
        this.s4 = str4;
        this.l6 = th;
        this.l7 = null;
        this.i11 = 0;
        this.z10 = true;
        this.s5 = "EnsureNotReachHere";
        this.l8 = obj;
        this.l9 = null;
    }

    public ARunnableS0S6411000_11(int i, Object obj, String str, String str2, String str3, String str4, String str5, String str6, Throwable th, Map map, boolean z, StackTraceElement[] stackTraceElementArr, int i2) {
        this.$t = i2;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.s3 = str4;
        this.s4 = str5;
        this.l6 = th;
        this.l7 = stackTraceElementArr;
        this.i11 = i;
        this.z10 = z;
        this.s5 = str6;
        this.l8 = obj;
        this.l9 = map;
    }
}
