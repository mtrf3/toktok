package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditActivity;
import com.ss.android.ugc.aweme.ecommerce.router.Strategy;
import kotlin.jvm.internal.o;

/* renamed from: X.Amv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27261Amv extends Strategy {
    public final AddressEditActivity LJLIL;

    public abstract void LIZ();

    public abstract void onCreate(Bundle bundle);

    public abstract void onDestroy();

    public abstract void onStart();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC27261Amv(AddressEditActivity activity) {
        super(activity, null, 2, null);
        o.LJIIIZ(activity, "activity");
        this.LJLIL = activity;
        this.excludeStatusBar = false;
    }
}
