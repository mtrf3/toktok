package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C04750Gp;
import X.C0GY;
import X.C0NB;
import X.C11850dJ;
import X.C14720hw;
import X.C1JK;
import X.C23390vv;
import X.C32260ClM;
import X.C32439CoF;
import X.C32448CoO;
import X.C32449CoP;
import X.C43041mW;
import X.C75808Tp6;
import X.C75813TpB;
import X.C75814TpC;
import X.C76800UCe;
import X.C78163Ulz;
import X.C78183UmJ;
import X.C78186UmM;
import X.C78192UmS;
import X.C78195UmV;
import X.C78196UmW;
import X.C78198UmY;
import X.C79174V5m;
import X.EnumC78220Umu;
import X.InterfaceC24760y8;
import X.InterfaceC32440CoG;
import X.InterfaceC33691Tx;
import X.InterfaceC35811ar;
import X.InterfaceC78190UmQ;
import X.InterfaceC78206Umg;
import X.InterfaceC78213Umn;
import X.InterfaceC88472Yns;
import X.R2P;
import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.MatchItemAssem;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tikcast.linkmic.controller.ChangeStateReq;
import tikcast.linkmic.controller.ChangeStateResp;

/* loaded from: classes14.dex */
public class AqS17S0500000_13 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS17S0500000_13 aqS17S0500000_13, Object obj) {
        String str;
        String str2;
        C0GY result = (C0GY) obj;
        o.LJIIIZ(result, "result");
        try {
            if (((ImageModel) aqS17S0500000_13.l0) != null) {
                Map<String, C04750Gp> map = result.LIZLLL;
                if (((ItemInfo4FE) aqS17S0500000_13.l1).itemType == 1) {
                    str = "image_61";
                } else {
                    str = "image_95";
                }
                C04750Gp c04750Gp = map.get(str);
                MatchItemAssem matchItemAssem = (MatchItemAssem) aqS17S0500000_13.l2;
                Bitmap bitmap = (Bitmap) aqS17S0500000_13.l3;
                boolean z = ((ItemInfo4FE) aqS17S0500000_13.l1).isTeamMate;
                matchItemAssem.getClass();
                MatchItemAssem.R3(bitmap, c04750Gp, true, z);
                if (((ItemInfo4FE) aqS17S0500000_13.l1).itemType == 1) {
                    str2 = "image_60";
                } else {
                    str2 = "image_94";
                }
                C04750Gp c04750Gp2 = map.get(str2);
                MatchItemAssem matchItemAssem2 = (MatchItemAssem) aqS17S0500000_13.l2;
                Bitmap bitmap2 = (Bitmap) aqS17S0500000_13.l4;
                boolean z2 = ((ItemInfo4FE) aqS17S0500000_13.l1).isTeamMate;
                matchItemAssem2.getClass();
                MatchItemAssem.R3(bitmap2, c04750Gp2, false, z2);
            }
        } catch (Exception e) {
            C0NB.LJFF("MatchItemAssem", "use match item anim ", e);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS17S0500000_13 aqS17S0500000_13, Object obj) {
        long j;
        InterfaceC33691Tx Canvas = (InterfaceC33691Tx) obj;
        o.LJIIIZ(Canvas, "$this$Canvas");
        long j2 = ((C11850dJ) ((InterfaceC24760y8) aqS17S0500000_13.l0).getValue()).LIZ;
        long j3 = ((C11850dJ) ((InterfaceC24760y8) aqS17S0500000_13.l1).getValue()).LIZ;
        float f = ((C23390vv) ((InterfaceC24760y8) aqS17S0500000_13.l2).getValue()).LJLIL;
        float f2 = ((C23390vv) ((InterfaceC24760y8) aqS17S0500000_13.l3).getValue()).LJLIL;
        float floatValue = ((Number) ((InterfaceC24760y8) aqS17S0500000_13.l4).getValue()).floatValue();
        float LJJJJIZL = Canvas.LJJJJIZL(C79174V5m.LIZ);
        float LJJJJIZL2 = Canvas.LJJJJIZL(f2);
        if (Float.compare(f, 0) > 0) {
            j = 0;
            C14720hw.LIZJ(Canvas, j2, Canvas.LJJJJIZL(f), 0L, floatValue, null, 116);
        } else {
            j = 0;
            C14720hw.LIZJ(Canvas, j3, (LJJJJIZL / 2) - LJJJJIZL2, 0L, floatValue, null, 116);
        }
        float f3 = 2;
        C14720hw.LIZJ(Canvas, j2, (LJJJJIZL / f3) - (LJJJJIZL2 / f3), j, floatValue, new C43041mW(LJJJJIZL2, 0.0f, 0, 0, 30), 100);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS17S0500000_13 aqS17S0500000_13, Object obj) {
        int i;
        Throwable it = (Throwable) obj;
        o.LJIIIZ(it, "it");
        C75813TpB c75813TpB = (C75813TpB) aqS17S0500000_13.l0;
        c75813TpB.LJLIL.hn(3, new AqS58S0400000_13(c75813TpB, (ChangeStateReq) aqS17S0500000_13.l2, (C75814TpC) aqS17S0500000_13.l4, it, 9));
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS17S0500000_13.l1;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.FALSE);
        }
        int i2 = ((ChangeStateReq) aqS17S0500000_13.l2).stateType;
        R2P r2p = (R2P) aqS17S0500000_13.l3;
        if (r2p != null) {
            i = r2p.statusCode;
        } else {
            i = 0;
        }
        C75808Tp6.LIZIZ(i2, 0, i, it);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS17S0500000_13 aqS17S0500000_13, Object obj) {
        boolean z;
        InterfaceC78206Umg interfaceC78206Umg;
        C78163Ulz c78163Ulz;
        InterfaceC78206Umg c78195UmV;
        InterfaceC78206Umg interfaceC78206Umg2;
        InterfaceC32440CoG create;
        InterfaceC78206Umg interfaceC78206Umg3;
        Map result = (Map) obj;
        o.LJIIIZ(result, "result");
        if (!result.isEmpty()) {
            Iterator it = result.entrySet().iterator();
            while (it.hasNext()) {
                if (((C78183UmJ) ((Map.Entry) it.next()).getValue()).LIZ) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (z) {
            C32448CoO c32448CoO = (C32448CoO) aqS17S0500000_13.l0;
            if (c32448CoO != null && (interfaceC78206Umg3 = c32448CoO.LIZ) != null) {
                interfaceC78206Umg3.LIZIZ(EnumC78220Umu.COMBINATION);
            }
            C78192UmS c78192UmS = (C78192UmS) aqS17S0500000_13.l1;
            C32449CoP c32449CoP = (C32449CoP) aqS17S0500000_13.l2;
            C32448CoO c32448CoO2 = (C32448CoO) aqS17S0500000_13.l0;
            InterfaceC78213Umn interfaceC78213Umn = (InterfaceC78213Umn) aqS17S0500000_13.l3;
            List list = (List) aqS17S0500000_13.l4;
            c78192UmS.getClass();
            C78198UmY c78198UmY = new C78198UmY(c32448CoO2);
            C78186UmM c78186UmM = new C78186UmM(c78192UmS, c32448CoO2);
            if (c32448CoO2 != null && c32448CoO2.LIZIZ != null) {
                c78195UmV = new C78196UmW(c32448CoO2.LIZIZ, c78192UmS, interfaceC78213Umn, list, c32448CoO2);
            } else {
                c78195UmV = new C78195UmV(c78192UmS, interfaceC78213Umn, list, c32448CoO2);
            }
            InterfaceC78190UmQ interfaceC78190UmQ = (InterfaceC78190UmQ) C32260ClM.LIZ(InterfaceC78190UmQ.class);
            if (interfaceC78190UmQ == null || (create = interfaceC78190UmQ.create(c32449CoP)) == null) {
                if (c32448CoO2 != null && (interfaceC78206Umg2 = c32448CoO2.LIZ) != null) {
                    interfaceC78206Umg2.LJFF(EnumC78220Umu.COMBINATION, new C78163Ulz(-20, (String) null, 6));
                }
            } else {
                c78192UmS.LJ = create;
                C32439CoF c32439CoF = new C32439CoF();
                c32439CoF.LIZJ = c78186UmM;
                c32439CoF.LIZ = c78198UmY;
                c32439CoF.LIZIZ = c78195UmV;
                create.LIZIZ(interfaceC78213Umn, new C32448CoO(c32439CoF));
            }
        } else {
            C32448CoO c32448CoO3 = (C32448CoO) aqS17S0500000_13.l0;
            if (c32448CoO3 != null && (interfaceC78206Umg = c32448CoO3.LIZ) != null) {
                EnumC78220Umu enumC78220Umu = EnumC78220Umu.COMBINATION;
                Iterator it2 = result.entrySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        c78163Ulz = ((C78183UmJ) ((Map.Entry) it2.next()).getValue()).LIZIZ;
                        if (c78163Ulz != null) {
                            break;
                        }
                    } else {
                        c78163Ulz = new C78163Ulz(-13, "unknown", 4);
                        break;
                    }
                }
                interfaceC78206Umg.LJFF(enumC78220Umu, c78163Ulz);
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS17S0500000_13(InterfaceC24760y8 interfaceC24760y8, InterfaceC24760y8 interfaceC24760y82, C1JK c1jk, C1JK c1jk2, InterfaceC35811ar interfaceC35811ar, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC24760y8;
        this.l1 = interfaceC24760y82;
        this.l2 = c1jk;
        this.l3 = c1jk2;
        this.l4 = interfaceC35811ar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS17S0500000_13(C32448CoO c32448CoO, C32448CoO c32448CoO2, C78192UmS c78192UmS, C32449CoP c32449CoP, InterfaceC78213Umn interfaceC78213Umn, List<C32449CoP> list) {
        super(1);
        this.$t = list;
        this.l0 = c32448CoO;
        this.l1 = c32448CoO2;
        this.l2 = c78192UmS;
        this.l3 = c32449CoP;
        this.l4 = interfaceC78213Umn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS17S0500000_13(C75813TpB c75813TpB, C75813TpB c75813TpB2, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, ChangeStateReq changeStateReq, R2P<ChangeStateResp> r2p, C75814TpC c75814TpC) {
        super(1);
        this.$t = c75814TpC;
        this.l0 = c75813TpB;
        this.l1 = c75813TpB2;
        this.l2 = interfaceC88472Yns;
        this.l3 = changeStateReq;
        this.l4 = r2p;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS17S0500000_13(ImageModel imageModel, ItemInfo4FE itemInfo4FE, MatchItemAssem matchItemAssem, Bitmap bitmap, Bitmap bitmap2, int i) {
        super(1);
        this.$t = i;
        this.l0 = imageModel;
        this.l1 = itemInfo4FE;
        this.l2 = matchItemAssem;
        this.l3 = bitmap;
        this.l4 = bitmap2;
    }
}
