package X;

import Y.ACListenerS28S0201000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TCU extends C8HS<TCW> {
    public final TCX LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TCU(TCX listener) {
        super(false, 1, null);
        o.LJIIIZ(listener, "listener");
        this.LJLIL = listener;
    }

    @Override // X.C4II
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        List<TCW> data = getData();
        if (data != null && (viewHolder instanceof C61633OGv)) {
            C61633OGv c61633OGv = (C61633OGv) viewHolder;
            TCW groupFilterStruct = (TCW) ListProtector.get(data, i);
            boolean LJIIIZ = CommerceMediaServiceImpl.LIZJ().LJIIIZ();
            c61633OGv.getClass();
            o.LJIIIZ(groupFilterStruct, "groupFilterStruct");
            c61633OGv.LJLILLLLZI.setText(c61633OGv.itemView.getContext().getString(groupFilterStruct.LIZIZ));
            if (groupFilterStruct.LIZ == LJIIIZ) {
                c61633OGv.LJLILLLLZI.setAlpha(1.0f);
                c61633OGv.LJLJI.setVisibility(0);
            } else {
                c61633OGv.LJLILLLLZI.setAlpha(0.5f);
                c61633OGv.LJLJI.setVisibility(8);
            }
            C16880lQ.LJIIJ(new ACListenerS28S0201000_12(i, this, data, 2), c61633OGv.itemView);
        }
    }

    @Override // X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        Context context;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        View itemView = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.cpo, viewGroup, false);
        o.LJIIIIZZ(itemView, "itemView");
        return new C61633OGv(itemView);
    }
}
