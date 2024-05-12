package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.io.IOException;
import java.util.List;

/* loaded from: classes29.dex */
public final class ZXA extends ArrayAdapter<ZY4> implements AdapterView.OnItemClickListener {
    public final LayoutInflater LJLIL;
    public final Drawable LJLILLLLZI;
    public final Drawable LJLJI;
    public final Drawable LJLJJI;
    public final Drawable LJLJJL;

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return false;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return getItem(i).LJI;
    }

    public ZXA(Context context, List<ZY4> list) {
        super(context, 0, list);
        this.LJLIL = C16880lQ.LLZIL(context);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.aq, R.attr.az, R.attr.aw, R.attr.av});
        this.LJLILLLLZI = obtainStyledAttributes.getDrawable(0);
        this.LJLJI = obtainStyledAttributes.getDrawable(1);
        this.LJLJJI = obtainStyledAttributes.getDrawable(2);
        this.LJLJJL = obtainStyledAttributes.getDrawable(3);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z;
        Drawable createFromStream;
        if (view == null) {
            view = C16880lQ.LLLLIILL(this.LJLIL, R.layout.n, viewGroup, false);
        }
        ZY4 item = getItem(i);
        TextView textView = (TextView) view.findViewById(R.id.ay);
        TextView textView2 = (TextView) view.findViewById(R.id.aw);
        textView.setText(item.LIZLLL);
        String str = item.LJ;
        int i2 = item.LJII;
        if (i2 == 2 || i2 == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z && !TextUtils.isEmpty(str)) {
            textView.setGravity(80);
            textView2.setVisibility(0);
            textView2.setText(str);
        } else {
            textView.setGravity(16);
            textView2.setVisibility(8);
            textView2.setText("");
        }
        view.setEnabled(item.LJI);
        ImageView imageView = (ImageView) view.findViewById(R.id.ax);
        if (imageView != null) {
            android.net.Uri uri = item.LJFF;
            if (uri != null) {
                try {
                    createFromStream = Drawable.createFromStream(getContext().getContentResolver().openInputStream(uri), null);
                } catch (IOException unused) {
                }
                if (createFromStream != null) {
                    imageView.setImageDrawable(createFromStream);
                }
            }
            int i3 = item.LJIIL;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (item.LJ()) {
                        createFromStream = this.LJLJJL;
                    } else {
                        createFromStream = this.LJLILLLLZI;
                    }
                } else {
                    createFromStream = this.LJLJJI;
                }
            } else {
                createFromStream = this.LJLJI;
            }
            imageView.setImageDrawable(createFromStream);
        }
        return view;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ZY4 item = getItem(i);
        if (item.LJI) {
            ImageView imageView = (ImageView) view.findViewById(R.id.ax);
            View findViewById = view.findViewById(R.id.az);
            imageView.setVisibility(8);
            findViewById.setVisibility(0);
            item.LJIIJJI();
        }
    }
}
