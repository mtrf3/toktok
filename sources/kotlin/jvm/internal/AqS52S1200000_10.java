package kotlin.jvm.internal;

import X.ARN;
import X.AbstractC60811Ntn;
import X.AbstractC62625Ohx;
import X.AbstractC65781Prl;
import X.C109254Qn;
import X.C10K;
import X.C162476Zf;
import X.C26231ARf;
import X.C39048FUe;
import X.C58620MzY;
import X.C58684N1k;
import X.C60292NlQ;
import X.C60293NlR;
import X.C60299NlX;
import X.C60451Nnz;
import X.C60547NpX;
import X.C60549NpZ;
import X.C60606NqU;
import X.C60735NsZ;
import X.C60789NtR;
import X.C60824Nu0;
import X.C60878Nus;
import X.C61259O2l;
import X.C61295O3v;
import X.C62387Oe7;
import X.C62547Ogh;
import X.C62594OhS;
import X.C62792Oke;
import X.C63067Op5;
import X.C68322mC;
import X.C76732zl;
import X.C76800UCe;
import X.C79286V9u;
import X.EnumC39866Fkk;
import X.EnumC60881Nuv;
import X.EnumC61256O2i;
import X.InterfaceC60276NlA;
import X.InterfaceC60597NqL;
import X.InterfaceC62225ObV;
import X.InterfaceC62474OfW;
import X.InterfaceC79291V9z;
import X.InterfaceC88472Yns;
import X.N1V;
import X.O26;
import X.O28;
import X.O29;
import X.O2P;
import X.O39;
import X.OQL;
import X.QXX;
import X.V1B;
import X.VEH;
import Y.ACallableS87S0200000_10;
import android.app.Activity;
import android.net.Uri;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.internal.h;
import com.lynx.tasm.LynxViewClient;
import com.ss.android.ugc.aweme.relation.auth.widget.contact.ContactMaFWidgetVM;
import com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl;
import defpackage.i0;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class AqS52S1200000_10 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj);
            case 12:
                return invoke$12(this, obj);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj);
            default:
                return null;
        }
    }

    public final void invoke$0(C26231ARf it) {
        o.LJIIIZ(it, "it");
        if (it.LJLJL == null) {
            ((NetworkStandardUIServiceImpl) this.l2).onEvent(((C76732zl) this.l1).element, this.s0, "cancel");
        }
    }

    public final void invoke$1(ARN it) {
        o.LJIIIZ(it, "it");
        ((NetworkStandardUIServiceImpl) this.l2).onEvent(((C76732zl) this.l1).element, this.s0, "cancel");
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AqS52S1200000_10 aqS52S1200000_10, Object obj) {
        aqS52S1200000_10.invoke$0((C26231ARf) obj);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AqS52S1200000_10 aqS52S1200000_10, Object obj) {
        aqS52S1200000_10.invoke$1((ARN) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS52S1200000_10 aqS52S1200000_10, Object obj) {
        C60735NsZ c60735NsZ;
        C61295O3v it = (C61295O3v) obj;
        o.LJIIJ(it, "it");
        if (it.LJZL) {
            C60606NqU c60606NqU = (C60606NqU) aqS52S1200000_10.l1;
            if (c60606NqU != null && (c60735NsZ = c60606NqU.LJII) != null) {
                c60735NsZ.LIZ(it, aqS52S1200000_10.s0);
            }
            byte[] S = it.S();
            if (S != null) {
                ((InterfaceC60597NqL) aqS52S1200000_10.l2).LIZ(S, null);
            } else {
                ((InterfaceC60597NqL) aqS52S1200000_10.l2).LIZ(null, new Throwable("load succeeded but empty bytes"));
            }
        } else {
            ((InterfaceC60597NqL) aqS52S1200000_10.l2).LIZ(null, new Throwable(it.LL.toString()));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS52S1200000_10 aqS52S1200000_10, Object obj) {
        C60735NsZ c60735NsZ;
        C61295O3v it = (C61295O3v) obj;
        o.LJIIJ(it, "it");
        if (it.LJZL) {
            C60606NqU c60606NqU = (C60606NqU) aqS52S1200000_10.l1;
            if (c60606NqU != null && (c60735NsZ = c60606NqU.LJII) != null) {
                c60735NsZ.LJ(it, aqS52S1200000_10.s0);
            }
            byte[] S = it.S();
            if (S != null) {
                ((QXX) aqS52S1200000_10.l2).LLLILZJ(VEH.LIZ(S));
                C39048FUe.LIZIZ.LIZ("get external js resource success", EnumC39866Fkk.I, "ExternalJSProvider");
            } else {
                ((QXX) aqS52S1200000_10.l2).LLLILZJ(new VEH(-1, new Error("load succeeded but bytes empty")));
                C39048FUe.LIZIZ.LIZ("get external js resource failed: load succeeded but bytes empty", EnumC39866Fkk.E, "ExternalJSProvider");
            }
        } else {
            String c61287O3n = it.LL.toString();
            ((QXX) aqS52S1200000_10.l2).LLLILZJ(new VEH(-1, new Throwable(c61287O3n)));
            C39048FUe.LIZIZ.LIZ(i0.LJFF("get external js resource failed: ", c61287O3n), EnumC39866Fkk.E, "ExternalJSProvider");
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS52S1200000_10 aqS52S1200000_10, Object obj) {
        C60735NsZ c60735NsZ;
        O26 it = (O26) obj;
        o.LJIIJ(it, "it");
        C60606NqU c60606NqU = (C60606NqU) aqS52S1200000_10.l1;
        if (c60606NqU != null && (c60735NsZ = c60606NqU.LJII) != null) {
            c60735NsZ.LJFF(it, aqS52S1200000_10.s0);
        }
        C10K.LIZIZ(new ACallableS87S0200000_10(it, aqS52S1200000_10, 12), C10K.LJI, null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AqS52S1200000_10 aqS52S1200000_10, Object it) {
        String str;
        o.LJIIJ(it, "it");
        ((C79286V9u) ((InterfaceC79291V9z) aqS52S1200000_10.l2)).LIZ(null);
        C60292NlQ c60292NlQ = ((C60293NlR) aqS52S1200000_10.l1).LIZIZ;
        c60292NlQ.getClass();
        InterfaceC60276NlA interfaceC60276NlA = (InterfaceC60276NlA) C60299NlX.LIZ(c60292NlQ, InterfaceC60276NlA.class);
        if (interfaceC60276NlA != null) {
            C60547NpX c60547NpX = new C60547NpX("bdx_monitor_preload_image_cache_miss", null, null, 254);
            c60547NpX.LJ = aqS52S1200000_10.s0;
            JSONObject jSONObject = new JSONObject();
            C60549NpZ c60549NpZ = ((C60293NlR) aqS52S1200000_10.l1).LIZIZ.LJLLLLLL;
            if (c60549NpZ != null) {
                str = c60549NpZ.LIZ();
            } else {
                str = "unknown";
            }
            jSONObject.put("schema", str);
            c60547NpX.LJI = jSONObject;
            interfaceC60276NlA.LJ(c60547NpX);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS52S1200000_10 aqS52S1200000_10, Object obj) {
        AbstractC62625Ohx it = (AbstractC62625Ohx) obj;
        o.LJIIIZ(it, "it");
        if (C62547Ogh.LIZ(((InterfaceC62225ObV) aqS52S1200000_10.l1).key())) {
            V1B.LJLILLLLZI(((C62594OhS) aqS52S1200000_10.l2).LJLL);
        }
        C109254Qn.LIZ(aqS52S1200000_10.s0, ((InterfaceC62225ObV) aqS52S1200000_10.l1).key());
        boolean LJIIJ = ((InterfaceC62225ObV) aqS52S1200000_10.l1).LJIIJ(it, ((C62594OhS) aqS52S1200000_10.l2).LJLIL, null);
        C62594OhS c62594OhS = (C62594OhS) aqS52S1200000_10.l2;
        C62387Oe7 c62387Oe7 = c62594OhS.LJLILLLLZI;
        InterfaceC62474OfW interfaceC62474OfW = c62387Oe7.LJIILIIL;
        if (interfaceC62474OfW != null) {
            interfaceC62474OfW.LIZ((InterfaceC62225ObV) aqS52S1200000_10.l1, LJIIJ, c62387Oe7.LJIIJ, c62594OhS.LJLIL);
        }
        if (!((InterfaceC62225ObV) aqS52S1200000_10.l1).LJIILJJIL()) {
            ((C62594OhS) aqS52S1200000_10.l2).dismiss();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS52S1200000_10 aqS52S1200000_10, Object it) {
        String str;
        o.LJIIIZ(it, "it");
        String str2 = aqS52S1200000_10.s0;
        C63067Op5 c63067Op5 = (C63067Op5) aqS52S1200000_10.l1;
        Activity activity = (Activity) aqS52S1200000_10.l2;
        c63067Op5.getClass();
        if (C63067Op5.LIZ(activity)) {
            str = "live_take_popup_in_room";
        } else {
            str = "live_take_popup_out_room";
        }
        OQL.LIZ(str2, "cancel", str, true);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS52S1200000_10 aqS52S1200000_10, Object obj) {
        SparkContext it = (SparkContext) obj;
        o.LJIIIZ(it, "it");
        it.LJJI((AbstractC60811Ntn) aqS52S1200000_10.l1);
        it.LJJ(new C60451Nnz((LynxViewClient) aqS52S1200000_10.l2, aqS52S1200000_10.s0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS52S1200000_10 aqS52S1200000_10, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((ContactMaFWidgetVM) aqS52S1200000_10.l1).LJLJJI.storeLong(h.LJIIIIZZ(aqS52S1200000_10.s0), System.currentTimeMillis());
            ((ContactMaFWidgetVM) aqS52S1200000_10.l1).setState(new AqS176S0100000_10((C62792Oke) aqS52S1200000_10.l2, 150));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS52S1200000_10 aqS52S1200000_10, Object obj) {
        C58620MzY logAd = (C58620MzY) obj;
        o.LJIIIZ(logAd, "$this$logAd");
        C58684N1k.LIZ.getClass();
        logAd.LJII(C58684N1k.LJIILJJIL, Integer.valueOf(((N1V) aqS52S1200000_10.l1).LIZIZ));
        logAd.LJII(C58684N1k.LJIILL, ((N1V) aqS52S1200000_10.l1).LJII);
        logAd.LJII(C58684N1k.LJJJJL, "iab");
        logAd.LJII(C58684N1k.LJJIJIL, Integer.valueOf(((N1V) aqS52S1200000_10.l1).LJIILLIIL));
        logAd.LJII(C58684N1k.LJJLI, (Long) aqS52S1200000_10.l2);
        logAd.LJII(C58684N1k.LJJLIIIIJ, aqS52S1200000_10.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS52S1200000_10 aqS52S1200000_10, Object obj) {
        int i;
        EnumC61256O2i enumC61256O2i;
        int i2;
        O26 it = (O26) obj;
        o.LJIIIZ(it, "it");
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS52S1200000_10.l1;
        Uri parse = UriProtector.parse(aqS52S1200000_10.s0);
        o.LJIIIIZZ(parse, "parse(resUrl)");
        C61259O2l c61259O2l = new C61259O2l(parse);
        C60789NtR c60789NtR = (C60789NtR) aqS52S1200000_10.l2;
        c61259O2l.LJLILLLLZI = it.LJII;
        EnumC60881Nuv enumC60881Nuv = it.LJIIIIZZ;
        c60789NtR.getClass();
        if (enumC60881Nuv == null) {
            i = -1;
        } else {
            i = O28.LIZ[enumC60881Nuv.ordinal()];
        }
        O39 o39 = null;
        if (i != 1) {
            if (i != 2) {
                enumC61256O2i = null;
            } else {
                enumC61256O2i = EnumC61256O2i.DISK;
            }
        } else {
            enumC61256O2i = EnumC61256O2i.ASSET;
        }
        c61259O2l.LJLJI = enumC61256O2i;
        O29 o29 = it.LJIIIZ;
        if (o29 != null && (i2 = O28.LIZIZ[o29.ordinal()]) != -1) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            o39 = O39.BUILTIN;
                        } else {
                            throw new C162476Zf();
                        }
                    } else {
                        o39 = O39.CDN;
                    }
                } else {
                    o39 = O39.BUILTIN;
                }
            } else {
                o39 = O39.GECKO;
            }
        }
        c61259O2l.LJLJJI = o39;
        interfaceC88472Yns.invoke(c61259O2l);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, X.O2l] */
    public static final Object invoke$8(AqS52S1200000_10 aqS52S1200000_10, Object obj) {
        EnumC61256O2i enumC61256O2i;
        O39 o39;
        C61295O3v it = (C61295O3v) obj;
        o.LJIIIZ(it, "it");
        if (it.LJZL) {
            C68322mC c68322mC = (C68322mC) aqS52S1200000_10.l1;
            Uri parse = UriProtector.parse(aqS52S1200000_10.s0);
            o.LJIIIIZZ(parse, "parse(resUrl)");
            ?? c61259O2l = new C61259O2l(parse);
            O2P o2p = (O2P) aqS52S1200000_10.l2;
            c61259O2l.LJLILLLLZI = it.getFilePath();
            if (o.LJ(it.LLD, "builtin")) {
                enumC61256O2i = EnumC61256O2i.ASSET;
            } else {
                enumC61256O2i = EnumC61256O2i.DISK;
            }
            c61259O2l.LJLJI = enumC61256O2i;
            String str = it.LLD;
            o2p.getClass();
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 98349) {
                    if (hashCode != 98230121) {
                        if (hashCode == 230960163 && str.equals("builtin")) {
                            o39 = O39.BUILTIN;
                            c61259O2l.LJLJJI = o39;
                            c68322mC.element = c61259O2l;
                        }
                    } else if (str.equals("gecko")) {
                        o39 = O39.GECKO;
                        c61259O2l.LJLJJI = o39;
                        c68322mC.element = c61259O2l;
                    }
                } else if (str.equals("cdn")) {
                    o39 = O39.CDN;
                    c61259O2l.LJLJJI = o39;
                    c68322mC.element = c61259O2l;
                }
            }
            o39 = null;
            c61259O2l.LJLJJI = o39;
            c68322mC.element = c61259O2l;
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS52S1200000_10 aqS52S1200000_10, Object obj) {
        C60735NsZ c60735NsZ;
        O26 it = (O26) obj;
        o.LJIIJ(it, "it");
        C60606NqU c60606NqU = (C60606NqU) aqS52S1200000_10.l1;
        if (c60606NqU != null && (c60735NsZ = c60606NqU.LJII) != null) {
            c60735NsZ.LIZIZ(it, aqS52S1200000_10.s0);
        }
        C10K.LIZIZ(new ACallableS87S0200000_10(it, aqS52S1200000_10, 11), C10K.LJI, null);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS52S1200000_10(C68322mC c68322mC, C68322mC<C61259O2l> c68322mC2, String str, O2P o2p) {
        super(1);
        this.$t = o2p;
        this.l1 = c68322mC;
        this.s0 = c68322mC2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS52S1200000_10(N1V n1v, Long l, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = n1v;
        this.l2 = l;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS52S1200000_10(C60293NlR c60293NlR, C79286V9u c79286V9u, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c60293NlR;
        this.l2 = c79286V9u;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS52S1200000_10(C60606NqU c60606NqU, String str, InterfaceC60597NqL interfaceC60597NqL, int i) {
        super(1);
        this.$t = i;
        this.l1 = c60606NqU;
        this.s0 = str;
        this.l2 = interfaceC60597NqL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS52S1200000_10(C60606NqU c60606NqU, String str, QXX qxx, int i) {
        super(1);
        this.$t = i;
        this.l1 = c60606NqU;
        this.s0 = str;
        this.l2 = qxx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS52S1200000_10(C60824Nu0 c60824Nu0, C60878Nus c60878Nus, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c60824Nu0;
        this.l2 = c60878Nus;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS52S1200000_10(InterfaceC62225ObV interfaceC62225ObV, C62594OhS c62594OhS, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = interfaceC62225ObV;
        this.l2 = c62594OhS;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS52S1200000_10(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns<? super C61259O2l, C76800UCe> interfaceC88472Yns2, String str, C60789NtR c60789NtR) {
        super(1);
        this.$t = c60789NtR;
        this.l1 = interfaceC88472Yns;
        this.s0 = interfaceC88472Yns2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS52S1200000_10(ContactMaFWidgetVM contactMaFWidgetVM, String str, C62792Oke c62792Oke, int i) {
        super(1);
        this.$t = i;
        this.l1 = contactMaFWidgetVM;
        this.s0 = str;
        this.l2 = c62792Oke;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS52S1200000_10(NetworkStandardUIServiceImpl networkStandardUIServiceImpl, C76732zl c76732zl, String str, int i) {
        super(1);
        this.$t = i;
        this.l2 = networkStandardUIServiceImpl;
        this.l1 = c76732zl;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS52S1200000_10(String str, C63067Op5 c63067Op5, Activity activity, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c63067Op5;
        this.l2 = activity;
    }
}
