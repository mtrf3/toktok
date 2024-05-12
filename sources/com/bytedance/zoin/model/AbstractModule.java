package com.bytedance.zoin.model;

import X.C025908h;
import X.C39054FUk;
import X.C39724FiS;
import X.C39727FiV;
import X.C39734Fic;
import X.JBR;
import X.X1D;
import android.content.SharedPreferences;
import com.bytedance.zoin.ZoinNative;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract class AbstractModule {
    public boolean moduleInited;
    public String moduleName;
    public int moduleType;
    public boolean preFallocate;
    public Map<String, Object> recordMap = new HashMap();
    public List<Throwable> throwableList = new ArrayList();
    public File workDir;

    public abstract C39724FiS decode(boolean z);

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r3.LIZ() == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C39724FiS doRetryLoad() {
        /*
            r10 = this;
            monitor-enter(r10)
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L94
            boolean r0 = r10.isDecoded()     // Catch: java.lang.Throwable -> L94
            r7 = 1
            r4 = 0
            if (r0 == 0) goto L6e
            X.FiS r3 = r10.install()     // Catch: java.lang.Throwable -> L94
            boolean r0 = r3.LIZ()     // Catch: java.lang.Throwable -> L94
            if (r0 != 0) goto L6c
        L17:
            java.util.Map r5 = r10.getReportMap()     // Catch: java.lang.Throwable -> L94
            java.lang.String r1 = "key_status"
            int r0 = r3.LIZ     // Catch: java.lang.Throwable -> L94
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L94
            r5.put(r1, r0)     // Catch: java.lang.Throwable -> L94
            java.lang.String r0 = "is_first_load"
            java.lang.String r6 = r10.getModuleSpWrapper(r0)     // Catch: java.lang.Throwable -> L94
            android.content.SharedPreferences r0 = r10.getSp()     // Catch: java.lang.Throwable -> L94
            boolean r0 = r0.getBoolean(r6, r7)     // Catch: java.lang.Throwable -> L94
            java.lang.String r1 = "is_first_load"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L94
            r5.put(r1, r0)     // Catch: java.lang.Throwable -> L94
            java.lang.String r2 = "duration"
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L94
            long r0 = r0 - r8
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L94
            r5.put(r2, r0)     // Catch: java.lang.Throwable -> L94
            java.lang.String r1 = "key_module_name"
            java.lang.String r0 = r10.moduleName     // Catch: java.lang.Throwable -> L94
            r5.put(r1, r0)     // Catch: java.lang.Throwable -> L94
            android.content.SharedPreferences r0 = r10.getSp()     // Catch: java.lang.Throwable -> L94
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L94
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r6, r4)     // Catch: java.lang.Throwable -> L94
            r0.apply()     // Catch: java.lang.Throwable -> L94
            X.Fic r2 = X.C39734Fic.LIZJ()     // Catch: java.lang.Throwable -> L94
            int r1 = r10.moduleType     // Catch: java.lang.Throwable -> L94
            java.lang.String r0 = r10.moduleName     // Catch: java.lang.Throwable -> L94
            r2.LJ(r1, r0, r5)     // Catch: java.lang.Throwable -> L94
        L6c:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L94
            goto L93
        L6e:
            X.FiS r3 = r10.decode(r4)     // Catch: java.lang.Throwable -> L94
            boolean r0 = r3.LIZ()     // Catch: java.lang.Throwable -> L94
            if (r0 != 0) goto L88
            r10.processWhenFailedFirst()     // Catch: java.lang.Throwable -> L94
            java.util.Map<java.lang.String, java.lang.Object> r2 = r10.recordMap     // Catch: java.lang.Throwable -> L94
            java.lang.String r1 = "is_retry_loaded"
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L94
            r2.put(r1, r0)     // Catch: java.lang.Throwable -> L94
            X.FiS r3 = r10.decode(r4)     // Catch: java.lang.Throwable -> L94
        L88:
            boolean r0 = r3.LIZ()     // Catch: java.lang.Throwable -> L94
            if (r0 == 0) goto L17
            X.FiS r3 = r10.install()     // Catch: java.lang.Throwable -> L94
            goto L17
        L93:
            return r3
        L94:
            r0 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L94
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.zoin.model.AbstractModule.doRetryLoad():X.FiS");
    }

    public abstract void doWhenUpdateApk();

    public abstract AbstractModule findByFileName(String str);

    public abstract C39724FiS install();

    public abstract boolean isDecoded();

    public void processWhenFailedFirst() {
    }

    public void reset() {
    }

    public abstract boolean setDecoded();

    public abstract void setModuleInfo(AbstractModuleInfo abstractModuleInfo);

    public abstract boolean setNotDecoded();

    public Map<String, Object> getReportMap() {
        HashMap hashMap = new HashMap();
        List<Throwable> list = this.throwableList;
        if (list != null && list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (Throwable th : this.throwableList) {
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                arrayList.add(stringWriter.toString());
            }
            hashMap.put("throwable_list", arrayList);
        }
        hashMap.putAll(this.recordMap);
        return hashMap;
    }

    public int hashCode() {
        int i;
        String str = this.moduleName;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i2 = this.moduleType;
        return (i * 31) + (i2 ^ (i2 >>> 32));
    }

    public void init() {
        this.workDir = C39054FUk.LIZ.LIZIZ();
    }

    public SharedPreferences getSp() {
        return C39734Fic.LIZJ().LIZLLL();
    }

    public Map<String, Object> getRecordMap() {
        return this.recordMap;
    }

    public File getWorkDir() {
        return this.workDir;
    }

    public boolean isModuleInited() {
        return this.moduleInited;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r3.LIZ() == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C39724FiS doLoad(boolean r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L7e
            boolean r0 = r9.isDecoded()     // Catch: java.lang.Throwable -> L7e
            r2 = 1
            r5 = 0
            if (r0 == 0) goto L6e
            X.FiS r3 = r9.install()     // Catch: java.lang.Throwable -> L7e
            boolean r0 = r3.LIZ()     // Catch: java.lang.Throwable -> L7e
            if (r0 != 0) goto L6c
        L17:
            java.util.Map r4 = r9.getReportMap()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r1 = "key_status"
            int r0 = r3.LIZ     // Catch: java.lang.Throwable -> L7e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L7e
            r4.put(r1, r0)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r0 = "is_first_load"
            java.lang.String r6 = r9.getModuleSpWrapper(r0)     // Catch: java.lang.Throwable -> L7e
            android.content.SharedPreferences r0 = r9.getSp()     // Catch: java.lang.Throwable -> L7e
            boolean r0 = r0.getBoolean(r6, r2)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r1 = "is_first_load"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L7e
            r4.put(r1, r0)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r1 = "key_module_name"
            java.lang.String r0 = r9.moduleName     // Catch: java.lang.Throwable -> L7e
            r4.put(r1, r0)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r2 = "duration"
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L7e
            long r0 = r0 - r7
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L7e
            r4.put(r2, r0)     // Catch: java.lang.Throwable -> L7e
            android.content.SharedPreferences r0 = r9.getSp()     // Catch: java.lang.Throwable -> L7e
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L7e
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r6, r5)     // Catch: java.lang.Throwable -> L7e
            r0.apply()     // Catch: java.lang.Throwable -> L7e
            X.Fic r2 = X.C39734Fic.LIZJ()     // Catch: java.lang.Throwable -> L7e
            int r1 = r9.moduleType     // Catch: java.lang.Throwable -> L7e
            java.lang.String r0 = r9.moduleName     // Catch: java.lang.Throwable -> L7e
            r2.LJ(r1, r0, r4)     // Catch: java.lang.Throwable -> L7e
        L6c:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L7e
            goto L7d
        L6e:
            X.FiS r3 = r9.decode(r10)     // Catch: java.lang.Throwable -> L7e
            boolean r0 = r3.LIZ()     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto L17
            X.FiS r3 = r9.install()     // Catch: java.lang.Throwable -> L7e
            goto L17
        L7d:
            return r3
        L7e:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L7e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.zoin.model.AbstractModule.doLoad(boolean):X.FiS");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractModule)) {
            return false;
        }
        AbstractModule abstractModule = (AbstractModule) obj;
        if (this.moduleName.equals(abstractModule.moduleName) && this.moduleType == abstractModule.moduleType) {
            return true;
        }
        return false;
    }

    public String getModuleSpWrapper(String str) {
        StringBuilder LIZ = X1D.LIZ();
        return C025908h.LIZIZ(LIZ, this.moduleName, "_", str, LIZ);
    }

    public int preFallocate(List<ZoinBuildFileInfo> list) {
        return ZoinNative.nPreFallocate((ZoinBuildFileInfo[]) list.toArray(new ZoinBuildFileInfo[0]));
    }

    public void renameTempFiles(File file, List<ZoinBuildFileInfo> list) {
        for (ZoinBuildFileInfo zoinBuildFileInfo : list) {
            StringBuilder LIZ = X1D.LIZ();
            File file2 = new File(file, JBR.LJFF(LIZ, zoinBuildFileInfo.name, ".temp", LIZ));
            if (file2.exists()) {
                File file3 = new File(file, zoinBuildFileInfo.name);
                if (!file2.renameTo(file3)) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("rename files failed ");
                    LIZ2.append(file2.getPath());
                    LIZ2.append(" ");
                    LIZ2.append(file3.getPath());
                    throw new C39727FiV(X1D.LIZIZ(LIZ2));
                }
            }
        }
    }
}
