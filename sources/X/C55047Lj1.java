package X;

import android.content.Context;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.Lj1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55047Lj1 implements IEvent {
    public final boolean LJLIL;
    public final int LJLILLLLZI;

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

    public C55047Lj1(Context context, boolean z) {
        int i;
        this.LJLIL = z;
        if (context != null) {
            i = context.hashCode();
        } else {
            i = 0;
        }
        this.LJLILLLLZI = i;
    }
}
