package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.librarian.LibrarianMonitor;

/* loaded from: classes7.dex */
public final class FFU extends LibrarianMonitor {
    public FFU(Context context) {
    }

    @Override // com.bytedance.librarian.LibrarianMonitor
    public final void LIZ(String str) {
        TextUtils.isEmpty(str);
        System.loadLibrary(str);
        TextUtils.isEmpty(str);
    }
}
