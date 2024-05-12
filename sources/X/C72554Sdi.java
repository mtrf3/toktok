package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Sdi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72554Sdi extends RecyclerView.ViewHolder {
    public final C62354Oda LJLIL;
    public final C72559Sdn LJLILLLLZI;
    public final View LJLJI;
    public final float LJLJJI;

    public C72554Sdi(View view) {
        super(view);
        this.LJLIL = (C62354Oda) view.findViewById(R.id.i7p);
        this.LJLILLLLZI = (C72559Sdn) view.findViewById(R.id.i7r);
        this.LJLJI = view.findViewById(R.id.i7q);
        Context context = view.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        this.LJLJJI = C44392HbY.LIZ(context, 22.0f);
    }
}
