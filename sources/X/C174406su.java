package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.6su, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174406su extends F9E implements IEvent {
    public final EnumC177756yJ LJLIL;

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

    public C174406su(EnumC177756yJ type) {
        o.LJIIIZ(type, "type");
        this.LJLIL = type;
    }
}
