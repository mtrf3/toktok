package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.collect.CollectViewModel;

/* renamed from: X.ZtF, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91353ZtF<T> implements InterfaceC64592gB {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ InterfaceC91296ZsK LJLILLLLZI;
    public final /* synthetic */ CollectViewModel LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;

    public C91353ZtF(int i, InterfaceC91296ZsK interfaceC91296ZsK, CollectViewModel collectViewModel, String str, String str2) {
        this.LJLIL = i;
        this.LJLILLLLZI = interfaceC91296ZsK;
        this.LJLJI = collectViewModel;
        this.LJLJJI = str;
        this.LJLJJL = str2;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        if (((BaseResponse) obj).status_code == 0) {
            C91211Zqx.LIZ++;
            if (this.LJLIL == 1) {
                this.LJLILLLLZI.LJIIJJI(1);
            } else {
                this.LJLILLLLZI.LJIIJJI(0);
            }
            this.LJLJI.setState(new C91553ZwT(this.LJLJJI, this.LJLJJL, this.LJLIL));
            C2U8.LIZ(new C57292Mr(this.LJLJJI, this.LJLJJL, this.LJLIL, true));
            return;
        }
        this.LJLJI.setState(new C91554ZwU(this.LJLJJI, this.LJLJJL, this.LJLIL));
        C2U8.LIZ(new C57292Mr(this.LJLJJI, this.LJLJJL, this.LJLIL, false));
    }
}
