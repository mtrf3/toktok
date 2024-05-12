package X;

import Y.ACListenerS27S1200000_5;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.model.message.QuickChatContent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CJS extends CJT {
    public final TextView LJLIL;
    public final /* synthetic */ CJR LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJS(CJR cjr, View view) {
        super(view);
        this.LJLILLLLZI = cjr;
        View findViewById = view.findViewById(R.id.ikp);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.….quick_comment_text_view)");
        this.LJLIL = (TextView) findViewById;
    }

    @Override // X.CJT
    public final void L(CJT holder, int i) {
        String str;
        o.LJIIIZ(holder, "holder");
        if (!(holder instanceof CJS)) {
            return;
        }
        Object obj = ListProtector.get(this.LJLILLLLZI.LJLIL, i);
        o.LJIIIIZZ(obj, "quickCommentList[position]");
        QuickChatContent quickChatContent = (QuickChatContent) obj;
        CJW cjw = this.LJLILLLLZI.LJLILLLLZI;
        if (cjw != null) {
            str = cjw.LIZLLL;
        } else {
            str = null;
        }
        String str2 = quickChatContent.text;
        if (str2 == null) {
            return;
        }
        ((CJS) holder).LJLIL.setText(str2);
        C16880lQ.LJIIJ(new ACListenerS27S1200000_5(this.LJLILLLLZI.LJLJI, quickChatContent, str, 0), holder.itemView);
    }
}
