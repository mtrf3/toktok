package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListActivity;
import com.ss.android.ugc.aweme.ecommerce.router.Strategy;
import kotlin.jvm.internal.o;

/* renamed from: X.Ah3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC26897Ah3 extends Strategy {
    public final AddressListActivity context;

    public abstract void onCreate(Bundle bundle);

    public abstract void onDestroy();

    public abstract void onPause();

    public abstract void onStart();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC26897Ah3(AddressListActivity context) {
        super(context, null, 2, null);
        o.LJIIIZ(context, "context");
        this.context = context;
        this.excludeStatusBar = false;
    }
}
