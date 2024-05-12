package com.mammon.audiosdk;

import X.C16880lQ;
import com.mammon.audiosdk.enums.SAMICoreVopProcessRecordAudioResult;
import com.mammon.audiosdk.enums.SAMICoreVopSpeakerInfoCommand;
import com.mammon.audiosdk.enums.SAMICoreVopState;
import com.mammon.audiosdk.enums.SAMICoreVopTextState;
import com.mammon.audiosdk.structures.SAMICoreVopInitContext;
import com.mammon.audiosdk.structures.SAMICoreVopRecordingStatus;
import com.mammon.audiosdk.structures.SAMICoreVopSpeakerInfo;
import com.mammon.audiosdk.structures.SAMICoreVopTextInfo;

/* loaded from: classes16.dex */
public final class SAMICoreVopEngine {
    public volatile long engine = native_createEngine();

    private native long native_createEngine();

    private native void native_destroyEngine(long j);

    private native float native_getCurrentPositionMs(long j);

    private native int native_getCurrentState(long j, int[] iArr);

    private native int native_getNextTextInfo(long j, Object[] objArr, int[] iArr);

    private native int native_getRecordingStatus(long j, SAMICoreVopRecordingStatus sAMICoreVopRecordingStatus);

    private native int native_getSpeakerInfo(long j, SAMICoreVopSpeakerInfo sAMICoreVopSpeakerInfo);

    private native float native_getTotalDurationMs(long j);

    private native int native_init(long j, SAMICoreVopInitContext sAMICoreVopInitContext);

    private native int native_manageSpeakerInfo(long j, SAMICoreVopSpeakerInfoCommand sAMICoreVopSpeakerInfoCommand);

    private native int native_play(long j);

    private native int native_preparePlayer(long j);

    private native int native_processRecordAudio(long j, byte[] bArr, int i, int[] iArr);

    private native int native_stop(long j);

    static {
        C16880lQ.LLJJJIL("audioeffect");
    }

    public void destroyEngine() {
        native_destroyEngine(this.engine);
    }

    public float getCurrentPositionMs() {
        return native_getCurrentPositionMs(this.engine);
    }

    public float getTotalDurationMs() {
        return native_getTotalDurationMs(this.engine);
    }

    public int play() {
        return native_play(this.engine);
    }

    public int preparePlayer() {
        return native_preparePlayer(this.engine);
    }

    public int stop() {
        return native_stop(this.engine);
    }

    public int getCurrentState(SAMICoreVopState[] sAMICoreVopStateArr) {
        int[] iArr = new int[1];
        int native_getCurrentState = native_getCurrentState(this.engine, iArr);
        sAMICoreVopStateArr[0] = SAMICoreVopState.values()[iArr[0]];
        return native_getCurrentState;
    }

    public int getNextTextInfo(SAMICoreVopTextInfo sAMICoreVopTextInfo) {
        String[] strArr = new String[1];
        int[] iArr = new int[1];
        int native_getNextTextInfo = native_getNextTextInfo(this.engine, strArr, iArr);
        sAMICoreVopTextInfo.textJson = strArr[0];
        sAMICoreVopTextInfo.textState = SAMICoreVopTextState.values()[iArr[0]];
        return native_getNextTextInfo;
    }

    public int getRecordingStatus(SAMICoreVopRecordingStatus sAMICoreVopRecordingStatus) {
        return native_getRecordingStatus(this.engine, sAMICoreVopRecordingStatus);
    }

    public int getSpeakerInfo(SAMICoreVopSpeakerInfo sAMICoreVopSpeakerInfo) {
        return native_getSpeakerInfo(this.engine, sAMICoreVopSpeakerInfo);
    }

    public int init(SAMICoreVopInitContext sAMICoreVopInitContext) {
        return native_init(this.engine, sAMICoreVopInitContext);
    }

    public int manageSpeakerInfo(SAMICoreVopSpeakerInfoCommand sAMICoreVopSpeakerInfoCommand) {
        return native_manageSpeakerInfo(this.engine, sAMICoreVopSpeakerInfoCommand);
    }

    public int processRecordAudio(byte[] bArr, int i, SAMICoreVopProcessRecordAudioResult[] sAMICoreVopProcessRecordAudioResultArr) {
        int[] iArr = new int[1];
        int native_processRecordAudio = native_processRecordAudio(this.engine, bArr, i, iArr);
        sAMICoreVopProcessRecordAudioResultArr[0] = SAMICoreVopProcessRecordAudioResult.values()[iArr[0]];
        return native_processRecordAudio;
    }
}
