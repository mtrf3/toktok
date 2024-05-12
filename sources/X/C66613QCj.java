package X;

import com.bytedance.bdlocation.utils.background.BackgroundProvider;

/* renamed from: X.QCj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66613QCj extends BackgroundProvider implements InterfaceC64405PPl {
    public static final C66613QCj LIZ = new C66613QCj();

    @Override // X.InterfaceC64405PPl
    public final void LIZ() {
        onAppBackgroundSwitch(C64403PPj.LIZLLL(0L));
    }

    @Override // X.InterfaceC64405PPl
    public final void LIZIZ() {
        onAppBackgroundSwitch(C64403PPj.LIZLLL(0L));
    }

    @Override // com.bytedance.bdlocation.utils.background.BackgroundProvider
    public final boolean isBackground() {
        boolean LIZLLL = C64403PPj.LIZLLL(0L);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("inject background provider >> isBackground=");
        LIZ2.append(LIZLLL);
        C36922EeM.LIZLLL(2, "BDLocation", X1D.LIZIZ(LIZ2));
        return LIZLLL;
    }

    @Override // X.InterfaceC64405PPl
    public final void onAppBackground() {
    }

    @Override // X.InterfaceC64405PPl
    public final void onAppForeground() {
    }
}
