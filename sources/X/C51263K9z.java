package X;

import Y.ACallableS57S0300000_8;
import android.os.Message;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.ecommerce.search.sug.repo.EcSearchSugResponse;
import java.util.LinkedList;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;

/* renamed from: X.K9z, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51263K9z extends C8BS<EcSearchSugResponse> {
    public final /* synthetic */ ActivityC45651qj LJLIL;
    public final /* synthetic */ C51252K9o LJLILLLLZI;

    @Override // X.C8BS
    public final boolean checkParams(Object... objArr) {
        String str;
        if (objArr == null || objArr.length == 0) {
            return false;
        }
        Object obj = objArr[0];
        if (obj instanceof C51259K9v) {
            str = ((C51259K9v) obj).LIZ;
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
        if (obj instanceof EcSearchSugResponse) {
            EcSearchSugResponse ecSearchSugResponse = (EcSearchSugResponse) obj;
            KBZ kbz = ecSearchSugResponse.LJLJJI;
            if (kbz == null || kbz.LIZJ) {
                return;
            }
            while (!this.LJLILLLLZI.LJLJL.isEmpty()) {
                KBZ kbz2 = (KBZ) ((LinkedList) this.LJLILLLLZI.LJLJL).pollFirst();
                long j = kbz2.LIZ;
                long j2 = kbz.LIZ;
                if (j < j2) {
                    kbz2.LIZJ = true;
                    C76L<EcSearchSugResponse> c76l = kbz2.LIZIZ;
                    if (c76l != null) {
                        c76l.cancel(true);
                    }
                } else if (j == j2) {
                    ecSearchSugResponse.LJLJJI = null;
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
        if (C51307KBr.LIZ.isEmpty()) {
            String valueOf = String.valueOf(System.currentTimeMillis());
            o.LJIIIZ(valueOf, "<set-?>");
            C51307KBr.LIZ = valueOf;
        }
        this.mIsLoading = false;
        C51252K9o c51252K9o = this.LJLILLLLZI;
        c51252K9o.getClass();
        long j = c51252K9o.LJLJJL + 1;
        c51252K9o.LJLJJL = j;
        KBZ kbz = new KBZ();
        kbz.LIZ = j;
        ((LinkedList) this.LJLILLLLZI.LJLJL).addLast(kbz);
        FGR.LIZIZ().LIZ(this.mHandler, new ACallableS57S0300000_8(objArr, kbz, this, 5), 0);
        return true;
    }

    public C51263K9z(C51252K9o c51252K9o, ActivityC45651qj activityC45651qj) {
        this.LJLILLLLZI = c51252K9o;
        this.LJLIL = activityC45651qj;
    }
}
