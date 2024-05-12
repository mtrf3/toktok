package X;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L93 extends FrameLayout {
    public View LJLIL;
    public HashMap LJLILLLLZI;

    public final View LIZ(int i) {
        if (this.LJLILLLLZI == null) {
            this.LJLILLLLZI = new HashMap();
        }
        View view = (View) this.LJLILLLLZI.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJLILLLLZI.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final View getTitlebarRootView() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L93(Context context) {
        super(context, null, 0);
        o.LJIIJ(context, "context");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.ut, this, true);
        o.LJFF(LLLLIILL, "LayoutInflater.from(cont…et_title_bar, this, true)");
        this.LJLIL = LLLLIILL;
    }

    public final void setBackListener(View.OnClickListener click) {
        o.LJIIJ(click, "click");
        LIZ(R.id.eys).setOnClickListener(new ViewOnClickListenerC13880ga(click));
    }

    public final void setCloseAllListener(View.OnClickListener click) {
        o.LJIIJ(click, "click");
        LIZ(R.id.f0i).setOnClickListener(new ViewOnClickListenerC13880ga(click));
    }

    public void setEnableReFresh(boolean z) {
        int i;
        View btn_refresh = LIZ(R.id.ayb);
        o.LJFF(btn_refresh, "btn_refresh");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        btn_refresh.setVisibility(i);
    }

    public void setRefreshListener(View.OnClickListener click) {
        o.LJIIJ(click, "click");
        C16880lQ.LJIILIIL((Button) LIZ(R.id.ayb), click);
    }

    public final void setTitleIfMissing(CharSequence title) {
        o.LJIIJ(title, "title");
        TextView tv_title = (TextView) LIZ(R.id.mo6);
        o.LJFF(tv_title, "tv_title");
        CharSequence text = tv_title.getText();
        o.LJFF(text, "tv_title.text");
        if (text.length() == 0) {
            TextView tv_title2 = (TextView) LIZ(R.id.mo6);
            o.LJFF(tv_title2, "tv_title");
            tv_title2.setText(title);
        }
    }

    public final void setTitlebarRootView(View view) {
        o.LJIIJ(view, "<set-?>");
        this.LJLIL = view;
    }
}
