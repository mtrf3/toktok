package X;

import android.os.Bundle;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.VolumeFragment;

/* renamed from: X.50t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1280350t {
    public static VolumeFragment LIZ(String str) {
        Bundle LIZ = C0H1.LIZ("volume_type", str);
        VolumeFragment volumeFragment = new VolumeFragment();
        volumeFragment.setArguments(LIZ);
        return volumeFragment;
    }
}
