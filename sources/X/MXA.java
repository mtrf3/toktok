package X;

import Y.AObserverS77S0100000_9;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.notification.UserListActivity;
import com.ss.android.ugc.aweme.notification.bean.DiggInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MXA extends AbstractC112744be {
    public final UserListActivity LJLJI;
    public final /* synthetic */ UserListActivity LJLJJI;

    @Override // X.AbstractC029609s
    public final void LIZJ() {
        List<DiggInfo> data = this.LJLJJI.LLFZ().getData();
        if (data == null) {
            return;
        }
        int size = data.size();
        for (int i = 0; i < size; i++) {
            User user = ((DiggInfo) ListProtector.get(data, i)).user;
            if (user == null) {
                return;
            }
            if (!(user instanceof MXE) && user.getFollowStatus() == 2) {
                String uid = user.getUid();
                o.LJIIIIZZ(uid, "user.uid");
                C7ZR.LIZ(this, uid, new AObserverS77S0100000_9(this.LJLJJI, 128));
            }
        }
    }

    @Override // X.C7ZQ
    public final LifecycleOwner getLifecycleOwner() {
        return this.LJLJI;
    }

    public MXA(UserListActivity userListActivity) {
        this.LJLJJI = userListActivity;
        this.LJLJI = userListActivity;
    }
}
