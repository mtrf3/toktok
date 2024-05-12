package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.AqS105S0300000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.ObP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62219ObP extends AbstractC65781Prl implements InterfaceC88472Yns<String, C76800UCe> {
    public final /* synthetic */ Aweme LJLIL;
    public final /* synthetic */ InterfaceC62225ObV LJLILLLLZI;
    public final /* synthetic */ SharePackage LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJLJJL;
    public final /* synthetic */ Context LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C62219ObP(Aweme aweme, InterfaceC62225ObV interfaceC62225ObV, SharePackage sharePackage, int i, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, Context context) {
        super(1);
        this.LJLIL = aweme;
        this.LJLILLLLZI = interfaceC62225ObV;
        this.LJLJI = sharePackage;
        this.LJLJJI = i;
        this.LJLJJL = interfaceC88472Yns;
        this.LJLJJLL = context;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(String str) {
        String path = str;
        o.LJIIIZ(path, "path");
        Aweme aweme = this.LJLIL;
        InterfaceC62225ObV interfaceC62225ObV = this.LJLILLLLZI;
        C62340OdM.LIZIZ(aweme, interfaceC62225ObV, new AqS105S0300000_1(this.LJLJJLL, interfaceC62225ObV, this.LJLJI, 12), this.LJLJI, path, this.LJLJJI);
        this.LJLJJL.invoke(Boolean.TRUE);
        return C76800UCe.LIZ;
    }
}
