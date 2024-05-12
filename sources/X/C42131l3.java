package X;

import Y.IDCListenerS10S0101000;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.1l3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C42131l3 extends AbstractC31901Na {
    public final PagingViewModel LJLIL;
    public final View LJLILLLLZI;
    public final TextView LJLJI;

    @Override // X.AbstractC31901Na
    public final void M() {
    }

    @Override // X.AbstractC31901Na
    public final void L(boolean z) {
        C06900Ow value = this.LJLIL.LJLJJL.getValue();
        View findViewById = this.itemView.findViewById(R.id.keu);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        if (value != null && value.LIZ == EnumC06890Ov.FAILED && z) {
            layoutParams.height = -1;
            this.LJLILLLLZI.setVisibility(0);
            TextView textView = this.LJLJI;
            textView.setTextColor(textView.getResources().getColor(R.color.a20));
            this.LJLJI.setText(R.string.sor);
        } else {
            layoutParams.height = -2;
            this.LJLILLLLZI.setVisibility(8);
            TextView textView2 = this.LJLJI;
            textView2.setTextColor(textView2.getResources().getColor(R.color.a1z));
            this.LJLJI.setText(R.string.sop);
        }
        findViewById.setLayoutParams(layoutParams);
        C16880lQ.LJIIJ(new IDCListenerS10S0101000(0, this, 0), this.itemView);
    }

    public C42131l3(View view, PagingViewModel pagingViewModel) {
        super(view);
        this.LJLIL = pagingViewModel;
        this.LJLILLLLZI = view.findViewById(R.id.cyf);
        this.LJLJI = (TextView) view.findViewById(R.id.cys);
    }
}
