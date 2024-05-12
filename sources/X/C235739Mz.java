package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.userId.ProfileUserIdAssem;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.9Mz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C235739Mz extends AbstractC65781Prl implements InterfaceC88472Yns<C235719Mx, C76800UCe> {
    public final /* synthetic */ ProfileUserIdAssem LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL = 1;
    public final /* synthetic */ User LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C235739Mz(ProfileUserIdAssem profileUserIdAssem, long j, long j2, int i, User user) {
        super(1);
        this.LJLIL = profileUserIdAssem;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = i;
        this.LJLJJLL = user;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C235719Mx c235719Mx) {
        int i;
        C235719Mx it = c235719Mx;
        o.LJIIIZ(it, "it");
        if (this.LJLIL.getContext() != null && !this.LJLIL.C3()) {
            if (this.LJLILLLLZI - this.LJLJI > this.LJLJJI * 3600000) {
                C9PL c9pl = (C9PL) C8VC.LJIIIIZZ(this.LJLIL, C65352Pkq.LIZ(C9KV.class));
                if (c9pl != null && c9pl.LJ) {
                    ProfileUserIdAssem profileUserIdAssem = this.LJLIL;
                    if (profileUserIdAssem.LJLJJL) {
                        if (this.LJLJJL == 1) {
                            i = R.string.cle;
                        } else {
                            i = R.string.cll;
                        }
                        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(profileUserIdAssem), C36636EZk.LIZ, null, new C9N0(this.LJLIL, it, i, this.LJLJJLL, null), 2);
                        String uid = this.LJLJJLL.getUid();
                        o.LJIIIIZZ(uid, "user.uid");
                        C9NG.LIZ.LIZLLL().putLong(i0.LJFF("last_time_show_change_username_bubble_", uid), this.LJLILLLLZI).apply();
                    }
                }
                InterfaceC82683Wch interfaceC82683Wch = this.LJLIL.LJLJJI;
                if (interfaceC82683Wch != null) {
                    interfaceC82683Wch.dismiss();
                }
            } else {
                ProfileUserIdAssem profileUserIdAssem2 = this.LJLIL;
                if (profileUserIdAssem2.LJLJJI == null || !it.LJLIL) {
                    profileUserIdAssem2.x3(this.LJLJJLL);
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
