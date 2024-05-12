package X;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.android.livesdkapi.depend.model.live.PartnershipInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.base.activity.BottomTabAbility;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaWelcomeMessageEditActivity;
import com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.ecommercelive.common.settings.ECommerceLiveConfig;
import com.ss.android.ugc.aweme.effectcreator.models.EffectCommandDataWrapper;
import com.ss.android.ugc.aweme.effectcreator.models.EffectObjectDataWrapper;
import com.ss.android.ugc.aweme.effectcreator.models.EffectPackageDataWrapper;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.IStickerService;
import com.ss.android.ugc.aweme.im.service.camera.exp.DMCameraSafetyExperiment;
import com.ss.android.ugc.aweme.nows.feed.ui.other.collection.NowOtherCollectionAbility;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.tools.ToolsUrlModel;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import ujb.s;

/* renamed from: X.Uxp, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78897Uxp implements InterfaceC162186Yc, KHW, C0K7 {
    public static boolean LJLIL;
    public static C10O LJLILLLLZI;
    public static final C78897Uxp LJLJI = new C78897Uxp();
    public static final C78897Uxp LJLJJI = new C78897Uxp();

    public static int LJIIJ(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return j < -2147483648L ? LiveLayoutPreloadThreadPriority.DEFAULT : (int) j;
    }

    public static boolean LJJIFFI() {
        return e1.LIZ(31744, "optimize_dispatchedcontinuation", true, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.KHW
    public PhotoSearchBusinessEnterParams LIZ() {
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams = new PhotoSearchBusinessEnterParams(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 4194303, 0 == true ? 1 : 0);
        C56045Lz7.LIZ.getClass();
        photoSearchBusinessEnterParams.setEnterFrom(C56045Lz7.LIZIZ());
        photoSearchBusinessEnterParams.setTrafficSourceList("[6]");
        photoSearchBusinessEnterParams.setOriginIsMallTab("mall");
        photoSearchBusinessEnterParams.setPhotoSearchPreviousPage("homepage");
        photoSearchBusinessEnterParams.setPhotoSearchPreviousSearchType("");
        photoSearchBusinessEnterParams.setSearchChannel("tiktok_mall_photo_search");
        return photoSearchBusinessEnterParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.KHW
    public PhotoSearchLogEnterParams LIZIZ() {
        PhotoSearchLogEnterParams photoSearchLogEnterParams = new PhotoSearchLogEnterParams(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
        C56045Lz7.LIZ.getClass();
        photoSearchLogEnterParams.setSearchEntrance(C56045Lz7.LIZIZ());
        photoSearchLogEnterParams.setCurrentPage("homepage");
        photoSearchLogEnterParams.setSearchType("");
        return photoSearchLogEnterParams;
    }

    public static final boolean LJJII() {
        ECommerceLiveConfig eCommerceLiveConfig;
        try {
            SettingsManager.LIZLLL().getClass();
            Object LJII = SettingsManager.LJII("live_ecommerce_config", ECommerceLiveConfig.class);
            o.LJIIIIZZ(LJII, "{\n            SettingsMa…gs::class.java)\n        }");
            eCommerceLiveConfig = (ECommerceLiveConfig) LJII;
        } catch (Exception unused) {
            eCommerceLiveConfig = new ECommerceLiveConfig();
        }
        return o.LJ(eCommerceLiveConfig.enabled, Boolean.TRUE);
    }

    public static final boolean LJJIIZI() {
        if (C16880lQ.LLJJJJ().getThread() == C16880lQ.LLLLIIIILLL()) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIJIIJIL() {
        Integer M;
        PrivacyUserSettingsV2 privacyUserSettings = PrivacyServiceImpl.LJIIIIZZ().getPrivacyUserSettings();
        if (privacyUserSettings == null || (M = privacyUserSettings.M("dm_filter_nude")) == null || M.intValue() != 1) {
            return false;
        }
        return true;
    }

    public static final long LIZLLL(int i) {
        return i << 32;
    }

    public static final long LJFF(long j) {
        return (j & 4294967295L) << 32;
    }

    public static final BottomTabAbility LJIIIZ(MainActivityScope mainActivityScope) {
        InterfaceC55235Lm3 interfaceC55235Lm3 = mainActivityScope.LJLIL;
        if (interfaceC55235Lm3 == null) {
            return null;
        }
        return (BottomTabAbility) C55096Ljo.LIZ(interfaceC55235Lm3, BottomTabAbility.class, null);
    }

    public static final float[] LJIIZILJ(long j) {
        return new float[]{C11850dJ.LJII(j), C11850dJ.LJI(j), C11850dJ.LJ(j), C11850dJ.LIZLLL(j)};
    }

    public static C78368UpI LJIJI(C0HE c0he) {
        String str;
        C78368UpI c78368UpI = new C78368UpI();
        int i = c0he.LIZ;
        int i2 = LiveLayoutPreloadThreadPriority.DEFAULT;
        if (i != Integer.MIN_VALUE) {
            switch (i) {
                case -3:
                    i2 = -3;
                    break;
                case -2:
                    i2 = -2;
                    break;
                case -1:
                    i2 = -1;
                    break;
                case 0:
                    i2 = 0;
                    break;
                case 1:
                    i2 = 1;
                    break;
                case 2:
                    i2 = 2;
                    break;
                case 3:
                    i2 = 3;
                    break;
                case 4:
                    i2 = 4;
                    break;
                case 5:
                    i2 = 5;
                    break;
                case 6:
                    i2 = 6;
                    break;
                case 7:
                    i2 = 7;
                    break;
                case 8:
                    i2 = 8;
                    break;
            }
        } else {
            i2 = -4;
        }
        c78368UpI.withErrorCode(i2);
        if (TextUtils.isEmpty(c0he.LIZIZ)) {
            String[] split = "0:OK/1:User Canceled/2:Unknown/3:Billing Unavailable/4:Item unavailable/5:Developer Error/6:Error/7:Item Already Owned/8:Item not owned".split("/");
            if (i2 >= 0 && i2 <= split.length - 1) {
                str = split[i2];
            } else {
                str = "Unknown.";
            }
        } else {
            str = c0he.LIZIZ;
        }
        c78368UpI.withMessage(str);
        return c78368UpI;
    }

    public static LaneParams LJIJJ(InterfaceC71003Rtn interfaceC71003Rtn) {
        o.LJIIIZ(interfaceC71003Rtn, "<this>");
        C70858RrS c70858RrS = new C70858RrS();
        LaneParams laneParams = new LaneParams();
        c70858RrS.LIZLLL(laneParams, "lib_track_builtin_lane_business");
        interfaceC71003Rtn.fillNodeParams(c70858RrS);
        return laneParams;
    }

    public static JSONArray LJIJJLI(File file) {
        JSONArray jSONArray = null;
        try {
            File file2 = new File(file, "logcat.txt");
            File file3 = new File(file, "logerr.txt");
            if (file3.exists()) {
                if (C78857UxB.LJJ(file2)) {
                    PM7.LIZIZ(1, true);
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("single_logcat");
                    LIZ.append(" failed ver ");
                    LIZ.append(2);
                    X1D.LIZIZ(LIZ);
                    C78685UuP.LJJJLL();
                    PM7.LIZIZ(3, false);
                }
            }
            C1XY.LJFF(file2, file3, true);
            String absolutePath = file2.getAbsolutePath();
            try {
                File file4 = new File(absolutePath);
                if (file4.length() > 512000) {
                    jSONArray = PK8.LJII(file4, file4.length() - 512000);
                } else {
                    jSONArray = PK8.LJIIIIZZ(absolutePath);
                }
            } catch (IOException unused) {
            } catch (Throwable unused2) {
                C78685UuP.LJJ();
            }
            return jSONArray;
        } catch (Throwable th) {
            PJZ.LIZ.getClass();
            PJY.LIZ("NPTH_CATCH", th);
            return jSONArray;
        }
    }

    public static final NavigationScene LJIL(WM7 navigationScene) {
        o.LJIIIZ(navigationScene, "$this$navigationScene");
        return C78923UyF.LJIIJJI(navigationScene);
    }

    public static final NowOtherCollectionAbility LJJ(ReusedAssem reusedAssem) {
        InterfaceC194547kI interfaceC194547kI;
        InterfaceC55235Lm3 LLLLJI;
        o.LJIIIZ(reusedAssem, "<this>");
        if (C19N.LJ("now_optimize_scope", true)) {
            return (NowOtherCollectionAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(reusedAssem), NowOtherCollectionAbility.class, null);
        }
        Object v3 = reusedAssem.v3();
        if (!(v3 instanceof InterfaceC194547kI) || (interfaceC194547kI = (InterfaceC194547kI) v3) == null || (LLLLJI = interfaceC194547kI.LLLLJI()) == null) {
            return null;
        }
        return (NowOtherCollectionAbility) C55096Ljo.LIZ(LLLLJI, NowOtherCollectionAbility.class, null);
    }

    public static final float LJJI(Context ctx) {
        o.LJIIIZ(ctx, "ctx");
        Float LJIIIZ = C79045V0n.LJIIIZ(ctx);
        if (LJIIIZ != null) {
            return LJIIIZ.floatValue();
        }
        return 0.2f;
    }

    public static String LJJIII(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String trim = str.trim();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < trim.length(); i++) {
            sb.append(C73030SlO.LJIIL(trim.charAt(i)));
        }
        return sb.toString();
    }

    public static int LJJIIJ(Object... objArr) {
        int hashCode;
        if (objArr == null) {
            return 0;
        }
        int i = 1;
        for (Object obj : objArr) {
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            i = ((i << 5) - i) ^ hashCode;
        }
        return i;
    }

    public static final boolean LJJIIJZLJL(C109544Rq c109544Rq) {
        List LJLJJL;
        o.LJIIIZ(c109544Rq, "<this>");
        boolean z = false;
        try {
            if (o.LJ(c109544Rq.getLocalExt().get("a:force_mask"), "1")) {
                return true;
            }
            String str = c109544Rq.getExt().get("a:force_mask");
            if (str == null || (LJLJJL = s.LJLJJL(str, new String[]{","}, 0, 6)) == null) {
                return false;
            }
            HG3.LJIIL();
            z = LJLJJL.contains(HG3.LJLJL.LJFF().getCurUserId());
            return z;
        } catch (NumberFormatException e) {
            C34B.LIZJ("isForceMask", e.toString());
            return z;
        }
    }

    public static final boolean LJJIIZ(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        MainBusinessAbility mainBusinessAbility = (MainBusinessAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(activity, null), MainBusinessAbility.class, null);
        if (mainBusinessAbility != null) {
            return mainBusinessAbility.D30(activity);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036 A[Catch: NumberFormatException -> 0x0040, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x0040, blocks: (B:3:0x0008, B:7:0x0019, B:9:0x001f, B:11:0x0027, B:17:0x0036, B:19:0x003b), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b A[Catch: NumberFormatException -> 0x0040, TryCatch #0 {NumberFormatException -> 0x0040, blocks: (B:3:0x0008, B:7:0x0019, B:9:0x001f, B:11:0x0027, B:17:0x0036, B:19:0x003b), top: B:2:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJJIJ(X.C63120Opw r5) {
        /*
            java.lang.String r1 = "a:media_mask"
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            r4 = 0
            java.util.Map r0 = r5.getLocalExt()     // Catch: java.lang.NumberFormatException -> L40
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.NumberFormatException -> L40
            java.lang.String r0 = "0"
            boolean r0 = kotlin.jvm.internal.o.LJ(r3, r0)     // Catch: java.lang.NumberFormatException -> L40
            if (r0 == 0) goto L19
            return r4
        L19:
            java.util.Map r0 = r5.getExt()     // Catch: java.lang.NumberFormatException -> L40
            if (r0 == 0) goto L30
            java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.NumberFormatException -> L40
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.NumberFormatException -> L40
            if (r2 == 0) goto L31
            int r0 = r2.length()     // Catch: java.lang.NumberFormatException -> L40
            if (r0 != 0) goto L2e
            goto L31
        L2e:
            r1 = 0
            goto L32
        L30:
            r2 = 0
        L31:
            r1 = 1
        L32:
            java.lang.String r0 = "1"
            if (r1 != 0) goto L3b
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r0)     // Catch: java.lang.NumberFormatException -> L40
            return r0
        L3b:
            boolean r0 = kotlin.jvm.internal.o.LJ(r3, r0)     // Catch: java.lang.NumberFormatException -> L40
            return r0
        L40:
            r0 = move-exception
            java.lang.String r1 = "isMediaMsgMasking"
            java.lang.String r0 = r0.toString()
            X.C34B.LIZJ(r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78897Uxp.LJJIJ(X.Opw):boolean");
    }

    public static final boolean LJJIJIIJI(VideoItemParams videoItemParams) {
        String str;
        Aweme aweme = videoItemParams.getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        if (C78880UxY.LJJJLIIL(aweme)) {
            BaseFeedPageParams baseFeedPageParams = videoItemParams.baseFeedPageParams;
            if (baseFeedPageParams != null) {
                str = baseFeedPageParams.eventType;
            } else {
                str = null;
            }
            if (!o.LJ(str, "personal_homepage") || C210428Nq.LIZ()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJJIJIL(C109544Rq c109544Rq) {
        List LJLJJL;
        o.LJIIIZ(c109544Rq, "<this>");
        boolean z = false;
        if (!C53181Ku1.LIZ() || c109544Rq.isSelf() || !o.LJ(c109544Rq.getExt().get("a:is_nude"), "true")) {
            return false;
        }
        if (LJJIIJZLJL(c109544Rq)) {
            return true;
        }
        if (o.LJ(c109544Rq.getLocalExt().get("a:nude_unmask"), "1")) {
            return false;
        }
        if (!C78685UuP.LJJJZ(c109544Rq.getExt().get("a:nude_unmask"))) {
            return true;
        }
        String str = c109544Rq.getExt().get("a:nude_unmask");
        if (str != null && (LJLJJL = s.LJLJJL(str, new String[]{","}, 0, 6)) != null) {
            HG3.LJIIL();
            if (LJLJJL.contains(HG3.LJLJL.LJFF().getCurUserId())) {
                z = true;
            }
        }
        return !z;
    }

    public static final boolean LJJIJL(C253009wO c253009wO) {
        String str;
        if (c253009wO == null || (str = c253009wO.LIZ) == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIJLIJ(Room room) {
        boolean z;
        PartnershipInfo partnershipInfo;
        if (room == null) {
            return false;
        }
        PartnershipInfo partnershipInfo2 = room.partnershipInfo;
        if (partnershipInfo2 != null) {
            z = o.LJ(partnershipInfo2.partnershipRoom, Boolean.TRUE);
        } else {
            z = false;
        }
        if (!z && (room == null || (partnershipInfo = room.partnershipInfo) == null || !partnershipInfo.promotingRoom)) {
            return false;
        }
        return true;
    }

    public static final float LJJIZ(long j) {
        AbstractC13230fX LJFF = C11850dJ.LJFF(j);
        if (C13210fV.LIZ(LJFF.LIZIZ, C13210fV.LIZ)) {
            IDqS416S0100000 iDqS416S0100000 = ((C1RU) LJFF).LJIILIIL;
            double doubleValue = ((Number) iDqS416S0100000.invoke(Double.valueOf(C11850dJ.LJII(j)))).doubleValue();
            float doubleValue2 = (float) ((((Number) iDqS416S0100000.invoke(Double.valueOf(C11850dJ.LJ(j)))).doubleValue() * 0.0722d) + (((Number) iDqS416S0100000.invoke(Double.valueOf(C11850dJ.LJI(j)))).doubleValue() * 0.7152d) + (doubleValue * 0.2126d));
            if (doubleValue2 <= 0.0f) {
                return 0.0f;
            }
            if (doubleValue2 < 1.0f) {
                return doubleValue2;
            }
            return 1.0f;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("The specified color must be encoded in an RGB color space. The supplied color space is ");
        LIZ.append((Object) C13210fV.LIZIZ(LJFF.LIZIZ));
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    public static final Integer LJJJIL(String str) {
        boolean z;
        Integer num = null;
        if (str == null) {
            return null;
        }
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        try {
            num = Integer.valueOf(Color.parseColor(str));
            return num;
        } catch (IllegalArgumentException unused) {
            return num;
        }
    }

    public static final NavigationScene LJJJJ(WM7 requireNavigationScene) {
        o.LJIIIZ(requireNavigationScene, "$this$requireNavigationScene");
        return C78923UyF.LJIILLIIL(requireNavigationScene);
    }

    public static void LJJJJLL(View view) {
        o.LJIIIZ(view, "<this>");
        view.setOnTouchListener(new ViewOnTouchListenerC76562zU(0.9f, null));
    }

    public static final int LJJJZ(long j) {
        AbstractC13230fX LJFF = C11850dJ.LJFF(j);
        if (LJFF.LIZLLL()) {
            return (int) (j >>> 32);
        }
        float[] LJIIZILJ = LJIIZILJ(j);
        C79146V4k.LJJIFFI(LJFF, null, 3).LIZ(LJIIZILJ);
        return ((int) ((LJIIZILJ[2] * 255.0f) + 0.5f)) | (((int) ((LJIIZILJ[3] * 255.0f) + 0.5f)) << 24) | (((int) ((LJIIZILJ[0] * 255.0f) + 0.5f)) << 16) | (((int) ((LJIIZILJ[1] * 255.0f) + 0.5f)) << 8);
    }

    public static final IStickerService.FaceSticker LJJL(Effect effect) {
        if (effect != null) {
            IStickerService.FaceSticker faceSticker = new IStickerService.FaceSticker();
            faceSticker.id = effect.getId();
            faceSticker.stickerId = CastLongProtector.parseLong(effect.getEffectId());
            faceSticker.resourceId = effect.getResourceId();
            UrlModel toToolsUrlModel = effect.getFileUrl();
            o.LJIIIZ(toToolsUrlModel, "$this$toToolsUrlModel");
            ToolsUrlModel toolsUrlModel = new ToolsUrlModel();
            toolsUrlModel.uri = toToolsUrlModel.getUri();
            toolsUrlModel.urlList = toToolsUrlModel.getUrlList();
            faceSticker.fileUrl = toolsUrlModel;
            UrlModel toToolsUrlModel2 = effect.getIconUrl();
            o.LJIIIZ(toToolsUrlModel2, "$this$toToolsUrlModel");
            ToolsUrlModel toolsUrlModel2 = new ToolsUrlModel();
            toolsUrlModel2.uri = toToolsUrlModel2.getUri();
            toolsUrlModel2.urlList = toToolsUrlModel2.getUrlList();
            faceSticker.iconUrl = toolsUrlModel2;
            faceSticker.localPath = effect.getUnzipPath();
            faceSticker.name = effect.getName();
            faceSticker.hint = effect.getHint();
            faceSticker.types = effect.getTypes();
            faceSticker.tags = effect.getTags();
            faceSticker.requirements = effect.getRequirements();
            faceSticker.sdkExtra = effect.getSdkExtra();
            faceSticker.extra = effect.getExtra();
            return faceSticker;
        }
        return null;
    }

    public static final RectF LJJLI(C53679L4x c53679L4x) {
        RectF rectF = new RectF();
        rectF.left = c53679L4x.LJLIL;
        rectF.top = c53679L4x.LJLJI;
        rectF.right = c53679L4x.LJLILLLLZI;
        rectF.bottom = c53679L4x.LJLJJI;
        return rectF;
    }

    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
    }

    @Override // X.InterfaceC162186Yc
    public void onError(String str) {
        C0JU.LIZLLL(str);
    }

    public static final long LJI(float f, float f2) {
        return (Float.floatToIntBits(f2) & 4294967295L) | (Float.floatToIntBits(f) << 32);
    }

    public static final void LJII(AmeBaseFragment ameBaseFragment, InterfaceC88472Yns build) {
        ActivityC86117Xqz activityC86117Xqz;
        BaseActivityViewModel viewModel;
        o.LJIIIZ(ameBaseFragment, "<this>");
        o.LJIIIZ(build, "build");
        ActivityC45651qj mo49getActivity = ameBaseFragment.mo49getActivity();
        if ((mo49getActivity instanceof ActivityC86117Xqz) && (activityC86117Xqz = (ActivityC86117Xqz) mo49getActivity) != null && (viewModel = activityC86117Xqz.getViewModel()) != null) {
            build.invoke(viewModel);
        }
    }

    public static final long LJIIJJI(long j, long j2) {
        float f;
        float f2;
        long LIZ = C11850dJ.LIZ(j, C11850dJ.LJFF(j2));
        float LIZLLL = C11850dJ.LIZLLL(j2);
        float LIZLLL2 = C11850dJ.LIZLLL(LIZ);
        float f3 = 1.0f - LIZLLL2;
        float f4 = (LIZLLL * f3) + LIZLLL2;
        float LJII = C11850dJ.LJII(LIZ);
        float LJII2 = C11850dJ.LJII(j2);
        float f5 = 0.0f;
        if (f4 == 0.0f) {
            f = 0.0f;
        } else {
            f = (((LJII2 * LIZLLL) * f3) + (LJII * LIZLLL2)) / f4;
        }
        float LJI = C11850dJ.LJI(LIZ);
        float LJI2 = C11850dJ.LJI(j2);
        if (f4 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((LJI2 * LIZLLL) * f3) + (LJI * LIZLLL2)) / f4;
        }
        float LJ = C11850dJ.LJ(LIZ);
        float LJ2 = C11850dJ.LJ(j2);
        if (f4 != 0.0f) {
            f5 = (((LJ2 * LIZLLL) * f3) + (LJ * LIZLLL2)) / f4;
        }
        return LIZJ(f, f2, f5, f4, C11850dJ.LJFF(j2));
    }

    public static final C6VC LJIILIIL(Context context, ViewGroup viewGroup) {
        o.LJIIIZ(context, "context");
        return new C6VC(context, viewGroup);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        if (r3 == null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.graphics.Bitmap LJIILL(android.content.Context r4, android.net.Uri r5) {
        /*
            r1 = 0
            if (r5 != 0) goto L4
            return r1
        L4:
            if (r4 != 0) goto L7
            return r1
        L7:
            X.W5P r3 = X.W5P.LIZLLL(r5)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L45
            X.V7y r2 = new X.V7y     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L45
            r0 = 720(0x2d0, float:1.009E-42)
            r2.<init>(r0, r0)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L45
            r3.LIZJ = r2     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L45
            X.W5O r2 = r3.LIZ()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L45
            X.W6J r0 = X.W5I.LIZ()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L45
            X.W4W r3 = r0.LJ(r2, r4)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L45
            java.lang.Object r2 = X.C81702W4s.LIZIZ(r3)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L46
            boolean r0 = r2 instanceof X.C81392Vwy     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L46
            if (r0 == 0) goto L2b
            X.Vwy r2 = (X.C81392Vwy) r2     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L46
            goto L2c
        L2b:
            r2 = r1
        L2c:
            if (r2 == 0) goto L48
            java.lang.Object r0 = r2.LJI()     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L46
            X.W5B r0 = (X.W5B) r0     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L46
            if (r0 == 0) goto L48
            android.graphics.Bitmap r1 = r0.getUnderlyingBitmap()     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L46
            goto L48
        L3b:
            r0 = move-exception
            r1 = r3
            goto L3f
        L3e:
            r0 = move-exception
        L3f:
            if (r1 == 0) goto L44
            r1.close()
        L44:
            throw r0
        L45:
            r3 = r1
        L46:
            if (r3 == 0) goto L4b
        L48:
            r3.close()
        L4b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78897Uxp.LJIILL(android.content.Context, android.net.Uri):android.graphics.Bitmap");
    }

    public static final int LJIJ(int i, View view) {
        o.LJIIIZ(view, "<this>");
        Context context = view.getContext();
        if (context != null) {
            return C78685UuP.LJJIIZI(i, context);
        }
        return 0;
    }

    public static final void LJJJ(String str, java.util.Map params) {
        o.LJIIIZ(params, "params");
        java.util.Map LJJLIL = C113554cx.LJJLIL(params);
        LJJLIL.put("is_ame_data", "1");
        C78880UxY.LJJLIIIJL(str, LJJLIL);
    }

    public static final EnumC112954bz LJJJJI(C109544Rq c109544Rq, boolean z) {
        o.LJIIIZ(c109544Rq, "<this>");
        if (((Boolean) C53181Ku1.LIZLLL.getValue()).booleanValue() && LJJIJIL(c109544Rq)) {
            return EnumC112954bz.NUDE_MASK;
        }
        DMCameraSafetyExperiment.LIZ.getClass();
        if (DMCameraSafetyExperiment.LIZLLL && c109544Rq.getCreatedAt() > DMCameraSafetyExperiment.LIZJ && ((LJJIIJZLJL(c109544Rq) || z) && !c109544Rq.isSelf())) {
            return EnumC112954bz.SAFETY_MASK;
        }
        return EnumC112954bz.NO_MASK;
    }

    public static void LJJJJJ(View view, int i) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        Integer LIZIZ = C19N.LIZIZ(view, "context", R.attr.e_);
        if (LIZIZ != null) {
            int LJIIIZ = C07290Qj.LJIIIZ(LIZIZ.intValue(), i);
            Context context = view.getContext();
            o.LJIIIIZZ(context, "context");
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, LJIILJJIL(0.0f, LJIIIZ, context));
            stateListDrawable.addState(new int[0], new ColorDrawable(i));
            view.setBackground(stateListDrawable);
        }
    }

    public static final void LJJJJJL(View view, float f) {
        o.LJIIIZ(view, "<this>");
        LJJJJIZL(f, R.attr.e_, view);
    }

    public static final void LJJJJL(View view, float f) {
        o.LJIIIZ(view, "<this>");
        LJJJJIZL(f, R.attr.ea, view);
    }

    public static final void LJJJJLI(View view, final InterfaceC88471Ynr interfaceC88471Ynr) {
        o.LJIIIZ(view, "<this>");
        Context context = view.getContext();
        o.LJIIIIZZ(context, "context");
        final float LJJI = LJJI(context);
        view.setOnTouchListener(new View.OnTouchListener(LJJI, interfaceC88471Ynr) { // from class: X.2zT
            public final float LJLIL;
            public final InterfaceC88471Ynr<View, MotionEvent, Boolean> LJLILLLLZI;

            {
                this.LJLIL = LJJI;
                this.LJLILLLLZI = interfaceC88471Ynr;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View v, MotionEvent event) {
                o.LJIIIZ(v, "v");
                o.LJIIIZ(event, "event");
                int action = event.getAction();
                if (action != 0) {
                    if (action == 1 || action == 3) {
                        v.animate().alpha(1.0f).setDuration(0L).start();
                    }
                } else {
                    v.animate().alpha(this.LJLIL).setDuration(0L).start();
                }
                InterfaceC88471Ynr<View, MotionEvent, Boolean> interfaceC88471Ynr2 = this.LJLILLLLZI;
                if (interfaceC88471Ynr2 != null) {
                    return interfaceC88471Ynr2.invoke(v, event).booleanValue();
                }
                return false;
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        if (r3 > 4) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJJJZ(X.C80695Vlj r2, int r3) {
        /*
            java.lang.String r0 = "$this$setTabModeWithTabCount"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            r1 = 0
            r0 = 1
            if (r3 > r0) goto L11
            r2.setHideIndicatorView(r0)
        Lc:
            r1 = 1
        Ld:
            r2.setTabMode(r1)
            return
        L11:
            r2.setHideIndicatorView(r1)
            r0 = 4
            if (r3 <= r0) goto Lc
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78897Uxp.LJJJJZ(X.Vlj, int):void");
    }

    public static final void LJJJJZI(IFrameSlot.SlotViewModel slotViewModel, boolean z) {
        boolean z2;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData = slotViewModel.LJLIL;
        o.LJIIIIZZ(mutableLiveData, "this.isVisible");
        if (z && LJJII()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (LJJIIZI()) {
            mutableLiveData.setValue(new Pair<>(Boolean.valueOf(z2), "shop"));
        } else {
            mutableLiveData.postValue(new Pair<>(Boolean.valueOf(z2), "shop"));
        }
    }

    public static final void LJJJLIIL(IIconSlot.SlotViewModel slotViewModel, boolean z) {
        boolean z2;
        o.LJIIIZ(slotViewModel, "<this>");
        MutableLiveData<Boolean> mutableLiveData = slotViewModel.LJLILLLLZI;
        o.LJIIIIZZ(mutableLiveData, "this.visible");
        if (z && LJJII()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (LJJIIZI()) {
            mutableLiveData.setValue(Boolean.valueOf(z2));
        } else {
            mutableLiveData.postValue(Boolean.valueOf(z2));
        }
    }

    public static void LJJJLL(BaWelcomeMessageEditActivity baWelcomeMessageEditActivity, int i) {
        o.LJIIIZ(baWelcomeMessageEditActivity, "<this>");
        String string = baWelcomeMessageEditActivity.getString(i);
        o.LJIIIIZZ(string, "getString(content)");
        XKX.LIZLLL(C780334l.LJLIL, C36636EZk.LIZ, null, new C63022de(baWelcomeMessageEditActivity, string, 0, null), 2);
    }

    public static final void LJJLIIIIJ(EQ3 data, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        List<EffectCommandDataWrapper> list;
        String str7;
        List<EffectObjectDataWrapper> list2;
        String str8;
        o.LJIIIZ(data, "data");
        long currentTimeMillis = System.currentTimeMillis() - data.LIZIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        EffectPackageDataWrapper effectPackageDataWrapper = data.LIZ;
        String str9 = "";
        if (effectPackageDataWrapper == null || (str2 = effectPackageDataWrapper.projectId) == null) {
            str2 = "";
        }
        linkedHashMap.put("project_id", str2);
        EffectPackageDataWrapper effectPackageDataWrapper2 = data.LIZ;
        if (effectPackageDataWrapper2 == null || (str3 = effectPackageDataWrapper2.enterFrom) == null) {
            str3 = "";
        }
        linkedHashMap.put("ame_enter_from", str3);
        linkedHashMap.put("loki_effect_id", data.LIZJ);
        linkedHashMap.put("ttep_effect_id", data.LJFF);
        EffectPackageDataWrapper effectPackageDataWrapper3 = data.LIZ;
        if (effectPackageDataWrapper3 == null || (str4 = effectPackageDataWrapper3.projectSource) == null) {
            str4 = "";
        }
        linkedHashMap.put("project_source", str4);
        EffectPackageDataWrapper effectPackageDataWrapper4 = data.LIZ;
        if (effectPackageDataWrapper4 == null || (str5 = effectPackageDataWrapper4.templateId) == null) {
            str5 = "";
        }
        linkedHashMap.put("template_id", str5);
        EffectPackageDataWrapper effectPackageDataWrapper5 = data.LIZ;
        if (effectPackageDataWrapper5 == null || (str6 = effectPackageDataWrapper5.defaultIconType) == null) {
            str6 = "";
        }
        linkedHashMap.put("default_icon_type", str6);
        EffectPackageDataWrapper effectPackageDataWrapper6 = data.LIZ;
        if (effectPackageDataWrapper6 != null && (str8 = effectPackageDataWrapper6.defaultIconFeatureId) != null) {
            str9 = str8;
        }
        linkedHashMap.put("default_icon_feature_id", str9);
        if (str != null) {
            linkedHashMap.put("result", "fail");
            linkedHashMap.put("fail_reason", str);
        } else {
            linkedHashMap.put("result", "success");
        }
        linkedHashMap.put("upload_duration", String.valueOf(currentTimeMillis));
        linkedHashMap.put("publish_method", data.LJI);
        linkedHashMap.put("publish_source", data.LJII);
        EffectPackageDataWrapper effectPackageDataWrapper7 = data.LIZ;
        Integer num5 = null;
        if (effectPackageDataWrapper7 != null) {
            l = Long.valueOf(effectPackageDataWrapper7.projectSize);
        } else {
            l = null;
        }
        linkedHashMap.put("project_size", String.valueOf(l));
        linkedHashMap.put("effect_size", String.valueOf(data.LIZLLL));
        EffectPackageDataWrapper effectPackageDataWrapper8 = data.LIZ;
        if (effectPackageDataWrapper8 != null) {
            l2 = Long.valueOf(effectPackageDataWrapper8.duration);
        } else {
            l2 = null;
        }
        linkedHashMap.put("duration", String.valueOf(l2));
        EffectPackageDataWrapper effectPackageDataWrapper9 = data.LIZ;
        if (effectPackageDataWrapper9 != null) {
            l3 = Long.valueOf(effectPackageDataWrapper9.layerDuration);
        } else {
            l3 = null;
        }
        linkedHashMap.put("layer_duration", String.valueOf(l3));
        EffectPackageDataWrapper effectPackageDataWrapper10 = data.LIZ;
        if (effectPackageDataWrapper10 != null) {
            l4 = Long.valueOf(effectPackageDataWrapper10.interactionDuration);
        } else {
            l4 = null;
        }
        linkedHashMap.put("interaction_duration", String.valueOf(l4));
        EffectPackageDataWrapper effectPackageDataWrapper11 = data.LIZ;
        if (effectPackageDataWrapper11 != null) {
            num = Integer.valueOf(effectPackageDataWrapper11.objectCount);
        } else {
            num = null;
        }
        linkedHashMap.put("object_cnt", String.valueOf(num));
        EffectPackageDataWrapper effectPackageDataWrapper12 = data.LIZ;
        if (effectPackageDataWrapper12 != null) {
            num2 = Integer.valueOf(effectPackageDataWrapper12.commandCount);
        } else {
            num2 = null;
        }
        linkedHashMap.put("command_cnt", String.valueOf(num2));
        EffectPackageDataWrapper effectPackageDataWrapper13 = data.LIZ;
        if (effectPackageDataWrapper13 != null) {
            num3 = Integer.valueOf(effectPackageDataWrapper13.validCommandCount);
        } else {
            num3 = null;
        }
        linkedHashMap.put("valid_command_cnt", String.valueOf(num3));
        EffectPackageDataWrapper effectPackageDataWrapper14 = data.LIZ;
        if (effectPackageDataWrapper14 != null) {
            num4 = Integer.valueOf(effectPackageDataWrapper14.validActionCount);
        } else {
            num4 = null;
        }
        linkedHashMap.put("valid_action_cnt", String.valueOf(num4));
        EffectPackageDataWrapper effectPackageDataWrapper15 = data.LIZ;
        if (effectPackageDataWrapper15 != null) {
            num5 = Integer.valueOf(effectPackageDataWrapper15.sequenceCount);
        }
        linkedHashMap.put("sequence_cnt", String.valueOf(num5));
        LJJJ("publish_effect_result", linkedHashMap);
        EffectPackageDataWrapper effectPackageDataWrapper16 = data.LIZ;
        if (effectPackageDataWrapper16 != null && (list2 = effectPackageDataWrapper16.objectDataList) != null) {
            for (EffectObjectDataWrapper effectObjectDataWrapper : list2) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("project_id", data.LIZ.projectId);
                linkedHashMap2.put("loki_effect_id", data.LIZJ);
                linkedHashMap2.put("ttep_effect_id", data.LJFF);
                linkedHashMap2.put("feature_id", effectObjectDataWrapper.featureId);
                if (!ujb.o.LJJJJJL(effectObjectDataWrapper.distortionStatus)) {
                    linkedHashMap2.put("distortion_status", effectObjectDataWrapper.distortionStatus);
                }
                if (!effectObjectDataWrapper.liquifyStatus.isEmpty()) {
                    linkedHashMap2.put("liquify_status", ORZ.LLD(effectObjectDataWrapper.liquifyStatus, ",", null, null, null, 62));
                }
                linkedHashMap2.put("feature_name", effectObjectDataWrapper.featureName);
                linkedHashMap2.put("texture_from", effectObjectDataWrapper.textureFrom);
                if (!ujb.o.LJJJJJL(effectObjectDataWrapper.textureType)) {
                    linkedHashMap2.put("texture_type", effectObjectDataWrapper.textureType);
                }
                linkedHashMap2.put("asset_id", effectObjectDataWrapper.assetId);
                LJJJ("effect_object_detail", linkedHashMap2);
            }
        }
        EffectPackageDataWrapper effectPackageDataWrapper17 = data.LIZ;
        if (effectPackageDataWrapper17 != null && (list = effectPackageDataWrapper17.commandDataList) != null) {
            for (EffectCommandDataWrapper effectCommandDataWrapper : list) {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put("project_id", data.LIZ.projectId);
                linkedHashMap3.put("loki_effect_id", data.LIZJ);
                linkedHashMap3.put("ttep_effect_id", data.LJFF);
                if (effectCommandDataWrapper.isValid) {
                    str7 = "1";
                } else {
                    str7 = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap3.put("is_valid", str7);
                linkedHashMap3.put("index", String.valueOf(effectCommandDataWrapper.index));
                linkedHashMap3.put("command_add_from", effectCommandDataWrapper.commandAddFrom);
                linkedHashMap3.put("action_cnt", String.valueOf(effectCommandDataWrapper.actionCount));
                linkedHashMap3.put("valid_action_cnt", String.valueOf(effectCommandDataWrapper.validActionCount));
                linkedHashMap3.put("valid_object_cnt", String.valueOf(effectCommandDataWrapper.validObjectCount));
                if (!ujb.o.LJJJJJL(effectCommandDataWrapper.triggerName)) {
                    linkedHashMap3.put("trigger_name", effectCommandDataWrapper.triggerName);
                }
                if (!effectCommandDataWrapper.actionNameList.isEmpty()) {
                    linkedHashMap3.put("action_name_list", ORZ.LLD(effectCommandDataWrapper.actionNameList, ",", null, null, null, 62));
                }
                LJJJ("effect_command_detail", linkedHashMap3);
            }
        }
    }

    public static final void LJJLIIIJILLIZJL(C109544Rq c109544Rq, boolean z) {
        String str;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        java.util.Map<String, String> localExt = c109544Rq.getLocalExt();
        o.LJIIIIZZ(localExt, "localExt");
        localExt.put("a:force_mask", str);
        C106674Gp.LJIILJJIL(c109544Rq);
    }

    public static final void LJIIIIZZ(float f, long j, View layout) {
        o.LJIIIZ(layout, "layout");
        layout.animate().translationY(f).setDuration(j).start();
    }

    public static final Drawable LJIILJJIL(float f, int i, Context context) {
        if (f > 0.0f) {
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZ = Integer.valueOf(i);
            c110614Vt.LIZJ = Float.valueOf(f);
            return c110614Vt.LIZ(context);
        }
        return new ColorDrawable(i);
    }

    public static final long LJJIL(float f, long j, long j2) {
        C1RT c1rt = C13240fY.LJIJI;
        long LIZ = C11850dJ.LIZ(j, c1rt);
        long LIZ2 = C11850dJ.LIZ(j2, c1rt);
        float LIZLLL = C11850dJ.LIZLLL(LIZ);
        float LJII = C11850dJ.LJII(LIZ);
        float LJI = C11850dJ.LJI(LIZ);
        float LJ = C11850dJ.LJ(LIZ);
        float LIZLLL2 = C11850dJ.LIZLLL(LIZ2);
        float LJII2 = C11850dJ.LJII(LIZ2);
        float LJI2 = C11850dJ.LJI(LIZ2);
        float LJ2 = C11850dJ.LJ(LIZ2);
        return C11850dJ.LIZ(LIZJ(C79146V4k.LJJJJLI(LJII, LJII2, f), C79146V4k.LJJJJLI(LJI, LJI2, f), C79146V4k.LJJJJLI(LJ, LJ2, f), C79146V4k.LJJJJLI(LIZLLL, LIZLLL2, f), c1rt), C11850dJ.LJFF(j2));
    }

    public static void LJJJI(View view, EditorInfo editorInfo, InputConnection inputConnection) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                if (parent instanceof C03T) {
                    editorInfo.hintText = ((C03T) parent).LIZJ();
                    return;
                }
            }
        }
    }

    public static final void LJJJJIZL(float f, int i, View view) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        Integer LIZIZ = C19N.LIZIZ(view, "context", i);
        if (LIZIZ != null) {
            int intValue = LIZIZ.intValue();
            if (Build.VERSION.SDK_INT >= 23) {
                Context context = view.getContext();
                o.LJIIIIZZ(context, "context");
                stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, LJIILJJIL(f, intValue, context));
                stateListDrawable.addState(new int[0], new ColorDrawable(0));
                view.setForeground(stateListDrawable);
            }
        }
    }

    public static final void LJJJLZIJ(ActivityC45651qj startTaskForResult, Intent intent, InterfaceC88473Ynt interfaceC88473Ynt) {
        o.LJIIIZ(startTaskForResult, "$this$startTaskForResult");
        o.LJIIIZ(intent, "intent");
        Fragment findFragmentByTag = startTaskForResult.getFragmentManager().findFragmentByTag("async_task");
        R1F r1f = new R1F();
        r1f.LJLIL = intent;
        r1f.setArguments(C141415gn.LIZ("extra_request_code", 10002));
        r1f.LJLILLLLZI = interfaceC88473Ynt;
        if (findFragmentByTag != null) {
            startTaskForResult.getFragmentManager().beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
        }
        startTaskForResult.getFragmentManager().beginTransaction().add(r1f, "async_task").commitAllowingStateLoss();
    }

    public static final long LJ(int i, int i2, int i3, int i4) {
        return LIZLLL(((i & 255) << 16) | ((i4 & 255) << 24) | ((i2 & 255) << 8) | (i3 & 255));
    }

    public static String LJIIL(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            if (str.contains(str4)) {
                return str4;
            }
            str4 = LJJIII(str4).toLowerCase();
            StringBuilder sb = new StringBuilder();
            int indexOf = str3.indexOf(str4);
            int indexOf2 = str2.indexOf(str4);
            int i = 0;
            if (indexOf2 != -1) {
                int i2 = 0;
                int i3 = 0;
                while (i < str.length()) {
                    int length = C73030SlO.LJIIL(str.charAt(i)).toLowerCase().length() + i3;
                    if (i3 >= indexOf2 && i3 < str4.length() + indexOf2) {
                        sb.append(str.charAt(i));
                    } else if (length > indexOf2 && length <= str4.length() + indexOf2) {
                        sb.append(str.charAt(i));
                    } else {
                        if (indexOf2 > i3 && indexOf2 < length) {
                            sb.append(str.charAt(i));
                        }
                        i++;
                        i3 = length;
                    }
                    i2++;
                    i++;
                    i3 = length;
                }
                i = i2;
            }
            if (indexOf != -1 && indexOf < str.length() && str4.length() > i) {
                return str.substring(indexOf, Math.min(str.length(), str4.length() + indexOf));
            }
            if (!TextUtils.isEmpty(sb.toString())) {
                return sb.toString();
            }
        }
        return str4;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0011. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ad A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LJJLIIIJ(java.lang.String r2, int r3, boolean r4, boolean r5) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78897Uxp.LJJLIIIJ(java.lang.String, int, boolean, boolean):int");
    }

    public static final void LJJLIIIJJI(View layout, float f, float f2, float f3) {
        o.LJIIIZ(layout, "layout");
        layout.setPivotX(0.0f);
        layout.setPivotY(0.0f);
        layout.setScaleX(f);
        layout.setScaleY(f);
        layout.setTranslationX(f2);
        layout.setTranslationY(f3);
    }

    public static final long LIZJ(float f, float f2, float f3, float f4, AbstractC13230fX colorSpace) {
        o.LJIIIZ(colorSpace, "colorSpace");
        float LIZJ = colorSpace.LIZJ(0);
        if (f <= colorSpace.LIZIZ(0) && LIZJ <= f && 1 != 0) {
            float LIZJ2 = colorSpace.LIZJ(1);
            if (f2 <= colorSpace.LIZIZ(1) && LIZJ2 <= f2) {
                float LIZJ3 = colorSpace.LIZJ(2);
                if (f3 <= colorSpace.LIZIZ(2) && LIZJ3 <= f3 && 0.0f <= f4 && f4 <= 1.0f) {
                    if (colorSpace.LIZLLL()) {
                        return (((((((int) ((f * 255.0f) + 0.5f)) << 16) | (((int) ((f4 * 255.0f) + 0.5f)) << 24)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((f3 * 255.0f) + 0.5f))) & 4294967295L) << 32;
                    }
                    if (((int) (colorSpace.LIZIZ >> 32)) == 3) {
                        int i = colorSpace.LIZJ;
                        if (i != -1) {
                            short LIZJ4 = C11970dV.LIZJ(f);
                            return ((C11970dV.LIZJ(f2) & 65535) << 32) | ((LIZJ4 & 65535) << 48) | ((C11970dV.LIZJ(f3) & 65535) << 16) | ((((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (i & 63);
                        }
                        "Unknown color space, please use a color space in ColorSpaces".toString();
                        throw new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces");
                    }
                    "Color only works with ColorSpaces with 3 components".toString();
                    throw new IllegalArgumentException("Color only works with ColorSpaces with 3 components");
                }
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("red = ");
        LIZ.append(f);
        LIZ.append(", green = ");
        LIZ.append(f2);
        LIZ.append(", blue = ");
        LIZ.append(f3);
        LIZ.append(", alpha = ");
        LIZ.append(f4);
        LIZ.append(" outside the range for ");
        LIZ.append(colorSpace);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }
}
