package com.ss.android.ugc.aweme.services.audio;

import X.C221108m2;
import X.C5H3;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.vesdk.VEAudioCapture;
import com.ss.android.vesdk.VERecorder;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public interface IAudioGlitchService {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes8.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final C5H3<IAudioGlitchService> INSTANCE$delegate = C221108m2.LIZIZ(IAudioGlitchService$Companion$INSTANCE$2.INSTANCE);

        public final IAudioGlitchService getINSTANCE() {
            IAudioGlitchService value = INSTANCE$delegate.getValue();
            o.LJIIIIZZ(value, "<get-INSTANCE>(...)");
            return value;
        }
    }

    void enablePlayGlitchInShootScene(VERecorder vERecorder, boolean z);

    void enableRecordGlitchInShootScene(VEAudioCapture vEAudioCapture, boolean z);

    void getPlayGlitchAndReportInShootScene(CreativeModel creativeModel, VERecorder vERecorder, boolean z, String str);

    void getRecordGlitchAndReportInShootScene(VEAudioCapture vEAudioCapture);

    void startDevicesChangedListener();

    void stopDevicesChangedListener();
}
