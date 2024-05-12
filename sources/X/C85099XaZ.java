package X;

import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.XaZ, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85099XaZ implements InterfaceC85091XaR {
    public final C85096XaW<InterfaceC85091XaR> LIZ = new C85096XaW<>();

    @Override // X.InterfaceC85091XaR
    public final void onCompletion() {
        this.LIZ.LIZ(C85104Xae.LJLIL);
    }

    @Override // X.InterfaceC85091XaR
    public final void onPrepare() {
        this.LIZ.LIZ(C85105Xaf.LJLIL);
    }

    @Override // X.InterfaceC85091XaR
    public final void onPrepared() {
        this.LIZ.LIZ(C85106Xag.LJLIL);
    }

    @Override // X.InterfaceC85091XaR
    public final void onRenderStart() {
        this.LIZ.LIZ(C85107Xah.LJLIL);
    }

    @Override // X.InterfaceC85091XaR
    public final void LIZ(C85079XaF errorCode) {
        o.LJIIIZ(errorCode, "errorCode");
        this.LIZ.LIZ(new AqS181S0100000_15(errorCode, 246));
    }

    @Override // X.InterfaceC85091XaR
    public final void LIZIZ(EnumC85066Xa2 loadingState) {
        o.LJIIIZ(loadingState, "loadingState");
        this.LIZ.LIZ(new AqS181S0100000_15(loadingState, 247));
    }

    @Override // X.InterfaceC85091XaR
    public final void LIZJ(InterfaceC85083XaJ interfaceC85083XaJ) {
        this.LIZ.LIZ(new AqS181S0100000_15(interfaceC85083XaJ, 248));
    }

    @Override // X.InterfaceC85091XaR
    public final void LJ(XOX currentState) {
        o.LJIIIZ(currentState, "currentState");
        this.LIZ.LIZ(new AqS181S0100000_15(currentState, 249));
    }

    @Override // X.InterfaceC85091XaR
    public final void onBufferingUpdate(float f) {
        this.LIZ.LIZ(new C85100Xaa(f));
    }

    @Override // X.InterfaceC85091XaR
    public final void onPlaybackTimeChanged(long j) {
        this.LIZ.LIZ(new C85102Xac(j));
    }

    @Override // X.InterfaceC85091XaR
    public final void LIZLLL(EnumC80000VaW seekState, long j) {
        o.LJIIIZ(seekState, "seekState");
        this.LIZ.LIZ(new C85101Xab(seekState, j));
    }

    @Override // X.InterfaceC85091XaR
    public final void onVideoSizeChanged(int i, int i2) {
        this.LIZ.LIZ(new C85103Xad(i, i2));
    }
}
