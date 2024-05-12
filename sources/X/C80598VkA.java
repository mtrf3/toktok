package X;

import android.content.Context;
import android.database.Cursor;
import android.widget.CursorAdapter;
import android.widget.TextView;
import com.zhihu.matisse.internal.entity.Album;
import com.zhihu.matisse.ui.MatisseActivity;
import com.zhiliaoapp.musically.R;

/* renamed from: X.VkA, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80598VkA {
    public CursorAdapter LIZ;
    public TextView LIZIZ;
    public final C19M LIZJ;
    public MatisseActivity LIZLLL;

    public C80598VkA(Context context) {
        C19M c19m = new C19M(context, null, R.attr.ap0, 0);
        this.LIZJ = c19m;
        c19m.LLFF = true;
        c19m.LLFFF.setFocusable(true);
        float f = context.getResources().getDisplayMetrics().density;
        c19m.LJIILL((int) (216.0f * f));
        c19m.LJLJJLL = (int) (16.0f * f);
        c19m.LJI((int) (f * (-48.0f)));
        c19m.LJLLLLLL = new C80599VkB(this);
    }

    public final void LIZ(int i, Context context) {
        this.LIZJ.dismiss();
        Cursor cursor = this.LIZ.getCursor();
        cursor.moveToPosition(i);
        String LIZ = Album.LIZLLL(cursor).LIZ(context);
        if (this.LIZIZ.getVisibility() == 0) {
            this.LIZIZ.setText(LIZ);
            return;
        }
        this.LIZIZ.setAlpha(0.0f);
        this.LIZIZ.setVisibility(0);
        this.LIZIZ.setText(LIZ);
        this.LIZIZ.animate().alpha(1.0f).setDuration(context.getResources().getInteger(android.R.integer.config_longAnimTime)).start();
    }
}
