package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public abstract class BFB extends RecyclerView.ViewHolder {
    public abstract <T> void LJJZZIII(T t);

    public BFB(View view) {
        super(view);
        if (C0NB.LIZJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(0);
            LIZ.append("");
            C0NB.LIZIZ("type", X1D.LIZIZ(LIZ));
        }
    }
}
