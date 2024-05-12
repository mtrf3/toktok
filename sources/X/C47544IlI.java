package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.DefaultABRModule;
import com.bytedance.vcloud.abrmodule.IABRModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.IlI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47544IlI {
    public static boolean LJFF;
    public static C47544IlI LJI;
    public int LIZ;
    public final Lock LIZIZ = new ReentrantLock();
    public final List<IABRModule> LIZJ = new ArrayList();
    public final java.util.Map<String, IABRModule> LJ = new HashMap();
    public final List<String> LIZLLL = new ArrayList();

    public static C47544IlI LIZJ() {
        if (LJI == null) {
            synchronized (C47544IlI.class) {
                if (LJI == null) {
                    LJI = new C47544IlI();
                }
            }
        }
        return LJI;
    }

    public final IABRModule LIZ() {
        IABRModule iABRModule = null;
        if (!LJFF) {
            return null;
        }
        ((ReentrantLock) this.LIZIZ).lock();
        if (((ArrayList) this.LIZJ).size() > 0) {
            iABRModule = (IABRModule) ListProtector.remove(this.LIZJ, 0);
        } else if (this.LIZ < 8) {
            iABRModule = new DefaultABRModule();
            this.LIZ++;
        } else if (((ArrayList) this.LIZLLL).size() >= 6) {
            iABRModule = (IABRModule) ((HashMap) this.LJ).remove(ListProtector.remove(this.LIZLLL, 0));
        }
        ((ReentrantLock) this.LIZIZ).unlock();
        return iABRModule;
    }

    public final IABRModule LIZIZ(String str) {
        if (!LJFF || TextUtils.isEmpty(str)) {
            return null;
        }
        ((ReentrantLock) this.LIZIZ).lock();
        IABRModule iABRModule = (IABRModule) ((HashMap) this.LJ).remove(str);
        ((ArrayList) this.LIZLLL).remove(str);
        ((ReentrantLock) this.LIZIZ).unlock();
        return iABRModule;
    }

    public final void LIZLLL(IABRModule iABRModule) {
        ((ReentrantLock) this.LIZIZ).lock();
        iABRModule.stop();
        ((ArrayList) this.LIZJ).add(iABRModule);
        ((ReentrantLock) this.LIZIZ).unlock();
    }
}
