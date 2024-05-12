package X;

import android.os.Trace;
import com.bytedance.zoin.decode.DecodeProcessor;
import com.bytedance.zoin.model.AbstractModule;
import com.bytedance.zoin.model.AbstractModuleInfo;
import com.bytedance.zoin.model.LibDependency;
import com.bytedance.zoin.model.LibModuleInfo;
import com.bytedance.zoin.model.ModuleManager;
import com.bytedance.zoin.model.ZoinBlockInfo;
import com.bytedance.zoin.model.ZoinBuildFileInfo;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FiW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39728FiW extends AbstractModule {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public LibModuleInfo LJ;

    @Override // com.bytedance.zoin.model.AbstractModule
    public final void doWhenUpdateApk() {
    }

    @Override // com.bytedance.zoin.model.AbstractModule
    public final C39724FiS install() {
        if (!this.LIZ) {
            ClassLoader LJIIIIZZ = C78929UyL.LJIIIIZZ(C78929UyL.LJLIL.getClassLoader());
            boolean LIZ = C38575FBz.LIZ(C78929UyL.LJLIL, LJIIIIZZ, this.workDir.getPath(), this.LIZJ, this.LIZ);
            C39734Fic LIZJ = C39734Fic.LIZJ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("zoin inception register classloader ");
            LIZ2.append(LJIIIIZZ);
            LIZ2.append(" invoked ");
            LIZ2.append(LIZ);
            X1D.LIZIZ(LIZ2);
            LIZJ.getClass();
            if (!LIZ) {
                return new C39724FiS(8, new C39727FiV("cant inception classloader"));
            }
        }
        return C39724FiS.LIZJ;
    }

    public C39728FiW() {
        this.LIZJ = true;
    }

    @Override // com.bytedance.zoin.model.AbstractModule
    public final void init() {
        Object valueOf;
        Object obj;
        Object obj2;
        long currentTimeMillis = System.currentTimeMillis();
        super.init();
        for (ZoinBuildFileInfo zoinBuildFileInfo : this.LJ.curAbiInfo.libFileInfoList) {
            File file = this.workDir;
            StringBuilder LIZ = X1D.LIZ();
            zoinBuildFileInfo.decompressPath = new File(file, JBR.LJFF(LIZ, zoinBuildFileInfo.name, ".temp", LIZ)).getPath();
        }
        if (!C39054FUk.LIZ.LIZJ && !isDecoded()) {
            File[] listFiles = this.workDir.listFiles(new FilenameFilter() { // from class: X.Fid
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str) {
                    return str.endsWith(".so");
                }
            });
            Iterator<ZoinBuildFileInfo> it = this.LJ.curAbiInfo.libFileInfoList.iterator();
            while (it.hasNext()) {
                ZoinBuildFileInfo next = it.next();
                if (listFiles != null) {
                    int length = listFiles.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            File file2 = listFiles[i];
                            if (file2.getName().equals(next.name)) {
                                long LIZIZ = C39731FiZ.LIZIZ(file2);
                                if (LIZIZ == next.checkNumber) {
                                    C39734Fic LIZJ = C39734Fic.LIZJ();
                                    StringBuilder LIZ2 = X1D.LIZ();
                                    LIZ2.append(this.moduleName);
                                    LIZ2.append(" remove decompressed ");
                                    LIZ2.append(next);
                                    LIZ2.append(" ");
                                    LIZ2.append(LIZIZ);
                                    X1D.LIZIZ(LIZ2);
                                    LIZJ.getClass();
                                    it.remove();
                                }
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
        }
        if (this.LIZLLL) {
            if (!isDecoded()) {
                long currentTimeMillis2 = System.currentTimeMillis();
                int preFallocate = preFallocate(this.LJ.curAbiInfo.libFileInfoList);
                C39734Fic LIZJ2 = C39734Fic.LIZJ();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("zoin fallocate use ");
                LIZ3.append(System.currentTimeMillis() - currentTimeMillis2);
                LIZ3.append(" ms ");
                LIZ3.append(preFallocate);
                X1D.LIZIZ(LIZ3);
                LIZJ2.getClass();
                if (preFallocate == 0) {
                    this.preFallocate = true;
                    this.moduleInited = true;
                } else {
                    this.moduleInited = false;
                    HashMap hashMap = new HashMap();
                    hashMap.put("fallocate_code", Integer.valueOf(preFallocate));
                    hashMap.put("key_module_name", this.moduleName);
                    C39734Fic.LIZJ().LJ(101, this.moduleName, hashMap);
                }
            } else {
                this.moduleInited = true;
            }
            if (!this.moduleInited) {
                return;
            }
        } else {
            this.moduleInited = true;
        }
        if (this.LIZ) {
            long currentTimeMillis3 = System.currentTimeMillis();
            ClassLoader LJIIIIZZ = C78929UyL.LJIIIIZZ(C78929UyL.LJLIL.getClassLoader());
            boolean LIZ4 = C38575FBz.LIZ(C78929UyL.LJLIL, LJIIIIZZ, this.workDir.getPath(), this.LIZJ, this.LIZ);
            C39734Fic LIZJ3 = C39734Fic.LIZJ();
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("zoin inception register classloader ");
            LIZ5.append(LJIIIIZZ);
            LIZ5.append(" invoked ");
            LIZ5.append(LIZ4);
            X1D.LIZIZ(LIZ5);
            LIZJ3.getClass();
            if (isDecoded()) {
                Iterator<LibDependency> it2 = this.LJ.curAbiInfo.libDependencyList.iterator();
                while (it2.hasNext()) {
                    it2.next().libDecompressed = true;
                }
            } else {
                Iterator<LibDependency> it3 = this.LJ.curAbiInfo.libDependencyList.iterator();
                while (it3.hasNext()) {
                    it3.next().libDecompressed = false;
                }
            }
            ModuleManager.setDependencyList(this.LJ.curAbiInfo.libDependencyList);
            this.recordMap.put("lib_install_duration", Long.valueOf(System.currentTimeMillis() - currentTimeMillis3));
            try {
                Iterator<ZoinBuildFileInfo> it4 = this.LJ.curAbiInfo.libFileInfoList.iterator();
                while (it4.hasNext()) {
                    File file3 = new File(this.workDir, it4.next().name);
                    if (!file3.exists()) {
                        file3.createNewFile();
                    }
                    if (!file3.exists()) {
                        File parentFile = file3.getParentFile();
                        C39734Fic LIZJ4 = C39734Fic.LIZJ();
                        StringBuilder LIZ6 = X1D.LIZ();
                        LIZ6.append("workdir ");
                        LIZ6.append(this.workDir);
                        LIZ6.append(" parent ");
                        LIZ6.append(parentFile);
                        LIZ6.append(" ");
                        Object obj3 = "null";
                        if (parentFile == null) {
                            valueOf = "null";
                        } else {
                            valueOf = Boolean.valueOf(parentFile.exists());
                        }
                        LIZ6.append(valueOf);
                        LIZ6.append(" ");
                        if (parentFile == null) {
                            obj = "null";
                        } else {
                            obj = Boolean.valueOf(parentFile.canExecute());
                        }
                        LIZ6.append(obj);
                        LIZ6.append(" ");
                        if (parentFile == null) {
                            obj2 = "null";
                        } else {
                            obj2 = Boolean.valueOf(parentFile.canWrite());
                        }
                        LIZ6.append(obj2);
                        LIZ6.append(" ");
                        if (parentFile != null) {
                            obj3 = Boolean.valueOf(parentFile.canRead());
                        }
                        LIZ6.append(obj3);
                        X1D.LIZIZ(LIZ6);
                        LIZJ4.getClass();
                        StringBuilder LIZ7 = X1D.LIZ();
                        LIZ7.append("file cant be create ");
                        LIZ7.append(file3.getPath());
                        throw new C39727FiV(X1D.LIZIZ(LIZ7));
                    }
                }
            } catch (IOException e) {
                C39734Fic.LIZJ().getClass();
                this.throwableList.add(new Exception("lib so create failed", e));
            }
            this.recordMap.put("lib_hook_duration", Long.valueOf(System.currentTimeMillis() - System.currentTimeMillis()));
        }
        if (this.LIZIZ) {
            long currentTimeMillis4 = System.currentTimeMillis();
            if (C39731FiZ.LIZJ(this.workDir, this.LJ.curAbiInfo.libFileInfoList)) {
                C39734Fic LIZJ5 = C39734Fic.LIZJ();
                StringBuilder LIZ8 = X1D.LIZ();
                LIZ8.append(this.moduleName);
                LIZ8.append(" has no lib files to be decoded");
                X1D.LIZIZ(LIZ8);
                LIZJ5.getClass();
                setDecoded();
            } else {
                C39734Fic LIZJ6 = C39734Fic.LIZJ();
                StringBuilder LIZ9 = X1D.LIZ();
                LIZ9.append(this.moduleName);
                LIZ9.append(" some libs must be changed");
                X1D.LIZIZ(LIZ9);
                LIZJ6.getClass();
                setNotDecoded();
            }
            this.recordMap.put("lib_crc_duration", Long.valueOf(System.currentTimeMillis() - currentTimeMillis4));
        }
        this.recordMap.put("lib_init_duration", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // com.bytedance.zoin.model.AbstractModule
    public final boolean isDecoded() {
        return C39734Fic.LIZJ().LIZLLL().getBoolean(getModuleSpWrapper("key.lib.decode.finished"), false);
    }

    @Override // com.bytedance.zoin.model.AbstractModule
    public final void reset() {
        super.reset();
        File workDir = getWorkDir();
        C39734Fic LIZJ = C39734Fic.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Zoin delete workDir ");
        LIZ.append(workDir.getPath());
        LIZ.append(" exist:");
        LIZ.append(workDir.exists());
        X1D.LIZIZ(LIZ);
        LIZJ.getClass();
        if (workDir.exists()) {
            C78685UuP.LJIL(workDir);
        }
        C39734Fic.LIZJ().LIZLLL().edit().clear().commit();
    }

    @Override // com.bytedance.zoin.model.AbstractModule
    public final boolean setDecoded() {
        C39734Fic LIZJ = C39734Fic.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.moduleName);
        LIZ.append(" setDecoded");
        X1D.LIZIZ(LIZ);
        LIZJ.getClass();
        for (LibDependency libDependency : ModuleManager.getDependencyList()) {
            Iterator<LibDependency> it = this.LJ.curAbiInfo.libDependencyList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (it.next().libName.equals(libDependency.libName)) {
                    libDependency.libDecompressed = true;
                    break;
                }
            }
        }
        return C39734Fic.LIZJ().LIZLLL().edit().putBoolean(getModuleSpWrapper("key.lib.decode.finished"), true).commit();
    }

    @Override // com.bytedance.zoin.model.AbstractModule
    public final boolean setNotDecoded() {
        return C39734Fic.LIZJ().LIZLLL().edit().putBoolean(getModuleSpWrapper("key.lib.decode.finished"), false).commit();
    }

    public C39728FiW(int i) {
        this.LIZJ = true;
        this.moduleName = "media";
        this.LIZ = true;
        this.LIZIZ = false;
        this.LIZJ = true;
        this.LIZLLL = false;
    }

    @Override // com.bytedance.zoin.model.AbstractModule
    public final C39724FiS decode(boolean z) {
        boolean z2;
        if (!this.moduleInited) {
            return new C39724FiS(6, new C39727FiV("prefallocate failed, no disk space"));
        }
        long currentTimeMillis = System.currentTimeMillis();
        File file = this.workDir;
        StringBuilder LIZ = X1D.LIZ();
        C39732Fia c39732Fia = new C39732Fia(new File(file, C025908h.LIZIZ(LIZ, this.moduleName, ".", "zoin.lib.lk", LIZ)));
        try {
            c39732Fia.LIZIZ();
            this.recordMap.put("lib_lock_duration", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            if (!z && C39731FiZ.LIZJ(this.workDir, this.LJ.curAbiInfo.libFileInfoList)) {
                setDecoded();
                return C39724FiS.LIZJ;
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(this.moduleName);
            LIZ2.append("ModuleDecode");
            Trace.beginSection(X1D.LIZIZ(LIZ2));
            File file2 = this.workDir;
            LibModuleInfo.AbiLibInfo abiLibInfo = this.LJ.curAbiInfo;
            List<ZoinBuildFileInfo> list = abiLibInfo.libFileInfoList;
            List<ZoinBlockInfo> list2 = abiLibInfo.blockInfoList;
            if (!this.preFallocate) {
                z2 = true;
            } else {
                z2 = false;
            }
            int decodeAndVerify = DecodeProcessor.decodeAndVerify(file2, list, list2, z2);
            Trace.endSection();
            this.recordMap.put("lib_decode_duration", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2));
            this.recordMap.put("key_decode_status", Integer.valueOf(decodeAndVerify));
            if (decodeAndVerify == 0) {
                setDecoded();
                return C39724FiS.LIZJ;
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("Lib decode failed ");
            LIZ3.append(decodeAndVerify);
            throw new C39727FiV(X1D.LIZIZ(LIZ3));
        } catch (Throwable th) {
            try {
                C39734Fic.LIZJ().getClass();
                this.throwableList.add(new C39727FiV(C39639Fh5.LIZ(), th));
                return new C39724FiS(6, th);
            } finally {
                c39732Fia.LIZ();
            }
        }
    }

    @Override // com.bytedance.zoin.model.AbstractModule
    public final AbstractModule findByFileName(String str) {
        Iterator<LibDependency> it = this.LJ.curAbiInfo.libDependencyList.iterator();
        while (it.hasNext()) {
            if (it.next().libName.equals(str)) {
                return this;
            }
        }
        return null;
    }

    @Override // com.bytedance.zoin.model.AbstractModule
    public final void setModuleInfo(AbstractModuleInfo abstractModuleInfo) {
        this.LJ = (LibModuleInfo) abstractModuleInfo;
    }
}
