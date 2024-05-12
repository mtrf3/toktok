package X;

import android.os.Message;
import com.ss.android.ugc.aweme.challenge.model.SearchSugChallengeList;
import kotlin.jvm.internal.o;

/* renamed from: X.Gxq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43226Gxq extends C8BS<SearchSugChallengeList> {
    public int LJLIL;
    public CallableC43227Gxr LJLILLLLZI;

    @Override // X.C8BS
    public final boolean checkParams(Object... params) {
        o.LJIIIZ(params, "params");
        if (params.length == 2) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C8BS
    public final void handleData(SearchSugChallengeList searchSugChallengeList) {
        if (searchSugChallengeList == 0) {
            return;
        }
        this.mData = searchSugChallengeList;
    }

    @Override // X.C8BS, com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message msg) {
        o.LJIIIZ(msg, "msg");
        int i = msg.what;
        if (i != this.LJLIL) {
            this.mHandler.removeMessages(i);
            return;
        }
        Object obj = msg.obj;
        if (obj instanceof Exception) {
            o.LJII(obj, "null cannot be cast to non-null type java.lang.Exception{ kotlin.TypeAliasesKt.Exception }");
            Throwable th = (Throwable) obj;
            if (th.getMessage() != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("challenge search failed, message:");
                LIZ.append(th.getMessage());
                H7B.LIZJ(X1D.LIZIZ(LIZ));
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("challenge search failed, stack trace:");
            LIZ2.append(android.util.Log.getStackTraceString(th));
            H7B.LIZJ(X1D.LIZIZ(LIZ2));
        }
        if (!(msg.obj instanceof C43228Gxs)) {
            super.handleMsg(msg);
        }
    }

    @Override // X.C8BS
    public final boolean sendRequest(Object... params) {
        o.LJIIIZ(params, "params");
        if (AV1.LJIIJJI() || !super.sendRequest(params[0], params[1])) {
            return false;
        }
        this.LJLIL = (this.LJLIL + 1) % 10;
        CallableC43227Gxr callableC43227Gxr = this.LJLILLLLZI;
        if (callableC43227Gxr != null) {
            callableC43227Gxr.LJLJJL = true;
        }
        this.LJLILLLLZI = new CallableC43227Gxr(this, params);
        FGR.LIZIZ().LIZ(this.mHandler, this.LJLILLLLZI, this.LJLIL);
        return true;
    }
}
