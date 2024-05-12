package X;

import Y.ACListenerS22S0100000_2;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6OM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6OM extends C6O6 {
    public final ViewGroup LIZIZ;
    public final C1NS<TextStickerModel> LIZJ;
    public final LifecycleOwner LIZLLL;
    public final C6OE LJ;
    public final LinearLayout LJFF;
    public final C71897SJp LJI;
    public boolean LJII;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6OM(ViewGroup viewGroup, C6OA abilityContainer) {
        super(abilityContainer);
        o.LJIIIZ(abilityContainer, "abilityContainer");
        this.LIZIZ = viewGroup;
        this.LIZJ = abilityContainer.LIZJ;
        this.LIZLLL = abilityContainer.LIZIZ;
        this.LJ = abilityContainer.LIZLLL;
        LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(R.id.g1p);
        this.LJFF = linearLayout;
        C71897SJp c71897SJp = (C71897SJp) viewGroup.findViewById(R.id.b_e);
        this.LJI = c71897SJp;
        TuxTextView tuxTextView = (TuxTextView) viewGroup.findViewById(R.id.lzs);
        boolean LIZ = new C1540162r().LIZ();
        this.LJII = LIZ;
        c71897SJp.setChecked(LIZ);
        C16880lQ.LJIIZILJ(linearLayout, new ACListenerS22S0100000_2(this, 112));
        C16880lQ.LJJJJI(tuxTextView, new ACListenerS22S0100000_2(this, 114));
        C16880lQ.LJJJI(c71897SJp, new ACListenerS22S0100000_2(this, 115));
    }
}
