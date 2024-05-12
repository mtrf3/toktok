package Y;

import X.C16880lQ;
import X.C46982IcE;
import X.C47448Ijk;
import X.IZ8;
import X.InterfaceC47447Ijj;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class ARunnableS0S2112000_8 implements Runnable {
    public final int $t;
    public int i4;
    public int i5;
    public Object l2;
    public String s0;
    public String s1;
    public boolean z3;

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
        InterfaceC47447Ijj interfaceC47447Ijj = (InterfaceC47447Ijj) this.l2;
        boolean z = this.z3;
        String str = this.s0;
        int i = this.i4;
        int i2 = this.i5;
        String str2 = this.s1;
        C47448Ijk c47448Ijk = (C47448Ijk) interfaceC47447Ijj;
        c47448Ijk.getClass();
        if (IZ8.LJIIIZ()) {
            return;
        }
        C46982IcE.LIZIZ().isDebug();
        C46982IcE.LIZLLL.execute(new ARunnableS0S2112000_8(c47448Ijk, z, str, i, i2, str2, 1));
    }

    public static final void run$0(ARunnableS0S2112000_8 aRunnableS0S2112000_8) {
        boolean LIZ;
        try {
            aRunnableS0S2112000_8.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S2112000_8 aRunnableS0S2112000_8) {
        C47448Ijk c47448Ijk = (C47448Ijk) aRunnableS0S2112000_8.l2;
        boolean z = aRunnableS0S2112000_8.z3;
        String str = aRunnableS0S2112000_8.s0;
        int i = aRunnableS0S2112000_8.i4;
        int i2 = aRunnableS0S2112000_8.i5;
        String str2 = aRunnableS0S2112000_8.s1;
        c47448Ijk.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("disableAutoDiskCacheManagement", z);
            jSONObject.put("key", str);
            jSONObject.put("oldContentLength", i);
            jSONObject.put("newContentLength", i2);
            jSONObject.put("previousInfo", str2);
            c47448Ijk.LIZ.config.getPlayerCommonParamManager().LIZIZ(jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        C46982IcE.LJI().monitorCommonLog("aweme_play_content_length_not_match", jSONObject);
    }

    public ARunnableS0S2112000_8(C47448Ijk c47448Ijk, boolean z, String str, int i, int i2, String str2, int i3) {
        this.$t = i3;
        this.l2 = c47448Ijk;
        this.z3 = z;
        this.s0 = str;
        this.i4 = i;
        this.i5 = i2;
        this.s1 = str2;
    }

    public ARunnableS0S2112000_8(InterfaceC47447Ijj interfaceC47447Ijj, boolean z, String str, int i, int i2, String str2, String str3, int i3) {
        this.$t = i3;
        this.l2 = interfaceC47447Ijj;
        this.z3 = z;
        this.s0 = str;
        this.i4 = i;
        this.i5 = i2;
        this.s1 = str3;
    }
}
