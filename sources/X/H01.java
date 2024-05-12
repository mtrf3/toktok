package X;

import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import defpackage.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS170S0200000_7;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H01 implements FUZ {
    public final /* synthetic */ AbstractImageUploader LIZ;
    public final /* synthetic */ H00 LIZIZ;
    public final /* synthetic */ H07 LIZJ;

    public H01(C43859HJf c43859HJf, H00 h00, H07 h07) {
        this.LIZ = c43859HJf;
        this.LIZIZ = h00;
        this.LIZJ = h07;
    }

    @Override // X.FUZ
    public final void LIZ(int i, long j, AbstractImageUploader.ImageUploadInfo imageUploadInfo) {
        this.LIZ.LJ();
        if (i == 6) {
            H00 h00 = this.LIZIZ;
            LIZIZ(imageUploadInfo, h00, this.LIZJ, "ImageComplete", new AqS189S0100000_7(h00, 73));
            return;
        }
        this.LIZ.LJFF();
        if (i == 7) {
            H00 h002 = this.LIZIZ;
            LIZIZ(imageUploadInfo, h002, this.LIZJ, "ImageFailed", new AqS189S0100000_7(h002, 74));
            return;
        }
        this.LIZ.LJII();
        if (i == 3) {
            H00 h003 = this.LIZIZ;
            LIZIZ(imageUploadInfo, h003, this.LIZJ, "ImagePreUploadCancel", new AqS170S0200000_7(h003, this.LIZ, 5));
            return;
        }
        this.LIZ.LJI();
        if (i == 1) {
            H00 h004 = this.LIZIZ;
            LIZIZ(imageUploadInfo, h004, this.LIZJ, "ImageProgress", new H03(h004, j));
            return;
        }
        this.LIZ.LIZLLL();
        if (i != 0) {
            return;
        }
        this.LIZ.LIZJ();
        ((ArrayList) this.LIZIZ.LJIIIIZZ).remove(this.LIZ);
        H00 h005 = this.LIZIZ;
        if (h005.LJIIIZ) {
            if (((ArrayList) h005.LJIIIIZZ).size() != 0) {
                return;
            }
            H00 h006 = this.LIZIZ;
            C43337Gzd c43337Gzd = h006.LJII;
            if (c43337Gzd != null) {
                c43337Gzd.LIZIZ(h006.LJIILJJIL);
                return;
            } else {
                o.LJIJI("callback");
                throw null;
            }
        }
        H07 h07 = this.LIZJ;
        int i2 = h07.LIZ + h07.LIZIZ;
        List<String> list = h005.LJ;
        if (list != null) {
            if (i2 >= list.size()) {
                H00 h007 = this.LIZIZ;
                C43337Gzd c43337Gzd2 = h007.LJII;
                if (c43337Gzd2 != null) {
                    c43337Gzd2.LIZIZ(h007.LJIILJJIL);
                    return;
                } else {
                    o.LJIJI("callback");
                    throw null;
                }
            }
            H00 h008 = this.LIZIZ;
            H07 h072 = this.LIZJ;
            h008.LJIIIZ(h008.LJFF(h072.LIZ + h072.LIZIZ));
            return;
        }
        o.LJIJI("imagePaths");
        throw null;
    }

    @Override // X.FUZ
    public final void onLog(int i, int i2, String str) {
        C36922EeM.LIZLLL(3, "ImageUploader", str);
    }

    public static final void LIZIZ(AbstractImageUploader.ImageUploadInfo imageUploadInfo, H00 h00, H07 h07, String str, InterfaceC88471Ynr<? super Integer, ? super AbstractImageUploader.ImageUploadInfo, C76800UCe> interfaceC88471Ynr) {
        if (imageUploadInfo == null) {
            StringBuilder LIZJ = b1.LIZJ(str, " and Null info ");
            LIZJ.append(h00.LJI);
            String LIZIZ = X1D.LIZIZ(LIZJ);
            C78983UzD.LJIILL(LIZIZ);
            Iterator it = ((ArrayList) h00.LJIIIIZZ).iterator();
            while (it.hasNext()) {
                ((AbstractImageUploader) it.next()).LIZJ();
            }
            if (!h00.LJIILIIL) {
                h00.LJIILIIL = true;
                h00.LJII(imageUploadInfo, LIZIZ);
                return;
            }
            return;
        }
        interfaceC88471Ynr.invoke(Integer.valueOf(imageUploadInfo.getMFileIndex() + h07.LIZ), imageUploadInfo);
    }
}
