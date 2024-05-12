package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity;

/* renamed from: X.RAe, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69104RAe extends AbstractC65781Prl implements InterfaceC65784Pro<Bundle> {
    public final /* synthetic */ BindOrModifyPhoneActivity LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69104RAe(BindOrModifyPhoneActivity bindOrModifyPhoneActivity) {
        super(0);
        this.LJLIL = bindOrModifyPhoneActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final Bundle invoke() {
        Bundle bundle;
        if (C16880lQ.LLJJIJI(this.LJLIL.getIntent()) != null) {
            bundle = new Bundle(C16880lQ.LLJJIJI(this.LJLIL.getIntent()));
        } else {
            bundle = new Bundle();
        }
        bundle.remove("next_page");
        bundle.remove("current_scene");
        return bundle;
    }
}
