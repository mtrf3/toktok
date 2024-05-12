package X;

import Y.IDRunnableS6S1000000;
import android.content.res.AssetManager;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.gecko.TTLiveGeckoBaseUrlSetting;
import com.bytedance.android.livesdk.livesetting.gecko.TTLiveGeckoSplitSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.i0;
import java.io.File;
import java.io.InputStream;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0jD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15510jD {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C518521t.LJLIL);
    public static LinkedHashSet<String> LIZIZ;
    public static IDRunnableS6S1000000 LIZJ;

    public static final String LJI(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty("tiktok_live_live_cohost_sound_tip.mp3")) {
            return "";
        }
        if (TextUtils.isEmpty("")) {
            return LJII(str, "tiktok_live_live_cohost_sound_tip.mp3");
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("");
        LIZ2.append(File.separator);
        LIZ2.append("tiktok_live_live_cohost_sound_tip.mp3");
        return LJII(str, X1D.LIZIZ(LIZ2));
    }

    public static void LJIIL(String str) {
        TTLiveGeckoBaseUrlSetting tTLiveGeckoBaseUrlSetting = TTLiveGeckoBaseUrlSetting.INSTANCE;
        if (!tTLiveGeckoBaseUrlSetting.isEnable()) {
            return;
        }
        IDRunnableS6S1000000 iDRunnableS6S1000000 = new IDRunnableS6S1000000(str, 3);
        LIZJ = iDRunnableS6S1000000;
        C15610jN.LIZLLL(iDRunnableS6S1000000);
        C15610jN.LIZJ(LIZJ, tTLiveGeckoBaseUrlSetting.getDelayDownTime());
    }

    public static final String LIZ(String channel, String fileName) {
        boolean z;
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(fileName, "fileName");
        if (!((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isOffline()) {
            return "";
        }
        try {
            String[] list = C15380j0.LIZLLL().getAssets().list(channel);
            if (list != null) {
                if (list.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    C38489F8r LJJIIJZLJL = C30581Hy.LJJIIJZLJL(list);
                    while (LJJIIJZLJL.hasNext()) {
                        if (o.LJ(fileName, (String) LJJIIJZLJL.next())) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append(channel);
                            LIZ2.append('/');
                            LIZ2.append(fileName);
                            return X1D.LIZIZ(LIZ2);
                        }
                    }
                }
            }
        } catch (Exception e) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("getAssetPath,e:");
            LIZ3.append(e);
            C0NB.LJ("Gecko_Resource_Util", X1D.LIZIZ(LIZ3));
        }
        return "";
    }

    public static final String LIZIZ(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        String assetPath = LIZ(str, str2);
        if (TextUtils.isEmpty(assetPath)) {
            return "";
        }
        o.LJIIIZ(assetPath, "assetPath");
        if (TextUtils.isEmpty(assetPath)) {
            return "";
        }
        return i0.LJFF("asset:///", assetPath);
    }

    public static final InputStream LIZJ(String str, String str2) {
        try {
            AssetManager assets = C15380j0.LIZLLL().getAssets();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append('/');
            LIZ2.append(str2);
            return assets.open(X1D.LIZIZ(LIZ2));
        } catch (Exception e) {
            C0NB.LJI("Gecko_Resource_Util", e);
            return null;
        }
    }

    public static final String LIZLLL(String str, String fileName) {
        IHostResource iHostResource;
        String str2;
        o.LJIIIZ(fileName, "fileName");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(fileName) || TextUtils.isEmpty(str) || TextUtils.isEmpty(fileName) || (iHostResource = (IHostResource) CN1.LIZ(IHostResource.class)) == null || (str2 = (String) ListProtector.get(iHostResource.hp(str, fileName), 0)) == null) {
            return "";
        }
        return str2;
    }

    public static final List<String> LJ(String channel, String fileName) {
        String str;
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(fileName, "fileName");
        if (TextUtils.isEmpty(channel) || TextUtils.isEmpty(fileName)) {
            return C61878OQg.INSTANCE;
        }
        IHostResource iHostResource = (IHostResource) CN1.LIZ(IHostResource.class);
        if (iHostResource == null) {
            return C61878OQg.INSTANCE;
        }
        List<String> hp = iHostResource.hp(channel, fileName);
        if (TTLiveGeckoSplitSetting.INSTANCE.isEnableReport() && !TextUtils.isEmpty(channel) && !TextUtils.isEmpty(fileName)) {
            if (hp != null && (!hp.isEmpty())) {
                str = (String) ListProtector.get(hp, 0);
            } else {
                str = "";
            }
            C15440j6.LIZLLL(3, channel, fileName, str);
        }
        return hp;
    }

    public static final File LJFF(String channel, String fileName) {
        IHostResource iHostResource;
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(fileName, "fileName");
        if (TextUtils.isEmpty(channel) || TextUtils.isEmpty(fileName) || (iHostResource = (IHostResource) CN1.LIZ(IHostResource.class)) == null) {
            return null;
        }
        File Vw = iHostResource.Vw(channel, fileName);
        if (Vw != null && Vw.exists()) {
            C15440j6.LJ(channel, fileName, Vw.getAbsolutePath());
            return Vw;
        }
        C15440j6.LJ(channel, fileName, "");
        LJIIL(channel);
        return null;
    }

    public static final String LJII(String str, String str2) {
        File LJFF;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (LJFF = LJFF(str, str2)) == null || !LJFF.exists()) {
            return "";
        }
        String absolutePath = LJFF.getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "file.absolutePath");
        if (TextUtils.isEmpty(absolutePath)) {
            return "";
        }
        return i0.LJFF("file://", absolutePath);
    }

    public static final String LJIIIIZZ(String str, String fileName) {
        o.LJIIIZ(fileName, "fileName");
        return LJIIIZ(str, fileName);
    }

    public static final String LJIIIZ(String str, String fileName) {
        o.LJIIIZ(fileName, "fileName");
        List<String> LJIIJ = LJIIJ(str, fileName);
        if (!LJIIJ.isEmpty()) {
            return (String) ListProtector.get(LJIIJ, 0);
        }
        return "";
    }

    public static final List<String> LJIIJ(String channel, String fileName) {
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(fileName, "fileName");
        if (TextUtils.isEmpty(channel) || TextUtils.isEmpty(fileName)) {
            return C61878OQg.INSTANCE;
        }
        if (!TextUtils.isEmpty(fileName) && ujb.o.LJJJLIIL(fileName, "http", false)) {
            return C47261Igj.LJJIJ(fileName);
        }
        C62822Ol8 c62822Ol8 = LIZ;
        C278417k c278417k = (C278417k) c62822Ol8.getValue();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(channel);
        LIZ2.append('_');
        LIZ2.append(fileName);
        List<String> list = (List) c278417k.get(X1D.LIZIZ(LIZ2));
        if (list != null && (!list.isEmpty())) {
            return list;
        }
        String LIZIZ2 = LIZIZ(channel, fileName);
        if (TextUtils.isEmpty(LIZIZ2)) {
            LIZIZ2 = LJII(channel, fileName);
        }
        if (!TextUtils.isEmpty(LIZIZ2)) {
            List<String> LJJIJ = C47261Igj.LJJIJ(LIZIZ2);
            C278417k c278417k2 = (C278417k) c62822Ol8.getValue();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(channel);
            LIZ3.append('_');
            LIZ3.append(fileName);
            c278417k2.put(X1D.LIZIZ(LIZ3), LJJIJ);
            return LJJIJ;
        }
        List<String> LJ = LJ(channel, fileName);
        C278417k c278417k3 = (C278417k) c62822Ol8.getValue();
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(channel);
        LIZ4.append('_');
        LIZ4.append(fileName);
        c278417k3.put(X1D.LIZIZ(LIZ4), LJ);
        LJIIL(channel);
        return LJ;
    }

    public static final String LJIIJJI(String str, String str2) {
        File LJFF = LJFF(str, str2);
        if (LJFF != null && LJFF.exists()) {
            String absolutePath = LJFF.getAbsolutePath();
            o.LJIIIIZZ(absolutePath, "file.absolutePath");
            return absolutePath;
        }
        return "";
    }
}
