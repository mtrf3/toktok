package Y;

import X.C0WE;
import X.C0WF;
import X.C32014ChO;
import X.C41081jM;
import X.C76929UHd;
import X.C77444UaO;
import X.C78368UpI;
import X.C78391Upf;
import X.C78392Upg;
import X.C85700XkG;
import X.EnumC46491IMl;
import X.EnumC75617Tm1;
import X.EnumC78973Uz3;
import X.HG3;
import X.InterfaceC31981Ni;
import X.InterfaceC65784Pro;
import X.InterfaceC76622U5i;
import X.InterfaceC76768UAy;
import X.InterfaceC78395Upj;
import X.InterfaceC88471Ynr;
import X.U7F;
import X.U7T;
import X.U7U;
import X.U7V;
import X.U9F;
import X.U9I;
import X.UBA;
import X.V9R;
import X.V9T;
import X.V9U;
import X.W5O;
import X.X1D;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewViewModel;
import com.bytedance.android.live.wallet.model.ExchangeParams;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.InviteBizContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.MultiLiveContent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DirectJoinMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ExtraDataWrapper;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutDSLConfig;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteMessage;
import com.bytedance.android.livesdk.comp.impl.linkcore.LinkCoreService;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linkcore.DSLConfig;
import com.bytedance.android.livesdk.model.message.linkcore.InviteContent;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.android.livesdk.model.message.linker.reply_message.LinkerReplyContent;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import com.bytedance.globalpayment.iap.common.ability.model.OrderInfo;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.tasm.base.LLog;
import com.ss.android.ugc.aweme.account.model.VerificationMethodType;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tikcast.linkmic.common.GroupPlayer;
import webcast.im.JoinGroupContent;

