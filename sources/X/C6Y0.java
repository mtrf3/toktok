package X;

import com.bytedance.ies.cutsame.cut_android.NLETemplateSource;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.VEChooseVideoCoverFragment;

/* renamed from: X.6Y0, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6Y0 implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.LJLIL) {
            case 0:
                NLETemplateSource.LIZIZ((NLETemplateSource) this.LJLJI, this.LJLILLLLZI);
                return;
            default:
                VEChooseVideoCoverFragment vEChooseVideoCoverFragment = (VEChooseVideoCoverFragment) this.LJLJI;
                long j = this.LJLILLLLZI;
                vEChooseVideoCoverFragment.LJLZ = false;
                vEChooseVideoCoverFragment.LJLLL.LJIIIZ().setValue(C5MM.LIZLLL(j));
                vEChooseVideoCoverFragment.Il(j);
                return;
        }
    }

    public /* synthetic */ C6Y0(long j, int i, Object obj) {
        this.LJLIL = i;
        this.LJLJI = obj;
        this.LJLILLLLZI = j;
    }
}
