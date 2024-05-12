package X;

import Y.ARunnableS18S0101000_14;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.VEChooseVideoCoverFragment;

/* renamed from: X.6Y5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6Y5 implements InterfaceC133905Ni {
    public final /* synthetic */ VEChooseVideoCoverFragment LJLIL;

    public C6Y5(VEChooseVideoCoverFragment vEChooseVideoCoverFragment) {
        this.LJLIL = vEChooseVideoCoverFragment;
    }

    @Override // X.InterfaceC133905Ni
    public final void LIZ(int i, int i2, float f, String str) {
        if (i == 4101) {
            this.LJLIL.LJLLILLLL.post(new ARunnableS18S0101000_14(5, this, 16));
            C6Y2 c6y2 = this.LJLIL.LJLLL;
            if (c6y2 != null) {
                c6y2.getEditor().LLFF(this);
            }
        }
    }
}
