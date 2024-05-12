package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.HashMap;

/* renamed from: X.LQx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54251LQx implements IEvent {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public int LJLJI;
    public final HashMap<Integer, Integer> LJLJJI;

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C2U8.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C2U8.LIZIZ(this);
        return this;
    }

    public C54251LQx() {
    }

    public C54251LQx(int i) {
        this.LJLIL = i;
    }

    public final boolean LIZ(int i) {
        HashMap<Integer, Integer> hashMap = this.LJLJJI;
        if ((hashMap == null || hashMap.size() <= 0 || !this.LJLJJI.containsKey(Integer.valueOf(i))) && this.LJLIL != i) {
            return false;
        }
        return true;
    }

    public C54251LQx(HashMap<Integer, Integer> hashMap) {
        this.LJLJJI = hashMap;
    }

    public C54251LQx(int i, int i2) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }
}
