package X;

import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity;
import kotlin.jvm.internal.AqS9S0010000_4;

/* renamed from: X.ADx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25885ADx implements InterfaceC25880ADs {
    public final /* synthetic */ CreatorToolsActivity LIZ;
    public final /* synthetic */ boolean LIZIZ;

    @Override // X.InterfaceC25880ADs
    public final void onLoading() {
    }

    @Override // X.InterfaceC25880ADs
    public final void onFailed() {
        C25849ACn c25849ACn = this.LIZ.LLFF;
        if (c25849ACn != null) {
            c25849ACn.LJIIJ(new AqS9S0010000_4(this.LIZIZ, 50));
        }
    }

    @Override // X.InterfaceC25880ADs
    public final void onSuccess() {
        C25849ACn c25849ACn = this.LIZ.LLFF;
        if (c25849ACn != null) {
            c25849ACn.LJIIJ(new AqS9S0010000_4(this.LIZIZ, 51));
        }
        AccountService.LJIJ().LJFF().updateCurAdAuthorization(this.LIZIZ);
    }

    public C25885ADx(CreatorToolsActivity creatorToolsActivity, boolean z) {
        this.LIZ = creatorToolsActivity;
        this.LIZIZ = z;
    }
}
