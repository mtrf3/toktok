package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Looper;
import android.os.Process;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.keva.Keva;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.services.apm.api.IEnsure;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.google.gson.Gson;
import com.google.gson.e;
import com.google.gson.m;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentLayoutModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShippingModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShippingServiceModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpShipping;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingTOAddressInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Specification;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PreOrderInfo;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.message.template.card.InteractiveNoticeTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.settings.AuthCardFreqParams;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.social.model.MAFIMUser;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.UzD, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78983UzD implements InterfaceC48038ItG, InterfaceC81841WAb, InterfaceC73592SuS {
    public static Gson LJLIL;
    public static long LJLILLLLZI;
    public static String LJLJI;
    public static String LJLJJI;
    public static String LJLJJL;
    public static String LJLJJLL;
    public static String LJLJL;
    public static String LJLJLJ;
    public static String LJLJLLL;
    public static String LJLL;
    public static String LJLLILLLL;
    public static Looper LJLLJ;
    public static boolean LJLLL;
    public static IEnsure LJLLLL;
    public static AbstractC39537FfR LJLLLLLL;
    public static long LJZ;
    public static String LJZI;
    public static final C78983UzD LJLLI = new C78983UzD();
    public static final C78983UzD LJLZ = new C78983UzD();

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0030, code lost:
    
        if (r2 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJJIJIIJIL() {
        /*
            r3 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2f
            java.io.FileReader r1 = new java.io.FileReader     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2f
            java.lang.String r0 = "/proc/self/cmdline"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2f
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2f
            java.lang.String r1 = r2.readLine()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L30
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L30
            if (r0 != 0) goto L32
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L30
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L30
            if (r0 != 0) goto L32
            r2.close()     // Catch: java.lang.Exception -> L24
        L24:
            return r1
        L25:
            r0 = move-exception
            r3 = r2
            goto L29
        L28:
            r0 = move-exception
        L29:
            if (r3 == 0) goto L2e
            r3.close()     // Catch: java.lang.Exception -> L2e
        L2e:
            throw r0
        L2f:
            r2 = r3
        L30:
            if (r2 == 0) goto L35
        L32:
            r2.close()     // Catch: java.lang.Exception -> L35
        L35:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78983UzD.LJJIJIIJIL():java.lang.String");
    }

    public static final String LJJLIIIJ(int i) {
        return i != 1 ? i != 2 ? "" : "movie" : "book";
    }

    public void LIZ(AnimatedDrawable2 animatedDrawable2) {
    }

    public void LIZIZ(AnimatedDrawable2 animatedDrawable2) {
    }

    public void LIZJ(AnimatedDrawable2 animatedDrawable2) {
    }

    public void LIZLLL(AnimatedDrawable2 animatedDrawable2, int i) {
    }

    public static void LJIILJJIL() {
        IEnsure iEnsure;
        if (!InterfaceC35206Drm.LIZ || (iEnsure = LJLLLL) == null) {
            return;
        }
        iEnsure.ensureNotReachHere();
    }

    public static String LJJIJL() {
        String str = LJLJI;
        if (str != null) {
            for (char c : str.toCharArray()) {
                if (Character.isDigit(c)) {
                }
            }
            return LJLJI;
        }
        return "";
    }

    public static synchronized Gson LJJL() {
        Gson gson;
        synchronized (C78983UzD.class) {
            if (LJLIL == null) {
                e eVar = new e();
                eVar.LJIIL = false;
                LJLIL = eVar.LIZ();
            }
            gson = LJLIL;
        }
        return gson;
    }

    public static final String LJJII() {
        String curUserId = HG3.LJIILL().getCurUserId();
        if (curUserId == null) {
            return "";
        }
        return curUserId;
    }

    public static String LJJIIZI() {
        return LJLJJI;
    }

    public static String LJJIJ() {
        return LJLJJL;
    }

    public static C38281F0r LJI(String str) {
        String LIZIZ;
        boolean z;
        C38281F0r c38281F0r = new C38281F0r(str);
        long currentTimeMillis = System.currentTimeMillis();
        if (((Boolean) C34656Diu.LJI.getValue()).booleanValue()) {
            if (currentTimeMillis - LJZ > 3000) {
                LJZI = QJY.LIZIZ("https://temp?", true).substring(13);
                LJZ = currentTimeMillis;
                z = false;
            } else {
                z = true;
            }
            StringBuilder sb = new StringBuilder(c38281F0r.LJ());
            if (str.indexOf(63) < 0) {
                sb.append("?");
            } else {
                sb.append("&");
            }
            sb.append(LJZI);
            LIZIZ = sb.toString();
            if (z) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("_rticket=");
                LIZ.append(currentTimeMillis);
                LIZIZ = LIZIZ.replaceFirst("_rticket=[^&]*", X1D.LIZIZ(LIZ));
            }
        } else {
            LIZIZ = QJY.LIZIZ(c38281F0r.LJ(), true);
        }
        C38281F0r c38281F0r2 = new C38281F0r(LIZIZ);
        try {
            if (AV1.LJIIJJI()) {
                if (LIZIZ.contains("openudid") || LIZIZ.contains("uoo")) {
                    String[] split = LIZIZ.substring(LIZIZ.indexOf("?") + 1).split("&");
                    for (String str2 : split) {
                        if (!str2.contains("openudid") && !str2.contains("uoo") && str2.contains("=") && !str.contains(str2.substring(0, str2.indexOf("=")))) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append(str);
                            LIZ2.append("&");
                            LIZ2.append(str2);
                            str = X1D.LIZIZ(LIZ2);
                        }
                    }
                    return new C38281F0r(str);
                }
                return c38281F0r2;
            }
            return c38281F0r2;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return c38281F0r2;
        }
    }

    public static final JSONArray LJIIIIZZ(HGN hgn) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = ((ArrayList) hgn.LIZ).iterator();
        while (it.hasNext()) {
            HGA hga = (HGA) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("aweme_id", hga.LIZ);
            jSONObject.put("video_id", hga.LIZLLL);
            jSONObject.put("vframe_uri", hga.LJ);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public static final C58958NBy LJIIJ(C58977NCr c58977NCr) {
        C58958NBy c58958NBy = new C58958NBy(-1.0d, -1.0d);
        C58958NBy LJII = c58977NCr.LJLJI.LJII(c58977NCr.LJLIL.getSlotID());
        if (LJII == null) {
            return c58958NBy;
        }
        AnoleComponentLayoutModel layout = c58977NCr.LJLIL.getLayout();
        if (layout == null) {
            return c58958NBy;
        }
        double d = LJII.LJLIL;
        double d2 = LJII.LJLILLLLZI;
        if (!ND8.LIZJ(d)) {
            if (!ND8.LIZIZ(layout.getLeft())) {
                d -= layout.getLeft();
            }
            if (!ND8.LIZIZ(layout.getRight())) {
                d -= layout.getRight();
            }
        }
        if (!ND8.LIZJ(LJII.LJLILLLLZI)) {
            if (!ND8.LIZIZ(layout.getTop())) {
                d2 -= layout.getTop();
            }
            if (!ND8.LIZIZ(layout.getBottom())) {
                d2 -= layout.getBottom();
            }
        }
        return new C58958NBy(d, d2);
    }

    public static final void LJIILIIL(C28507BGt c28507BGt) {
        c28507BGt.LIZJ = R.style.aca;
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJ = -1;
        c28507BGt.LJIILIIL = 3;
        c28507BGt.LJI = 0.0f;
    }

    public static void LJIILL(String str) {
        IEnsure iEnsure;
        if (!InterfaceC35206Drm.LIZ || (iEnsure = LJLLLL) == null) {
            return;
        }
        iEnsure.ensureNotReachHere(str);
    }

    public static void LJIIZILJ(Throwable th) {
        IEnsure iEnsure;
        if (!InterfaceC35206Drm.LIZ || (iEnsure = LJLLLL) == null) {
            return;
        }
        iEnsure.ensureNotReachHere(th);
    }

    public static final String LJIJJ(String str) {
        o.LJIIIZ(str, "<this>");
        String separator = File.separator;
        o.LJIIIIZZ(separator, "separator");
        if (ujb.o.LJJJJ(str, separator, false)) {
            return str;
        }
        return i0.LJFF(str, separator);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0088 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJIJJLI(java.lang.String r1) {
        /*
            if (r1 == 0) goto L9
            int r0 = r1.hashCode()
            switch(r0) {
                case -2038712857: goto L77;
                case -859561879: goto L6e;
                case -659357102: goto L65;
                case -539301789: goto L5c;
                case -539219087: goto L53;
                case -271543254: goto L4a;
                case 3492908: goto L41;
                case 115324673: goto L80;
                case 422185195: goto L38;
                case 506361563: goto L2f;
                case 1155679910: goto L26;
                case 1198625574: goto L1d;
                case 1778207506: goto L14;
                case 2108160551: goto Lb;
                default: goto L9;
            }
        L9:
            r0 = 0
        La:
            return r0
        Lb:
            java.lang.String r0 = "search_enter_position"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L88
            goto L9
        L14:
            java.lang.String r0 = "search_id"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L88
            goto L9
        L1d:
            java.lang.String r0 = "list_item_id"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L88
            goto L9
        L26:
            java.lang.String r0 = "search_result_id"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L88
            goto L9
        L2f:
            java.lang.String r0 = "group_id"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L88
            goto L9
        L38:
            java.lang.String r0 = "process_id"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L88
            goto L9
        L41:
            java.lang.String r0 = "rank"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L88
            goto L9
        L4a:
            java.lang.String r0 = "is_search_scene"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L88
            goto L9
        L53:
            java.lang.String r0 = "search_type"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L88
            goto L9
        L5c:
            java.lang.String r0 = "search_rank"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L88
            goto L9
        L65:
            java.lang.String r0 = "search_keyword"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L88
            goto L9
        L6e:
            java.lang.String r0 = "inner_search_id"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L88
            goto L9
        L77:
            java.lang.String r0 = "last_from_group_id"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L88
            goto L9
        L80:
            java.lang.String r0 = "is_inner"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9
        L88:
            r0 = 1
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78983UzD.LJIJJLI(java.lang.String):boolean");
    }

    public static String LJJ(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("aweme/v1/play")) {
            return str;
        }
        return LJI(str).LJ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x001e, code lost:
    
        if (r3 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.EnumC199997t5 LJJIII(com.ss.android.ugc.aweme.profile.model.User r3) {
        /*
            r2 = 1
            if (r3 == 0) goto L26
            int r0 = r3.getFollowerStatus()
            if (r0 != r2) goto L1c
            r0 = 1
        La:
            r1 = 4
            if (r0 == 0) goto L1e
            int r0 = r3.getFollowStatus()
            if (r0 == 0) goto L20
            int r0 = r3.getFollowStatus()
            if (r0 == r1) goto L20
            X.7t5 r0 = X.EnumC199997t5.MUTUAL
        L1b:
            return r0
        L1c:
            r0 = 0
            goto La
        L1e:
            if (r3 == 0) goto L26
        L20:
            int r0 = r3.getFollowerStatus()
            if (r0 != r2) goto L29
        L26:
            X.7t5 r0 = X.EnumC199997t5.SINGLE
            goto L1b
        L29:
            int r0 = r3.getFollowStatus()
            if (r0 != 0) goto L32
        L2f:
            X.7t5 r0 = X.EnumC199997t5.NO_RELATION
            goto L1b
        L32:
            int r0 = r3.getFollowStatus()
            if (r0 != r1) goto L26
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78983UzD.LJJIII(com.ss.android.ugc.aweme.profile.model.User):X.7t5");
    }

    public static final String LJJIIJ(AbstractC31822CeI abstractC31822CeI) {
        o.LJIIIZ(abstractC31822CeI, "<this>");
        if (!(abstractC31822CeI instanceof C31826CeM)) {
            if (abstractC31822CeI.LIZJ.length() > 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(LJIJJ(abstractC31822CeI.LIZIZ.getFullPath()));
                LIZ.append(LJIJJ(abstractC31822CeI.LIZJ));
                return X1D.LIZIZ(LIZ);
            }
            return LJIJJ(abstractC31822CeI.LIZIZ.getFullPath());
        }
        throw new C162476Zf();
    }

    public static final String LJJIIJZLJL(AbstractC31822CeI abstractC31822CeI) {
        o.LJIIIZ(abstractC31822CeI, "<this>");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJIJJ(LJJIIJ(abstractC31822CeI)));
        LIZ.append(abstractC31822CeI.LIZ);
        return X1D.LIZIZ(LIZ);
    }

    public static final WebKitView LJJIJLIJ(SparkContext sparkContext) {
        C31999Ch9 c31999Ch9 = C31999Ch9.LIZJ;
        String str = sparkContext.containerId;
        c31999Ch9.getClass();
        InterfaceC60761Nsz LIZIZ = C31999Ch9.LIZIZ(str);
        if (LIZIZ == null || !(LIZIZ instanceof WebKitView)) {
            return null;
        }
        return (WebKitView) LIZIZ;
    }

    public static final void LJJIL(View view) {
        if (view != null && view.getVisibility() != 8) {
            view.setVisibility(8);
        }
    }

    public static final boolean LJJIZ(Aweme aweme) {
        AnchorCommonStruct anchorCommonStruct;
        String str;
        if (aweme.getAnchors() == null) {
            return false;
        }
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        o.LJIIIIZZ(anchors, "anchors");
        if (!(!anchors.isEmpty())) {
            return false;
        }
        List<AnchorCommonStruct> anchors2 = aweme.getAnchors();
        o.LJIIIIZZ(anchors2, "anchors");
        Iterator<AnchorCommonStruct> it = anchors2.iterator();
        while (it.hasNext()) {
            if (it.next().getType() == EnumC42934Gt8.ANCHOR_PUGC_TEMPLATE.getTYPE()) {
                List<AnchorCommonStruct> anchors3 = aweme.getAnchors();
                o.LJIIIIZZ(anchors3, "anchors");
                Iterator<AnchorCommonStruct> it2 = anchors3.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        anchorCommonStruct = it2.next();
                        if (anchorCommonStruct.getType() == EnumC42934Gt8.ANCHOR_PUGC_TEMPLATE.getTYPE()) {
                            break;
                        }
                    } else {
                        anchorCommonStruct = null;
                        break;
                    }
                }
                AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
                String str2 = "";
                if (anchorCommonStruct2 == null || (str = anchorCommonStruct2.getExtra()) == null) {
                    str = "";
                }
                try {
                    Object opt = new JSONObject(str).opt("author_id");
                    if (opt != null) {
                        String obj = opt.toString();
                        if (obj != null) {
                            str2 = obj;
                        }
                    }
                } catch (Exception unused) {
                }
                if (!o.LJ(str2, ((RBX) HG3.LJIILL()).getCurUserId())) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static boolean LJJJI(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJIL(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
        if (previewInfo != null && previewInfo.getPreviewVideoLength() != 0) {
            if (previewInfo.getPreviewVideoLength() >= 61000) {
                return true;
            }
        } else if (videoPublishEditModel.videoDurationFromVideoCutPage >= 61000) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJJ(String str) {
        if (str != null && str.length() > 0) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJJI(Aweme aweme) {
        AnchorCommonStruct anchorCommonStruct;
        String extra;
        String str;
        boolean z = false;
        try {
            List<AnchorCommonStruct> anchors = aweme.getAnchors();
            o.LJIIIIZZ(anchors, "anchors");
            Iterator<AnchorCommonStruct> it = anchors.iterator();
            while (true) {
                if (it.hasNext()) {
                    anchorCommonStruct = it.next();
                    if (anchorCommonStruct.getType() == EnumC42934Gt8.ANCHOR_PUGC_TEMPLATE.getTYPE()) {
                        break;
                    }
                } else {
                    anchorCommonStruct = null;
                    break;
                }
            }
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            if (anchorCommonStruct2 == null || (extra = anchorCommonStruct2.getExtra()) == null) {
                return false;
            }
            Object opt = new JSONObject(extra).opt("is_hide");
            if (opt == null || (str = opt.toString()) == null) {
                str = "";
            }
            z = o.LJ("1", str);
            return z;
        } catch (Exception unused) {
            return z;
        }
    }

    public static final boolean LJJJJIZL(InterfaceC153045zY interfaceC153045zY) {
        o.LJIIIZ(interfaceC153045zY, "<this>");
        VEEditor.VEState state = interfaceC153045zY.getState();
        if (state == null) {
            state = VEEditor.VEState.ERROR;
        }
        int value = state.getValue();
        if (value > VEEditor.VEState.INITIALIZED.getValue() && value < VEEditor.VEState.STOPPED.getValue()) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJJJ(User user) {
        o.LJIIIZ(user, "<this>");
        try {
            return user.getUid().equals(HG3.LJIILL().getCurUserId());
        } catch (Exception unused) {
            return false;
        }
    }

    public static final boolean LJJJJJL(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (!videoPublishEditModel.creativeModel.privacySettingModel.isSubscribeOnly || H7R.LJJLIIIJJIZ(videoPublishEditModel) || H7R.LJJJJL(videoPublishEditModel) || H7R.LJJLIIIIJ(videoPublishEditModel) || H7R.LJJLIIIJJI(videoPublishEditModel) || videoPublishEditModel.isShoutout() || videoPublishEditModel.ttStoryUploadModel != null) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJJL(EffectPointModel effectPointModel) {
        if (effectPointModel == null) {
            return false;
        }
        return !o.LJ(effectPointModel.getKey(), CardStruct.IStatusCode.DEFAULT);
    }

    public static final EnumC123864ta LJJJJLI(NLETrack nLETrack) {
        EnumC123864ta trackType = nLETrack.LJIIZILJ();
        EnumC123864ta LJII = nLETrack.LJII();
        EnumC123864ta enumC123864ta = EnumC123864ta.NONE;
        if (trackType != enumC123864ta && trackType != EnumC123864ta.FILTER) {
            o.LJIIIIZZ(trackType, "trackType");
        } else {
            if (LJII != enumC123864ta) {
                trackType = LJII;
            } else {
                trackType = enumC123864ta;
            }
            o.LJIIIIZZ(trackType, "if (extTrackType != NLET…  NLETrackType.NONE\n    }");
        }
        return trackType;
    }

    public static void LJJJJZI(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (String str2 : str.split(",", 8)) {
            i++;
            if (i == 1) {
                sb.append(str2);
            } else {
                if (i > 7) {
                    break;
                }
                sb.append(",");
                sb.append(str2);
            }
        }
        LJLL = sb.toString();
    }

    public static boolean LJJJLL(C57900Mnw c57900Mnw) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("social_permission_card_freq_");
        LIZ.append(LJJII());
        Keva repo = Keva.getRepo(X1D.LIZIZ(LIZ));
        o.LJIIIIZZ(repo, "getRepo(KEVA_REPO_PREFIX + curUid)");
        C57908Mo4.LIZ.getClass();
        AuthCardFreqParams settings = (AuthCardFreqParams) C57908Mo4.LIZJ.getValue();
        o.LJIIIZ(c57900Mnw, "<this>");
        o.LJIIIZ(settings, "settings");
        if (c57900Mnw.LJLILLLLZI.LIZLLL) {
            return true;
        }
        if (repo.getInt(LJJIJIL(c57900Mnw, "key_delete_count_"), 0) < settings.maxDeleteCount) {
            long currentTimeMillis = System.currentTimeMillis();
            Long valueOf = Long.valueOf(repo.getLong(LJJIJIL(c57900Mnw, "key_delete_hide_ts_"), -1L));
            long longValue = valueOf.longValue();
            if ((longValue != -1 && Math.abs((currentTimeMillis - longValue) / 86400000) < settings.maxDeleteHideDays) || 0 != 0) {
                valueOf.longValue();
            } else {
                Long valueOf2 = Long.valueOf(repo.getLong(LJJIJIL(c57900Mnw, "key_auto_hide_ts_"), -1L));
                long longValue2 = valueOf2.longValue();
                if (longValue2 == -1 || Math.abs((currentTimeMillis - longValue2) / 86400000) >= settings.maxAutoHideDays) {
                    return true;
                }
                valueOf2.longValue();
            }
        }
        return false;
    }

    public static final MAFIMUser LJJLI(User user) {
        o.LJIIIZ(user, "<this>");
        MAFIMUser mAFIMUser = new MAFIMUser();
        mAFIMUser.setUid(user.getUid());
        mAFIMUser.setSecUid(user.getSecUid());
        mAFIMUser.setNickName(user.getNickname());
        mAFIMUser.setSignature(user.getSignature());
        mAFIMUser.setAvatarThumb(user.getAvatarThumb());
        boolean z = true;
        if (user.getFollowStatus() == 1 && user.getFollowerStatus() == 1) {
            mAFIMUser.setFollowStatus(2);
        } else {
            mAFIMUser.setFollowStatus(user.getFollowStatus());
        }
        mAFIMUser.setFollowerStatus(user.getFollowerStatus());
        mAFIMUser.setUniqueId(user.getUniqueId());
        mAFIMUser.setShortId(user.getShortId());
        mAFIMUser.setCustomVerify(user.getCustomVerify());
        mAFIMUser.setEnterpriseVerifyReason(user.getEnterpriseVerifyReason());
        mAFIMUser.setVerificationType(user.getVerificationType());
        mAFIMUser.setRemarkName(user.getRemarkName());
        mAFIMUser.setBlock(user.isBlock());
        mAFIMUser.setContactName(user.getContactName());
        mAFIMUser.setCommerceUserLevel(user.getCommerceUserLevel());
        mAFIMUser.setWithCommerceEntry(user.isWithCommerceEntry());
        mAFIMUser.setCheckedUnreadStoryMillis(0L);
        if (user.getCommercePermission() == null || user.getCommercePermission().enterprise != 1) {
            z = false;
        }
        mAFIMUser.setEnterprise(z);
        mAFIMUser.setAccountType(user.getAccountType());
        mAFIMUser.setRecommendReason(user.getRecommendReason());
        mAFIMUser.setSecret(user.isSecret());
        mAFIMUser.setPrivateAccount(user.isPrivateAccount());
        mAFIMUser.setMMutualStruct(user.getMutualStruct());
        mAFIMUser.setRecType(user.getAccurateRecType());
        mAFIMUser.setFriendTypeStr(user.getFriendTypeStr());
        mAFIMUser.setRequestId(user.getRequestId());
        mAFIMUser.setSocialInfo(user.getSocialInfo());
        return mAFIMUser;
    }

    public static final InteractiveNoticeTemplate LJJLIIIIJ(V42 v42) {
        TextComponent textComponent;
        TextComponent textComponent2;
        BaseRequestComponent baseRequestComponent;
        BaseResponseComponent baseResponseComponent;
        RUF ruf = v42.plain_notice;
        TextComponent textComponent3 = null;
        if (ruf != null) {
            textComponent = C17N.LJJL(ruf);
        } else {
            textComponent = null;
        }
        RUF ruf2 = v42.interactive_notice;
        if (ruf2 != null) {
            textComponent2 = C17N.LJJL(ruf2);
        } else {
            textComponent2 = null;
        }
        RUF ruf3 = v42.query_content;
        if (ruf3 != null) {
            textComponent3 = C17N.LJJL(ruf3);
        }
        String str = v42.query_message_id;
        RU2 ru2 = v42.req_base;
        if (ru2 != null) {
            baseRequestComponent = C62819Ol5.LJJIIJZLJL(ru2);
        } else {
            baseRequestComponent = new BaseRequestComponent(0);
        }
        RUB rub = v42.resp_base;
        if (rub != null) {
            baseResponseComponent = C69648RVc.LIZJ(rub);
        } else {
            baseResponseComponent = new BaseResponseComponent(0L, 15);
        }
        PreviewHintComponent.Companion.getClass();
        return new InteractiveNoticeTemplate(textComponent, textComponent2, textComponent3, str, C79087V2d.LIZ(), baseRequestComponent, baseResponseComponent);
    }

    public static final User LJJLIIIJILLIZJL(MAFIMUser mAFIMUser) {
        o.LJIIIZ(mAFIMUser, "<this>");
        User user = new User();
        user.setUid(mAFIMUser.getUid());
        user.setSecUid(mAFIMUser.getSecUid());
        user.setNickname(mAFIMUser.getNickName());
        user.setSignature(mAFIMUser.getSignature());
        user.setAvatarThumb(mAFIMUser.getAvatarThumb());
        if (mAFIMUser.getFollowStatus() == 1 && mAFIMUser.getFollowerStatus() == 1) {
            user.setFollowStatus(2);
        } else {
            user.setFollowStatus(mAFIMUser.getFollowStatus());
        }
        user.setFollowerStatus(mAFIMUser.getFollowerStatus());
        user.setUniqueId(mAFIMUser.getUniqueId());
        user.setShortId(mAFIMUser.getShortId());
        user.setCustomVerify(mAFIMUser.getCustomVerify());
        user.setEnterpriseVerifyReason(mAFIMUser.getEnterpriseVerifyReason());
        user.setVerificationType(mAFIMUser.getVerificationType());
        user.setRemarkName(mAFIMUser.getRemarkName());
        user.isBlock = mAFIMUser.isBlock();
        user.setContactName(mAFIMUser.getContactName());
        user.setCommerceUserLevel(mAFIMUser.getCommerceUserLevel());
        user.setWithCommerceEntry(mAFIMUser.isWithCommerceEntry());
        user.setAccountType(mAFIMUser.getAccountType());
        user.setRecommendReason(mAFIMUser.getRecommendReason());
        user.setSecret(mAFIMUser.isSecret());
        user.setPrivateAccount(mAFIMUser.isPrivateAccount());
        user.setMutualStruct(mAFIMUser.getMMutualStruct());
        user.setRecType(mAFIMUser.getRecType());
        user.setFriendTypeStr(mAFIMUser.getFriendTypeStr());
        user.setRequestId(mAFIMUser.getRequestId());
        user.setSocialInfo(mAFIMUser.getSocialInfo());
        return user;
    }

    public static final void LJJLIIIJJIZ(DialogFragment dialogFragment) {
        o.LJIIIZ(dialogFragment, "<this>");
        if (C29306Beo.LIZIZ(dialogFragment.getContext()) != null) {
            C61713OJx LIZ = C61712OJw.LIZ(dialogFragment);
            LIZ.LIZIZ(false, false);
            LIZ.LIZIZ.LJIIL();
            LIZ.LJFF(-16777216);
            LIZ.LIZIZ.LJII(false);
            LIZ.LIZJ();
        }
    }

    public static final void LJJLIIIJL(View view) {
        if (view != null && view.getVisibility() != 0) {
            view.setVisibility(0);
        }
    }

    public static final void LJJLIIIJLJLI(SparkContext sparkContext) {
        WebKitView webKitView;
        C31999Ch9 c31999Ch9 = C31999Ch9.LIZJ;
        String str = sparkContext.containerId;
        c31999Ch9.getClass();
        InterfaceC60761Nsz LIZIZ = C31999Ch9.LIZIZ(str);
        if (LIZIZ != null && (LIZIZ instanceof WebKitView) && (webKitView = (WebKitView) LIZIZ) != null && webKitView.canGoBack()) {
            webKitView.goBack();
            return;
        }
        InterfaceC40159FpT LJIILL = sparkContext.LJIILL();
        if (LJIILL == null || !(LJIILL instanceof SparkActivity)) {
            return;
        }
        ((SparkActivity) LJIILL).finish();
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        return Long.valueOf(20 - ((Number) obj).longValue());
    }

    @Override // X.InterfaceC73592SuS
    public boolean test(Object obj) {
        C81154Vt8 output = (C81154Vt8) obj;
        o.LJIIIZ(output, "output");
        if (output.LIZLLL >= 0) {
            return true;
        }
        return false;
    }

    public static final long LJ(float f, float f2) {
        return (Float.floatToIntBits(f2) & 4294967295L) | (Float.floatToIntBits(f) << 32);
    }

    public static final long LJFF(float f, float f2) {
        return (Float.floatToIntBits(f2) & 4294967295L) | (Float.floatToIntBits(f) << 32);
    }

    public static final void LJII(C188727au c188727au, java.util.Map map) {
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (LJIJJLI((String) entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                if (C78685UuP.LJJJZ((String) entry2.getValue())) {
                    c188727au.LJI((String) entry2.getKey(), (String) entry2.getValue());
                }
            }
        }
    }

    public static final void LJIIIZ(long j, C0UT orientation) {
        o.LJIIIZ(orientation, "orientation");
        if (orientation == C0UT.Vertical) {
            if (C23360vs.LJI(j) != Integer.MAX_VALUE) {
                return;
            }
            "Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString();
            throw new IllegalStateException("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
        if (C23360vs.LJII(j) != Integer.MAX_VALUE) {
            return;
        }
        "Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString();
        throw new IllegalStateException("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
    }

    public static boolean LJIIJJI(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                try {
                    fileOutputStream2.close();
                    return true;
                } catch (Exception unused) {
                    return true;
                }
            } catch (Exception unused2) {
                fileOutputStream = fileOutputStream2;
                try {
                    fileOutputStream.close();
                    return false;
                } catch (Exception unused3) {
                    return false;
                }
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                try {
                    fileOutputStream.close();
                } catch (Exception unused4) {
                }
                throw th;
            }
        } catch (Exception unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static Typeface LJIIL(Context context, byte[] bArr) {
        File file;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(".lynx-font");
        LIZ.append(Process.myPid());
        LIZ.append("-");
        LIZ.append(Process.myTid());
        LIZ.append("-");
        String LIZIZ = X1D.LIZIZ(LIZ);
        int i = 0;
        while (true) {
            if (i < 100) {
                file = new File(C16880lQ.LLIIIL(context), KMP.LJ(LIZIZ, i));
                if (file.createNewFile()) {
                    break;
                }
                i++;
            } else {
                file = null;
                break;
            }
        }
        if (file == null) {
            return null;
        }
        try {
            if (!LJIIJJI(file, bArr)) {
                return null;
            }
            return C16880lQ.LJJLIIIJLLLLLLLZ(file.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            C16880lQ.LLLZZIL(file);
        }
    }

    public static void LJIILLIIL(String str, java.util.Map map) {
        IEnsure iEnsure;
        if (!InterfaceC35206Drm.LIZ || (iEnsure = LJLLLL) == null) {
            return;
        }
        iEnsure.ensureNotReachHere(str, (java.util.Map<String, String>) map);
    }

    public static void LJIJ(Throwable th, String str) {
        IEnsure iEnsure;
        if (!InterfaceC35206Drm.LIZ || (iEnsure = LJLLLL) == null) {
            return;
        }
        iEnsure.ensureNotReachHere(th, str);
    }

    public static final String LJIL(int i, String space) {
        String str;
        o.LJIIIZ(space, "space");
        Locale locale = Locale.getDefault();
        o.LJIIIIZZ(locale, "locale");
        boolean z = true;
        if (TextUtils.getLayoutDirectionFromLocale(locale) != 1) {
            z = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        if (z) {
            str = "\u061c";
        } else {
            str = "";
        }
        LIZ.append(str);
        LIZ.append(i);
        LIZ.append(space);
        LIZ.append('%');
        return X1D.LIZIZ(LIZ);
    }

    public static final C59066NGc LJJI(C58977NCr c58977NCr, ActivityC45651qj activityC45651qj) {
        String str;
        String str2;
        Integer num;
        Long creativeId;
        o.LJIIIZ(c58977NCr, "<this>");
        String type = c58977NCr.LJLIL.getType();
        EnumC59241NMv enumC59241NMv = EnumC59241NMv.SPARK;
        AwemeRawAd awemeRawAd = c58977NCr.LJLILLLLZI.getAwemeRawAd();
        Integer num2 = null;
        if (awemeRawAd != null && (creativeId = awemeRawAd.getCreativeId()) != null) {
            str = String.valueOf(creativeId);
        } else {
            str = null;
        }
        AwemeRawAd awemeRawAd2 = c58977NCr.LJLILLLLZI.getAwemeRawAd();
        if (awemeRawAd2 != null) {
            str2 = awemeRawAd2.getLogExtra();
        } else {
            str2 = null;
        }
        String groupId = c58977NCr.LJLILLLLZI.getGroupId();
        AwemeRawAd awemeRawAd3 = c58977NCr.LJLILLLLZI.getAwemeRawAd();
        if (awemeRawAd3 != null) {
            num = Integer.valueOf(awemeRawAd3.getChargeType());
        } else {
            num = null;
        }
        AwemeRawAd awemeRawAd4 = c58977NCr.LJLILLLLZI.getAwemeRawAd();
        if (awemeRawAd4 != null) {
            num2 = Integer.valueOf(awemeRawAd4.getSystemOrigin());
        }
        return new C59066NGc(type, enumC59241NMv, activityC45651qj, new NGY(str, str2, groupId, num, num2, 32));
    }

    public static final JSONObject LJJIIZ(String key, JSONObject getJSONObjectSafely) {
        o.LJIIJ(getJSONObjectSafely, "$this$getJSONObjectSafely");
        o.LJIIJ(key, "key");
        try {
            try {
                return JSONObjectProtectorUtils.getJSONObject(getJSONObjectSafely, key);
            } catch (Throwable th) {
                C39048FUe c39048FUe = C39048FUe.LIZIZ;
                StringBuilder LIZIZ = C25620zW.LIZIZ("could not parse content to JSONObject at ", key, ", error message: ");
                LIZIZ.append(th.getMessage());
                c39048FUe.LIZ(X1D.LIZIZ(LIZIZ), EnumC39866Fkk.E, "HybridSettings");
                return null;
            }
        } catch (Throwable unused) {
            return new JSONObject(JSONObjectProtectorUtils.getString(getJSONObjectSafely, key));
        }
    }

    public static final String LJJIJIL(C57900Mnw c57900Mnw, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(c57900Mnw.LJLIL.name());
        return X1D.LIZIZ(LIZ);
    }

    public static final boolean LJJJ(Spanned spanned, Class cls) {
        o.LJIIIZ(spanned, "<this>");
        if (spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length()) {
            return true;
        }
        return false;
    }

    public static void LJJJJLL(int i, String str) {
        String str2;
        BZI LIZ = C28787BRn.LIZ("livesdk_appeal_popup_window_click");
        if (i == 0) {
            str2 = "multi_live_apply";
        } else {
            str2 = "multi_live_accept";
        }
        LIZ.LJIJJ(str2, "request_page");
        LIZ.LJIJJ(str, "click_type");
        LIZ.LJIIZILJ();
        LIZ.LJJIIJZLJL();
    }

    public static final void LJJJJZ(NC7 nc7, NCI event) {
        o.LJIIIZ(nc7, "<this>");
        o.LJIIIZ(event, "event");
        Iterator<Map.Entry<String, NC9>> it = nc7.LJI.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().Q0(event);
        }
    }

    public static final void LJJJLIIL(NLEModel nLEModel, NLETrack nLETrack) {
        int i;
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList LIZ = C07080Po.LIZ(tracks, "model.tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack it2 = next;
            o.LJIIIIZZ(it2, "it");
            if (o.LJ(C77357UXp.LJIILLIIL(it2), "NORMAL")) {
                LIZ.add(next);
            }
        }
        if (LIZ.isEmpty()) {
            i = 0;
        } else {
            Iterator it3 = LIZ.iterator();
            if (it3.hasNext()) {
                NLETimeSpaceNode it4 = (NLETimeSpaceNode) it3.next();
                o.LJIIIIZZ(it4, "it");
                int layer = it4.getLayer();
                while (it3.hasNext()) {
                    NLETimeSpaceNode it5 = (NLETimeSpaceNode) it3.next();
                    o.LJIIIIZZ(it5, "it");
                    int layer2 = it5.getLayer();
                    if (layer < layer2) {
                        layer = layer2;
                    }
                }
                i = layer + 1;
            } else {
                throw new NoSuchElementException();
            }
        }
        nLETrack.setLayer(i);
    }

    public static final void LJJJZ(UIAssem uIAssem, String message) {
        o.LJIIIZ(uIAssem, "<this>");
        o.LJIIIZ(message, "message");
        if (uIAssem.getContext() != null) {
            C26045AKb c26045AKb = new C26045AKb(uIAssem.getContainerView());
            c26045AKb.LJIIIZ(message);
            c26045AKb.LJIIJ();
        }
    }

    public static final void LJJLIIIJLLLLLLLZ(JSONObject jSONObject, JSONObject json) {
        o.LJIIIZ(json, "json");
        Iterator<String> keys = json.keys();
        o.LJIIIIZZ(keys, "json.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject.put(next, json.opt(next));
        }
    }

    public static void LJIJI(Throwable th, String str, java.util.Map map) {
        IEnsure iEnsure;
        if (!InterfaceC35206Drm.LIZ || (iEnsure = LJLLLL) == null) {
            return;
        }
        iEnsure.ensureNotReachHere(th, str, map);
    }

    public static final void LJJJLZIJ(UIAssem uIAssem, int i, boolean z) {
        String str;
        o.LJIIIZ(uIAssem, "<this>");
        if (uIAssem.getContext() != null) {
            C26045AKb c26045AKb = new C26045AKb(uIAssem.getContainerView());
            Context context = uIAssem.getContext();
            if (context != null) {
                str = context.getString(i);
            } else {
                str = null;
            }
            c26045AKb.LJIIIZ(str);
            c26045AKb.LIZ(z);
            c26045AKb.LJIIJ();
        }
    }

    public static final C59421NTt LJJIFFI(C58977NCr c58977NCr, Aweme aweme, String str, NBS nbs) {
        Long l;
        o.LJIIIZ(c58977NCr, "<this>");
        o.LJIIIZ(aweme, "aweme");
        Uri.Builder buildUpon = UriProtector.parse(str).buildUpon();
        m mVar = new m();
        AwemeRawAd awemeRawAd = c58977NCr.LJLILLLLZI.getAwemeRawAd();
        if (awemeRawAd != null) {
            mVar.LJJIIZ("logExtra", awemeRawAd.getLogExtra());
            AnoleModel anoleModel = awemeRawAd.getAnoleModel();
            if (anoleModel != null) {
                l = Long.valueOf(anoleModel.getTemplateID());
            } else {
                l = null;
            }
            mVar.LJJIIJ("templateID", l);
        }
        mVar.LJJIIZ("groupID", c58977NCr.LJLILLLLZI.getGroupId());
        mVar.LJJIII(Boolean.valueOf(C90193gN.LIZIZ(c58977NCr.LJLJJI)), "isRTL");
        mVar.LJJII("frontendData", GsonProtectorUtils.toJsonTree(C69432nz.LIZ(), c58977NCr.LJLIL.getData()));
        mVar.LJJIIJ("componentID", Long.valueOf(c58977NCr.LJLIL.getID()));
        mVar.LJJIIZ("componentType", c58977NCr.LJLIL.getType());
        mVar.LJJIIZ("slotID", c58977NCr.LJLIL.getSlotID());
        m mVar2 = new m();
        mVar2.LJJIIJ("x", 0);
        mVar2.LJJIIJ("y", 0);
        mVar2.LJJIIJ("width", Double.valueOf(LJIIJ(c58977NCr).LJLIL));
        mVar2.LJJIIJ("height", Double.valueOf(LJIIJ(c58977NCr).LJLILLLLZI));
        mVar.LJJII("rect", mVar2);
        String jVar = mVar2.toString();
        o.LJIIIIZZ(jVar, "rect.toString()");
        C242549fW.LIZ(jVar);
        String builder = buildUpon.appendQueryParameter("initialData", mVar.toString()).toString();
        o.LJIIIIZZ(builder, "lynxSchema.let {\n       …       ).toString()\n    }");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("baseLynxSchema = ");
        LIZ.append(str);
        C242549fW.LIZ(X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("newSchema = ");
        LIZ2.append(builder);
        C242549fW.LIZ(X1D.LIZIZ(LIZ2));
        NIA nia = new NIA(c58977NCr.LJLIL.getType(), builder, nbs.LIZ, nbs.LIZIZ, new F24(nbs.LIZJ), false, null, false, 992);
        EnumC59053NFp enumC59053NFp = EnumC59053NFp.CACHE_WITH_RETRY;
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        return new C59421NTt(enumC59053NFp, aid, 4, true, nia, null, false, 200);
    }

    public static int LJJIJIIJI(TextView textView, ArrayList arrayList, int i, int i2) {
        Resources resources = textView.getResources();
        Iterator it = arrayList.iterator();
        int i3 = -1;
        while (it.hasNext()) {
            i3 = Math.max(i3, textView.getPaddingRight() + textView.getPaddingLeft() + ((int) textView.getPaint().measureText(resources.getString(((Integer) it.next()).intValue()))));
        }
        if (i3 >= i) {
            i = i3;
        }
        if (i > i2) {
            return i2;
        }
        return i;
    }

    public static final List LJJLIIIJJI(ProductPackStruct productPackStruct, DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult, PreOrderInfo preOrderInfo, PDPLogisticModule pDPLogisticModule, Boolean bool) {
        List<LogisticDTO> list;
        ShippingTOAddressInfo shippingTOAddressInfo;
        boolean z;
        LogisticDTO logisticDTO;
        C27124Aki c27124Aki;
        Integer num;
        List<Specification> list2;
        List<LogisticDTO> list3;
        Integer num2;
        String str;
        PDPLogisticModule pDPLogisticModule2 = pDPLogisticModule;
        o.LJIIIZ(productPackStruct, "<this>");
        PDPShippingServiceModule pDPShippingServiceModule = null;
        if (packedDeliverySelectResult != null) {
            list = packedDeliverySelectResult.logistics;
            shippingTOAddressInfo = packedDeliverySelectResult.shippingToAddressInfo;
        } else {
            list = null;
            shippingTOAddressInfo = null;
        }
        PdpShipping pdpShipping = new PdpShipping(list, shippingTOAddressInfo, null, null, null);
        PdpShipping pdpShipping2 = productPackStruct.shipping;
        if (pdpShipping2 != null) {
            pdpShipping = pdpShipping2.LIZ(pdpShipping);
        }
        if (packedDeliverySelectResult != null && packedDeliverySelectResult.pdpLogisticModule != null) {
            LogisticDTO logisticDTO2 = packedDeliverySelectResult.selectedLogistic;
            if (logisticDTO2 != null) {
                str = logisticDTO2.logisticsServiceId;
            } else {
                str = null;
            }
            java.util.Map<String, PDPShippingModule> map = packedDeliverySelectResult.pdpLogisticModule.shippingModuleMap;
            if (map != null) {
                for (Map.Entry<String, PDPShippingModule> entry : map.entrySet()) {
                    if (o.LJ(str, entry.getKey())) {
                        PDPShippingModule value = entry.getValue();
                        if (pDPLogisticModule2 == null) {
                            pDPLogisticModule2 = null;
                        } else {
                            pDPLogisticModule2 = new PDPLogisticModule(pDPLogisticModule2.moduleId, pDPLogisticModule2.meta, pDPLogisticModule2.moduleTitle, value, pDPLogisticModule2.pdpShippingServiceModule, pDPLogisticModule2.pdpReturnPolicyModule, pDPLogisticModule2.shippingModuleMap);
                        }
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        if (preOrderInfo != null) {
            arrayList.add(new C26464Aa4(preOrderInfo.shippingText));
        }
        Context LIZIZ = EF7.LIZIZ();
        Integer num3 = productPackStruct.status;
        int i = 4;
        boolean z2 = true;
        boolean z3 = false;
        if ((num3 != null && num3.intValue() == 1) || (((num2 = productPackStruct.status) != null && num2.intValue() == 4) || o.LJ(bool, Boolean.TRUE))) {
            z = true;
        } else {
            z = false;
        }
        if ((packedDeliverySelectResult != null && (list3 = packedDeliverySelectResult.logistics) != null && (logisticDTO = (LogisticDTO) ORZ.LJLLLL(list3)) != null) || (logisticDTO = productPackStruct.logistic) != null) {
            c27124Aki = C79004UzY.LJJJJZ(logisticDTO, LIZIZ, productPackStruct.warehouseTag);
        } else {
            c27124Aki = null;
        }
        if (z && ((num = productPackStruct.productType) == null || num.intValue() != 1)) {
            if (C78609UtB.LJJJJJL(productPackStruct)) {
                if (productPackStruct.userRight == null && productPackStruct.returnPolicy == null) {
                    z2 = false;
                }
                C26943Ahn.LIZ.getClass();
                if (C26943Ahn.LIZ() && pdpShipping.shippingService == null) {
                    z2 = false;
                }
                arrayList.add(new C27127Akl(c27124Aki, z2, pdpShipping, pDPLogisticModule2));
            } else {
                ProductBase productBase = productPackStruct.baseInfo;
                if ((productBase == null || (list2 = productBase.specs) == null || list2.isEmpty()) && productPackStruct.returnPolicy == null) {
                    z2 = false;
                }
                C26943Ahn.LIZ.getClass();
                if (C26943Ahn.LIZ() && pdpShipping.shippingService == null) {
                    z2 = false;
                }
                arrayList.add(new C27127Akl(c27124Aki, z2, pdpShipping, pDPLogisticModule2));
            }
            C26943Ahn.LIZ.getClass();
            if (C26943Ahn.LIZ() && pdpShipping.shippingService != null) {
                if (pDPLogisticModule2 != null) {
                    pDPShippingServiceModule = pDPLogisticModule2.pdpShippingServiceModule;
                }
                arrayList.add(new C26786AfG(pdpShipping, pDPShippingServiceModule));
            }
        }
        if (!arrayList.isEmpty()) {
            ListProtector.add(arrayList, 0, new C26840Ag8(8.0f, z3, R.attr.ds, i));
        }
        return arrayList;
    }
}
