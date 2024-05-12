package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.o;
import uw.s;
import zw.c;

/* loaded from: classes6.dex */
public class CUL<TEXT_MODEL extends s, PINNED_MODEL extends c<TEXT_MODEL>> extends RecyclerView.ViewHolder {
    public CQQ LJLIL;
    public PINNED_MODEL LJLILLLLZI;

    public void M(PINNED_MODEL pinnedModel, List<? extends Object> payloads) {
        o.LJIIIZ(pinnedModel, "pinnedModel");
        o.LJIIIZ(payloads, "payloads");
    }

    public CUL(View view, CQQ cqq) {
        super(view);
        this.LJLIL = cqq;
    }

    public final void L(PINNED_MODEL pinnedModel, List<? extends Object> payloads) {
        o.LJIIIZ(pinnedModel, "pinnedModel");
        o.LJIIIZ(payloads, "payloads");
        this.LJLILLLLZI = pinnedModel;
        M(pinnedModel, payloads);
    }
}
