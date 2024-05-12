package com.byted.cast.sdk.gl.grafika;

import X.V0N;
import java.nio.ByteBuffer;

/* loaded from: classes29.dex */
public class GeneratedTexture {
    public static final int[] GRID = {-16776961, -16711681, -16711936, -65281, -1, 1073742079, 1073807104, -16711681, -65281, 65280, -2147483393, -16777216, -256, -65281, -256, -65536};
    public static final ByteBuffer sCoarseImageData = generateCoarseData();
    public static final ByteBuffer sFineImageData = generateFineData();

    /* renamed from: com.byted.cast.sdk.gl.grafika.GeneratedTexture$1, reason: invalid class name */
    /* loaded from: classes29.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$byted$cast$sdk$gl$grafika$GeneratedTexture$Image;

        static {
            int[] iArr = new int[Image.values().length];
            $SwitchMap$com$byted$cast$sdk$gl$grafika$GeneratedTexture$Image = iArr;
            try {
                iArr[Image.COARSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$byted$cast$sdk$gl$grafika$GeneratedTexture$Image[Image.FINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static ByteBuffer generateCoarseData() {
        byte[] bArr = new byte[16384];
        int i = 0;
        do {
            int i2 = i / 4;
            int i3 = GRID[(((i2 / 64) / 16) * 4) + ((i2 % 64) / 16)];
            if (i == 0 || i == 16380) {
                i3 = -1;
            }
            int i4 = i3 & 255;
            int i5 = (i3 >> 8) & 255;
            int i6 = (i3 >> 16) & 255;
            int i7 = (i3 >> 24) & 255;
            float f = i7 / 255.0f;
            bArr[i] = (byte) (i4 * f);
            bArr[i + 1] = (byte) (i5 * f);
            bArr[i + 2] = (byte) (i6 * f);
            bArr[i + 3] = (byte) i7;
            i += 4;
        } while (i < 16384);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(16384);
        allocateDirect.put(bArr);
        allocateDirect.position(0);
        return allocateDirect;
    }

    public static ByteBuffer generateFineData() {
        byte[] bArr = new byte[16384];
        checkerPattern(bArr, 0, 0, 32, 32, -16776961, -65536, 1);
        checkerPattern(bArr, 32, 32, 64, 64, -16776961, -16711936, 2);
        checkerPattern(bArr, 0, 32, 32, 64, -65536, -16711936, 4);
        checkerPattern(bArr, 32, 0, 64, 32, -1, -16777216, 8);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(16384);
        allocateDirect.put(bArr);
        allocateDirect.position(0);
        return allocateDirect;
    }

    /* loaded from: classes29.dex */
    public enum Image {
        COARSE,
        FINE;

        public static Image valueOf(String str) {
            return (Image) V0N.LJJJ(Image.class, str);
        }
    }

    public static int createTestTexture(Image image) {
        ByteBuffer byteBuffer;
        int i = AnonymousClass1.$SwitchMap$com$byted$cast$sdk$gl$grafika$GeneratedTexture$Image[image.ordinal()];
        if (i != 1) {
            if (i == 2) {
                byteBuffer = sFineImageData;
            } else {
                throw new RuntimeException("unknown image");
            }
        } else {
            byteBuffer = sCoarseImageData;
        }
        return GlUtil.createImageTexture(byteBuffer, 64, 64, 6408);
    }

    public static void checkerPattern(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        while (i2 < i4) {
            int i9 = i2 * 64 * 4;
            for (int i10 = i; i10 < i3; i10++) {
                int i11 = (i10 * 4) + i9;
                if (((i2 & i7) ^ (i10 & i7)) == 0) {
                    i8 = i5;
                } else {
                    i8 = i6;
                }
                int i12 = i8 & 255;
                int i13 = (i8 >> 8) & 255;
                int i14 = (i8 >> 16) & 255;
                int i15 = (i8 >> 24) & 255;
                float f = i15 / 255.0f;
                bArr[i11] = (byte) (i12 * f);
                bArr[i11 + 1] = (byte) (i13 * f);
                bArr[i11 + 2] = (byte) (i14 * f);
                bArr[i11 + 3] = (byte) i15;
            }
            i2++;
        }
    }
}
