package X;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.entry.auth.CertAuthEntry;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.google.android.gms.common.api.Status;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.feed.model.FeedSharePlayerViewModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.1GE, reason: invalid class name */
/* loaded from: classes.dex */
public class C1GE implements C0K7, InterfaceC74398THu {
    public static final C1GE LJLIL = new C1GE();

    public static void LIZ(String str) {
        if (C37138Ehq.LIZ.booleanValue()) {
            TextUtils.isEmpty(str);
        }
    }

    public static String LIZIZ(CookieManager cookieManager, String str) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(103100, "android/webkit/CookieManager", "getCookie", cookieManager, new Object[]{str}, "java.lang.String", new C65300Pk0(false, "(Ljava/lang/String;)Ljava/lang/String;", "-6366311184788606966"));
        return LIZJ.LIZ ? (String) LIZJ.LIZIZ : cookieManager.getCookie(str);
    }

    @Override // X.InterfaceC74398THu
    public void LJFF(int i, Effect effect) {
    }

    @Override // X.InterfaceC74398THu
    public void LJLIIL(Effect effect, ExceptionResult exceptionResult) {
    }

    @Override // X.InterfaceC74398THu
    public void LLILLIZIL(Effect effect) {
    }

    public static ETK LIZJ(Status status) {
        if (status.zze != null) {
            return new FXZ(status);
        }
        return new ETK(status);
    }

    public static final String LIZLLL(Emoji emoji) {
        o.LJIIIZ(emoji, "<this>");
        if (emoji.getDisplayNameLangs() != null) {
            return emoji.getDisplayNameLangs().get(Locale.ENGLISH.getLanguage());
        }
        return "";
    }

    public static final String LJ(Emoji emoji) {
        Locale locale;
        o.LJIIIZ(emoji, "<this>");
        String str = "";
        if (emoji.getStickerType() == 2) {
            return "";
        }
        String language = Locale.ENGLISH.getLanguage();
        if (Build.VERSION.SDK_INT >= 24) {
            locale = EF7.LIZIZ().getResources().getConfiguration().getLocales().get(0);
        } else {
            locale = EF7.LIZIZ().getResources().getConfiguration().locale;
        }
        if (locale != null) {
            str = locale.getLanguage();
            o.LJIIIIZZ(str, "locale!!.getLanguage()");
        }
        if (TextUtils.equals(language, str)) {
            String LIZLLL = LIZLLL(emoji);
            if (!TextUtils.isEmpty(LIZLLL)) {
                return LIZLLL;
            }
        } else if (TextUtils.isEmpty(emoji.getDisplayName())) {
            return LIZLLL(emoji);
        }
        return emoji.getDisplayName();
    }

    public static float LJIIIIZZ(NLESegment nLESegment) {
        Float valueOf;
        NLESegmentVideo LJJ = NLESegmentVideo.LJJ(nLESegment);
        if (LJJ != null) {
            valueOf = Float.valueOf(LJJ.LJIILJJIL());
        } else {
            NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(nLESegment);
            if (LIZLLL != null) {
                valueOf = Float.valueOf(LIZLLL.LJIILJJIL());
            }
            return 1.0f;
        }
        if (valueOf != null) {
            return valueOf.floatValue();
        }
        return 1.0f;
    }

    public static boolean LJIIIZ(Activity activity) {
        if ((activity instanceof ActivityC45651qj) && FeedSharePlayerViewModel.getPlayerManager((ActivityC45651qj) activity) != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIJJI(String str) {
        if (str != null && str.length() != 0) {
            String lowerCase = str.toLowerCase();
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
            if (o.LJ(lowerCase, "gif")) {
                return true;
            }
            String lowerCase2 = str.toLowerCase();
            o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase()");
            if (o.LJ(lowerCase2, "webp")) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJIIL(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public static final boolean LJIILIIL(Collection collection) {
        boolean z;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public static final N3T LJIJ(android.net.Uri uri) {
        String str = null;
        if (uri == null) {
            return null;
        }
        String uri2 = uri.toString();
        o.LJIIIIZZ(uri2, "toString()");
        String LJIJI = LJIJI(uri, uri2, "page_name");
        if (!C78685UuP.LJJJZ(LJIJI)) {
            LJIJI = null;
        }
        String LJIJI2 = LJIJI(uri, uri2, "module");
        if (!C78685UuP.LJJJZ(LJIJI2)) {
            LJIJI2 = null;
        }
        String LJIJI3 = LJIJI(uri, uri2, "ec_biz_cls");
        if (!C78685UuP.LJJJZ(LJIJI3)) {
            LJIJI3 = null;
        }
        String LJIJI4 = LJIJI(uri, uri2, "ec_biz_scene");
        if (!C78685UuP.LJJJZ(LJIJI4) || LJIJI4 == null) {
            List LJJIJLIJ = ORY.LJJIJLIJ(new String[]{LJIJI, LJIJI2, LJIJI3});
            if (!((ArrayList) LJJIJLIJ).isEmpty()) {
                str = ORZ.LLD(LJJIJLIJ, "__", null, null, null, 62);
            }
            LJIJI4 = str;
        }
        return new N3T(LJIJI4, LJIJI, LJIJI2, LJIJI3);
    }

    public static final TE2 LJIJJLI(TE1... te1Arr) {
        TE2 te2 = new TE2();
        for (TE1 te1 : te1Arr) {
            if (te1 != null) {
                ((ArrayList) te2.LIZ).add(te1);
            }
        }
        return te2;
    }

    public static final long LJJ(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        long j = -1;
        if (z) {
            return -1L;
        }
        try {
            j = CastLongProtector.parseLong(str);
            return j;
        } catch (Throwable th) {
            C4ZL.LIZJ();
            C114834f1.LIZ.LIZIZ(th);
            return j;
        }
    }

    public static final List LJJIFFI(List list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(LJJ((String) it.next())));
            }
            return arrayList;
        }
        return C61878OQg.INSTANCE;
    }

    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
    }

    public static String LJI(String str, String str2) {
        String str3;
        try {
            String LIZIZ = LIZIZ(CookieManager.getInstance(), str);
            if (!TextUtils.isEmpty(LIZIZ)) {
                for (String str4 : LIZIZ.split(";")) {
                    if (!TextUtils.isEmpty(str4)) {
                        String[] split = str4.split("=");
                        if (split.length >= 2 && (str3 = split[0]) != null && str3.trim().equalsIgnoreCase(str2)) {
                            return split[1];
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public static String LJII(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return str + str2 + "/";
    }

    public static int LJIIJ(int i, Object obj) {
        int i2;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        return (i * 37) + i2;
    }

    public static final void LJIL(HC5 stopTaskArbiter, String str) {
        o.LJIIIZ(stopTaskArbiter, "$this$stopTaskArbiter");
        C43786HGk c43786HGk = (C43786HGk) stopTaskArbiter;
        InterfaceC43792HGq interfaceC43792HGq = c43786HGk.LJ;
        if (interfaceC43792HGq != null) {
            ((C43789HGn) interfaceC43792HGq).LIZ.j0();
        }
        c43786HGk.LIZIZ = false;
        if (str != null) {
            c43786HGk.LJIIJJI.put(str, Boolean.FALSE);
        }
    }

    public static final long LJJI(String str, InterfaceC86963bA interfaceC86963bA) {
        long LJJ = LJJ(str);
        if (LJJ <= 0) {
            C63375Ou3 c63375Ou3 = new C63375Ou3();
            c63375Ou3.LIZ.LIZIZ = -100000;
            String LJFF = i0.LJFF("uid invalid: ", str);
            C63623Oy3 c63623Oy3 = c63375Ou3.LIZ;
            c63623Oy3.LIZJ = LJFF;
            interfaceC86963bA.LIZIZ(c63623Oy3);
        }
        return LJJ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if (r6 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        r13 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if (r6 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        r14 = r6.shopLink;
        r0 = r6.storeLabel;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        r15 = r0.officialLabel;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        r5 = r6.sellerDetailInfos;
        r4 = r6.ratingPercentile;
        r3 = r6.ratingStyle;
        r2 = r6.ratingShowNA;
        r1 = r6.sloganText;
        r0 = r6.sellerSellingPoint;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        return new X.C27546ArW(r8, r9, r10, r11, r12, r13, r14, r15, r22, r5, r4, r3, r2, r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r6 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        r5 = null;
        r4 = null;
        r3 = null;
        r2 = null;
        r1 = null;
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0026, code lost:
    
        r13 = r6.link;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0028, code lost:
    
        if (r13 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (r12 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C27546ArW LJJII(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r21, boolean r22) {
        /*
            java.lang.String r0 = "<this>"
            r1 = r21
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            X.ArW r7 = new X.ArW
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo r6 = r1.sellerInfo
            r15 = 0
            if (r6 == 0) goto L60
            java.lang.String r8 = r6.sellerId
            com.ss.android.ugc.aweme.ecommerce.service.vo.Image r9 = r6.avatar
        L12:
            java.lang.String r0 = ""
            if (r6 == 0) goto L1a
            java.lang.String r10 = r6.name
            if (r10 != 0) goto L1d
        L1a:
            r10 = r0
            if (r6 == 0) goto L5e
        L1d:
            java.lang.Long r11 = r6.productCount
            java.lang.String r12 = r6.rating
            if (r12 != 0) goto L26
        L23:
            r12 = r0
            if (r6 == 0) goto L2a
        L26:
            java.lang.String r13 = r6.link
            if (r13 != 0) goto L2d
        L2a:
            r13 = r0
            if (r6 == 0) goto L53
        L2d:
            java.lang.String r14 = r6.shopLink
            com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreLabel r0 = r6.storeLabel
            if (r0 == 0) goto L54
            com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel r15 = r0.officialLabel
        L35:
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerDetailInfo> r5 = r6.sellerDetailInfos
            java.lang.Integer r4 = r6.ratingPercentile
            java.lang.Integer r3 = r6.ratingStyle
            java.lang.Boolean r2 = r6.ratingShowNA
            java.lang.String r1 = r6.sloganText
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerSellingPoint r0 = r6.sellerSellingPoint
        L41:
            r16 = r22
            r21 = r1
            r22 = r0
            r20 = r2
            r19 = r3
            r18 = r4
            r17 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r7
        L53:
            r14 = r15
        L54:
            if (r6 == 0) goto L57
            goto L35
        L57:
            r5 = r15
            r4 = r15
            r3 = r15
            r2 = r15
            r1 = r15
            r0 = r15
            goto L41
        L5e:
            r11 = r15
            goto L23
        L60:
            r8 = r15
            r9 = r15
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1GE.LJJII(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct, boolean):X.ArW");
    }

    public static final String LJIJI(android.net.Uri uri, String str, String str2) {
        String obj;
        Object LIZ = C58403Mw3.LIZ(str, str2);
        if (LIZ == null || (obj = LIZ.toString()) == null) {
            return C78926UyI.LJJJJI(uri, str2);
        }
        return obj;
    }

    public static void LJIILJJIL(int i, String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            C48387Iyt c48387Iyt = C48136Iuq.LIZ;
            jSONObject.put("netWorkQuality", c48387Iyt.LIZIZ().toString());
            jSONObject.put("netWorkSpeed", (int) c48387Iyt.LIZJ());
            jSONObject.put("errorDesc", str);
            jSONObject.put("errorCode", String.valueOf(i));
            jSONObject.put("errorUrl", str2);
            jSONObject.put("from", str3);
            C8HX.LIZIZ("aweme_movie_download_log", "", jSONObject);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void LJIILL(String str, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            C48387Iyt c48387Iyt = C48136Iuq.LIZ;
            jSONObject.put("netWorkQuality", c48387Iyt.LIZIZ().toString());
            jSONObject.put("netWorkSpeed", (int) c48387Iyt.LIZJ());
            jSONObject.put("errorDesc", str3);
            jSONObject.put("errorUrl", str4);
            C8HX.LIZIZ(str, str2, jSONObject);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.2xx] */
    public static C75612xx LJIIZILJ(InterfaceC88471Ynr interfaceC88471Ynr, final InterfaceC88471Ynr interfaceC88471Ynr2, final InterfaceC88473Ynt interfaceC88473Ynt, int i) {
        final InterfaceC88471Ynr interfaceC88471Ynr3 = interfaceC88471Ynr;
        final InterfaceC88471Ynr interfaceC88471Ynr4 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if ((i & 1) != 0) {
            interfaceC88471Ynr3 = null;
        }
        if ((i & 8) != 0) {
            interfaceC88471Ynr2 = null;
        }
        if ((i & 16) != 0) {
            interfaceC88473Ynt = null;
        }
        final Object[] objArr3 = objArr2 == true ? 1 : 0;
        final Object[] objArr4 = objArr == true ? 1 : 0;
        return new InterfaceC92803ka() { // from class: X.2xx
            @Override // X.InterfaceC92793kZ
            public final void LIZ(C63120Opw c63120Opw, List<? extends C109544Rq> list) {
                InterfaceC88471Ynr<C63120Opw, List<? extends C109544Rq>, C76800UCe> interfaceC88471Ynr5 = interfaceC88471Ynr4;
                if (interfaceC88471Ynr5 != null) {
                    interfaceC88471Ynr5.invoke(c63120Opw, list);
                }
            }

            @Override // X.InterfaceC92803ka
            public final void LIZIZ(C63120Opw c63120Opw, C109544Rq c109544Rq) {
                InterfaceC88471Ynr<C63120Opw, C109544Rq, C76800UCe> interfaceC88471Ynr5 = objArr3;
                if (interfaceC88471Ynr5 != null) {
                    interfaceC88471Ynr5.invoke(c63120Opw, c109544Rq);
                }
            }

            @Override // X.InterfaceC92793kZ
            public final void LIZJ(C63120Opw c63120Opw, C109544Rq c109544Rq) {
                InterfaceC88471Ynr<C63120Opw, C109544Rq, C76800UCe> interfaceC88471Ynr5 = interfaceC88471Ynr3;
                if (interfaceC88471Ynr5 != null) {
                    interfaceC88471Ynr5.invoke(c63120Opw, c109544Rq);
                }
            }

            @Override // X.InterfaceC92803ka
            public final void LJFF(C63120Opw c63120Opw, C109544Rq c109544Rq) {
                InterfaceC88471Ynr<C63120Opw, C109544Rq, C76800UCe> interfaceC88471Ynr5 = interfaceC88471Ynr2;
                if (interfaceC88471Ynr5 != null) {
                    interfaceC88471Ynr5.invoke(c63120Opw, c109544Rq);
                }
            }

            @Override // X.InterfaceC92803ka
            public final void LIZLLL(C63120Opw c63120Opw, List<C109544Rq> list, java.util.Map<C109544Rq, C63623Oy3> map) {
                InterfaceC88473Ynt<C63120Opw, List<? extends C109544Rq>, java.util.Map<C109544Rq, ? extends C63623Oy3>, C76800UCe> interfaceC88473Ynt2 = objArr4;
                if (interfaceC88473Ynt2 != null) {
                    interfaceC88473Ynt2.invoke(c63120Opw, list, map);
                }
            }

            @Override // X.InterfaceC92803ka
            public final void LJ(C63120Opw c63120Opw, C109544Rq c109544Rq, C63623Oy3 c63623Oy3) {
                InterfaceC88473Ynt<C63120Opw, C109544Rq, C63623Oy3, C76800UCe> interfaceC88473Ynt2 = interfaceC88473Ynt;
                if (interfaceC88473Ynt2 != null) {
                    interfaceC88473Ynt2.invoke(c63120Opw, c109544Rq, c63623Oy3);
                }
            }
        };
    }

    public static final C66531Q9f LJIJJ(Cert cert, String str, String str2, InterfaceC65784Pro execute) {
        o.LJIIIZ(execute, "execute");
        try {
            CertAuthEntry.Companion.checkSDKCert(cert, null, str, str2);
            return (C66531Q9f) execute.invoke();
        } catch (Q0C unused) {
            return new C66531Q9f(1002, "BPEA check cert failed", null);
        }
    }
}
