package X;

import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.JnN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50221JnN extends F9E implements IEvent {
    public final SearchResultParam LJLIL;

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

    public C50221JnN(SearchResultParam searchResultParam) {
        this.LJLIL = searchResultParam;
    }
}
