package X;

import android.app.Application;
import android.text.TextUtils;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.O1f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61227O1f implements InterfaceC61241O1t {
    public IResourceLoaderService LIZIZ;
    public File LIZJ;
    public final C58313Mub LIZ = new C58313Mub(1);
    public final C61233O1l LIZLLL = C61233O1l.LIZ;

    @Override // X.InterfaceC61241O1t
    public final void getSdkVersion() {
    }

    @Override // X.O1Z
    public final void LJ(IResourceLoaderService iResourceLoaderService) {
        this.LIZIZ = iResourceLoaderService;
    }

    @Override // X.O1Z
    public final java.util.Map<String, String> LIZIZ(String offlineDir, String str) {
        File[] listFiles;
        o.LJIIJ(offlineDir, "offlineDir");
        File LJII = LJII(offlineDir, O1F.LIZIZ(C61238O1q.LIZ.LIZ(this.LIZIZ), str).isRelativePath());
        File file = new File(LJII, str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (file.isDirectory() && file.exists() && (listFiles = file.listFiles()) != null) {
            for (File _singleChannelFile : listFiles) {
                o.LJFF(_singleChannelFile, "_singleChannelFile");
                if (_singleChannelFile.isDirectory()) {
                    String absolutePath = LJII.getAbsolutePath();
                    o.LJFF(absolutePath, "rootDir.absolutePath");
                    String name = _singleChannelFile.getName();
                    o.LJFF(name, "_singleChannelFile.name");
                    Long LJIIIIZZ = LJIIIIZZ(absolutePath, str, name);
                    if (LJIIIIZZ != null && LJIIIIZZ.longValue() > 0) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(_singleChannelFile.getAbsolutePath());
                        String str2 = File.separator;
                        LIZ.append(str2);
                        LIZ.append(LJIIIIZZ);
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

    public final File LJII(String str, boolean z) {
        if (!z) {
            return new File(str);
        }
        if (this.LIZJ == null) {
            Application application = C61238O1q.LIZ.LIZJ;
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

    public static String LJI(File file, String str, String str2) {
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
                    return C70657RoD.LJIIIZ(str, str2);
                } catch (Throwable unused) {
                }
            }
        }
        return null;
    }

    public static Long LJIIIIZZ(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
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
                return OAS.LIZIZ(file2);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    @Override // X.O1Z
    public final boolean LIZ(String rootDir, String accessKey, String channel) {
        o.LJIIJ(rootDir, "rootDir");
        o.LJIIJ(accessKey, "accessKey");
        o.LJIIJ(channel, "channel");
        if (TextUtils.isEmpty(accessKey) || TextUtils.isEmpty(channel) || LJI(LJII(rootDir, O1F.LIZIZ(C61238O1q.LIZ.LIZ(this.LIZIZ), accessKey).isRelativePath()), accessKey, channel) == null) {
            return false;
        }
        return true;
    }

    @Override // X.O1Z
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
        if (!z) {
            if (relativePath.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (s.LJJLIIIJL(relativePath, "/", 0, false, 6) != 0) {
                    return LJI(LJII(offlineDir, O1F.LIZIZ(C61238O1q.LIZ.LIZ(this.LIZIZ), accessKey).isRelativePath()), accessKey, relativePath);
                }
                StringBuilder sb = new StringBuilder();
                Object[] array = new OJD("/").split(relativePath, 0).toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    if (strArr.length <= 1) {
                        return null;
                    }
                    String str = strArr[1];
                    int length = strArr.length;
                    for (int i = 2; i < length; i++) {
                        sb.append(File.separator);
                        sb.append(strArr[i]);
                    }
                    if (TextUtils.isEmpty(str)) {
                        return null;
                    }
                    try {
                        File LJII = LJII(offlineDir, O1F.LIZIZ(C61238O1q.LIZ.LIZ(this.LIZIZ), accessKey).isRelativePath());
                        if (!LJII.exists()) {
                            LJII.mkdirs();
                        }
                        String absolutePath = new File(LJII, accessKey).getAbsolutePath();
                        o.LJFF(absolutePath, "File(rootDir, accessKey).absolutePath");
                        File file = new File(absolutePath, str);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        String LJIIIZ = C70657RoD.LJIIIZ(accessKey, str);
                        if (sb.length() > 0) {
                            z3 = true;
                        }
                        if (z3) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append(LJIIIZ);
                            LIZ.append(sb.toString());
                            LJIIIZ = X1D.LIZIZ(LIZ);
                        }
                        return LJIIIZ;
                    } catch (Throwable unused) {
                        return null;
                    }
                }
                throw new C37692Eqm("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        return null;
    }

    @Override // X.InterfaceC61241O1t
    public final long LIZLLL(String rootDir, String accessKey, String channel) {
        o.LJIIJ(rootDir, "rootDir");
        o.LJIIJ(accessKey, "accessKey");
        o.LJIIJ(channel, "channel");
        if (!TextUtils.isEmpty(accessKey) && !TextUtils.isEmpty(channel)) {
            String absolutePath = LJII(rootDir, O1F.LIZIZ(C61238O1q.LIZ.LIZ(this.LIZIZ), accessKey).isRelativePath()).getAbsolutePath();
            o.LJFF(absolutePath, "getGeckoXOfflineRootDirF…           ).absolutePath");
            Long LJIIIIZZ = LJIIIIZZ(absolutePath, accessKey, channel);
            if (LJIIIIZZ != null) {
                return LJIIIIZZ.longValue();
            }
        }
        return 0L;
    }

    @Override // X.O1Z
    public final void LJFF(O1L o1l, List<String> list, InterfaceC61240O1s interfaceC61240O1s) {
        String str;
        String str2;
        InterfaceC61566OEg c64602PXa;
        C59125NIj c59125NIj;
        String bid;
        C61226O1e c61226O1e = new C61226O1e(this, o1l, interfaceC61240O1s, list);
        String str3 = o1l.LJIILJJIL;
        C58313Mub c58313Mub = this.LIZ;
        IResourceLoaderService iResourceLoaderService = this.LIZIZ;
        if (iResourceLoaderService != null) {
            str = iResourceLoaderService.getBid();
        } else {
            str = null;
        }
        String str4 = "";
        if (str == null) {
            str = "";
        }
        C61520OCm LIZ = c58313Mub.LIZ(str3, str);
        if (LIZ == null) {
            O1R o1r = C61238O1q.LIZ;
            O1E LIZ2 = o1r.LIZ(this.LIZIZ);
            Application application = o1r.LIZJ;
            if (LIZ2.LJIIIIZZ.length() == 0) {
                str2 = "000";
            } else {
                str2 = LIZ2.LJIIIIZZ;
            }
            String str5 = o1l.LJIILJJIL;
            File LJII = LJII(O1F.LIZIZ(LIZ2, str5).getOfflineDir(), O1F.LIZIZ(LIZ2, str5).isRelativePath());
            Object networkImpl = O1F.LIZIZ(LIZ2, str5).getNetworkImpl();
            if (networkImpl == null) {
                networkImpl = LIZ2.LJIILIIL;
            }
            if (networkImpl instanceof InterfaceC61566OEg) {
                c64602PXa = (InterfaceC61566OEg) networkImpl;
            } else {
                c64602PXa = new C64602PXa();
            }
            InterfaceC60323Nlv interfaceC60323Nlv = o1l.LJIIJ;
            if (interfaceC60323Nlv != null) {
                c59125NIj = (C59125NIj) interfaceC60323Nlv.LLLIIL(C59125NIj.class);
            } else {
                c59125NIj = null;
            }
            try {
            } catch (Exception unused) {
                LIZ = null;
            }
            if (application != null) {
                O2T o2t = new O2T(C16880lQ.LLLLJI(application));
                o2t.LJIIIZ = LIZ2.LIZLLL;
                o2t.LIZJ(CastLongProtector.parseLong(LIZ2.LJI));
                o2t.LJII = LIZ2.LJII;
                o2t.LIZ = c64602PXa;
                o2t.LJFF = c59125NIj;
                o2t.LJ = this.LIZLLL;
                O1F.LIZIZ(o1r.LIZ(this.LIZIZ), o1l.LJIILJJIL).getServerMonitor();
                o2t.LJIIJJI = LIZ2.LJ;
                o2t.LIZ(str5);
                o2t.LIZIZ(str5);
                o2t.LJIIIIZZ = str2;
                o2t.LJIIL = O1F.LIZIZ(LIZ2, str5).getLoopCheck();
                o2t.LJIIJ = LJII;
                if (c59125NIj != null) {
                    o2t.LJFF = c59125NIj;
                }
                LIZ = C61520OCm.LIZLLL(new C61276O3c(o2t));
                C58313Mub c58313Mub2 = this.LIZ;
                IResourceLoaderService iResourceLoaderService2 = this.LIZIZ;
                if (iResourceLoaderService2 != null && (bid = iResourceLoaderService2.getBid()) != null) {
                    str4 = bid;
                }
                c58313Mub2.LIZJ(str3, str4, LIZ);
                if (LIZ == null) {
                    interfaceC61240O1s.LIZ(new Throwable("GeckoXClient is null"), list);
                    return;
                }
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CheckRequestBodyModel.TargetChannel((String) ListProtector.get(list, 0)));
        hashMap.put(o1l.LJIILJJIL, arrayList);
        OptionCheckUpdateParams result = new OptionCheckUpdateParams();
        String str6 = o1l.LJIILJJIL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        O1E LIZ3 = C61238O1q.LIZ.LIZ(this.LIZIZ);
        String businessVersion = O1F.LIZIZ(LIZ3, str6).getBusinessVersion();
        if (businessVersion == null) {
            businessVersion = LIZ3.LJII;
        }
        linkedHashMap2.put("business_version", businessVersion);
        linkedHashMap.put(str6, linkedHashMap2);
        result.setCustomParam(linkedHashMap);
        result.setListener(c61226O1e);
        if (o1l instanceof O1U) {
            if (((O1U) o1l).LJIJI == 1) {
                o.LJFF(result, "result");
                result.setChannelUpdatePriority(3);
                result.setEnableThrottle(false);
            } else {
                o.LJFF(result, "result");
                result.setLazyUpdate(true);
            }
        }
        o.LJFF(result, "result");
        LIZ.LIZ(null, hashMap, result);
    }
}
