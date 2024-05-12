package com.ss.ttlivestreamer.core.codec;

import X.X1D;
import com.ss.ttlivestreamer.core.engine.AudioEncoder;
import com.ss.ttlivestreamer.core.engine.AudioEncoderFactory;
import com.ss.ttlivestreamer.core.utils.AVLog;
import defpackage.a1;

/* loaded from: classes12.dex */
public class DefaultAudioEncoderFactory extends AudioEncoderFactory {
    public static final String TAG = DefaultAudioEncoderFactory.class.getName();

    private native AudioEncoder nativeDefaultCreateAudioEncoder(String str, boolean z);

    private native String nativeDefaultGetSupportedFormats();

    @Override // com.ss.ttlivestreamer.core.engine.AudioEncoderFactory
    public String GetSupportedFormats() {
        String GetSupportedFormats = AACHWAudioEncoder.GetSupportedFormats();
        String nativeDefaultGetSupportedFormats = nativeDefaultGetSupportedFormats();
        if (nativeDefaultGetSupportedFormats != null && !nativeDefaultGetSupportedFormats.isEmpty()) {
            return a1.LJ(GetSupportedFormats, ":", nativeDefaultGetSupportedFormats);
        }
        return GetSupportedFormats;
    }

    @Override // com.ss.ttlivestreamer.core.engine.AudioEncoderFactory
    public AudioEncoder CreateAudioEncoder(String str, boolean z) {
        String str2;
        String[] split = str.split(":");
        int length = split.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            String str3 = split[i];
            if (str3.contains("audio_type")) {
                String[] split2 = str3.split("=");
                if (split2.length > 1) {
                    str2 = split2[1];
                }
            } else {
                i++;
            }
        }
        str2 = "";
        if (str2.equalsIgnoreCase("audio/mp4a-latm")) {
            AACHWAudioEncoder aACHWAudioEncoder = new AACHWAudioEncoder();
            if (aACHWAudioEncoder.setupCodecName()) {
                return aACHWAudioEncoder;
            }
            String str4 = TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str2);
            LIZ.append(" is not supported on this device.");
            AVLog.ioe(str4, X1D.LIZIZ(LIZ));
            aACHWAudioEncoder.release();
        }
        return nativeDefaultCreateAudioEncoder(str, z);
    }
}
