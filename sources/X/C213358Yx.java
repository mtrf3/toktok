package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.8Yx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C213358Yx extends F9E implements IEvent {
    public final String LJLIL;
    public final int LJLILLLLZI;
    public final boolean LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI)};
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

    public C213358Yx(String musicId, int i, boolean z) {
        o.LJIIIZ(musicId, "musicId");
        this.LJLIL = musicId;
        this.LJLILLLLZI = i;
        this.LJLJI = z;
    }
}
