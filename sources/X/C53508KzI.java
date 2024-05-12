package X;

import com.ss.android.ugc.aweme.live.avatar.AvatarLiveDataAdapter;
import kotlin.jvm.internal.o;

/* renamed from: X.KzI, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53508KzI extends AbstractC53585L1h<EnumC53523KzX, C53464Kya> {
    @Override // X.AbstractC53585L1h, X.InterfaceC53584L1g
    public final L4V<EnumC53523KzX, C53464Kya> LIZLLL() {
        return new L5D();
    }

    @Override // X.InterfaceC53584L1g
    public final EnumC53663L4h LIZ() {
        return EnumC53663L4h.LIVE;
    }

    @Override // X.InterfaceC53584L1g
    public final AbstractC53588L1k LIZIZ(AUS aus) {
        return new C53458KyU((C53464Kya) aus);
    }

    @Override // X.InterfaceC53584L1g
    public final InterfaceC53587L1j LIZJ(AUS aus) {
        return new AvatarLiveDataAdapter((C53464Kya) aus);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC53585L1h
    public final EnumC53523KzX LJ(L4O state) {
        o.LJIIIZ(state, "state");
        if (state instanceof EnumC53523KzX) {
            return state;
        }
        return null;
    }
}
