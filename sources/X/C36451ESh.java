package X;

import com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode;
import com.ss.android.ugc.aweme.services.performance.LagDataCallback;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.ESh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36451ESh implements LagDataCallback, C2V {
    public final /* synthetic */ InterfaceC88472Yns LJLIL;

    @Override // X.InterfaceC30685C2n
    public void onSuccess() {
        this.LJLIL.invoke(null);
    }

    public /* synthetic */ C36451ESh(InterfaceC88472Yns interfaceC88472Yns) {
        this.LJLIL = interfaceC88472Yns;
    }

    @Override // X.C2V
    public void LIZIZ(UIAnnotationErrorCode uIAnnotationErrorCode) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DiyPropParser#saveSticker errorCode:");
        LIZ.append(uIAnnotationErrorCode);
        C15280iq.LIZJ("DiyProp", X1D.LIZIZ(LIZ));
        if (uIAnnotationErrorCode != UIAnnotationErrorCode.UIAnnotationErrorCode_RemoveTempPathFailed) {
            InterfaceC88472Yns interfaceC88472Yns = this.LJLIL;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("DiyPropParser#saveSticker errorCode:");
            LIZ2.append(uIAnnotationErrorCode);
            interfaceC88472Yns.invoke(new Exception(X1D.LIZIZ(LIZ2)));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.performance.LagDataCallback
    public void onDataAvailable(JSONObject data) {
        o.LJIIIZ(data, "data");
        this.LJLIL.invoke(data);
    }
}
