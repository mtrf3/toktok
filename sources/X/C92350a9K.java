package X;

import android.text.TextUtils;
import com.bytedance.pipo.checkout.api.network.model.response.Elements;
import kotlin.jvm.internal.o;

/* renamed from: X.a9K, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92350a9K extends C92219a7D {
    public final String LJIIZILJ;

    public C92350a9K() {
        throw null;
    }

    @Override // X.C92219a7D
    public final String LJIIIIZZ() {
        if (o.LJ(this.LIZ.getParamName(), EnumC91966a38.BillingPostalCode.getType())) {
            String placeholder = this.LIZ.getPlaceholder();
            if (placeholder == null) {
                placeholder = "";
            }
            String LIZ = C92054a4Y.LIZ(placeholder, new String[0]);
            if (LIZ.length() > 0 && !TextUtils.equals(placeholder, LIZ)) {
                return LIZ;
            }
        }
        return super.LJIIIIZZ();
    }

    @Override // X.C92219a7D
    public final String LJFF() {
        return this.LJIIZILJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92350a9K(InterfaceC88472Yns interfaceC88472Yns, Elements elements) {
        super(elements, null, true, null, interfaceC88472Yns, null, null, 434);
        AbstractC78621UtN coroutineContext = C36636EZk.LIZ;
        o.LJIIIZ(coroutineContext, "coroutineContext");
        this.LJIIZILJ = "";
        XKX.LIZLLL(C48841JEv.LIZ(coroutineContext), null, null, new C93070aKw(this, null), 3);
    }
}
