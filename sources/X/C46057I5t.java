package X;

import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;

/* renamed from: X.I5t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46057I5t implements InterfaceC46060I5w {
    public final /* synthetic */ C46062I5y LIZ;

    public C46057I5t(C46062I5y c46062I5y) {
        this.LIZ = c46062I5y;
    }

    @Override // X.InterfaceC46060I5w
    public final void LIZ(int i, String str) {
        if (i == 10003) {
            this.LIZ.LLJJI();
            return;
        }
        C46062I5y c46062I5y = this.LIZ;
        C82632Wbs c82632Wbs = c46062I5y.LJLJJL;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = C46062I5y.LJLLLLLL;
        int jv0 = ((VideoEditViewModel) c82632Wbs.LIZ(c46062I5y, interfaceC74236TBoArr[0])).jv0(str);
        if (jv0 < 0) {
            return;
        }
        C46062I5y c46062I5y2 = this.LIZ;
        ((CutMultiVideoViewModel) c46062I5y2.LJLJL.LIZ(c46062I5y2, interfaceC74236TBoArr[2])).gv0(i, jv0);
    }
}
