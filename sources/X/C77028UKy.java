package X;

import android.os.Handler;
import android.os.Message;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.UKy, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77028UKy implements Handler.Callback {
    public final /* synthetic */ C77027UKx LJLIL;

    public C77028UKy(C77027UKx c77027UKx) {
        this.LJLIL = c77027UKx;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message it) {
        o.LJIIIZ(it, "it");
        int i = it.what;
        this.LJLIL.getClass();
        if (i == 0) {
            Object obj = it.obj;
            if (obj instanceof ConstraintProperty) {
                o.LJII(obj, "null cannot be cast to non-null type com.bytedance.ies.sdk.widgets.ConstraintProperty");
                ConstraintProperty constraintProperty = (ConstraintProperty) obj;
                constraintProperty.connect(7, R.id.cwg, 6, C15380j0.LIZ(30.0f));
                constraintProperty.apply();
                return true;
            }
            return true;
        }
        return true;
    }
}
