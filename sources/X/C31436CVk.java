package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.CVk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31436CVk extends AbstractC31440CVo<CRD> {
    public final TextView LJLIL;

    public C31436CVk(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.dtp);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.gift_message_content)");
        this.LJLIL = (TextView) findViewById;
    }

    public final void L(CRD message) {
        CharSequence content;
        o.LJIIIZ(message, "message");
        if (!(message instanceof CQO) || (content = message.getContent()) == null) {
            return;
        }
        this.LJLIL.setText(content);
        if (message instanceof C31290CPu) {
            ((C31290CPu) message).LJIJJ(new C31403CUd(this.LJLIL, content));
        }
    }

    public C31436CVk(ViewGroup viewGroup) {
        this(C1DI.LIZ(viewGroup, "parent", R.layout.d7i, viewGroup, false, "from(parent.context).inf…(layoutId, parent, false)"));
    }
}
