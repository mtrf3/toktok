package X;

import Y.ARunnableS12S1100000_11;
import android.os.FileObserver;
import android.text.TextUtils;
import java.io.File;

/* loaded from: classes12.dex */
public final class PL9 extends FileObserver {
    public final /* synthetic */ File LIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PL9(String str, File file) {
        super(str, 4095);
        this.LIZ = file;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        if (!TextUtils.isEmpty(str) && (i & 8) != 0 && str.startsWith("anr_info_")) {
            C64214PIc.LIZ().LIZJ(new ARunnableS12S1100000_11(this, str, 8), 500L);
        }
    }
}
