package com.ss.bytertc.engine;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;

/* loaded from: classes33.dex */
public class PublisherParameters {
    public String extraInfo;
    public String mosaicStream;
    public boolean owner;
    public int width = 360;
    public int height = LiveBroadcastUploadVideoImageHeightSetting.DEFAULT;
    public int lifecycle = 1;
    public int defaultLayout = 1;
    public int framerate = 15;
    public int kBitrate = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
    public int audiosamplerate = 44100;
    public int audioKBitrate = 96;
    public int audiochannels = 1;
}
