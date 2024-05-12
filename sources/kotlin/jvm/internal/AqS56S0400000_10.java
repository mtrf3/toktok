package kotlin.jvm.internal;

import X.ARH;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C184077Kh;
import X.C1DD;
import X.C214378bB;
import X.C214528bQ;
import X.C34K;
import X.C39973FmT;
import X.C45804HyK;
import X.C58620MzY;
import X.C58628Mzg;
import X.C58653N0f;
import X.C61224O1c;
import X.C61225O1d;
import X.C61228O1g;
import X.C61235O1n;
import X.C61237O1p;
import X.C61258O2k;
import X.C61265O2r;
import X.C61268O2u;
import X.C62216ObM;
import X.C62217ObN;
import X.C62239Obj;
import X.C62314Ocw;
import X.C62358Ode;
import X.C65352Pkq;
import X.C68322mC;
import X.C76800UCe;
import X.C78926UyI;
import X.EnumC58046MqI;
import X.EnumC60490Noc;
import X.EnumC60881Nuv;
import X.F3S;
import X.InterfaceC58626Mze;
import X.InterfaceC88472Yns;
import X.N07;
import X.NDX;
import X.O1D;
import X.O1I;
import X.O1L;
import X.O1W;
import X.O1Y;
import X.O26;
import X.O29;
import X.O2D;
import X.O2Q;
import X.ON2;
import X.OYF;
import X.OYN;
import X.P21;
import X.P2J;
import X.P2Z;
import X.Q8U;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.X1D;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.commerce.InteractiveBrandedEffectInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.relation.ffp.ui.cell.RecFriendsAuthCell;
import com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM;
import com.ss.android.ugc.aweme.relation.ffp.vm.RecFriendsVM;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class AqS56S0400000_10 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj);
            case 17:
                return invoke$17(this, obj);
            default:
                return null;
        }
    }

    public final void invoke$0(String it) {
        String str;
        o.LJIIIZ(it, "it");
        if (C62358Ode.LIZIZ(((C62239Obj) this.l0).LIZ, ((AwemeSharePackage) this.l1).itemType, 1)) {
            str = ((AwemeSharePackage) this.l1).description;
        } else {
            str = "";
        }
        ((C62239Obj) this.l0).LIZ.LJIILIIL(new C62314Ocw(OYF.LJFF(it), str, Q8U.LIZIZ(new Object[]{((AwemeSharePackage) this.l1).extras.getString("author_name")}, 1, C1DD.LIZLLL(R.string.s_z, "chaosContext().getString…tring.tiktok_email_title)"), "format(format, *args)"), null, 42), (Context) this.l2, null);
        ((InterfaceC88472Yns) this.l3).invoke(Boolean.TRUE);
    }

    public static final Object invoke$0(AqS56S0400000_10 aqS56S0400000_10, Object obj) {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sparkView = (SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) obj;
        o.LJIIIZ(sparkView, "sparkView");
        ((NDX) aqS56S0400000_10.l0).LJ(sparkView, (InteractiveBrandedEffectInfo) aqS56S0400000_10.l1, (C58628Mzg) aqS56S0400000_10.l2, (Aweme) aqS56S0400000_10.l3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS56S0400000_10 aqS56S0400000_10, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            RecFriendsAuthCell recFriendsAuthCell = (RecFriendsAuthCell) aqS56S0400000_10.l0;
            Context context = (Context) aqS56S0400000_10.l1;
            o.LJIIIIZZ(context, "context");
            recFriendsAuthCell.getClass();
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
            if (LJJIFFI != null) {
                ((FindFriendsPageVM) new C214378bB(C65352Pkq.LIZ(FindFriendsPageVM.class), P21.LJLIL, C214528bQ.LJLIL, C78926UyI.LJJII(LJJIFFI, false), C184077Kh.LJLIL, P2Z.INSTANCE, C78926UyI.LJIIJJI(LJJIFFI), C78926UyI.LJIILL(LJJIFFI)).getValue()).uh0((EnumC58046MqI) aqS56S0400000_10.l2, "click");
                ((RecFriendsVM) ((RecFriendsAuthCell) aqS56S0400000_10.l0).LJLJJL.getValue()).jv0();
                RecFriendsAuthCell recFriendsAuthCell2 = (RecFriendsAuthCell) aqS56S0400000_10.l0;
                EnumC58046MqI enumC58046MqI = (EnumC58046MqI) aqS56S0400000_10.l2;
                Context context2 = (Context) aqS56S0400000_10.l1;
                o.LJIIIIZZ(context2, "context");
                P2J p2j = (P2J) aqS56S0400000_10.l3;
                recFriendsAuthCell2.getClass();
                RecFriendsAuthCell.Q(enumC58046MqI, context2, p2j);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS56S0400000_10 aqS56S0400000_10, Object obj) {
        Throwable it = (Throwable) obj;
        o.LJIIJ(it, "it");
        JSONObject jSONObject = ((O1I) aqS56S0400000_10.l1).LIZLLL.LJII;
        if (jSONObject != null) {
            jSONObject.put("g_total", ((C61237O1p) aqS56S0400000_10.l2).LIZIZ());
        }
        JSONArray jSONArray = ((O1I) aqS56S0400000_10.l1).LJ;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("name", ((C61225O1d) aqS56S0400000_10.l0).LJLIL);
        jSONObject2.put("status", "failed");
        jSONObject2.put("detail", it.getMessage());
        jSONArray.put(jSONObject2);
        ((InterfaceC88472Yns) aqS56S0400000_10.l3).invoke(it);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS56S0400000_10 aqS56S0400000_10, Object obj) {
        ARH buttonGroup = (ARH) obj;
        o.LJIIIZ(buttonGroup, "$this$buttonGroup");
        buttonGroup.LJFF(((FeedSurvey) aqS56S0400000_10.l0).getSubmitText(), new AqS114S0300000_10((C34K) aqS56S0400000_10.l1, (ON2) aqS56S0400000_10.l2, (Context) aqS56S0400000_10.l3, 13));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS56S0400000_10 aqS56S0400000_10, Object obj) {
        String outPath = (String) obj;
        o.LJIIIZ(outPath, "outPath");
        Context context = (Context) aqS56S0400000_10.l0;
        AwemeSharePackage awemeSharePackage = (AwemeSharePackage) aqS56S0400000_10.l1;
        OYN.LIZ(context, awemeSharePackage, ((C62217ObN) aqS56S0400000_10.l2).LIZ, outPath, awemeSharePackage.LJIILLIIL(), new C62216ObM((C62217ObN) aqS56S0400000_10.l2, outPath, (Context) aqS56S0400000_10.l0));
        ((InterfaceC88472Yns) aqS56S0400000_10.l3).invoke(Boolean.TRUE);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$13(AqS56S0400000_10 aqS56S0400000_10, Object obj) {
        aqS56S0400000_10.invoke$0((String) obj);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$14(AqS56S0400000_10 aqS56S0400000_10, Object it) {
        o.LJIIJ(it, "it");
        ((C68322mC) aqS56S0400000_10.l1).element = it;
        JSONArray jSONArray = ((O26) aqS56S0400000_10.l2).LIZLLL;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", ((O2D) aqS56S0400000_10.l0).LIZ);
        jSONObject.put("status", "success");
        jSONArray.put(jSONObject);
        ((CountDownLatch) aqS56S0400000_10.l3).countDown();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS56S0400000_10 aqS56S0400000_10, Object obj) {
        File file;
        C61258O2k it = (C61258O2k) obj;
        o.LJIIJ(it, "it");
        C61265O2r LIZ = it.LIZ();
        if (LIZ != null) {
            file = LIZ.LJLJJL;
        } else {
            file = null;
        }
        if (file != null && file.exists()) {
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS56S0400000_10.l0;
            O26 o26 = (O26) aqS56S0400000_10.l1;
            o26.LJII = file.getAbsolutePath();
            o26.LJIIIIZZ = EnumC60881Nuv.DISK;
            o26.LJIIIZ = O29.CDN;
            o26.LJIIJ = LIZ.LJLJI;
            JSONArray jSONArray = o26.LIZLLL;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", "CDN");
            jSONObject.put("status", "success");
            jSONArray.put(jSONObject);
            interfaceC88472Yns.invoke(o26);
            JSONObject jSONObject2 = ((O26) aqS56S0400000_10.l1).LJIILLIIL;
            if (jSONObject2 != null) {
                jSONObject2.put("c_total", ((C61268O2u) aqS56S0400000_10.l2).LIZIZ());
            }
        } else {
            JSONObject jSONObject3 = ((O26) aqS56S0400000_10.l1).LJIILLIIL;
            if (jSONObject3 != null) {
                jSONObject3.put("c_total", ((C61268O2u) aqS56S0400000_10.l2).LIZIZ());
            }
            InterfaceC88472Yns interfaceC88472Yns2 = (InterfaceC88472Yns) aqS56S0400000_10.l3;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("[cdn] resource not found on url:");
            LIZ2.append(((O26) aqS56S0400000_10.l1).LJI);
            interfaceC88472Yns2.invoke(new FileNotFoundException(X1D.LIZIZ(LIZ2)));
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [X.O26, T] */
    public static final Object invoke$16(AqS56S0400000_10 aqS56S0400000_10, Object obj) {
        File file;
        C61258O2k it = (C61258O2k) obj;
        o.LJIIJ(it, "it");
        C61265O2r LIZ = it.LIZ();
        if (LIZ != null) {
            file = LIZ.LJLJJL;
        } else {
            file = null;
        }
        if (file != null && file.exists()) {
            C68322mC c68322mC = (C68322mC) aqS56S0400000_10.l1;
            ?? r6 = (O26) aqS56S0400000_10.l2;
            r6.LJII = file.getAbsolutePath();
            r6.LJIIIIZZ = EnumC60881Nuv.DISK;
            r6.LJIIIZ = O29.CDN;
            r6.LJIIJ = LIZ.LJLJI;
            JSONArray jSONArray = r6.LIZLLL;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", "CDN");
            jSONObject.put("status", "success");
            jSONArray.put(jSONObject);
            c68322mC.element = r6;
        }
        JSONArray jSONArray2 = ((O26) aqS56S0400000_10.l2).LIZLLL;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("name", ((O2Q) aqS56S0400000_10.l0).LIZ);
        jSONObject2.put("status", "success");
        jSONArray2.put(jSONObject2);
        ((CountDownLatch) aqS56S0400000_10.l3).countDown();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(AqS56S0400000_10 aqS56S0400000_10, Object obj) {
        ARH buttonGroup = (ARH) obj;
        o.LJIIIZ(buttonGroup, "$this$buttonGroup");
        buttonGroup.LJFF(((FeedSurvey) aqS56S0400000_10.l0).getSubmitText(), new AqS114S0300000_10((C34K) aqS56S0400000_10.l1, (ON2) aqS56S0400000_10.l2, (Context) aqS56S0400000_10.l3, 33));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS56S0400000_10 aqS56S0400000_10, Object obj) {
        Throwable it = (Throwable) obj;
        o.LJIIJ(it, "it");
        O1D o1d = (O1D) aqS56S0400000_10.l0;
        O1W o1w = (O1W) aqS56S0400000_10.l1;
        O1L o1l = (O1L) aqS56S0400000_10.l2;
        String message = it.getMessage();
        if (message == null) {
            message = "";
        }
        o1d.LJJIZ(o1w, o1l, message);
        O1D o1d2 = (O1D) aqS56S0400000_10.l0;
        String jSONArray = ((O1W) aqS56S0400000_10.l1).LJ.toString();
        o.LJFF(jSONArray, "resInfo.pipelineStatus.toString()");
        C39973FmT.LIZIZ(o1d2, jSONArray, null, null, 6);
        JSONObject jSONObject = ((O1W) aqS56S0400000_10.l1).LIZLLL.LJII;
        if (jSONObject != null) {
            jSONObject.put("m_total", ((C61237O1p) aqS56S0400000_10.l3).LIZIZ());
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS56S0400000_10 aqS56S0400000_10, Object obj) {
        C58620MzY c58620MzY = (C58620MzY) obj;
        o.LJIIIZ(c58620MzY, "$this$null");
        N07 n07 = (N07) aqS56S0400000_10.l0;
        InterfaceC58626Mze interfaceC58626Mze = (InterfaceC58626Mze) aqS56S0400000_10.l1;
        N07.LJJIIZI(c58620MzY, interfaceC58626Mze, (CommonAdData) aqS56S0400000_10.l2, n07.LJJII(interfaceC58626Mze, c58620MzY));
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS56S0400000_10.l3;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(c58620MzY);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$4(AqS56S0400000_10 aqS56S0400000_10, Object it) {
        o.LJIIJ(it, "it");
        ((C68322mC) aqS56S0400000_10.l1).element = it;
        JSONArray jSONArray = ((O1I) aqS56S0400000_10.l2).LJ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", ((O1Y) aqS56S0400000_10.l0).LJLIL);
        jSONObject.put("status", "success");
        jSONArray.put(jSONObject);
        ((CountDownLatch) aqS56S0400000_10.l3).countDown();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS56S0400000_10 aqS56S0400000_10, Object obj) {
        File file;
        C61224O1c it = (C61224O1c) obj;
        o.LJIIJ(it, "it");
        C61235O1n LIZ = it.LIZ();
        if (LIZ != null) {
            file = LIZ.LJLL;
        } else {
            file = null;
        }
        if (file != null && file.exists()) {
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS56S0400000_10.l0;
            O1I o1i = (O1I) aqS56S0400000_10.l1;
            o1i.LJI = file.getAbsolutePath();
            o1i.LJII = F3S.DISK;
            o1i.LJIIIIZZ = EnumC60490Noc.CDN;
            o1i.LJIIIZ = LIZ.LJLJLJ;
            JSONArray jSONArray = o1i.LJ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", "CDN");
            jSONObject.put("status", "success");
            jSONArray.put(jSONObject);
            interfaceC88472Yns.invoke(o1i);
            JSONObject jSONObject2 = ((O1I) aqS56S0400000_10.l1).LIZLLL.LJII;
            if (jSONObject2 != null) {
                jSONObject2.put("c_total", ((C61237O1p) aqS56S0400000_10.l2).LIZIZ());
            }
        } else {
            InterfaceC88472Yns interfaceC88472Yns2 = (InterfaceC88472Yns) aqS56S0400000_10.l3;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("[cdn] resource not found on url:");
            LIZ2.append(((O1I) aqS56S0400000_10.l1).LJFF);
            interfaceC88472Yns2.invoke(new FileNotFoundException(X1D.LIZIZ(LIZ2)));
            JSONObject jSONObject3 = ((O1I) aqS56S0400000_10.l1).LIZLLL.LJII;
            if (jSONObject3 != null) {
                jSONObject3.put("c_total", ((C61237O1p) aqS56S0400000_10.l2).LIZIZ());
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [T, X.O1I] */
    public static final Object invoke$6(AqS56S0400000_10 aqS56S0400000_10, Object obj) {
        File file;
        C61224O1c it = (C61224O1c) obj;
        o.LJIIJ(it, "it");
        C61235O1n LIZ = it.LIZ();
        if (LIZ != null) {
            file = LIZ.LJLL;
        } else {
            file = null;
        }
        if (file != null && file.exists()) {
            C68322mC c68322mC = (C68322mC) aqS56S0400000_10.l1;
            ?? r6 = (O1I) aqS56S0400000_10.l2;
            r6.LJI = file.getAbsolutePath();
            r6.LJII = F3S.DISK;
            r6.LJIIIIZZ = EnumC60490Noc.CDN;
            r6.LJIIIZ = LIZ.LJLJLJ;
            JSONArray jSONArray = r6.LJ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", "CDN");
            jSONObject.put("status", "success");
            jSONArray.put(jSONObject);
            c68322mC.element = r6;
        }
        JSONArray jSONArray2 = ((O1I) aqS56S0400000_10.l2).LJ;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("name", ((C61228O1g) aqS56S0400000_10.l0).LJLIL);
        jSONObject2.put("status", "success");
        jSONArray2.put(jSONObject2);
        ((CountDownLatch) aqS56S0400000_10.l3).countDown();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS56S0400000_10 aqS56S0400000_10, Object obj) {
        Throwable it = (Throwable) obj;
        o.LJIIJ(it, "it");
        JSONObject jSONObject = ((O1I) aqS56S0400000_10.l1).LIZLLL.LJII;
        if (jSONObject != null) {
            jSONObject.put("g_total", ((C61237O1p) aqS56S0400000_10.l2).LIZIZ());
        }
        JSONArray jSONArray = ((O1I) aqS56S0400000_10.l1).LJ;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("name", ((C61225O1d) aqS56S0400000_10.l0).LJLIL);
        jSONObject2.put("status", "failed");
        jSONObject2.put("detail", it.getMessage());
        jSONArray.put(jSONObject2);
        ((InterfaceC88472Yns) aqS56S0400000_10.l3).invoke(it);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS56S0400000_10 aqS56S0400000_10, Object obj) {
        O1I it = (O1I) obj;
        o.LJIIJ(it, "it");
        JSONObject jSONObject = it.LIZLLL.LJII;
        if (jSONObject != null) {
            jSONObject.put("g_total", ((C61237O1p) aqS56S0400000_10.l1).LIZIZ());
        }
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS56S0400000_10.l2;
        O1I o1i = (O1I) aqS56S0400000_10.l3;
        JSONArray jSONArray = o1i.LJ;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("name", ((C61225O1d) aqS56S0400000_10.l0).LJLIL);
        jSONObject2.put("status", "success");
        jSONArray.put(jSONObject2);
        interfaceC88472Yns.invoke(o1i);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS56S0400000_10 aqS56S0400000_10, Object obj) {
        Throwable it = (Throwable) obj;
        o.LJIIJ(it, "it");
        JSONObject jSONObject = ((O1I) aqS56S0400000_10.l1).LIZLLL.LJII;
        if (jSONObject != null) {
            jSONObject.put("g_total", ((C61237O1p) aqS56S0400000_10.l2).LIZIZ());
        }
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS56S0400000_10.l3;
        JSONArray jSONArray = ((O1I) aqS56S0400000_10.l1).LJ;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("name", ((C61225O1d) aqS56S0400000_10.l0).LJLIL);
        jSONObject2.put("status", "failed");
        jSONObject2.put("detail", it.getMessage());
        jSONArray.put(jSONObject2);
        interfaceC88472Yns.invoke(it);
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS56S0400000_10(X.C61237O1p r3, X.C61225O1d r4, X.O1I r5, X.InterfaceC88472Yns r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            switch(r7) {
                case 7: goto L13;
                case 8: goto L5;
                case 9: goto L13;
                case 10: goto L13;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r1.l2 = r6
            r1.l3 = r5
            r0 = 1
        Lf:
            r1.<init>(r0)
            return
        L13:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r5
            r1.l2 = r3
            r1.l3 = r6
            r0 = 1
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS56S0400000_10.<init>(X.O1p, X.O1d, X.O1I, X.Yns, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS56S0400000_10(N07 n07, C58653N0f c58653N0f, CommonAdData commonAdData, InterfaceC88472Yns interfaceC88472Yns, int i) {
        super(1);
        this.$t = i;
        this.l0 = n07;
        this.l1 = c58653N0f;
        this.l2 = commonAdData;
        this.l3 = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS56S0400000_10(NDX ndx, InteractiveBrandedEffectInfo interactiveBrandedEffectInfo, C58628Mzg c58628Mzg, Aweme aweme, int i) {
        super(1);
        this.$t = i;
        this.l0 = ndx;
        this.l1 = interactiveBrandedEffectInfo;
        this.l2 = c58628Mzg;
        this.l3 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS56S0400000_10(O1D o1d, O1W o1w, O1L o1l, C61237O1p c61237O1p, int i) {
        super(1);
        this.$t = i;
        this.l0 = o1d;
        this.l1 = o1w;
        this.l2 = o1l;
        this.l3 = c61237O1p;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS56S0400000_10(O1Y o1y, C68322mC c68322mC, O1I o1i, CountDownLatch countDownLatch, int i) {
        super(1);
        this.$t = i;
        this.l0 = o1y;
        this.l1 = c68322mC;
        this.l2 = o1i;
        this.l3 = countDownLatch;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS56S0400000_10(C61228O1g c61228O1g, C68322mC c68322mC, O1I o1i, CountDownLatch countDownLatch, int i) {
        super(1);
        this.$t = i;
        this.l0 = c61228O1g;
        this.l1 = c68322mC;
        this.l2 = o1i;
        this.l3 = countDownLatch;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS56S0400000_10(O2D o2d, C68322mC c68322mC, O26 o26, CountDownLatch countDownLatch, int i) {
        super(1);
        this.$t = i;
        this.l0 = o2d;
        this.l1 = c68322mC;
        this.l2 = o26;
        this.l3 = countDownLatch;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS56S0400000_10(O2Q o2q, C68322mC c68322mC, O26 o26, CountDownLatch countDownLatch, int i) {
        super(1);
        this.$t = i;
        this.l0 = o2q;
        this.l1 = c68322mC;
        this.l2 = o26;
        this.l3 = countDownLatch;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS56S0400000_10(C62239Obj c62239Obj, C62239Obj c62239Obj2, AwemeSharePackage awemeSharePackage, Context context, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        super(1);
        this.$t = interfaceC88472Yns;
        this.l0 = c62239Obj;
        this.l1 = c62239Obj2;
        this.l2 = awemeSharePackage;
        this.l3 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS56S0400000_10(InterfaceC88472Yns interfaceC88472Yns, O1I o1i, C61237O1p c61237O1p, InterfaceC88472Yns interfaceC88472Yns2, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC88472Yns;
        this.l1 = o1i;
        this.l2 = c61237O1p;
        this.l3 = interfaceC88472Yns2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS56S0400000_10(InterfaceC88472Yns interfaceC88472Yns, O26 o26, C61268O2u c61268O2u, InterfaceC88472Yns interfaceC88472Yns2, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC88472Yns;
        this.l1 = o26;
        this.l2 = c61268O2u;
        this.l3 = interfaceC88472Yns2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS56S0400000_10(Context context, Context context2, AwemeSharePackage awemeSharePackage, C62217ObN c62217ObN, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        super(1);
        this.$t = interfaceC88472Yns;
        this.l0 = context;
        this.l1 = context2;
        this.l2 = awemeSharePackage;
        this.l3 = c62217ObN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS56S0400000_10(FeedSurvey feedSurvey, C34K c34k, ON2 on2, Context context, int i) {
        super(1);
        this.$t = i;
        this.l0 = feedSurvey;
        this.l1 = c34k;
        this.l2 = on2;
        this.l3 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS56S0400000_10(RecFriendsAuthCell recFriendsAuthCell, Context context, EnumC58046MqI enumC58046MqI, P2J p2j, int i) {
        super(1);
        this.$t = i;
        this.l0 = recFriendsAuthCell;
        this.l1 = context;
        this.l2 = enumC58046MqI;
        this.l3 = p2j;
    }
}
