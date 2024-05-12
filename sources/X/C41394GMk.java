package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.profile.aigc.ProfileAIGCServiceImpl;

/* renamed from: X.GMk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41394GMk extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C41393GMj LJLIL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final /* synthetic */ Bundle LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41394GMk(C41393GMj c41393GMj, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, Bundle bundle) {
        super(0);
        this.LJLIL = c41393GMj;
        this.LJLILLLLZI = interfaceC65784Pro;
        this.LJLJI = bundle;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        if (C41349GKr.LIZ()) {
            this.LJLIL.LIZ.invoke();
        }
        this.LJLILLLLZI.invoke();
        if (this.LJLJI.getBoolean("is_aivatar")) {
            ProfileAIGCServiceImpl.LJFF().LIZ();
        }
        return C76800UCe.LIZ;
    }
}
