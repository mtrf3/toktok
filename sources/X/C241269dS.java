package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.9dS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C241269dS implements IEvent {
    public final String LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;

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

    public C241269dS(String musicId, String awemeId, boolean z, boolean z2) {
        o.LJIIIZ(musicId, "musicId");
        o.LJIIIZ(awemeId, "awemeId");
        this.LJLIL = musicId;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
    }
}
