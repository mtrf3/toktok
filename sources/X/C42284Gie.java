package X;

import android.app.Dialog;
import com.ss.android.ugc.aweme.services.performance.LagDataCallback;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Gie, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42284Gie implements LagDataCallback, A91 {
    public final /* synthetic */ InterfaceC88472Yns LJLIL;

    public /* synthetic */ C42284Gie(InterfaceC88472Yns interfaceC88472Yns) {
        this.LJLIL = interfaceC88472Yns;
    }

    @Override // X.A91
    public void LIZ(Dialog dialog) {
        o.LJIIIZ(dialog, "dialog");
        this.LJLIL.invoke(dialog);
    }

    @Override // com.ss.android.ugc.aweme.services.performance.LagDataCallback
    public void onDataAvailable(JSONObject data) {
        o.LJIIIZ(data, "data");
        this.LJLIL.invoke(data);
    }
}
