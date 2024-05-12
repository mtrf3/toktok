package X;

import com.ss.android.vesdk.VEInfo;
import kotlin.jvm.internal.AqS164S0100000_14;

/* renamed from: X.Wvv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83875Wvv implements HJ0 {
    public final /* synthetic */ C83860Wvg LJLIL;
    public final /* synthetic */ InterfaceC83737Wth LJLILLLLZI;

    public C83875Wvv(C83860Wvg c83860Wvg, InterfaceC83737Wth interfaceC83737Wth) {
        this.LJLIL = c83860Wvg;
        this.LJLILLLLZI = interfaceC83737Wth;
    }

    @Override // X.InterfaceC133905Ni
    public final void LIZ(int i, int i2, float f, String str) {
        if (i == VEInfo.TE_INFO_PREVIEW_FIRST_FRAME_SCREEN) {
            C43045Guv.LIZLLL(new AqS164S0100000_14(this, 489), 0L);
            this.LJLIL.q9(this);
        } else {
            if (i != VEInfo.TE_INFO_FIRST_FRAME_AFTER_SURFACE_CHANGED) {
                return;
            }
            C43045Guv.LIZLLL(new AqS164S0100000_14(this, 490), 300L);
            this.LJLIL.q9(this);
        }
    }
}
