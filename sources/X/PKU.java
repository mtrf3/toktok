package X;

import Y.ARunnableS30S0200000_11;
import android.content.Context;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashFilter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PKU extends C64311PLv<CrashType, AttachUserData> {
    public final java.util.Map<String, String> LJLIL = new ConcurrentHashMap();
    public final java.util.Map<String, String> LJLILLLLZI = new HashMap();
    public final C64311PLv<CrashType, InterfaceC64299PLj> LJLJI = new C64311PLv<>();
    public volatile File LJLJJI;
    public ICrashFilter mFilter;

    public void cleanTags() {
        File[] listFiles;
        Context context = PK0.LIZ;
        if (context == null || (listFiles = new File(new File(C78596Usy.LJJIIJ(context), "npth"), "tags").listFiles()) == null) {
            return;
        }
        for (File file : listFiles) {
            if (!file.isFile()) {
                File[] listFiles2 = file.listFiles();
                if (listFiles2 == null) {
                    continue;
                } else {
                    if (listFiles2.length <= 5) {
                        return;
                    }
                    Arrays.sort(listFiles2);
                    for (int i = 0; i < listFiles2.length - 5; i++) {
                        PK8.LIZJ(listFiles2[i]);
                    }
                }
            } else {
                PK8.LIZJ(file);
            }
        }
    }

    public void clearImportTagsFile() {
        try {
            if (this.LJLJJI != null) {
                C16880lQ.LLLZZIL(this.LJLJJI);
            }
        } catch (Throwable unused) {
        }
    }

    public void save() {
        if (!((HashMap) this.LJLILLLLZI).isEmpty()) {
            save(this.LJLILLLLZI);
        }
    }

    public ICrashFilter getCrashFilter() {
        return this.mFilter;
    }

    public java.util.Map<String, String> getImportTagMap() {
        return this.LJLILLLLZI;
    }

    public java.util.Map<String, String> getTagMap() {
        return this.LJLIL;
    }

    public void addImportTags(java.util.Map<? extends String, ? extends String> map) {
        if (map == null) {
            return;
        }
        if (!PKZ.LIZ) {
            ((HashMap) this.LJLILLLLZI).putAll(map);
            return;
        }
        ((HashMap) this.LJLILLLLZI).putAll(map);
        C64214PIc.LIZ().LIZ(new ARunnableS30S0200000_11(this, new HashMap(this.LJLILLLLZI), 3));
    }

    public void addPluginVersion(JSONObject jSONObject) {
        java.util.Map<String, Object> LIZLLL = PK0.LIZIZ().LIZLLL();
        if (jSONObject == null) {
            return;
        }
        try {
            String LJFF = PJC.LJFF(jSONObject, "filters", "plugin_version");
            if ((LJFF == null || LJFF == "") && LIZLLL.containsKey("tv_plugin_version")) {
                PKN.LJIILIIL(LIZLLL.get("tv_plugin_version"), "filters", "plugin_version", jSONObject);
            }
        } catch (Throwable unused) {
        }
    }

    public List<AttachUserData> getAttachUserData(CrashType crashType) {
        List<AttachUserData> list;
        synchronized (this) {
            list = getList(crashType);
        }
        return list;
    }

    public List<InterfaceC64299PLj> getUserCrashInfoCallback(CrashType crashType) {
        return this.LJLJI.getList(crashType);
    }

    public void removeImportTag(String str) {
        if (!((HashMap) this.LJLILLLLZI).containsKey(str)) {
            return;
        }
        ((HashMap) this.LJLILLLLZI).remove(str);
        if (!PKZ.LIZ) {
            return;
        }
        C64214PIc.LIZ().LIZ(new ARunnableS30S0200000_11(this, new HashMap(this.LJLILLLLZI), 5));
    }

    public void save(java.util.Map<String, String> map) {
        ObjectOutputStream objectOutputStream;
        String replaceAll;
        try {
            Context context = PK0.LIZ;
            if (context == null) {
                return;
            }
            File file = new File(new File(C78596Usy.LJJIIJ(context), "npth"), "tags");
            if (!file.exists()) {
                file.mkdirs();
            }
            if (C64264PKa.LJII(context)) {
                replaceAll = "main";
            } else {
                String str = C64264PKa.LIZ;
                if (str == null) {
                    str = "";
                }
                replaceAll = str.replaceAll(":", "@");
            }
            File file2 = new File(file, replaceAll);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("import_tag_");
            LIZ.append(PK0.LIZJ);
            LIZ.append(".txt");
            File file3 = new File(file2, X1D.LIZIZ(LIZ));
            this.LJLJJI = file3;
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file3));
            try {
                objectOutputStream.writeObject(map);
            } catch (Throwable unused) {
                FPX.LIZIZ(objectOutputStream);
            }
        } catch (Throwable unused2) {
            objectOutputStream = null;
        }
    }

    public final void LIZ(AttachUserData attachUserData, CrashType crashType) {
        synchronized (this) {
            if (crashType == CrashType.ALL) {
                addMulti(attachUserData, CrashType.ANR, CrashType.LAUNCH, CrashType.JAVA, CrashType.DART, CrashType.GAME, CrashType.NATIVE, CrashType.CUSTOM_JAVA);
            } else {
                add(crashType, attachUserData);
            }
        }
    }

    public void addImportTag(String str, String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            removeImportTag(str);
            return;
        }
        ((HashMap) this.LJLILLLLZI).put(str, str2);
        if (!PKZ.LIZ) {
            return;
        }
        C64214PIc.LIZ().LIZ(new ARunnableS30S0200000_11(this, new HashMap(this.LJLILLLLZI), 4));
    }

    public void addUserCrashInfoCallback(InterfaceC64299PLj interfaceC64299PLj, CrashType crashType) {
        if (crashType == CrashType.ALL) {
            this.LJLJI.addMulti(interfaceC64299PLj, CrashType.ANR, CrashType.LAUNCH, CrashType.JAVA, CrashType.DART, CrashType.GAME, CrashType.NATIVE, CrashType.CUSTOM_JAVA);
        } else {
            this.LJLJI.add(crashType, interfaceC64299PLj);
        }
    }

    public void removeUserCrashInfoCallback(InterfaceC64299PLj interfaceC64299PLj, CrashType crashType) {
        if (crashType == CrashType.ALL) {
            this.LJLJI.removeAll(interfaceC64299PLj);
        } else {
            this.LJLJI.removeInList(crashType, interfaceC64299PLj);
        }
    }

    public void getImportTags(JSONObject jSONObject, long j, String str) {
        String replaceAll;
        ObjectInputStream objectInputStream;
        if (C64264PKa.LJIIIIZZ(PK0.LIZ, str)) {
            replaceAll = "main";
        } else {
            replaceAll = str.replaceAll(":", "@");
        }
        File[] listFiles = new File(new File(new File(C78596Usy.LJJIIJ(PK0.LIZ), "npth"), "tags"), replaceAll).listFiles(new IV6(j));
        if (listFiles == null || listFiles.length < 1) {
            return;
        }
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(listFiles[0]));
        } catch (Throwable unused) {
            objectInputStream = null;
        }
        try {
            java.util.Map map = (java.util.Map) objectInputStream.readObject();
            if (map == null) {
                return;
            }
            PJC.LJIIIZ(map, jSONObject);
        } catch (Throwable unused2) {
            FPX.LIZIZ(objectInputStream);
        }
    }
}
