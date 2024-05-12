package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.Li0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54984Li0 implements IEvent {
    public final String LJLIL;
    public final int LJLILLLLZI;
    public final Boolean LJLJI;
    public final int LJLJJI;
    public final String LJLJJL;

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

    public C54984Li0(String str, int i, Boolean bool, int i2, String content) {
        o.LJIIIZ(content, "content");
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = bool;
        this.LJLJJI = i2;
        this.LJLJJL = content;
    }
}
