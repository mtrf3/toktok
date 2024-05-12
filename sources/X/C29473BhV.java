package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.model.UserExtra;
import kotlin.jvm.internal.o;

/* renamed from: X.BhV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29473BhV {
    public final User LIZ;
    public final java.util.Map<AbstractC29482Bhe<?>, Object> LIZIZ;
    public final BaseResponse<User, UserExtra> LIZJ;

    public /* synthetic */ C29473BhV() {
        throw null;
    }

    public C29473BhV(User user, java.util.Map<AbstractC29482Bhe<?>, ? extends Object> cellsData, BaseResponse<User, UserExtra> baseResponse) {
        o.LJIIIZ(cellsData, "cellsData");
        this.LIZ = user;
        this.LIZIZ = cellsData;
        this.LIZJ = baseResponse;
    }
}
