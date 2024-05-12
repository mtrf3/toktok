package X;

import com.bytedance.android.livesdk.game.model.PartnershipGameEvent;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Byi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30540Byi extends F9E {
    public final boolean LJLIL;
    public final List<PartnershipGameEvent> LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), this.LJLILLLLZI};
    }

    public C30540Byi(List eventList) {
        o.LJIIIZ(eventList, "eventList");
        this.LJLIL = true;
        this.LJLILLLLZI = eventList;
    }
}
