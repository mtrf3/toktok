package Y;

import X.AYY;
import X.C26045AKb;
import X.C33X;
import X.C36636EZk;
import X.C57148Mbo;
import X.C57347Mf1;
import X.C57348Mf2;
import X.C57352Mf6;
import X.C57948Moi;
import X.C57962Mow;
import X.C57970Mp4;
import X.C57982MpG;
import X.C58000MpY;
import X.C58001MpZ;
import X.C76800UCe;
import X.C77216USe;
import X.EnumC58046MqI;
import X.EnumC58928NAu;
import X.EnumC77147UPn;
import X.InterfaceC57325Mef;
import X.InterfaceC57861MnJ;
import X.InterfaceC57960Mou;
import X.InterfaceC64672gJ;
import X.InterfaceC67352kd;
import X.MIW;
import X.MJ0;
import X.MO3;
import X.MO5;
import X.MO7;
import X.MO9;
import X.OSZ;
import X.UTK;
import X.X1D;
import X.XGT;
import X.XGW;
import X.XGX;
import X.XKX;
import X.XLM;
import android.os.Bundle;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.ss.android.ugc.aweme.relation.usercard.ability.AuthCardListScopeAbility;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class IDfS24S0200000_9 implements InterfaceC64672gJ {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC64672gJ
    public final Object emit(XGX<C57352Mf6> xgx, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        switch (this.$t) {
            case 0:
                return emit$0(this, xgx, interfaceC67352kd);
            case 1:
                return emit$1(this, xgx, interfaceC67352kd);
            case 2:
                return emit$2(this, xgx, interfaceC67352kd);
            case 3:
                return emit$3(this, xgx, interfaceC67352kd);
            case 4:
                return emit$4(this, xgx, interfaceC67352kd);
            case 5:
                return emit$5(this, xgx, interfaceC67352kd);
            case 6:
                return emit$6(this, xgx, interfaceC67352kd);
            default:
                return null;
        }
    }

    public IDfS24S0200000_9(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final Object emit$0(IDfS24S0200000_9 iDfS24S0200000_9, Object obj, InterfaceC67352kd interfaceC67352kd) {
        XGX xgx = (XGX) obj;
        if (xgx instanceof XGW) {
            Object LJI = XKX.LJI(C36636EZk.LIZ, new C57347Mf1(xgx, (MIW) iDfS24S0200000_9.l0, (NewFaceStickerBean) iDfS24S0200000_9.l1, null), interfaceC67352kd);
            if (LJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
                return LJI;
            }
        } else if (xgx instanceof XGT) {
            Object LJI2 = XKX.LJI(C36636EZk.LIZ, new C57348Mf2(xgx, (MIW) iDfS24S0200000_9.l0, (NewFaceStickerBean) iDfS24S0200000_9.l1, null), interfaceC67352kd);
            if (LJI2 == EnumC58928NAu.COROUTINE_SUSPENDED) {
                return LJI2;
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object emit$1(IDfS24S0200000_9 iDfS24S0200000_9, Object obj, InterfaceC67352kd interfaceC67352kd) {
        XGX xgx = (XGX) obj;
        if (xgx instanceof XGW) {
            MusicDetail LJI = ((InterfaceC57325Mef) iDfS24S0200000_9.l0).LJI(((XGW) xgx).LJ);
            if (LJI != null) {
                ((MJ0) iDfS24S0200000_9.l1).LIZIZ(LJI);
            }
        } else if (xgx instanceof XGT) {
            ((MJ0) iDfS24S0200000_9.l1).LIZIZ(((XGT) xgx).LJFF);
        }
        return C76800UCe.LIZ;
    }

    public static final Object emit$2(IDfS24S0200000_9 iDfS24S0200000_9, Object obj, InterfaceC67352kd interfaceC67352kd) {
        XGX xgx = (XGX) obj;
        if (xgx instanceof XGW) {
            MusicDetail LJI = ((InterfaceC57325Mef) iDfS24S0200000_9.l0).LJI(((XGW) xgx).LJ);
            if (LJI != null) {
                ((MJ0) iDfS24S0200000_9.l1).LIZIZ(LJI);
            }
        } else if (xgx instanceof XGT) {
            ((MJ0) iDfS24S0200000_9.l1).LIZIZ(((XGT) xgx).LJFF);
        }
        return C76800UCe.LIZ;
    }

    public static final Object emit$3(IDfS24S0200000_9 iDfS24S0200000_9, Object obj, InterfaceC67352kd interfaceC67352kd) {
        XGX xgx = (XGX) obj;
        if (xgx instanceof XGW) {
            MusicDetail LJI = ((InterfaceC57325Mef) iDfS24S0200000_9.l0).LJI(((XGW) xgx).LJ);
            if (LJI != null) {
                ((MJ0) iDfS24S0200000_9.l1).LIZIZ(LJI);
            }
        } else if (xgx instanceof XGT) {
            ((MJ0) iDfS24S0200000_9.l1).LIZIZ(((XGT) xgx).LJFF);
        }
        return C76800UCe.LIZ;
    }

    public static final Object emit$4(IDfS24S0200000_9 iDfS24S0200000_9, Object obj, InterfaceC67352kd interfaceC67352kd) {
        EnumC58046MqI enumC58046MqI;
        boolean z;
        C57148Mbo c57148Mbo = (C57148Mbo) obj;
        if (!(((AuthCardListScopeAbility) iDfS24S0200000_9.l0).LJLJLJ.invoke().LIZ instanceof C33X)) {
            AuthCardListScopeAbility authCardListScopeAbility = (AuthCardListScopeAbility) iDfS24S0200000_9.l0;
            EnumC77147UPn enumC77147UPn = (EnumC77147UPn) iDfS24S0200000_9.l1;
            authCardListScopeAbility.getClass();
            int i = C58000MpY.LIZIZ[enumC77147UPn.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    enumC58046MqI = EnumC58046MqI.CONTACT;
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("unknown platform: ");
                    LIZ.append(enumC77147UPn);
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    LIZIZ.toString();
                    throw new IllegalStateException(LIZIZ);
                }
            } else {
                enumC58046MqI = EnumC58046MqI.FACEBOOK;
            }
            boolean z2 = UTK.LIZIZ.LJFF(enumC58046MqI).LIZ().LIZLLL;
            Bundle bundle = c57148Mbo.LIZLLL;
            if (bundle != null) {
                z = o.LJ(bundle.getString("from_myself"), ((AuthCardListScopeAbility) iDfS24S0200000_9.l0).LJLL);
            } else {
                z = false;
            }
            int i2 = C58001MpZ.LIZ[c57148Mbo.LIZ.LJLILLLLZI.ordinal()];
            if (i2 != 1) {
                if (i2 == 2 && z2) {
                    AuthCardListScopeAbility authCardListScopeAbility2 = (AuthCardListScopeAbility) iDfS24S0200000_9.l0;
                    authCardListScopeAbility2.LJ(enumC58046MqI, z, authCardListScopeAbility2.LIZJ());
                }
            } else {
                ((AuthCardListScopeAbility) iDfS24S0200000_9.l0).LIZLLL(enumC58046MqI, z2, z, true);
            }
            ((AuthCardListScopeAbility) iDfS24S0200000_9.l0).LJLLLLLL.put(enumC58046MqI, Boolean.valueOf(z2));
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object emit$5(IDfS24S0200000_9 iDfS24S0200000_9, Object obj, InterfaceC67352kd interfaceC67352kd) {
        OSZ osz = (OSZ) obj;
        C57970Mp4 c57970Mp4 = (C57970Mp4) osz.getFirst();
        C57948Moi c57948Moi = (C57948Moi) osz.getSecond();
        AYY.LIZ.getClass();
        AYY.LIZIZ("DataSource", "collect state action!");
        if (c57970Mp4.LIZ) {
            ((C57962Mow) iDfS24S0200000_9.l0).LJIL(c57970Mp4, null);
        } else {
            List<RecUser> list = c57970Mp4.LJ;
            if (!(list instanceof List) || list == null) {
                C57962Mow c57962Mow = (C57962Mow) iDfS24S0200000_9.l0;
                C57982MpG c57982MpG = C57982MpG.LJLIL;
                XLM xlm = c57962Mow.LJLJJLL;
                xlm.setValue(c57982MpG.invoke(xlm.getValue()));
            } else {
                List<InterfaceC57861MnJ> list2 = c57948Moi.LJLIL;
                long currentTimeMillis = System.currentTimeMillis();
                ((C57962Mow) iDfS24S0200000_9.l0).getClass();
                ((C57962Mow) iDfS24S0200000_9.l0).LJIL(c57970Mp4, C57962Mow.LJIIIZ(c57970Mp4, list, list2));
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("combine cost time: ");
                LIZ.append(currentTimeMillis2);
                AYY.LIZIZ("DataSource", X1D.LIZIZ(LIZ));
                InterfaceC57960Mou interfaceC57960Mou = (InterfaceC57960Mou) ((C57962Mow) iDfS24S0200000_9.l0).LJLLI.getValue();
                if (interfaceC57960Mou != null) {
                    interfaceC57960Mou.LIZLLL(currentTimeMillis2);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object emit$6(IDfS24S0200000_9 iDfS24S0200000_9, Object obj, InterfaceC67352kd interfaceC67352kd) {
        C77216USe c77216USe = (C77216USe) obj;
        if (MO9.LIZ[c77216USe.LJLILLLLZI.ordinal()] == 1) {
            if (c77216USe.LJLIL.LJLJI) {
                MO7 mo7 = ((MO3) iDfS24S0200000_9.l0).LJLIL;
                if (mo7 != null) {
                    mo7.LLIILII((MO5) iDfS24S0200000_9.l1);
                }
            } else {
                C26045AKb c26045AKb = new C26045AKb((MO3) iDfS24S0200000_9.l0);
                c26045AKb.LJIIIIZZ(R.string.hew);
                c26045AKb.LJIIJ();
            }
        }
        return C76800UCe.LIZ;
    }
}
