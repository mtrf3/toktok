package X;

import com.ss.bduploader.BDImageXInfo;
import com.ss.bduploader.BDImageXUploaderListener;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S65 implements BDImageXUploaderListener {
    public final /* synthetic */ InterfaceC88472Yns<C35517Dwn, C76800UCe> LIZ;
    public final /* synthetic */ InterfaceC88472Yns<Throwable, C76800UCe> LIZIZ;

    @Override // com.ss.bduploader.BDImageXUploaderListener
    public final int imageXUploadCheckNetState(int i, int i2) {
        return 1;
    }

    @Override // com.ss.bduploader.BDImageXUploaderListener
    public final void onLog(int i, int i2, String str) {
    }

    public S65(AqS178S0100000_12 aqS178S0100000_12, AqS178S0100000_12 aqS178S0100000_122) {
        this.LIZ = aqS178S0100000_12;
        this.LIZIZ = aqS178S0100000_122;
    }

    @Override // com.ss.bduploader.BDImageXUploaderListener
    public final void onNotify(int i, long j, BDImageXInfo bDImageXInfo) {
        Long l;
        try {
            if (i != 2) {
                if (i != 3) {
                    if (i != 6) {
                        if (i != 7) {
                            return;
                        }
                    } else {
                        if (bDImageXInfo != null) {
                            InterfaceC88472Yns<C35517Dwn, C76800UCe> interfaceC88472Yns = this.LIZ;
                            String str = bDImageXInfo.mImageTosKey;
                            o.LJIIIIZZ(str, "info.mImageTosKey");
                            interfaceC88472Yns.invoke(new C35517Dwn(str));
                            return;
                        }
                        this.LIZIZ.invoke(new Throwable("upload response tos key is null"));
                        return;
                    }
                } else {
                    this.LIZIZ.invoke(new Throwable("upload canceled"));
                    return;
                }
            }
            InterfaceC88472Yns<Throwable, C76800UCe> interfaceC88472Yns2 = this.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("upload failed, error: ");
            if (bDImageXInfo == null) {
                l = null;
            } else {
                l = Long.valueOf(bDImageXInfo.mErrorCode);
            }
            LIZ.append(l);
            interfaceC88472Yns2.invoke(new Throwable(X1D.LIZIZ(LIZ)));
        } catch (Throwable th) {
            InterfaceC88472Yns<Throwable, C76800UCe> interfaceC88472Yns3 = this.LIZIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            interfaceC88472Yns3.invoke(new Throwable(C03090Af.LIZJ(LIZ2, "upload failed: ", th, LIZ2)));
        }
    }
}
