package X;

import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.VideoResource;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftResourceManagerSettings;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Cn4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32366Cn4 {
    public static final C32366Cn4 LIZ = new C32366Cn4();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C32371Cn9.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C32369Cn7.LJLIL);
    public static List<AssetsModel> LIZLLL = new ArrayList();
    public static final List<AssetsModel> LJ = new ArrayList();
    public static final CopyOnWriteArraySet<Long> LJFF = new CopyOnWriteArraySet<>();
    public static final HashMap<String, C32417Cnt> LJI = new HashMap<>();

    static {
        Application application;
        try {
            ((IGiftService) CN1.LIZ(IGiftService.class)).initGiftResourceManager(C15380j0.LIZLLL());
        } catch (Exception unused) {
        }
        PU0 LJI2 = PU0.LJI();
        C32423Cnz c32423Cnz = new C32423Cnz();
        if (!((CopyOnWriteArrayList) LJI2.LIZJ).contains(c32423Cnz)) {
            ((CopyOnWriteArrayList) LJI2.LIZJ).add(c32423Cnz);
        }
        Context LIZLLL2 = C15380j0.LIZLLL();
        Context context = null;
        if (LIZLLL2 != null) {
            context = C16880lQ.LLLLL(LIZLLL2);
        }
        if ((context instanceof Application) && (application = (Application) context) != null) {
            application.registerActivityLifecycleCallbacks(new C32337Cmb());
        }
    }

    public static InterfaceC32340Cme LJFF() {
        return (InterfaceC32340Cme) LIZJ.getValue();
    }

    public static void LJII() {
        C32396CnY LIZIZ2 = C32395CnX.LIZIZ();
        List<GiftPage> giftPageList = GiftManager.inst().getGiftPageList();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<GiftPage> it = giftPageList.iterator();
        while (it.hasNext()) {
            for (Gift gift : it.next().gifts) {
                if (gift.isDisplayedOnPanel) {
                    long j = gift.primaryEffectId;
                    if (j != 0) {
                        arrayList.add(Long.valueOf(j));
                        List<GiftColorInfo> list = gift.colorInfos;
                        if (list != null) {
                            Iterator<GiftColorInfo> it2 = list.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(it2.next().colorEffectId);
                            }
                        }
                    }
                }
            }
        }
        for (AssetsModel assetsModel : LIZLLL) {
            if (arrayList.contains(Long.valueOf(assetsModel.id))) {
                arrayList2.add(assetsModel);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            AssetsModel assetsModel2 = (AssetsModel) it3.next();
            C32399Cnb c32399Cnb = new C32399Cnb(LJI);
            c32399Cnb.LIZLLL = 2;
            EnumC32342Cmg enumC32342Cmg = EnumC32342Cmg.PRE_DOWNLOAD;
            o.LJIIIZ(enumC32342Cmg, "<set-?>");
            c32399Cnb.LIZJ = enumC32342Cmg;
            c32399Cnb.LIZIZ = assetsModel2.id;
            if (LIZIZ2 != null) {
                LIZIZ2.LIZ(null, c32399Cnb);
            }
        }
    }

    public static void LIZ(String from) {
        o.LJIIIZ(from, "from");
        if (LiveGiftResourceManagerSettings.INSTANCE.enableDeleteUnused()) {
            C32399Cnb c32399Cnb = new C32399Cnb(LJI);
            EnumC32342Cmg enumC32342Cmg = EnumC32342Cmg.DELETE_UNUSED;
            o.LJIIIZ(enumC32342Cmg, "<set-?>");
            c32399Cnb.LIZJ = enumC32342Cmg;
            C32407Cnj LIZ2 = C32395CnX.LIZ();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (LIZ2 != null) {
                LIZ2.LIZ(new C32309Cm9(elapsedRealtime, from), c32399Cnb);
            }
        }
    }

    public static AssetsModel LIZJ(long j) {
        AssetsModel assetsModel;
        Iterator<AssetsModel> it = LIZLLL.iterator();
        while (true) {
            if (it.hasNext()) {
                assetsModel = it.next();
                if (assetsModel.id == j) {
                    break;
                }
            } else {
                assetsModel = null;
                break;
            }
        }
        return assetsModel;
    }

    public static String LIZLLL(List list) {
        String ret = GsonProtectorUtils.toJson(C09650Zl.LIZIZ, list);
        o.LJIIIIZZ(ret, "ret");
        return s.LJJZZIII("]", s.LJJLL("[", ret));
    }

    public static long LJ(C32420Cnw c32420Cnw) {
        if (c32420Cnw == null) {
            return 0L;
        }
        try {
            String LJFF2 = PU0.LJI().LJFF(c32420Cnw, Boolean.FALSE);
            o.LJIIIIZZ(LJFF2, "inst().getResourcePath(request, false)");
            File file = new File(LJFF2);
            if (file.exists()) {
                return FileUtils.INSTANCE.getFolderSize(file) / 1024;
            }
        } catch (Throwable unused) {
        }
        return 0L;
    }

    public static String LJI(C32420Cnw c32420Cnw) {
        String str;
        String str2;
        List<VideoResource> list;
        if (c32420Cnw == null) {
            return "";
        }
        AssetsModel LIZJ2 = LIZJ(c32420Cnw.LIZIZ);
        if (LIZJ2 != null) {
            str = LIZJ2.bytevc1Md5;
        } else {
            str = null;
        }
        if (o.LJ(str, c32420Cnw.LJ)) {
            str2 = "bytevc1";
        } else {
            str2 = "h264";
        }
        if (LIZJ2 != null && (list = LIZJ2.videoResourceList) != null) {
            for (VideoResource videoResource : list) {
                if (o.LJ(videoResource.videoMd5, c32420Cnw.LJ)) {
                    str2 = videoResource.videoTypeName;
                }
            }
        }
        return str2;
    }

    public static void LJIIIIZZ(AssetsModel assetsModel) {
        if (assetsModel != null && assetsModel.resourceType == AssetsModel.RESOURCE_TYPE_MP4) {
            LJFF.add(Long.valueOf(assetsModel.id));
        }
    }

    public static void LIZIZ(long j, InterfaceC32416Cns interfaceC32416Cns, int i, java.util.Map map, C32420Cnw c32420Cnw) {
        long j2;
        AssetsModel LIZ2 = C32341Cmf.LIZ(j);
        EnumC32342Cmg enumC32342Cmg = EnumC32342Cmg.MESSAGE_USE;
        C32399Cnb c32399Cnb = new C32399Cnb(LJI);
        c32399Cnb.LIZLLL = i;
        if (LIZ2 != null) {
            j2 = LIZ2.id;
        } else {
            j2 = 0;
        }
        c32399Cnb.LIZIZ = j2;
        o.LJIIIZ(enumC32342Cmg, "<set-?>");
        c32399Cnb.LIZJ = enumC32342Cmg;
        c32399Cnb.LJ = interfaceC32416Cns;
        c32399Cnb.LJIILL = map;
        c32399Cnb.LJIILLIIL = c32420Cnw;
        C32396CnY LIZIZ2 = C32395CnX.LIZIZ();
        if (LIZIZ2 != null) {
            LIZIZ2.LIZ(null, c32399Cnb);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010a  */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List, T] */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, java.lang.Iterable, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C73411SrX LJIIIZ(int r29, java.lang.Long r30, boolean r31, java.util.ArrayList r32, X.InterfaceC32013ChN r33) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32366Cn4.LJIIIZ(int, java.lang.Long, boolean, java.util.ArrayList, X.ChN):X.SrX");
    }
}
