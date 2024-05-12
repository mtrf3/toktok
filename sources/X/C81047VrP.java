package X;

import Y.ARunnableS33S0200000_14;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import com.zhihu.matisse.ui.MatisseActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.VrP, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81047VrP implements C09M<Cursor> {
    public WeakReference<Context> LIZ;
    public C09N LIZIZ;
    public InterfaceC81016Vqu LIZJ;
    public int LIZLLL;
    public boolean LJ;

    @Override // X.C09M
    public final void LIZIZ() {
        if (this.LIZ.get() == null) {
            return;
        }
        ((MatisseActivity) this.LIZJ).LJLJJL.swapCursor(null);
    }

    @Override // X.C09M
    public final C0ZP LIZ(Bundle bundle) {
        String[] strArr;
        Context context = this.LIZ.get();
        if (context == null) {
            return null;
        }
        this.LJ = false;
        C81052VrU c81052VrU = C81055VrX.LIZ;
        String str = "media_type=? AND _size>0) GROUP BY (bucket_id";
        if (c81052VrU.LIZ()) {
            if (Build.VERSION.SDK_INT >= 29) {
                str = "media_type=? AND _size>0";
            }
            strArr = new String[]{String.valueOf(1)};
        } else if (c81052VrU.LIZIZ()) {
            if (Build.VERSION.SDK_INT >= 29) {
                str = "media_type=? AND _size>0";
            }
            strArr = new String[]{String.valueOf(3)};
        } else {
            if (Build.VERSION.SDK_INT < 29) {
                str = "(media_type=? OR media_type=?) AND _size>0) GROUP BY (bucket_id";
            } else {
                str = "(media_type=? OR media_type=?) AND _size>0";
            }
            strArr = C81058Vra.LJJ;
        }
        return new C81058Vra(context, str, strArr);
    }

    @Override // X.C09M
    public final void LIZJ(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (this.LIZ.get() == null || this.LJ) {
            return;
        }
        this.LJ = true;
        MatisseActivity matisseActivity = (MatisseActivity) this.LIZJ;
        matisseActivity.LJLJJL.swapCursor(cursor);
        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS33S0200000_14(matisseActivity, cursor, 83));
    }
}
