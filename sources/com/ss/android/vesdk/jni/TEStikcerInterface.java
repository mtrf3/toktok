package com.ss.android.vesdk.jni;

import X.C87302YOc;
import X.P4Q;
import X.X1D;
import X.YOZ;
import com.ss.android.ttve.nativePort.NativeCallbacks;
import com.ss.android.vesdk.VEException;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.filterparam.VEStickerPinAreaParam;
import java.nio.ByteBuffer;

/* loaded from: classes16.dex */
public class TEStikcerInterface {
    public long LIZ;

    private native int nativeAddInfoSticker(long j, String str, String[] strArr);

    private native int nativeAddInfoStickerWithBuffer(long j);

    private native int nativeAddSubTrack(long j, String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, double d, double d2, double d3, double d4, int i, int i2);

    private native int nativeBegin2DBrush(long j);

    private native int nativeBeginInfoStickerPin(long j, int i);

    private native int nativeCancelInfoStickerPin(long j, int i);

    private native int nativeControlInfoStickerAnimationPreview(long j, boolean z, int i, int i2);

    private native int nativeDeleteSubTrack(long j, int i);

    private native int nativeEnd2DBrush(long j, String str);

    private native int nativeGet2DBrushStrokeCount(long j);

    private native float[] nativeGetInfoStickerBoundingBox(long j, int i);

    private native float[] nativeGetInfoStickerBoundingBoxWithoutRotate(long j, int i);

    private native int nativeGetInfoStickerFlip(long j, int i, boolean[] zArr);

    private native boolean nativeGetInfoStickerIsDynamic(long j, int i);

    private native int nativeGetInfoStickerPinData(long j, int i, ByteBuffer[] byteBufferArr);

    private native int nativeGetInfoStickerPinState(long j, int i);

    private native int nativeGetInfoStickerPosition(long j, int i, float[] fArr);

    private native float nativeGetInfoStickerRotate(long j, int i);

    private native float nativeGetInfoStickerScale(long j, int i);

    private native String nativeGetInfoStickerTemplateParam(long j, int i);

    private native String nativeGetInfoStickerTemplateParamWithPath(long j, String str);

    private native boolean nativeGetInfoStickerVisible(long j, int i);

    private native int nativeGetSrtInfoStickerInitPosition(long j, int i, float[] fArr);

    private native int nativeGetSubTrackFilter(long j, int i);

    private native int nativeGetTextContentCallback(long j, NativeCallbacks.OnARTextContentCallback onARTextContentCallback);

    private native int nativeGetTextLimitCount(long j);

    private native boolean nativeIsInfoStickerAnimatable(long j, int i);

    private native int nativeNotifyHideKeyBoard(long j, boolean z);

    private native int nativePauseEffectAudio(long j, boolean z);

    private native int nativePauseInfoStickerAnimation(long j, boolean z);

    private native int nativeRemoveInfoSticker(long j, int i);

    private native int nativeRemoveInfoStickerWithBuffer(long j, int i);

    private native int nativeRestoreInfoStickerPinWithJson(long j, int i, ByteBuffer byteBuffer, int i2);

    private native int nativeSet2DBrushCanvasColor(long j, float f);

    private native int nativeSet2DBrushColor(long j, float f, float f2, float f3, float f4);

    private native int nativeSet2DBrushSize(long j, float f);

    private native int nativeSetEffectBgmEnable(long j, boolean z);

    private native int nativeSetEffectFontPath(long j, String str, int i);

    private native int nativeSetEffectInputText(long j, String str, int i, int i2, String str2);

    private native int nativeSetInfoStickerAnimationParam(long j, int i, boolean z, String str, int i2, String str2, int i3, String str3, int i4, int i5, int i6);

    private native int nativeSetInfoStickerAnimationPreview(long j, int i, boolean z);

    private native int nativeSetInfoStickerBufferCallback(long j, VEListener.VEInfoStickerBufferListener vEInfoStickerBufferListener);

    private native int nativeSetInfoStickerCallSync(long j, boolean z);

    private native int nativeSetInfoStickerFlip(long j, int i, boolean z, boolean z2);

    private native int nativeSetInfoStickerRestoreMode(long j, int i);

    private native float nativeSetInfoStickerScale(long j, int i, float f);

    private native int nativeSetLanguage(long j, String str);

    private native int nativeSetStickerPinArea(long j, int i, VEStickerPinAreaParam vEStickerPinAreaParam);

    private native int nativeSetTextBitmapCallback(long j, NativeCallbacks.OnARTextBitmapCallback onARTextBitmapCallback);

    private native int nativeStopInfoStickerPin(long j, int i);

    private native int nativeUndo2DBrush(long j);

    private native int nativeUpdateTextSticker(long j, int i, String str);

    public final int LIZIZ() {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeAddInfoStickerWithBuffer(j);
    }

