package com.benchmark.network;

import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;

/* loaded from: classes.dex */
public class ByteBenchResponse {
    public long mResponseLength;
    public int mHttpCode = LiveChatShowDelayForHotLiveSetting.DEFAULT;
    public String mData = "";
    public int mErrorCode = -1;
    public String mMessage = "";
}
