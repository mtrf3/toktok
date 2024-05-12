package X;

import Y.AObjectS40S0201000_7;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;

/* renamed from: X.66c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1549066c implements InterfaceC88472Yns {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Serializable LJLJI;

    /* JADX WARN: Type inference failed for: r0v7, types: [T, float[]] */
    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.LJLIL) {
            case 0:
                ARI ari = (ARI) obj;
                ari.LJI(R.string.roy, new AObjectS40S0201000_7(0, this.LJLILLLLZI, this.LJLJI, 4));
                ari.LJIIIIZZ(R.string.row, null);
                return null;
            default:
                StickerItemModel stickerItemModel = (StickerItemModel) this.LJLILLLLZI;
                C68322mC c68322mC = (C68322mC) this.LJLJI;
                C122034qd c122034qd = (C122034qd) obj;
                if (stickerItemModel.uuid != null) {
                    c68322mC.element = c122034qd.LJIIIIZZ().LIZ().LJIIIZ(stickerItemModel.uuid);
                }
                return null;
        }
    }

    public /* synthetic */ C1549066c(Object obj, Serializable serializable, int i) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
        this.LJLJI = serializable;
    }
}
