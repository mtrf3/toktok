package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.fragment.ShareInviteContentFragment;
import com.ss.android.ugc.aweme.relation.share.InviteFriendsSheetPackage;
import com.ss.android.ugc.aweme.relation.viewmodel.ShareInviteContentVM;
import kotlin.jvm.internal.o;

/* renamed from: X.OYv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62101OYv implements InterfaceC113814dN {
    public final /* synthetic */ ShareInviteContentFragment LJLIL;

    public C62101OYv(ShareInviteContentFragment shareInviteContentFragment) {
        this.LJLIL = shareInviteContentFragment;
    }

    @Override // X.InterfaceC113814dN
    public final void LJIIIZ(InterfaceC62225ObV channel, View view) {
        User user;
        o.LJIIIZ(channel, "channel");
        ShareInviteContentVM shareInviteContentVM = this.LJLIL.LJLILLLLZI;
        if (shareInviteContentVM != null) {
            C36162EHe c36162EHe = shareInviteContentVM.LJLJJL;
            if (c36162EHe != null) {
                c36162EHe.LIZ("invite", channel.key());
                ShareInviteContentVM shareInviteContentVM2 = this.LJLIL.LJLILLLLZI;
                if (shareInviteContentVM2 != null) {
                    C36162EHe c36162EHe2 = shareInviteContentVM2.LJLJJL;
                    if (c36162EHe2 != null) {
                        String platform = channel.key();
                        o.LJIIIZ(platform, "platform");
                        C220488l2 c220488l2 = C220488l2.LIZIZ;
                        C50921Jyf c50921Jyf = new C50921Jyf();
                        c50921Jyf.LJLLL = "url_form";
                        c50921Jyf.LIZLLL = c36162EHe2.LIZ;
                        c50921Jyf.LJJIIZ(c36162EHe2.LIZIZ);
                        Aweme aweme = c36162EHe2.LIZIZ;
                        if (aweme != null) {
                            user = aweme.getAuthor();
                        } else {
                            user = null;
                        }
                        c50921Jyf.LLI = C227768wm.LJIJ(user);
                        c50921Jyf.LJJLIIIIJ = platform;
                        c50921Jyf.LLFZ = "1";
                        Object LJII = c220488l2.LJII(c36162EHe2.LIZIZ, c50921Jyf);
                        C222578oP.LIZJ(LJII, c36162EHe2.LIZIZ, null, null, 14);
                        ((JHM) LJII).LJIILIIL();
                        ShareInviteContentVM shareInviteContentVM3 = this.LJLIL.LJLILLLLZI;
                        if (shareInviteContentVM3 != null) {
                            InviteFriendsSheetPackage inviteFriendsSheetPackage = shareInviteContentVM3.LJLJJI;
                            if (inviteFriendsSheetPackage != null) {
                                AbstractC62625Ohx LJIIJJI = inviteFriendsSheetPackage.LJIIJJI(channel);
                                Context requireContext = this.LJLIL.requireContext();
                                o.LJIIIIZZ(requireContext, "requireContext()");
                                channel.LJIIJ(LJIIJJI, requireContext, null);
                                ASQ.LJ(this.LJLIL, ASX.LIZ);
                                return;
                            }
                            o.LJIJI("inviteFriendsSheetPackage");
                            throw null;
                        }
                        o.LJIJI("shareInviteContentVM");
                        throw null;
                    }
                    o.LJIJI("eventTacker");
                    throw null;
                }
                o.LJIJI("shareInviteContentVM");
                throw null;
            }
            o.LJIJI("eventTacker");
            throw null;
        }
        o.LJIJI("shareInviteContentVM");
        throw null;
    }
}
