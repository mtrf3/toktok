package X;

import com.ss.android.ugc.aweme.sharedar.SharedARModel;

/* renamed from: X.HaP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44321HaP extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ C44322HaQ LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44321HaP(int i, C44322HaQ c44322HaQ, String str, String str2) {
        super(0);
        this.LJLIL = i;
        this.LJLILLLLZI = c44322HaQ;
        this.LJLJI = str;
        this.LJLJJI = str2;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        if (this.LJLIL == 1) {
            SharedARModel sharedARModel = this.LJLILLLLZI.LIZLLL().sharedARModel;
            if (sharedARModel != null) {
                sharedARModel.setSharedARMultiPlayerUserName(this.LJLJI);
            }
            SharedARModel sharedARModel2 = this.LJLILLLLZI.LIZLLL().sharedARModel;
            if (sharedARModel2 != null) {
                sharedARModel2.setSharedARMultiPlayerUserId(this.LJLJJI);
            }
        }
        return C76800UCe.LIZ;
    }
}
