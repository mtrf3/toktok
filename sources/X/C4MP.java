package X;

import Y.ACListenerS21S0100000_1;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SayHelloContent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4MP, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4MP {
    public final AnonymousClass465 LIZ;
    public final View LIZIZ;
    public final Context LIZJ;
    public C109544Rq LIZLLL;
    public SayHelloContent LJ;
    public String LJFF;
    public View LJI;
    public TextView LJII;
    public View LJIIIIZZ;
    public boolean LJIIIZ;

    public abstract void LIZJ(boolean z);

    public abstract List<Emoji> LJ();

    public void LIZIZ() {
        C109544Rq c109544Rq = this.LIZLLL;
        if (c109544Rq != null) {
            String LJFF = LJFF();
            String conversationId = c109544Rq.getConversationId();
            o.LJIIIIZZ(conversationId, "it.conversationId");
            C4MM.LIZIZ(LJFF, conversationId, LJ(), true, this.LJFF);
        }
        C109544Rq c109544Rq2 = this.LIZLLL;
        if (c109544Rq2 != null) {
            C31F.LIZ.getClass();
            C31G.LIZ();
            C63164Oqe.LJII(c109544Rq2, false, null);
        }
        if (this.LJIIIZ) {
            this.LIZ.dismiss();
        }
    }

    public final String LJFF() {
        String str;
        C109544Rq c109544Rq = this.LIZLLL;
        if (c109544Rq != null) {
            str = c109544Rq.getConversationId();
        } else {
            str = null;
        }
        return String.valueOf(C81273Gx.LIZLLL(str));
    }

    public void LJI() {
        this.LJII = (TextView) LIZLLL(R.id.jay);
        this.LJI = LIZLLL(R.id.bfv);
        View LIZLLL = LIZLLL(R.id.cdn);
        this.LJIIIIZZ = LIZLLL;
        LIZLLL.setVisibility(8);
        View view = this.LJI;
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 156), view);
        } else {
            o.LJIJI("closeIv");
            throw null;
        }
    }

    public C4MP(AnonymousClass465 parent) {
        o.LJIIIZ(parent, "parent");
        this.LIZ = parent;
        View view = parent.itemView;
        o.LJIIIIZZ(view, "parent.itemView");
        this.LIZIZ = view;
        Context context = view.getContext();
        o.LJI(context);
        this.LIZJ = context;
        LJI();
    }

    public final <T extends View> T LIZLLL(int i) {
        T t = (T) this.LIZIZ.findViewById(i);
        o.LJIIIIZZ(t, "itemView.findViewById(id)");
        return t;
    }

    public void LIZ(C109544Rq msg, C109544Rq c109544Rq, SayHelloContent content, int i, boolean z, String str) {
        int i2;
        String string;
        o.LJIIIZ(msg, "msg");
        o.LJIIIZ(content, "content");
        this.LIZLLL = msg;
        this.LJ = content;
        this.LJIIIZ = z;
        this.LJFF = str;
        if (msg.getLocalExt().get("is_logger") == null) {
            msg.addLocalExt("is_logger", "true");
            C109544Rq c109544Rq2 = this.LIZLLL;
            if (c109544Rq2 != null) {
                String LJFF = LJFF();
                String conversationId = c109544Rq2.getConversationId();
                o.LJIIIIZZ(conversationId, "it.conversationId");
                C4MM.LIZIZ(LJFF, conversationId, LJ(), false, str);
            }
            C106674Gp.LJIILJJIL(msg);
        }
        TextView textView = this.LJII;
        if (textView != null) {
            String str2 = content.helloText;
            if (str2 == null || str2.length() == 0) {
                if (C3U6.LIZ) {
                    i2 = R.string.q_o;
                } else {
                    i2 = R.string.gzq;
                }
                string = this.LIZJ.getString(i2, content.nickname);
            } else {
                string = content.helloText;
            }
            textView.setText(string);
            return;
        }
        o.LJIJI("sayHelloTv");
        throw null;
    }
}
