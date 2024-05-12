package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.CVm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31438CVm extends AbstractC31440CVo<CQJ> {
    public final TextView LJLIL;
    public final TextView LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31438CVm(ViewGroup parent) {
        super(R.layout.d7f, parent);
        o.LJIIIZ(parent, "parent");
        View findViewById = this.itemView.findViewById(R.id.b9x);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.chat_message_content)");
        this.LJLIL = (TextView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.mzt);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.user_name)");
        this.LJLILLLLZI = (TextView) findViewById2;
    }
}
