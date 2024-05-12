package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.LoZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55391LoZ implements IEvent {
    public final Aweme LJLIL;
    public final String LJLILLLLZI;
    public final int LJLJI;
    public final IDR LJLJJI;

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

    public C55391LoZ(Aweme aweme, String str, int i, IDR mBaseListFragmentPanel) {
        o.LJIIIZ(mBaseListFragmentPanel, "mBaseListFragmentPanel");
        this.LJLIL = aweme;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
        this.LJLJJI = mBaseListFragmentPanel;
    }
}
