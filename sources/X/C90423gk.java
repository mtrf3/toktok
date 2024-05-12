package X;

import Y.ACListenerS21S0100000_1;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3gk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C90423gk extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LJLJJI = 0;
    public final InterfaceC90433gl LJLIL;
    public final C51588KMm LJLILLLLZI;
    public Aweme LJLJI;

    public C90423gk(View view, InterfaceC90433gl interfaceC90433gl) {
        super(view);
        this.LJLIL = interfaceC90433gl;
        View findViewById = view.findViewById(R.id.k48);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.slide_aiv)");
        C51588KMm c51588KMm = (C51588KMm) findViewById;
        this.LJLILLLLZI = c51588KMm;
        c51588KMm.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS21S0100000_1(this, 200)));
    }
}
