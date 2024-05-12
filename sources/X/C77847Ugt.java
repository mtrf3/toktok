package X;

import com.bytedance.android.live.wallet.model.LocationAddress;
import com.bytedance.android.live.wallet.model.LocationObject;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Ugt, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77847Ugt implements InterfaceC77761UfV {
    public final /* synthetic */ C77843Ugp LIZ;
    public final /* synthetic */ CompletionBlock<InterfaceC77850Ugw> LIZIZ;

    @Override // X.InterfaceC77761UfV
    public final void LJIILL(String errMsg) {
        o.LJIIIZ(errMsg, "errMsg");
        this.LIZ.getClass();
        XBaseModel LJIIL = C17N.LJIIL(InterfaceC77850Ugw.class);
        C77843Ugp c77843Ugp = this.LIZ;
        InterfaceC77850Ugw interfaceC77850Ugw = (InterfaceC77850Ugw) LJIIL;
        interfaceC77850Ugw.setStatus(2);
        c77843Ugp.getClass();
        interfaceC77850Ugw.setLocation((InterfaceC77849Ugv) C17N.LJIIL(InterfaceC77849Ugv.class));
        this.LIZIZ.onFailure(0, errMsg, interfaceC77850Ugw);
    }

    public C77847Ugt(C77843Ugp c77843Ugp, C37356ElM c37356ElM) {
        this.LIZ = c77843Ugp;
        this.LIZIZ = c37356ElM;
    }

    @Override // X.InterfaceC77761UfV
    public final void LJIILLIIL(boolean z, LocationAddress locationAddress) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("JSB RESULT: ");
        LIZ.append(locationAddress);
        C0NB.LIZIZ("USLocation", X1D.LIZIZ(LIZ));
        this.LIZ.getClass();
        XBaseModel LIZJ = ED5.LIZJ(InterfaceC77850Ugw.class, null);
        C77843Ugp c77843Ugp = this.LIZ;
        InterfaceC77850Ugw interfaceC77850Ugw = (InterfaceC77850Ugw) LIZJ;
        if (z) {
            i = 0;
        } else {
            i = 1;
        }
        interfaceC77850Ugw.setStatus(i);
        c77843Ugp.getClass();
        InterfaceC77849Ugv interfaceC77849Ugv = (InterfaceC77849Ugv) ED5.LIZJ(InterfaceC77849Ugv.class, null);
        if (z) {
            InterfaceC77854Uh0 interfaceC77854Uh0 = (InterfaceC77854Uh0) ED5.LIZJ(InterfaceC77854Uh0.class, null);
            LocationObject locationObject = locationAddress.region;
            String str15 = "";
            if (locationObject == null || (str = locationObject.name) == null) {
                str = "";
            }
            interfaceC77854Uh0.setName(str);
            LocationObject locationObject2 = locationAddress.region;
            if (locationObject2 == null || (str2 = locationObject2.asciName) == null) {
                str2 = "";
            }
            interfaceC77854Uh0.setAsciName(str2);
            interfaceC77854Uh0.setCode(locationAddress.L());
            interfaceC77849Ugv.setRegion(interfaceC77854Uh0);
            InterfaceC77855Uh1 interfaceC77855Uh1 = (InterfaceC77855Uh1) ED5.LIZJ(InterfaceC77855Uh1.class, null);
            LocationObject locationObject3 = locationAddress.state;
            if (locationObject3 == null || (str3 = locationObject3.name) == null) {
                str3 = "";
            }
            interfaceC77855Uh1.setName(str3);
            LocationObject locationObject4 = locationAddress.state;
            if (locationObject4 == null || (str4 = locationObject4.asciName) == null) {
                str4 = "";
            }
            interfaceC77855Uh1.setAsciName(str4);
            LocationObject locationObject5 = locationAddress.state;
            if (locationObject5 == null || (str5 = locationObject5.code) == null) {
                str5 = "";
            }
            interfaceC77855Uh1.setCode(str5);
            interfaceC77849Ugv.setState(interfaceC77855Uh1);
            InterfaceC77852Ugy interfaceC77852Ugy = (InterfaceC77852Ugy) ED5.LIZJ(InterfaceC77852Ugy.class, null);
            LocationObject locationObject6 = locationAddress.county;
            if (locationObject6 == null || (str6 = locationObject6.name) == null) {
                str6 = "";
            }
            interfaceC77852Ugy.setName(str6);
            LocationObject locationObject7 = locationAddress.county;
            if (locationObject7 == null || (str7 = locationObject7.asciName) == null) {
                str7 = "";
            }
            interfaceC77852Ugy.setAsciName(str7);
            LocationObject locationObject8 = locationAddress.county;
            if (locationObject8 == null || (str8 = locationObject8.code) == null) {
                str8 = "";
            }
            interfaceC77852Ugy.setCode(str8);
            interfaceC77849Ugv.setCounty(interfaceC77852Ugy);
            InterfaceC77851Ugx interfaceC77851Ugx = (InterfaceC77851Ugx) ED5.LIZJ(InterfaceC77851Ugx.class, null);
            LocationObject locationObject9 = locationAddress.city;
            if (locationObject9 == null || (str9 = locationObject9.name) == null) {
                str9 = "";
            }
            interfaceC77851Ugx.setName(str9);
            LocationObject locationObject10 = locationAddress.city;
            if (locationObject10 == null || (str10 = locationObject10.asciName) == null) {
                str10 = "";
            }
            interfaceC77851Ugx.setAsciName(str10);
            LocationObject locationObject11 = locationAddress.city;
            if (locationObject11 == null || (str11 = locationObject11.code) == null) {
                str11 = "";
            }
            interfaceC77851Ugx.setCode(str11);
            interfaceC77849Ugv.setCity(interfaceC77851Ugx);
            InterfaceC77853Ugz interfaceC77853Ugz = (InterfaceC77853Ugz) ED5.LIZJ(InterfaceC77853Ugz.class, null);
            LocationObject locationObject12 = locationAddress.province;
            if (locationObject12 == null || (str12 = locationObject12.name) == null) {
                str12 = "";
            }
            interfaceC77853Ugz.setName(str12);
            LocationObject locationObject13 = locationAddress.province;
            if (locationObject13 == null || (str13 = locationObject13.asciName) == null) {
                str13 = "";
            }
            interfaceC77853Ugz.setAsciName(str13);
            LocationObject locationObject14 = locationAddress.province;
            if (locationObject14 != null && (str14 = locationObject14.code) != null) {
                str15 = str14;
            }
            interfaceC77853Ugz.setCode(str15);
            interfaceC77849Ugv.setProvince(interfaceC77853Ugz);
        }
        interfaceC77850Ugw.setLocation(interfaceC77849Ugv);
        this.LIZIZ.onSuccess(interfaceC77850Ugw, "");
    }
}
