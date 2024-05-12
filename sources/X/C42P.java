package X;

import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemContent;
import com.ss.android.ugc.governance.eventbus.IEvent;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.42P, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C42P implements IEvent {
    public final SystemContent LJLIL;
    public final String LJLILLLLZI;
    public final int LJLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42P)) {
            return false;
        }
        C42P c42p = (C42P) obj;
        return o.LJ(this.LJLIL, c42p.LJLIL) && o.LJ(this.LJLILLLLZI, c42p.LJLILLLLZI) && this.LJLJI == c42p.LJLJI;
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        String str = this.LJLILLLLZI;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LJLJI;
    }

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

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShowChatTopTipEvent(content=");
        LIZ.append(this.LJLIL);
        LIZ.append(", conversationId=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", messageType=");
        return b0.LIZJ(LIZ, this.LJLJI, ')', LIZ);
    }

    public C42P(SystemContent content, String str) {
        o.LJIIIZ(content, "content");
        this.LJLIL = content;
        this.LJLILLLLZI = str;
        this.LJLJI = 1022;
    }
}
