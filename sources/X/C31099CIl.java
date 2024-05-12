package X;

import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.CIl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31099CIl extends F9E {
    public final ISendCommentEvent LJLIL;
    public final boolean LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI)};
    }

    public C31099CIl(ISendCommentEvent subject, boolean z) {
        o.LJIIIZ(subject, "subject");
        this.LJLIL = subject;
        this.LJLILLLLZI = z;
    }
}
