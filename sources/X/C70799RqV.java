package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.review.ReviewFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.RqV, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70799RqV extends AbstractC65781Prl implements InterfaceC88473Ynt<View, String, Long, C76800UCe> {
    public final /* synthetic */ ReviewFragment LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70799RqV(ReviewFragment reviewFragment, String str) {
        super(3);
        this.LJLIL = reviewFragment;
        this.LJLILLLLZI = str;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(View view, String str, Long l) {
        String quitType = str;
        long longValue = l.longValue();
        o.LJIIIZ(quitType, "quitType");
        if (this.LJLIL.xl().LJLLILLLL != null) {
            C70691Rol.LJII(this.LJLIL, "sort_by", quitType, longValue, this.LJLILLLLZI);
        }
        return C76800UCe.LIZ;
    }
}
