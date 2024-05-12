package X;

import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardPlayerSoundIconAssem;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility;

/* loaded from: classes9.dex */
public final class JL1 implements InterfaceC48983JKh {
    public final /* synthetic */ SearchCardPlayerSoundIconAssem LIZ;

    @Override // X.InterfaceC48983JKh
    public final void LJIIIZ() {
    }

    @Override // X.InterfaceC48983JKh
    public final void LIZ() {
        this.LIZ.m4().setVisibility(8);
    }

    @Override // X.InterfaceC48983JKh
    public final void LIZIZ() {
        JHK jhk = EnumC48916JHs.Companion;
        J1C.LJ();
        int i = J1C.LIZIZ;
        jhk.getClass();
        EnumC48916JHs LIZ = JHK.LIZ(i);
        if (LIZ != null) {
            this.LIZ.m4().LIZ(LIZ, false);
        }
        this.LIZ.m4().setVisibility(0);
        SearchCardPlayerSoundIconAssem searchCardPlayerSoundIconAssem = this.LIZ;
        SearchComponentCenter$Player$PlayerControlAbility searchComponentCenter$Player$PlayerControlAbility = searchCardPlayerSoundIconAssem.LLFII;
        if (searchComponentCenter$Player$PlayerControlAbility != null) {
            searchComponentCenter$Player$PlayerControlAbility.setMute(J1C.LIZ(C46314IFq.LIZIZ() ? 1 : 0, 0, searchCardPlayerSoundIconAssem.LLFZ));
        }
    }

    @Override // X.InterfaceC48983JKh
    public final void onPause() {
        this.LIZ.m4().setVisibility(8);
    }

    public JL1(SearchCardPlayerSoundIconAssem searchCardPlayerSoundIconAssem) {
        this.LIZ = searchCardPlayerSoundIconAssem;
    }
}
