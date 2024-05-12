package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.zhiliaoapp.musically.R;

/* renamed from: X.4Ge, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106564Ge {
    public final ViewGroup LIZ;
    public View LIZIZ;
    public GridView LIZJ;
    public C106524Ga LIZLLL;

    public C106564Ge(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        this.LIZ = viewGroup;
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.ats, viewGroup, false);
        this.LIZIZ = LLLLIILL;
        GridView gridView = (GridView) LLLLIILL.findViewById(R.id.cuh);
        this.LIZJ = gridView;
        gridView.setSelector(R.color.cz);
        this.LIZJ.setStretchMode(1);
        this.LIZJ.setGravity(17);
        Resources resources = context.getResources();
        if (i == 5) {
            this.LIZJ.setNumColumns(7);
            this.LIZJ.setColumnWidth(resources.getDimensionPixelSize(R.dimen.r3));
            this.LIZJ.setVerticalSpacing(resources.getDimensionPixelSize(R.dimen.r6));
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.r5);
            this.LIZJ.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        }
        C106524Ga c106524Ga = new C106524Ga(this);
        this.LIZLLL = c106524Ga;
        this.LIZJ.setAdapter((ListAdapter) c106524Ga);
    }
}
