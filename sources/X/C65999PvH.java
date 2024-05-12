package X;

import com.bytedance.helios.sdk.signal.Signal;

/* renamed from: X.PvH, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65999PvH implements InterfaceC64405PPl {
    public static final C65999PvH LIZ = new C65999PvH();

    @Override // X.InterfaceC64405PPl
    public final void onAppBackground() {
    }

    @Override // X.InterfaceC64405PPl
    public final void onAppForeground() {
    }

    @Override // X.InterfaceC64405PPl
    public final void LIZ() {
        Signal signal = new Signal("foreground");
        EnumC66029Pvl enumC66029Pvl = EnumC66029Pvl.APP;
        C65985Pv3.LIZIZ(enumC66029Pvl, EnumC65997PvF.CAMERA, signal);
        C65985Pv3.LIZIZ(enumC66029Pvl, EnumC65997PvF.AUDIO, signal);
    }

    @Override // X.InterfaceC64405PPl
    public final void LIZIZ() {
        Signal signal = new Signal("background");
        EnumC66029Pvl enumC66029Pvl = EnumC66029Pvl.APP;
        C65985Pv3.LIZIZ(enumC66029Pvl, EnumC65997PvF.CAMERA, signal);
        C65985Pv3.LIZIZ(enumC66029Pvl, EnumC65997PvF.AUDIO, signal);
    }
}
