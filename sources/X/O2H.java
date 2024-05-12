package X;

import android.app.Application;
import android.text.TextUtils;
import com.bytedance.lynx.hybrid.service.IResourceService;
import java.io.File;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public final class O2H implements InterfaceC61263O2p {
    public IResourceService LIZIZ;
    public File LIZJ;
    public final C58313Mub LIZ = new C58313Mub(2);
    public final C39928Flk LIZLLL = C39928Flk.LIZ;

    @Override // X.InterfaceC61263O2p
    public final void getSdkVersion() {
    }

    @Override // X.InterfaceC61252O2e
    public final void LJFF(IResourceService iResourceService) {
        this.LIZIZ = iResourceService;
    }

    @Override // X.InterfaceC61252O2e
    public final java.util.Map<String, String> LIZIZ(String offlineDir, String str) {
        File[] listFiles;
        o.LJIIJ(offlineDir, "offlineDir");
        File LJIIIIZZ = LJIIIIZZ(offlineDir, C39927Flj.LIZIZ(C61270O2w.LIZ.LIZ(this.LIZIZ), str).isRelativePath());
        File file = new File(LJIIIIZZ, str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (file.isDirectory() && file.exists() && (listFiles = file.listFiles()) != null) {
            for (File _singleChannelFile : listFiles) {
                o.LJFF(_singleChannelFile, "_singleChannelFile");
                if (_singleChannelFile.isDirectory()) {
                    String absolutePath = LJIIIIZZ.getAbsolutePath();
                    o.LJFF(absolutePath, "rootDir.absolutePath");
                    String name = _singleChannelFile.getName();
                    o.LJFF(name, "_singleChannelFile.name");
                    Long LJIIIZ = LJIIIZ(absolutePath, str, name);
                    if (LJIIIZ != null && LJIIIZ.longValue() > 0) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(_singleChannelFile.getAbsolutePath());
                        String str2 = File.separator;
                        LIZ.append(str2);
                        LIZ.append(LJIIIZ);
                        LIZ.append(str2);
                        LIZ.append("res");
                        File file2 = new File(JBR.LJFF(LIZ, str2, "preload.json", LIZ));
                        if (file2.exists() && file2.canRead()) {
                            String name2 = _singleChannelFile.getName();
                            o.LJFF(name2, "_singleChannelFile.name");
                            String absolutePath2 = file2.getAbsolutePath();
                            o.LJFF(absolutePath2, "preloadJsonFile.absolutePath");
                            linkedHashMap.put(name2, absolutePath2);
                        }
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0271, code lost:
    
        if (r2 != null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0223, code lost:
    
        if (r1 != null) goto L84;
     */
    @Override // X.InterfaceC61263O2p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.O1V LJI(android.net.Uri r17, X.O1M r18) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O2H.LJI(android.net.Uri, X.O1M):X.O1V");
    }

    public final File LJIIIIZZ(String str, boolean z) {
        if (!z) {
            return new File(str);
        }
        if (this.LIZJ == null) {
            Application application = C61270O2w.LIZ.LIZJ;
            if (application != null) {
                this.LIZJ = application.getFilesDir();
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        try {
            File file = new File(this.LIZJ, str);
            if (!file.exists()) {
                file.mkdirs();
                return file;
            }
            return file;
        } catch (Exception unused) {
            return new File(str);
        }
    }

    public static String LJII(File file, String str, String str2) {
        boolean z;
        boolean z2;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (str2 == null || str2.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (s.LJJLIIIJL(str2, "/", 0, false, 6) == 0) {
                    str2 = str2.substring(1);
                    o.LJFF(str2, "(this as java.lang.String).substring(startIndex)");
                }
                if (s.LJJLIIJ(str2, "/", 6) == str2.length() - 1) {
                    str2 = str2.substring(0, s.LJJLIIJ(str2, "/", 6));
                    o.LJFF(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                try {
                    File file2 = new File(file, str);
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    String absolutePath = file2.getAbsolutePath();
                    o.LJFF(absolutePath, "file.absolutePath");
                    File file3 = new File(absolutePath, str2);
                    if (!file3.exists()) {
                        file3.mkdirs();
                    }
                    String LJIIIZ = C70657RoD.LJIIIZ(str, str2);
                    C39048FUe c39048FUe = C39048FUe.LIZIZ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("getChannelPath:");
                    LIZ.append(LJIIIZ);
                    c39048FUe.LIZ(X1D.LIZIZ(LIZ), EnumC39866Fkk.D, "GeckoXDepender");
                    return LJIIIZ;
                } catch (Throwable unused) {
                }
            }
        }
        return null;
    }

    public static Long LJIIIZ(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            C39048FUe c39048FUe = C39048FUe.LIZIZ;
            StringBuilder LIZLLL = C06540Nm.LIZLLL("getLatestChannelVersion:rootdir:", str, ",accessKey:", str2, ",channel:");
            LIZLLL.append(str3);
            String LIZIZ = X1D.LIZIZ(LIZLLL);
            EnumC39866Fkk enumC39866Fkk = EnumC39866Fkk.D;
            c39048FUe.LIZ(LIZIZ, enumC39866Fkk, "GeckoXDepender");
            try {
                File file = new File(str, str2);
                if (!file.exists()) {
                    file.mkdirs();
                }
                String absolutePath = file.getAbsolutePath();
                o.LJFF(absolutePath, "file.absolutePath");
                File file2 = new File(absolutePath, str3);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                Long LIZIZ2 = OAS.LIZIZ(file2);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("getLatestChannelVersion:");
                LIZ.append(LIZIZ2);
                c39048FUe.LIZ(X1D.LIZIZ(LIZ), enumC39866Fkk, "GeckoXDepender");
                return LIZIZ2;
            } catch (Throwable unused) {
                C39048FUe.LIZIZ.LIZ("getLatestChannelVersion:error", EnumC39866Fkk.D, "GeckoXDepender");
            }
        }
        return null;
    }

    @Override // X.InterfaceC61252O2e
    public final boolean LIZ(String rootDir, String accessKey, String channel) {
        o.LJIIJ(rootDir, "rootDir");
        o.LJIIJ(accessKey, "accessKey");
        o.LJIIJ(channel, "channel");
        if (TextUtils.isEmpty(accessKey) || TextUtils.isEmpty(channel) || LJII(LJIIIIZZ(rootDir, C39927Flj.LIZIZ(C61270O2w.LIZ.LIZ(this.LIZIZ), accessKey).isRelativePath()), accessKey, channel) == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC61252O2e
    public final String LIZJ(String offlineDir, String accessKey, String relativePath) {
        boolean z;
        boolean z2;
        o.LJIIJ(offlineDir, "offlineDir");
        o.LJIIJ(accessKey, "accessKey");
        o.LJIIJ(relativePath, "relativePath");
        boolean z3 = false;
        if (accessKey.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str = null;
        if (!z) {
            if (relativePath.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (s.LJJLIIIJL(relativePath, "/", 0, false, 6) != 0) {
                    return LJII(LJIIIIZZ(offlineDir, C39927Flj.LIZIZ(C61270O2w.LIZ.LIZ(this.LIZIZ), accessKey).isRelativePath()), accessKey, relativePath);
                }
                StringBuilder sb = new StringBuilder();
                Object[] array = new OJD("/").split(relativePath, 0).toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    if (strArr.length <= 1) {
                        return null;
                    }
                    String str2 = strArr[1];
                    int length = strArr.length;
                    for (int i = 2; i < length; i++) {
                        sb.append(File.separator);
                        sb.append(strArr[i]);
                    }
                    if (TextUtils.isEmpty(str2)) {
                        return null;
                    }
                    try {
                        File file = new File(LJIIIIZZ(offlineDir, C39927Flj.LIZIZ(C61270O2w.LIZ.LIZ(this.LIZIZ), accessKey).isRelativePath()), accessKey);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        String absolutePath = file.getAbsolutePath();
                        o.LJFF(absolutePath, "file.absolutePath");
                        File file2 = new File(absolutePath, str2);
                        if (!file2.exists()) {
                            file2.mkdirs();
                        }
                        file.getParentFile();
                        String LJIIIZ = C70657RoD.LJIIIZ(accessKey, str2);
                        if (sb.length() > 0) {
                            z3 = true;
                        }
                        if (z3) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append(LJIIIZ);
                            LIZ.append(sb.toString());
                            LJIIIZ = X1D.LIZIZ(LIZ);
                        }
                        C39048FUe c39048FUe = C39048FUe.LIZIZ;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("getRnResPath:");
                        LIZ2.append(LJIIIZ);
                        c39048FUe.LIZ(X1D.LIZIZ(LIZ2), EnumC39866Fkk.D, "GeckoXDepender");
                        str = LJIIIZ;
                        return str;
                    } catch (Throwable unused) {
                        return str;
                    }
                }
                throw new C37692Eqm("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        return null;
    }

    @Override // X.InterfaceC61263O2p
    public final long LIZLLL(String rootDir, String accessKey, String channel) {
        o.LJIIJ(rootDir, "rootDir");
        o.LJIIJ(accessKey, "accessKey");
        o.LJIIJ(channel, "channel");
        if (!TextUtils.isEmpty(accessKey) && !TextUtils.isEmpty(channel)) {
            String absolutePath = LJIIIIZZ(rootDir, C39927Flj.LIZIZ(C61270O2w.LIZ.LIZ(this.LIZIZ), accessKey).isRelativePath()).getAbsolutePath();
            o.LJFF(absolutePath, "getGeckoXOfflineRootDirF…th\n        ).absolutePath");
            Long LJIIIZ = LJIIIZ(absolutePath, accessKey, channel);
            if (LJIIIZ != null) {
                return LJIIIZ.longValue();
            }
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0199  */
    @Override // X.InterfaceC61252O2e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.O1M r18, java.util.List<java.lang.String> r19, X.InterfaceC61273O2z r20) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O2H.LJ(X.O1M, java.util.List, X.O2z):void");
    }
}
