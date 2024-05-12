package X;

import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.ULa, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77030ULa extends ElementSpecImpl {
    public final UL8 LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77030ULa(UL8 landscapeLayeredElementContext) {
        super(R.id.eqf);
        o.LJIIIZ(landscapeLayeredElementContext, "landscapeLayeredElementContext");
        this.LJLIL = landscapeLayeredElementContext;
        addSceneObserver(new ULY(this));
        ElementSpecImplKt.onAttach(this, new AqS179S0100000_13(this, 617));
    }
}
