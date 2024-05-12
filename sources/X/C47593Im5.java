package X;

import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Im5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47593Im5 {
    public final String LIZ;
    public InterfaceC47596Im8 LIZIZ;
    public C47594Im6 LIZJ;
    public final List<EnumC47599ImB> LIZLLL;
    public final InterfaceC47592Im4 LJ;

    public C47593Im5(TTVideoEngine tTVideoEngine) {
        C47591Im3 c47591Im3 = new C47591Im3(tTVideoEngine);
        this.LIZLLL = new ArrayList();
        this.LJ = c47591Im3;
        this.LIZ = C47591Im3.LIZIZ;
    }

    public final void LIZ(InterfaceC47596Im8 interfaceC47596Im8) {
        if (TTVideoEngineLog.d()) {
            TTVideoEngineLog.d(this.LIZ, "reset");
        }
        this.LIZIZ = null;
        this.LIZJ = null;
        if (!TTVideoEngineLog.d()) {
            this.LIZIZ = interfaceC47596Im8;
            if (!interfaceC47596Im8.LIZIZ()) {
                LIZJ(this.LJ, interfaceC47596Im8);
                return;
            } else {
                interfaceC47596Im8.LIZ();
                throw new IllegalArgumentException(KMP.LJ("unsupported strategy! ", 0));
            }
        }
        String str = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setStrategySource ");
        LIZ.append(interfaceC47596Im8);
        TTVideoEngineLog.d(str, X1D.LIZIZ(LIZ));
        X1D.LIZ().append("setStrategySource ");
        X1D.LIZ().append("smartUrl=");
        throw new UnsupportedOperationException("tob only");
    }

    public final void LIZIZ(InterfaceC47592Im4 interfaceC47592Im4, C47594Im6 c47594Im6) {
        this.LIZJ = c47594Im6;
        InterfaceC47596Im8 interfaceC47596Im8 = c47594Im6.LIZIZ;
        EnumC47599ImB enumC47599ImB = c47594Im6.LIZ;
        EnumC47602ImE type = interfaceC47596Im8.type();
        int i = C47603ImF.LIZ[type.ordinal()];
        if (i != 1) {
            if (i == 2) {
                ((C47591Im3) interfaceC47592Im4).LIZIZ(null, enumC47599ImB);
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("unsupported source type! ");
            LIZ.append(type);
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
        }
        if (TTVideoEngineLog.d()) {
            String str = this.LIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("setupSource CodecStrategy error:");
            LIZ2.append(c47594Im6);
            TTVideoEngineLog.d(str, X1D.LIZIZ(LIZ2));
        }
    }

    public final void LIZJ(InterfaceC47592Im4 interfaceC47592Im4, InterfaceC47596Im8 interfaceC47596Im8) {
        this.LIZJ = null;
        int i = C47603ImF.LIZ[interfaceC47596Im8.type().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                C47591Im3 c47591Im3 = (C47591Im3) interfaceC47592Im4;
                c47591Im3.getClass();
                String str = C47591Im3.LIZIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("setVideoModel vid = ");
                LIZ.append((String) null);
                LIZ.append(", videoModel = ");
                LIZ.append((Object) null);
                LIZ.append(", resolution = ");
                LIZ.append((Object) null);
                TTVideoEngineLog.d(str, X1D.LIZIZ(LIZ));
                c47591Im3.LIZ.LIZ.getClass();
                c47591Im3.LIZ.LJII(null);
                return;
            }
            interfaceC47596Im8.LIZJ();
            ((C47591Im3) interfaceC47592Im4).LIZIZ(null, null);
            return;
        }
        throw null;
    }
}
