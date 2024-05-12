package X;

import Y.ACallableS81S0200000_3;
import com.ss.android.ugc.aweme.comment.model.BaseCommentResponse;

/* renamed from: X.6wB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176436wB extends AbstractC176586wQ<BaseCommentResponse> {
    public String LJLJI = "";
    public C174126sS LJLJJI;
    public int LJLJJL;

    @Override // X.C8BS
    public final boolean checkParams(Object... objArr) {
        if (objArr != null && objArr.length >= 2) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC176586wQ, X.C8BS
    public final boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        FGR.LIZIZ().LIZ(this.mHandler, new ACallableS81S0200000_3(this, objArr, 2), 0);
        return true;
    }

    @Override // X.AbstractC176586wQ
    public final /* bridge */ /* synthetic */ void LJIIIZ(BaseCommentResponse baseCommentResponse) {
    }
}
