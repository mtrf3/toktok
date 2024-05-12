package X;

import Y.ACListenerS36S0200000_1;
import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4GR, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4GR extends RecyclerView.ViewHolder implements G27 {
    public final String LJLIL;
    public final Fragment LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final SmartImageView LJLJJL;
    public final TuxTextView LJLJJLL;
    public Aweme LJLJL;
    public int LJLJLJ;
    public final InterfaceC207258Bl LJLJLLL;
    public final C62822Ol8 LJLL;

    public final void L() {
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = LFH.LIZIZ.LIZLLL().LJIIIZ().LJIIZILJ(this.LJLJJI, O6R.LJJIIZ(C32151Nz.LJIIZILJ(165)), this.itemView.getContext());
        }
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        L();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4GR(View view, String conversationId, Fragment fragment, int i, int i2) {
        super(view);
        o.LJIIIZ(conversationId, "conversationId");
        o.LJIIIZ(fragment, "fragment");
        this.LJLIL = conversationId;
        this.LJLILLLLZI = fragment;
        this.LJLJI = i;
        this.LJLJJI = i2;
        this.LJLJLJ = -1;
        this.LJLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 903));
        View findViewById = view.findViewById(R.id.bs8);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.container)");
        this.LJLJJL = (SmartImageView) view.findViewById(R.id.jva);
        this.LJLJJLL = (TuxTextView) view.findViewById(R.id.jvb);
        this.LJLJLLL = C8SG.LIZIZ.LJI((ViewGroup) findViewById);
        C16880lQ.LJIIJ(new ACListenerS36S0200000_1(view, this, 45), view);
        L();
    }
}
