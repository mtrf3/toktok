package X;

import com.ss.android.ugc.aweme.setting.model.AuthorizedStruct;
import java.util.List;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;

/* loaded from: classes5.dex */
public final class AYL implements InterfaceC73142SnC<AuthorizedStruct, AML> {
    public final InterfaceC88472Yns<AML, C76800UCe> LIZ;
    public final InterfaceC88471Ynr<AML, Throwable, C76800UCe> LIZIZ;
    public final InterfaceC88471Ynr<AML, List<? extends AuthorizedStruct>, C76800UCe> LIZJ;
    public final /* synthetic */ InterfaceC88472Yns LIZLLL;
    public final /* synthetic */ InterfaceC88471Ynr LJ;
    public final /* synthetic */ InterfaceC88471Ynr LJFF;

    @Override // X.InterfaceC73142SnC
    public final InterfaceC88471Ynr<AML, Throwable, C76800UCe> LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC73142SnC
    public final InterfaceC88471Ynr<AML, List<? extends AuthorizedStruct>, C76800UCe> LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC73142SnC
    public final InterfaceC88472Yns<AML, C76800UCe> LIZJ() {
        return this.LIZ;
    }

    public AYL(AqS170S0100000_4 aqS170S0100000_4, AqS186S0100000_4 aqS186S0100000_4, AqS186S0100000_4 aqS186S0100000_42) {
        this.LIZLLL = aqS170S0100000_4;
        this.LJ = aqS186S0100000_4;
        this.LJFF = aqS186S0100000_42;
        this.LIZ = aqS170S0100000_4;
        this.LIZIZ = aqS186S0100000_4;
        this.LIZJ = aqS186S0100000_42;
    }
}
