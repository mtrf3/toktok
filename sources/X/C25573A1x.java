package X;

import Y.AfS3S1200100_4;
import Y.IDaS215S0100000_4;

/* renamed from: X.A1x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25573A1x<T> implements InterfaceC86003Zc {
    public final /* synthetic */ AbstractC73672Svk<T> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ java.util.Map<String, String> LJLJI;

    public C25573A1x(AbstractC73672Svk<T> abstractC73672Svk, String str, java.util.Map<String, String> map) {
        this.LJLIL = abstractC73672Svk;
        this.LJLILLLLZI = str;
        this.LJLJI = map;
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<T> interfaceC73573Su9) {
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC73672Svk<T> abstractC73672Svk = this.LJLIL;
        String str = this.LJLILLLLZI;
        java.util.Map<String, String> map = this.LJLJI;
        C73433Srt c73433Srt = (C73433Srt) interfaceC73573Su9;
        abstractC73672Svk.LJJJLL(new AfS3S1200100_4(c73433Srt, currentTimeMillis, str, map, 1), new AfS3S1200100_4(c73433Srt, currentTimeMillis, str, map, 2), new IDaS215S0100000_4(c73433Srt, 1));
    }
}
