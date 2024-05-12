package X;

import android.view.View;
import com.bytedance.android.live.design.app.LiveDialog;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UHZ implements C0K6 {
    public final /* synthetic */ UHX LIZ;

    public UHZ(UHX uhx) {
        this.LIZ = uhx;
    }

    @Override // X.C0K6
    public final void LIZ(LiveDialog liveDialog, View view) {
        o.LJIIIZ(view, "view");
        this.LIZ.LIZJ().onCancel();
    }
}
