package X;

import android.content.Context;
import com.bytedance.android.monitorV2.hybridSetting.entity.BidInfo;
import com.bytedance.android.monitorV2.hybridSetting.entity.HybridSettingInitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.Fnz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40067Fnz implements InterfaceC40069Fo1 {
    public static volatile C40067Fnz LJ;
    public BidInfo LIZ;
    public C40068Fo0 LIZIZ;
    public java.util.Map<String, Integer> LIZJ;
    public java.util.Set<String> LIZLLL;

    @Override // X.InterfaceC40069Fo1
    public final void B3(Context context, boolean z) {
    }

    @Override // X.InterfaceC40069Fo1
    public final HybridSettingInitConfig LIZJ() {
        return null;
    }

    @Override // X.InterfaceC40069Fo1
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC40069Fo1
    public final BidInfo LIZ() {
        if (this.LIZ == null) {
            this.LIZ = new BidInfo();
        }
        return this.LIZ;
    }

    @Override // X.InterfaceC40069Fo1
    public final List<C38918FPe> LIZIZ() {
        return new ArrayList();
    }

    @Override // X.InterfaceC40069Fo1
    public final java.util.Set<String> LJ() {
        if (this.LIZLLL == null) {
            this.LIZLLL = new HashSet();
        }
        return this.LIZLLL;
    }

    @Override // X.InterfaceC40069Fo1
    public final java.util.Map<String, Integer> LJFF() {
        if (this.LIZJ == null) {
            this.LIZJ = new HashMap();
        }
        return this.LIZJ;
    }

    @Override // X.InterfaceC40069Fo1
    public final C40068Fo0 LJI() {
        if (this.LIZIZ == null) {
            this.LIZIZ = new C40068Fo0();
        }
        return this.LIZIZ;
    }
}
