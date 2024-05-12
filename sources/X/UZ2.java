package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UZ2 extends AbstractC65781Prl implements InterfaceC88472Yns<C26231ARf, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ UZ8 LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UZ2(int i, UZ8 uz8, String str, String str2) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = uz8;
        this.LJLJJI = i;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C26231ARf it) {
        o.LJIIIZ(it, "it");
        String region = this.LJLIL;
        o.LJIIIIZZ(region, "region");
        if (!UZ1.LIZIZ(region)) {
            UZ1.LIZLLL(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, "dismiss", CardStruct.IStatusCode.DEFAULT);
        }
        return C76800UCe.LIZ;
    }
}
