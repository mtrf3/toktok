package X;

import com.ss.android.ugc.aweme.avatar.SocialAvatarEntry;
import kotlin.jvm.internal.AqS159S0100000_9;

/* loaded from: classes10.dex */
public final class L6J extends AbstractC13940gg {
    public InterfaceC65784Pro<String> LJ;
    public final L6I LJFF;

    @Override // X.AbstractC13940gg
    public final InterfaceC65784Pro<String> LIZJ() {
        return this.LJ;
    }

    @Override // X.AbstractC13940gg
    public final /* bridge */ /* synthetic */ InterfaceC19530ph LJ() {
        return this.LJFF;
    }

    public L6J(SocialAvatarEntry socialAvatarEntry) {
        this.LJ = new AqS159S0100000_9(socialAvatarEntry, 64);
        this.LJFF = new L6I(socialAvatarEntry);
    }

    @Override // X.AbstractC13940gg
    public final void LJIIJJI(InterfaceC65784Pro<String> interfaceC65784Pro) {
        this.LJ = interfaceC65784Pro;
    }
}
