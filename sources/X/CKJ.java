package X;

import Y.AfS4S0100100_5;
import Y.AfS57S0100000_5;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageIntervalSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageSetting;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CKJ {
    public final int LIZ;
    public C73411SrX LIZIZ;
    public C73411SrX LIZJ;
    public C73411SrX LIZLLL;
    public boolean LJFF;
    public boolean LJI;
    public InterfaceC21020s6 LJII;
    public long LJIIIIZZ;
    public long LJIIJ;
    public final CopyOnWriteArrayList<OSZ<byte[], Long>> LJ = new CopyOnWriteArrayList<>();
    public boolean LJIIIZ = true;

    public final void LIZ() {
        C73411SrX c73411SrX;
        this.LJIIIZ = true;
        C0NB.LIZIZ("CaptureImageUploadController", "pause");
        C73411SrX c73411SrX2 = this.LIZJ;
        if (c73411SrX2 != null && !c73411SrX2.isDisposed() && (c73411SrX = this.LIZJ) != null) {
            c73411SrX.dispose();
        }
    }

    public final synchronized void LJ() {
        if (this.LJI) {
            return;
        }
        if (this.LJ.size() <= 0) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("upload start cache size:");
        LIZ.append(this.LJ.size());
        C0NB.LIZIZ("CaptureImageUploadController", X1D.LIZIZ(LIZ));
        OSZ<byte[], Long> remove = this.LJ.remove(0);
        LJFF(remove.getSecond().longValue(), remove.getFirst());
    }

    public final void LIZIZ() {
        if (!this.LJFF || !this.LJIIIZ) {
            return;
        }
        this.LJIIIZ = false;
        C0NB.LIZIZ("CaptureImageUploadController", "resume");
        this.LIZJ = (C73411SrX) TMC.LJJI(LiveBroadcastUploadVideoImageIntervalSetting.INSTANCE.getValue(), TimeUnit.SECONDS).LJJIFFI(new CKM(this)).LJJJ(T16.LIZ()).LJJJJZI(new CKL(this));
    }

    public final void LIZLLL() {
        long j = this.LJIIJ - 1;
        this.LJIIJ = j;
        if (j > 0) {
            return;
        }
        C73411SrX c73411SrX = this.LIZIZ;
        if (c73411SrX != null && !c73411SrX.isDisposed()) {
            C73411SrX c73411SrX2 = this.LIZIZ;
            if (c73411SrX2 != null) {
                c73411SrX2.dispose();
            }
            this.LIZIZ = null;
        }
        this.LIZIZ = (C73411SrX) AbstractC73672Svk.LJJLIIIJLJLI(1L, TimeUnit.SECONDS).LJJJJZI(new AfS57S0100000_5(this, 53));
    }

    public CKJ(int i) {
        this.LIZ = i;
    }

    public final void LIZJ(InterfaceC21020s6 liveStream, long j) {
        C73411SrX c73411SrX;
        o.LJIIIZ(liveStream, "liveStream");
        this.LJIIJ++;
        if (LiveBroadcastUploadVideoImageSetting.INSTANCE.isDisable()) {
            return;
        }
        C73411SrX c73411SrX2 = this.LIZIZ;
        if (c73411SrX2 != null && !c73411SrX2.isDisposed() && (c73411SrX = this.LIZIZ) != null) {
            c73411SrX.dispose();
        }
        if (this.LJFF) {
            return;
        }
        this.LJFF = true;
        C0NB.LIZIZ("CaptureImageUploadController", "start");
        this.LJII = liveStream;
        this.LJIIIIZZ = j;
        LIZIZ();
    }

    public final void LJFF(long j, byte[] bArr) {
        C73411SrX c73411SrX;
        this.LJI = true;
        C73411SrX c73411SrX2 = this.LIZLLL;
        if (c73411SrX2 != null && !c73411SrX2.isDisposed() && (c73411SrX = this.LIZLLL) != null) {
            c73411SrX.dispose();
        }
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        multipartTypedOutput.addPart("data", new TypedByteArray("application/octet-stream", bArr, String.valueOf(System.currentTimeMillis())));
        this.LIZLLL = (C73411SrX) C28718BOw.LIZ().LIZ().uploadOriginScreen(multipartTypedOutput, Long.valueOf(this.LJIIIIZZ), this.LIZ).LJJL(T16.LIZ()).LJJJ(T16.LIZ()).LJJJLIIL(new AfS4S0100100_5(j, this, 3), new AfS4S0100100_5(j, this, 4));
    }
}
