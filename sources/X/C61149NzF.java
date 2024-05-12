package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.lingo.caption.LingoCaptionImpl;
import com.lingo.caption.api.LingoCaptionApi;
import kotlin.jvm.internal.o;

/* renamed from: X.NzF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61149NzF implements LingoCaptionApi {
    public static final C61149NzF LIZIZ = new C61149NzF();
    public final /* synthetic */ LingoCaptionApi LIZ;

    @Override // com.lingo.caption.api.LingoCaptionApi
    public final void LIZ(String materialId) {
        o.LJIIIZ(materialId, "materialId");
        this.LIZ.LIZ(materialId);
    }

    @Override // com.lingo.caption.api.LingoCaptionApi
    public final void LIZIZ(String str) {
        this.LIZ.LIZIZ(str);
    }

    @Override // com.lingo.caption.api.LingoCaptionApi
    public final View LIZJ(Context context, Lifecycle lifecycle, C61150NzG c61150NzG, ACL acl, ACZ acz, C25836ACa initData, AD1 debugInfo) {
        o.LJIIIZ(initData, "initData");
        o.LJIIIZ(debugInfo, "debugInfo");
        return this.LIZ.LIZJ(context, lifecycle, c61150NzG, acl, acz, initData, debugInfo);
    }

    public C61149NzF() {
        LingoCaptionApi lingoCaptionApi;
        Object LIZ = C58096Mr6.LIZ(LingoCaptionApi.class, false);
        if (LIZ != null) {
            lingoCaptionApi = (LingoCaptionApi) LIZ;
        } else {
            if (C58096Mr6.LJJJI == null) {
                synchronized (LingoCaptionApi.class) {
                    if (C58096Mr6.LJJJI == null) {
                        C58096Mr6.LJJJI = new LingoCaptionImpl();
                    }
                }
            }
            lingoCaptionApi = C58096Mr6.LJJJI;
        }
        this.LIZ = lingoCaptionApi;
    }
}
