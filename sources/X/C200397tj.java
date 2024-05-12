package X;

import com.ss.android.ugc.aweme.viewmodel.PostDiggViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.7tj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200397tj extends AbstractC65781Prl implements InterfaceC88472Yns<C200367tg, C200367tg> {
    public final /* synthetic */ PostDiggViewModel LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C200397tj(PostDiggViewModel postDiggViewModel, long j, boolean z) {
        super(1);
        this.LJLIL = postDiggViewModel;
        this.LJLILLLLZI = j;
        this.LJLJI = z;
    }

    @Override // X.InterfaceC88472Yns
    public final C200367tg invoke(C200367tg c200367tg) {
        C200367tg setState = c200367tg;
        o.LJIIIZ(setState, "$this$setState");
        PostDiggViewModel postDiggViewModel = this.LJLIL;
        return C200367tg.LIZ(setState, postDiggViewModel.gv0(this.LJLILLLLZI, postDiggViewModel.LJLJLJ, this.LJLJI));
    }
}
