package X;

import com.ss.android.ugc.aweme.account.login.v2.network.CommitUserNameData;
import com.ss.android.ugc.aweme.account.login.v2.network.CommitUserNameResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.QvH, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68547QvH<T> implements InterfaceC64592gB {
    public static final C68547QvH<T> LJLIL = new C68547QvH<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        CommitUserNameData commitUserNameData;
        String str;
        CommitUserNameResponse commitUserNameResponse = (CommitUserNameResponse) obj;
        if (commitUserNameResponse != null && (commitUserNameData = commitUserNameResponse.data) != null && (str = commitUserNameData.login_name) != null) {
            HG3.LJIILL().getCurUser().setUniqueId(str);
            C68517Qun c68517Qun = C68517Qun.LIZ;
            String LIZLLL = R41.LIZLLL();
            o.LJIIIIZZ(LIZLLL, "getCurUserId()");
            c68517Qun.LJIJI(LIZLLL, str);
        }
    }
}
