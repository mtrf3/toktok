package X;

import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.utils.Au2S16S0100000_7;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Gno, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42604Gno extends RecyclerView.ViewHolder {
    public final View LJLIL;
    public final InterfaceC88472Yns<MediaModel, C76800UCe> LJLILLLLZI;
    public final SmartImageView LJLJI;
    public MediaModel LJLJJI;
    public InterfaceC92693kP LJLJJL;
    public final Size LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C42604Gno(View view, C42603Gnn adapter, InterfaceC88472Yns<? super MediaModel, C76800UCe> onItemClickListener) {
        super(view);
        double d;
        o.LJIIIZ(adapter, "adapter");
        o.LJIIIZ(onItemClickListener, "onItemClickListener");
        this.LJLIL = view;
        this.LJLILLLLZI = onItemClickListener;
        View findViewById = view.findViewById(R.id.cku);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.ec_search_extend_photo)");
        SmartImageView smartImageView = (SmartImageView) findViewById;
        this.LJLJI = smartImageView;
        if (HOC.LIZJ()) {
            d = 1.3333333333333333d;
        } else if (HOC.LIZLLL()) {
            d = 1.7777777777777777d;
        } else {
            d = 1.0d;
        }
        int LJIIJJI = (int) ((KL2.LJIIJJI(view.getContext()) - (3 * KL2.LIZJ(view.getContext(), 1.5f))) / 4);
        Size size = new Size(LJIIJJI, (int) (LJIIJJI * d));
        this.LJLJJLL = size;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = size.getWidth();
        layoutParams.height = size.getHeight();
        C16880lQ.LJJIJLIJ(smartImageView, new Au2S16S0100000_7(this, 3));
    }
}
