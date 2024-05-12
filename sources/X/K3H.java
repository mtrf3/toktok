package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.pages.result.effectlist.core.model.SearchEffect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K3H extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LJLJL = 0;
    public final TextView LJLIL;
    public final TextView LJLILLLLZI;
    public final TextView LJLJI;
    public final C62354Oda LJLJJI;
    public final FrameLayout LJLJJL;
    public SearchEffect LJLJJLL;

    public K3H(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.title);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.title)");
        this.LJLIL = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.mxq);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.usage)");
        this.LJLILLLLZI = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.desc);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.desc)");
        this.LJLJI = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.cover);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.cover)");
        this.LJLJJI = (C62354Oda) findViewById4;
        View findViewById5 = view.findViewById(R.id.b32);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.camera_button)");
        this.LJLJJL = (FrameLayout) findViewById5;
    }

    public final void L(SearchEffect searchEffect, String str) {
        C50653JuL.LJLILLLLZI.getClass();
        java.util.Map LIZIZ = C50654JuM.LIZIZ();
        K3I k3i = new K3I();
        k3i.LJIIZILJ("search_id", (String) LIZIZ.get("search_id"));
        k3i.LJIJ("search_result_id", searchEffect.docId);
        k3i.LJIJI("search_result");
        k3i.LJIIZILJ("search_keyword", (String) LIZIZ.get("search_keyword"));
        k3i.LJIIZILJ("token_type", "tiktok_effects");
        k3i.LJIIZILJ("is_aladdin", String.valueOf((Object) 0));
        k3i.LJJI(Integer.valueOf(getAdapterPosition()));
        k3i.LJIIZILJ("prop_id", searchEffect.id);
        k3i.LJIIZILJ("button_type", str);
        k3i.LJIILIIL();
    }
}
