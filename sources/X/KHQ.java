package X;

import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams;

/* loaded from: classes9.dex */
public final class KHQ implements KHW {
    public final /* synthetic */ KHW LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    @Override // X.KHW
    public final PhotoSearchBusinessEnterParams LIZ() {
        KHW khw = this.LJLIL;
        if (khw != null) {
            return khw.LIZ();
        }
        return null;
    }

    @Override // X.KHW
    public final PhotoSearchLogEnterParams LIZIZ() {
        PhotoSearchLogEnterParams LIZIZ;
        KHW khw = this.LJLIL;
        if (khw != null && (LIZIZ = khw.LIZIZ()) != null) {
            LIZIZ.setSearchEntrance(this.LJLILLLLZI);
            return LIZIZ;
        }
        return null;
    }

    public KHQ(KHW khw, String str) {
        this.LJLIL = khw;
        this.LJLILLLLZI = str;
    }
}
