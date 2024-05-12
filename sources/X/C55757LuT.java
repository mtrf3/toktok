package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.LuT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55757LuT implements InterfaceC55778Luo {
    public final /* synthetic */ C55756LuS LIZ;

    public C55757LuT(C55756LuS c55756LuS) {
        this.LIZ = c55756LuS;
    }

    @Override // X.InterfaceC55778Luo
    public final void LIZ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        C55756LuS c55756LuS = this.LIZ;
        c55756LuS.LJ = true;
        c55756LuS.LIZ.onInternalEvent(new C50420Jqa(44));
        C221018lt.LJFF("@LinkRelation_Video", "onShow(), set video pause!");
    }

    @Override // X.InterfaceC55778Luo
    public final void LIZJ(AbstractC55764Lua reason) {
        o.LJIIIZ(reason, "reason");
        if (reason instanceof C55763LuZ) {
            new C55751LuN(((C55763LuZ) reason).LIZ, this.LIZ.LIZ).LIZ();
        } else if (reason instanceof C55762LuY) {
            new C55751LuN(((C55762LuY) reason).LIZ, this.LIZ.LIZ).LIZ();
        }
        C55756LuS c55756LuS = this.LIZ;
        c55756LuS.LJ = false;
        c55756LuS.LIZ.onInternalEvent(new C50420Jqa(59));
    }

    @Override // X.InterfaceC55778Luo
    public final void LIZIZ(EnumC55775Lul enumC55775Lul, Aweme aweme) {
        this.LIZ.LJ = false;
    }
}
