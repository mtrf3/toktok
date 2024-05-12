package X;

import Y.ARunnableS20S0110000_14;
import Y.ARunnableS50S0100000_14;
import android.content.Context;
import com.bytedance.android.monitorV2.hybridSetting.entity.BidInfo;
import com.bytedance.android.monitorV2.hybridSetting.entity.HybridSettingInitConfig;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes15.dex */
public final class VN4 implements InterfaceC40069Fo1 {
    public volatile boolean LIZIZ;
    public volatile boolean LIZJ;
    public PthreadTimer LJ;
    public AbstractC66646QDq LJFF;
    public final HybridSettingInitConfig LJI;
    public final ExecutorService LIZLLL = C16880lQ.LLLLZLLIL();
    public volatile VMZ LIZ = new VMZ();

    @Override // X.InterfaceC40069Fo1
    public final BidInfo LIZ() {
        if (this.LIZ != null && this.LIZ.LIZ != null) {
            return this.LIZ.LIZ;
        }
        return new BidInfo();
    }

    @Override // X.InterfaceC40069Fo1
    public final List<C38918FPe> LIZIZ() {
        if (this.LIZ == null || this.LIZ.LIZ == null || this.LIZ.LIZ.LIZIZ == null) {
            return new ArrayList();
        }
        return this.LIZ.LIZ.LIZIZ;
    }

    @Override // X.InterfaceC40069Fo1
    public final void LIZLLL() {
        try {
            this.LIZLLL.submit(new ARunnableS20S0110000_14(this, false, 5));
        } catch (Throwable th) {
            C77117UOj.LJIIZILJ(th);
        }
    }

    @Override // X.InterfaceC40069Fo1
    public final java.util.Set<String> LJ() {
        if (this.LIZ.LJI != null) {
            return this.LIZ.LJI;
        }
        return new HashSet();
    }

    @Override // X.InterfaceC40069Fo1
    public final java.util.Map<String, Integer> LJFF() {
        if (this.LIZ.LJFF != null) {
            return this.LIZ.LJFF;
        }
        return new HashMap();
    }

    @Override // X.InterfaceC40069Fo1
    public final C40068Fo0 LJI() {
        if (this.LIZ != null && this.LIZ.LIZIZ != null) {
            return this.LIZ.LIZIZ;
        }
        return new C40068Fo0();
    }

    public final void LJII() {
        if (this.LJFF == null) {
            HybridSettingInitConfig hybridSettingInitConfig = this.LJI;
            try {
                Field declaredField = TTNetInit.class.getDeclaredField("sNotifiedColdStartFinsish");
                declaredField.setAccessible(true);
                if (declaredField.getBoolean(null)) {
                    this.LJFF = new C40039FnX(hybridSettingInitConfig);
                } else {
                    this.LJFF = new C65081PgT(hybridSettingInitConfig);
                }
            } catch (Throwable th) {
                C77117UOj.LJIILLIIL("startup_handle", th);
                this.LJFF = new C65081PgT(hybridSettingInitConfig);
            }
        }
    }

    @Override // X.InterfaceC40069Fo1
    public final HybridSettingInitConfig LIZJ() {
        return this.LJI;
    }

    public VN4(HybridSettingInitConfig hybridSettingInitConfig) {
        this.LJI = hybridSettingInitConfig;
    }

    public final void LJIIIIZZ(int i) {
        if (i > 0) {
            if (this.LJ == null) {
                this.LJ = new PthreadTimer("HybridSettingManagerImpl");
            }
            C79062V1e.LJI("monitor setting update after ", i, " secs");
            this.LJ.schedule(new VN5(this), i * 1000);
        }
    }

    @Override // X.InterfaceC40069Fo1
    public final void B3(Context context, boolean z) {
        if (context == null || this.LIZIZ) {
            return;
        }
        this.LIZIZ = true;
        this.LIZJ = z;
        try {
            this.LIZLLL.submit(new ARunnableS50S0100000_14(this, 179));
        } catch (Throwable th) {
            C77117UOj.LJIIZILJ(th);
        }
    }
}
