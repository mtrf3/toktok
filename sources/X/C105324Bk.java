package X;

import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* renamed from: X.4Bk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105324Bk extends QXX {
    @Override // X.QXX
    public final View LLIIZ(ViewGroup viewGroup) {
        if (C71922s0.LIZ().enable) {
            View LIZ = C28289B8j.LIZ(viewGroup, R.layout.atv, viewGroup, false);
            ((C223338pd) LIZ.findViewById(R.id.g7q)).LIZIZ();
            return LIZ;
        }
        return C28289B8j.LIZ(viewGroup, R.layout.atu, viewGroup, false);
    }
}
