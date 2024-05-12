package X;

import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Toj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C75785Toj extends AbstractC75784Toi {
    public final String LIZLLL;
    public ViewGroup LJ;
    public View LJFF;

    public C75785Toj() {
        this(0);
    }

    @Override // X.AbstractC75784Toi
    public int LIZIZ() {
        return R.layout.dfd;
    }

    public void LJFF() {
        ViewGroup viewGroup = this.LJ;
        if (viewGroup != null) {
            C87277YNd.LJJIJ(viewGroup);
        }
        View view = this.LJFF;
        if (view != null) {
            C87277YNd.LJJIIZ(view);
        }
    }

    public void LJI() {
        ViewGroup viewGroup = this.LJ;
        if (viewGroup != null) {
            C87277YNd.LJJIIZ(viewGroup);
        }
        View view = this.LJFF;
        if (view != null) {
            C87277YNd.LJJIJ(view);
        }
    }

    @Override // X.AbstractC75784Toi
    public String LIZ() {
        return this.LIZLLL;
    }

    public C75785Toj(int i) {
        this.LIZLLL = "";
    }

    @Override // X.AbstractC75784Toi
    public void LIZJ(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        View view = null;
        if (viewGroup != null) {
            viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.g1n);
        } else {
            viewGroup2 = null;
        }
        this.LJ = viewGroup2;
        if (viewGroup != null) {
            view = viewGroup.findViewById(R.id.eze);
        }
        this.LJFF = view;
        ViewGroup viewGroup3 = this.LJ;
        if (viewGroup3 != null) {
            C87277YNd.LJJIJ(viewGroup3);
        }
        View view2 = this.LJFF;
        if (view2 != null) {
            C87277YNd.LJJIIZ(view2);
        }
    }
}
