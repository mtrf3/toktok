package X;

import com.bytedance.ies.actionai.jni.ActionAIErrorCode;
import com.bytedance.ies.actionai.jni.ServerErrorInfo;
import com.ss.android.ugc.aweme.actionai.action.data.ActionAIMusicResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.Ekk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37318Ekk implements InterfaceC37320Ekm<ActionAIMusicResponse> {
    public final /* synthetic */ InterfaceC67352kd<ActionAIMusicResponse> LIZ;

    public C37318Ekk(C84654XKg c84654XKg) {
        this.LIZ = c84654XKg;
    }

    @Override // X.InterfaceC37320Ekm
    public final void onSuccess(ActionAIMusicResponse data) {
        o.LJIIIZ(data, "data");
        InterfaceC67352kd<ActionAIMusicResponse> interfaceC67352kd = this.LIZ;
        C3C5.m7constructorimpl(data);
        interfaceC67352kd.resumeWith(data);
    }

    @Override // X.InterfaceC37320Ekm
    public final void LIZ(ActionAIErrorCode errorCode, String str, ServerErrorInfo serverErrorInfo) {
        o.LJIIIZ(errorCode, "errorCode");
        InterfaceC67352kd<ActionAIMusicResponse> interfaceC67352kd = this.LIZ;
        C37321Ekn c37321Ekn = new C37321Ekn(str);
        c37321Ekn.setServerErrorInfo(serverErrorInfo);
        c37321Ekn.setErrorCode(errorCode);
        C3C4 LIZ = C141335gf.LIZ(c37321Ekn);
        C3C5.m7constructorimpl(LIZ);
        interfaceC67352kd.resumeWith(LIZ);
    }
}
