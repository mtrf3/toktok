package com.ss.android.ugc.effectmanager;

import X.C16880lQ;

/* loaded from: classes16.dex */
public interface DownloadableModelSupportLibraryLoader {
    void loadLibrary(String str);

    /* loaded from: classes16.dex */
    public static class SystemLoader implements DownloadableModelSupportLibraryLoader {
        @Override // com.ss.android.ugc.effectmanager.DownloadableModelSupportLibraryLoader
        public void loadLibrary(String str) {
            C16880lQ.LLJJJIL(str);
        }
    }
}
