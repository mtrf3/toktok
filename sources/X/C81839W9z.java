package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.W9z, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81839W9z implements IHD<C81392Vwy<W5A>> {
    public final /* synthetic */ InterfaceC73573Su9<C76800UCe> LIZ;
    public final /* synthetic */ C43772HFw LIZIZ;
    public final /* synthetic */ String LIZJ;

    @Override // X.IHD
    public final void LIZIZ(AbstractC48384Iyq abstractC48384Iyq) {
    }

    @Override // X.IHD
    public final void LIZ(W4W<C81392Vwy<W5A>> w4w) {
        H78.LIZJ("fetchDecodedImage Error");
        this.LIZ.onComplete();
    }

    @Override // X.IHD
    public final void LIZJ(AbstractC48384Iyq abstractC48384Iyq) {
        H78.LIZJ("fetchDecodedImage onCancellation");
        this.LIZ.onComplete();
    }

    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v6 */
    @Override // X.IHD
    public final void LIZLLL(W4W<C81392Vwy<W5A>> w4w) {
        C81392Vwy<W5A> result;
        W5A LJI;
        int duration;
        ?? r12;
        int[] iArr;
        if (w4w != null && (result = w4w.getResult()) != null && (LJI = result.LJI()) != null) {
            C43772HFw c43772HFw = this.LIZIZ;
            InterfaceC73573Su9<C76800UCe> interfaceC73573Su9 = this.LIZ;
            String str = this.LIZJ;
            boolean z = LJI instanceof C81831W9r;
            int[] iArr2 = C54846Lfm.LJLJJI;
            if (z) {
                C81831W9r c81831W9r = (C81831W9r) LJI;
                if (c81831W9r.LIZ().LIZ.getDuration() <= 0) {
                    duration = 1;
                } else {
                    duration = c81831W9r.LIZ().LIZ.getDuration();
                }
                int frameCount = c81831W9r.LIZ().LIZ.getFrameCount();
                int i = ((int) (frameCount / (duration / 1000))) * 2;
                for (int i2 = 0; i2 < frameCount; i2 += i) {
                    C81837W9x c81837W9x = new C81837W9x(new WAU(), new WA1(new WBF(), c81831W9r.LIZ(), new Rect(0, 0, c81831W9r.getWidth(), c81831W9r.getHeight())));
                    Bitmap createBitmap = Bitmap.createBitmap(c81831W9r.getWidth(), c81831W9r.getHeight(), Bitmap.Config.ARGB_8888);
                    c81837W9x.LIZ(i2, createBitmap);
                    int width = c81831W9r.getWidth();
                    int height = c81831W9r.getHeight();
                    c43772HFw.getClass();
                    if (width > height) {
                        r12 = 1;
                        iArr = new int[]{iArr2[0], (int) ((height / width) * iArr2[0])};
                    } else {
                        r12 = 1;
                        float f = width / height;
                        int i3 = iArr2[1];
                        iArr = new int[]{(int) (f * i3), i3};
                    }
                    Bitmap dstBitmap = Bitmap.createScaledBitmap(createBitmap, iArr[0], iArr[r12], r12);
                    o.LJIIIIZZ(dstBitmap, "dstBitmap");
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(c43772HFw.LJ);
                    LIZ.append("extract_frame_library_gallery_");
                    LIZ.append(System.currentTimeMillis());
                    LIZ.append(".jpg");
                    C42299Git.LJFF(dstBitmap, new File(X1D.LIZIZ(LIZ)), 70, Bitmap.CompressFormat.JPEG);
                    dstBitmap.recycle();
                    createBitmap.recycle();
                }
                interfaceC73573Su9.onComplete();
                return;
            }
            c43772HFw.getClass();
            Bitmap LIZIZ = C42299Git.LIZIZ(str, iArr2, Bitmap.Config.ARGB_4444);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(c43772HFw.LJ);
            LIZ2.append("extract_frame_library_gallery_");
            LIZ2.append(System.currentTimeMillis());
            LIZ2.append(".jpg");
            C42299Git.LJFF(LIZIZ, new File(X1D.LIZIZ(LIZ2)), 70, Bitmap.CompressFormat.JPEG);
            interfaceC73573Su9.onComplete();
        }
    }

    public C81839W9z(C73433Srt c73433Srt, C43772HFw c43772HFw, String str) {
        this.LIZ = c73433Srt;
        this.LIZIZ = c43772HFw;
        this.LIZJ = str;
    }
}
