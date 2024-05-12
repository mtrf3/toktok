package com.bytedance.sysoptimizer;

import X.C16880lQ;
import android.content.Context;
import com.bytedance.librarian.Librarian;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class SysOptimizer {
    public static volatile boolean mOptimzerLibLoaded;
    public static ArrayList<UnsatisfiedLinkError> mLoadError = new ArrayList<>();
    public static boolean mHookRefreshed = false;

    public static native void refreshHook();

    public static native void reservedForJniOffset();

    public static synchronized void hookOptimizerEnable() {
        synchronized (SysOptimizer.class) {
            if (mOptimzerLibLoaded && !mHookRefreshed) {
                try {
                    refreshHook();
                    mHookRefreshed = true;
                } catch (UnsatisfiedLinkError unused) {
                }
            }
        }
    }

    public static ArrayList<UnsatisfiedLinkError> getLoadLibraryError() {
        return mLoadError;
    }

    public static boolean loadOptimizerLibrary(Context context) {
        if (mOptimzerLibLoaded) {
            return true;
        }
        synchronized (SysOptimizer.class) {
            if (mOptimzerLibLoaded) {
                return true;
            }
            try {
                if (context == null) {
                    C16880lQ.LLJJJIL("sysoptimizer");
                } else {
                    Librarian.LJFF(context, "sysoptimizer");
                }
                mOptimzerLibLoaded = true;
                return true;
            } catch (UnsatisfiedLinkError e) {
                mLoadError.add(e);
                return false;
            } catch (OverlappingFileLockException unused) {
                return false;
            }
        }
    }
}
