package X;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class CY7 implements View.OnLayoutChangeListener {
    public final /* synthetic */ OnlineAudienceRankWidget LJLIL;
    public final /* synthetic */ C31413CUn LJLILLLLZI;

    public CY7(OnlineAudienceRankWidget onlineAudienceRankWidget, C31413CUn c31413CUn) {
        this.LJLIL = onlineAudienceRankWidget;
        this.LJLILLLLZI = c31413CUn;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        RecyclerView recyclerView;
        View view2;
        View view3 = this.LJLIL.getView();
        if (view3 != null) {
            i9 = view3.getWidth();
        } else {
            i9 = 0;
        }
        int measuredWidth = i9 - this.LJLIL.LLFZ().getMeasuredWidth();
        int LIZ = C15380j0.LIZ(28.0f);
        OnlineAudienceRankWidget onlineAudienceRankWidget = this.LJLIL;
        if (measuredWidth > 0) {
            i10 = measuredWidth / LIZ;
        } else {
            i10 = 0;
        }
        onlineAudienceRankWidget.LLF = i10;
        if (i10 != 0) {
            if (i10 == 1) {
                if (((ArrayList) onlineAudienceRankWidget.LLIIJI).size() >= 1) {
                    this.LJLILLLLZI.LJZ(((ArrayList) this.LJLIL.LLIIJI).subList(0, 1));
                    ImageView imageView = (ImageView) this.LJLIL.LJLJJLL.getValue();
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    RecyclerView recyclerView2 = this.LJLIL.LJLJLJ;
                    if (recyclerView2 != null) {
                        recyclerView2.setVisibility(8);
                    }
                } else {
                    RecyclerView recyclerView3 = this.LJLIL.LJLJLJ;
                    if (recyclerView3 != null) {
                        recyclerView3.setVisibility(8);
                    }
                    CY0.LIZJ(0, this.LJLIL.dataChannel, false);
                }
            }
        } else {
            RecyclerView recyclerView4 = onlineAudienceRankWidget.LJLJLJ;
            if (recyclerView4 != null) {
                recyclerView4.setVisibility(8);
            }
            CY0.LIZJ(0, this.LJLIL.dataChannel, false);
        }
        if (this.LJLILLLLZI.LJLIL.size() > 0 && (((recyclerView = this.LJLIL.LJLJLJ) != null && recyclerView.getVisibility() == 0) || ((view2 = (View) this.LJLIL.LJLJJLL.getValue()) != null && view2.getVisibility() == 0))) {
            CY0.LIZJ(this.LJLILLLLZI.LJLIL.size(), this.LJLIL.dataChannel, true);
        }
        RecyclerView recyclerView5 = this.LJLIL.LJLJLJ;
        if (recyclerView5 != null) {
            recyclerView5.removeOnLayoutChangeListener(this);
        }
    }
}
