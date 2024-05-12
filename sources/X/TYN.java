package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.live.liveinteract.voicechat.main.common.assem.VoiceChatMaskAbility;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TYN implements TYL {
    public final boolean LJLIL;
    public Fragment LJLILLLLZI;
    public VoiceChatMaskAbility LJLJI;

    @Override // X.InterfaceC75402TiY
    public final void LJJJJI() {
    }

    @Override // X.InterfaceC75402TiY
    public final Class<Object> LLIIJI() {
        return TYL.class;
    }

    public final VoiceChatMaskAbility LIZ() {
        VoiceChatMaskAbility voiceChatMaskAbility = this.LJLJI;
        if (voiceChatMaskAbility == null) {
            Fragment fragment = this.LJLILLLLZI;
            if (fragment != null && fragment.isAdded()) {
                Fragment fragment2 = this.LJLILLLLZI;
                if (fragment2 != null) {
                    VoiceChatMaskAbility voiceChatMaskAbility2 = (VoiceChatMaskAbility) UC0.LJIIL(UC0.LJJIJLIJ(fragment2), VoiceChatMaskAbility.class, null);
                    if (voiceChatMaskAbility2 != null) {
                        this.LJLJI = voiceChatMaskAbility2;
                        return voiceChatMaskAbility2;
                    }
                } else {
                    o.LJIJI("fragment");
                    throw null;
                }
            }
            return null;
        }
        return voiceChatMaskAbility;
    }

    @Override // X.TYL
    public final void D5() {
        VoiceChatMaskAbility LIZ = LIZ();
        if (LIZ != null) {
            LIZ.D5();
        }
    }

    @Override // X.TYL
    public final void k8() {
        VoiceChatMaskAbility LIZ = LIZ();
        if (LIZ != null) {
            LIZ.k8();
        }
    }

    public TYN(boolean z) {
        this.LJLIL = z;
    }
}
