package X;

import Y.ARunnableS38S0100000_2;
import com.ss.android.vesdk.VEInfo;
import kotlin.jvm.internal.AqS164S0100000_14;

/* renamed from: X.Wvt, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83873Wvt implements HJ0 {
    public final /* synthetic */ C83861Wvh LJLIL;
    public final /* synthetic */ InterfaceC83737Wth LJLILLLLZI;

    public C83873Wvt(C83861Wvh c83861Wvh, InterfaceC83737Wth interfaceC83737Wth) {
        this.LJLIL = c83861Wvh;
        this.LJLILLLLZI = interfaceC83737Wth;
    }

    @Override // X.InterfaceC133905Ni
    public final void LIZ(int i, int i2, float f, String str) {
        if (i == VEInfo.TE_INFO_PREVIEW_FIRST_FRAME_SCREEN) {
            C6QQ.LIZ(new AqS164S0100000_14(this, 281));
            this.LJLIL.q9(this);
        } else {
            if (i != VEInfo.TE_INFO_FIRST_FRAME_AFTER_SURFACE_CHANGED) {
                return;
            }
            C6QQ.LIZ.postDelayed(new ARunnableS38S0100000_2(new AqS164S0100000_14(this, 282), (InterfaceC65784Pro<C76800UCe>) 144), 300L);
            this.LJLIL.q9(this);
        }
    }
}
