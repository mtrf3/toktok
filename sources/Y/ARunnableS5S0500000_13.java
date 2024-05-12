package Y;

import X.C77455UaZ;
import X.InterfaceC76622U5i;
import X.InterfaceC77461Uaf;
import X.U4R;
import X.U7T;
import X.U7V;
import android.content.Context;
import com.bytedance.android.live.wallet.model.ExchangeParams;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.InviteBizContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.MultiLiveContent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutDSLConfig;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tikcast.linkmic.common.GroupPlayer;
import webcast.im.CancelJoinGroupContent;

/* loaded from: classes14.dex */
public class ARunnableS5S0500000_13 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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
            default:
                return;
        }
    }

    public final void LIZ$0() {
        U4R.LIZLLL("Linker", "Cancel join group message callback for business.");
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = ((U7T) this.l0).LJII;
        CancelJoinGroupContent cancelJoinGroupContent = (CancelJoinGroupContent) this.l1;
        IMessage iMessage = (IMessage) this.l2;
        List list = (List) this.l3;
        GroupPlayer groupPlayer = (GroupPlayer) this.l4;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            InterfaceC76622U5i next = it.next();
            int i = cancelJoinGroupContent.type;
            if (i == 102) {
                next.LJJJJZ(new CancelInviteGroupMessage((LinkLayerMessage) iMessage, list, groupPlayer));
            } else if (i == 100) {
                next.LLII(new CancelApplyGroupMessage((LinkLayerMessage) iMessage, list, groupPlayer));
            }
        }
    }

    public final void LIZ$1() {
        int i;
        MultiLiveContent multiLiveContent;
        InviteBizContent inviteBizContent;
        U7T u7t = (U7T) this.l0;
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7t.LJII;
        LinkUser linkUser = (LinkUser) this.l1;
        OnLineMicInfo onLineMicInfo = (OnLineMicInfo) this.l2;
        LayoutDSLConfig layoutDSLConfig = (LayoutDSLConfig) this.l3;
        LinkLayerMessage linkLayerMessage = (LinkLayerMessage) this.l4;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            InterfaceC76622U5i next = it.next();
            CustomLinkMessage LJIILL = U7V.LJIILL(linkLayerMessage, null);
            BusinessContent businessContent = linkLayerMessage.bizContent;
            if (businessContent != null && (multiLiveContent = businessContent.multiLiveContent) != null && (inviteBizContent = multiLiveContent.inviteIMContent) != null) {
                i = inviteBizContent.inviteSource;
            } else {
                i = 0;
            }
            next.LJJJJJ(u7t, new InviteMessage(linkUser, onLineMicInfo, layoutDSLConfig, LJIILL, i, null, 32, null));
        }
    }

    public static final void run$0(ARunnableS5S0500000_13 aRunnableS5S0500000_13) {
        boolean LIZ;
        String penaltyWarningSkip;
        try {
            ExchangeParams exchangeParams = (ExchangeParams) aRunnableS5S0500000_13.l0;
            exchangeParams.skipKycReminder = true;
            CustomErrorExtra customErrorExtra = (CustomErrorExtra) aRunnableS5S0500000_13.l1;
            if (customErrorExtra == null) {
                penaltyWarningSkip = "";
            } else {
                penaltyWarningSkip = customErrorExtra.getPenaltyWarningSkip();
            }
            exchangeParams.penaltyWarningSkip = penaltyWarningSkip;
            ((C77455UaZ) aRunnableS5S0500000_13.l2).LJIIIIZZ((Context) aRunnableS5S0500000_13.l3, (ExchangeParams) aRunnableS5S0500000_13.l0, (CompletionBlock) aRunnableS5S0500000_13.l4);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS5S0500000_13 aRunnableS5S0500000_13) {
        boolean LIZ;
        try {
            aRunnableS5S0500000_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS5S0500000_13 aRunnableS5S0500000_13) {
        boolean LIZ;
        try {
            aRunnableS5S0500000_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS5S0500000_13(Object obj, ExchangeParams exchangeParams, CustomErrorExtra customErrorExtra, C77455UaZ c77455UaZ, Context context, CompletionBlock<InterfaceC77461Uaf> completionBlock) {
        this.$t = completionBlock;
        this.l0 = obj;
        this.l1 = exchangeParams;
        this.l2 = customErrorExtra;
        this.l3 = c77455UaZ;
        this.l4 = context;
    }
}
