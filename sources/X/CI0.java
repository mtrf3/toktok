package X;

import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class CI0 implements ISendCommentEvent {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final ISendCommentEvent.Sender LJ;
    public final java.util.Map<String, Object> LJFF;
    public final String LJI;
    public final C1FC LJII;
    public final CIZ LJIIIIZZ;

    public java.util.Map<String, Object> LIZ() {
        return this.LJFF;
    }

    public String LIZIZ() {
        return this.LIZ;
    }

    public CIZ LIZJ() {
        return this.LJIIIIZZ;
    }

    public int LIZLLL() {
        return this.LIZLLL;
    }

    public boolean LJ() {
        return this.LIZJ;
    }

    public ISendCommentEvent.Sender LJFF() {
        return this.LJ;
    }

    public String LJI() {
        return this.LIZIZ;
    }

    public /* synthetic */ CI0(String str, String str2, boolean z, int i, ISendCommentEvent.Sender sender, java.util.Map map) {
        this(str, str2, z, i, sender, map, null, null, null);
    }

    public CI0(String content, String str, boolean z, int i, ISendCommentEvent.Sender sender, java.util.Map<String, ? extends Object> args, String str2, C1FC c1fc, CIZ ciz) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(sender, "sender");
        o.LJIIIZ(args, "args");
        this.LIZ = content;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = i;
        this.LJ = sender;
        this.LJFF = args;
        this.LJI = str2;
        this.LJII = c1fc;
        this.LJIIIIZZ = ciz;
    }
}
