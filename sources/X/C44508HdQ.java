package X;

import com.ss.android.ugc.aweme.shortvideo.cut.CutVideoCompileSettings;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import java.util.HashMap;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS7S0100001_7;
import kotlin.jvm.internal.o;

/* renamed from: X.HdQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44508HdQ implements InterfaceC134045Nw {
    public final /* synthetic */ VECutVideoPresenter LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ long LIZJ;
    public final /* synthetic */ C68322mC<CutVideoCompileSettings> LIZLLL;
    public final /* synthetic */ InterfaceC44507HdP LJ;

    @Override // X.InterfaceC134045Nw
    public final void onCompileDone() {
        HC8.LJFF(this.LIZ.LIZLLL(), "", false);
        long currentTimeMillis = System.currentTimeMillis() - this.LIZIZ;
        VECutVideoPresenter vECutVideoPresenter = this.LIZ;
        long j = this.LIZJ;
        CutVideoCompileSettings cutVideoCompileSettings = this.LIZLLL.element;
        vECutVideoPresenter.getClass();
        VECutVideoPresenter.LJFF(0, j, currentTimeMillis, cutVideoCompileSettings, 0, "");
        String creationId = this.LIZ.LJLJJI.getCreationId();
        o.LJIIIZ(creationId, "creationId");
        ((HashMap) C127414zJ.LIZ).put(creationId, Long.valueOf(currentTimeMillis));
        VECutVideoPresenter vECutVideoPresenter2 = this.LIZ;
        AqS154S0200000_7 aqS154S0200000_7 = new AqS154S0200000_7(this.LJ, vECutVideoPresenter2, 66);
        vECutVideoPresenter2.getClass();
        VECutVideoPresenter.LIZIZ(aqS154S0200000_7);
    }

    @Override // X.InterfaceC134045Nw
    public final void onCompileProgress(float f) {
        VECutVideoPresenter vECutVideoPresenter = this.LIZ;
        AqS7S0100001_7 aqS7S0100001_7 = new AqS7S0100001_7(this.LJ, f, 0);
        vECutVideoPresenter.getClass();
        VECutVideoPresenter.LIZIZ(aqS7S0100001_7);
    }

    @Override // X.InterfaceC134045Nw
    public final void onCompileError(int i, int i2, float f, String str) {
        String str2;
        long currentTimeMillis = System.currentTimeMillis() - this.LIZIZ;
        VECutVideoPresenter vECutVideoPresenter = this.LIZ;
        long j = this.LIZJ;
        CutVideoCompileSettings cutVideoCompileSettings = this.LIZLLL.element;
        if (cutVideoCompileSettings != null) {
            CutVideoCompileSettings cutVideoCompileSettings2 = cutVideoCompileSettings;
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            vECutVideoPresenter.getClass();
            VECutVideoPresenter.LJFF(1, j, currentTimeMillis, cutVideoCompileSettings2, i, str2);
            VECutVideoPresenter vECutVideoPresenter2 = this.LIZ;
            C44509HdR c44509HdR = new C44509HdR(this.LJ, i, i2, f, str, vECutVideoPresenter2);
            vECutVideoPresenter2.getClass();
            VECutVideoPresenter.LIZIZ(c44509HdR);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public C44508HdQ(VECutVideoPresenter vECutVideoPresenter, long j, long j2, C68322mC<CutVideoCompileSettings> c68322mC, InterfaceC44507HdP interfaceC44507HdP) {
        this.LIZ = vECutVideoPresenter;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = c68322mC;
        this.LJ = interfaceC44507HdP;
    }
}
