package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.changemail.ChangeEmailVerifyFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.RBp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69141RBp extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ ChangeEmailVerifyFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69141RBp(ChangeEmailVerifyFragment changeEmailVerifyFragment) {
        super(0);
        this.LJLIL = changeEmailVerifyFragment;
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Bundle arguments = this.LJLIL.getArguments();
        o.LJI(arguments);
        return Boolean.valueOf(arguments.getBoolean("from_ProAccount"));
    }
}
