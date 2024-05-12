package com.bytedance.android.livesdk;

import X.AbstractC30130Bs6;
import X.B45;
import X.B83;
import X.C29374Bfu;
import X.C32068CiG;
import X.C32075CiN;
import X.C32076CiO;
import X.C32078CiQ;
import X.C35987EAl;
import X.C38995FSd;
import X.C65045Pft;
import X.C65814PsI;
import X.C76800UCe;
import X.C77904Uho;
import X.C87245YLx;
import X.C95A;
import X.CCX;
import X.CR6;
import X.EnumC31508CYe;
import X.EnumC31509CYf;
import X.EnumC32070CiI;
import X.InterfaceC30146BsM;
import X.InterfaceC31452CWa;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.RunnableC32074CiM;
import X.YRJ;
import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageWsReuseSetting;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageZstdLoadSetting;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageZstdSetting;
import com.bytedance.android.livesdk.model.message.RemindMessage;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.message.IMessageService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.EventListener;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class MessageService implements IMessageService {
    public final CopyOnWriteArrayList<InterfaceC31452CWa> LJLIL = new CopyOnWriteArrayList<>();

    @Override // com.bytedance.android.message.IMessageService, X.InterfaceC06390Mx
    public final /* bridge */ /* synthetic */ void onInit() {
        C32076CiO.LIZ(this);
    }

    @Override // com.bytedance.android.message.IMessageService
    public final IMessageManager getReuse() {
        if (!C32068CiG.LJFF || C32068CiG.LIZJ(C32068CiG.LIZIZ)) {
            return null;
        }
        return C32068CiG.LIZIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0091  */
    @Override // com.bytedance.android.message.IMessageService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void initZstdCompressResourceWhenLivePlay() {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.MessageService.initZstdCompressResourceWhenLivePlay():void");
    }

    @Override // com.bytedance.android.message.IMessageService
    public final void initZstdCompressResourceWhenSDKStart() {
        if (LiveMessageZstdSetting.INSTANCE.enable() && LiveMessageZstdLoadSetting.INSTANCE.isZstdLoadWhenSDKStart()) {
            synchronized (C87245YLx.LIZ) {
                if (!C87245YLx.LJ) {
                    C87245YLx.LJ = true;
                    C38995FSd.LIZIZ().submit(RunnableC32074CiM.LJLIL);
                }
            }
        }
    }

    @Override // com.bytedance.android.message.IMessageService
    public final EventListener provideEventListener() {
        return new C32078CiQ();
    }

    @Override // com.bytedance.android.message.IMessageService
    public final void retryReleaseAll() {
        if (C32068CiG.LIZIZ == null || C32068CiG.LIZ != 0) {
            return;
        }
        C32068CiG.LIZIZ();
    }

    @Override // com.bytedance.android.message.IMessageService
    public final B45 getMessageTimeTracker() {
        return C95A.LIZ;
    }

    @Override // com.bytedance.android.message.IMessageService
    public final void releaseAll() {
        C32068CiG.LIZIZ();
    }

    @Override // com.bytedance.android.message.IMessageService
    public final void addOnMessageParsedListener(InterfaceC31452CWa l) {
        o.LJIIIZ(l, "l");
        if (!this.LJLIL.contains(l)) {
            this.LJLIL.add(l);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.message.IMessageService
    public final <T> T create(Class<T> cls) {
        C65045Pft LIZ = C65045Pft.LIZ();
        LIZ.getClass();
        C65814PsI.LIZ().getClass();
        return (T) LIZ.LIZIZ(cls, C65814PsI.LIZJ(cls));
    }

    @Override // com.bytedance.android.message.IMessageService
    public final IMessageManager get(long j) {
        if (j == C32068CiG.LIZ) {
            return C32068CiG.LIZIZ;
        }
        return null;
    }

    @Override // com.bytedance.android.message.IMessageService
    public final Class<? extends CR6> getMessageClass(String str) {
        return EnumC31508CYe.getMessageClass(str);
    }

    @Override // com.bytedance.android.message.IMessageService
    public final void release(long j) {
        if (j == C32068CiG.LIZ && j != 0) {
            IMessageManager iMessageManager = C32068CiG.LIZIZ;
            if (iMessageManager != null) {
                iMessageManager.releaseMessage();
            }
            C32068CiG.LIZ = 0L;
        }
    }

    @Override // com.bytedance.android.message.IMessageService
    public final void removeOnMessageParsedListener(InterfaceC31452CWa l) {
        o.LJIIIZ(l, "l");
        this.LJLIL.remove(l);
    }

    @Override // com.bytedance.android.message.IMessageService
    public final void updateRoomInfo(long j, Context context) {
        IMessageManager iMessageManager;
        C35987EAl c35987EAl;
        YRJ yrj;
        IMessageWsClient iMessageWsClient;
        if (C32068CiG.LIZ == j || (iMessageManager = C32068CiG.LIZIZ) == null) {
            return;
        }
        C32068CiG.LIZ = j;
        iMessageManager.resetRoomInfo(j, C32068CiG.LIZJ);
        C32075CiN c32075CiN = C32068CiG.LIZJ;
        if (c32075CiN != null && (c35987EAl = c32075CiN.LIZIZ) != null && (yrj = c35987EAl.LIZJ) != null && (iMessageWsClient = yrj.LJLIL) != null) {
            iMessageWsClient.setData(j, context);
        }
        if (C32068CiG.LJ != null) {
            IMessageManager iMessageManager2 = C32068CiG.LIZIZ;
            if (iMessageManager2 != null) {
                iMessageManager2.removeMessageListener(EnumC31509CYf.MSG_DETECT_MESSAGE.getIntType(), C32068CiG.LJ);
            }
            IMessageManager iMessageManager3 = C32068CiG.LIZIZ;
            if (iMessageManager3 != null) {
                iMessageManager3.addAsyncMessageListener(EnumC31509CYf.MSG_DETECT_MESSAGE.getIntType(), C32068CiG.LJ);
            }
        }
        C32068CiG.LIZ(j, C32068CiG.LIZIZ);
    }

    @Override // com.bytedance.android.message.IMessageService
    public final IMessageManager get(Context context, long j, long j2) {
        return C32068CiG.LIZLLL(context, j, false, j2, false, true, EnumC32070CiI.LIVE_ROOM);
    }

    @Override // com.bytedance.android.message.IMessageService
    public final IMessageManager messageManagerProvider(long j, boolean z, Context context) {
        if (z) {
            return messageManagerProvider(j, z, context, LiveMessageWsReuseSetting.webSocketReuse, true, EnumC32070CiI.LIVE_ROOM);
        }
        return messageManagerProvider(j, false, context, false, true, EnumC32070CiI.LIVE_ROOM);
    }

    @Override // com.bytedance.android.message.IMessageService
    public final void updateRoomInfo(IMessageManager iMessageManager, long j, Context context) {
        IMessageWsClient iMessageWsClient;
        C35987EAl c35987EAl;
        YRJ yrj;
        IMessageWsClient iMessageWsClient2;
        Long valueOf;
        if (iMessageManager != null) {
            C32075CiN messageConfiguration = iMessageManager.getMessageConfiguration();
            if (messageConfiguration != null && (c35987EAl = messageConfiguration.LIZIZ) != null && (yrj = c35987EAl.LIZJ) != null && (iMessageWsClient2 = yrj.LJLIL) != null && (((valueOf = Long.valueOf(iMessageWsClient2.getRoomId())) != null && valueOf.longValue() == j) || iMessageManager == null)) {
                return;
            }
            iMessageManager.resetRoomInfo(j, iMessageManager.getMessageConfiguration());
            YRJ yrj2 = iMessageManager.getMessageConfiguration().LIZIZ.LIZJ;
            if (yrj2 != null && (iMessageWsClient = yrj2.LJLIL) != null) {
                iMessageWsClient.setData(j, context);
            }
            iMessageManager.addAsyncMessageListener(EnumC31509CYf.MSG_DETECT_MESSAGE.getIntType(), new C77904Uho(C32068CiG.LIZLLL));
            C32068CiG.LIZ(j, iMessageManager);
        }
    }

    @Override // com.bytedance.android.message.IMessageService
    public final IMessageManager messageManagerProvider(long j, boolean z, Context context, boolean z2) {
        return messageManagerProvider(j, z, context, z2, true, EnumC32070CiI.LIVE_ROOM);
    }

    @Override // com.bytedance.android.message.IMessageService
    public final IMessageManager messageManagerProvider(long j, boolean z, Context context, boolean z2, boolean z3, EnumC32070CiI messageScene) {
        o.LJIIIZ(messageScene, "messageScene");
        return C32068CiG.LIZLLL(context, j, z, ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId(), z2, z3, messageScene);
    }

    @Override // com.bytedance.android.message.IMessageService
    public final InterfaceC30146BsM configInteractionMessageHelper(BaseFragment fragment, DataChannel dataChannel, AbstractC30130Bs6 abstractC30130Bs6, View mLivePauseToast, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super RemindMessage, C76800UCe> interfaceC88472Yns2, InterfaceC65784Pro<Boolean> isStreamPaused) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(mLivePauseToast, "mLivePauseToast");
        o.LJIIIZ(isStreamPaused, "isStreamPaused");
        return new CCX(fragment, dataChannel, abstractC30130Bs6, mLivePauseToast, interfaceC88472Yns, interfaceC88472Yns2, isStreamPaused);
    }
}
