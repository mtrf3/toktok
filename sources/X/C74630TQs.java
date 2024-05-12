package X;

import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TQs, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74630TQs extends F9E {
    public final int LJLIL;
    public final List<UserState> LJLILLLLZI;
    public final boolean LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), this.LJLILLLLZI, Boolean.valueOf(this.LJLJI)};
    }

    public C74630TQs(List userMediaList, int i, int i2) {
        i = (i2 & 1) != 0 ? 3 : i;
        o.LJIIIZ(userMediaList, "userMediaList");
        this.LJLIL = i;
        this.LJLILLLLZI = userMediaList;
        this.LJLJI = false;
    }
}
