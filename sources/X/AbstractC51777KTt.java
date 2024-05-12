package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.KTt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC51777KTt<DATA> extends C8HS<DATA> {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public View LJLIL;

    public void LJLLLLLL(RecyclerView.ViewHolder viewHolder, int i) {
    }

    public RecyclerView.ViewHolder LJLZ(ViewGroup viewGroup) {
        return null;
    }

    @Override // X.C8HS, X.C4II
    public int getBasicItemCount() {
        int i;
        if (this.LJLIL == null) {
            i = 0;
        } else {
            i = 1;
        }
        return super.getBasicItemCount() + i;
    }

    public AbstractC51777KTt() {
        this.spanSizeLookup = new JZR(this);
        setLoadEmptyText(R.string.ect);
    }

    @Override // X.C4II
    public int getBasicItemViewType(int i) {
        if (this.LJLIL == null) {
            return 0;
        }
        if (i == 0) {
            return 10000;
        }
        if (!this.mShowFooter || i != getItemCount() - 1) {
            return 0;
        }
        return 20000;
    }

    @Override // X.C4II
    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (getItemViewType(i) == 0) {
            if (this.LJLIL != null && i != 0) {
                i--;
            }
            LJLLLLLL(viewHolder, i);
            return;
        }
        if (getItemViewType(i) != 20000 || !(viewHolder instanceof MSE)) {
            return;
        }
        ((MSE) viewHolder).L();
    }

    @Override // X.C4II
    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        if (this.LJLIL != null && i == 10000) {
            return new C51778KTu(this.LJLIL);
        }
        return LJLZ(viewGroup);
    }
}
