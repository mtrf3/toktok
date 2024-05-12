package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.music.model.DspAuthParam;

/* renamed from: X.akm, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94672akm extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ DspAuthParam LJLIL;
    public final /* synthetic */ Activity LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ long LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94672akm(DspAuthParam dspAuthParam, Activity activity, boolean z, boolean z2, long j) {
        super(0);
        this.LJLIL = dspAuthParam;
        this.LJLILLLLZI = activity;
        this.LJLJI = z;
        this.LJLJJI = z2;
        this.LJLJJL = j;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C94302aeo.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, true, this.LJLJJI, this.LJLJJL);
        return C76800UCe.LIZ;
    }
}
