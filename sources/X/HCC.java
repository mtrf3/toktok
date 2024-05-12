package X;

import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class HCC extends F9E {
    public final FaceStickerBean LJLIL;
    public final ArrayList<AVChallenge> LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Boolean.valueOf(this.LJLJI), Boolean.valueOf(this.LJLJJI)};
    }

    public HCC(FaceStickerBean faceStickerBean, ArrayList<AVChallenge> arrayList, boolean z, boolean z2) {
        this.LJLIL = faceStickerBean;
        this.LJLILLLLZI = arrayList;
        this.LJLJI = z;
        this.LJLJJI = z2;
    }
}
