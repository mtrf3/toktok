package X;

import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.45J, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C45J extends AbstractC1041546x {
    public static final /* synthetic */ int LLIIIZ = 0;
    public final TextView LLIIIILZ;
    public final TextView LLIIIJ;
    public final View LLIIIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45J(View itemView, EnumC110124Tw type) {
        super(itemView, type);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(type, "type");
        View findViewById = itemView.findViewById(R.id.mu7);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.unread_message_tips)");
        this.LLIIIILZ = (TextView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.gnt);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.msg_time_tv)");
        this.LLIIIJ = (TextView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.fjr);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.layout_msg_time)");
        this.LLIIIL = findViewById3;
    }

    @Override // X.AbstractC1041546x
    public final void P(C109544Rq msg, C109544Rq c109544Rq, C109544Rq c109544Rq2, int i) {
        o.LJIIIZ(msg, "msg");
        super.P(msg, c109544Rq, c109544Rq2, i);
        String localExtValue = msg.getLocalExtValue("formatted-timestamp");
        int i2 = 0;
        if ((localExtValue == null || localExtValue.length() == 0) && 1 != 0) {
            this.LLIIIJ.setVisibility(8);
        } else {
            this.LLIIIJ.setText(localExtValue);
            this.LLIIIJ.setVisibility(0);
        }
        Integer LIZIZ = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.gs);
        if (LIZIZ != null) {
            this.LLIIIILZ.setTextColor(LIZIZ.intValue());
        }
        TextView textView = this.LLIIIILZ;
        textView.setPadding(textView.getPaddingLeft(), this.LLIIIILZ.getPaddingTop(), this.LLIIIILZ.getPaddingRight(), this.LJLJI * 2);
        TextView textView2 = this.LLIIIILZ;
        if (!C1DJ.LJIL(msg)) {
            i2 = 8;
        }
        textView2.setVisibility(i2);
        if (this.LLIIIILZ.getVisibility() == 0) {
            int dimensionPixelOffset = this.itemView.getContext().getResources().getDimensionPixelOffset(R.dimen.tr);
            TextView textView3 = this.LLIIIJ;
            textView3.setPadding(textView3.getPaddingLeft(), (int) (dimensionPixelOffset * 2.5d), this.LLIIIJ.getPaddingRight(), this.LLIIIJ.getPaddingBottom());
        }
    }
}
