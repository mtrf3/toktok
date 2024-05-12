package X;

import android.content.Context;
import com.ss.android.ugc.aweme.services.external.ability.IEffectSDKGeneralParamService;
import com.ss.android.ugc.aweme.services.external.ability.IGeneralParam;
import kotlin.jvm.internal.o;

/* renamed from: X.OpG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63078OpG implements InterfaceC134035Nv, InterfaceC07710Rz, InterfaceC15340iw, InterfaceC48038ItG, IEffectSDKGeneralParamService {
    public static C4EQ LJLIL;
    public static C07700Ry LJLILLLLZI;
    public static final C63078OpG LJLJI = new C63078OpG();

    @Override // X.InterfaceC07710Rz
    public void b() {
        C0YN.LIZ(3);
    }

    @Override // X.InterfaceC07710Rz
    public void a() {
        if (LJLILLLLZI != null) {
            C0YN.LIZ(3);
            LJLILLLLZI.getClass();
            C07700Ry.LIZ(30000L);
        }
    }

    public static boolean LIZ() {
        if (C38987FRv.LIZLLL().booleanValue() && C38686FGg.LJ) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IEffectSDKGeneralParamService
    public IGeneralParam generalParam() {
        return C63079OpH.LIZ;
    }

    @Override // X.InterfaceC07710Rz
    public boolean LJIIZILJ(Context context) {
        if (LJLILLLLZI == null) {
            LJLILLLLZI = new C07700Ry();
        }
        LJLILLLLZI.getClass();
        if (C07700Ry.LIZ) {
            C0YN.LIZ(4);
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC07710Rz
    public void LJJL(long j) {
        if (LJLILLLLZI != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("try boost gpu with timeout ");
            LIZ.append(j);
            X1D.LIZIZ(LIZ);
            C0YN.LIZ(3);
            LJLILLLLZI.getClass();
            C07700Ry.LIZ(j);
        }
    }

    @Override // X.InterfaceC07710Rz
    public void LJJLIIIJL(long j) {
        if (LJLILLLLZI != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("try boost timeout ");
            LIZ.append(j);
            X1D.LIZIZ(LIZ);
            C0YN.LIZ(3);
            LJLILLLLZI.getClass();
            C07700Ry.LIZ(j);
        }
    }

    @Override // X.InterfaceC07710Rz
    public void LJJLIIIJLLLLLLLZ(long j) {
        if (LJLILLLLZI != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("try boost storage with timeout ");
            LIZ.append(j);
            X1D.LIZIZ(LIZ);
            C0YN.LIZ(3);
            LJLILLLLZI.getClass();
            C07700Ry.LIZ(j);
        }
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        int i;
        C81154Vt8 output = (C81154Vt8) obj;
        o.LJIIIZ(output, "output");
        Integer LIZJ = output.LIZJ();
        if (LIZJ != null) {
            i = LIZJ.intValue();
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    @Override // X.InterfaceC15340iw
    public void i(String str) {
        C0NB.LJIIIZ("live-stream-sdk", str);
    }

    @Override // X.InterfaceC15340iw
    public void e(String str, Throwable th) {
        C0NB.LJFF("live-stream-sdk", str, th);
    }
}
