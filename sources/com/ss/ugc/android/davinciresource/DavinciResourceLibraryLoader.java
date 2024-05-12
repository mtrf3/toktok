package com.ss.ugc.android.davinciresource;

import X.C16880lQ;
import com.bytedance.librarian.Librarian;

/* loaded from: classes3.dex */
public final class DavinciResourceLibraryLoader {
    public static final DavinciResourceLibraryLoader INSTANCE = new DavinciResourceLibraryLoader();
    public static volatile boolean hasLoadedLibrary;

    public final void loadLibrary() {
        if (hasLoadedLibrary) {
            return;
        }
        synchronized (this) {
            if (!hasLoadedLibrary) {
                try {
                    Librarian.LJ("DavinciResourceJni");
                } catch (Throwable unused) {
                    C16880lQ.LLJJJIL("DavinciResourceJni");
                }
                hasLoadedLibrary = true;
            }
        }
    }
}
