package X;

import com.bytedance.android.livesdkapi.host.IHostAction;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Cfj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31911Cfj extends AbstractC38123Exj<JSONObject, JSONObject> {
    public boolean LJLIL;

    @Override // X.AbstractC38123Exj
    public final void onTerminate() {
    }

    @Override // X.AbstractC38082Ex4
    public final EnumC38078Ex0 getPermissionGroup() {
        return EnumC38078Ex0.PRIVATE;
    }

    @Override // X.AbstractC38123Exj
    public final void invoke(JSONObject params, C38131Exr callContext) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(callContext, "callContext");
        ((IHostAction) CN1.LIZ(IHostAction.class)).openRegionListPage(C29306Beo.LIZIZ(callContext.LIZ), new C31912Cfk(this));
    }
}
