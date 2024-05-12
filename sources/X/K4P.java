package X;

import Y.ACallableS57S0300000_8;
import android.os.Message;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.MiddleForSearchFromEC;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse;
import java.util.LinkedList;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K4P extends C8BS<SearchSugResponse> {
    public final /* synthetic */ ActivityC45651qj LJLIL;
    public final /* synthetic */ InterfaceC55235Lm3 LJLILLLLZI;
    public final /* synthetic */ K4Q LJLJI;

    @Override // X.C8BS
    public final boolean checkParams(Object... objArr) {
        String str;
        if (objArr == null || objArr.length == 0) {
            return false;
        }
        Object obj = objArr[0];
        if (obj instanceof K4R) {
            str = ((K4R) obj).LIZ;
        } else {
            str = "";
        }
        return !TextUtils.isEmpty(str);
    }

    @Override // X.C8BS, com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        Object obj = message.obj;
        if (obj instanceof CancellationException) {
            return;
        }
        if (obj instanceof SearchSugResponse) {
            SearchSugResponse searchSugResponse = (SearchSugResponse) obj;
            K4T k4t = searchSugResponse.LJLJI;
            if (k4t == null || k4t.LIZJ) {
                return;
            }
            while (!this.LJLJI.LJLJL.isEmpty()) {
                K4T k4t2 = (K4T) ((LinkedList) this.LJLJI.LJLJL).pollFirst();
                long j = k4t2.LIZ;
                long j2 = k4t.LIZ;
                if (j < j2) {
                    k4t2.LIZJ = true;
                    C76L<SearchSugResponse> c76l = k4t2.LIZIZ;
                    if (c76l != null) {
                        c76l.cancel(true);
                    }
                } else if (j == j2) {
                    searchSugResponse.LJLJI = null;
                } else {
                    return;
                }
            }
            return;
        }
        super.handleMsg(message);
    }

    @Override // X.C8BS
    public final boolean sendRequest(Object... objArr) {
        if (AV1.LJIIJJI() || !super.sendRequest(objArr)) {
            return false;
        }
        if (K56.LIZ(this.LJLIL).isEmpty()) {
            ActivityC45651qj activityC45651qj = this.LJLIL;
            String id = String.valueOf(System.currentTimeMillis());
            o.LJIIIZ(id, "id");
            if (K56.LIZLLL(activityC45651qj)) {
                MiddleForSearchFromEC.LJIILIIL().LJI(id);
            } else {
                K56.LIZ = id;
            }
        }
        this.mIsLoading = false;
        K4Q k4q = this.LJLJI;
        k4q.getClass();
        long j = k4q.LJLJJL + 1;
        k4q.LJLJJL = j;
        K4T k4t = new K4T();
        k4t.LIZ = j;
        ((LinkedList) this.LJLJI.LJLJL).addLast(k4t);
        FGR.LIZIZ().LIZ(this.mHandler, new ACallableS57S0300000_8(objArr, k4t, this, 3), 0);
        return true;
    }

    public K4P(K4Q k4q, ActivityC45651qj activityC45651qj, InterfaceC55235Lm3 interfaceC55235Lm3) {
        this.LJLJI = k4q;
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = interfaceC55235Lm3;
    }
}
