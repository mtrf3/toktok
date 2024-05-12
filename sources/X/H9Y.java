package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.services.duet.DuetUploadServiceImpl;

/* loaded from: classes8.dex */
public final class H9Y implements InterfaceC144185lG {
    public final /* synthetic */ H9U LJLIL;

    public H9Y(H9U h9u) {
        this.LJLIL = h9u;
    }

    @Override // X.InterfaceC144185lG
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        if (i == 20 && i2 == -1) {
            if (intent != null) {
                new DuetUploadServiceImpl().callDuetVideoPublish(this.LJLIL.LIZ, intent);
                return true;
            }
            return true;
        }
        return false;
    }
}
