package com.ss.android.ugc.aweme.im.sdk.chatdetail.group.member;

import X.C04270Et;
import X.C101123y0;
import X.C101133y1;
import X.C16880lQ;
import X.C214298b3;
import X.C221108m2;
import X.C226668v0;
import X.C36L;
import X.C3EU;
import X.C43659HBn;
import X.C44384HbQ;
import X.C53708L6a;
import X.C62822Ol8;
import X.C63089OpR;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72375Sap;
import X.C72376Saq;
import X.C72377Sar;
import X.C72378Sas;
import X.C72379Sat;
import X.C77339UWx;
import X.C78897Uxp;
import X.C78939UyV;
import X.C7ZH;
import X.C80533Eb;
import X.C81243Gu;
import X.C90673h9;
import X.C90703hC;
import X.C99W;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.EnumC57365MfJ;
import X.EnumC62195Ob1;
import X.EnumC96113pv;
import X.InterfaceC100393wp;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.InterfaceC93923mO;
import X.L61;
import X.W5F;
import X.W5U;
import Y.ACListenerS36S0200000_1;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.socialpublish.viewmodel.InboxSocPubStatusViewModelImpl;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.group.functions.GroupDetailViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.group.member.MemberCell;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MemberCell extends PowerCell<C90703hC> {
    public final C214298b3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.b9l;
    }

    public MemberCell() {
        C214298b3 c214298b3;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(GroupDetailViewModel.class);
        AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 508);
        C101133y1 c101133y1 = C101133y1.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(LIZ, aqS151S0100000_1, C72377Sar.INSTANCE, new AqS151S0100000_1((InterfaceC93923mO) this, 509), new AqS162S0100000_12(this, 616), C72379Sat.INSTANCE, c101133y1, new AqS162S0100000_12(this, 617), 256);
        } else if (o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS151S0100000_1, C72375Sap.INSTANCE, new AqS151S0100000_1((InterfaceC93923mO) this, 493), new AqS151S0100000_1((InterfaceC93923mO) this, 504), C72378Sas.INSTANCE, c101133y1, new AqS162S0100000_12(this, 615), 256);
        } else if (c9bd == null || o.LJ(c9bd, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS151S0100000_1, C72376Saq.INSTANCE, new AqS151S0100000_1((InterfaceC93923mO) this, 505), new AqS151S0100000_1((InterfaceC93923mO) this, 506), new AqS151S0100000_1((InterfaceC93923mO) this, 507), c101133y1, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(C77339UWx.LIZLLL("Don't support this VMScope: ", c9bd, " there"));
        }
        this.LJLIL = c214298b3;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS151S0100000_1(this, LiveMaxRetainAlogMessageSizeSetting.DEFAULT));
        this.LJLJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 496));
        this.LJLJJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 499));
        this.LJLJJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 501));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 494));
        this.LJLJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 495));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 492));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 498));
        this.LJLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 497));
        this.LJLLI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 502));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 503));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C90703hC c90703hC) {
        C81243Gu c81243Gu;
        C63089OpR member;
        final C90703hC t = c90703hC;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C78897Uxp.LJJJJJL(itemView, 0.0f);
        C81243Gu c81243Gu2 = t.LJLIL;
        IMUser LJLIIIL = C44384HbQ.LJLIIIL(c81243Gu2);
        if (LJLIIIL != null) {
            L(LJLIIIL, t);
        } else {
            C80533Eb.LJIIJJI(c81243Gu2.getUid(), c81243Gu2.getSecUid(), false, new C3EU() { // from class: X.3hB
                @Override // X.C3EU
                public final void LIZ(IMUser result) {
                    o.LJIIIZ(result, "result");
                    MemberCell.this.L(result, t);
                }

                @Override // X.C3EU
                public final void LIZIZ(Throwable throwable) {
                    o.LJIIIZ(throwable, "throwable");
                }
            });
        }
        C90703hC item = getItem();
        if (item != null && (c81243Gu = item.LJLIL) != null && (member = c81243Gu.getMember()) != null && member.getRole() == EnumC96113pv.OWNER.getValue()) {
            if (C99W.LIZ) {
                ((View) this.LJLJJLL.getValue()).setBackground(C04270Et.LIZIZ(((View) this.LJLJJLL.getValue()).getContext(), R.drawable.bfz));
            }
            ((View) this.LJLJJLL.getValue()).setVisibility(0);
            return;
        }
        ((View) this.LJLJJLL.getValue()).setVisibility(8);
    }

    public final void L(IMUser iMUser, C90703hC c90703hC) {
        UrlModel urlModel;
        boolean z;
        int i;
        InterfaceC100393wp interfaceC100393wp;
        InboxSocPubStatusViewModelImpl inboxSocPubStatusViewModelImpl;
        IMUser LJLIIIL;
        if (iMUser != null) {
            urlModel = iMUser.getDisplayAvatar();
        } else {
            urlModel = null;
        }
        W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
        LJII.LJJIIJ = (SmartImageView) this.LJLJI.getValue();
        LJII.LJIILL = R.drawable.b0p;
        LJII.LJJIII = EnumC62195Ob1.SMALL;
        C43659HBn.LJIIZILJ(LJII, "GroupMemberModel", c90703hC.LJLIL.getUid(), 0, null, 28);
        if (iMUser != null) {
            User user = IMUser.toUser(iMUser);
            ((TextView) this.LJLJJI.getValue()).setText(iMUser.getNickName());
            if (!iMUser.isBlocked()) {
                ((TextView) this.LJLJL.getValue()).setText(iMUser.getUniqueId());
            }
            View view = (View) this.LJLJJL.getValue();
            IMUser LJLIIIL2 = C44384HbQ.LJLIIIL(c90703hC.LJLIL);
            if (LJLIIIL2 != null && LJLIIIL2.getFollowStatus() == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z && !o.LJ(iMUser.getSecUid(), C36L.LIZ())) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            if (C36L.LIZJ(iMUser) || iMUser.isBlocked()) {
                ((ImageView) this.LJLJLJ.getValue()).setVisibility(8);
                ((View) this.LJLJLLL.getValue()).setVisibility(8);
            } else {
                ((ImageView) this.LJLJLJ.getValue()).setVisibility(0);
                C16880lQ.LJJJ((TuxIconView) this.LJLJLJ.getValue(), new ACListenerS36S0200000_1(c90703hC, this, 8));
                if (((Number) C90673h9.LIZ.getValue()).intValue() == 2 && (LJLIIIL = C44384HbQ.LJLIIIL(c90703hC.LJLIL)) != null && !LJLIIIL.isBlock()) {
                    ((View) this.LJLJLLL.getValue()).setVisibility(0);
                    RelationButton followButton = (RelationButton) this.LJLJLLL.getValue();
                    o.LJIIIIZZ(followButton, "followButton");
                    o.LJIIIIZZ(user, "user");
                    C226668v0 c226668v0 = new C226668v0();
                    c226668v0.LIZ = user;
                    followButton.LLIIIJ.LJJJJJL(c226668v0.LIZ());
                    followButton.setTracker(C101123y0.LJLIL);
                    followButton.setFollowClickListener(new AqS183S0100000_1(user, 91));
                    C7ZH.LIZIZ(EnumC57365MfJ.SHOW, user, null);
                } else {
                    ((View) this.LJLJLLL.getValue()).setVisibility(8);
                }
            }
            C16880lQ.LJIIJ(new ACListenerS36S0200000_1(c90703hC, user, 9), this.itemView);
            String uid = user.getUid();
            if (uid != null && (inboxSocPubStatusViewModelImpl = (InboxSocPubStatusViewModelImpl) this.LJLLILLLL.getValue()) != null) {
                inboxSocPubStatusViewModelImpl.iv0(uid, true);
            }
            if (this.LJLLILLLL.getValue() == null || (interfaceC100393wp = (InterfaceC100393wp) this.LJLLI.getValue()) == null) {
                return;
            }
            user.setStoryStatus(C53708L6a.LIZIZ.LIZ(L61.STORY, user.getUid()));
            interfaceC100393wp.LJI(user);
        }
    }
}
