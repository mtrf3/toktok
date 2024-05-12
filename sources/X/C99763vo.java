package X;

import com.ss.android.ugc.aweme.AccountService;
import kotlin.jvm.internal.o;

/* renamed from: X.3vo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99763vo extends AbstractC65781Prl implements InterfaceC88472Yns<LEA, C76800UCe> {
    public static final C99763vo LJLIL = new C99763vo();

    public C99763vo() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LEA lea) {
        LEA listener = lea;
        o.LJIIIZ(listener, "listener");
        AccountService.LJIJ().LJIILJJIL(listener);
        return C76800UCe.LIZ;
    }
}
