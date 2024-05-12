package X;

import com.ss.android.ugc.aweme.shoutouts.MoneyDes;
import com.ss.android.ugc.aweme.shoutouts.ShoutoutPrice;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.6bZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163656bZ implements IEvent {
    public final ShoutoutPrice LJLIL;
    public final MoneyDes LJLILLLLZI;

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

    public C163656bZ(ShoutoutPrice shoutoutPrice, MoneyDes moneyDes) {
        this.LJLIL = shoutoutPrice;
        this.LJLILLLLZI = moneyDes;
    }
}
