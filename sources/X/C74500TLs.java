package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.shortvideo.library.experiment.LibraryPerformanceSettingsObject;

/* renamed from: X.TLs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74500TLs {
    public static final C74500TLs LIZ = new C74500TLs();

    public static LibraryPerformanceSettingsObject LIZ() {
        try {
            LibraryPerformanceSettingsObject libraryPerformanceSettingsObject = (LibraryPerformanceSettingsObject) SettingsManager.LIZLLL().LJIIIIZZ("library_performance_settings", LibraryPerformanceSettingsObject.class, null);
            if (libraryPerformanceSettingsObject == null) {
                return new LibraryPerformanceSettingsObject();
            }
            return libraryPerformanceSettingsObject;
        } catch (Throwable unused) {
            return new LibraryPerformanceSettingsObject();
        }
    }
}
