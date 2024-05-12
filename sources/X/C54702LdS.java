package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.LdS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54702LdS extends RecyclerView.ViewHolder {
    public final View LJLIL;
    public final C51588KMm LJLILLLLZI;
    public final TuxTextView LJLJI;
    public final TextView LJLJJI;
    public final C53873LCj LJLJJL;
    public final C53887LCx LJLJJLL;

    static {
        C54704LdU.LIZ(16.0f);
        C54704LdU.LIZ(8.0f);
        C54704LdU.LIZ(72.0f);
        C54704LdU.LIZ(80.0f);
        C54704LdU.LIZ(88.0f);
        C54704LdU.LIZ(96.0f);
        C54704LdU.LIZ(130.0f);
    }

    public C54702LdS(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.f__);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.iv_root)");
        this.LJLIL = findViewById;
        View findViewById2 = view.findViewById(R.id.f12);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.iv_cover)");
        C51588KMm c51588KMm = (C51588KMm) findViewById2;
        this.LJLILLLLZI = c51588KMm;
        View findViewById3 = view.findViewById(R.id.mby);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.tv_name)");
        this.LJLJI = (TuxTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.ecq);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.icon_tag)");
        this.LJLJJI = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.f68);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.iv_live_circle)");
        C53873LCj c53873LCj = (C53873LCj) findViewById5;
        this.LJLJJL = c53873LCj;
        C53887LCx c53887LCx = new C53887LCx(EnumC53720L6m.INBOX, c51588KMm, c51588KMm, c53873LCj);
        this.LJLJJLL = c53887LCx;
        c53887LCx.LJIIJ(false);
    }
}
