package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;

/* renamed from: X.N3q, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58742N3q implements UPA {
    public final Keva LIZ;

    @Override // X.UPA
    public final void LIZ() {
        this.LIZ.storeBoolean("read_contact_denied", false);
    }

    public C58742N3q(Context context) {
        this.LIZ = KevaImpl.getRepoFromSp(context, "FriendsSharePreferences", 0);
    }
}
