package X;

import Y.ARunnableS37S0100000_1;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class CD9 extends AbstractC65781Prl implements InterfaceC88472Yns<Integer, C76800UCe> {
    public final /* synthetic */ C34K LJLIL;
    public final /* synthetic */ Handler LJLILLLLZI;
    public final /* synthetic */ List<ImageView> LJLJI;
    public final /* synthetic */ CDG LJLJJI;
    public final /* synthetic */ TextView LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CD9(C34K c34k, Handler handler, List<? extends ImageView> list, CDG cdg, TextView textView) {
        super(1);
        this.LJLIL = c34k;
        this.LJLILLLLZI = handler;
        this.LJLJI = list;
        this.LJLJJI = cdg;
        this.LJLJJL = textView;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Integer num) {
        int intValue = num.intValue();
        if (intValue == 1) {
            C34K c34k = this.LJLIL;
            if (c34k.element) {
                c34k.element = false;
                this.LJLILLLLZI.postDelayed(new ARunnableS37S0100000_1(this.LJLJJL, 105), 5000L);
            }
        }
        List<ImageView> list = this.LJLJI;
        CDG cdg = this.LJLJJI;
        Iterator<ImageView> it = list.iterator();
        while (it.hasNext()) {
            it.next().setBackground(cdg.LJLIL.requireContext().getDrawable(R.drawable.cn2));
        }
        List<ImageView> list2 = this.LJLJI;
        if (intValue > 4) {
            intValue = 4;
        }
        ((View) ListProtector.get(list2, intValue)).setBackground(this.LJLJJI.LJLIL.requireContext().getDrawable(R.drawable.cn1));
        return C76800UCe.LIZ;
    }
}
