package X;

import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes15.dex */
public final class VMH implements VN6<VMM> {
    public final VN7<VMM> LIZ;
    public final VM9 LIZIZ;

    public final void LIZ() {
        this.LIZ.LIZIZ();
    }

    public VMH(VM9 navigation) {
        o.LJIIJ(navigation, "navigation");
        this.LIZIZ = navigation;
        this.LIZ = new VN7<>(this);
    }

    @Override // X.VN6
    public void onEventFired(VMM item) {
        String str;
        String str2;
        String LIZ;
        String LIZ2;
        String LIZ3;
        String LIZ4;
        o.LJIIJ(item, "item");
        VMB vmb = this.LIZIZ.LJZ;
        C60888Nv2 c60888Nv2 = vmb.LJLJI;
        VMF LJIILJJIL = vmb.LJIILJJIL();
        QKL qkl = this.LIZIZ.LJLZ;
        boolean z = !c60888Nv2.LIZIZ;
        item.LJFF(z, EnumC65355Pkt.SWITCH_OFF);
        if (z) {
            return;
        }
        item.LIZLLL.put("config_bid", c60888Nv2.LIZ);
        item.LIZLLL.put("jsb_bid", this.LIZIZ.LJLILLLLZI);
        VM9 vm9 = this.LIZIZ;
        item.LJFF = vm9.LJLJJI;
        LJIILJJIL.LJLJJLL = c60888Nv2.LIZLLL;
        item.LJ = LJIILJJIL;
        item.LIZIZ = vm9.LJLJI;
        if (vm9.LJIILJJIL() != null) {
            item.LJI = new C35894E6w((java.util.Map<String, ? extends Object>) qkl.LIZ);
            VMG vmg = item.LJ;
            if (vmg != null) {
                VMF vmf = (VMF) vmg;
                String str3 = vmf.LJLIL;
                if ((str3 == null || str3.length() == 0) && (LIZ = qkl.LIZ("url")) != null) {
                    item.LJ.LJLIL = LIZ;
                }
                String str4 = vmf.LJLJJI;
                if ((str4 == null || str4.length() == 0) && (LIZ2 = qkl.LIZ("native_page")) != null) {
                    item.LJ.LJLJJI = LIZ2;
                }
                if (vmf.LJLLLL.length() == 0 && (LIZ4 = qkl.LIZ("page_version")) != null) {
                    VMG vmg2 = item.LJ;
                    if (vmg2 != null) {
                        ((VMF) vmg2).LJLLLL = LIZ4;
                    } else {
                        throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.android.monitorV2.lynx.data.entity.LynxCommonData");
                    }
                }
                String str5 = vmf.LJLJI;
                if ((str5 == null || str5.length() == 0) && (LIZ3 = qkl.LIZ("container_type")) != null) {
                    item.LJ.LJLJI = LIZ3;
                }
            } else {
                throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.android.monitorV2.lynx.data.entity.LynxCommonData");
            }
        }
        if (item instanceof VM4) {
            VMW.LIZJ.LIZ(new OSZ<>(item, c60888Nv2.LIZJ));
            return;
        }
        if (!(item instanceof VM5)) {
            return;
        }
        VM5 vm5 = (VM5) item;
        C79604VMa c79604VMa = vm5.LJIIL;
        if (c79604VMa != null) {
            if (c79604VMa.LJIIIIZZ != null && (!o.LJ(s.LJZI(r0).toString(), ""))) {
                String containerId = c79604VMa.LJIIIIZZ;
                o.LJFF(containerId, "containerId");
                item.LJI = new C35894E6w((java.util.Map<String, ? extends Object>) OFI.LIZIZ(containerId));
            }
            String str6 = c79604VMa.LJIIJ;
            if (str6 == null || str6.length() == 0) {
                str = LJIILJJIL.LJLJJLL;
            } else {
                str = c79604VMa.LJIIJ;
            }
            c79604VMa.LJIIJ = str;
            String str7 = c79604VMa.LIZ;
            if (str7 == null || str7.length() == 0) {
                str2 = this.LIZIZ.LJLLI;
            } else {
                str2 = c79604VMa.LIZ;
            }
            c79604VMa.LIZ = str2;
            C77123UOp.LJJJJLL(3, "platform", c79604VMa.LJII);
        }
        VMW.LIZLLL(vm5);
    }
}
