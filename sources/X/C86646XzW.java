package X;

import com.ss.android.ugc.aweme.creatorcaption.FeedCaptionView;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.XzW, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86646XzW implements IEvent {
    public final boolean LJLIL;
    public final FeedCaptionView LJLILLLLZI;

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

    public C86646XzW(boolean z, FeedCaptionView captionView) {
        o.LJIIIZ(captionView, "captionView");
        this.LJLIL = z;
        this.LJLILLLLZI = captionView;
    }
}
