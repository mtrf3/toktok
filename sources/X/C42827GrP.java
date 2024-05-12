package X;

import com.ss.android.ugc.aweme.challenge.model.SearchSugChallengeList;
import kotlin.jvm.internal.o;

/* renamed from: X.GrP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42827GrP extends C8BR<C43226Gxq, InterfaceC42828GrQ> {
    @Override // X.C8BR, X.InterfaceC223218pR
    public final void LJII() {
        K k = this.LJLILLLLZI;
        if (k != 0) {
            ((InterfaceC42828GrQ) k).LLIIZ();
        }
    }

    @Override // X.C8BR, X.C8BT
    public final void onSuccess() {
        T t;
        K k = this.LJLILLLLZI;
        if (k != 0 && (t = this.LJLIL) != 0) {
            Object data = t.getData();
            o.LJIIIIZZ(data, "mModel.data");
            ((InterfaceC42828GrQ) k).Tb((SearchSugChallengeList) data);
        }
    }

    @Override // X.C8BR, X.C8BT
    public final void onFailed(Exception exc) {
        K k = this.LJLILLLLZI;
        if (k != 0) {
            ((InterfaceC42828GrQ) k).LLJJI(exc);
        }
    }
}
