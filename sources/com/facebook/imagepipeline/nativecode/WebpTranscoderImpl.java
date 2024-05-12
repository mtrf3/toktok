package com.facebook.imagepipeline.nativecode;

import X.C81796W8i;
import X.C81828W9o;
import X.C81860WAu;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes15.dex */
public class WebpTranscoderImpl {
    public static native void nativeTranscodeWebpToJpeg(InputStream inputStream, OutputStream outputStream, int i);

    public static native void nativeTranscodeWebpToPng(InputStream inputStream, OutputStream outputStream);

    public boolean isWebpNativelySupported(C81828W9o c81828W9o) {
        if (c81828W9o == C81796W8i.LJFF || c81828W9o == C81796W8i.LJI || c81828W9o == C81796W8i.LJII || c81828W9o == C81796W8i.LJIIIIZZ) {
            return true;
        }
        if (c81828W9o == C81796W8i.LJIIIZ) {
            return false;
        }
        throw new IllegalArgumentException("Image format is not a WebP.");
    }

    public void transcodeWebpToPng(InputStream inputStream, OutputStream outputStream) {
        C81860WAu.LIZ();
        inputStream.getClass();
        outputStream.getClass();
        nativeTranscodeWebpToPng(inputStream, outputStream);
    }

    public void transcodeWebpToJpeg(InputStream inputStream, OutputStream outputStream, int i) {
        C81860WAu.LIZ();
        inputStream.getClass();
        outputStream.getClass();
        nativeTranscodeWebpToJpeg(inputStream, outputStream, i);
    }
}
