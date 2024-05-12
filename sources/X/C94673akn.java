package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.music.model.DspAuthParam;

/* renamed from: X.akn, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94673akn extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ DspAuthParam LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Activity LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94673akn(DspAuthParam dspAuthParam, String str, Activity activity, long j, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        super(0);
        this.LJLIL = dspAuthParam;
        this.LJLILLLLZI = str;
        this.LJLJI = activity;
        this.LJLJJI = j;
        this.LJLJJL = interfaceC65784Pro;
        this.LJLJJLL = interfaceC65784Pro2;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C94302aeo.LIZJ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, true, this.LJLJJI, this.LJLJJL, this.LJLJJLL);
        return C76800UCe.LIZ;
    }
}
