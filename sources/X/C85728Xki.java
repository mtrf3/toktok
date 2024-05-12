package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonSetAvatarFragment;

/* renamed from: X.Xki, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85728Xki extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ CommonSetAvatarFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85728Xki(CommonSetAvatarFragment commonSetAvatarFragment) {
        super(0);
        this.LJLIL = commonSetAvatarFragment;
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        Bundle arguments = this.LJLIL.getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("is_new_3p_signup");
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
