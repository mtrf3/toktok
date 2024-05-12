package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.experiment.LibraryCategory;
import com.ss.android.ugc.aweme.experiment.LibraryCategoryConfig;

/* renamed from: X.S4p, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71507S4p {
    public static final boolean LIZIZ() {
        LibraryCategory[] categories;
        if (C00F.LIZ(31744, 0, "studio_library_category", true) != 1) {
            return false;
        }
        try {
            SettingsManager.LIZLLL().getClass();
            LibraryCategoryConfig libraryCategoryConfig = (LibraryCategoryConfig) SettingsManager.LJII("tt_library_categories_materials", LibraryCategoryConfig.class);
            if (libraryCategoryConfig == null || (categories = libraryCategoryConfig.getCategories()) == null || categories.length == 0) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            H78.LJ(th);
            return false;
        }
    }

    public static final boolean LIZJ() {
        LibraryCategory[] categories;
        if (C00F.LIZ(31744, 0, "studio_library_category", true) != 2) {
            return false;
        }
        try {
            SettingsManager.LIZLLL().getClass();
            LibraryCategoryConfig libraryCategoryConfig = (LibraryCategoryConfig) SettingsManager.LJII("tt_library_categories_materials", LibraryCategoryConfig.class);
            if (libraryCategoryConfig == null || (categories = libraryCategoryConfig.getCategories()) == null || categories.length == 0) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            H78.LJ(th);
            return false;
        }
    }

    public static final boolean LIZ() {
        if (LIZJ() || LIZIZ()) {
            return true;
        }
        return false;
    }
}
