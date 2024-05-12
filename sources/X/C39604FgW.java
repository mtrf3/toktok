package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.bytedance.liko.leakdetector.strategy.miniupload.hprofile.DataBean;
import com.bytedance.liko.leakdetector.strategy.miniupload.hprofile.HeaderBean;
import com.bytedance.liko.memoryexplorer.MemoryConfig;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tailor.Tailor;
import com.google.gson.Gson;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.FgW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39604FgW {
    public static void LIZIZ(File file) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("shouldUpload:");
        LIZ.append(C39615Fgh.LIZ.LIZ());
        C39596FgO.LIZ(X1D.LIZIZ(LIZ));
        if (C39615Fgh.LIZ.LIZ()) {
            C64626PXy LJIIJJI = C64626PXy.LJIIJJI("https://api-va.tiktokv.com/monitor/collect/c/mom_dump_collect/");
            if (!file.exists() || file.length() == 0 || LJIIJJI == null) {
                return;
            }
            DataBean dataBean = new DataBean("memory_object_monitor", System.currentTimeMillis());
            MemoryConfig memoryConfig = MemoryConfig.getMemoryConfig();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("aid", String.valueOf(memoryConfig.aid));
            String str = memoryConfig.channel;
            o.LJFF(str, "config.channel");
            linkedHashMap.put("channel", str);
            String str2 = memoryConfig.device_id;
            o.LJFF(str2, "config.device_id");
            linkedHashMap.put("device_id", str2);
            String str3 = memoryConfig.app_version;
            o.LJFF(str3, "config.app_version");
            linkedHashMap.put("app_version", str3);
            String str4 = memoryConfig.update_versioncode;
            o.LJFF(str4, "config.update_versioncode");
            linkedHashMap.put("update_version_code", str4);
            String str5 = memoryConfig.update_versioncode;
            o.LJFF(str5, "config.update_versioncode");
            linkedHashMap.put("current_update_version_code", str5);
            String str6 = memoryConfig.os_version;
            o.LJFF(str6, "config.os_version");
            linkedHashMap.put("os_version", str6);
            linkedHashMap.put("os_api", String.valueOf(memoryConfig.os_api));
            String str7 = memoryConfig.device_model;
            o.LJFF(str7, "config.device_model");
            linkedHashMap.put("device_model", str7);
            String str8 = memoryConfig.device_brand;
            o.LJFF(str8, "config.device_brand");
            linkedHashMap.put("device_brand", str8);
            String str9 = memoryConfig.device_manufacturer;
            o.LJFF(str9, "config.device_manufacturer");
            linkedHashMap.put("device_manufacturer", str9);
            String str10 = memoryConfig.packageName;
            o.LJFF(str10, "config.packageName");
            linkedHashMap.put("process_name", str10);
            String str11 = memoryConfig.versionName;
            o.LJFF(str11, "config.versionName");
            linkedHashMap.put("version_name", str11);
            linkedHashMap.put("version_code", String.valueOf(memoryConfig.versioncode));
            String str12 = memoryConfig.region;
            o.LJFF(str12, "config.region");
            linkedHashMap.put("region", str12);
            String str13 = memoryConfig.release_build;
            o.LJFF(str13, "config.release_build");
            linkedHashMap.put("release_build", str13);
            HeaderBean headerBean = new HeaderBean((String) linkedHashMap.get("aid"), (String) linkedHashMap.get("channel"), (String) linkedHashMap.get("device_id"), (String) linkedHashMap.get("app_version"), (String) linkedHashMap.get("update_version_code"), (String) linkedHashMap.get("current_update_version_code"), (String) linkedHashMap.get("os_version"), (String) linkedHashMap.get("os_api"), (String) linkedHashMap.get("device_model"), (String) linkedHashMap.get("device_brand"), (String) linkedHashMap.get("device_manufacturer"), (String) linkedHashMap.get("process_name"), (String) linkedHashMap.get("version_name"), (String) linkedHashMap.get("version_code"), (String) linkedHashMap.get("region"), "Android", "android", String.valueOf(System.currentTimeMillis()), String.valueOf(System.currentTimeMillis()), (String) linkedHashMap.get("release_build"));
            ArrayList arrayList = new ArrayList();
            String name = file.getName();
            C39745Fin c39745Fin = C64551PVb.LJFF;
            o.LJFF(c39745Fin, "MultipartBody.FORM");
            arrayList.add(C64553PVd.LIZIZ("file", name, new PUO(c39745Fin, file)));
            arrayList.add(C64553PVd.LIZIZ("header", null, PVP.LIZJ(null, GsonProtectorUtils.toJson(new Gson(), headerBean))));
            arrayList.add(C64553PVd.LIZIZ("data", null, PVP.LIZJ(null, GsonProtectorUtils.toJson(new Gson(), dataBean))));
            InterfaceC39611Fgd.LIZ.getClass();
            InterfaceC39611Fgd interfaceC39611Fgd = C39613Fgf.LIZ;
            if (interfaceC39611Fgd == null) {
                interfaceC39611Fgd = new C65028Pfc();
            }
            interfaceC39611Fgd.LIZ(arrayList, new C39602FgU(file));
        }
    }

    public static void LIZ(Context context, String str) {
        if (context != null) {
            try {
                Object LLILL = C16880lQ.LLILL(context, "connectivity");
                if (LLILL != null) {
                    NetworkInfo LJJLI = C16880lQ.LJJLI((ConnectivityManager) LLILL);
                    if (LJJLI == null || !LJJLI.isAvailable() || 1 != LJJLI.getType() || TextUtils.isEmpty(str)) {
                        return;
                    }
                    try {
                        File file = new File(str);
                        if (file.exists() && Tailor.isHprofValid(str)) {
                            String parent = file.getParent();
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append(parent);
                            LIZ.append("/.mini.hprof");
                            String LIZIZ = X1D.LIZIZ(LIZ);
                            Tailor.tailorHprof(str, LIZIZ);
                            File file2 = new File(LIZIZ);
                            if (file2.exists()) {
                                C16880lQ.LLLZZIL(new File(str));
                            }
                            ArrayList arrayList = new ArrayList(4);
                            if (file2.exists()) {
                                arrayList.add(LIZIZ);
                            } else {
                                arrayList.add(str);
                            }
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append(parent);
                            LIZ2.append("/.maps");
                            if (new File(X1D.LIZIZ(LIZ2)).exists()) {
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append(parent);
                                LIZ3.append("/.maps");
                                arrayList.add(X1D.LIZIZ(LIZ3));
                                StringBuilder LIZ4 = X1D.LIZ();
                                LIZ4.append(parent);
                                LIZ4.append("/.fds");
                                arrayList.add(X1D.LIZIZ(LIZ4));
                                StringBuilder LIZ5 = X1D.LIZ();
                                LIZ5.append(parent);
                                LIZ5.append("/.threads");
                                arrayList.add(X1D.LIZIZ(LIZ5));
                                StringBuilder LIZ6 = X1D.LIZ();
                                LIZ6.append(parent);
                                LIZ6.append("/.stacks");
                                arrayList.add(X1D.LIZIZ(LIZ6));
                            }
                            C38976FRk.LIZ(parent, arrayList);
                            if (file.exists()) {
                                C16880lQ.LLLZZIL(file);
                            }
                            if (file2.exists()) {
                                C16880lQ.LLLZZIL(file2);
                            }
                            if (TextUtils.isEmpty(parent)) {
                                return;
                            }
                            StringBuilder LIZ7 = X1D.LIZ();
                            LIZ7.append(parent);
                            LIZ7.append("/dump.xzip");
                            File file3 = new File(X1D.LIZIZ(LIZ7));
                            if (!file3.exists()) {
                                return;
                            }
                            LIZIZ(file3);
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                        return;
                    }
                }
            } catch (Exception unused) {
                return;
            }
        }
        throw new C37692Eqm("null cannot be cast to non-null type android.net.ConnectivityManager");
    }
}
