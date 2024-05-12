package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.2Mr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57292Mr extends F9E implements IEvent {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final int LJLJI;
    public final boolean LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Integer.valueOf(this.LJLJI), Boolean.valueOf(this.LJLJJI)};
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

    public C57292Mr(String id, String fullClipId, int i, boolean z) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(fullClipId, "fullClipId");
        this.LJLIL = id;
        this.LJLILLLLZI = fullClipId;
        this.LJLJI = i;
        this.LJLJJI = z;
    }
}
