package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.9Y8, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9Y8 extends RecyclerView.ViewHolder {
    public final TuxTextView LJLIL;
    public final SmartImageView LJLILLLLZI;
    public final SY4 LJLJI;

    public C9Y8(View view) {
        super(view);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.title);
        o.LJIIIIZZ(tuxTextView, "itemView.title");
        this.LJLIL = tuxTextView;
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.cover);
        o.LJIIIIZZ(smartImageView, "itemView.cover");
        this.LJLILLLLZI = smartImageView;
        SY4 sy4 = (SY4) view.findViewById(R.id.mt1);
        o.LJIIIIZZ(sy4, "itemView.undo");
        this.LJLJI = sy4;
    }
}
