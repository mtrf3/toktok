package com.ss.ugc.live.sdk.message.interfaces;

import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.List;

/* loaded from: classes6.dex */
public interface IFrequencyInterceptor {
    List<IMessage> onFrequencyMessage(List<? extends IMessage> list, List<IMessage> list2);
}
