package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MWo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56946MWo extends RecyclerView.ViewHolder {
    public final C72433Sbl LJLIL;
    public final TextView LJLILLLLZI;
    public final AnonymousClass976 LJLJI;
    public final View LJLJJI;
    public final C57446Mgc LJLJJL;
    public List<? extends User> LJLJJLL;

    public C56946MWo(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.f4d);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.iv_head)");
        this.LJLIL = (C72433Sbl) findViewById;
        View findViewById2 = view.findViewById(R.id.mby);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.tv_name)");
        this.LJLILLLLZI = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.h5h);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.…ation_name_append_follow)");
        this.LJLJI = (AnonymousClass976) findViewById3;
        View findViewById4 = view.findViewById(R.id.h5i);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.…_append_follow_container)");
        this.LJLJJI = findViewById4;
        View findViewById5 = view.findViewById(R.id.h5j);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.…_name_append_follow_text)");
        this.LJLJJL = (C57446Mgc) findViewById5;
        C221108m2.LIZIZ(new AqS159S0100000_9(this, 1010));
    }
}
