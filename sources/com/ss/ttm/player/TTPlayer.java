package com.ss.ttm.player;

import X.C07670Rv;
import X.C16880lQ;
import X.C47951Irr;
import X.C48425IzV;
import X.C78609UtB;
import X.O5Y;
import X.X1D;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.Surface;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes9.dex */
public class TTPlayer {
    public static int LJ;
    public static int[] LJFF;
    public static String LJI;
    public static final String LJII;
    public long LIZ;
    public C48425IzV LIZIZ = null;
    public h LIZJ;
    public final Context LIZLLL;
    public long mMediaDataSource;

    public static final native void _close(long j);

    private final native long _create(Context context, int i, int i2, int i3, String str);

    public static final native String _getAppPath();

    public static final native int _getCurrentPosition(long j);

    public static final native long _getDemuxerFactory(int i);

    public static final native double _getDoubleValue(long j, int i, double d);

    public static final native int _getDuration(long j);

    public static final native float _getFloatValue(long j, int i, float f);

    public static final native int _getIntValue(long j, int i, int i2);

    public static final native Object _getJObjectValue(long j, int i);

    public static final native long _getLongValue(long j, int i, long j2);

    public static final native Object[] _getStreamInfo(long j);

    public static final native String _getStringValue(long j, int i);

    public static final native String _getSubtitleContent(long j, int i);

    public static final native int _getVideoHeight(long j);

    public static final native int _getVideoWidth(long j);

    public static final native int _isLooping(long j);

    public static final native int _isPlaying(long j);

    public static final native void _mouseEvent(long j, int i, int i2, int i3);

    public static final native int _pause(long j);

    public static final native int _prepare(long j);

    public static final native void _prevClose(long j);

    public static final native int _registerNativeMdl(long j);

    public static final native void _registerPlayerInfo();

    public static final native void _release(long j);

    public static final native int _reset(long j);

    public static final native void _rotateCamera(long j, float f, float f2);

    public static final native int _seek(long j, int i);

    public static final native int _seek2(long j, int i, int i2);

    public static final native void _setABRStrategy(long j, ABRStrategy aBRStrategy);

    public static final native void _setAIBarrageInfo(long j, MaskInfo maskInfo);

    public static final native void _setAudioProcessor(long j, AudioProcessor audioProcessor);

    public static final native void _setDataSource(long j, IMediaDataSource iMediaDataSource);

    public static final native void _setDataSource(long j, String str);

    public static final native void _setDataSourceFd(long j, int i);

    public static final native int _setDoubleValue(long j, int i, double d);

    public static final native int _setFloatValue(long j, int i, float f);

    public static final native int _setFloatValueArray(long j, int[] iArr, float[] fArr);

    public static final native void _setGlobalIntForKey(int i, int i2);

    public static final native int _setIntValue(long j, int i, int i2);

    public static final native int _setIntValueArray(long j, int[] iArr, int[] iArr2);

    public static final native void _setLoadControl(long j, LoadControl loadControl);

    public static final native int _setLongValue(long j, int i, long j2);

    public static final native int _setLongValueArray(long j, int[] iArr, long[] jArr);

    public static final native void _setLooping(long j, int i);

    public static final native void _setMaskInfo(long j, MaskInfo maskInfo);

    public static final native void _setMediaTransport(long j, MediaTransport mediaTransport);

    public static final native int _setStringValue(long j, int i, String str);

    public static final native int _setStringValueArray(long j, int[] iArr, String[] strArr);

    public static final native void _setSubInfo(long j, SubInfo subInfo);

    public static final native void _setSupportFormatNB(int i);

    public static final native void _setSupprotSampleRates(int[] iArr, int i);

    public static final native int _setSurfaceValue(long j, long j2);

    public static final native void _setTraitObject(long j, int i, int i2, TraitObject traitObject);

    public static final native int _setVideoSurface(long j, Surface surface);

