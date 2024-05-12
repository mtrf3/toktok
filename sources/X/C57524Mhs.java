package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* renamed from: X.Mhs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C57524Mhs implements InterfaceC57532Mi0 {
    public final /* synthetic */ C57521Mhp LIZ;

    public C57524Mhs(C57521Mhp c57521Mhp) {
        this.LIZ = c57521Mhp;
    }

    public final void LIZ(User user, int i) {
        List<T> list = this.LIZ.mmItems;
        if (list == 0 || i < 0 || i >= list.size()) {
            return;
        }
        ListProtector.remove(list, i);
        this.LIZ.notifyItemRemoved(i);
        InterfaceC57527Mhv interfaceC57527Mhv = this.LIZ.LJLIL;
        if (interfaceC57527Mhv != null) {
            interfaceC57527Mhv.LIZJ(user);
            if (list.isEmpty()) {
                this.LIZ.LJLIL.LIZIZ();
            }
        }
        if (i != list.size()) {
            this.LIZ.notifyItemRangeChanged(i, list.size() - i);
        }
        if (!this.LIZ.mShowFooter) {
            return;
        }
        if (list.size() <= 10) {
            this.LIZ.setShowFooter(false);
        } else {
            this.LIZ.setShowFooter(true);
        }
    }
}
