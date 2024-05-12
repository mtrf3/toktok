package X;

import Y.AfS54S0200000_5;
import Y.AfS57S0100000_5;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.mime.TypedString;
import com.ss.ttlivestreamer.livestreamv2.ILiveStream;
import java.io.File;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.ByX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30529ByX implements ILiveStream.CatchVideoCallback {
    public final InterfaceC21020s6 LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final C62822Ol8 LJ;
    public final C62822Ol8 LJFF;
    public final C62822Ol8 LJI;

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.CatchMediaDataCallback
    public final /* synthetic */ void onCompleteOnce(String str, long j, long j2, int i, int i2, int i3) {
        C30533Byb.LIZ(this, str, j, j2, i, i2, i3);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.CatchMediaDataCallback
    public final void onComplete() {
        C0NB.LIZIZ("CaptureVideoUploadController", "onComplete");
        LIZ(new File((String) this.LJ.getValue()), "1", new AqS155S0100000_5(this, 172));
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.CatchMediaDataCallback
    public final void onError(int i, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("error code:");
        LIZ.append(i);
        LIZ.append(" error msg:");
        LIZ.append(str);
        C0NB.LJ("CaptureVideoUploadController", X1D.LIZIZ(LIZ));
    }

    public final void LIZ(File file, String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (file.exists() && file.isFile()) {
            MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
            multipartTypedOutput.addPart("video_type", new TypedString(str));
            multipartTypedOutput.addPart("file_type", new TypedString("4"));
            multipartTypedOutput.addPart("pixel_x", new TypedString(String.valueOf(this.LIZIZ)));
            multipartTypedOutput.addPart("pixel_y", new TypedString(String.valueOf(this.LIZJ)));
            multipartTypedOutput.addPart("data_size", new TypedString(String.valueOf(file.length())));
            multipartTypedOutput.addPart("data", new TypedFile("multipart/form-data", file));
            ((C73318Sq2) this.LJI.getValue()).LIZ(C1EW.LIZ(C28718BOw.LIZ().LIZ().updateCaptureVideo(multipartTypedOutput)).LJJJLIIL(new AfS54S0200000_5(interfaceC65784Pro, file, 9), new AfS57S0100000_5(file, 54)));
        }
    }

    public C30529ByX(InterfaceC21020s6 liveStream, int i, int i2, boolean z) {
        o.LJIIIZ(liveStream, "liveStream");
        this.LIZ = liveStream;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = z;
        this.LJ = C221108m2.LIZIZ(C30531ByZ.LJLIL);
        this.LJFF = C221108m2.LIZIZ(C30530ByY.LJLIL);
        this.LJI = C221108m2.LIZIZ(C30532Bya.LJLIL);
    }
}
