package X;

import android.view.ViewConfiguration;
import com.ss.android.ugc.aweme.creatorcenter.fragment.CreatorCenterFragment;

/* renamed from: X.AGv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25961AGv implements InterfaceC25962AGw {
    public final /* synthetic */ CreatorCenterFragment LIZ;

    public C25961AGv(CreatorCenterFragment creatorCenterFragment) {
        this.LIZ = creatorCenterFragment;
    }

    @Override // X.InterfaceC25962AGw
    public final void LIZ(int i, int i2) {
        boolean z;
        CreatorCenterFragment creatorCenterFragment = this.LIZ;
        if (Math.abs(i) > Math.abs(i2) && Math.abs(i) >= ViewConfiguration.getTouchSlop()) {
            z = true;
        } else {
            z = false;
        }
        creatorCenterFragment.LJLJLLL = z;
    }
}
