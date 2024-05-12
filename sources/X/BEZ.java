package X;

import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.usermanage.model.Operation;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes6.dex */
public final class BEZ extends BEY {
    public final Context LJLJJI;
    public final List<User> LJLJJL = new ArrayList();
    public java.util.Map<Long, Operation> LJLJJLL = new HashMap();
    public BER LJLJL;
    public final String LJLJLJ;
    public final long LJLJLLL;
    public final long LJLL;

    @Override // X.AbstractC28438BEc
    public final int getBasicItemCount() {
        return ((ArrayList) this.LJLJJL).size();
    }

    public final void LJLLLLLL(long j) {
        for (int size = ((ArrayList) this.LJLJJL).size() - 1; size >= 0; size--) {
            User user = (User) ListProtector.get(this.LJLJJL, size);
            if (user != null && user.getId() == j) {
                ListProtector.remove(this.LJLJJL, size);
                notifyDataSetChanged();
                return;
            }
        }
    }

    public BEZ(long j, long j2, Context context, String str) {
        this.LJLJJI = context;
        this.LJLJLJ = str;
        this.LJLJLLL = j;
        this.LJLL = j2;
    }
}
