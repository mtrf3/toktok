package com.ss.ttlivestreamer.core.engine;

/* loaded from: classes12.dex */
public abstract class AudioEncoderFactory extends NativeObject {
    public abstract AudioEncoder CreateAudioEncoder(String str, boolean z);

    public abstract String GetSupportedFormats();
}
