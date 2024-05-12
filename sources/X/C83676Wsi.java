package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.AqS63S0201000_14;

/* renamed from: X.Wsi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83676Wsi extends AbstractC65781Prl implements InterfaceC65784Pro<InterfaceC83724WtU<EnumC83818Wv0>> {
    public final /* synthetic */ C83592WrM LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ ShortVideoContext LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83676Wsi(int i, ShortVideoContext shortVideoContext, C83592WrM c83592WrM) {
        super(0);
        this.LJLIL = c83592WrM;
        this.LJLILLLLZI = i;
        this.LJLJI = shortVideoContext;
    }

    @Override // X.InterfaceC65784Pro
    public final InterfaceC83724WtU<EnumC83818Wv0> invoke() {
        return C1DF.LJI(new AqS63S0201000_14(this.LJLILLLLZI, this.LJLJI, this.LJLIL, 1));
    }
}
