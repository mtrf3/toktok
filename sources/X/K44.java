package X;

import com.ss.android.ugc.aweme.search.filter.SubFilterOptionStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K44 extends AbstractC65781Prl implements InterfaceC88472Yns<K42, K42> {
    public final /* synthetic */ SubFilterOptionStruct LJLIL;
    public final /* synthetic */ SubFilterOptionStruct LJLILLLLZI;
    public final /* synthetic */ SubFilterOptionStruct LJLJI;
    public final /* synthetic */ SubFilterOptionStruct LJLJJI;
    public final /* synthetic */ SubFilterOptionStruct LJLJJL;
    public final /* synthetic */ SubFilterOptionStruct LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K44(SubFilterOptionStruct subFilterOptionStruct, SubFilterOptionStruct subFilterOptionStruct2, SubFilterOptionStruct subFilterOptionStruct3, SubFilterOptionStruct subFilterOptionStruct4, SubFilterOptionStruct subFilterOptionStruct5, SubFilterOptionStruct subFilterOptionStruct6) {
        super(1);
        this.LJLIL = subFilterOptionStruct;
        this.LJLILLLLZI = subFilterOptionStruct2;
        this.LJLJI = subFilterOptionStruct3;
        this.LJLJJI = subFilterOptionStruct4;
        this.LJLJJL = subFilterOptionStruct5;
        this.LJLJJLL = subFilterOptionStruct6;
    }

    @Override // X.InterfaceC88472Yns
    public final K42 invoke(K42 setState) {
        o.LJIIIZ(setState, "$this$setState");
        return new K42(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, false);
    }
}
