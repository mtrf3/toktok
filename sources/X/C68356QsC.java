package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: X.QsC, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68356QsC {
    public final C68387Qsh LIZ;
    public final C68377QsX LIZIZ;
    public final C68377QsX LIZJ;
    public final C68331Qrn LIZLLL;

    public C68356QsC() {
        C68387Qsh c68387Qsh = new C68387Qsh();
        this.LIZ = c68387Qsh;
        C68377QsX c68377QsX = new C68377QsX(null, c68387Qsh);
        this.LIZJ = c68377QsX;
        this.LIZIZ = c68377QsX.LIZ();
        C68331Qrn c68331Qrn = new C68331Qrn();
        this.LIZLLL = c68331Qrn;
        c68377QsX.LJFF("require", new C68357QsD(c68331Qrn));
        ((HashMap) c68331Qrn.LIZ).put("internal.platform", new Callable() { // from class: X.Qsy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new C68398Qss();
            }
        });
        c68377QsX.LJFF("runtime.counter", new C68366QsM(Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX)));
    }

    public final InterfaceC68379QsZ LIZ(C68377QsX c68377QsX, C68347Qs3... c68347Qs3Arr) {
        InterfaceC68379QsZ interfaceC68379QsZ = InterfaceC68379QsZ.LJIIJ;
        for (C68347Qs3 c68347Qs3 : c68347Qs3Arr) {
            interfaceC68379QsZ = C68361QsH.LIZ(c68347Qs3);
            C68368QsO.LIZJ(this.LIZJ);
            if ((interfaceC68379QsZ instanceof C68392Qsm) || (interfaceC68379QsZ instanceof C68378QsY)) {
                interfaceC68379QsZ = this.LIZ.LIZIZ(c68377QsX, interfaceC68379QsZ);
            }
        }
        return interfaceC68379QsZ;
    }
}
