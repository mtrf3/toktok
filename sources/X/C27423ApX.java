package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.ApX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27423ApX extends AbstractC27419ApT<OSZ<? extends C62562cu, ? extends Integer>> {
    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return R.layout.a4l;
    }

    public C27423ApX(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(new AqS186S0100000_4(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 277), 2);
    }

    @Override // X.AbstractC27419ApT
    public final View LJLLLLLL(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return C72545SdZ.LIZJ(parent, "parent.context", R.layout.a4l, parent, false);
    }

    @Override // X.AbstractC27419ApT
    /* renamed from: LJLZ */
    public final void onBindViewHolder(C27422ApW holder, int i) {
        o.LJIIIZ(holder, "holder");
        super.onBindViewHolder(holder, i);
        Context context = holder.itemView.getContext();
        o.LJIIIIZZ(context, "context");
        int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.dz, context);
        OSZ<? extends C62562cu, ? extends Integer> item = getItem(i);
        W5F LIZLLL = C70759Rpr.LIZLLL(item.getFirst());
        S3I s3i = new S3I();
        s3i.LIZLLL = C32151Nz.LJIIZILJ(2);
        float LJIIZILJ = C32151Nz.LJIIZILJ(Float.valueOf(0.5f));
        s3i.LIZJ = LJIIIIZZ;
        s3i.LIZIZ = LJIIZILJ;
        LIZLLL.LJIJJLI = new S3L(s3i);
        LIZLLL.LJJIIJ = (SmartImageView) holder.itemView.findViewById(R.id.egd);
        L9G.LIZ(LIZLLL);
        if (item.getSecond().intValue() <= 1) {
            ((FrameLayout) holder.itemView.findViewById(R.id.bs8)).setForeground(null);
            ((TextView) holder.itemView.findViewById(R.id.gm2)).setText("");
            return;
        }
        ((FrameLayout) holder.itemView.findViewById(R.id.bs8)).setForeground(C04270Et.LIZIZ(context, R.drawable.aco));
        TextView textView = (TextView) holder.itemView.findViewById(R.id.gm2);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('+');
        LIZ.append(item.getSecond().intValue());
        textView.setText(X1D.LIZIZ(LIZ));
    }

    @Override // X.AbstractC27419ApT, X.AbstractC029409q
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        onBindViewHolder((C27422ApW) viewHolder, i);
    }
}
