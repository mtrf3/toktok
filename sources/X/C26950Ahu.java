package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.Ahu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26950Ahu extends AbstractC26897Ah3 {
    public final AddressListActivity LJLIL;

    @Override // X.AbstractC26897Ah3
    public final void onDestroy() {
    }

    @Override // X.AbstractC26897Ah3
    public final void onPause() {
    }

    @Override // X.AbstractC26897Ah3
    public final void onStart() {
        new C70903RsB("AddressListH5Strategy").LIZJ(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26950Ahu(AddressListActivity activity) {
        super(activity);
        o.LJIIIZ(activity, "activity");
        this.LJLIL = activity;
    }

    @Override // X.AbstractC26897Ah3
    public final void onCreate(Bundle bundle) {
        this.LJLIL.setContentView(getFallbackView());
        C1A7.LJJIJL(this.LJLIL.getWindow());
        this.LJLIL.getWindow().setSoftInputMode(16);
    }
}
