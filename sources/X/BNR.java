package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public abstract class BNR<T> extends RecyclerView.ViewHolder {
    public boolean LJLIL;
    public final C73318Sq2 LJLILLLLZI;

    public boolean L() {
        return this instanceof C28684BNo;
    }

    public abstract void bind(T t, int i);

    public void onViewAttachedToWindow() {
        this.LJLIL = true;
    }

    public void onViewDetachedFromWindow() {
        this.LJLIL = false;
    }

    public BNR(View view) {
        super(view);
        this.LJLILLLLZI = new C73318Sq2();
    }
}
