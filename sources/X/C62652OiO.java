package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* renamed from: X.OiO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62652OiO extends C62648OiK {
    @Override // X.C62648OiK
    public int getLayoutResId() {
        return R.layout.cly;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62652OiO(Context context) {
        super(context);
        a1.LJFF(context, "ctx");
    }

    @Override // X.C62648OiK
    public final void LJIIJJI(View view) {
        TextView textView;
        if (!C53316KwC.LIZ() || (textView = (TextView) view.findViewById(R.id.jv6)) == null) {
            return;
        }
        textView.setMaxLines(1);
    }

    @Override // X.C62648OiK
    public final void LJIILIIL(int i) {
        TextView textView;
        String string;
        if (C53316KwC.LIZ() && (textView = (TextView) getRootView().findViewById(R.id.jsy)) != null) {
            if (i == this.LJLJJL.getId()) {
                string = textView.getContext().getString(R.string.rdk);
            } else if (i == this.LJLJJLL.getId()) {
                string = "Line";
            } else if (i == this.LJLJL.getId()) {
                string = "Messenger";
            } else {
                string = textView.getContext().getString(R.string.rdj);
            }
            textView.setText(string);
            textView.setVisibility(0);
        }
    }

    @Override // X.C62648OiK
    public void setSilentShareChannelDrawable(Context context) {
        this.LJLLILLLL = 36;
        this.LJLLJ = 22;
        super.setSilentShareChannelDrawable(context);
    }
}
