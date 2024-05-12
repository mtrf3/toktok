package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS27S0001000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6ON, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6ON extends C6O6 {
    public final ViewGroup LIZIZ;
    public final KUV LIZJ;
    public final C1NS<TextStickerModel> LIZLLL;
    public final LifecycleOwner LJ;
    public final C6OE LJFF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6ON(ViewGroup viewGroup, C6OA abilityContainer) {
        super(abilityContainer);
        o.LJIIIZ(abilityContainer, "abilityContainer");
        this.LIZIZ = viewGroup;
        View findViewById = viewGroup.findViewById(R.id.bi_);
        o.LJIIIIZZ(findViewById, "viewContainer.findViewById(R.id.color_layout)");
        KUV kuv = (KUV) findViewById;
        this.LIZJ = kuv;
        C1NS<TextStickerModel> c1ns = abilityContainer.LIZJ;
        this.LIZLLL = c1ns;
        LifecycleOwner lifecycleOwner = abilityContainer.LIZIZ;
        this.LJ = lifecycleOwner;
        this.LJFF = abilityContainer.LIZLLL;
        kuv.setColorChangeListener(new InterfaceC159606Oe() { // from class: X.6OT
            @Override // X.InterfaceC159606Oe
            public final void LIZ(int i) {
                C6ON.this.LIZLLL.LJ(new AqS27S0001000_2(i, 26));
                C6ON c6on = C6ON.this;
                C6OE c6oe = c6on.LJFF;
                if (c6oe != null) {
                    c6oe.LJIIJJI(c6on.LIZLLL.LJ);
                }
            }
        });
        c1ns.LIZ(new TBT() { // from class: X.5a0
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((TextStickerModel) obj).getColor());
            }
        }).LJIIIIZZ(lifecycleOwner, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 439));
    }
}
