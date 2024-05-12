package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.librarian.Librarian;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.performance.ICrashCustomTagListener;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: X.Fhl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39681Fhl implements AttachUserData {
    public final java.util.Map<String, String> LIZ;
    public final AttachUserData LIZIZ;

    public static String LIZ(Context context) {
        StringBuilder sb = new StringBuilder();
        try {
            ApplicationInfo applicationInfo = C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 128).applicationInfo;
            for (Field field : ApplicationInfo.class.getFields()) {
                try {
                    Object obj = field.get(applicationInfo);
                    sb.append(field.getName());
                    sb.append(": ");
                    if (obj != null && obj.getClass().isArray()) {
                        if (obj instanceof Object[]) {
                            sb.append(Arrays.toString((Object[]) obj));
                        } else {
                            int length = Array.getLength(obj);
                            Object[] objArr = new Object[length];
                            for (int i = 0; i < length; i++) {
                                objArr[i] = Array.get(obj, i);
                            }
                            sb.append(Arrays.toString(objArr));
                        }
                    } else {
                        sb.append(obj);
                    }
                    sb.append("\n");
                } catch (IllegalAccessException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
            C16880lQ.LLLLIIL(e2);
        }
        return sb.toString();
    }

    public static java.util.Map LIZIZ(java.util.Map map) {
        if (map == null) {
            return map;
        }
        if (!map.containsKey("curUserId") && ((RBX) HG3.LJIILL()).isLogin()) {
            map.put("curUserId", ((RBX) HG3.LJIILL()).getCurUserId());
            if (((RBX) HG3.LJIILL()).getCurUser() != null) {
                map.put("shortId", ((RBX) HG3.LJIILL()).getCurUser().getShortId());
                map.put("nickname", ((RBX) HG3.LJIILL()).getCurUser().getNickname());
            }
        }
        return map;
    }

    @Override // com.bytedance.crash.AttachUserData
    public final java.util.Map<? extends String, ? extends String> getUserData(CrashType crashType) {
        int i;
        File[] listFiles;
        File parentFile;
        String[] list;
        if (crashType == CrashType.JAVA || crashType == CrashType.LAUNCH || crashType == CrashType.NATIVE) {
            C39682Fhm c39682Fhm = new C39682Fhm();
            try {
                c39682Fhm.LIZ = C39687Fhr.LJIILLIIL();
                c39682Fhm.LIZIZ = C39687Fhr.LJIIZILJ();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("/proc/");
                LIZ.append(Process.myPid());
                LIZ.append("/fd");
                File file = new File(X1D.LIZIZ(LIZ));
                if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                    i = listFiles.length;
                } else {
                    i = -1;
                }
                c39682Fhm.LIZLLL = i;
                c39682Fhm.LJ = C39687Fhr.LJIILJJIL();
                c39682Fhm.LIZJ = C39687Fhr.LJIIJ();
            } catch (Exception unused) {
                c39682Fhm = null;
            }
            if (c39682Fhm != null) {
                ((HashMap) this.LIZ).put("vmPeak", String.valueOf(c39682Fhm.LIZ));
                ((HashMap) this.LIZ).put("vmSize", String.valueOf(c39682Fhm.LIZIZ));
                ((HashMap) this.LIZ).put("fdCount", String.valueOf(c39682Fhm.LIZLLL));
                ((HashMap) this.LIZ).put("maxFdCount", String.valueOf(c39682Fhm.LIZJ));
                ((HashMap) this.LIZ).put("threadCount", String.valueOf(c39682Fhm.LJ));
            }
        }
        ((HashMap) this.LIZ).put("root", String.valueOf(C39687Fhr.LJIJ()));
        ((HashMap) this.LIZ).put("librarian", Arrays.toString(Librarian.LIZIZ()));
        ((HashMap) this.LIZ).put("librarian_origin", Arrays.toString(Librarian.LIZJ()));
        ((HashMap) this.LIZ).put("class_loader", C39681Fhl.class.getClassLoader().toString());
        ((HashMap) this.LIZ).put("signatures", QK9.LIZLLL(EF7.LIZIZ()));
        Npth.addTag("player_count", String.valueOf(C46664ITc.LJIJ.LJIIZILJ));
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                ((HashMap) this.LIZ).put("apkPaths", TextUtils.join("\n", (String[]) Reflect.on(EF7.LIZIZ().getAssets()).call("getApkPaths").get()));
            } catch (Throwable unused2) {
            }
        }
        try {
            ((HashMap) this.LIZ).put("mLoaders", String.valueOf(Reflect.on(Reflect.on("android.app.ApplicationLoaders").call("getDefault").get()).field("mLoaders", new Class[0]).get()));
        } catch (Throwable unused3) {
        }
        try {
            ((HashMap) this.LIZ).put("appInfo", LIZ(EF7.LIZIZ()));
        } catch (Throwable unused4) {
        }
        try {
            Context LIZIZ = EF7.LIZIZ();
            StringBuilder sb = new StringBuilder();
            String str = LIZIZ.getApplicationInfo().sourceDir;
            if (str != null && (parentFile = new File(str).getParentFile()) != null && (list = parentFile.list()) != null) {
                for (String str2 : list) {
                    sb.append(str2);
                    sb.append("\n");
                }
            }
            ((HashMap) this.LIZ).put("appInstallationDirectoryFileList", sb.toString());
        } catch (Throwable unused5) {
        }
        Npth.addTag("is_pad", String.valueOf(LFH.LIZIZ.LIZLLL().LJIJ().LIZLLL()));
        java.util.Map<String, String> map = this.LIZ;
        LIZIZ(map);
        return map;
    }

    public C39681Fhl(Context context, EPM epm) {
        String str;
        this.LIZIZ = epm;
        IAVSettingsService avsettingsConfig = AVExternalServiceImpl.LIZ().configService().avsettingsConfig();
        HashMap hashMap = new HashMap();
        this.LIZ = hashMap;
        hashMap.put("git_sha", EF7.LJIIJJI);
        hashMap.put("git_branch", EF7.LJIIJ);
        hashMap.put("abi", System.getProperty("os.arch"));
        hashMap.put("veSdk", avsettingsConfig.getVESDKVersion());
        hashMap.put("effectSdk", avsettingsConfig.getEffectVersion());
        IXN ixn = IXN.LIZJ;
        hashMap.put("player_type", String.valueOf(ixn.getPlayerType()));
        hashMap.put("preloader_type", String.valueOf(ixn.getPreloadType()));
        hashMap.put("ttplayer_version", String.valueOf(2101494190));
        if (AppLog.getSwitchToBdtracker()) {
            str = QI9.LJIIJ;
        } else {
            str = QK9.LJI;
        }
        hashMap.put("release_build", str);
        hashMap.put("real_machine", String.valueOf(C63081OpJ.LLFF()));
        String LIZ = C39685Fhp.LIZIZ(context).LIZ("");
        if (!TextUtils.isEmpty(LIZ)) {
            hashMap.put("jenkins_build_result", LIZ);
        }
        AVExternalServiceImpl.LIZ().provideErrorReporter().addCrashCustomTagListener(new ICrashCustomTagListener() { // from class: X.Fhn
            @Override // com.ss.android.ugc.aweme.services.performance.ICrashCustomTagListener
            public final void setCustomTag(String str2, String str3) {
                C39681Fhl.this.LIZ.put(str2, str3);
            }
        });
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(Build.MANUFACTURER);
        LIZ2.append("&&");
        LIZ2.append(Build.BRAND);
        LIZ2.append("&&");
        LIZ2.append(Build.MODEL);
        LIZ2.append("&&");
        LIZ2.append(Build.FINGERPRINT);
        hashMap.put("device_info", X1D.LIZIZ(LIZ2));
        if (FCD.LJI(context)) {
            LiveOuterService.LJJJLL().LIZIZ();
            hashMap.put("liveCoreSdk", "15.0.1_1");
            LIZIZ(hashMap);
        }
    }
}
