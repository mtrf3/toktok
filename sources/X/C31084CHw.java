package X;

import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CHw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31084CHw implements ISendCommentEvent {
    public final List<EmoteModel> LIZ;
    public final ISendCommentEvent.Sender LIZIZ;
    public final java.util.Map<String, Object> LIZJ;

    public final int hashCode() {
        return this.LIZJ.hashCode() + ((this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SendEmoteEvent(emotes=");
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
        if (!(obj instanceof C31084CHw)) {
            return false;
        }
        C31084CHw c31084CHw = (C31084CHw) obj;
        if (o.LJ(this.LIZ, c31084CHw.LIZ) && this.LIZIZ == c31084CHw.LIZIZ && o.LJ(this.LIZJ, c31084CHw.LIZJ)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C31084CHw(List<? extends EmoteModel> list, ISendCommentEvent.Sender sender, java.util.Map<String, ? extends Object> args) {
        o.LJIIIZ(sender, "sender");
        o.LJIIIZ(args, "args");
        this.LIZ = list;
        this.LIZIZ = sender;
        this.LIZJ = args;
    }
}
