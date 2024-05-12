package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;

/* renamed from: X.Zgg, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class AsyncTaskC90574Zgg extends PthreadAsyncTask<Void, Void, Drawable> {
    public final int LIZ;
    public final Context LIZIZ;
    public final /* synthetic */ ZX9 LIZJ;

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        if (ZX9.LJLZ.get(this.LIZ) == null) {
            return this.LIZIZ.getResources().getDrawable(this.LIZ);
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onCancelled(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            ZX9.LJLZ.put(this.LIZ, drawable.getConstantState());
        }
        this.LIZJ.LJLJL = null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            ZX9.LJLZ.put(this.LIZ, drawable.getConstantState());
            this.LIZJ.LJLJL = null;
        } else {
            Drawable.ConstantState constantState = ZX9.LJLZ.get(this.LIZ);
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            this.LIZJ.LJLJL = null;
        }
        this.LIZJ.setRemoteIndicatorDrawableInternal(drawable);
    }

    public AsyncTaskC90574Zgg(ZX9 zx9, int i, Context context) {
        this.LIZJ = zx9;
        this.LIZ = i;
        this.LIZIZ = context;
    }
}
