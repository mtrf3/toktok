package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;
import com.zhihu.matisse.internal.entity.Album;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Vr5, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81027Vr5 extends CursorAdapter {
    public final Drawable LJLIL;

    public C81027Vr5(Context context) {
        super(context, (Cursor) null, false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.vc});
        this.LJLIL = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.CursorAdapter
    public final void bindView(View view, Context context, Cursor cursor) {
        Album LIZLLL = Album.LIZLLL(cursor);
        ((TextView) view.findViewById(R.id.a0d)).setText(LIZLLL.LIZ(context));
        ((TextView) view.findViewById(R.id.a0c)).setText(String.valueOf(LIZLLL.mCount));
        W5G w5g = (W5G) view.findViewById(R.id.a09);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.z9);
        W5P LIZLLL2 = W5P.LIZLLL(LIZLLL.mCoverUri);
        LIZLLL2.LIZJ = new C79238V7y(dimensionPixelSize, dimensionPixelSize);
        W5O LIZ = LIZLLL2.LIZ();
        V92 hierarchy = w5g.getHierarchy();
        if (hierarchy == null) {
            hierarchy = new C79077V1t(context.getResources()).LIZ();
        }
        hierarchy.LJIILL(this.LJLIL, 1);
        w5g.setHierarchy(hierarchy);
        w5g.setImageRequest(LIZ);
    }

    @Override // android.widget.CursorAdapter
    public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.gy, viewGroup, false);
    }
}
