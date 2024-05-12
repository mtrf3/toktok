package X;

import com.ss.android.ugc.aweme.commercialize.live.business.links.model.BusinessLinksLiveLinkCard;
import com.ss.android.ugc.aweme.commercialize.live.business.links.model.BusinessLinksLiveLinkPin;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.NTo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59416NTo implements IEvent {
    public final BusinessLinksLiveLinkPin LJLIL;
    public final BusinessLinksLiveLinkCard LJLILLLLZI;

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

    public C59416NTo(BusinessLinksLiveLinkPin businessLinksLiveLinkPin, BusinessLinksLiveLinkCard businessLinksLiveLinkCard) {
        this.LJLIL = businessLinksLiveLinkPin;
        this.LJLILLLLZI = businessLinksLiveLinkCard;
    }
}
