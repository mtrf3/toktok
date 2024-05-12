package X;

import android.app.Activity;
import android.os.SystemClock;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastSmoothGoLiveSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestSelectFixedMicCountSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.crash.Npth;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.keva.Keva;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.AutoCutTitle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderAvailableInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.1XY, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1XY implements InterfaceC170926nI, InterfaceC48038ItG, R3Y, IAVPublishService.PublishProgressController {
    public static final C1XY LJLIL = new C1XY();
    public static final C1XY LJLILLLLZI = new C1XY();

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService.PublishProgressController
    public boolean initHide() {
        return false;
    }

    @Override // X.R3Y
    public void onCancel() {
    }

    @Override // X.R3Y
    public void onSuccess() {
    }

    public static JSONArray LJIJI() {
        Window window;
        View peekDecorView;
        JSONArray jSONArray = new JSONArray();
        ArrayList<WeakReference<Activity>> arrayList = C64269PKf.LIZLLL().LJFF;
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        Iterator<WeakReference<Activity>> it = arrayList.iterator();
        while (it.hasNext()) {
            Activity activity = it.next().get();
            if (activity != null && (window = activity.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                JSONObject jSONObject = new JSONObject();
                linkedList.add(new Pair(peekDecorView, jSONObject));
                jSONArray.put(jSONObject);
            }
        }
        while (!linkedList.isEmpty()) {
            Pair pair = (Pair) linkedList.pop();
            View view = (View) pair.first;
            JSONObject jSONObject2 = (JSONObject) pair.second;
            PJC.LJIIJ(jSONObject2, "cls", String.valueOf(view.getClass()));
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                JSONArray jSONArray2 = new JSONArray();
                PJC.LJIIJ(jSONObject2, "children", jSONArray2);
                for (int i = 0; i < childCount; i++) {
                    try {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt != null) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONArray2.put(jSONObject3);
                            linkedList.push(new Pair(childAt, jSONObject3));
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return jSONArray;
    }

    public static void LJJIJ() {
        Keva repo = Keva.getRepo("anr_dispatch_boost", 1);
        FFL.LJIIIZ().getClass();
        repo.storeBoolean("boost_enable", FFL.LJ(31744, "anr_dispatch_boost_v2", true, false));
        SettingsManager.LIZLLL().getClass();
        repo.storeBoolean("kitkat_enable", SettingsManager.LIZ("anr_dispatch_kitkat_enable", true));
        SettingsManager.LIZLLL().getClass();
        repo.storeBoolean("remove_bomb_twice_enable", SettingsManager.LIZ("anr_dispatch_remove_bomb_twice_enable", false));
    }

    public static String LJIILJJIL() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(System.currentTimeMillis());
        LIZ.append("-");
        LIZ.append(UUID.randomUUID().toString());
        return X1D.LIZIZ(LIZ);
    }

    public static final int LJIILL() {
        int LIZ = C44517HdZ.LIZ();
        if (LIZ <= 0) {
            LIZ = 30;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("PreviewImportFps ; previewCompile ; fps : ");
        LIZ2.append(LIZ);
        C5Z5.LIZIZ(X1D.LIZIZ(LIZ2));
        return LIZ;
    }

    public static final boolean LJIL() {
        String str;
        String LIZ = C85990Xow.LIZ();
        if (LIZ != null) {
            str = LIZ.toUpperCase(Locale.ROOT);
            o.LJIIIIZZ(str, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        } else {
            str = null;
        }
        return o.LJ(str, "SA");
    }

    public static final boolean LJJ() {
        String str;
        String LIZ = C85990Xow.LIZ();
        if (LIZ != null) {
            str = LIZ.toUpperCase(Locale.ROOT);
            o.LJIIIIZZ(str, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        } else {
            str = null;
        }
        if (!o.LJ(str, "SA") || Q7K.LIZIZ("ec_order_submit_version", 0) != 2) {
            return false;
        }
        return true;
    }

    public static final boolean LIZ(boolean z) {
        if (!LiveSdkMultiGuestSelectFixedMicCountSetting.INSTANCE.enable() && z) {
            int Yu0 = ((IInteractService) CN1.LIZ(IInteractService.class)).Yu0();
            C29556Biq.LIZ().getClass();
            if (Yu0 >= C74983Tbn.LJIIIIZZ()) {
                return true;
            }
        }
        return false;
    }

    public static void LIZJ(File file) {
        String str;
        String str2;
        String str3;
        String str4;
        try {
            File file2 = new File(file, "maps.txt");
            String str5 = null;
            if (!file2.exists()) {
                str = file2.getAbsolutePath();
            } else {
                str = null;
            }
            File file3 = new File(file, "smaps.txt");
            if (!file3.exists()) {
                str2 = file3.getAbsolutePath();
            } else {
                str2 = null;
            }
            File file4 = new File(file, "meminfo.txt");
            if (!file4.exists()) {
                str3 = file4.getAbsolutePath();
            } else {
                str3 = null;
            }
            File file5 = new File(file, "fds.txt");
            if (!file5.exists()) {
                str4 = file5.getAbsolutePath();
            } else {
                str4 = null;
            }
            File file6 = new File(file, "threads.txt");
            if (!file6.exists()) {
                str5 = file6.getAbsolutePath();
            }
            LJFF(new File(file, "logcat.txt"), new File(file, "logerr.txt"), false);
            NativeTools.LJIILJJIL().getClass();
            NativeTools.LJ(str4, str, str2, str5, str3);
            LJII(file);
            LJI(file);
            LJ(file);
            LJIIIZ(file);
            File file7 = new File(file, "os_memory.txt");
            if (!file7.exists()) {
                file7.getParentFile().mkdirs();
                NativeTools.LJIILJJIL().LJIIJ(file7.getAbsolutePath());
            }
            LJIIIIZZ(file);
            if (PKZ.LJIIJ != null) {
                Npth.dumpVMMonitorInfoCrash(1);
            }
            if (PKZ.LJIIJ != null) {
                Npth.dumpVMMonitorInfoCrash(0);
            }
        } catch (Throwable unused) {
        }
    }

    public static File LIZLLL(File file) {
        File file2 = new File(file, "anr_trace.txt");
        if (file2.exists()) {
            return file2;
        }
        if (PJA.LJIIJ("custom_event_settings", "npth_simple_setting", "anr_with_traces_txt") == 1) {
            File file3 = new File("/data/anr/traces.txt");
            if (!file3.exists()) {
                return file2;
            }
            PK8.LIZ(1048576, file3, file2, false);
            return file2;
        }
        return file2;
    }

    public static void LJ(File file) {
        if (PJC.LIZLLL(PJA.LJI(), 1, "custom_event_settings", "npth_simple_setting", "enable_dump_gfx_info") == 1) {
            FileOutputStream fileOutputStream = null;
            try {
                Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
                Object invoke = cls.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                Method declaredMethod = cls.getDeclaredMethod("dumpGfxInfo", FileDescriptor.class, String[].class);
                declaredMethod.setAccessible(true);
                FileOutputStream fileOutputStream2 = new FileOutputStream(new File(file, "gfxinfo.txt"));
                try {
                    declaredMethod.invoke(invoke, fileOutputStream2.getFD(), new String[0]);
                    FPX.LIZIZ(fileOutputStream2);
                } catch (Throwable unused) {
                    fileOutputStream = fileOutputStream2;
                    FPX.LIZIZ(fileOutputStream);
                }
            } catch (Throwable unused2) {
            }
        }
    }

    public static void LJI(File file) {
        if (PJC.LIZLLL(PJA.LJI(), 1, "custom_event_settings", "npth_simple_setting", "enable_dump_malloc") == 1) {
            File file2 = new File(file, "malloc.txt");
            if (file2.exists()) {
                return;
            }
            file2.getParentFile().mkdirs();
            NativeTools.LJIILJJIL().LJIIIIZZ(file2.getAbsolutePath());
        }
    }

    public static void LJII(File file) {
        File file2 = new File(file, "pthreads.txt");
        if (file2.exists()) {
            return;
        }
        File file3 = new File(file, "rountines.txt");
        file2.getParentFile().mkdirs();
        NativeTools.LJIILJJIL().LJIIL(file2.getAbsolutePath(), file3.getAbsolutePath());
    }

    public static void LJIIIIZZ(File file) {
        File file2 = new File(file, "ref_table.txt");
        if (file2.exists()) {
            return;
        }
        file2.getParentFile().mkdirs();
        NativeImpl.LIZJ(file2.getAbsolutePath());
    }

    public static void LJIIIZ(File file) {
        if (PJC.LIZLLL(PJA.LJI(), 1, "custom_event_settings", "npth_simple_setting", "enable_dump_view_tree") == 1) {
            File file2 = new File(file, "viewTree.txt");
            if (!file2.exists()) {
                try {
                    PK8.LJIILL(file2, LJIJI());
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static String LJIIJ(List list) {
        o.LJIIIZ(list, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = ListProtector.get(list, i2);
            i++;
            if (i > 1) {
                sb.append((CharSequence) ",");
            }
            if (obj == null || (obj instanceof CharSequence)) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) String.valueOf(obj));
            }
        }
        sb.append((CharSequence) "");
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "fastJoinTo(StringBuilder…form)\n        .toString()");
        return sb2;
    }

    public static final WM7 LJIIJJI(View findRootScene) {
        o.LJIIIZ(findRootScene, "$this$findRootScene");
        WM7 LJI = C78598Ut0.LJI(findRootScene);
        if (LJI != null) {
            return LJIIL(LJI);
        }
        return null;
    }

    public static final WM7 LJIIL(WM7 findRootScene) {
        o.LJIIIZ(findRootScene, "$this$findRootScene");
        while (findRootScene != null) {
            if (findRootScene instanceof InterfaceC165696er) {
                return findRootScene;
            }
            findRootScene = findRootScene.mParentScene;
        }
        return null;
    }

    public static final PackedSku LJIILIIL(BillInfoData billInfoData) {
        ShopOrderNew shopOrderNew;
        List<MainOrderInfo> list;
        MainOrderInfo mainOrderInfo;
        List<PackedSku> list2;
        List<ShopOrderNew> newShopOrders = billInfoData.getNewShopOrders();
        if (newShopOrders != null && (shopOrderNew = (ShopOrderNew) ORZ.LJLLLL(newShopOrders)) != null && (list = shopOrderNew.mainOrderInfos) != null && (mainOrderInfo = (MainOrderInfo) ORZ.LJLLLL(list)) != null && (list2 = mainOrderInfo.packedSkus) != null) {
            return (PackedSku) ORZ.LJLLLL(list2);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r2 > 30) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int LJIILLIIL(int r2) {
        /*
            int r1 = X.C44517HdZ.LIZ()
            r0 = 30
            if (r1 <= 0) goto L22
            if (r2 <= r1) goto L1f
            r2 = r1
        Lb:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "PreviewImportFps ; previewParams ; fps : "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C5Z5.LIZIZ(r0)
            return r2
        L1f:
            if (r2 <= r0) goto L22
            goto Lb
        L22:
            r2 = 30
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1XY.LJIILLIIL(int):int");
    }

    public static final String LJIJ(InterfaceC55235Lm3 interfaceC55235Lm3) {
        C50433Jqn searchCommonModel;
        String isFromComment;
        C50652JuK.Companion.getClass();
        C50650JuI LJIIIIZZ = C50651JuJ.LJIIIIZZ(interfaceC55235Lm3);
        if (LJIIIIZZ == null || (searchCommonModel = LJIIIIZZ.getSearchCommonModel()) == null || (isFromComment = searchCommonModel.isFromComment()) == null) {
            return "";
        }
        return isFromComment;
    }

    public static final boolean LJIJJ(U66 u66) {
        User user;
        Long l;
        RtcUserInfo LLZL;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        Long l2 = null;
        if (room != null) {
            user = room.getOwner();
        } else {
            user = null;
        }
        if (u66 != null && (LLZL = u66.LLZL()) != null) {
            l = Long.valueOf(LLZL.getUserId());
        } else {
            l = null;
        }
        if (user != null) {
            l2 = Long.valueOf(user.getId());
        }
        return o.LJ(l, l2);
    }

    public static final boolean LJIJJLI(MainOrderInfo mainOrderInfo) {
        o.LJIIIZ(mainOrderInfo, "<this>");
        MainOrderAvailableInfo mainOrderAvailableInfo = mainOrderInfo.availableInfo;
        if (mainOrderAvailableInfo != null && mainOrderAvailableInfo.availableStatus != null) {
            Integer num = mainOrderAvailableInfo.availableStatus;
            int value = EnumC28013Az3.AVAILABLE.getValue();
            if (num == null || num.intValue() != value) {
                return false;
            }
            return true;
        }
        return o.LJ(mainOrderInfo.reachable, Boolean.TRUE);
    }

    public static final boolean LJJI(ActivityC45651qj activityC45651qj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        C50948Jz6 c50948Jz6 = JTO.LIZ(activityC45651qj).LJLIL;
        String str6 = null;
        if (c50948Jz6 != null) {
            str = c50948Jz6.getEnterSearchFrom();
        } else {
            str = null;
        }
        if (o.LJ(str, "discovery")) {
            return true;
        }
        C50948Jz6 c50948Jz62 = JTO.LIZ(activityC45651qj).LJLIL;
        if (c50948Jz62 != null) {
            str2 = c50948Jz62.getEnterSearchFrom();
        } else {
            str2 = null;
        }
        if (o.LJ(str2, "homepage_hot")) {
            return true;
        }
        C50948Jz6 c50948Jz63 = JTO.LIZ(activityC45651qj).LJLIL;
        if (c50948Jz63 != null) {
            str3 = c50948Jz63.getEnterSearchFrom();
        } else {
            str3 = null;
        }
        if (o.LJ(str3, "homepage_follow")) {
            return true;
        }
        C50948Jz6 c50948Jz64 = JTO.LIZ(activityC45651qj).LJLIL;
        if (c50948Jz64 != null) {
            str4 = c50948Jz64.getEnterSearchFrom();
        } else {
            str4 = null;
        }
        if (o.LJ(str4, "homepage_friends")) {
            return true;
        }
        C50948Jz6 c50948Jz65 = JTO.LIZ(activityC45651qj).LJLIL;
        if (c50948Jz65 != null) {
            str5 = c50948Jz65.getEnterSearchFrom();
        } else {
            str5 = null;
        }
        if (o.LJ(str5, "homepage_popular")) {
            return true;
        }
        C50948Jz6 c50948Jz66 = JTO.LIZ(activityC45651qj).LJLIL;
        if (c50948Jz66 != null) {
            str6 = c50948Jz66.getEnterSearchFrom();
        }
        if (o.LJ(str6, "homepage_nearby")) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIFFI(ActivityC45651qj activityC45651qj) {
        InterfaceC12600eW interfaceC12600eW;
        if (activityC45651qj == null || (interfaceC12600eW = (InterfaceC12600eW) DataChannelGlobal.LJLJJI.mv0(C2E1.class)) == null || !interfaceC12600eW.LIZIZ(activityC45651qj)) {
            return false;
        }
        return true;
    }

    public static final boolean LJJII(BillInfoData billInfoData) {
        o.LJIIIZ(billInfoData, "<this>");
        if (o.LJ(billInfoData.getVersion(), "1") || o.LJ(billInfoData.getVersion(), "2") || o.LJ(billInfoData.getVersion(), "3") || o.LJ(billInfoData.getVersion(), "6") || o.LJ(billInfoData.getVersion(), "7")) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIII(ActivityC45651qj activityC45651qj) {
        if (BroadcastSmoothGoLiveSetting.INSTANCE.enable() && LJJIFFI(activityC45651qj)) {
            return true;
        }
        return false;
    }

    public static final C35794E3a LJJIIJ(Object obj) {
        if (obj == null) {
            return C35794E3a.LIZIZ;
        }
        return new C35794E3a(obj);
    }

    public static final String LJJIIZ(String name) {
        o.LJIIIZ(name, "name");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(name);
        LIZ.append("_error");
        return X1D.LIZIZ(LIZ);
    }

    public static final HybridSchemaParam LJJIIZI(String toHybridSchemaParam) {
        HybridSchemaParam hybridSchemaParam;
        boolean z;
        boolean z2;
        Integer num;
        int i;
        boolean z3;
        boolean z4;
        int i2;
        boolean z5;
        int i3;
        boolean z6;
        boolean z7;
        boolean z8;
        int i4;
        int i5;
        Integer LJJIL;
        Integer LJJIL2;
        Integer LJJIL3;
        Integer LJJIL4;
        Integer LJJIL5;
        Integer LJJIL6;
        Integer LJJIL7;
        Integer LJJIL8;
        int i6;
        boolean z9;
        boolean z10;
        int i7;
        boolean z11;
        boolean z12;
        boolean z13;
        Integer LJJIL9;
        Integer LJJIL10;
        Integer LJJIL11;
        Integer LJJIL12;
        Integer LJJIL13;
        Integer LJJIL14;
        Integer LJJIL15;
        Integer LJJIL16;
        Integer LJJIL17;
        o.LJIIJ(toHybridSchemaParam, "$this$toHybridSchemaParam");
        android.net.Uri uri = UriProtector.parse(toHybridSchemaParam);
        o.LJFF(uri, "uri");
        int i8 = C60691Nrr.LIZ[C86793Y4n.LJJIZ(uri).ordinal()];
        int i9 = -1;
        Integer num2 = null;
        String str = "";
        int i10 = 1;
        int i11 = 0;
        r2 = false;
        r2 = false;
        boolean z14 = false;
        i11 = 0;
        if (i8 != 1) {
            if (i8 == 2) {
                hybridSchemaParam = new HybridSchemaParam(EnumC39924Flg.WEB);
                String queryParameter = UriProtector.getQueryParameter(uri, "ignore_cache_policy");
                if (queryParameter != null && (LJJIL17 = C38350F3i.LJJIL(queryParameter)) != null) {
                    i6 = LJJIL17.intValue();
                } else {
                    i6 = 0;
                }
                hybridSchemaParam.setIgnoreCachePolicy(i6);
                String queryParameter2 = UriProtector.getQueryParameter(uri, "disable_save_image");
                if (queryParameter2 == null || (LJJIL16 = C38350F3i.LJJIL(queryParameter2)) == null || LJJIL16.intValue() != 1) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                hybridSchemaParam.setDisableSaveImage(z9);
                String queryParameter3 = UriProtector.getQueryParameter(uri, "__use_ttnet");
                if (queryParameter3 != null && (LJJIL15 = C38350F3i.LJJIL(queryParameter3)) != null) {
                    i9 = LJJIL15.intValue();
                }
                hybridSchemaParam.set_useTtnet(i9);
                String queryParameter4 = UriProtector.getQueryParameter(uri, "sec_link_scene");
                if (queryParameter4 == null) {
                    queryParameter4 = "";
                }
                hybridSchemaParam.setSecLinkScene(queryParameter4);
                String queryParameter5 = UriProtector.getQueryParameter(uri, "need_sec_link");
                if (queryParameter5 == null || (LJJIL14 = C38350F3i.LJJIL(queryParameter5)) == null || LJJIL14.intValue() != 1) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                hybridSchemaParam.setNeedSecLink(z10);
                String queryParameter6 = UriProtector.getQueryParameter(uri, "auto_play_bgm");
                if (queryParameter6 != null && (LJJIL13 = C38350F3i.LJJIL(queryParameter6)) != null) {
                    i7 = LJJIL13.intValue();
                } else {
                    i7 = 0;
                }
                hybridSchemaParam.setAutoPlayBgm(i7);
                String queryParameter7 = UriProtector.getQueryParameter(uri, "hide_system_video_poster");
                if (queryParameter7 == null || (LJJIL12 = C38350F3i.LJJIL(queryParameter7)) == null || LJJIL12.intValue() != 1) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                hybridSchemaParam.setHideSystemVideoPoster(z11);
                String queryParameter8 = UriProtector.getQueryParameter(uri, "append_common_params");
                if (queryParameter8 == null || (LJJIL11 = C38350F3i.LJJIL(queryParameter8)) == null || LJJIL11.intValue() != 1) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                hybridSchemaParam.setAppendCommonParams(z12);
                String queryParameter9 = UriProtector.getQueryParameter(uri, "use_preload_resource_h5");
                if (queryParameter9 == null || (LJJIL10 = C38350F3i.LJJIL(queryParameter9)) == null || LJJIL10.intValue() != 1) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                hybridSchemaParam.setUsePreloadResourceH5(z13);
                String queryParameter10 = UriProtector.getQueryParameter(uri, "redirect_cdn_by_region");
                if (queryParameter10 != null && (LJJIL9 = C38350F3i.LJJIL(queryParameter10)) != null && LJJIL9.intValue() == 1) {
                    z14 = true;
                }
                hybridSchemaParam.setCdnRegionRedirect(z14);
                String queryParameter11 = UriProtector.getQueryParameter(uri, "redirect_regions");
                if (queryParameter11 == null) {
                    queryParameter11 = "";
                }
                hybridSchemaParam.setRedirectRegions(queryParameter11);
            } else {
                throw new Exception("Illegal Type");
            }
        } else {
            hybridSchemaParam = new HybridSchemaParam(EnumC39924Flg.LYNX);
            String queryParameter12 = UriProtector.getQueryParameter(uri, "enable_canvas");
            if (queryParameter12 != null) {
                z = Boolean.parseBoolean(queryParameter12);
            } else {
                z = false;
            }
            hybridSchemaParam.setEnableCanvas(z);
            String queryParameter13 = UriProtector.getQueryParameter(uri, "force_h5");
            if (queryParameter13 != null) {
                z2 = Boolean.parseBoolean(queryParameter13);
            } else {
                z2 = false;
            }
            hybridSchemaParam.setForceH5(z2);
            String queryParameter14 = UriProtector.getQueryParameter(uri, "group");
            if (queryParameter14 == null) {
                queryParameter14 = "";
            }
            hybridSchemaParam.setGroup(queryParameter14);
            String queryParameter15 = UriProtector.getQueryParameter(uri, "initial_data");
            if (queryParameter15 == null) {
                queryParameter15 = "";
            }
            hybridSchemaParam.setInitialData(queryParameter15);
            String queryParameter16 = UriProtector.getQueryParameter(uri, "preloadFonts");
            if (queryParameter16 == null) {
                queryParameter16 = "";
            }
            hybridSchemaParam.setPreloadFonts(queryParameter16);
            String queryParameter17 = UriProtector.getQueryParameter(uri, "lynxview_width");
            if (queryParameter17 != null) {
                num = C38350F3i.LJJIL(queryParameter17);
            } else {
                num = null;
            }
            hybridSchemaParam.setLynxviewWidth(num);
            String queryParameter18 = UriProtector.getQueryParameter(uri, "lynxview_height");
            if (queryParameter18 != null) {
                num2 = C38350F3i.LJJIL(queryParameter18);
            }
            hybridSchemaParam.setLynxviewHeight(num2);
            String queryParameter19 = UriProtector.getQueryParameter(uri, "preset_width");
            if (queryParameter19 != null && (LJJIL7 = C38350F3i.LJJIL(queryParameter19)) != null) {
                i = LJJIL7.intValue();
            } else {
                i = -1;
            }
            hybridSchemaParam.setPresetWidth(i);
            String queryParameter20 = UriProtector.getQueryParameter(uri, "preset_height");
            if (queryParameter20 != null && (LJJIL6 = C38350F3i.LJJIL(queryParameter20)) != null) {
                i9 = LJJIL6.intValue();
            }
            hybridSchemaParam.setPresetHeight(i9);
            String queryParameter21 = UriProtector.getQueryParameter(uri, "preset_safe_point");
            if (queryParameter21 != null) {
                z3 = Boolean.parseBoolean(queryParameter21);
            } else {
                z3 = false;
            }
            hybridSchemaParam.setPresetSafePoint(z3);
            String queryParameter22 = UriProtector.getQueryParameter(uri, "share_group");
            if (queryParameter22 != null) {
                z4 = Boolean.parseBoolean(queryParameter22);
            } else {
                z4 = false;
            }
            hybridSchemaParam.setShareGroup(z4);
            String queryParameter23 = UriProtector.getQueryParameter(uri, "thread_strategy");
            if (queryParameter23 != null && (LJJIL5 = C38350F3i.LJJIL(queryParameter23)) != null) {
                i2 = LJJIL5.intValue();
            } else {
                i2 = 0;
            }
            hybridSchemaParam.setThreadStrategy(i2);
            String queryParameter24 = UriProtector.getQueryParameter(uri, "ui_running_mode");
            if (queryParameter24 != null) {
                z5 = Boolean.parseBoolean(queryParameter24);
            } else {
                z5 = true;
            }
            hybridSchemaParam.setUiRunningMode(z5);
            String queryParameter25 = UriProtector.getQueryParameter(uri, "enable_prefetch");
            if (queryParameter25 != null && (LJJIL4 = C38350F3i.LJJIL(queryParameter25)) != null) {
                i3 = LJJIL4.intValue();
            } else {
                i3 = 0;
            }
            hybridSchemaParam.setEnablePrefetch(i3);
            String queryParameter26 = UriProtector.getQueryParameter(uri, "enable_pending_js_task");
            if (queryParameter26 != null) {
                z6 = Boolean.parseBoolean(queryParameter26);
            } else {
                z6 = false;
            }
            hybridSchemaParam.setEnablePendingJsTask(z6);
            String queryParameter27 = UriProtector.getQueryParameter(uri, "enable_js_runtime");
            if (queryParameter27 != null) {
                z7 = Boolean.parseBoolean(queryParameter27);
            } else {
                z7 = true;
            }
            hybridSchemaParam.setEnableJSRuntime(z7);
            String queryParameter28 = UriProtector.getQueryParameter(uri, "parallel_fetch_resource");
            if (queryParameter28 != null) {
                z8 = Boolean.parseBoolean(queryParameter28);
            } else {
                z8 = false;
            }
            hybridSchemaParam.setParallelFetchResource(z8);
            String queryParameter29 = UriProtector.getQueryParameter(uri, "enable_code_cache");
            if (queryParameter29 != null && (LJJIL3 = C38350F3i.LJJIL(queryParameter29)) != null) {
                i4 = LJJIL3.intValue();
            } else {
                i4 = 0;
            }
            hybridSchemaParam.setEnableCodeCache(i4);
            String queryParameter30 = UriProtector.getQueryParameter(uri, "enable_pre_code_cache");
            if (queryParameter30 != null && (LJJIL2 = C38350F3i.LJJIL(queryParameter30)) != null) {
                i5 = LJJIL2.intValue();
            } else {
                i5 = 0;
            }
            hybridSchemaParam.setEnablePreCodeCache(i5);
            String queryParameter31 = UriProtector.getQueryParameter(uri, "enable_extra_info");
            if (queryParameter31 != null && (LJJIL = C38350F3i.LJJIL(queryParameter31)) != null) {
                i11 = LJJIL.intValue();
            }
            hybridSchemaParam.setEnableExtraInfo(i11);
        }
        String queryParameter32 = UriProtector.getQueryParameter(uri, "url");
        if (queryParameter32 == null) {
            queryParameter32 = "";
        }
        hybridSchemaParam.setUrl(queryParameter32);
        String queryParameter33 = UriProtector.getQueryParameter(uri, "surl");
        if (queryParameter33 == null) {
            queryParameter33 = "";
        }
        hybridSchemaParam.setSurl(queryParameter33);
        String queryParameter34 = UriProtector.getQueryParameter(uri, "bundle");
        if (queryParameter34 == null) {
            queryParameter34 = "";
        }
        hybridSchemaParam.setBundle(queryParameter34);
        String queryParameter35 = UriProtector.getQueryParameter(uri, "channel");
        if (queryParameter35 != null) {
            str = queryParameter35;
        }
        hybridSchemaParam.setChannel(str);
        String queryParameter36 = UriProtector.getQueryParameter(uri, "dynamic");
        if (queryParameter36 != null && (LJJIL8 = C38350F3i.LJJIL(queryParameter36)) != null) {
            i10 = LJJIL8.intValue();
        }
        hybridSchemaParam.setDynamic(i10);
        String queryParameter37 = UriProtector.getQueryParameter(uri, "wait_gecko_update");
        if (queryParameter37 != null) {
            hybridSchemaParam.setWaitGeckoUpdate(Boolean.valueOf(o.LJ(queryParameter37, "1")));
        }
        String queryParameter38 = UriProtector.getQueryParameter(uri, "disable_builtin");
        if (queryParameter38 != null) {
            hybridSchemaParam.setDisableBuiltin(Boolean.valueOf(o.LJ(queryParameter38, "1")));
        }
        String queryParameter39 = UriProtector.getQueryParameter(uri, "disable_offline");
        if (queryParameter39 != null) {
            hybridSchemaParam.setDisableOffline(Boolean.valueOf(o.LJ(queryParameter39, "1")));
        }
        String queryParameter40 = UriProtector.getQueryParameter(uri, "disable_cdn");
        if (queryParameter40 != null) {
            hybridSchemaParam.setDisableCDN(Boolean.valueOf(o.LJ(queryParameter40, "1")));
        }
        String queryParameter41 = UriProtector.getQueryParameter(uri, "enable_memory_cache");
        if (queryParameter41 != null) {
            hybridSchemaParam.setEnableMemoryCache(Boolean.valueOf(o.LJ(queryParameter41, "1")));
        }
        String queryParameter42 = UriProtector.getQueryParameter(uri, "only_local");
        if (queryParameter42 != null) {
            hybridSchemaParam.setOnlyLocal(Boolean.valueOf(o.LJ(queryParameter42, "1")));
        }
        String queryParameter43 = UriProtector.getQueryParameter(uri, "accessKey");
        if (queryParameter43 != null) {
            hybridSchemaParam.setAccessKey(queryParameter43);
        }
        String queryParameter44 = UriProtector.getQueryParameter(uri, "lock_resource");
        if (queryParameter44 != null) {
            hybridSchemaParam.setLockResource(o.LJ(queryParameter44, "1"));
        }
        String queryParameter45 = UriProtector.getQueryParameter(uri, "session_id");
        if (queryParameter45 != null) {
            hybridSchemaParam.setSessionId(queryParameter45);
        }
        String queryParameter46 = UriProtector.getQueryParameter(uri, "use_forest");
        if (queryParameter46 != null) {
            hybridSchemaParam.setUseForest(o.LJ(queryParameter46, "1"));
        }
        String queryParameter47 = UriProtector.getQueryParameter(uri, "bid");
        if (queryParameter47 == null) {
            queryParameter47 = "hybridkit_default_bid";
        }
        hybridSchemaParam.setBid(queryParameter47);
        return hybridSchemaParam;
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        Throwable it = (Throwable) obj;
        o.LJIIIZ(it, "it");
        C221018lt.LIZJ("TopDataSource", "refresh tutorial error", it);
        return C76800UCe.LIZ;
    }

    public static final AutoCutTitle LIZIZ(TextStickerData textStickerData, String str) {
        o.LJIIIZ(textStickerData, "<this>");
        String textStr = textStickerData.getTextStr();
        String fontId = textStickerData.getFontId();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('(');
        LIZ.append(textStickerData.getX());
        LIZ.append(", ");
        LIZ.append(textStickerData.getY());
        LIZ.append(')');
        return new AutoCutTitle(textStr, fontId, X1D.LIZIZ(LIZ), str);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.EnumC29551Bil LJIIZILJ(com.bytedance.android.live.base.model.user.User r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1XY.LJIIZILJ(com.bytedance.android.live.base.model.user.User, boolean):X.Bil");
    }

    public static void LJFF(File file, File file2, boolean z) {
        if (file.exists() && file.length() > 0) {
            return;
        }
        file.getParentFile().mkdirs();
        String absolutePath = file.getAbsolutePath();
        String absolutePath2 = file2.getAbsolutePath();
        if (NativeTools.LJIILJJIL().LIZ) {
            PM8 LIZ = PM7.LIZ();
            if (LIZ.LJ == 1 || LIZ.LIZIZ != 2) {
                C78685UuP.LJJJLL();
                NativeTools.LJIILJJIL().LJII(absolutePath, absolutePath2);
                if (z) {
                    SystemClock.sleep(3000L);
                    return;
                }
                return;
            }
        }
        C78685UuP.LJLILLLLZI();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        FQ6 fq6 = new FQ6(absolutePath, atomicBoolean);
        try {
            new PthreadThread(fq6, "me/LogcatDump").start();
        } catch (Throwable unused) {
            atomicBoolean.set(false);
            fq6.run();
        }
    }

    public static final void LJJIIJZLJL(LiveDialogFragment liveDialogFragment, FragmentManager fragmentManager, String str) {
        o.LJIIIZ(liveDialogFragment, "<this>");
        if (!liveDialogFragment.isShowing()) {
            liveDialogFragment.show(fragmentManager, str);
        }
    }
}
