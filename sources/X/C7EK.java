package X;

import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.7EK, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7EK implements LEA {
    public static final C7EK LJLIL = new C7EK();

    @Override // X.LEA
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (z && i == 3) {
            String key = Y88.LIZJ;
            o.LJIIIZ(key, "key");
            KevaImpl.getRepoFromSp(EF7.LIZIZ(), "comment_sp", 0).erase(key);
        }
    }
}
