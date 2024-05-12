package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LBY extends FrameLayout implements InterfaceC59022Ti {
    public HashMap LJLIL;

    public final View LIZ(int i) {
        if (this.LJLIL == null) {
            this.LJLIL = new HashMap();
        }
        View view = (View) this.LJLIL.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJLIL.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC59022Ti
    public View getTitleBarRoot() {
        return this;
    }

    @Override // X.InterfaceC59022Ti
    public ImageView getBackView() {
        return (ImageView) LIZ(R.id.eys);
    }

    @Override // X.InterfaceC59022Ti
    public ImageView getCloseAllView() {
        return (ImageView) LIZ(R.id.f0i);
    }

    @Override // X.InterfaceC59022Ti
    public ImageView getMoreButtonView() {
        return (ImageView) LIZ(R.id.f70);
    }

    @Override // X.InterfaceC59022Ti
    public ImageView getReportView() {
        return (ImageView) LIZ(R.id.f9s);
    }

    @Override // X.InterfaceC59022Ti
    public ImageView getShareView() {
        return (ImageView) LIZ(R.id.f_x);
    }

    @Override // X.InterfaceC59022Ti
    public TextView getTitleView() {
        return (TextView) LIZ(R.id.mo6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LBY(Context context) {
        super(context);
        o.LJIIJ(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.u8, this, true);
    }

    @Override // X.InterfaceC59022Ti
    public void setDefaultTitle(CharSequence defaultTitle) {
        o.LJIIJ(defaultTitle, "defaultTitle");
        TextView titleView = getTitleView();
        if (titleView != null) {
            CharSequence text = titleView.getText();
            o.LJFF(text, "text");
            if (text.length() == 0) {
                titleView.setText(defaultTitle);
            }
        }
    }

    @Override // X.InterfaceC59022Ti
    public void setTitleBarBackgroundColor(int i) {
        LIZ(R.id.law).setBackgroundColor(i);
    }
}
