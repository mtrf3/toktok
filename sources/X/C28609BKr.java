package X;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.BKr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28609BKr implements BMR {
    public final /* synthetic */ C28608BKq LIZ;

    @Override // X.BMR
    public final void onFail() {
        this.LIZ.LJLJI = false;
    }

    public C28609BKr(C28608BKq c28608BKq) {
        this.LIZ = c28608BKq;
    }

    @Override // X.BMR
    public final void onSuccess(List<EnterRoomConfig> list) {
        C28608BKq c28608BKq = this.LIZ;
        c28608BKq.LJLJI = false;
        ((ArrayList) c28608BKq.LJLJJI).addAll(list);
        this.LIZ.LJIIJJI();
    }
}
