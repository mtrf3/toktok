package com.bytedance.android.message;

import X.AbstractC30130Bs6;
import X.B45;
import X.C76800UCe;
import X.CR6;
import X.EnumC32070CiI;
import X.InterfaceC06390Mx;
import X.InterfaceC30146BsM;
import X.InterfaceC31452CWa;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.model.message.RemindMessage;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.EventListener;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;

/* loaded from: classes6.dex */
public interface IMessageService extends InterfaceC06390Mx {
    void addOnMessageParsedListener(InterfaceC31452CWa interfaceC31452CWa);

    InterfaceC30146BsM configInteractionMessageHelper(BaseFragment baseFragment, DataChannel dataChannel, AbstractC30130Bs6 abstractC30130Bs6, View view, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super RemindMessage, C76800UCe> interfaceC88472Yns2, InterfaceC65784Pro<Boolean> interfaceC65784Pro);

    <T> T create(Class<T> cls);

    IMessageManager get(long j);

    IMessageManager get(Context context, long j, long j2);

    Class<? extends CR6> getMessageClass(String str);

    B45 getMessageTimeTracker();

    IMessageManager getReuse();

    void initZstdCompressResourceWhenLivePlay();

    void initZstdCompressResourceWhenSDKStart();

    IMessageManager messageManagerProvider(long j, boolean z, Context context);

    IMessageManager messageManagerProvider(long j, boolean z, Context context, boolean z2);

    IMessageManager messageManagerProvider(long j, boolean z, Context context, boolean z2, boolean z3, EnumC32070CiI enumC32070CiI);

    @Override // X.InterfaceC06390Mx
    /* bridge */ /* synthetic */ void onInit();

    EventListener provideEventListener();

    void release(long j);

    void releaseAll();

    void removeOnMessageParsedListener(InterfaceC31452CWa interfaceC31452CWa);

    void retryReleaseAll();

    void updateRoomInfo(long j, Context context);

    void updateRoomInfo(IMessageManager iMessageManager, long j, Context context);
}
