package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.List;

/* renamed from: X.CUo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31414CUo<T, VH extends RecyclerView.ViewHolder> {
    public C31413CUn LIZ;

    public abstract void LIZ(VH vh, T t);

    public abstract VH LIZJ(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public void LIZLLL(VH vh) {
    }

    public void LJ(VH vh) {
    }

    public void LJFF(VH vh) {
    }

    public void LIZIZ(VH vh, T t, List<Object> list) {
        LIZ(vh, t);
    }
}
