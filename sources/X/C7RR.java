package X;

import com.ss.android.ugc.aweme.topic.review.model.TopicReview;
import kotlin.jvm.internal.o;

/* renamed from: X.7RR, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7RR extends AbstractC65781Prl implements InterfaceC88472Yns<C186157Sh, C186157Sh> {
    public final /* synthetic */ float LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7RR(float f, long j, long j2, boolean z) {
        super(1);
        this.LJLIL = f;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = z;
    }

    @Override // X.InterfaceC88472Yns
    public final C186157Sh invoke(C186157Sh c186157Sh) {
        C43I<TopicReview> c43i;
        C186157Sh setState = c186157Sh;
        o.LJIIIZ(setState, "$this$setState");
        float f = this.LJLIL;
        long j = this.LJLILLLLZI;
        long j2 = this.LJLJI;
        boolean z = this.LJLJJI;
        if (z) {
            c43i = setState.LJLJJLL;
        } else {
            c43i = new C43I<>(null);
        }
        return C186157Sh.L(setState, f, j, j2, false, z, c43i, 8);
    }
}
