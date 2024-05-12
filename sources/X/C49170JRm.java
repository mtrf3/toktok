package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.JRm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49170JRm implements IEvent {
    public final Integer LJLIL;
    public final Integer LJLILLLLZI;
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

    public C49170JRm(Integer num, Integer num2, String str) {
        this.LJLIL = num;
        this.LJLILLLLZI = num2;
        this.LJLJI = str;
    }
}
