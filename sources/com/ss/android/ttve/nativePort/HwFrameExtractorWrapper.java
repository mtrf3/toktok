package com.ss.android.ttve.nativePort;

import X.C16880lQ;
import X.C47697Inl;
import X.P4Q;
import X.P50;
import X.P52;
import X.P54;
import X.P57;
import X.P58;
import X.P59;
import X.P6Z;
import X.X1D;
import Y.ARunnableS47S0100000_11;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ttve.model.VEFrame;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public class HwFrameExtractorWrapper {
    public static final String TAG = C16880lQ.LJLLJ(HwFrameExtractorWrapper.class);
    public P52 mExtractor;
    public P57 mExtractorRange;
    public long mNativeAddr;

    public native boolean nativeOnFrameAvailable(long j, ByteBuffer byteBuffer, int i, int i2, int i3);

    public void stop() {
        P52 p52 = this.mExtractor;
        if (p52 != null) {
            p52.LJIL = true;
            if (p52.LJIIZILJ != null) {
                try {
                    new Handler(p52.LJIIZILJ.getLooper()).post(new ARunnableS47S0100000_11(p52, 42));
                    synchronized (p52.LJIILJJIL) {
                        if (!p52.LJIJJLI) {
                            p52.LJIILJJIL.wait();
                        }
                    }
                    p52.LJIIZILJ.quitSafely();
                } catch (InterruptedException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            this.mExtractor = null;
        }
        P57 p57 = this.mExtractorRange;
        if (p57 != null) {
            p57.getClass();
            this.mExtractorRange = null;
        }
    }

    public HwFrameExtractorWrapper(long j) {
        this.mNativeAddr = j;
    }

    public static HwFrameExtractorWrapper create(long j) {
        return new HwFrameExtractorWrapper(j);
    }

    public void startExtractFrame(String str, int[] iArr, int i, int i2, int i3, int i4) {
        boolean z;
        int i5;
        P52 p52 = new P52(str, iArr, i, i2, i3, i4, new P58(this, this.mNativeAddr));
        this.mExtractor = p52;
        try {
            P4Q.LJFF(p52.LIZIZ, "method start begin");
            if (p52.LIZLLL.length <= 0) {
                String str2 = p52.LIZIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("ptsMs.length is wrong: ");
                LIZ.append(p52.LIZLLL.length);
                P4Q.LJFF(str2, X1D.LIZIZ(LIZ));
                return;
            }
            p52.LJIL = false;
            P52.LJ();
            System.currentTimeMillis();
            MediaExtractor mediaExtractor = new MediaExtractor();
            MediaFormat mediaFormat = null;
            if (p52.LIZJ.startsWith("content:")) {
                String str3 = p52.LIZIZ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("strMediaFile is content uri, ");
                LIZ2.append(p52.LIZJ);
                P4Q.LJFF(str3, X1D.LIZIZ(LIZ2));
                if (TEContentProviderUtils.getApplicationContext() != null) {
                    mediaExtractor.setDataSource(TEContentProviderUtils.getApplicationContext(), UriProtector.parse(p52.LIZJ), (Map<String, String>) null);
                } else {
                    P4Q.LJII(p52.LIZIZ, "get application failed.");
                    mediaExtractor.setDataSource(p52.LIZJ);
                }
            } else {
                mediaExtractor.setDataSource(p52.LIZJ);
            }
            int i6 = p52.LJ;
            int i7 = p52.LJFF;
            for (int i8 = 0; i8 < mediaExtractor.getTrackCount(); i8++) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i8);
                String string = trackFormat.getString("mime");
                if (string.startsWith("video")) {
                    p52.LJJI = string.equals("video/avc");
                    p52.LJJIFFI = string.equals("video/hevc");
                    p52.LJIILL = trackFormat.getInteger("width");
                    p52.LJIILLIIL = trackFormat.getInteger("height");
                    if (trackFormat.containsKey("rotation-degrees")) {
                        p52.LJIILIIL = trackFormat.getInteger("rotation-degrees");
                    }
                    if (p52.LJIILIIL != 0) {
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((p52.LJ * p52.LJFF) * 3) / 2);
                        allocateDirect.clear();
                        p52.LJIIJJI = VEFrame.createByteBufferFrame(allocateDirect, p52.LJ, p52.LJFF, 0, 0L, P6Z.TEPixFmt_YUV420P);
                        int i9 = p52.LJIILIIL;
                        if (i9 == 90 || i9 == 270) {
                            i6 = p52.LJFF;
                            i7 = p52.LJ;
                        }
                    }
                    mediaExtractor.selectTrack(i8);
                    mediaFormat = trackFormat;
                }
            }
            if (p52.LJIIIZ == null) {
                ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(((i6 * i7) * 3) / 2);
                allocateDirect2.clear();
                p52.LJIIIZ = VEFrame.createByteBufferFrame(allocateDirect2, i6, i7, p52.LJIILIIL, 0L, P6Z.TEPixFmt_YUV420P);
            }
            p52.LJIIL = MediaCodec.createDecoderByType("video/avc");
            ArrayList arrayList = new ArrayList();
            mediaExtractor.seekTo(p52.LIZLLL[0], 2);
            ArrayList arrayList2 = new ArrayList();
            int i10 = p52.LJI;
            while (true) {
                long sampleTime = mediaExtractor.getSampleTime();
                if (sampleTime < 0 && mediaExtractor.advance()) {
                    p52.LJJ = true;
                    break;
                }
                arrayList2.add(Long.valueOf(sampleTime));
                if (mediaExtractor.getSampleFlags() == 1) {
                    z = true;
                    arrayList.add(Long.valueOf(sampleTime));
                } else {
                    z = false;
                }
                int[] iArr2 = p52.LIZLLL;
                if (sampleTime > iArr2[iArr2.length - 1] && z) {
                    i10--;
                }
                if (!mediaExtractor.advance() || i10 <= 0) {
                    break;
                }
            }
            if (p52.LJJ) {
                P4Q.LJFF(p52.LIZIZ, "start wrong");
                p52.LIZJ();
                return;
            }
            Collections.sort(arrayList2);
            ArrayList arrayList3 = new ArrayList();
            int length = p52.LIZLLL.length;
            List[] listArr = new List[length];
            int size = arrayList2.size();
            int i11 = 0;
            int i12 = 0;
            while (i11 < size && i12 < p52.LIZLLL.length) {
                if (((Long) ListProtector.get(arrayList2, i11)).longValue() < p52.LIZLLL[i12]) {
                    i11++;
                } else {
                    if (listArr[i12] == null) {
                        listArr[i12] = new ArrayList();
                    }
                    for (int i13 = 0; i13 < p52.LJI; i13++) {
                        int i14 = i11 + i13;
                        if (i14 < size) {
                            Long l = (Long) ListProtector.get(arrayList2, i14);
                            listArr[i12].add(l);
                            arrayList3.add(l);
                        }
                    }
                    i11++;
                    i12++;
                }
            }
            int[] iArr3 = p52.LIZLLL;
            if (listArr[iArr3.length - 1] != null && listArr[iArr3.length - 1].size() == 1) {
                int[] iArr4 = p52.LIZLLL;
                listArr[iArr4.length - 1].add(ListProtector.get(listArr[iArr4.length - 1], 0));
                ListProtector.set(listArr[p52.LIZLLL.length - 1], 0, ListProtector.get(arrayList2, arrayList2.size() - 2));
                arrayList3.add((Long) ListProtector.get(arrayList3, arrayList3.size() - 1));
            }
            for (int i15 = 0; i15 < length; i15++) {
                List list = listArr[i15];
                for (int i16 = 0; i16 < list.size(); i16++) {
                    String str4 = p52.LIZIZ;
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("sensArray i: ");
                    LIZ3.append(i16);
                    LIZ3.append(" value: ");
                    LIZ3.append(ListProtector.get(list, i16).toString());
                    P4Q.LJFF(str4, X1D.LIZIZ(LIZ3));
                }
            }
            mediaExtractor.seekTo(p52.LIZLLL[0], 0);
            p52.LJIIZILJ = new HandlerThread("MediaCodec Callback");
            String str5 = p52.LIZIZ;
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("getVideoFramesHW: mCodecHandlerThread = ");
            LIZ4.append(p52.LJIIZILJ.getThreadId());
            LIZ4.append(", curr-threadId = ");
            LIZ4.append(p52.LIZ);
            P4Q.LJFF(str5, X1D.LIZIZ(LIZ4));
            p52.LJIIZILJ.start();
            p52.LJIIL.setCallback(new P54(p52, mediaExtractor, arrayList3, listArr, arrayList), new Handler(p52.LJIIZILJ.getLooper()));
            p52.LJIJ = new HandlerThread("ImageReader Callback");
            String str6 = p52.LIZIZ;
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("getVideoFramesHW: mReaderHandlerThread = ");
            LIZ5.append(p52.LJIJ.getThreadId());
            LIZ5.append(", curr-threadId = ");
            LIZ5.append(p52.LIZ);
            P4Q.LJFF(str6, X1D.LIZIZ(LIZ5));
            p52.LJIJ.start();
            Handler handler = new Handler(p52.LJIJ.getLooper());
            ImageReader newInstance = ImageReader.newInstance(p52.LJIILL, p52.LJIILLIIL, 35, 2);
            p52.LJIJI = newInstance;
            newInstance.setOnImageAvailableListener(new P50(p52, listArr), handler);
            mediaFormat.setInteger("color-format", 2135033992);
            String str7 = P52.LJJIII;
            Map<String, Integer> map = C47697Inl.LIZ;
            if (((HashMap) map).containsKey(str7)) {
                i5 = ((Integer) ((HashMap) map).get(str7)).intValue();
            } else {
                i5 = 0;
            }
            int i17 = (((i5 * 1080) * 1920) / p52.LJIILL) / p52.LJIILLIIL;
            if (i17 > 0) {
                String str8 = p52.LIZIZ;
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("extract frame targetFps:");
                LIZ6.append(i17);
                P4Q.LJFF(str8, X1D.LIZIZ(LIZ6));
                mediaFormat.setInteger("operating-rate", i17);
            }
            p52.LJIIL.configure(mediaFormat, p52.LJIJI.getSurface(), (MediaCrypto) null, 0);
            p52.LJIIL.start();
        } catch (Exception unused) {
            P4Q.LJFF(p52.LIZIZ, "start crash");
            p52.LIZJ();
            p52.LIZLLL();
        } catch (OutOfMemoryError unused2) {
            P4Q.LJFF(p52.LIZIZ, "start crash oom");
            Runtime.getRuntime().gc();
            p52.LIZJ();
            p52.LIZLLL();
        }
    }

    public void startExtractFrameForRangeTime(String str, int i, int i2, int i3, int i4, int i5) {
        this.mExtractorRange = new P57(i, i3, i4, i5, new P59(this, this.mNativeAddr));
    }
}
