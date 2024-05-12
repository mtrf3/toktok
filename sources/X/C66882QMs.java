package X;

import com.ss.android.ugc.aweme.photo.PhotoModule;
import java.util.ArrayList;

/* renamed from: X.QMs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66882QMs implements X0H {
    public final /* synthetic */ PhotoModule LJLIL;

    public C66882QMs(PhotoModule photoModule) {
        this.LJLIL = photoModule;
    }

    @Override // X.X0H
    public final void LIZIZ(String[] strArr) {
        if (strArr.length > 0) {
            this.LJLIL.LJLJJLL = new ArrayList();
            for (String str : strArr) {
                if (str != null && str.length() > 0) {
                    ((ArrayList) this.LJLIL.LJLJJLL).add(str);
                }
            }
            return;
        }
        this.LJLIL.LJLJJLL = null;
    }
}
