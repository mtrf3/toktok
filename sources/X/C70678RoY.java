package X;

import com.ss.android.ugc.aweme.ecommerce.base.review.viewholder.ReviewCellViewHolder;
import kotlin.jvm.internal.AqS35S1000000_12;

/* renamed from: X.RoY, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70678RoY extends AbstractC65781Prl implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ ReviewCellViewHolder LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ C70682Roc LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70678RoY(boolean z, ReviewCellViewHolder reviewCellViewHolder, String str, C70682Roc c70682Roc, String str2, String str3) {
        super(1);
        this.LJLIL = z;
        this.LJLILLLLZI = reviewCellViewHolder;
        this.LJLJI = str;
        this.LJLJJI = c70682Roc;
        this.LJLJJL = str2;
        this.LJLJJLL = str3;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        if (bool.booleanValue()) {
            if (this.LJLIL) {
                this.LJLILLLLZI.Q().Pv0(3, this.LJLJI);
            } else {
                this.LJLILLLLZI.Q().Pv0(2, this.LJLJI);
            }
            C70682Roc.LIZJ(this.LJLJJI, this.LJLJJL, 0, false, new AqS35S1000000_12(this.LJLJJLL, 8), 6);
        }
        return C76800UCe.LIZ;
    }
}
