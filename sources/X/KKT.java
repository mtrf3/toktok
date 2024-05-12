package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ViewSwitcher;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.ui.MallToolBarAssem;
import com.zhiliaoapp.musically.R;

/* loaded from: classes9.dex */
public final class KKT implements ViewSwitcher.ViewFactory {
    public final /* synthetic */ Context LIZ;
    public final /* synthetic */ MallToolBarAssem LIZIZ;

    public KKT(Context context, MallToolBarAssem mallToolBarAssem) {
        this.LIZ = context;
        this.LIZIZ = mallToolBarAssem;
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public final View makeView() {
        TuxTextView tuxTextView = new TuxTextView(this.LIZ, null, 6, 0);
        tuxTextView.setTuxFont(41);
        this.LIZIZ.getClass();
        tuxTextView.setTextColorRes(R.attr.gv);
        tuxTextView.setSingleLine();
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setGravity(16);
        tuxTextView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return tuxTextView;
    }
}
