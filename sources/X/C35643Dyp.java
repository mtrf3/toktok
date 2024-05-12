package X;

import com.bytedance.keva.Keva;

/* renamed from: X.Dyp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35643Dyp<T> implements InterfaceC64592gB {
    public static final C35643Dyp<T> LJLIL = new C35643Dyp<>();

    @Override // X.InterfaceC64592gB
    public final void accept(T t) {
        ((Keva) C33850DQg.LJI.getValue()).storeBoolean("cold_launch_request_handled", true);
    }
}
