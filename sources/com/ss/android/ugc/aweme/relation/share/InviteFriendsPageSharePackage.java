package com.ss.android.ugc.aweme.relation.share;

import X.ActivityC45651qj;
import X.C4LD;
import X.C62374Odu;
import X.C62387Oe7;
import X.C62394OeE;
import X.C73318Sq2;
import X.C73542Ste;
import X.C73969T1h;
import X.C78999UzT;
import X.InterfaceC62225ObV;
import X.T16;
import com.ss.android.ugc.aweme.relation.api.IInviteFriendsApi;
import com.ss.android.ugc.aweme.relation.api.InviteFriendsApiService;
import com.ss.android.ugc.aweme.relation.model.SmgSettingsModel;
import com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel;
import com.ss.android.ugc.aweme.share.improve.pkg.LinkDefaultSharePackage;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class InviteFriendsPageSharePackage extends LinkDefaultSharePackage {
    public final C73318Sq2 compositeDisposable;
    public final String enterFrom;
    public final IInviteFriendsApi inviteApi;
    public final String inviteMode;
    public SmgSettingsModel smgSettingsModel;

    public final void LJIILL() {
        this.compositeDisposable.LIZLLL();
    }

    public final void LJIIZILJ() {
        C78999UzT.LJFF(C73542Ste.LJII(this.inviteApi.getInviteFriendsSettings().LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()), null, new AqS176S0100000_10(this, 71), 1), this.compositeDisposable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteFriendsPageSharePackage(C62374Odu c62374Odu) {
        super(c62374Odu);
        InviteFriendsApiService inviteApi = InviteFriendsApiService.LIZIZ;
        o.LJIIIZ(inviteApi, "inviteApi");
        this.inviteMode = "invitevia";
        this.enterFrom = "invite_friends";
        this.inviteApi = inviteApi;
        this.compositeDisposable = new C73318Sq2();
    }

    public final List<InterfaceC62225ObV> LJIILLIIL(ActivityC45651qj activityC45651qj) {
        C62394OeE c62394OeE = new C62394OeE();
        C4LD.LIZ.LJJJJ(c62394OeE, activityC45651qj, true);
        c62394OeE.LJIIZILJ = this;
        c62394OeE.LIZIZ(new CopyLinkChannel(false));
        C62387Oe7 c62387Oe7 = new C62387Oe7(c62394OeE);
        if (c62387Oe7.LJFF) {
            Iterator<InterfaceC62225ObV> it = c62387Oe7.LIZ.iterator();
            while (it.hasNext()) {
                if (!it.next().LIZLLL(activityC45651qj)) {
                    it.remove();
                }
            }
        }
        return c62387Oe7.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f2, code lost:
    
        if (r1 != null) goto L35;
     */
    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(android.content.Context r16, X.InterfaceC62225ObV r17) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.share.InviteFriendsPageSharePackage.LIZIZ(android.content.Context, X.ObV):boolean");
    }
}
