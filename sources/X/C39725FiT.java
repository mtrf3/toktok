package X;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.zoin.model.AbstractModule;
import com.bytedance.zoin.model.AbstractModuleInfo;
import com.bytedance.zoin.model.LibModuleInfo;
import com.bytedance.zoin.model.ModuleManager;
import defpackage.i0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.FiT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39725FiT {
    public static volatile boolean LIZIZ;
    public final ConcurrentHashMap<String, AbstractModule> LIZ = new ConcurrentHashMap<>();

    public final AbstractModule LIZIZ(String str) {
        if (!LIZIZ) {
            return null;
        }
        for (Map.Entry<String, AbstractModule> entry : this.LIZ.entrySet()) {
            if (entry.getValue().moduleType == 0 && entry.getValue().findByFileName(str) != null) {
                return entry.getValue();
            }
        }
        return null;
    }

    public final synchronized void LIZLLL(C39728FiW c39728FiW) {
        if (!LIZIZ) {
            C39734Fic.LIZJ().getClass();
            return;
        }
        AbstractModuleInfo findModuleByName = ModuleManager.findModuleByName(c39728FiW.moduleName);
        if (findModuleByName == null) {
            C39734Fic LIZJ = C39734Fic.LIZJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("zoin cant find module ");
            LIZ.append(c39728FiW.moduleName);
            LIZ.append(", do nothing");
            X1D.LIZIZ(LIZ);
            LIZJ.getClass();
            return;
        }
        c39728FiW.LJ = (LibModuleInfo) findModuleByName;
        if (this.LIZ.get(c39728FiW.moduleName) != null) {
            C39734Fic LIZJ2 = C39734Fic.LIZJ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("zoin register ");
            LIZ2.append(c39728FiW.moduleName);
            LIZ2.append(" twice, ignored");
            X1D.LIZIZ(LIZ2);
            LIZJ2.getClass();
            return;
        }
        this.LIZ.put(c39728FiW.moduleName, c39728FiW);
        c39728FiW.init();
    }

    public final C39724FiS LIZ(String str, boolean z) {
        C39734Fic LIZJ = C39734Fic.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("zoin start decode module ");
        LIZ.append(str);
        LIZ.append(" force:");
        LIZ.append(z);
        X1D.LIZIZ(LIZ);
        LIZJ.getClass();
        AbstractModule abstractModule = this.LIZ.get(str);
        if (abstractModule == null) {
            return new C39724FiS(100, new C39727FiV(i0.LJFF("cant find module when decode async ", str)));
        }
        return abstractModule.doLoad(z);
    }

    public final synchronized void LIZJ(Application application, C39733Fib c39733Fib) {
        String str;
        if (!LIZIZ) {
            C39734Fic.LIZJ = c39733Fib;
            C78929UyL.LJLIL = application;
            long currentTimeMillis = System.currentTimeMillis();
            LIZIZ = ModuleManager.init(application);
            long currentTimeMillis2 = System.currentTimeMillis();
            C39734Fic LIZJ = C39734Fic.LIZJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Zoin runtime for ModuleManager init: ");
            LIZ.append(currentTimeMillis2 - currentTimeMillis);
            LIZ.append(" ms");
            X1D.LIZIZ(LIZ);
            LIZJ.getClass();
            if (LIZIZ) {
                C39729FiX c39729FiX = C39054FUk.LIZ;
                SharedPreferences LIZLLL = C39734Fic.LIZJ().LIZLLL();
                if (TextUtils.isEmpty(C78929UyL.LJLILLLLZI)) {
                    str = "defaultmd5";
                } else {
                    str = C78929UyL.LJLILLLLZI;
                }
                c39729FiX.LIZ = LIZLLL;
                c39729FiX.LIZIZ = str;
                c39729FiX.LIZ(ModuleManager.getTotalLibModuleInfos());
                C39734Fic LIZJ2 = C39734Fic.LIZJ();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Zoin runtime for WorkDirManager init: ");
                LIZ2.append(System.currentTimeMillis() - currentTimeMillis2);
                LIZ2.append(" ms");
                X1D.LIZIZ(LIZ2);
                LIZJ2.getClass();
            }
            C39734Fic LIZJ3 = C39734Fic.LIZJ();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("Zoin Init Status:");
            LIZ3.append(LIZIZ);
            X1D.LIZIZ(LIZ3);
            LIZJ3.getClass();
        }
    }
}
