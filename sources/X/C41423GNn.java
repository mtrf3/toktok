package X;

import android.content.Context;
import android.widget.ArrayAdapter;
import com.zhiliaoapp.musically.R;

/* renamed from: X.GNn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C41423GNn extends ArrayAdapter<CharSequence> {
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }

    public C41423GNn(Context context, CharSequence[] charSequenceArr) {
        super(context, R.layout.gz, android.R.id.text1, charSequenceArr);
    }
}
