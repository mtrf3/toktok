package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.compliance.business.hideaccount.HiddenItem;
import com.ss.android.ugc.aweme.compliance.business.hideaccount.HiddenUser;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.A1g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25556A1g extends AbstractC03120Ai {
    public final List<HiddenItem> LIZ;
    public final List<HiddenItem> LIZIZ;

    @Override // X.AbstractC03120Ai
    public final int LIZLLL() {
        return this.LIZIZ.size();
    }

    @Override // X.AbstractC03120Ai
    public final int LJ() {
        return this.LIZ.size();
    }

    public C25556A1g(List<HiddenItem> oldList, List<HiddenItem> newList) {
        o.LJIIIZ(oldList, "oldList");
        o.LJIIIZ(newList, "newList");
        this.LIZ = oldList;
        this.LIZIZ = newList;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZ(int i, int i2) {
        return o.LJ(ListProtector.get(this.LIZ, i), ListProtector.get(this.LIZIZ, i2));
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZIZ(int i, int i2) {
        String str;
        HiddenUser user = ((HiddenItem) ListProtector.get(this.LIZ, i)).getUser();
        String str2 = null;
        if (user != null) {
            str = user.getUserId();
        } else {
            str = null;
        }
        HiddenUser user2 = ((HiddenItem) ListProtector.get(this.LIZIZ, i2)).getUser();
        if (user2 != null) {
            str2 = user2.getUserId();
        }
        return o.LJ(str, str2);
    }
}
