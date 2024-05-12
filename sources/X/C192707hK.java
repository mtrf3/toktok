package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionListMainUIAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7hK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192707hK extends RecyclerView.ViewHolder {
    public final CardView LJLIL;
    public final TextView LJLILLLLZI;
    public final SmartImageView LJLJI;
    public final View LJLJJI;
    public final View LJLJJL;
    public final /* synthetic */ CollectionListMainUIAssem LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C192707hK(CollectionListMainUIAssem collectionListMainUIAssem, ViewGroup parent) {
        super(C28289B8j.LIZ(parent, R.layout.av5, parent, false));
        o.LJIIIZ(parent, "parent");
        this.LJLJJLL = collectionListMainUIAssem;
        View findViewById = this.itemView.findViewById(R.id.b68);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.card_view)");
        this.LJLIL = (CardView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.gvs);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.name)");
        this.LJLILLLLZI = (TextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.cover);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.cover)");
        this.LJLJI = (SmartImageView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.cvj);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.empty_mask)");
        this.LJLJJI = findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.ec9);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.icon_privacy_marker)");
        this.LJLJJL = findViewById5;
    }
}
