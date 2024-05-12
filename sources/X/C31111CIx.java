package X;

import emotes.model.SubEmoteDetailResult;
import kotlin.jvm.internal.o;

/* renamed from: X.CIx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31111CIx extends AbstractC65781Prl implements InterfaceC88472Yns<C28467BFf<SubEmoteDetailResult>, Boolean> {
    public static final C31111CIx LJLIL = new C31111CIx();

    public C31111CIx() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(C28467BFf<SubEmoteDetailResult> c28467BFf) {
        boolean z;
        C28467BFf<SubEmoteDetailResult> it = c28467BFf;
        o.LJIIIZ(it, "it");
        SubEmoteDetailResult subEmoteDetailResult = it.data;
        if (subEmoteDetailResult != null && subEmoteDetailResult.getStableEmoteDetail() != null && it.data.getStableEmoteDetail().getEmoteList() != null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
