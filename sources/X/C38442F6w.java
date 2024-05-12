package X;

import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.ss.ttlivestreamer.core.utils.LibraryLoader;

/* renamed from: X.F6w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38442F6w implements LibraryLoader.Loader {
    @Override // com.ss.ttlivestreamer.core.utils.LibraryLoader.Loader
    public final boolean loadLibrary(String str) {
        return LiveAppBundleUtils.loadSOByLoader$default(str, "livecore-loadLibrary", false, 4, null);
    }

    @Override // com.ss.ttlivestreamer.core.utils.LibraryLoader.Loader
    public final boolean loadLibraryFromPath(String str) {
        return LiveAppBundleUtils.loadSOByLoader(str, "livecore-loadLibraryFromPath", false);
    }
}
