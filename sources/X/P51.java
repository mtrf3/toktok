package X;

import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.vesdk.VEBingoInvoker;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes12.dex */
public final class P51 implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int[] LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ int LJLJL;
    public final /* synthetic */ InterfaceC133855Nd LJLJLJ;
    public final /* synthetic */ int LJLJLLL;
    public final /* synthetic */ long LJLL;
    public final /* synthetic */ int[] LJLLI;
    public final /* synthetic */ VEBingoInvoker LJLLILLLL;

    public final void LIZ() {
        int i;
        boolean z;
        int i2;
        MediaFormat mediaFormat = null;
        P53 p53 = new P53(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, new P56(this, new long[]{System.currentTimeMillis()}, new ByteBuffer[]{null}, new float[]{0.0f}));
        try {
            P4Q.LJFF(p53.LIZIZ, "method start begin");
            if (p53.LIZLLL.length <= 0) {
                String str = p53.LIZIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("ptsMs.length is wrong: ");
                LIZ.append(p53.LIZLLL.length);
                P4Q.LJFF(str, X1D.LIZIZ(LIZ));
                return;
            }
            P53.LJ();
            System.currentTimeMillis();
            MediaExtractor mediaExtractor = new MediaExtractor();
            mediaExtractor.setDataSource(p53.LIZJ);
            int i3 = p53.LJ;
            int i4 = p53.LJFF;
            for (int i5 = 0; i5 < mediaExtractor.getTrackCount(); i5++) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i5);
                if (trackFormat.getString("mime").startsWith("video")) {
                    p53.LJIILJJIL = trackFormat.getInteger("width");
                    p53.LJIILL = trackFormat.getInteger("height");
                    int integer = trackFormat.getInteger("rotation-degrees");
                    p53.LJIILIIL = integer;
                    if (integer != 0) {
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((p53.LJ * p53.LJFF) * 3) / 2);
                        allocateDirect.clear();
                        p53.LJIIJJI = VEFrame.createByteBufferFrame(allocateDirect, p53.LJ, p53.LJFF, 0, 0L, P6Z.TEPixFmt_YUV420P);
                        int i6 = p53.LJIILIIL;
                        if (i6 == 90 || i6 == 270) {
                            i3 = p53.LJFF;
                            i4 = p53.LJ;
                        }
                    }
                    mediaExtractor.selectTrack(i5);
                    mediaFormat = trackFormat;
                }
            }
            if (p53.LJIIIZ == null) {
                ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(((i3 * i4) * 3) / 2);
                allocateDirect2.clear();
                i = 2;
                p53.LJIIIZ = VEFrame.createByteBufferFrame(allocateDirect2, i3, i4, p53.LJIILIIL, 0L, P6Z.TEPixFmt_YUV420P);
            } else {
                i = 2;
            }
            p53.LJIIL = MediaCodec.createDecoderByType("video/avc");
            ArrayList arrayList = new ArrayList();
            mediaExtractor.seekTo(p53.LIZLLL[0], i);
            ArrayList arrayList2 = new ArrayList();
            int i7 = p53.LJI;
            while (true) {
                long sampleTime = mediaExtractor.getSampleTime();
                if (sampleTime < 0 && mediaExtractor.advance()) {
                    p53.LJIJJLI = true;
                    break;
                }
                arrayList2.add(Long.valueOf(sampleTime));
                if (mediaExtractor.getSampleFlags() == 1) {
                    z = true;
                    arrayList.add(Long.valueOf(sampleTime));
                } else {
                    z = false;
                }
                int[] iArr = p53.LIZLLL;
                if (sampleTime > iArr[iArr.length - 1] && z) {
                    i7--;
                }
                if (!mediaExtractor.advance() || i7 <= 0) {
                    break;
                }
            }
            if (p53.LJIJJLI) {
                P4Q.LJFF(p53.LIZIZ, "start wrong");
                p53.LIZJ();
                return;
            }
            Collections.sort(arrayList2);
            int length = p53.LIZLLL.length;
            List[] listArr = new List[length];
            int size = arrayList2.size();
            int i8 = 0;
            int i9 = 0;
            while (i8 < size && i9 < p53.LIZLLL.length) {
                if (((Long) ListProtector.get(arrayList2, i8)).longValue() < p53.LIZLLL[i9]) {
                    i8++;
                } else {
                    if (listArr[i9] == null) {
                        listArr[i9] = new ArrayList();
                    }
                    for (int i10 = 0; i10 < p53.LJI; i10++) {
                        int i11 = i8 + i10;
                        if (i11 < size) {
                            listArr[i9].add(ListProtector.get(arrayList2, i11));
                        }
                    }
                    i8++;
                    i9++;
                }
            }
            int[] iArr2 = p53.LIZLLL;
            if (listArr[iArr2.length - 1] != null && listArr[iArr2.length - 1].size() == 1) {
                int[] iArr3 = p53.LIZLLL;
                listArr[iArr3.length - 1].add(ListProtector.get(listArr[iArr3.length - 1], 0));
                ListProtector.set(listArr[p53.LIZLLL.length - 1], 0, ListProtector.get(arrayList2, arrayList2.size() - 2));
            }
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                String str2 = p53.LIZIZ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("pts value:");
                LIZ2.append(ListProtector.get(arrayList2, i12));
                P4Q.LJFF(str2, X1D.LIZIZ(LIZ2));
            }
            for (int i13 = 0; i13 < length; i13++) {
                List list = listArr[i13];
                for (int i14 = 0; i14 < list.size(); i14++) {
                    String str3 = p53.LIZIZ;
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("sensArray i: ");
                    LIZ3.append(i14);
                    LIZ3.append(" value: ");
                    LIZ3.append(ListProtector.get(list, i14).toString());
                    P4Q.LJFF(str3, X1D.LIZIZ(LIZ3));
                }
            }
            mediaExtractor.seekTo(p53.LIZLLL[0], 0);
            p53.LJIILLIIL = new HandlerThread("MediaCodec Callback");
            String str4 = p53.LIZIZ;
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("getVideoFramesHW: mCodecHandlerThread = ");
            LIZ4.append(p53.LJIILLIIL.getThreadId());
            LIZ4.append(", curr-threadId = ");
            LIZ4.append(p53.LIZ);
            P4Q.LJFF(str4, X1D.LIZIZ(LIZ4));
            p53.LJIILLIIL.start();
            p53.LJIIL.setCallback(new P55(p53, mediaExtractor, listArr, arrayList), new Handler(p53.LJIILLIIL.getLooper()));
            p53.LJIIZILJ = new HandlerThread("ImageReader Callback");
            String str5 = p53.LIZIZ;
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("getVideoFramesHW: mReaderHandlerThread = ");
            LIZ5.append(p53.LJIIZILJ.getThreadId());
            LIZ5.append(", curr-threadId = ");
            LIZ5.append(p53.LIZ);
            P4Q.LJFF(str5, X1D.LIZIZ(LIZ5));
            p53.LJIIZILJ.start();
            Handler handler = new Handler(p53.LJIIZILJ.getLooper());
            ImageReader newInstance = ImageReader.newInstance(p53.LJIILJJIL, p53.LJIILL, 35, 2);
            p53.LJIJ = newInstance;
            newInstance.setOnImageAvailableListener(new C63873P4z(p53, listArr), handler);
            mediaFormat.setInteger("color-format", 2135033992);
            String str6 = P53.LJJ;
            java.util.Map<String, Integer> map = C47697Inl.LIZ;
            if (((HashMap) map).containsKey(str6)) {
                i2 = ((Integer) ((HashMap) map).get(str6)).intValue();
            } else {
                i2 = 0;
            }
            int i15 = (((i2 * 1080) * 1920) / p53.LJIILJJIL) / p53.LJIILL;
            if (i15 > 0) {
                mediaFormat.setInteger("operating-rate", i15);
            }
            p53.LJIIL.configure(mediaFormat, p53.LJIJ.getSurface(), (MediaCrypto) null, 0);
            p53.LJIIL.start();
        } catch (Exception unused) {
            P4Q.LJFF(p53.LIZIZ, "start crash");
            p53.LIZJ();
            p53.LIZLLL();
        } catch (OutOfMemoryError unused2) {
            P4Q.LJFF(p53.LIZIZ, "start crash oom");
            Runtime.getRuntime().gc();
            p53.LIZJ();
            p53.LIZLLL();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public P51(VEBingoInvoker vEBingoInvoker, String str, int[] iArr, int i, int i2, int i3, int i4, int i5, InterfaceC133855Nd interfaceC133855Nd, int i6, long j, int[] iArr2) {
        this.LJLLILLLL = vEBingoInvoker;
        this.LJLIL = str;
        this.LJLILLLLZI = iArr;
        this.LJLJI = i;
        this.LJLJJI = i2;
        this.LJLJJL = i3;
        this.LJLJJLL = i4;
        this.LJLJL = i5;
        this.LJLJLJ = interfaceC133855Nd;
        this.LJLJLLL = i6;
        this.LJLL = j;
        this.LJLLI = iArr2;
    }
}
