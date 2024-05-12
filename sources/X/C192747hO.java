package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionListChooseAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7hO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192747hO extends RecyclerView.ViewHolder {
    public final TextView LJLIL;
    public final SmartImageView LJLILLLLZI;
    public final TextView LJLJI;
    public final /* synthetic */ CollectionListChooseAssem LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C192747hO(CollectionListChooseAssem collectionListChooseAssem, ViewGroup parent) {
        super(C28289B8j.LIZ(parent, R.layout.av_, parent, false));
        o.LJIIIZ(parent, "parent");
        this.LJLJJI = collectionListChooseAssem;
        View findViewById = this.itemView.findViewById(R.id.gvs);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.name)");
        this.LJLIL = (TextView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.cover);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.cover)");
        this.LJLILLLLZI = (SmartImageView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.n9n);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.videos)");
        this.LJLJI = (TextView) findViewById3;
    }
}
