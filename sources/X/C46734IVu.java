package X;

import android.text.TextUtils;
import com.ss.android.ugc.playerkit.cache.IVideoCacheConfig;
import com.ss.android.ugc.playerkit.exp.model.CustomCacheDirConfigExp;
import com.ss.android.ugc.playerkit.injector.InjectedConfigManager;
import com.ss.android.ugc.playerkit.simapicommon.model.SimUrlModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.IVu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46734IVu {
    public static boolean LIZLLL() {
        IVideoCacheConfig iVideoCacheConfig;
        synchronized (C62814Ol0.class) {
            if (C62814Ol0.LJLIL == null) {
                IVideoCacheConfig iVideoCacheConfig2 = (IVideoCacheConfig) InjectedConfigManager.getConfig(IVideoCacheConfig.class);
                C62814Ol0.LJLIL = iVideoCacheConfig2;
                if (iVideoCacheConfig2 == null) {
                    C62814Ol0.LJLIL = new C46735IVv();
                }
            }
            if (C62814Ol0.LJLIL == null) {
                if (!C46982IcE.LIZIZ().isDebug()) {
                    C46982IcE.LJI().ensureNotReachHere(new Exception(), "IVideoCacheConfig getInstance NULL.");
                } else {
                    throw new RuntimeException("IVideoCacheConfig getInstance NULL.");
                }
            }
            iVideoCacheConfig = C62814Ol0.LJLIL;
        }
        iVideoCacheConfig.LIZ();
        return false;
    }

    public static boolean LIZ(ITZ itz) {
        if (!IXN.LIZJ.isEnableBytevc1()) {
            return false;
        }
        if (!ITZ.TT.equals(itz) && !ITZ.TT_HARDWARE.equals(itz)) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(SimUrlModel simUrlModel) {
        List<String> urlList;
        if (simUrlModel == null || (urlList = simUrlModel.getUrlList()) == null || urlList.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : urlList) {
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        simUrlModel.setUrlList(arrayList);
        if (urlList.isEmpty() || TextUtils.isEmpty(simUrlModel.getUri())) {
            return false;
        }
        return true;
    }

    public static EnumC46736IVw LIZJ(String str) {
        if (!TextUtils.isEmpty(str)) {
            Object value = IZ8.LLJJI.getValue();
            o.LJIIIIZZ(value, "<get-CustomCacheDirConfigExp>(...)");
            java.util.Map<String, String> config = ((CustomCacheDirConfigExp) value).getConfig();
            if (config != null && config.containsKey(str)) {
                String str2 = config.get(str);
                if (!TextUtils.isEmpty(str2)) {
                    for (EnumC46736IVw enumC46736IVw : EnumC46736IVw.values()) {
                        if (str2.equals(enumC46736IVw.getCacheDir())) {
                            return enumC46736IVw;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static int LJ(IVU[] ivuArr, int i, int i2) {
        int time;
        int frame;
        if (ivuArr == null || ivuArr.length < 1 || i < 1 || i2 < 1) {
            return -1;
        }
        int i3 = 0;
        int i4 = Integer.MAX_VALUE;
        if (i == 1) {
            if (ivuArr.length < 1) {
                return -1;
            }
            int i5 = -1;
            while (true) {
                if (i3 < ivuArr.length) {
                    IVU ivu = ivuArr[i3];
                    if (ivu != null && (frame = ivu.getFrame()) != 0) {
                        int i6 = frame - i2;
                        if (i6 == 0) {
                            break;
                        }
                        if (i6 > 0 && i6 < i4) {
                            i5 = i3;
                            i4 = i6;
                        }
                    }
                    i3++;
                } else {
                    i3 = i5;
                    break;
                }
            }
            if (i3 == -1 || i3 >= ivuArr.length) {
                return -1;
            }
            return ivuArr[i3].getOffset();
        }
        if (i != 2 || ivuArr.length < 1) {
            return -1;
        }
        int i7 = -1;
        while (true) {
            if (i3 < ivuArr.length) {
                IVU ivu2 = ivuArr[i3];
                if (ivu2 != null && (time = ivu2.getTime()) != 0) {
                    int i8 = time - i2;
                    if (i8 == 0) {
                        break;
                    }
                    if (i8 > 0 && i8 < i4) {
                        i7 = i3;
                        i4 = i8;
                    }
                }
                i3++;
            } else {
                i3 = i7;
                break;
            }
        }
        if (i3 == -1 || i3 >= ivuArr.length) {
            return -1;
        }
        return ivuArr[i3].getOffset();
    }
}
