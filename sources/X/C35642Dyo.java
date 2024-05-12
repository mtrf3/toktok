package X;

import com.bytedance.keva.Keva;

/* renamed from: X.Dyo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35642Dyo<T> implements InterfaceC64592gB {
    public static final C35642Dyo<T> LJLIL = new C35642Dyo<>();

    @Override // X.InterfaceC64592gB
    public final void accept(T t) {
        ((Keva) C33850DQg.LJI.getValue()).storeBoolean("cold_launch_request_handled", true);
    }
}
