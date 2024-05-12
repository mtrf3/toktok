package X;

import com.ss.android.ugc.aweme.story.avatar.adaper.AvatarStoryDataAdapter;
import kotlin.jvm.internal.o;

/* renamed from: X.KzL, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53511KzL extends AbstractC53585L1h<AbstractC53477Kyn, C53592L1o> {
    public static final C53511KzL LIZ = new C53511KzL();

    @Override // X.AbstractC53585L1h, X.InterfaceC53584L1g
    public final L4V<AbstractC53477Kyn, C53592L1o> LIZLLL() {
        return new L5P();
    }

    @Override // X.InterfaceC53584L1g
    public final EnumC53663L4h LIZ() {
        return EnumC53663L4h.STORY;
    }

    @Override // X.InterfaceC53584L1g
    public final AbstractC53588L1k LIZIZ(AUS aus) {
        return new C53471Kyh((C53592L1o) aus);
    }

    @Override // X.InterfaceC53584L1g
    public final InterfaceC53587L1j LIZJ(AUS aus) {
        return new AvatarStoryDataAdapter((C53592L1o) aus);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC53585L1h
    public final AbstractC53477Kyn LJ(L4O state) {
        o.LJIIIZ(state, "state");
        if (state instanceof AbstractC53477Kyn) {
            return state;
        }
        return null;
    }
}
