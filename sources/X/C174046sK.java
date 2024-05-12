package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.6sK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174046sK implements IEvent {
    public final int LJLIL;
    public final Object LJLILLLLZI;
    public Aweme LJLJI;
    public Integer LJLJJI;
    public boolean LJLJJL;

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

    public final void LIZ(int i) {
        this.LJLJJI = Integer.valueOf(i);
    }

    public C174046sK(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
