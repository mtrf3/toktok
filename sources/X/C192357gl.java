package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionContentAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7gl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192357gl extends RecyclerView.ViewHolder {
    public final TextView LJLIL;
    public final TextView LJLILLLLZI;
    public final SY4 LJLJI;
    public final TuxTextView LJLJJI;
    public final /* synthetic */ CollectionContentAssem LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C192357gl(CollectionContentAssem collectionContentAssem, ViewGroup parent) {
        super(C28289B8j.LIZ(parent, R.layout.av8, parent, false));
        o.LJIIIZ(parent, "parent");
        this.LJLJJL = collectionContentAssem;
        View findViewById = this.itemView.findViewById(R.id.bi1);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.collection_name)");
        this.LJLIL = (TextView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.bi4);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.collection_total)");
        this.LJLILLLLZI = (TextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.ax5);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.btn_manage_videos)");
        this.LJLJI = (SY4) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.m04);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.tv_author)");
        this.LJLJJI = (TuxTextView) findViewById4;
    }
}
