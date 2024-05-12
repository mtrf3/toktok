package X;

import com.ss.android.ugc.aweme.profile.widgets.header.avatar.avatarcomp.profile.AvatarProfileDataAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AW3 extends AbstractC53585L1h<AU9, AUR> {
    public static final AW3 LIZ = new AW3();

    @Override // X.InterfaceC53584L1g
    public final EnumC53663L4h LIZ() {
        return EnumC53663L4h.PROFILE;
    }

    @Override // X.InterfaceC53584L1g
    public final AbstractC53588L1k LIZIZ(AUS aus) {
        return new C53459KyV((AUR) aus);
    }

    @Override // X.InterfaceC53584L1g
    public final InterfaceC53587L1j LIZJ(AUS aus) {
        return new AvatarProfileDataAdapter((AUR) aus);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC53585L1h
    public final AU9 LJ(L4O state) {
        o.LJIIIZ(state, "state");
        if (state instanceof AU9) {
            return state;
        }
        return null;
    }
}
