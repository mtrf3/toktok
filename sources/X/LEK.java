package X;

import android.content.res.Resources;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* loaded from: classes10.dex */
public final class LEK implements InterfaceC48757JBp {
    public static final LEK LJLIL = new LEK();

    @Override // X.InterfaceC48757JBp
    public final boolean LJIIJ() {
        if (C35686DzW.LIZ("ITabletAutoScroll.isDefaultAutoScroll")) {
            return false;
        }
        return LEL.LIZ();
    }

    @Override // X.InterfaceC48757JBp
    public final boolean LJIILIIL() {
        if (C35686DzW.LIZ("ITabletAutoScroll.needInitAutoScroll")) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC48757JBp
    public final void LJJIJL(View view) {
        if (view != null) {
            view.setBackgroundResource(R.drawable.c7p);
        }
    }

    @Override // X.InterfaceC48757JBp
    public final boolean LJJJJ(boolean z) {
        if (C35686DzW.LIZ("ITabletAutoScroll.isAutoScroll")) {
            return z;
        }
        return LEL.LIZ();
    }

    @Override // X.InterfaceC48757JBp
    public final void LJIILLIIL(ActivityC45651qj activityC45651qj, TuxTextView tuxTextView, TuxIconView tuxIconView) {
        String str;
        Resources resources;
        if (tuxTextView != null) {
            if (activityC45651qj == null || (resources = activityC45651qj.getResources()) == null || (str = resources.getString(R.string.je4)) == null) {
                str = "";
            }
            tuxTextView.setText(str);
        }
        if (tuxIconView != null) {
            tuxIconView.setIconRes(R.raw.icon_auto_scroll_fill);
        }
    }
}
