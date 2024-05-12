package com.ss.android.ugc.gamora.editor.audio.copyrightdetect.longvideo;

import X.C221108m2;
import X.C3VQ;
import X.C62822Ol8;
import X.E4Q;
import X.InterfaceC37276Ek4;

/* loaded from: classes2.dex */
public final class LongAudioCopyrightDetectAPI {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C3VQ.LJLIL);

    /* loaded from: classes2.dex */
    public interface Api {
        @E4Q("/tiktok/v1/infringement/precheck/")
        InterfaceC37276Ek4<CheckInfringementResponse> checkInfringement();
    }
}
