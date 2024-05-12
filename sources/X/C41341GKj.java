package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.pugc.PUgcSlotData;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS96S0300000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GKj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41341GKj extends RecyclerView.ViewHolder {
    public final W5G LJLIL;
    public final TuxTextView LJLILLLLZI;
    public final C71897SJp LJLJI;
    public boolean LJLJJI;
    public PUgcSlotData LJLJJL;
    public final int LJLJJLL;
    public final int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41341GKj(View view, InterfaceC88471Ynr<? super Integer, ? super Boolean, ? extends Object> onItemCheckedListener) {
        super(view);
        o.LJIIIZ(onItemCheckedListener, "onItemCheckedListener");
        Context context = view.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        this.LJLJJLL = (int) C74275TDb.LIZIZ(context, 113.0f);
        Context context2 = view.getContext();
        o.LJIIIIZZ(context2, "itemView.context");
        this.LJLJL = (int) C74275TDb.LIZIZ(context2, 64.0f);
        C72559Sdn c72559Sdn = (C72559Sdn) view.findViewById(R.id.k54);
        this.LJLIL = (W5G) view.findViewById(R.id.k53);
        this.LJLILLLLZI = (TuxTextView) view.findViewById(R.id.k57);
        View findViewById = view.findViewById(R.id.et_);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.item_check)");
        C71897SJp c71897SJp = (C71897SJp) findViewById;
        this.LJLJI = c71897SJp;
        c71897SJp.setOnCheckedChangeListener(new C41342GKk(onItemCheckedListener, this));
        if (c72559Sdn != null) {
            c72559Sdn.setRadius((int) C32151Nz.LJIIZILJ(6));
        }
        C146035oF.LIZJ(view, new AqS96S0300000_7(this, (C41341GKj) view, (View) onItemCheckedListener, (InterfaceC88471Ynr<? super Integer, ? super Boolean, ? extends Object>) 26));
    }
}
