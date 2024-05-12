package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.Liz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55045Liz implements IEvent {
    public final Aweme LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;

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

    public C55045Liz(Aweme aweme, String str) {
        this(str, aweme, "FUNCTION_FROM_DEFAULT");
    }

    public C55045Liz(String str, Aweme aweme, String str2) {
        this.LJLIL = aweme;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }
}
