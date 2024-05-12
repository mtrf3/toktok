package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.Lig, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55026Lig implements IEvent {
    public final int LJLIL;
    public final Aweme LJLILLLLZI;
    public final IDR LJLJI;
    public final Boolean LJLJJI;

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

    public C55026Lig(int i, Aweme aweme, FullFeedFragmentPanel fullFeedFragmentPanel) {
        this(i, aweme, fullFeedFragmentPanel, Boolean.FALSE);
    }

    public C55026Lig(int i, Aweme aweme, FullFeedFragmentPanel fullFeedFragmentPanel, Boolean bool) {
        this.LJLIL = i;
        this.LJLILLLLZI = aweme;
        this.LJLJI = fullFeedFragmentPanel;
        this.LJLJJI = bool;
    }
}
