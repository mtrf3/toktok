package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.Amu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27260Amu extends AbstractC27261Amv {
    @Override // X.AbstractC27261Amv
    public final void LIZ() {
    }

    @Override // X.AbstractC27261Amv
    public final void onDestroy() {
    }

    @Override // X.AbstractC27261Amv
    public final void onStart() {
        new C70903RsB("AddressEditH5Strategy").LIZJ(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27260Amu(AddressEditActivity activity) {
        super(activity);
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.AbstractC27261Amv
    public final void onCreate(Bundle bundle) {
        this.LJLIL.setContentView(getFallbackView());
        C1A7.LJJIJL(this.LJLIL.getWindow());
        this.LJLIL.getWindow().setSoftInputMode(16);
    }
}
