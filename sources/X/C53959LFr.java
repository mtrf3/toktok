package X;

import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import kotlin.jvm.internal.o;

/* renamed from: X.LFr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53959LFr extends AbstractC65781Prl implements InterfaceC88472Yns<TopTabProtocol, C76800UCe> {
    public static final C53959LFr LJLIL = new C53959LFr();

    public C53959LFr() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(TopTabProtocol topTabProtocol) {
        TopTabProtocol invoke = topTabProtocol;
        o.LJIIIZ(invoke, "$this$invoke");
        AbstractC53958LFq LIZIZ = invoke.LJFF().LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.onResume();
        }
        return C76800UCe.LIZ;
    }
}
