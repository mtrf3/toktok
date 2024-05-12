package X;

import com.ss.android.vesdk.VEEditor;

/* loaded from: classes8.dex */
public final class I7S {
    public static /* synthetic */ void LIZ(I7R i7r, long j, VEEditor.SEEK_MODE seek_mode, int i) {
        boolean z;
        if ((i & 2) != 0) {
            seek_mode = VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek;
        }
        if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        i7r.LIZ(j, seek_mode, z);
    }
}
