package X;

import com.ss.android.ugc.aweme.services.performance.LagDataCallback;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.ESi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36452ESi implements LagDataCallback {
    public final /* synthetic */ InterfaceC88472Yns<JSONObject, C76800UCe> LJLIL;

    /* JADX WARN: Multi-variable type inference failed */
    public C36452ESi(InterfaceC88472Yns<? super JSONObject, C76800UCe> interfaceC88472Yns) {
        this.LJLIL = interfaceC88472Yns;
    }

    @Override // com.ss.android.ugc.aweme.services.performance.LagDataCallback
    public final void onDataAvailable(JSONObject data) {
        o.LJIIIZ(data, "data");
        this.LJLIL.invoke(data);
    }
}
