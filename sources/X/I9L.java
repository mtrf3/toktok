package X;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes8.dex */
public final class I9L {
    public int LIZ;
    public boolean LIZIZ;
    public HJY LIZJ;
    public final Bundle LIZLLL = new Bundle();
    public Runnable LJ = null;
    public final String LJFF;

    public final String toString() {
        return "StopRecordingCommandEvent{}";
    }

    public I9L(String str) {
        if (!TextUtils.isEmpty(str) || !C82891Wg3.LIZIZ()) {
            this.LJFF = str;
            return;
        }
        throw new IllegalStateException("stop recording reason shouldn't be empty!!!");
    }
}