    public final int LIZLLL() {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeBegin2DBrush(j);
    }

    public final int LJIIJ() {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeGet2DBrushStrokeCount(j);
    }

    public final int LJJI() {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        nativeGetTextContentCallback(j, new YOZ());
        return 0;
    }

    public final int LJJIFFI() {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeGetTextLimitCount(j);
    }

    public final int LJJJJIZL() {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        nativeSetTextBitmapCallback(j, new C87302YOc());
        return 0;
    }

    public final int LJJJJJL() {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeUndo2DBrush(j);
    }

    public TEStikcerInterface(long j) {
        this.LIZ = j;
        P4Q.LJFF("TEMVInterface", "enable public pin adaptor:trueenable info sticker code refactor:true");
    }

    public final int LJ(int i) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        int nativeBeginInfoStickerPin = nativeBeginInfoStickerPin(j, i);
        if (nativeBeginInfoStickerPin != 0) {
            return -1;
        }
        return nativeBeginInfoStickerPin;
    }

    public final int LJFF(int i) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        int nativeCancelInfoStickerPin = nativeCancelInfoStickerPin(j, i);
        if (nativeCancelInfoStickerPin != 0) {
            return -1;
        }
        return nativeCancelInfoStickerPin;
    }

    public final int LJII(int i) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        if (i < 0) {
            return -100;
        }
        return nativeDeleteSubTrack(j, i);
    }

    public final int LJIIIZ(String str) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeEnd2DBrush(j, str);
    }

    public final boolean LJIILIIL(int i) {
        long j = this.LIZ;
        if (j == 0) {
            return false;
        }
        return nativeGetInfoStickerIsDynamic(j, i);
    }

    public final int LJIILL(int i) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeGetInfoStickerPinState(j, i);
    }

    public final float LJIIZILJ(int i) {
        long j = this.LIZ;
        if (j == 0) {
            return -112.0f;
        }
        return nativeGetInfoStickerRotate(j, i);
    }

    public final float LJIJ(int i) {
        long j = this.LIZ;
        if (j == 0) {
            return -112.0f;
        }
        float nativeGetInfoStickerScale = nativeGetInfoStickerScale(j, i);
        if (nativeGetInfoStickerScale < 0.0f) {
            return -1.0f;
        }
        return nativeGetInfoStickerScale;
    }

    public final String LJIJI(int i) {
        long j = this.LIZ;
        if (j == 0) {
            return "";
        }
        return nativeGetInfoStickerTemplateParam(j, i);
    }

    public final String LJIJJ(String str) {
        long j = this.LIZ;
        if (j == 0) {
            P4Q.LIZJ("TEMVInterface", "[getInfoStickerTemplateParam] mNative wrong value");
            return "";
        }
        return nativeGetInfoStickerTemplateParamWithPath(j, str);
    }

    public final boolean LJIJJLI(int i) {
        long j = this.LIZ;
        if (j == 0) {
            return true;
        }
        return nativeGetInfoStickerVisible(j, i);
    }

    public final int LJJ(int i) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        if (i < 0) {
            return -100;
        }
        return nativeGetSubTrackFilter(j, i);
    }

    public final boolean LJJII(int i) {
        long j = this.LIZ;
        if (j == 0) {
            return false;
        }
        return nativeIsInfoStickerAnimatable(j, i);
    }

    public final int LJJIII(boolean z) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeNotifyHideKeyBoard(j, z);
    }

    public final int LJJIIJ(boolean z) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativePauseEffectAudio(j, z);
    }

    public final int LJJIIJZLJL(boolean z) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativePauseInfoStickerAnimation(j, z);
    }

    public final int LJJIIZ(int i) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeRemoveInfoSticker(j, i);
    }

    public final int LJJIJ(float f) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeSet2DBrushCanvasColor(j, f);
    }

    public final int LJJIJIIJIL(float f) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeSet2DBrushSize(j, f);
    }

    public final int LJJIJIL(boolean z) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeSetEffectBgmEnable(j, z);
    }

    public final int LJJIL(VEListener.VEInfoStickerBufferListener vEInfoStickerBufferListener) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeSetInfoStickerBufferCallback(j, vEInfoStickerBufferListener);
    }

    public final int LJJIZ(boolean z) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeSetInfoStickerCallSync(j, z);
    }

    public final int LJJJ(int i) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        int nativeSetInfoStickerRestoreMode = nativeSetInfoStickerRestoreMode(j, i);
        if (nativeSetInfoStickerRestoreMode != 0) {
            return -1;
        }
        return nativeSetInfoStickerRestoreMode;
    }

    public final int LJJJIL(String str) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeSetLanguage(j, str);
    }

    public final int LJJJJJ(int i) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        int nativeStopInfoStickerPin = nativeStopInfoStickerPin(j, i);
        if (nativeStopInfoStickerPin != 0) {
            return -1;
        }
        return nativeStopInfoStickerPin;
    }

    public final int LIZ(String str, String[] strArr) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeAddInfoSticker(j, str, strArr);
    }

    public final int LJIIIIZZ(int i, boolean z) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeSetInfoStickerAnimationPreview(j, i, z);
    }

    public final float[] LJIIJJI(int i, boolean z) {
        float[] nativeGetInfoStickerBoundingBoxWithoutRotate;
        long j = this.LIZ;
        if (j != 0) {
            if (z) {
                nativeGetInfoStickerBoundingBoxWithoutRotate = nativeGetInfoStickerBoundingBox(j, i);
            } else {
                nativeGetInfoStickerBoundingBoxWithoutRotate = nativeGetInfoStickerBoundingBoxWithoutRotate(j, i);
            }
            if (nativeGetInfoStickerBoundingBoxWithoutRotate[0] == 0.0f) {
                float[] fArr = new float[4];
                System.arraycopy(nativeGetInfoStickerBoundingBoxWithoutRotate, 1, fArr, 0, 4);
                return fArr;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("native getInfoStickerBoundingBox failed: ");
            LIZ.append(nativeGetInfoStickerBoundingBoxWithoutRotate[0]);
            LIZ.append(" index: ");
            LIZ.append(i);
            throw new VEException(-1, X1D.LIZIZ(LIZ));
        }
        throw new VEException(-112, "");
    }

    public final int LJIIL(int i, boolean[] zArr) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        int nativeGetInfoStickerFlip = nativeGetInfoStickerFlip(j, i, zArr);
        if (nativeGetInfoStickerFlip != 0) {
            return -1;
        }
        return nativeGetInfoStickerFlip;
    }

    public final int LJIILJJIL(int i, ByteBuffer[] byteBufferArr) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeGetInfoStickerPinData(j, i, byteBufferArr);
    }

    public final int LJIILLIIL(int i, float[] fArr) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        int nativeGetInfoStickerPosition = nativeGetInfoStickerPosition(j, i, fArr);
        if (nativeGetInfoStickerPosition != 0) {
            return -1;
        }
        return nativeGetInfoStickerPosition;
    }

    public final int LJIL(int i, float[] fArr) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        int nativeGetSrtInfoStickerInitPosition = nativeGetSrtInfoStickerInitPosition(j, i, fArr);
        if (nativeGetSrtInfoStickerInitPosition != 0) {
            return -1;
        }
        return nativeGetSrtInfoStickerInitPosition;
    }

    public final int LJJIIZI(int i, ByteBuffer byteBuffer) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        int nativeRestoreInfoStickerPinWithJson = nativeRestoreInfoStickerPinWithJson(j, i, byteBuffer, byteBuffer.capacity());
        if (nativeRestoreInfoStickerPinWithJson != 0) {
            return -1;
        }
        return nativeRestoreInfoStickerPinWithJson;
    }

    public final int LJJIJL(int i, String str) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeSetEffectFontPath(j, str, i);
    }

    public final float LJJJI(float f, int i) {
        long j = this.LIZ;
        if (j == 0) {
            return -112.0f;
        }
        return nativeSetInfoStickerScale(j, i, f);
    }

    public final int LJJJJI(int i, VEStickerPinAreaParam vEStickerPinAreaParam) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        int nativeSetStickerPinArea = nativeSetStickerPinArea(j, i, vEStickerPinAreaParam);
        if (nativeSetStickerPinArea != 0) {
            return -1;
        }
        return nativeSetStickerPinArea;
    }

    public final int LJJJJL(int i, String str) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        int nativeUpdateTextSticker = nativeUpdateTextSticker(j, i, str);
        if (nativeUpdateTextSticker != 0) {
            return -1;
        }
        return nativeUpdateTextSticker;
    }

    public final int LJI(boolean z, int i, int i2) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeControlInfoStickerAnimationPreview(j, z, i, i2);
    }

    public final int LJJIJIIJI(float f, float f2, float f3, float f4) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeSet2DBrushColor(j, f, f2, f3, f4);
    }

    public final int LJJIJLIJ(int i, int i2, String str, String str2) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeSetEffectInputText(j, str, i, i2, str2);
    }

    public final int LIZJ(String[] strArr, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, double d, double d2, double d3, double d4) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeAddSubTrack(j, strArr, null, iArr, iArr2, iArr3, iArr4, d, d2, d3, d4, 0, 0);
    }

    public final int LJJJJ(int i, boolean z, String str, int i2, String str2, int i3, String str3, int i4, int i5, int i6) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeSetInfoStickerAnimationParam(j, i, z, str, i2, str2, i3, str3, i4, i5, i6);
    }
}