    public static final native void _setVolume(long j, float f, float f2);

    public static final native int _setupMediaCodec(long j);

    public static final native int _start(long j);

    public static final native void _stop(long j);

    public static final native void _switchStream(long j, int i, int i2);

    public static final native void _takeScreenshot(long j);

    public static final String getCrashPath() {
        return null;
    }

    public String getStrategyParams(String str) {
        return LiveGiftNewGifterBadgeSetting.DEFAULT;
    }

    public final void takeScreenshotComplete(Bitmap bitmap) {
    }

    static {
        LJII = "";
        synchronized (TTPlayer.class) {
            C47951Irr.LIZ();
            LJII = C47951Irr.LJFF;
            try {
                LIZ();
            } catch (UnsatisfiedLinkError e) {
                String str = C47951Irr.LIZLLL;
                if (str != null) {
                    throw new UnsatisfiedLinkError(str);
                }
                throw e;
            }
        }
    }

    public static void LIZ() {
        int i;
        if (LJ == 0) {
            int[] iArr = new int[20];
            LJFF = iArr;
            if (Build.VERSION.SDK_INT >= 23) {
                i = 17;
            } else {
                i = 15;
            }
            int i2 = 0;
            do {
                iArr[i2] = AudioFormats.LIZ[i2];
                i2++;
            } while (i2 < i);
            LJ = i;
            _setSupprotSampleRates(LJFF, i);
        }
    }

    public static int getThreadPoolStackSize() {
        return u.LIZIZ(25, 32);
    }

    public static int getVC2DecPoolSize() {
        return u.LIZIZ(42, 0);
    }

    public static int getVC2StackSizeValue() {
        return u.LIZIZ(40, 0);
    }

    public static int getVC2ThreadPriorityValue() {
        return u.LIZIZ(35, 0);
    }

    public static int isEnableVC2DecPool() {
        return u.LIZLLL(41) ? 1 : 0;
    }

    public static int isEnableVC2ThreadPriority() {
        return u.LIZLLL(34) ? 1 : 0;
    }

    public static int isEnableVC2ThreadPriorityLite() {
        return u.LIZLLL(36) ? 1 : 0;
    }

    public static boolean isIPPlayer() {
        C07670Rv.LIZLLL("mIsIPCPlayer:", false);
        return false;
    }

    public static int isUseThreadV2() {
        return u.LIZIZ(38, 0);
    }

    public static int isUsedThreadPool() {
        return u.LIZLLL(24) ? 1 : 0;
    }

    public static int isVC2StackSizeOpt() {
        return u.LIZLLL(39) ? 1 : 0;
    }

    public final void LJIIIIZZ() {
        long j = this.LIZ;
        if (j == 0) {
            return;
        }
        _pause(j);
    }

    public final void LJIIIZ() {
        long j = this.LIZ;
        if (j == 0) {
            return;
        }
        _prepare(j);
    }

    public final void LJIIJ() {
        long j = this.LIZ;
        if (j == 0) {
            return;
        }
        _setVideoSurface(j, null);
    }

    public final void LJIIJJI() {
        O5Y.LJI("TTPlayerJava", this, C16880lQ.LLLZI(Locale.US, "release TTPlayer:%x", new Object[]{Long.valueOf(this.LIZ)}));
        long j = this.LIZ;
        if (j != 0) {
            _release(j);
            this.LIZ = 0L;
        }
        this.LIZIZ = null;
    }

    public final void LJIIL() {
        long j = this.LIZ;
        if (j == 0) {
            return;
        }
        _reset(j);
    }

    public final void LJJIJIIJIL() {
        _setupMediaCodec(this.LIZ);
    }

    public final void LJJIJIL() {
        long j = this.LIZ;
        if (j == 0) {
            return;
        }
        _start(j);
    }

    public final void LJJIJL() {
        long j = this.LIZ;
        if (j != 0) {
            _stop(j);
        }
    }

