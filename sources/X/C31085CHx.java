package X;

import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.CHx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31085CHx implements ISendCommentEvent {
    public final String LIZ;
    public final ISendCommentEvent.Sender LIZIZ;
    public final java.util.Map<String, Object> LIZJ;

    public final int hashCode() {
        return this.LIZJ.hashCode() + ((this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SendBarrageEvent(content=");
        LIZ.append(this.LIZ);
        LIZ.append(", sender=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", args=");
        return C15890jp.LIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31085CHx)) {
            return false;
        }
        C31085CHx c31085CHx = (C31085CHx) obj;
        if (o.LJ(this.LIZ, c31085CHx.LIZ) && this.LIZIZ == c31085CHx.LIZIZ && o.LJ(this.LIZJ, c31085CHx.LIZJ)) {
            return true;
        }
        return false;
    }

    public C31085CHx(String content, ISendCommentEvent.Sender sender, java.util.Map<String, ? extends Object> map) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(sender, "sender");
        this.LIZ = content;
        this.LIZIZ = sender;
        this.LIZJ = map;
    }
}
