package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.39R, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C39R implements IEvent {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final IMUser LJLJI;

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

    public C39R(String str, String str2, IMUser user) {
        o.LJIIIZ(user, "user");
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = user;
    }
}
