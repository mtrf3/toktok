package com.ss.android.ugc.aweme.relation.friendlist.cell;

import X.C16880lQ;
import X.C184077Kh;
import X.C1EU;
import X.C214378bB;
import X.C214528bQ;
import X.C32151Nz;
import X.C47261Igj;
import X.C58450Mwo;
import X.C61878OQg;
import X.C62427Oel;
import X.C62428Oem;
import X.C62454OfC;
import X.C62721OjV;
import X.C62722OjW;
import X.C62724OjY;
import X.C65352Pkq;
import X.C78926UyI;
import X.C78939UyV;
import X.C88913eJ;
import X.EnumC57444Mga;
import X.EnumC62195Ob1;
import X.EnumC62723OjX;
import X.HG3;
import X.InterfaceC101213y9;
import X.RBX;
import X.S3I;
import X.S3L;
import X.SY4;
import X.W5F;
import X.W5U;
import X.X1D;
import X.XMX;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.im.message.template.card.ImageCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.imagecard.ImageCardTitleBar;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkType;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QueryDataComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageEventParcel;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.NowFriendInviteMsgInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserNowInfo;
import com.ss.android.ugc.aweme.relation.friendlist.InviteFriendVM;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.o;
import q03.IDaS203S0200000_10;
import q03.IDaS487S0100000_9;

/* loaded from: classes11.dex */
public final class InviteFriendUserCell extends PowerCell<XMX> {
    public final C62427Oel LJLIL = C62428Oem.LIZ(C62454OfC.LJLIL);
    public final C214378bB LJLILLLLZI = new C214378bB(C65352Pkq.LIZ(InviteFriendVM.class), null, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, C58450Mwo.INSTANCE, null, null);

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.ay7;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        C62724OjY c62724OjY;
        String uid;
        C62724OjY c62724OjY2;
        super.onViewAttachedToWindow();
        InviteFriendVM inviteFriendVM = (InviteFriendVM) this.LJLILLLLZI.getValue();
        XMX item = getItem();
        String str = null;
        if (item == null || (c62724OjY = item.LJLIL) == null || (uid = c62724OjY.getUid()) == null || !((Set) inviteFriendVM.LJLIL.getValue()).add(uid)) {
            return;
        }
        XMX item2 = getItem();
        if (item2 != null && (c62724OjY2 = item2.LJLIL) != null) {
            str = c62724OjY2.getUid();
        }
        C62722OjW.LIZ(str, EnumC62723OjX.SHOW, getAbsoluteAdapterPosition());
    }

    public final void L(User user) {
        List list;
        UserNowInfo userNowInfo;
        NowFriendInviteMsgInfo nowFriendInviteMsgInfo;
        String str;
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        if (curUser != null && (userNowInfo = curUser.userNowInfo) != null && (nowFriendInviteMsgInfo = userNowInfo.nowFriendInviteMsgInfo) != null && (str = nowFriendInviteMsgInfo.photo) != null) {
            list = C47261Igj.LJJIJ(str);
        } else {
            list = C61878OQg.INSTANCE;
        }
        InterfaceC101213y9 sendMessageTemplateService = IMService.createIIMServicebyMonsterPlugin(false).getSendMessageTemplateService();
        List<? extends IMContact> LJJIJIL = C47261Igj.LJJIJIL(IMUser.fromUser(user));
        ImageCardTitleBar imageCardTitleBar = new ImageCardTitleBar(new ImageComponent(list, (String) null, (ResolutionComponent) null, (String) null, (IconTypeComponent) null, 62), new TextComponent(C88913eJ.LIZ(this.itemView, R.string.j6r, "itemView.context.getStri…share_invite_card_header)")), new TextComponent(C88913eJ.LIZ(this.itemView, R.string.j31, "itemView.context.getStri…ing.now_inbox_share_desc)")), 8);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("aweme://now/invite?uid=");
        LIZ.append(curUser.getUid());
        ActionLinkComponent actionLinkComponent = new ActionLinkComponent(C47261Igj.LJJIJ(X1D.LIZIZ(LIZ)), ActionLinkType.DEEP_LINK);
        PreviewHintComponent previewHintComponent = new PreviewHintComponent(new TextComponent(C88913eJ.LIZ(this.itemView, R.string.j2w, "itemView.context.getStri…now_inbox_now_link_share)")), new TextComponent(C88913eJ.LIZ(this.itemView, R.string.j2v, "itemView.context.getStri…tring.now_inbox_now_link)")), new TextComponent(C88913eJ.LIZ(this.itemView, R.string.h81, "itemView.context.getString(R.string.im_quote_link)")));
        String uid = curUser.getUid();
        o.LJIIIIZZ(uid, "fromUser.uid");
        sendMessageTemplateService.LIZ(LJJIJIL, new SendMessageTemplateTask("now_invite", new ImageCardTemplate(imageCardTitleBar, actionLinkComponent, (List) null, previewHintComponent, new BaseRequestComponent(new QueryDataComponent(uid, this.LJLIL.LJFF())), 20), new SendMessageEventParcel("homepage_now", (String) null, (String) null, (String) null, 30), null), this.itemView.getContext().getString(R.string.j6s), new C62721OjV(this, user));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(XMX xmx, List payloads) {
        XMX t = xmx;
        o.LJIIIZ(t, "t");
        o.LJIIIZ(payloads, "payloads");
        super.onBindItemView(t, payloads);
        C62724OjY c62724OjY = t.LJLIL;
        SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.abl);
        if (c62724OjY.getAvatarMedium() == null) {
            smartImageView.setImageResource(R.drawable.b7n);
        } else {
            W5F LJII = W5U.LJII(C78939UyV.LJ(c62724OjY.getAvatarMedium()));
            LJII.LJJIIJ = smartImageView;
            LJII.LJJIII = EnumC62195Ob1.SMALL;
            S3I s3i = new S3I();
            s3i.LIZIZ = C32151Nz.LJIIZILJ(1);
            s3i.LIZJ = C1EU.LIZ(this.itemView, "itemView.context", R.attr.cf);
            s3i.LIZLLL = C32151Nz.LJIIZILJ(48);
            LJII.LJIJJLI = new S3L(s3i);
            LJII.LJIIJJI = R.drawable.b7n;
            LJII.LJIILL = R.drawable.b7n;
            C16880lQ.LLJJJ(LJII);
        }
        ((TextView) this.itemView.findViewById(R.id.h1f)).setText(c62724OjY.getNickname());
        ((TextView) this.itemView.findViewById(R.id.gv1)).setText(c62724OjY.getUniqueId());
        this.itemView.findViewById(R.id.err).setVisibility(0);
        ((TextView) this.itemView.findViewById(R.id.err)).setText(this.itemView.getContext().getString(R.string.j35));
        ((SY4) this.itemView.findViewById(R.id.err)).setButtonVariant(EnumC57444Mga.TT_NOW_INVITE.getValue());
        View findViewById = this.itemView.findViewById(R.id.err);
        o.LJIIIIZZ(findViewById, "itemView.inviteFriendButton");
        C16880lQ.LJIIJ(new IDaS203S0200000_10(this, c62724OjY, 5), findViewById);
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C16880lQ.LJIIJ(new IDaS487S0100000_9(c62724OjY, 7), itemView);
    }
}
