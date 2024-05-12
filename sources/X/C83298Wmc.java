package X;

import Y.ACListenerS48S0200000_14;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wmc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83298Wmc extends RecyclerView.ViewHolder {
    public final TDG LJLIL;
    public final ImageView LJLILLLLZI;
    public EnumC83299Wmd LJLJI;
    public final C62822Ol8 LJLJJI;
    public final /* synthetic */ C83297Wmb LJLJJL;

    public final void L() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-downloadAnimator>(...)");
        ((ValueAnimator) value).cancel();
        this.LJLILLLLZI.setRotation(0.0f);
        this.LJLILLLLZI.setImageResource(R.drawable.azi);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83298Wmc(C83297Wmb c83297Wmb, View view) {
        super(view);
        this.LJLJJL = c83297Wmb;
        TDG tdg = (TDG) view.findViewById(R.id.f2p);
        this.LJLIL = tdg;
        this.LJLILLLLZI = (ImageView) view.findViewById(R.id.f2o);
        this.LJLJI = EnumC83299Wmd.NOT_DOWNLOAD;
        this.LJLJJI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 294));
        tdg.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS48S0200000_14(this, c83297Wmb, 5)));
    }
}
