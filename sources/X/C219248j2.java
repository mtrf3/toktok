package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.8j2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219248j2 extends F9E implements IEvent {
    public final AddYoursTopic LJLIL;
    public final EnumC219268j4 LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
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

    public C219248j2(AddYoursTopic topic, EnumC219268j4 source) {
        o.LJIIIZ(topic, "topic");
        o.LJIIIZ(source, "source");
        this.LJLIL = topic;
        this.LJLILLLLZI = source;
    }
}
