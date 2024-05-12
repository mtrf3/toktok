package X;

import com.ss.android.vesdk.VERecorder;

/* renamed from: X.WyX, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84037WyX extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C84024WyK LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84037WyX(C84024WyK c84024WyK, int i, long j, long j2, String str) {
        super(0);
        this.LJLIL = c84024WyK;
        this.LJLILLLLZI = i;
        this.LJLJI = j;
        this.LJLJJI = j2;
        this.LJLJJL = str;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        VERecorder vERecorder = this.LJLIL.LJII;
        vERecorder.LIZIZ.sendEffectMsg(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL);
        return C76800UCe.LIZ;
    }
}
