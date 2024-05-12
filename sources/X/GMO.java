package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.image.model.SrcImageInfo;
import java.util.List;

/* loaded from: classes8.dex */
public final class GMO implements GMU {
    public final /* synthetic */ C76732zl LIZ;
    public final /* synthetic */ C76732zl LIZIZ;
    public final /* synthetic */ C68322mC<String> LIZJ;
    public final /* synthetic */ C76732zl LIZLLL;
    public final /* synthetic */ GAH LJ;
    public final /* synthetic */ List<PhotoModeImageUrlModel> LJFF;
    public final /* synthetic */ InterfaceC67352kd<SrcImageInfo> LJI;
    public final /* synthetic */ GMN LJII;
    public final /* synthetic */ String LJIIIIZZ;
    public final /* synthetic */ PhotoModeImageUrlModel LJIIIZ;

    public final void LIZIZ() {
        int i;
        C76732zl c76732zl = this.LIZLLL;
        int i2 = c76732zl.element + 1;
        c76732zl.element = i2;
        this.LJ.onProgress((i2 * 100.0f) / this.LJFF.size());
        InterfaceC67352kd<SrcImageInfo> interfaceC67352kd = this.LJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append((String) this.LJII.LIZIZ.getValue());
        LIZ.append(this.LJIIIIZZ);
        String LIZIZ = X1D.LIZIZ(LIZ);
        UrlModel displayImageNoWatermark = this.LJIIIZ.getDisplayImageNoWatermark();
        int i3 = 0;
        if (displayImageNoWatermark != null) {
            i = displayImageNoWatermark.getHeight();
        } else {
            i = 0;
        }
        UrlModel displayImageNoWatermark2 = this.LJIIIZ.getDisplayImageNoWatermark();
        if (displayImageNoWatermark2 != null) {
            i3 = displayImageNoWatermark2.getWidth();
        }
        SrcImageInfo srcImageInfo = new SrcImageInfo(LIZIZ, i, i3);
        C3C5.m7constructorimpl(srcImageInfo);
        interfaceC67352kd.resumeWith(srcImageInfo);
    }

    @Override // X.GMU
    public final void onSuccess() {
        LIZIZ();
        this.LIZ.element++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GMU
    public final void LIZ(int i, String str) {
        LIZIZ();
        this.LIZIZ.element = i;
        this.LIZJ.element = str;
    }

    public GMO(C76732zl c76732zl, C76732zl c76732zl2, C68322mC c68322mC, C76732zl c76732zl3, GAH gah, List list, C84654XKg c84654XKg, GMN gmn, String str, PhotoModeImageUrlModel photoModeImageUrlModel) {
        this.LIZ = c76732zl;
        this.LIZIZ = c76732zl2;
        this.LIZJ = c68322mC;
        this.LIZLLL = c76732zl3;
        this.LJ = gah;
        this.LJFF = list;
        this.LJI = c84654XKg;
        this.LJII = gmn;
        this.LJIIIIZZ = str;
        this.LJIIIZ = photoModeImageUrlModel;
    }
}
