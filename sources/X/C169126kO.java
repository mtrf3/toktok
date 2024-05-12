package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.tools.draft.music.PermissionCheckApi;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6kO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C169126kO {
    public List<PermissionCheckApi.PermissionCheckEntity> LIZ;

    public final String toString() {
        String json = GsonProtectorUtils.toJson(new Gson(), this.LIZ);
        o.LJIIIIZZ(json, "Gson().toJson(checkEntities)");
        return json;
    }
}
