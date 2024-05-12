package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.QQv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66989QQv implements InterfaceC252619vl {
    public final /* synthetic */ Context LJLIL;

    public C66989QQv(Context context) {
        this.LJLIL = context;
    }

    @Override // X.InterfaceC252619vl
    public final void t0(int i, User user, User user2) {
        String str;
        QOX LIZJ;
        if (user2 != null) {
            str = user2.getSecUid();
        } else {
            str = "";
        }
        if (user != null && TextUtils.equals(str, user.getSecUid())) {
            return;
        }
        QR9 LIZIZ = QR9.LIZIZ(this.LJLIL);
        if (!TextUtils.equals(LIZIZ.LJLJJI, str)) {
            LIZIZ.LJLJJI = str;
            if (LIZIZ.LJLIL.get() != null && (LIZIZ.LJLIL.get() instanceof C66986QQs)) {
                C66986QQs c66986QQs = (C66986QQs) LIZIZ.LJLIL.get();
                if (TextUtils.equals(c66986QQs.LIZLLL, str)) {
                    return;
                }
                c66986QQs.LIZLLL = str;
                if (c66986QQs.LIZJ == null || (LIZJ = c66986QQs.LIZJ(c66986QQs.LIZ)) == null) {
                    return;
                }
                c66986QQs.LIZJ.LIZ(LIZJ);
            }
        }
    }
}
