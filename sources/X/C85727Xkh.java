package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.verify.ConfirmEmailFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.Xkh, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85727Xkh extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ ConfirmEmailFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85727Xkh(ConfirmEmailFragment confirmEmailFragment) {
        super(0);
        this.LJLIL = confirmEmailFragment;
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Bundle arguments = this.LJLIL.getArguments();
        o.LJI(arguments);
        return Boolean.valueOf(arguments.getBoolean("from_ProAccount"));
    }
}
