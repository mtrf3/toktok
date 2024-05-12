package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.Ruk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71062Ruk implements IEvent {
    public static final /* synthetic */ int LJLJJL = 0;
    public final int LJLIL;
    public final Integer LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;

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

    public /* synthetic */ C71062Ruk(String str, int i, String str2, String str3) {
        this(i, str, str2, str3, null);
    }

    public C71062Ruk(int i, String str, String str2, String str3, Integer num) {
        this.LJLIL = i;
        this.LJLILLLLZI = num;
        this.LJLJI = str2;
        this.LJLJJI = str3;
    }
}
