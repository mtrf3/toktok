package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.librarian.LibrarianMonitor;

/* renamed from: X.FEv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38649FEv extends LibrarianMonitor {
    public C38649FEv(Context context) {
    }

    @Override // com.bytedance.librarian.LibrarianMonitor
    public final void LIZ(String str) {
        TextUtils.isEmpty(str);
        System.loadLibrary(str);
        TextUtils.isEmpty(str);
    }
}
