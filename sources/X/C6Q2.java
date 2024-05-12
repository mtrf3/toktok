package X;

import com.ss.android.ugc.aweme.tools.sticker.core.QAStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;

/* renamed from: X.6Q2, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6Q2 implements InterfaceC159796Ox {
    public final /* synthetic */ C6PV LIZ;

    public C6Q2(C6PV c6pv) {
        this.LIZ = c6pv;
    }

    @Override // X.InterfaceC159796Ox
    public final void LIZ(int i, String str) {
        StickerModel LIZ = this.LIZ.LIZ(i, str);
        if (LIZ != null) {
            C6PV c6pv = this.LIZ;
            if (LIZ instanceof QAStickerModel) {
                c6pv.LJ.LJIIIZ();
            }
        }
    }
}
