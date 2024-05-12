package X;

import com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.80C, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C80C extends AbstractC65781Prl implements InterfaceC88472Yns<C204237zv, C204237zv> {
    public final /* synthetic */ VideoShareViewModel LJLIL;
    public final /* synthetic */ String LJLILLLLZI = "whatsapp";
    public final /* synthetic */ float LJLJI;
    public final /* synthetic */ float LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80C(VideoShareViewModel videoShareViewModel, float f, float f2) {
        super(1);
        this.LJLIL = videoShareViewModel;
        this.LJLJI = f;
        this.LJLJJI = f2;
    }

    @Override // X.InterfaceC88472Yns
    public final C204237zv invoke(C204237zv c204237zv) {
        Aweme aweme;
        C204237zv setState = c204237zv;
        o.LJIIIZ(setState, "$this$setState");
        C80H c80h = C80H.FLIP_AND_BREATHE;
        VideoItemParams gv0 = this.LJLIL.gv0();
        if (gv0 != null) {
            aweme = gv0.getAweme();
        } else {
            aweme = null;
        }
        return C204237zv.LIZ(setState, null, null, null, null, null, new C43I(new OSZ(c80h, new C80U(aweme, this.LJLIL.LJLJI, this.LJLILLLLZI, this.LJLJI, this.LJLJJI))), 63);
    }
}
