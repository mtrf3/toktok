package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C37328Eku;
import X.C66300Q0i;
import X.C76800UCe;
import X.C78862UxG;
import X.C78923UyF;
import X.FK1;
import X.InterfaceC37333Ekz;
import X.InterfaceC38189Eyn;
import X.InterfaceC88472Yns;
import X.InterfaceC88474Ynu;
import android.content.ContentResolver;
import android.net.Uri;
import com.bytedance.bpea.basics.Cert;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class AqS13S1400000_6 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS13S1400000_6 aqS13S1400000_6, Object it) {
        o.LJIIJ(it, "it");
        ((InterfaceC88474Ynu) aqS13S1400000_6.l1).invoke(aqS13S1400000_6.s0, aqS13S1400000_6.l2, (InterfaceC38189Eyn) aqS13S1400000_6.l3, (InterfaceC88472Yns) aqS13S1400000_6.l4);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS13S1400000_6 aqS13S1400000_6, Object obj) {
        JSONObject jSONObject;
        C66300Q0i c66300Q0i = (C66300Q0i) obj;
        FK1 fk1 = new FK1((ContentResolver) aqS13S1400000_6.l1, (Uri) aqS13S1400000_6.l2, aqS13S1400000_6.s0, (Cert) aqS13S1400000_6.l3);
        InterfaceC37333Ekz interfaceC37333Ekz = (InterfaceC37333Ekz) aqS13S1400000_6.l4;
        if (c66300Q0i != null) {
            jSONObject = C78923UyF.LJIIIIZZ(c66300Q0i);
        } else {
            jSONObject = null;
        }
        Object LIZ = interfaceC37333Ekz.LIZ(fk1, jSONObject);
        fk1.LIZ = false;
        return LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS13S1400000_6(ContentResolver contentResolver, Uri uri, String str, C78862UxG c78862UxG, C37328Eku c37328Eku, int i) {
        super(1);
        this.$t = i;
        this.l1 = contentResolver;
        this.l2 = uri;
        this.s0 = str;
        this.l3 = c78862UxG;
        this.l4 = c37328Eku;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS13S1400000_6(IDqS452S0100000_6 iDqS452S0100000_6, String str, Object obj, InterfaceC38189Eyn interfaceC38189Eyn, InterfaceC88472Yns interfaceC88472Yns, int i) {
        super(1);
        this.$t = i;
        this.l1 = iDqS452S0100000_6;
        this.s0 = str;
        this.l2 = obj;
        this.l3 = interfaceC38189Eyn;
        this.l4 = interfaceC88472Yns;
    }
}
