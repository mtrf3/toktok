package X;

import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.WEg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81950WEg extends C1CZ {
    public final /* synthetic */ C81947WEd LJLIL;

    public C81950WEg(C81947WEd c81947WEd) {
        this.LJLIL = c81947WEd;
    }

    @Override // X.C1CZ, X.C0C3
    public final void onPageSelected(int i) {
        C80841Vo5 c80841Vo5;
        try {
            JSONObject jSONObject = new JSONObject();
            C80841Vo5 c80841Vo52 = this.LJLIL.LJLILLLLZI;
            if (c80841Vo52 != null) {
                jSONObject.put("position", c80841Vo52.getCurrentItem());
            }
            jSONObject.put("identity", this.LJLIL.LJLJJI.LJI);
            jSONObject.put("from", this.LJLIL.LJLJJI.LJII);
            jSONObject.put("type", 0);
            EventCenter.LJ().LIZ("ec_gallery_new_image_viewed", jSONObject.toString());
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        C81947WEd c81947WEd = this.LJLIL;
        C81949WEf c81949WEf = c81947WEd.LJLJJI;
        int i2 = c81949WEf.LJIJJ;
        int i3 = 1;
        if (i == i2) {
            c81947WEd.LIZIZ(i - 1);
            return;
        }
        c81949WEf.LIZ = i % i2;
        if (!c81949WEf.LJ) {
            while (true) {
                C81947WEd c81947WEd2 = this.LJLIL;
                if (i3 > c81947WEd2.LJLJLLL) {
                    break;
                }
                c81947WEd2.LJFF(i, i3);
                i3++;
            }
        } else {
            c81947WEd.LJFF(i, 0);
        }
        C81947WEd c81947WEd3 = this.LJLIL;
        InterfaceC81959WEp interfaceC81959WEp = c81947WEd3.LJLJJI.LJIJ;
        if (interfaceC81959WEp == null || (c80841Vo5 = c81947WEd3.LJLILLLLZI) == null) {
            return;
        }
        interfaceC81959WEp.LIZ(c80841Vo5.getCurrentItem());
    }
}
