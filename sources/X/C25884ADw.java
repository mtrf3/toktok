package X;

import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.creatorcenter.fragment.CreatorCenterSettingsFragment;
import kotlin.jvm.internal.AqS9S0010000_4;

/* renamed from: X.ADw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25884ADw implements InterfaceC25880ADs {
    public final /* synthetic */ CreatorCenterSettingsFragment LIZ;
    public final /* synthetic */ boolean LIZIZ;

    @Override // X.InterfaceC25880ADs
    public final void onLoading() {
    }

    @Override // X.InterfaceC25880ADs
    public final void onFailed() {
        C25849ACn c25849ACn = this.LIZ.LJLJI;
        if (c25849ACn != null) {
            c25849ACn.LJIIJ(new AqS9S0010000_4(this.LIZIZ, 39));
        }
    }

    @Override // X.InterfaceC25880ADs
    public final void onSuccess() {
        C25849ACn c25849ACn = this.LIZ.LJLJI;
        if (c25849ACn != null) {
            c25849ACn.LJIIJ(new AqS9S0010000_4(this.LIZIZ, 40));
        }
        AccountService.LJIJ().LJFF().updateCurAdAuthorization(this.LIZIZ);
    }

    public C25884ADw(CreatorCenterSettingsFragment creatorCenterSettingsFragment, boolean z) {
        this.LIZ = creatorCenterSettingsFragment;
        this.LIZIZ = z;
    }
}
