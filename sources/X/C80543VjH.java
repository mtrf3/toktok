package X;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: X.VjH, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80543VjH extends BaseAdapter {
    public static final int LJLJJI;
    public final Calendar LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    static {
        int i;
        if (Build.VERSION.SDK_INT >= 26) {
            i = 4;
        } else {
            i = 1;
        }
        LJLJJI = i;
    }

    public C80543VjH() {
        Calendar LJIIIIZZ = C80561VjZ.LJIIIIZZ(null);
        this.LJLIL = LJIIIIZZ;
        this.LJLILLLLZI = LJIIIIZZ.getMaximum(7);
        this.LJLJI = LJIIIIZZ.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.LJLILLLLZI;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i2 = this.LJLILLLLZI;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.LJLJI;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) C28289B8j.LIZ(viewGroup, R.layout.btt, viewGroup, false);
        }
        Calendar calendar = this.LJLIL;
        int i2 = i + this.LJLJI;
        int i3 = this.LJLILLLLZI;
        if (i2 > i3) {
            i2 -= i3;
        }
        calendar.set(7, i2);
        textView.setText(this.LJLIL.getDisplayName(7, LJLJJI, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(C16880lQ.LLLZ(viewGroup.getContext().getString(R.string.i9z), new Object[]{this.LJLIL.getDisplayName(7, 2, Locale.getDefault())}));
        return textView;
    }
}
