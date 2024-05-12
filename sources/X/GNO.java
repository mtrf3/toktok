package X;

import android.content.Context;
import android.widget.ArrayAdapter;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GNO extends ArrayAdapter<CharSequence> {
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GNO(Context context, CharSequence[] objects) {
        super(context, R.layout.i6, android.R.id.text1, objects);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(objects, "objects");
    }
}
