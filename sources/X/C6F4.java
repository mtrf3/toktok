package X;

import com.ss.android.ugc.aweme.shoutouts.MoneyDes;
import com.ss.android.ugc.aweme.shoutouts.ShoutoutPrice;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.6F4, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6F4 implements IEvent {
    public final String LJLIL;
    public final ShoutoutPrice LJLILLLLZI;
    public final MoneyDes LJLJI;

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

    public C6F4(String str, ShoutoutPrice shoutoutPrice, MoneyDes moneyDes) {
        this.LJLIL = str;
        this.LJLILLLLZI = shoutoutPrice;
        this.LJLJI = moneyDes;
    }
}
