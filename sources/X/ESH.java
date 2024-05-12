package X;

import com.ss.bduploader.BDObjectInfo;
import com.ss.bduploader.BDObjectUploader;
import com.ss.bduploader.BDObjectUploaderListener;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ESH implements BDObjectUploaderListener {
    public final /* synthetic */ BDObjectUploader LIZ;
    public final /* synthetic */ InterfaceC67352kd<String> LIZIZ;

    @Override // com.ss.bduploader.BDObjectUploaderListener
    public final int objectUploadCheckNetState(int i, int i2) {
        return 0;
    }

    @Override // com.ss.bduploader.BDObjectUploaderListener
    public final void onLog(int i, int i2, String info) {
        o.LJIIIZ(info, "info");
    }

    public ESH(BDObjectUploader bDObjectUploader, C84654XKg c84654XKg) {
        this.LIZ = bDObjectUploader;
        this.LIZIZ = c84654XKg;
    }

    @Override // com.ss.bduploader.BDObjectUploaderListener
    public final void onNotify(int i, long j, BDObjectInfo info) {
        o.LJIIIZ(info, "info");
        if (i != 6) {
            if (i != 7) {
                return;
            }
            C15280iq.LJ("DiyProp", "upload zip failed");
            this.LIZ.close();
            InterfaceC67352kd<String> interfaceC67352kd = this.LIZIZ;
            C3C5.m7constructorimpl(null);
            interfaceC67352kd.resumeWith(null);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("upload zip complete, tosKey=");
        LIZ.append(info.mImageTosKey);
        C15280iq.LJ("DiyProp", X1D.LIZIZ(LIZ));
        this.LIZ.close();
        InterfaceC67352kd<String> interfaceC67352kd2 = this.LIZIZ;
        String str = info.mImageTosKey;
        C3C5.m7constructorimpl(str);
        interfaceC67352kd2.resumeWith(str);
    }
}
