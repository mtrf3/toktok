package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.sticker.model.EffectAttribution;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.GtH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42943GtH extends RecyclerView.ViewHolder {
    public final InterfaceC88472Yns<EffectAttribution, Boolean> LJLIL;
    public final TuxTextView LJLILLLLZI;
    public final TuxTextView LJLJI;
    public final TuxTextView LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C42943GtH(View view, InterfaceC88472Yns<? super EffectAttribution, Boolean> longPressListener) {
        super(view);
        o.LJIIIZ(longPressListener, "longPressListener");
        this.LJLIL = longPressListener;
        View findViewById = view.findViewById(R.id.csj);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.effect_name)");
        this.LJLILLLLZI = (TuxTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.cri);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.effect_auth_generator)");
        this.LJLJI = (TuxTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.csg);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.effect_license)");
        this.LJLJJI = (TuxTextView) findViewById3;
    }
}
