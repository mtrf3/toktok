package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.o;

/* renamed from: X.3Ia, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81563Ia extends C43001GuD {
    public final java.util.Map<String, IMUser> LJLJJL;
    public final java.util.Set<String> LJLJJLL;

    @Override // X.C43001GuD
    public final IMUser LJIIJ(C109544Rq c109544Rq) {
        String valueOf = String.valueOf(c109544Rq.getSender());
        String secSender = c109544Rq.getSecSender();
        IMUser iMUser = this.LJLJJL.get(valueOf);
        if (iMUser == null && (iMUser = C80533Eb.LJFF(valueOf, secSender)) == null) {
            this.LJLJJLL.add(valueOf);
        }
        return iMUser;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C81563Ia(java.util.Map<String, ? extends IMUser> map, java.util.Set<String> missedUserIdSet) {
        o.LJIIIZ(missedUserIdSet, "missedUserIdSet");
        this.LJLJJL = map;
        this.LJLJJLL = missedUserIdSet;
    }

    @Override // X.C43001GuD
    public final IMUser LJIIJJI(String str, String str2) {
        IMUser iMUser = this.LJLJJL.get(str);
        if (iMUser == null && (iMUser = C80533Eb.LJFF(str, str2)) == null) {
            this.LJLJJLL.add(str);
        }
        return iMUser;
    }
}