    public static long LIZIZ(int i) {
        return _getDemuxerFactory(i);
    }

    public static int registerNativeMdl(long j) {
        return _registerNativeMdl(j);
    }

    public final Object LJFF(int i) {
        return _getJObjectValue(this.LIZ, i);
    }

    public final String LJI(int i) {
        if (i == 1095) {
            return LJII;
        }
        return _getStringValue(this.LIZ, i);
    }

    public final String LJII(int i) {
        return _getSubtitleContent(this.LIZ, i);
    }

    public final void LJIILIIL(int i) {
        _seek(this.LIZ, i);
    }

    public final void LJIILL(ABRStrategy aBRStrategy) {
        long j = this.LIZ;
        if (j != 0) {
            _setABRStrategy(j, aBRStrategy);
        }
    }

    public final void LJIILLIIL(MaskInfo maskInfo) {
        long j = this.LIZ;
        if (j != 0) {
            _setAIBarrageInfo(j, maskInfo);
        }
    }

    public final void LJIIZILJ(AudioProcessor audioProcessor) {
        long j = this.LIZ;
        if (j != 0) {
            _setAudioProcessor(j, audioProcessor);
        }
    }

    public final void LJIJ(IMediaDataSource iMediaDataSource) {
        long j = this.LIZ;
        if (j != 0) {
            _setDataSource(j, iMediaDataSource);
        }
    }

    public final void LJIJI(String str) {
        long j = this.LIZ;
        if (j != 0) {
            _setDataSource(j, str);
        }
    }

    public final void LJIJJ(int i) {
        long j = this.LIZ;
        if (j != 0) {
            _setDataSourceFd(j, i);
        }
    }

    public final void LJJI(LoadControl loadControl) {
        long j = this.LIZ;
        if (j != 0) {
            _setLoadControl(j, loadControl);
        }
    }

    public final void LJJII(int i) {
        _setLooping(this.LIZ, i);
    }

    public final void LJJIII(MaskInfo maskInfo) {
        long j = this.LIZ;
        if (j != 0) {
            _setMaskInfo(j, maskInfo);
        }
    }

    public final void LJJIIJ(long j) {
        _setIntValue(this.LIZ, 16, (int) j);
    }

    public final void LJJIIZ(SubInfo subInfo) {
        long j = this.LIZ;
        if (j != 0) {
            _setSubInfo(j, subInfo);
        }
    }

    public final void LJJIJ(Surface surface) {
        long j = this.LIZ;
        if (j != 0) {
            _setVideoSurface(j, surface);
        }
    }

    public void receiveBinarySei(ByteBuffer byteBuffer) {
        try {
            h hVar = this.LIZJ;
            if (hVar != null) {
                hVar.LJ(byteBuffer);
            }
        } catch (Throwable unused) {
        }
    }

    public static final void LJIL(int i, int i2) {
        _setGlobalIntForKey(i, i2);
    }

    public final float LIZJ(int i, float f) {
        return _getFloatValue(this.LIZ, i, f);
    }

    public final int LIZLLL(int i, int i2) {
        if (i != 11) {
            if (i != 51) {
                switch (i) {
                    case 1:
                        return _getDuration(this.LIZ);
                    case 2:
                        return _getCurrentPosition(this.LIZ);
                    case 3:
                        return _getVideoWidth(this.LIZ);
                    case 4:
                        return _getVideoHeight(this.LIZ);
                    case 5:
                        return _isLooping(this.LIZ);
                    case 6:
                        return _isPlaying(this.LIZ);
                    default:
                        return _getIntValue(this.LIZ, i, i2);
                }
            }
            return 0;
        }
        return _getIntValue(this.LIZ, i, i2);
    }

    public final long LJ(int i, long j) {
        if (i == 50) {
            return this.LIZ;
        }
        return _getLongValue(this.LIZ, i, j);
    }

    public final void LJIILJJIL(int i, int i2) {
        _seek2(this.LIZ, i, i2);
    }

