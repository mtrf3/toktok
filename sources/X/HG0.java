package X;

import com.ss.android.vesdk.VEUtils;

/* loaded from: classes8.dex */
public final class HG0<T> implements InterfaceC86003Zc {
    public final /* synthetic */ HG9 LJLIL;
    public final /* synthetic */ C43772HFw LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public HG0(HG9 hg9, C43772HFw c43772HFw, int i) {
        this.LJLIL = hg9;
        this.LJLILLLLZI = c43772HFw;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<C76800UCe> interfaceC73573Su9) {
        try {
            HG9 hg9 = this.LJLIL;
            String str = hg9.LIZ;
            C43772HFw c43772HFw = this.LJLILLLLZI;
            int i = hg9.LIZIZ;
            int i2 = hg9.LIZJ;
            c43772HFw.getClass();
            int LIZIZ = ((i2 - i) / C54846Lfm.LIZIZ()) + 1;
            int[] iArr = new int[LIZIZ];
            for (int i3 = 0; i3 < LIZIZ; i3++) {
                iArr[i3] = (C54846Lfm.LIZIZ() * i3) + i;
            }
            int i4 = C54846Lfm.LJLJJI[0];
            String str2 = this.LJLILLLLZI.LJ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJLJI);
            LIZ.append("_extract_frame_library_gallery");
            VEUtils.saveVideoFrames(str, iArr, i4, -1, false, str2, X1D.LIZIZ(LIZ), 1);
            interfaceC73573Su9.onComplete();
        } catch (Exception e) {
            interfaceC73573Su9.onError(e);
        }
    }
}
