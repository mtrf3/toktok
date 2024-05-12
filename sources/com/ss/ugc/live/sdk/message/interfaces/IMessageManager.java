package com.ss.ugc.live.sdk.message.interfaces;

import X.C30176Bsq;
import X.C32075CiN;
import X.C64972Pei;
import X.YMF;
import android.os.Looper;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.data.MessageSEI;
import java.util.Map;

/* loaded from: classes6.dex */
public interface IMessageManager {
    void addAsyncMessageListener(int i, OnMessageListener onMessageListener);

    void addEventListener(EventListener eventListener);

    void addFrequencyInterceptor(IFrequencyInterceptor iFrequencyInterceptor);

    void addInterceptor(IInterceptor iInterceptor);

    void addMessageListener(int i, OnIMMessageListener onIMMessageListener);

    void addMessageListener(int i, OnMessageListener onMessageListener);

    void destroyMessage();

    String getDomain();

    Map<String, String> getFetchHistoryParams();

    C32075CiN getMessageConfiguration();

    Looper getMessageDispatchLooper();

    void insertMessage(IMessage iMessage);

    void insertMessage(IMessage iMessage, boolean z);

    boolean isWsConnected();

    void needMessage();

    void onMessageSEI(MessageSEI messageSEI);

    void refresh(C32075CiN c32075CiN);

    void releaseMessage();

    void removeEventListener(EventListener eventListener);

    void removeFrequencyInterceptor(IFrequencyInterceptor iFrequencyInterceptor);

    void removeInterceptor(IInterceptor iInterceptor);

    void removeMessageListener(int i, OnMessageListener onMessageListener);

    void removeMessageListener(OnIMMessageListener onIMMessageListener);

    void removeMessageListener(OnMessageListener onMessageListener);

    void resetRoomInfo(long j, C32075CiN c32075CiN);

    void sendRequest(long j, C64972Pei c64972Pei, YMF ymf);

    void startMessage();

    void startPrefetchMessage();

    void stopMessage(C30176Bsq c30176Bsq);
}
