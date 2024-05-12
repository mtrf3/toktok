package com.ss.ttlivestreamer.core.capture.audio;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public class AudioFocusChangedCallBackInfo {
    public List<RecordCallbackInfo> RecordItemLists = new ArrayList();

    public List<RecordCallbackInfo> getRecordItemLists() {
        return this.RecordItemLists;
    }

    /* loaded from: classes12.dex */
    public static class RecordCallbackInfo {
        public int audioSessionId;
        public int audioSource;
        public int clientAudioSource;
        public int isBySelf;
        public int isClientSilenced;

        public RecordCallbackInfo(int i, int i2, int i3, int i4, int i5) {
            this.audioSessionId = i;
            this.clientAudioSource = i2;
            this.audioSource = i3;
            this.isClientSilenced = i4;
            this.isBySelf = i5;
        }
    }
}
