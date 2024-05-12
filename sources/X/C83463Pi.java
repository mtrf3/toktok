package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3Pi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C83463Pi extends TBS implements InterfaceC88472Yns<IMUser, List<? extends C3QL>> {
    public C83463Pi(C3QE c3qe) {
        super(1, c3qe, C3QE.class, "convertIMUserIntoSearchContent", "convertIMUserIntoSearchContent(Lcom/ss/android/ugc/aweme/im/service/model/IMUser;)Ljava/util/List;", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final List<? extends C3QL> invoke(IMUser iMUser) {
        IMUser p0 = iMUser;
        o.LJIIIZ(p0, "p0");
        this.receiver.getClass();
        String uid = p0.getUid();
        o.LJIIIIZZ(uid, "user.uid");
        String nickName = p0.getNickName();
        o.LJIIIIZZ(nickName, "user.nickName");
        String uid2 = p0.getUid();
        o.LJIIIIZZ(uid2, "user.uid");
        String uniqueId = p0.getUniqueId();
        o.LJIIIIZZ(uniqueId, "user.uniqueId");
        return C47261Igj.LJJIJIIJI(new C3QL(0, 0L, uid, 0, C3QE.LIZLLL(nickName)), new C3QL(0, 0L, uid2, 1, C3QE.LIZLLL(uniqueId)));
    }
}
