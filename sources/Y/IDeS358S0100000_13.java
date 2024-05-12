package Y;

import X.ActivityC45651qj;
import X.C78614UtG;
import X.EnumC78615UtH;
import X.InterfaceC37146Ehy;
import X.InterfaceC65784Pro;
import X.InterfaceC78482Ur8;
import X.InterfaceC78617UtJ;
import X.InterfaceC78992UzM;
import X.InterfaceC88472Yns;
import X.R47;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class IDeS358S0100000_13 implements R47 {
    public final int $t;
    public Object l0;

    @Override // X.R47
    public final void onResult(int i, int i2, Object obj) {
        switch (this.$t) {
            case 0:
                onResult$0(this, i, i2, obj);
                return;
            case 1:
                onResult$1(this, i, i2, obj);
                return;
            case 2:
                onResult$2(this, i, i2, obj);
                return;
            case 3:
                onResult$3(this, i, i2, obj);
                return;
            case 4:
                onResult$4(this, i, i2, obj);
                return;
            case 5:
                onResult$5(this, i, i2, obj);
                return;
            case 6:
                onResult$6(this, i, i2, obj);
                return;
            case 7:
                onResult$7(this, i, i2, obj);
                return;
            case 8:
                onResult$8(this, i, i2, obj);
                return;
            case 9:
                onResult$9(this, i, i2, obj);
                return;
            default:
                return;
        }
    }

    public IDeS358S0100000_13(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onResult$0(IDeS358S0100000_13 iDeS358S0100000_13, int i, int i2, Object obj) {
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) iDeS358S0100000_13.l0;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Integer.valueOf(i2));
        }
    }

    public static final void onResult$1(IDeS358S0100000_13 iDeS358S0100000_13, int i, int i2, Object obj) {
        InterfaceC78992UzM interfaceC78992UzM = (InterfaceC78992UzM) iDeS358S0100000_13.l0;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                interfaceC78992UzM.onFailed();
                return;
            }
            interfaceC78992UzM.onCancel();
            return;
        }
        interfaceC78992UzM.onSuccess();
    }

    public static final void onResult$2(IDeS358S0100000_13 iDeS358S0100000_13, int i, int i2, Object obj) {
        if (i == 1 && i2 == 1) {
            ((InterfaceC65784Pro) iDeS358S0100000_13.l0).invoke();
        }
    }

    public static final void onResult$3(IDeS358S0100000_13 iDeS358S0100000_13, int i, int i2, Object obj) {
        InterfaceC78482Ur8 interfaceC78482Ur8 = (InterfaceC78482Ur8) iDeS358S0100000_13.l0;
        if (interfaceC78482Ur8 != null) {
            interfaceC78482Ur8.LIZ();
        }
    }

    public static final void onResult$4(IDeS358S0100000_13 iDeS358S0100000_13, int i, int i2, Object obj) {
        if (i2 != 1) {
            C78614UtG c78614UtG = (C78614UtG) iDeS358S0100000_13.l0;
            c78614UtG.getClass();
            InterfaceC78617UtJ interfaceC78617UtJ = c78614UtG.LIZ;
            if (interfaceC78617UtJ != null) {
                interfaceC78617UtJ.onFail();
            }
            c78614UtG.LIZ = null;
            return;
        }
        C78614UtG c78614UtG2 = (C78614UtG) iDeS358S0100000_13.l0;
        EnumC78615UtH enumC78615UtH = EnumC78615UtH.LOGGEDIN;
        c78614UtG2.getClass();
        if (enumC78615UtH == EnumC78615UtH.CANCELLED) {
            InterfaceC78617UtJ interfaceC78617UtJ2 = c78614UtG2.LIZ;
            if (interfaceC78617UtJ2 != null) {
                interfaceC78617UtJ2.onFail();
            }
        } else {
            InterfaceC78617UtJ interfaceC78617UtJ3 = c78614UtG2.LIZ;
            if (interfaceC78617UtJ3 != null) {
                interfaceC78617UtJ3.onSuccess();
            }
        }
        c78614UtG2.LIZ = null;
    }

    public static final void onResult$5(IDeS358S0100000_13 iDeS358S0100000_13, int i, int i2, Object obj) {
        if (i == 1 && i2 == 1) {
            ((ActivityC45651qj) iDeS358S0100000_13.l0).finish();
        }
    }

    public static final void onResult$6(IDeS358S0100000_13 iDeS358S0100000_13, int i, int i2, Object obj) {
        if (i2 == 1) {
            InterfaceC37146Ehy interfaceC37146Ehy = (InterfaceC37146Ehy) iDeS358S0100000_13.l0;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("statusCode", 0);
            interfaceC37146Ehy.onSuccess(jSONObject);
            return;
        }
        ((InterfaceC37146Ehy) iDeS358S0100000_13.l0).LIZ(0, "verify failed");
    }

    public static final void onResult$7(IDeS358S0100000_13 iDeS358S0100000_13, int i, int i2, Object obj) {
        if (i2 == 1) {
            InterfaceC37146Ehy interfaceC37146Ehy = (InterfaceC37146Ehy) iDeS358S0100000_13.l0;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("statusCode", 0);
            interfaceC37146Ehy.onSuccess(jSONObject);
            return;
        }
        ((InterfaceC37146Ehy) iDeS358S0100000_13.l0).LIZ(0, "verify failed");
    }

    public static final void onResult$8(IDeS358S0100000_13 iDeS358S0100000_13, int i, int i2, Object obj) {
        if (i2 == 1) {
            InterfaceC37146Ehy interfaceC37146Ehy = (InterfaceC37146Ehy) iDeS358S0100000_13.l0;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("statusCode", 0);
            interfaceC37146Ehy.onSuccess(jSONObject);
            return;
        }
        ((InterfaceC37146Ehy) iDeS358S0100000_13.l0).LIZ(0, "verify failed");
    }

    public static final void onResult$9(IDeS358S0100000_13 iDeS358S0100000_13, int i, int i2, Object obj) {
        if (i2 == 1) {
            InterfaceC37146Ehy interfaceC37146Ehy = (InterfaceC37146Ehy) iDeS358S0100000_13.l0;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("statusCode", 0);
            interfaceC37146Ehy.onSuccess(jSONObject);
            return;
        }
        ((InterfaceC37146Ehy) iDeS358S0100000_13.l0).LIZ(0, "verify failed");
    }
}
