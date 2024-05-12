package X;

import com.bytedance.android.livesdk.qa.QuestionEx;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BUv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28873BUv extends AbstractC65781Prl implements InterfaceC88472Yns<List<QuestionEx>, C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<List<QuestionEx>, C76800UCe> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C28873BUv(int i, int i2, InterfaceC88472Yns<? super List<QuestionEx>, C76800UCe> interfaceC88472Yns) {
        super(1);
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = interfaceC88472Yns;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(List<QuestionEx> it) {
        o.LJIIIZ(it, "it");
        C28874BUw.LIZIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI);
        return C76800UCe.LIZ;
    }
}
