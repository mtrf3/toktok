package X;

import android.app.Activity;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.KQk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51690KQk implements IEvent {
    public final Activity LJLIL;
    public final float LJLILLLLZI;

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

    public C51690KQk(Activity activity, float f) {
        this.LJLIL = activity;
        this.LJLILLLLZI = f;
    }
}
