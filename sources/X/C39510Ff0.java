package X;

import com.bytedance.pumbaa.hybrid.impl.jsb.BridgeHookDispatcher;
import kotlin.jvm.internal.o;

/* renamed from: X.Ff0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39510Ff0 implements InterfaceC39518Ff8 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f5  */
    @Override // X.InterfaceC39518Ff8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C39519Ff9 preInvoke(int r9, java.lang.String r10, java.lang.String r11, java.lang.Object r12, java.lang.Object[] r13, java.lang.String r14, X.C65300Pk0 r15) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39510Ff0.preInvoke(int, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object[], java.lang.String, X.Pk0):X.Ff9");
    }

    @Override // X.InterfaceC39518Ff8
    public final void postInvoke(int i, String str, String str2, Object obj, Object[] objArr, Object obj2, C65300Pk0 c65300Pk0, boolean z) {
        Object LIZ;
        BridgeHookDispatcher bridgeHookDispatcher;
        if (obj != null) {
            try {
                bridgeHookDispatcher = BridgeHookDispatcher.INSTANCE;
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            if (bridgeHookDispatcher.getConfig$com_bytedance_pumbaa_hybrid_impl() != null) {
                switch (i) {
                    case 300001:
                        String str3 = c65300Pk0.LIZIZ;
                        o.LJIIIIZZ(str3, "extraInfo.parameterSignature");
                        bridgeHookDispatcher.hookReturn(300001, obj2, new String[]{str, str2, str3});
                        break;
                    case 300002:
                        String str4 = c65300Pk0.LIZIZ;
                        o.LJIIIIZZ(str4, "extraInfo.parameterSignature");
                        bridgeHookDispatcher.hookReturn(300002, obj2, new String[]{str, str2, str4});
                        break;
                }
                LIZ = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ);
                Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
                if (m10exceptionOrNullimpl != null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("postInvoke error. ");
                    LIZ2.append(C38386F4s.LIZJ(m10exceptionOrNullimpl, false));
                    X1D.LIZIZ(LIZ2);
                }
            }
        }
    }
}
