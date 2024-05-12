package X;

import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.collect.CollectViewModel;

/* renamed from: X.ZtG, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91354ZtG<T> implements InterfaceC64592gB {
    public final /* synthetic */ CollectViewModel LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ int LJLJJI;

    public C91354ZtG(CollectViewModel collectViewModel, String str, String str2, int i) {
        this.LJLIL = collectViewModel;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = i;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        this.LJLIL.setState(new C91555ZwV(this.LJLILLLLZI, this.LJLJI, this.LJLJJI));
        C2U8.LIZ(new C57292Mr(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, false));
    }
}
