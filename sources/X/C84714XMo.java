package X;

import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.rememberaccount.OneClickLoginViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.XMo, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84714XMo extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ OneClickLoginViewModel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84714XMo(OneClickLoginViewModel oneClickLoginViewModel) {
        super(0);
        this.LJLIL = oneClickLoginViewModel;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Intent intent = this.LJLIL.LJLILLLLZI;
        if (intent != null) {
            Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
            boolean z = true;
            if (LLJJIJI != null && !LLJJIJI.getBoolean("is_skippable_dialog") && ((Boolean) this.LJLIL.LJLJI.getValue()).booleanValue()) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        o.LJIJI("intent");
        throw null;
    }
}
