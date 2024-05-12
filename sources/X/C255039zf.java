package X;

import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.AcceptInviteCardResponse;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.GroupInviteViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.9zf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C255039zf extends TBS implements InterfaceC88472Yns<AcceptInviteCardResponse, C76800UCe> {
    public C255039zf(Object obj) {
        super(1, obj, C255099zl.class, "joinGroupInviteOnSuccess", "joinGroupInviteOnSuccess(Lcom/ss/android/ugc/aweme/im/sdk/chat/feature/group/data/model/AcceptInviteCardResponse;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(AcceptInviteCardResponse acceptInviteCardResponse) {
        AcceptInviteCardResponse p0 = acceptInviteCardResponse;
        o.LJIIIZ(p0, "p0");
        C255099zl c255099zl = (C255099zl) this.receiver;
        c255099zl.getClass();
        if (p0.getInviteError() == null) {
            Integer inviteeGroupStatus = p0.getInviteeGroupStatus();
            if (inviteeGroupStatus != null) {
                if (inviteeGroupStatus.intValue() == 3) {
                    GroupInviteViewModel groupInviteViewModel = c255099zl.LJLILLLLZI;
                    if (groupInviteViewModel != null) {
                        groupInviteViewModel.hv0(c255099zl.LJLIL);
                    } else {
                        o.LJIJI("invitationCheckViewModel");
                        throw null;
                    }
                } else if (inviteeGroupStatus.intValue() == 2) {
                    ((TuxIconView) C16880lQ.LLLLIILL(C16880lQ.LLZIL(c255099zl.LJLIL), R.layout.b1i, null, false).findViewById(R.id.ee_)).setTintColor(AnonymousClass636.LJIIIIZZ(R.attr.gp, c255099zl.LJLIL));
                    C26227ARb LIZIZ = C77413UZt.LIZIZ(c255099zl.LJLIL);
                    LIZIZ.LJII = false;
                    LIZIZ.LIZ(R.string.gw6);
                    UC0.LIZJ(LIZIZ, C255049zg.LJLIL);
                    LIZIZ.LIZJ(new AqS170S0100000_4(c255099zl, 924));
                    C26231ARf LJI = LIZIZ.LJI();
                    c255099zl.LJLJJI.add(LJI);
                    LJI.LIZLLL();
                }
            }
        } else {
            c255099zl.LIZLLL(null, p0.getInviteError(), false);
        }
        return C76800UCe.LIZ;
    }
}
