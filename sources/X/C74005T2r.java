package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.List;
import kotlin.jvm.internal.AqS174S0200000_12;

/* renamed from: X.T2r, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74005T2r implements InterfaceC73142SnC<SearchMixFeed, AML> {
    public final InterfaceC88472Yns<AML, C76800UCe> LIZ;
    public final InterfaceC88471Ynr<AML, Throwable, C76800UCe> LIZIZ;
    public final InterfaceC88471Ynr<AML, List<? extends SearchMixFeed>, C76800UCe> LIZJ;
    public final /* synthetic */ InterfaceC88472Yns LIZLLL;
    public final /* synthetic */ InterfaceC88471Ynr LJ;
    public final /* synthetic */ InterfaceC88471Ynr LJFF;

    @Override // X.InterfaceC73142SnC
    public final InterfaceC88471Ynr<AML, Throwable, C76800UCe> LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC73142SnC
    public final InterfaceC88471Ynr<AML, List<? extends SearchMixFeed>, C76800UCe> LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC73142SnC
    public final InterfaceC88472Yns<AML, C76800UCe> LIZJ() {
        return this.LIZ;
    }

    public C74005T2r(C74006T2s c74006T2s, KP2 kp2, AqS174S0200000_12 aqS174S0200000_12) {
        this.LIZLLL = c74006T2s;
        this.LJ = kp2;
        this.LJFF = aqS174S0200000_12;
        this.LIZ = c74006T2s;
        this.LIZIZ = kp2;
        this.LIZJ = aqS174S0200000_12;
    }
}
