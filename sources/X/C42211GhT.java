package X;

import com.ss.android.ugc.aweme.shortvideo.model.Error;
import com.zhiliaoapp.musically.R;

/* renamed from: X.GhT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42211GhT extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C42210GhS LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42211GhT(C42210GhS c42210GhS, String str, int i, int i2, String str2) {
        super(0);
        this.LJLIL = c42210GhS;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
        this.LJLJJI = i2;
        this.LJLJJL = str2;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C42210GhS c42210GhS = this.LJLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("stream edit error,url:");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(",errorCode:");
        LIZ.append(this.LJLJI);
        LIZ.append(",ext:");
        LIZ.append(this.LJLJJI);
        LIZ.append(",msg:");
        LIZ.append(this.LJLJJL);
        c42210GhS.LJZL = new Error(new Throwable(X1D.LIZIZ(LIZ)));
        if (this.LJLJI == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            C42210GhS c42210GhS2 = this.LJLIL;
            if (currentTimeMillis - c42210GhS2.LJLLJ > 2000) {
                C24540xm.LIZ(R.string.im9, C78688UuS.LJIJJ(c42210GhS2), 6001);
                this.LJLIL.LJLLJ = System.currentTimeMillis();
            }
            this.LJLIL.LJJLI();
        }
        this.LJLIL.LJJLIIIJILLIZJL();
        this.LJLIL.LJLJLJ.setValue(Boolean.FALSE);
        return C76800UCe.LIZ;
    }
}
