package X;

import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Hwt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45715Hwt extends AbstractViewOnClickListenerC81978WFi {
    public final /* synthetic */ InterfaceC65784Pro LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45715Hwt(AqS154S0200000_7 aqS154S0200000_7) {
        super(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, true);
        this.LJLJJLL = aqS154S0200000_7;
    }

    @Override // X.AbstractViewOnClickListenerC81978WFi
    public final void LIZ(View v) {
        o.LJIIIZ(v, "v");
        this.LJLJJLL.invoke();
    }
}
