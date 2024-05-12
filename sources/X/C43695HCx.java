package X;

import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.HCx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43695HCx extends F9E implements IEvent {
    public final PoiData LJLIL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

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

    public C43695HCx(PoiData poiData) {
        this.LJLIL = poiData;
    }
}
