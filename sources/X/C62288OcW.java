package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.OcW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62288OcW extends RecyclerView.ViewHolder {
    public final SmartImageView LJLIL;
    public final C71897SJp LJLILLLLZI;
    public final String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62288OcW(View view, String templateResourcePrefix) {
        super(view);
        o.LJIIIZ(templateResourcePrefix, "templateResourcePrefix");
        this.LJLJI = templateResourcePrefix;
        View findViewById = view.findViewById(R.id.fb8);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.iv_template_item_bg)");
        this.LJLIL = (SmartImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.fb9);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.iv_template_item_icon)");
        this.LJLILLLLZI = (C71897SJp) findViewById2;
    }
}
