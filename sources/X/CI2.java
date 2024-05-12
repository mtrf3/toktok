package X;

import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CI2 extends CI0 {
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final boolean LJIIL;
    public final int LJIILIIL;
    public final ISendCommentEvent.Sender LJIILJJIL;
    public final java.util.Map<String, Object> LJIILL;
    public final CIZ LJIILLIIL;

    @Override // X.CI0
    public final java.util.Map<String, Object> LIZ() {
        return this.LJIILL;
    }

    @Override // X.CI0
    public final String LIZIZ() {
        return this.LJIIJ;
    }

    @Override // X.CI0
    public final CIZ LIZJ() {
        return this.LJIILLIIL;
    }

    @Override // X.CI0
    public final int LIZLLL() {
        return this.LJIILIIL;
    }

    @Override // X.CI0
    public final boolean LJ() {
        return this.LJIIL;
    }

    @Override // X.CI0
    public final ISendCommentEvent.Sender LJFF() {
        return this.LJIILJJIL;
    }

    @Override // X.CI0
    public final String LJI() {
        return this.LJIIJJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CI2(String str, String content, String str2, boolean z, int i, ISendCommentEvent.Sender sender, java.util.Map<String, ? extends Object> args, CIZ ciz) {
        super(content, str2, z, i, sender, args);
        o.LJIIIZ(content, "content");
        o.LJIIIZ(sender, "sender");
        o.LJIIIZ(args, "args");
        this.LJIIIZ = str;
        this.LJIIJ = content;
        this.LJIIJJI = str2;
        this.LJIIL = z;
        this.LJIILIIL = i;
        this.LJIILJJIL = sender;
        this.LJIILL = args;
        this.LJIILLIIL = ciz;
    }
}
