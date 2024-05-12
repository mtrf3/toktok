package X;

import Y.AfS54S0200000_5;
import Y.IDaS216S0100000_5;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.share.ShareApi;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Boy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29936Boy {
    public final List<User> LIZ = new ArrayList();
    public final List<User> LIZIZ = new ArrayList();
    public boolean LIZJ;

    public final void LIZ(long j, Fragment lifecycleOwner, IDaS216S0100000_5 iDaS216S0100000_5) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        if (this.LIZJ) {
            return;
        }
        this.LIZJ = true;
        ((InterfaceC29856Bng) C1EW.LIZ(((ShareApi) Q7L.LIZIZ(ShareApi.class)).getBatchShareUsers(j)).LIZJ(C73933Szx.LJ(lifecycleOwner))).LIZJ(new AfS54S0200000_5(this, iDaS216S0100000_5, 36), new AfS54S0200000_5(this, iDaS216S0100000_5, 37));
    }
}
