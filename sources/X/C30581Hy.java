package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.apm6.cpu.ApmCpuManager;
import com.bytedance.crash.CrashType;
import com.bytedance.ies.android.base.runtime.depend.IUserDepend;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveResult;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CheckMessage;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateField;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldProduct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldText;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import defpackage.b1;
import java.io.File;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.1Hy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30581Hy implements InterfaceC75414Tik, InterfaceC48038ItG, IUserDepend {
    public static String LJLIL;
    public static boolean LJLJI;
    public static final C30581Hy LJLILLLLZI = new C30581Hy();
    public static final char[] LJLJJI = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int LIZ(long j) {
        int i;
        if ((4294967295L & j) == 0) {
            i = 32;
            j >>= 32;
        } else {
            i = 0;
        }
        if ((65535 & j) == 0) {
            i += 16;
            j >>= 16;
        }
        if ((255 & j) == 0) {
            i += 8;
            j >>= 8;
        }
        if ((15 & j) == 0) {
            i += 4;
            j >>= 4;
        }
        if ((1 & j) != 0) {
            return i;
        }
        if ((2 & j) != 0) {
            return i + 1;
        }
        if ((4 & j) != 0) {
            return i + 2;
        }
        if ((j & 8) != 0) {
            return i + 3;
        }
        return -1;
    }

    public static final long LJJIZ(long j) {
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IUserDepend
    public void login(Context context, InterfaceC59855NeN interfaceC59855NeN) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(null, "loginStatusCallback");
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IUserDepend
    public void logout(Context context) {
        o.LJIIIZ(context, "context");
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IUserDepend
    public String getAvatarURL() {
        RBY LJFF;
        IAccountService LJIJ = AccountService.LJIJ();
        if (LJIJ != null && (LJFF = LJIJ.LJFF()) != null) {
            return LJFF.getAvatarUrl();
        }
        return null;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IUserDepend
    public String getNickname() {
        RBY LJFF;
        IAccountService LJIJ = AccountService.LJIJ();
        if (LJIJ != null && (LJFF = LJIJ.LJFF()) != null) {
            return LJFF.getNickName();
        }
        return null;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IUserDepend
    public String getSecUid() {
        RBY LJFF;
        IAccountService LJIJ = AccountService.LJIJ();
        if (LJIJ != null && (LJFF = LJIJ.LJFF()) != null) {
            return LJFF.getCurUser().getSecUid();
        }
        return null;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IUserDepend
    public String getUniqueID() {
        RBY LJFF;
        IAccountService LJIJ = AccountService.LJIJ();
        if (LJIJ != null && (LJFF = LJIJ.LJFF()) != null) {
            return LJFF.getCurUser().getUniqueId();
        }
        return null;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IUserDepend
    public String getUserId() {
        RBY LJFF;
        IAccountService LJIJ = AccountService.LJIJ();
        if (LJIJ != null && (LJFF = LJIJ.LJFF()) != null) {
            return LJFF.getCurUser().getUid();
        }
        return null;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IUserDepend
    public boolean hasBoundPhone() {
        RBY LJFF;
        IAccountService LJIJ = AccountService.LJIJ();
        if (LJIJ != null && (LJFF = LJIJ.LJFF()) != null) {
            return LJFF.getCurUser().isPhoneBinded();
        }
        return false;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IUserDepend
    public boolean hasLogin() {
        RBY LJFF;
        IAccountService LJIJ = AccountService.LJIJ();
        if (LJIJ != null && (LJFF = LJIJ.LJFF()) != null) {
            return LJFF.isLogin();
        }
        return false;
    }

    public static final boolean LIZJ(MediaModel mediaModel) {
        o.LJIIIZ(mediaModel, "<this>");
        if (mediaModel.LJI() && mediaModel.duration < 1000 && C42117Gfx.LJ()) {
            return true;
        }
        return false;
    }

    public static int LJFF(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (str.startsWith("http:")) {
            return 1;
        }
        if (str.startsWith("https:")) {
            return 2;
        }
        if (str.startsWith("mdl:")) {
            return 3;
        }
        if (!str.startsWith("/")) {
            return -1;
        }
        return 4;
    }

    public static boolean LJII(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return C1B6.LIZIZ(str);
    }

    public static final C82033WHl LJIIIZ(WI1 wi1) {
        o.LJIIIZ(wi1, "<this>");
        C6MP LJIIIIZZ = wi1.LJIIIIZZ();
        EnumC147935rJ enumC147935rJ = wi1.LIZ;
        wi1.LIZIZ();
        return new C82033WHl(LJIIIIZZ, enumC147935rJ, wi1.LJI(), wi1.LJFF(), wi1.LIZLLL(), wi1.LJII(), wi1.LIZLLL, wi1.LIZJ(), wi1.LJ, wi1.LJIIIZ(), wi1.LJI);
    }

    public static void LJIIJ(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (!file.exists()) {
                LJJIJ(file.getPath());
            }
        }
    }

    public static final long LJIIL(long j) {
        return (j << 1) + 1;
    }

    public static final List LJIILJJIL(InterfaceC74309TEj categoryList) {
        o.LJIIIZ(categoryList, "$this$categoryList");
        List list = (List) categoryList.LJIIJJI().getValue();
        if (list != null) {
            return list;
        }
        return C61878OQg.INSTANCE;
    }

    public static String LJIILL(String str) {
        StringBuilder LIZ = X1D.LIZ();
        return b1.LIZIZ(str, LIZ, ".mp3", LIZ);
    }

    public static String LJIILLIIL(String str) {
        try {
            return LJIIZILJ(str.getBytes());
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public static String LJIIZILJ(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            char[] cArr = new char[32];
            int i = 0;
            for (int i2 = 0; i2 < 16; i2++) {
                byte b = digest[i2];
                int i3 = i + 1;
                char[] cArr2 = LJLJJI;
                cArr[i] = cArr2[(b >>> 4) & 15];
                i = i3 + 1;
                cArr[i3] = cArr2[b & 15];
            }
            return new String(cArr);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public static final boolean LJIJ(DraftSaveResult draftSaveResult) {
        String str;
        o.LJIIIZ(draftSaveResult, "<this>");
        if (draftSaveResult.isSuc() || draftSaveResult.getSaveFileResults().isSuc()) {
            return false;
        }
        DraftFileSaveResult draftFileSaveResult = (DraftFileSaveResult) ORZ.LJLLJ(draftSaveResult.getSaveFileResults().getBlockCreativeList());
        if (draftFileSaveResult.getSaveException().getThrowable() instanceof C249309qQ) {
            return true;
        }
        Throwable throwable = draftFileSaveResult.getSaveException().getThrowable();
        if (throwable == null || (str = throwable.getMessage()) == null) {
            str = "";
        }
        if (!s.LJJJLZIJ(str, "disk is full", true) && !s.LJJJLZIJ(str, "No space left on device", true) && !s.LJJJLZIJ(str, "database or disk is full", true)) {
            return false;
        }
        return true;
    }

    public static boolean LJIJI(String str) {
        return TextUtils.equals(str, "homepage_friends");
    }

    public static boolean LJIJJ(String str) {
        return TextUtils.equals(str, "homepage_follow");
    }

    public static boolean LJIJJLI(String str) {
        return TextUtils.equals(str, "homepage_popular");
    }

    public static boolean LJIL(String str) {
        return TextUtils.equals(str, "homepage_hot");
    }

    public static boolean LJJ(String str) {
        return TextUtils.equals(str, "homepage_nearby");
    }

    public static final boolean LJJI(XGX xgx) {
        o.LJIIIZ(xgx, "<this>");
        if ((xgx instanceof XGU) && ((((XGV) xgx).LIZLLL instanceof C84554XGk) || (((XGV) xgx).LIZLLL instanceof C84555XGl))) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (((java.lang.Class) r1).isPrimitive() == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJJIFFI(java.lang.Class r3) {
        /*
            boolean r0 = r3.isPrimitive()
            if (r0 != 0) goto L27
            r2 = 0
            java.lang.String r0 = "TYPE"
            java.lang.reflect.Field r1 = r3.getField(r0)     // Catch: java.lang.Exception -> L1f
            r0 = 0
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Exception -> L1f
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Class<*>"
            kotlin.jvm.internal.o.LJII(r1, r0)     // Catch: java.lang.Exception -> L1f
            java.lang.Class r1 = (java.lang.Class) r1     // Catch: java.lang.Exception -> L1f
            boolean r0 = r1.isPrimitive()     // Catch: java.lang.Exception -> L1f
            if (r0 != 0) goto L27
        L1f:
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r0 = kotlin.jvm.internal.o.LJ(r3, r0)
            if (r0 == 0) goto L28
        L27:
            r2 = 1
        L28:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30581Hy.LJJIFFI(java.lang.Class):boolean");
    }

    public static final boolean LJJII(C109544Rq c109544Rq) {
        o.LJIIIZ(c109544Rq, "<this>");
        if (c109544Rq.getLocalExt().get("s:send_response_check_msg") == null) {
            return false;
        }
        try {
            CheckMessage checkMessage = (CheckMessage) C62070OXq.LIZ(CheckMessage.class, c109544Rq.getLocalExt().get("s:send_response_check_msg"));
            if (checkMessage == null || checkMessage.getStatusCode() != 7179) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:3:0x000b A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJJIII(java.lang.String r2) {
        /*
            r2.getClass()
            int r0 = r2.hashCode()
            r1 = 1
            switch(r0) {
                case -2106940659: goto Lbd;
                case -1944031366: goto Lb3;
                case -1704990083: goto La9;
                case -1615835706: goto L9f;
                case -1595749921: goto L95;
                case -1111919188: goto L8b;
                case -812525449: goto L82;
                case -795442013: goto L79;
                case -584289565: goto L70;
                case -439320165: goto L67;
                case -369458823: goto L5e;
                case -348656189: goto L55;
                case -302357330: goto L4c;
                case -235365105: goto L43;
                case 35721254: goto L3a;
                case 36442609: goto L31;
                case 109413407: goto L28;
                case 757992758: goto L1f;
                case 861493944: goto L16;
                case 1438590386: goto Ld;
                default: goto Lb;
            }
        Lb:
            r1 = 0
        Lc:
            return r1
        Ld:
            java.lang.String r0 = "enter_music_detail"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lc
            goto Lb
        L16:
            java.lang.String r0 = "tool_performance_publish_first_frame"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lc
            goto Lb
        L1f:
            java.lang.String r0 = "tool_performance_enter_prop_tab"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lc
            goto Lb
        L28:
            java.lang.String r0 = "shoot"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lc
            goto Lb
        L31:
            java.lang.String r0 = "tool_performance_operation_cost_time"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lc
            goto Lb
        L3a:
            java.lang.String r0 = "tool_performance_record_first_frame"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lc
            goto Lb
        L43:
            java.lang.String r0 = "publish"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lc
            goto Lb
        L4c:
            java.lang.String r0 = "tool_performance_fetch_album_assets"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lc
            goto Lb
        L55:
            java.lang.String r0 = "publish_finish"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lc
            goto Lb
        L5e:
            java.lang.String r0 = "enter_video_edit_page"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lc
            goto Lb
        L67:
            java.lang.String r0 = "click_prop_entrance"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lc
            goto Lb
        L70:
            java.lang.String r0 = "tool_performance_resource_download"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lc
            goto Lb
        L79:
            java.lang.String r0 = "enter_video_post_page"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lc
            goto Lb
        L82:
            java.lang.String r0 = "upload_content_next"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lc
            goto Lb
        L8b:
            java.lang.String r0 = "prop_click"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lc
            goto Lb
        L95:
            java.lang.String r0 = "tool_performance_edit_first_frame"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lc
            goto Lb
        L9f:
            java.lang.String r0 = "enter_prop_detail"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lc
            goto Lb
        La9:
            java.lang.String r0 = "click_upload_entrance"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lc
            goto Lb
        Lb3:
            java.lang.String r0 = "enter_video_shoot_page"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lc
            goto Lb
        Lbd:
            java.lang.String r0 = "record_video"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lc
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30581Hy.LJJIII(java.lang.String):boolean");
    }

    public static final boolean LJJIIJ(String str) {
        return ORZ.LJLJJI(str, C47261Igj.LJJIJIIJI("trending", "hot", "popular", "tr"));
    }

    public static final C38489F8r LJJIIJZLJL(Object[] array) {
        o.LJIIIZ(array, "array");
        return new C38489F8r(array);
    }

    public static final String LJJIIZ(List list) {
        String obj;
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                if (next == null) {
                    obj = "";
                } else {
                    obj = next.toString();
                }
                sb.append(obj);
                if (obj.length() > 0 && i != arrayList.size() - 1) {
                    sb.append(";");
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "builder.toString()");
        return sb2;
    }

    public static void LJJIJ(String str) {
        try {
            File file = new File(str);
            if (file.getParentFile().exists()) {
                file.mkdir();
            } else {
                LJJIJ(file.getParent());
                file.mkdir();
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static final ActivityC45651qj LJJIJIL(View view) {
        o.LJIIIZ(view, "<this>");
        Context LJJIJL = LJJIJL(view);
        if (LJJIJL instanceof ActivityC45651qj) {
            return (ActivityC45651qj) LJJIJL;
        }
        return null;
    }

    public static final Context LJJIJL(View view) {
        o.LJIIIZ(view, "<this>");
        Context context = view.getContext();
        o.LJIIIIZZ(context, "this.getContext()");
        if (context instanceof Activity) {
            return context;
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            o.LJIIIIZZ(baseContext, "{\n        context.baseContext\n    }");
            return baseContext;
        }
        return context;
    }

    public static final String LJJJJ(Boolean bool) {
        if (bool == null) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        bool.booleanValue();
        if (!bool.booleanValue()) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        return "1";
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        BaseResponse it = (BaseResponse) obj;
        o.LJIIIZ(it, "it");
        if (it.status_code == 0) {
            return C76800UCe.LIZ;
        }
        throw new RuntimeException("server error");
    }

    @Override // X.InterfaceC75414Tik
    public void onSuccess(Object value) {
        o.LJIIIZ(value, "value");
    }

    public static final int LIZLLL(int i, int[] iArr) {
        int length = iArr.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            int i4 = iArr[i3];
            if (i > i4) {
                i2 = i3 + 1;
            } else if (i < i4) {
                length = i3 - 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final CategoryEffectModel LJI(InterfaceC74309TEj categoryEffectModel, String str) {
        C74413TIj c74413TIj;
        o.LJIIIZ(categoryEffectModel, "$this$categoryEffectModel");
        if (str != null && (c74413TIj = (C74413TIj) C74310TEk.LIZ(categoryEffectModel, str, false, 12).getValue()) != null) {
            return (CategoryEffectModel) c74413TIj.LIZ;
        }
        return null;
    }

    public static final int LJIIJJI(Context context, float f) {
        o.LJIIIZ(context, "context");
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList LJIILIIL(int i, List list) {
        int i2;
        ArrayList LJ = AnonymousClass391.LJ(list, "captions");
        if (list.isEmpty()) {
            return LJ;
        }
        int i3 = 0;
        if (((int) ((CaptionUtterance) ListProtector.get(list, 0)).LIZIZ()) != 0) {
            String str = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            if (((CaptionUtterance) ListProtector.get(list, 0)).utterance != null) {
                float f = 0.0f;
                LJ.add(new CaptionUtterance(new Utterance(0L, ((CaptionUtterance) ListProtector.get(list, 0)).LIZIZ(), str, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, f, f, i3, i3, 508, objArr == true ? 1 : 0), (TextStickerData) null));
            }
            if (((CaptionUtterance) ListProtector.get(list, 0)).inlineUtterance != null) {
                LJ.add(new CaptionUtterance((Utterance) null, new TextStickerData(null, 0, 0, 0, null, null, 0, (int) ((CaptionUtterance) ListProtector.get(list, 0)).LIZIZ(), 0, 0, 0.0f, 0.0f, 0L, false, false, false, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -193, -1, 1048575, null)));
            }
        }
        int size = list.size();
        while (true) {
            i2 = 2;
            if (i3 >= size) {
                break;
            }
            if (i3 == list.size() - 1) {
                LJ.add(new CaptionUtterance((CaptionUtterance) ListProtector.get(list, i3)));
                break;
            }
            LJ.add(new CaptionUtterance((CaptionUtterance) ListProtector.get(list, i3)));
            if (((CaptionUtterance) ListProtector.get(list, i3)).utterance != null) {
                float f2 = 0.0f;
                int i4 = 0;
                LJ.add(new CaptionUtterance(new Utterance(((CaptionUtterance) ListProtector.get(list, i3)).LIZ(), ((CaptionUtterance) ListProtector.get(list, i3 + 1)).LIZIZ(), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, f2, f2, i4, i4, 508, 0 == true ? 1 : 0), i2));
            }
            if (((CaptionUtterance) ListProtector.get(list, i3)).inlineUtterance != null) {
                LJ.add(new CaptionUtterance(new TextStickerData(null, 0, 0, 0, null, null, (int) ((CaptionUtterance) ListProtector.get(list, i3)).LIZ(), (int) ((CaptionUtterance) ListProtector.get(list, i3 + 1)).LIZIZ(), 0, 0, 0.0f, 0.0f, 0L, false, false, false, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -193, -1, 1048575, null)));
            }
            i3++;
        }
        if (((int) ((CaptionUtterance) C64504PTg.LIZIZ(list, -1, list)).LIZ()) != i) {
            if (((CaptionUtterance) C64504PTg.LIZIZ(list, -1, list)).utterance != null) {
                float f3 = 0.0f;
                int i5 = 0;
                LJ.add(new CaptionUtterance(new Utterance(((CaptionUtterance) C64504PTg.LIZIZ(list, -1, list)).LIZ(), i, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, f3, f3, i5, i5, 508, 0 == true ? 1 : 0), i2));
            }
            if (((CaptionUtterance) C64504PTg.LIZIZ(list, -1, list)).inlineUtterance != null) {
                LJ.add(new CaptionUtterance(new TextStickerData(null, 0, 0, 0, null, null, (int) ((CaptionUtterance) C64504PTg.LIZIZ(list, -1, list)).LIZ(), i, 0, 0, 0.0f, 0.0f, 0L, false, false, false, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -193, -1, 1048575, null)));
            }
        }
        return LJ;
    }

    public static final void LJJIJIIJI(VideoPublishEditModel videoPublishEditModel, boolean z) {
        String str;
        C145995oB LJII = C5QW.LJII(videoPublishEditModel);
        if (z) {
            str = "add";
        } else {
            str = "delete";
        }
        LJII.LJI("to_status", str);
        FMX.LJIIL("click_auto_beat", LJII.LIZ);
    }

    public static final TemplateField LJJIJIIJIL(TemplateField templateField, String newContent) {
        TemplateFieldText templateFieldText;
        o.LJIIIZ(templateField, "<this>");
        o.LJIIIZ(newContent, "newContent");
        TemplateFieldText templateFieldText2 = templateField.fieldData.fieldText;
        if (templateFieldText2 != null) {
            int i = templateFieldText2.limit;
            String color = templateFieldText2.color;
            String str = templateFieldText2.defaultContent;
            o.LJIIIZ(color, "color");
            templateFieldText = new TemplateFieldText(newContent, i, color, str);
        } else {
            templateFieldText = null;
        }
        TemplateFieldData templateFieldData = templateField.fieldData;
        TemplateFieldProduct templateFieldProduct = templateFieldData.fieldProduct;
        templateFieldData.getClass();
        return TemplateField.L(templateField, new TemplateFieldData(templateFieldText, templateFieldProduct));
    }

    public static void LJJIJLIJ(File file, CrashType crashType) {
        File file2;
        if (PJA.LJIIJ("custom_event_settings", "npth_simple_setting", "disable_crash_with_custom_files") == 1) {
            return;
        }
        try {
            if (crashType == CrashType.ANR) {
                file2 = null;
            } else {
                file2 = new File(file, "external_files");
                if (file2.exists()) {
                    return;
                }
            }
            Iterator<C39153FYf> it = PKZ.LJFF.LIZIZ.getList(crashType).iterator();
            while (it.hasNext()) {
                File[] LIZ = it.next().LIZ(crashType);
                if (LIZ != null) {
                    for (File file3 : LIZ) {
                        if (crashType == CrashType.ANR) {
                            File file4 = new File(file, file3.getName());
                            if (!file4.exists() && file3.length() < PJA.LJIIIIZZ(1048576, "custom_event_settings", "npth_simple_setting", "crash_file_size_limit")) {
                                PK8.LIZ(Integer.MAX_VALUE, file3, file4, false);
                            }
                        } else {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append(file3.getAbsolutePath());
                            LIZ2.append("\n");
                            PK8.LJIILJJIL(file2, X1D.LIZIZ(LIZ2), true);
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static final C6QO LJJJ(int i, List list) {
        Object obj;
        o.LJIIIZ(list, "<this>");
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C6QO) obj).LJJLIIIJLJLI() == i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (C6QO) obj;
    }

    public static final long LJJJI(int i, K74 unit) {
        o.LJIIIZ(unit, "unit");
        if (unit.compareTo(K74.SECONDS) <= 0) {
            return C44384HbQ.LJIJI(i, unit, K74.NANOSECONDS) << 1;
        }
        return LJJJIL(i, unit);
    }

    public static final long LJJJIL(long j, K74 unit) {
        o.LJIIIZ(unit, "unit");
        K74 k74 = K74.NANOSECONDS;
        long LJIJI = C44384HbQ.LJIJI(4611686018426999999L, k74, unit);
        if (new UIW(-LJIJI, LJIJI).LJIIIZ(j)) {
            return C44384HbQ.LJIJI(j, unit, k74) << 1;
        }
        K74 targetUnit = K74.MILLISECONDS;
        o.LJIIIZ(targetUnit, "targetUnit");
        return LJIIL(C78842Uww.LJIILIIL(targetUnit.getTimeUnit$kotlin_stdlib().convert(j, unit.getTimeUnit$kotlin_stdlib()), -4611686018427387903L, 4611686018427387903L));
    }

    @Override // X.InterfaceC75414Tik
    public void LJ(LinkCoreError error, Throwable th) {
        String str;
        o.LJIIIZ(error, "error");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("auto permitApply error = ");
        LIZ.append(error);
        LIZ.append(", throwable.message=");
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        JBR.LJIIJ(LIZ, str, LIZ, "MultiRefuseManager");
    }

    public static final void LJIIIIZZ(long j, long j2, long j3) {
        if ((j2 | j3) >= 0 && j2 <= j && j - j2 >= j3) {
            return;
        }
        StringBuilder LIZJ = V10.LIZJ("size=", j, " offset=");
        LIZJ.append(j2);
        throw new ArrayIndexOutOfBoundsException(C132805Jc.LIZLLL(LIZJ, " byteCount=", j3, LIZJ));
    }

    public static boolean LJJIIZI(C64198PHm c64198PHm, double d, boolean z) {
        java.util.Map<String, Double> map;
        java.util.Map<String, Double> map2;
        if (z) {
            if (c64198PHm != null && (map2 = c64198PHm.LJI) != null && !((HashMap) map2).isEmpty()) {
                Iterator<String> it = ApmCpuManager.getInstance().getCpuSceneSet().iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    if (((HashMap) c64198PHm.LJI).containsKey(next)) {
                        double doubleValue = ((Double) ((HashMap) c64198PHm.LJI).get(next)).doubleValue();
                        if (doubleValue >= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && d > doubleValue) {
                            return true;
                        }
                    }
                }
            }
            if (d > c64198PHm.LIZJ) {
                return true;
            }
            return false;
        }
        if (c64198PHm != null && (map = c64198PHm.LJII) != null && !((HashMap) map).isEmpty()) {
            Iterator<String> it2 = ApmCpuManager.getInstance().getCpuSceneSet().iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                if (((HashMap) c64198PHm.LJII).containsKey(next2)) {
                    double doubleValue2 = ((Double) ((HashMap) c64198PHm.LJII).get(next2)).doubleValue();
                    if (doubleValue2 >= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && d > doubleValue2) {
                        return true;
                    }
                }
            }
        }
        if (d > c64198PHm.LIZLLL) {
            return true;
        }
        return false;
    }

    public static final View LJJIL(View view, View view2, int i) {
        View view3;
        o.LJIIIZ(view, "<this>");
        if (o.LJ(view, view2)) {
            return null;
        }
        if (i < 0) {
            C36746EbW.LIZ(6, "Hierarchy is too deep, more than 30 !");
            return null;
        }
        Object parent = view.getParent();
        if (parent instanceof ViewGroup) {
            view3 = (View) parent;
        } else {
            view3 = null;
        }
        if (view3 instanceof RecyclerView) {
            return view;
        }
        if (o.LJ(view3, view2) || view3 == null) {
            return null;
        }
        return LJJIL(view3, view2, i - 1);
    }

    public static final boolean LIZIZ(byte[] a, int i, int i2, byte[] b, int i3) {
        o.LJIIJ(a, "a");
        o.LJIIJ(b, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (a[i4 + i] != b[i4 + i2]) {
                return false;
            }
        }
        return true;
    }
}
