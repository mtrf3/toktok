package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.internal.ui.MediaSelectionFragment;
import com.zhiliaoapp.musically.R;

/* renamed from: X.VrF, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class ViewOnClickListenerC81037VrF extends C2315396v implements View.OnClickListener {
    public W5G LJLIL;
    public C72974SkU LJLILLLLZI;
    public ImageView LJLJI;
    public TextView LJLJJI;
    public Item LJLJJL;
    public C81041VrJ LJLJJLL;
    public InterfaceC81044VrM LJLJL;

    public Item getMedia() {
        return this.LJLJJL;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC81044VrM interfaceC81044VrM = this.LJLJL;
        if (interfaceC81044VrM != null) {
            if (view == this.LJLIL) {
                Item item = this.LJLJJL;
                RecyclerView.ViewHolder viewHolder = this.LJLJJLL.LIZJ;
                MediaSelectionFragment mediaSelectionFragment = ((C81038VrG) interfaceC81044VrM).LJLJJLL;
                if (mediaSelectionFragment != null) {
                    mediaSelectionFragment.rf(null, item, viewHolder.getAdapterPosition());
                    return;
                }
                return;
            }
            if (view != this.LJLILLLLZI) {
                return;
            }
            Item item2 = this.LJLJJL;
            RecyclerView.ViewHolder viewHolder2 = this.LJLJJLL.LIZJ;
            C81038VrG c81038VrG = (C81038VrG) interfaceC81044VrM;
            if (c81038VrG.LJLJJI.LJFF) {
                if (c81038VrG.LJLJI.LIZIZ(item2) == Integer.MIN_VALUE) {
                    Context context = viewHolder2.itemView.getContext();
                    C81053VrV LIZLLL = c81038VrG.LJLJI.LIZLLL(item2);
                    C81053VrV.LIZ(context, LIZLLL);
                    if (LIZLLL != null) {
                        return;
                    }
                    c81038VrG.LJLJI.LIZ(item2);
                    c81038VrG.LJLZ();
                    return;
                }
                c81038VrG.LJLJI.LJI(item2);
                c81038VrG.LJLZ();
                return;
            }
            if (c81038VrG.LJLJI.LIZIZ.contains(item2)) {
                c81038VrG.LJLJI.LJI(item2);
                c81038VrG.LJLZ();
                return;
            }
            Context context2 = viewHolder2.itemView.getContext();
            C81053VrV LIZLLL2 = c81038VrG.LJLJI.LIZLLL(item2);
            C81053VrV.LIZ(context2, LIZLLL2);
            if (LIZLLL2 != null) {
                return;
            }
            c81038VrG.LJLJI.LIZ(item2);
            c81038VrG.LJLZ();
        }
    }

    public void setCheckEnabled(boolean z) {
        this.LJLILLLLZI.setEnabled(z);
    }

    public void setChecked(boolean z) {
        this.LJLILLLLZI.setChecked(z);
    }

    public void setCheckedNum(int i) {
        this.LJLILLLLZI.setCheckedNum(i);
    }

    public void setOnMediaGridClickListener(InterfaceC81044VrM interfaceC81044VrM) {
        this.LJLJL = interfaceC81044VrM;
    }

    public ViewOnClickListenerC81037VrF(final Context context, final AttributeSet attributeSet) {
        new FrameLayout(context, attributeSet) { // from class: X.96v
            @Override // android.widget.FrameLayout, android.view.View
            public final void onMeasure(int i, int i2) {
                super.onMeasure(i, i);
            }
        };
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.bs1, this, true);
        this.LJLIL = (W5G) findViewById(R.id.ggn);
        this.LJLILLLLZI = (C72974SkU) findViewById(R.id.b_n);
        this.LJLJI = (ImageView) findViewById(R.id.ds1);
        this.LJLJJI = (TextView) findViewById(R.id.n5j);
        this.LJLIL.setOnClickListener(new ViewOnClickListenerC13880ga(this));
        this.LJLILLLLZI.setOnClickListener(new ViewOnClickListenerC13880ga(this));
    }
}
