package X;

import Y.AObjectS45S0101000_13;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.model.AnchorResumeSharedBgEvent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCreateChannelResponse;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCreateChannelResponseData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import tikcast.linkmic.controller.ResumeResp;
import webcast.data.multilive_biz.BizResumeResponse;

/* renamed from: X.TcO, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75020TcO implements InterfaceC75414Tik<CreateChannelResult> {
    public final /* synthetic */ EnumC74990Tbu LJLIL;
    public final /* synthetic */ C75492Tk0 LJLILLLLZI;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(CreateChannelResult createChannelResult) {
        BizCreateChannelResponseData bizCreateChannelResponseData;
        BizResumeResponse bizResumeResponse;
        BizResumeResponse.ResponseData responseData;
        CreateChannelResult createChannelResult2 = createChannelResult;
        C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
        String str = this.LJLILLLLZI.LJLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("initAndTurnOnMultiGuest -> ");
        LIZ.append(createChannelResult2);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LJIILIIL.getClass();
        C0NE.LIZ(str, LIZIZ);
        if (this.LJLIL == EnumC74990Tbu.USER_CLICK) {
            HashMap hashMap = new HashMap();
            C75457TjR.LIZLLL(hashMap);
            hashMap.put("open_method", "manual");
            C75457TjR.LJJI("livesdk_anchor_guest_connection_open", hashMap);
        } else {
            HashMap hashMap2 = new HashMap();
            C75457TjR.LIZLLL(hashMap2);
            hashMap2.put("open_method", "auto");
            C75457TjR.LJJI("livesdk_anchor_guest_connection_open", hashMap2);
        }
        C75492Tk0 c75492Tk0 = this.LJLILLLLZI;
        c75492Tk0.getClass();
        InterfaceC75495Tk3 interfaceC75495Tk3 = (InterfaceC75495Tk3) c75492Tk0.mView;
        if (interfaceC75495Tk3 != null) {
            InterfaceC55235Lm3 LJIILL = C44729Hgz.LJIILL(interfaceC75495Tk3);
            if (LJIILL != null) {
                C44729Hgz.LIZ(LJIILL, true);
            }
            interfaceC75495Tk3.nJ(this.LJLIL);
        }
        if (MultiGuestLiveShowSetting.INSTANCE.isV1()) {
            ResumeResp resumeResp = createChannelResult2.resumeResp;
            if (resumeResp != null && (bizResumeResponse = resumeResp.multiGuestRespExtra) != null && (responseData = bizResumeResponse.data) != null && responseData.isShowing && responseData.showContent != null) {
                U35 LIZ2 = TQA.LIZ();
                if (LIZ2 != null) {
                    LIZ2.LIZJ(responseData.showContent);
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("resume callback liveShowService: ");
                LIZ3.append(LIZ2);
                C0NB.LIZIZ("live_show_resume", X1D.LIZIZ(LIZ3));
            }
        } else if (createChannelResult2 == null) {
            return;
        }
        BizCreateChannelResponse bizCreateChannelResponse = createChannelResult2.multiGuestRespExtra;
        if (bizCreateChannelResponse != null && (bizCreateChannelResponseData = bizCreateChannelResponse.responseData) != null) {
            String str2 = bizCreateChannelResponseData.backgroundStickerId;
            if (o.LJ(CardStruct.IStatusCode.DEFAULT, str2) || str2 == null || TextUtils.isEmpty(str2) || o.LJ(CardStruct.IStatusCode.DEFAULT, str2)) {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                this.LJLILLLLZI.dataChannel.qv0(AnchorResumeSharedBgEvent.class, str2);
            }
        }
    }

    public C75020TcO(C75492Tk0 c75492Tk0, EnumC74990Tbu enumC74990Tbu) {
        this.LJLILLLLZI = c75492Tk0;
        this.LJLIL = enumC74990Tbu;
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError linkCoreError, Throwable th) {
        InterfaceC74834TYo interfaceC74834TYo;
        this.LJLILLLLZI.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("createChannel failed-->");
        LIZ.append(linkCoreError);
        C74987Tbr.LIZ("LinkControlPresenter", X1D.LIZIZ(LIZ));
        C75492Tk0 c75492Tk0 = this.LJLILLLLZI;
        c75492Tk0.getClass();
        if (th != null) {
            c75492Tk0.logThrowable(th);
        }
        if ((th instanceof C29401Dk) && ((C276516r) th).getErrorCode() == 31011) {
            C75492Tk0 c75492Tk02 = this.LJLILLLLZI;
            if (c75492Tk02.mView == 0) {
                return;
            }
            DataChannel dataChannel = c75492Tk02.dataChannel;
            if (dataChannel != null) {
                interfaceC74834TYo = (InterfaceC74834TYo) dataChannel.kv0(C74969TbZ.class);
            } else {
                interfaceC74834TYo = null;
            }
            C0NQ.LIZ(((InterfaceC31336CRo) c75492Tk02.mView).getContext(), (LifecycleOwner) c75492Tk02.mView, 2, interfaceC74834TYo, new AObjectS45S0101000_13(0, c75492Tk02, 2));
            return;
        }
        InterfaceC75495Tk3 interfaceC75495Tk3 = (InterfaceC75495Tk3) this.LJLILLLLZI.mView;
        if (interfaceC75495Tk3 != null) {
            interfaceC75495Tk3.Ew(this.LJLIL, th);
        }
    }
}
