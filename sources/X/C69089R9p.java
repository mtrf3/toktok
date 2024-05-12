package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* renamed from: X.R9p, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69089R9p extends AbstractC69088R9o {
    public final EnumC69116RAq LIZJ;
    public final EnumC69113RAn LIZLLL;

    @Override // X.AbstractC69088R9o
    public final boolean LIZ() {
        Serializable serializable;
        Bundle arguments = this.LIZ.getArguments();
        if (arguments != null && (serializable = arguments.getSerializable("phone_number")) != null) {
            Fragment fragment = this.LIZ;
            InterfaceC69056R8i interfaceC69056R8i = this.LIZIZ;
            String LIZ = PhoneNumberUtil.LIZ((PhoneNumberUtil.PhoneNumber) serializable);
            o.LJIIIIZZ(LIZ, "formatNumber(it as PhoneNumberUtil.PhoneNumber)");
            C69093R9t.LJJIFFI(fragment, this.LIZJ, this.LIZLLL, interfaceC69056R8i, LIZ, "anti_spam").LJIILL();
            return true;
        }
        return true;
    }

    public C69089R9p(Fragment fragment, EnumC69116RAq enumC69116RAq, EnumC69113RAn enumC69113RAn, InterfaceC69056R8i interfaceC69056R8i) {
        super(fragment, interfaceC69056R8i);
        this.LIZJ = enumC69116RAq;
        this.LIZLLL = enumC69113RAn;
    }
}
