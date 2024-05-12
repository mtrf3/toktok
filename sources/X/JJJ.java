package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS433S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JJJ extends RecyclerView.ViewHolder {
    public final InterfaceC88473Ynt<View, Integer, Aweme, C76800UCe> LJLIL;
    public final View LJLILLLLZI;
    public final C164086cG LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JJJ(View itemView, IDqS433S0100000_8 iDqS433S0100000_8) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        this.LJLIL = iDqS433S0100000_8;
        this.LJLILLLLZI = itemView;
        C164086cG c164086cG = (C164086cG) itemView.findViewById(R.id.cover);
        o.LJIIIIZZ(c164086cG, "itemView.cover");
        this.LJLJI = c164086cG;
    }
}