/* loaded from: classes14.dex */
public class ARunnableS16S0400000_13 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            case 14:
                run$14(this);
                return;
            case 15:
                run$15(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        DSLConfig dSLConfig;
        int i;
        InviteBizContent inviteBizContent;
        MultiLiveContent multiLiveContent;
        InviteBizContent inviteBizContent2;
        U7T u7t = (U7T) this.l0;
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7t.LJII;
        LinkUser linkUser = (LinkUser) this.l1;
        OnLineMicInfo onLineMicInfo = (OnLineMicInfo) this.l2;
        LinkLayerMessage linkLayerMessage = (LinkLayerMessage) this.l3;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            InterfaceC76622U5i next = it.next();
            InviteContent inviteContent = linkLayerMessage.inviteContent;
            User user = null;
            if (inviteContent != null) {
                dSLConfig = inviteContent.dsl;
            } else {
                dSLConfig = null;
            }
            LayoutDSLConfig LJI = U7V.LJI(dSLConfig);
            CustomLinkMessage LJIILL = U7V.LJIILL(linkLayerMessage, null);
            BusinessContent businessContent = linkLayerMessage.bizContent;
            if (businessContent != null && (multiLiveContent = businessContent.multiLiveContent) != null && (inviteBizContent2 = multiLiveContent.inviteIMContent) != null) {
                i = inviteBizContent2.inviteSource;
            } else {
                i = 0;
                if (businessContent == null) {
                    next.LJJLIIIIJ(u7t, new InviteMessage(linkUser, onLineMicInfo, LJI, LJIILL, i, user));
                }
            }
            MultiLiveContent multiLiveContent2 = businessContent.multiLiveContent;
            if (multiLiveContent2 != null && (inviteBizContent = multiLiveContent2.inviteIMContent) != null) {
                user = inviteBizContent.inviteeUserInfo;
            }
            next.LJJLIIIIJ(u7t, new InviteMessage(linkUser, onLineMicInfo, LJI, LJIILL, i, user));
        }
    }

    public final void LIZ$1() {
        U7T u7t = (U7T) this.l0;
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7t.LJII;
        LinkUser linkUser = (LinkUser) this.l1;
        OnLineMicInfo onLineMicInfo = (OnLineMicInfo) this.l2;
        IMessage iMessage = (IMessage) this.l3;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            it.next().LJJZZIII(u7t, new DirectJoinMessage(linkUser, onLineMicInfo, U7V.LJIILL((LinkLayerMessage) iMessage, null)));
        }
    }

    public final void LIZ$2() {
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = ((U7T) this.l0).LJII;
        JoinGroupContent joinGroupContent = (JoinGroupContent) this.l1;
        IMessage iMessage = (IMessage) this.l2;
        GroupPlayer groupPlayer = (GroupPlayer) this.l3;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            InterfaceC76622U5i next = it.next();
            int i = joinGroupContent.type;
            if (i == 102) {
                LinkLayerMessage linkLayerMessage = (LinkLayerMessage) iMessage;
                next.LLIILZL(new InviteGroupMessage(linkLayerMessage, groupPlayer, linkLayerMessage.bizContent));
            } else if (i == 100) {
                LinkLayerMessage linkLayerMessage2 = (LinkLayerMessage) iMessage;
                next.LJIL(new ApplyGroupMessage(linkLayerMessage2, groupPlayer, linkLayerMessage2.bizContent));
            }
        }
    }

    public final void LIZ$3() {
        try {
            String str = ((V9U) this.l0).LJFF;
            if (str != null && str.startsWith("asset")) {
                V9T LJIIIIZZ = ((V9R) this.l3).LJIIIIZZ((Context) this.l1, (V9U) this.l0);
                if (LJIIIIZZ != null) {
                    V9R v9r = (V9R) this.l3;
                    v9r.LIZJ.post(new ARunnableS32S0200000_13(LJIIIIZZ, v9r, 98));
                    return;
                }
                return;
            }
            V9T LJIIIZ = ((V9R) this.l3).LJIIIZ((V9U) this.l0);
            if (LJIIIZ != null) {
                V9R v9r2 = (V9R) this.l3;
                v9r2.LIZJ.post(new ARunnableS32S0200000_13(LJIIIZ, v9r2, 98));
            } else {
                ((V9R) this.l3).LJIIJ((Context) this.l1, (V9U) this.l2);
            }
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("loadOriginBitmap failed: ");
            LIZ.append(th.toString());
            LLog.LIZLLL(4, "BigImageDrawingHelper", X1D.LIZIZ(LIZ));
        }
    }

    public final void LIZ$4() {
        U7F u7f = (U7F) this.l0;
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7f.LJIILJJIL;
        LinkUser linkUser = (LinkUser) this.l1;
        LinkerReplyContent linkerReplyContent = (LinkerReplyContent) this.l2;
        IMessage iMessage = (IMessage) this.l3;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            LinkMessage linkMessage = (LinkMessage) iMessage;
            it.next().LLD(u7f, new PermitApplyMessage(linkUser, linkerReplyContent.replyStatus, null, null, new CustomLinkMessage(u7f.LJFF, null, new ExtraDataWrapper(null, linkerReplyContent, linkMessage.expireTimestamp, linkMessage)), null, 32, null));
        }
    }

    public final void LIZ$5() {
        ((U7F) this.l0).LJJIIJ(((LinkerReplyContent) this.l1).inviteeUid);
        U7F u7f = (U7F) this.l0;
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7f.LJIILJJIL;
        LinkUser linkUser = (LinkUser) this.l2;
        LinkerReplyContent linkerReplyContent = (LinkerReplyContent) this.l1;
        IMessage iMessage = (IMessage) this.l3;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            LinkMessage linkMessage = (LinkMessage) iMessage;
            it.next().LJJLJ(u7f, new ReplyInviteMessage(linkUser, linkerReplyContent.replyStatus, null, new CustomLinkMessage(u7f.LJFF, null, new ExtraDataWrapper(null, linkerReplyContent, linkMessage.expireTimestamp, linkMessage)), null, null, 48, null));
        }
        LinkerReplyContent linkerReplyContent2 = (LinkerReplyContent) this.l1;
        if (linkerReplyContent2.replyStatus == 1) {
            if (linkerReplyContent2.sourceType == EnumC75617Tm1.RANDOM_LINK_MIC_RECOMMEND.getType() || ((LinkerReplyContent) this.l1).sourceType == EnumC75617Tm1.TOPIC_PAIR.getType()) {
                U7U LJJIIZI = ((U7F) this.l0).LJJIIZI();
                U7F u7f2 = (U7F) this.l0;
                U7U.LJIIZILJ(LJJIIZI, u7f2, u7f2.LJJIIZ().LJLLL, false, true, false, false, "business_multi_host_handle_reply_invite_msg", null, 180);
                ((U7F) this.l0).LJJIIZ().LJLLLL = true;
            }
            if (!((U7F) this.l0).LJJIIZ().LJLLILLLL) {
                ((U7F) this.l0).LJJIIZI().LJJJZ(null);
            }
            if (!((U7F) this.l0).LJJIIZ().LJLLLL) {
                U7F u7f3 = (U7F) this.l0;
                Iterator<InterfaceC76622U5i> it2 = u7f3.LJIILJJIL.iterator();
                while (it2.hasNext()) {
                    it2.next().LJII(new U9I(u7f3));
                }
            }
        }
    }

    public final void LIZ$6() {
        if (!((C76929UHd) this.l0).isAttachedToWindow()) {
            return;
        }
        ((C41081jM) this.l1).setTranslationX(0.0f);
        ((C41081jM) this.l1).setAlpha(1.0f);
        ((C41081jM) this.l1).setVisibility(8);
        ((ArrayList) ((C76929UHd) this.l0).LJLJL).remove((ViewPropertyAnimator) this.l2);
        ((InterfaceC65784Pro) this.l3).invoke();
    }

    public static final void run$0(ARunnableS16S0400000_13 aRunnableS16S0400000_13) {
        C77444UaO c77444UaO = (C77444UaO) aRunnableS16S0400000_13.l0;
        ExchangeParams exchangeParams = (ExchangeParams) aRunnableS16S0400000_13.l1;
        CustomErrorExtra customErrorExtra = (CustomErrorExtra) aRunnableS16S0400000_13.l2;
        Context context = (Context) aRunnableS16S0400000_13.l3;
        c77444UaO.getClass();
        exchangeParams.skipKycReminder = true;
        exchangeParams.penaltyWarningSkip = "";
        if (customErrorExtra != null) {
            exchangeParams.penaltyWarningSkip = customErrorExtra.getPenaltyWarningSkip();
        }
        c77444UaO.LIZLLL.goExchangeToCoins(context, exchangeParams);
    }

    public static final void run$1(ARunnableS16S0400000_13 aRunnableS16S0400000_13) {
        boolean LIZ;
        InterfaceC31981Ni interfaceC31981Ni;
        try {
            String LIZJ = C0WE.LIZJ(((View) aRunnableS16S0400000_13.l0).getWidth(), ((View) aRunnableS16S0400000_13.l0).getHeight(), (Integer) aRunnableS16S0400000_13.l1, (Integer) aRunnableS16S0400000_13.l2, true);
            AbsMultiGuestNewPreviewViewModel Kl = ((AbsMultiGuestNewPreviewFragment) aRunnableS16S0400000_13.l3).Kl();
            C0WF c0wf = null;
            if (Kl != null) {
                c0wf = Kl.gv0();
            }
            if ((c0wf instanceof InterfaceC31981Ni) && (interfaceC31981Ni = (InterfaceC31981Ni) c0wf) != null) {
                interfaceC31981Ni.LJJ(LIZJ);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS16S0400000_13 aRunnableS16S0400000_13) {
        boolean LIZ;
        try {
            aRunnableS16S0400000_13.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(ARunnableS16S0400000_13 aRunnableS16S0400000_13) {
        boolean LIZ;
        try {
            aRunnableS16S0400000_13.LIZ$6();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(ARunnableS16S0400000_13 aRunnableS16S0400000_13) {
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) aRunnableS16S0400000_13.l0;
        Bundle bundle = (Bundle) aRunnableS16S0400000_13.l1;
        ArrayList arrayList = (ArrayList) aRunnableS16S0400000_13.l2;
        VerificationMethodType verificationMethodType = (VerificationMethodType) aRunnableS16S0400000_13.l3;
        i18nSettingManageMyAccountActivity.LJLJI = true;
        i18nSettingManageMyAccountActivity.LJIJ();
        bundle.putInt("phone_number_source", EnumC78973Uz3.DYABindPhoneNumberSourceTypeAccountManagementPhoneNumber.getValue());
        bundle.putSerializable("eligible_verification_methods", arrayList);
        String value = EnumC46491IMl.MANAGE_MY_ACCOUNT.getValue();
        int i = C85700XkG.LIZ[verificationMethodType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                HG3.LJFF().modifyMobileVerifyByPassword(i18nSettingManageMyAccountActivity, value, bundle, null);
                return;
            }
            HG3.LJFF().modifyMobileVerifyByEmail(i18nSettingManageMyAccountActivity, value, bundle, null);
            return;
        }
        HG3.LJFF().modifyMobile(i18nSettingManageMyAccountActivity, value, bundle, null);
    }

    public static final void run$13(ARunnableS16S0400000_13 aRunnableS16S0400000_13) {
        C78392Upg c78392Upg = (C78392Upg) aRunnableS16S0400000_13.l0;
        C78368UpI c78368UpI = (C78368UpI) aRunnableS16S0400000_13.l1;
        OrderInfo orderInfo = (OrderInfo) aRunnableS16S0400000_13.l2;
        InterfaceC78395Upj interfaceC78395Upj = (InterfaceC78395Upj) aRunnableS16S0400000_13.l3;
        c78392Upg.getClass();
        C78392Upg.LIZ(c78368UpI, interfaceC78395Upj, orderInfo);
    }

    public static final void run$14(ARunnableS16S0400000_13 aRunnableS16S0400000_13) {
        ((C78391Upf) aRunnableS16S0400000_13.l0).LJ((IapPaymentMethod) aRunnableS16S0400000_13.l1, (C78368UpI) aRunnableS16S0400000_13.l2, (List) aRunnableS16S0400000_13.l3);
    }

    public static final void run$15(ARunnableS16S0400000_13 aRunnableS16S0400000_13) {
        boolean LIZ;
        try {
            U9F u9f = ((U7U) aRunnableS16S0400000_13.l0).LJFF;
            if (u9f != null) {
                u9f.LJJIIJ((String[]) aRunnableS16S0400000_13.l1, (boolean[]) aRunnableS16S0400000_13.l2, (int[]) aRunnableS16S0400000_13.l3);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS16S0400000_13 aRunnableS16S0400000_13) {
        boolean LIZ;
        try {
            CopyOnWriteArrayList<UBA> copyOnWriteArrayList = ((LinkCoreService) aRunnableS16S0400000_13.l0).LJLJJLL;
            U7F u7f = (U7F) aRunnableS16S0400000_13.l2;
            Iterator<UBA> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().LIZLLL(u7f);
            }
            InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) aRunnableS16S0400000_13.l1;
            if (interfaceC88471Ynr != null) {
                interfaceC88471Ynr.invoke((U7F) aRunnableS16S0400000_13.l2, (IMessage) aRunnableS16S0400000_13.l3);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS16S0400000_13 aRunnableS16S0400000_13) {
        boolean LIZ;
        try {
            aRunnableS16S0400000_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS16S0400000_13 aRunnableS16S0400000_13) {
        boolean LIZ;
        try {
            C32014ChO.LIZJ(U7T.LJJJJI(958), "invite error", null);
            InterfaceC76768UAy interfaceC76768UAy = (InterfaceC76768UAy) aRunnableS16S0400000_13.l1;
            if (interfaceC76768UAy != null) {
                interfaceC76768UAy.LIZJ((LinkCoreError) aRunnableS16S0400000_13.l2, (Throwable) aRunnableS16S0400000_13.l3);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS16S0400000_13 aRunnableS16S0400000_13) {
        boolean LIZ;
        try {
            aRunnableS16S0400000_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS16S0400000_13 aRunnableS16S0400000_13) {
        boolean LIZ;
        try {
            aRunnableS16S0400000_13.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS16S0400000_13 aRunnableS16S0400000_13) {
        boolean LIZ;
        try {
            C32014ChO.LIZJ(U7T.LJJJJI(1008), "moderatorInvite error", null);
            InterfaceC76768UAy interfaceC76768UAy = (InterfaceC76768UAy) aRunnableS16S0400000_13.l1;
            if (interfaceC76768UAy != null) {
                interfaceC76768UAy.LIZJ((LinkCoreError) aRunnableS16S0400000_13.l2, (Throwable) aRunnableS16S0400000_13.l3);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS16S0400000_13 aRunnableS16S0400000_13) {
        boolean LIZ;
        try {
            aRunnableS16S0400000_13.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS16S0400000_13 aRunnableS16S0400000_13) {
        boolean LIZ;
        try {
            aRunnableS16S0400000_13.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS16S0400000_13(com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser r2, X.U7F r3, com.bytedance.android.livesdk.model.message.linker.reply_message.LinkerReplyContent r4, X.CR6 r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            switch(r6) {
                case 9: goto L12;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r4
            r0.l2 = r2
            r0.l3 = r5
        Le:
            r0.<init>()
            return
        L12:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            r0.l2 = r4
            r0.l3 = r5
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS16S0400000_13.<init>(com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser, X.U7F, com.bytedance.android.livesdk.model.message.linker.reply_message.LinkerReplyContent, X.CR6, int):void");
    }

    public ARunnableS16S0400000_13(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }

    public ARunnableS16S0400000_13(V9R v9r, V9U v9u, Context context, W5O w5o, V9U v9u2, int i) {
        this.$t = i;
        this.l3 = v9r;
        this.l0 = v9u;
        this.l1 = context;
        this.l2 = v9u2;
    }
}
