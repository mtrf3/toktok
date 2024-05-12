package X;

import android.webkit.WebView;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VMN implements VN6<VMM> {
    public final VML LIZ;

    public VMN(VML navigationDataManager) {
        o.LJIIJ(navigationDataManager, "navigationDataManager");
        this.LIZ = navigationDataManager;
    }

    public final void LIZ(VMM vmm) {
        String str;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        C60601NqP c60601NqP = this.LIZ.LJIJ.LIZIZ;
        if (c60601NqP != null && (jSONObject2 = c60601NqP.LJIIIIZZ) != null) {
            C77123UOp.LJJIJLIJ(vmm.LJ.LJLJL, jSONObject2);
        }
        C60601NqP c60601NqP2 = this.LIZ.LJIJ.LIZIZ;
        if (c60601NqP2 != null && (jSONObject = c60601NqP2.LJIIIZ) != null) {
            vmm.LIZLLL(jSONObject, "context_for_tea");
        }
        VMG vmg = vmm.LJ;
        C60601NqP c60601NqP3 = this.LIZ.LJIJ.LIZIZ;
        if (c60601NqP3 != null) {
            str = c60601NqP3.LJI;
        } else {
            str = null;
        }
        vmg.LJLJJLL = str;
    }

    @Override // X.VN6
    public void onEventFired(VMM item) {
        String str;
        JSONObject jSONObject;
        C35894E6w c35894E6w;
        C79604VMa c79604VMa;
        String str2;
        String str3;
        InterfaceC79582VLe interfaceC79582VLe;
        o.LJIIJ(item, "item");
        String str4 = null;
        if (item instanceof VM4) {
            C79616VMm.LIZ(null, this.LIZ.LJIJ.LIZLLL(), item.LJ);
            VML vml = this.LIZ;
            item.LJI = vml.LJFF;
            item.LJFF = C77123UOp.LJJIJLIJ(item.LJFF, vml.LIZLLL);
            item.LIZLLL.put("jsb_bid", this.LIZ.LIZJ);
            java.util.Map<String, Object> map = item.LIZLLL;
            C60601NqP c60601NqP = this.LIZ.LJIJ.LIZIZ;
            if (c60601NqP != null) {
                str3 = c60601NqP.LJFF;
            } else {
                str3 = null;
            }
            map.put("config_bid", str3);
            item.LIZIZ = this.LIZ.LJIJ.LJIILJJIL;
            LIZ(item);
            C60601NqP c60601NqP2 = this.LIZ.LJIJ.LIZIZ;
            if (c60601NqP2 != null) {
                interfaceC79582VLe = c60601NqP2.LIZJ;
            } else {
                interfaceC79582VLe = null;
            }
            VMW.LIZJ.LIZ(new OSZ<>(item, interfaceC79582VLe));
        }
        if (item instanceof VM5) {
            VM5 vm5 = (VM5) item;
            VML vml2 = this.LIZ;
            C60601NqP c60601NqP3 = vml2.LJIJ.LIZIZ;
            if (c60601NqP3 != null) {
                str = c60601NqP3.LJI;
            } else {
                str = null;
            }
            String str5 = vml2.LIZ;
            C79604VMa c79604VMa2 = vm5.LJIIL;
            if (c79604VMa2 != null) {
                jSONObject = c79604VMa2.LJII;
            } else {
                jSONObject = null;
            }
            JSONObject jSONObject2 = vml2.LIZLLL;
            C77123UOp.LJJJJZI("virtual_aid", str, jSONObject);
            C77123UOp.LJJJJLL(0, "platform", jSONObject);
            C79616VMm.LIZ(null, this.LIZ.LJIJ.LIZLLL(), this.LIZ.LJ);
            VML vml3 = this.LIZ;
            VMT vmt = vml3.LJ;
            WebView LIZLLL = vml3.LJIJ.LIZLLL();
            if (LIZLLL != null) {
                c35894E6w = OFI.LJFF(LIZLLL);
            } else {
                c35894E6w = null;
            }
            C79604VMa c79604VMa3 = vm5.LJIIL;
            if ((c79604VMa3 == null || (str2 = c79604VMa3.LIZ) == null || str2.length() == 0) && (c79604VMa = vm5.LJIIL) != null) {
                c79604VMa.LIZ = str5;
            }
            vm5.LJFF = jSONObject2;
            vm5.LJ(vmt);
            vm5.LJI = c35894E6w;
            vm5.LIZLLL.put("jsb_bid", this.LIZ.LIZJ);
            java.util.Map<String, Object> map2 = vm5.LIZLLL;
            C60601NqP c60601NqP4 = this.LIZ.LJIJ.LIZIZ;
            if (c60601NqP4 != null) {
                str4 = c60601NqP4.LJFF;
            }
            map2.put("config_bid", str4);
            vm5.LIZIZ = this.LIZ.LJIJ.LJIILJJIL;
            LIZ(vm5);
            VMW.LIZLLL(vm5);
        }
    }
}
