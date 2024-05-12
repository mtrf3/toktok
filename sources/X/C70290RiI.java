package X;

import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.RiI, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70290RiI extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C70287RiF LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70290RiI(C70287RiF c70287RiF, int i, boolean z) {
        super(0);
        this.LJLIL = c70287RiF;
        this.LJLILLLLZI = i;
        this.LJLJI = z;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C70287RiF c70287RiF = this.LJLIL;
        if (c70287RiF.LJLJJI != this.LJLILLLLZI) {
            if (!this.LJLJI) {
                ((RecyclerView) c70287RiF._$_findCachedViewById(R.id.k9c)).LJLI(this.LJLILLLLZI);
            } else {
                c70287RiF.LJJLL();
            }
            C70287RiF c70287RiF2 = this.LJLIL;
            c70287RiF2.LJLJJI = c70287RiF2.LJLJI;
        }
        return C76800UCe.LIZ;
    }
}
