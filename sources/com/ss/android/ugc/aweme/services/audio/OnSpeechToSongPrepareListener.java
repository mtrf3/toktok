package com.ss.android.ugc.aweme.services.audio;

/* loaded from: classes3.dex */
public interface OnSpeechToSongPrepareListener {
    void onFailed(String str, StsError stsError, boolean z);

    void onPreparing(String str, int i, boolean z);

    void onStart(String str, boolean z);

    void onSuccess(String str, StsResponseModel stsResponseModel, boolean z);

    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void onStart$default(OnSpeechToSongPrepareListener onSpeechToSongPrepareListener, String str, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = true;
                }
                onSpeechToSongPrepareListener.onStart(str, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onStart");
        }

        public static /* synthetic */ void onFailed$default(OnSpeechToSongPrepareListener onSpeechToSongPrepareListener, String str, StsError stsError, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    z = true;
                }
                onSpeechToSongPrepareListener.onFailed(str, stsError, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onFailed");
        }

        public static /* synthetic */ void onPreparing$default(OnSpeechToSongPrepareListener onSpeechToSongPrepareListener, String str, int i, boolean z, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 4) != 0) {
                    z = true;
                }
                onSpeechToSongPrepareListener.onPreparing(str, i, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onPreparing");
        }

        public static /* synthetic */ void onSuccess$default(OnSpeechToSongPrepareListener onSpeechToSongPrepareListener, String str, StsResponseModel stsResponseModel, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    z = true;
                }
                onSpeechToSongPrepareListener.onSuccess(str, stsResponseModel, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSuccess");
        }
    }
}