    public final int LJIJJLI(float f, int i) {
        return _setFloatValue(this.LIZ, i, f);
    }

    public final int LJJ(int i, int i2) {
        if (i == 111) {
            int[] iArr = new int[19];
            int i3 = 0;
            int i4 = 0;
            do {
                if (((1 << i3) & i2) == 0) {
                    iArr[i4] = C78609UtB.LJLILLLLZI[i3];
                    i4++;
                }
                i3++;
            } while (i3 < 19);
            _setSupprotSampleRates(iArr, i4);
            return 0;
        }
        return _setIntValue(this.LIZ, i, i2);
    }

    public final int LJJIFFI(int i, long j) {
        return _setLongValue(this.LIZ, i, j);
    }

    public final int LJJIIJZLJL(int i, String str) {
        return _setStringValue(this.LIZ, i, str);
    }

    public final void LJJIIZI(int i, TraitObject traitObject) {
        int i2;
        long j = this.LIZ;
        if (j != 0) {
            if (traitObject != null) {
                i2 = traitObject.LIZ;
            } else {
                i2 = -1;
            }
            _setTraitObject(j, i, i2, traitObject);
        }
    }

    public final void LJJIJIIJI(float f, float f2) {
        _setVolume(this.LIZ, f, f2);
    }

    public final void LJJIJLIJ(int i, int i2) {
        _switchStream(this.LIZ, i, i2);
    }

    public void onAbrDecisionInfo(long j, String str) {
        try {
            h hVar = this.LIZJ;
            if (hVar != null) {
                hVar.LIZJ(j, str);
            }
        } catch (Throwable unused) {
        }
    }

    public void frameDTSNotify(int i, long j, long j2) {
        try {
            h hVar = this.LIZJ;
            if (hVar != null) {
                hVar.LIZLLL(i, j2, j);
            }
        } catch (Throwable unused) {
        }
    }

    public final void onLogInfo(int i, int i2, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("type:");
        LIZ.append(i);
        LIZ.append(" code:");
        LIZ.append(i2);
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        C48425IzV c48425IzV = this.LIZIZ;
        if (c48425IzV != null) {
            try {
                c48425IzV.LJIJJLI(i, i2, str);
            } catch (Throwable unused) {
            }
        }
    }

    public void updateFrameTerminatedDTS(int i, long j, long j2) {
        try {
            h hVar = this.LIZJ;
            if (hVar != null) {
                hVar.LIZ(i, j, j2);
            }
        } catch (Throwable unused) {
        }
    }

    public TTPlayer(int i, int i2, long j, Context context) {
        this.LIZLLL = context;
        long _create = _create(context, 0, i, i2, LJI);
        this.LIZ = _create;
        O5Y.LJI("TTPlayerJava", this, C16880lQ.LLLZI(Locale.US, "create TTPlayer:%x", new Object[]{Long.valueOf(_create)}));
        if (this.LIZ != 0) {
        } else {
            throw new Exception("create native player is fail.");
        }
    }

    public void didReceivePacket(int i, long j, long j2, Map<Integer, String> map) {
        try {
            h hVar = this.LIZJ;
            if (hVar != null) {
                hVar.LIZIZ(i, j, j2, map);
            }
        } catch (Throwable unused) {
        }
    }

    public void onFrameAboutToBeRendered(int i, long j, long j2, Map<Integer, String> map) {
        try {
            h hVar = this.LIZJ;
            if (hVar != null) {
                hVar.onFrameAboutToBeRendered(i, j, j2, map);
            }
        } catch (Throwable unused) {
        }
    }

    public void onNotify(int i, int i2, int i3, String str) {
        try {
            C48425IzV c48425IzV = this.LIZIZ;
            if (c48425IzV != null) {
                c48425IzV.LJIL(i, i2, i3, str);
            }
        } catch (Throwable unused) {
        }
    }
}
