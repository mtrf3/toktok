package com.bytedance.ies.nleeditor;

import X.C47261Igj;
import X.InterfaceC120654oP;
import com.bytedance.ies.nle.editor_jni.INLEMonitor;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLELogger;
import com.bytedance.ies.nle.editor_jni.NLELoggerFunc;
import com.bytedance.ies.nle.editor_jni.NLELoggerListener;
import com.bytedance.ies.nle.editor_jni.NLEMonitor;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class NLE {
    public static boolean libraryHasLoaded;
    public static NLELoggerListener logger;
    public static INLEMonitor monitor;
    public static final NLE INSTANCE = new NLE();
    public static LogLevel logLevel = LogLevel.LEVEL_INFO;
    public static InterfaceC120654oP libraryLoader = new InterfaceC120654oP() { // from class: X.4oQ
        @Override // X.InterfaceC120654oP
        public final boolean LIZ(List<String> list) {
            if (list != null) {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    C16880lQ.LLJJJIL(it.next());
                }
                return true;
            }
            return true;
        }
    };

    public final void loadNLELibrary() {
        loadNLELibrary$default(this, false, 1, null);
    }

    public final InterfaceC120654oP getLibraryLoader() {
        return libraryLoader;
    }

    public final LogLevel getLogLevel() {
        return logLevel;
    }

    public final NLELoggerListener getLogger() {
        return logger;
    }

    public final INLEMonitor getMonitor() {
        return monitor;
    }

    public final synchronized void loadNLELibrary(boolean z) {
        NLEMonitor nLEMonitor;
        if (!z) {
            libraryLoader.LIZ(C47261Igj.LJJIJIIJI("NLEEditorJni", "NLEMediaJni"));
        } else {
            libraryLoader.LIZ(C47261Igj.LJJIJIIJI("NLEEditorJni", "NLEMediaJni", "NLETemplateModelJni"));
        }
        if (!libraryHasLoaded) {
            NLELoggerListener nLELoggerListener = logger;
            if (nLELoggerListener != null) {
                NLELogger LIZ = NLELogger.LIZ();
                NLEEditorJniJNI.NLELogger_setDelegate(LIZ.LIZ, LIZ, NLELoggerFunc.getCPtr(nLELoggerListener), nLELoggerListener);
            }
            NLELogger LIZ2 = NLELogger.LIZ();
            NLEEditorJniJNI.NLELogger_setLogLevel(LIZ2.LIZ, LIZ2, logLevel.swigValue());
            INLEMonitor iNLEMonitor = monitor;
            if (iNLEMonitor != null) {
                long NLEMonitor_obtain = NLEEditorJniJNI.NLEMonitor_obtain();
                if (NLEMonitor_obtain == 0) {
                    nLEMonitor = null;
                } else {
                    nLEMonitor = new NLEMonitor(NLEMonitor_obtain, false);
                }
                NLEEditorJniJNI.NLEMonitor_setListener(nLEMonitor.LIZ, nLEMonitor, INLEMonitor.getCPtr(iNLEMonitor), iNLEMonitor);
            }
        }
        libraryHasLoaded = true;
    }

    public final void setLibraryLoader(InterfaceC120654oP interfaceC120654oP) {
        o.LJIIJ(interfaceC120654oP, "<set-?>");
        libraryLoader = interfaceC120654oP;
    }

    public final void setLogLevel(LogLevel value) {
        o.LJIIJ(value, "value");
        logLevel = value;
        if (libraryHasLoaded) {
            NLELogger LIZ = NLELogger.LIZ();
            NLEEditorJniJNI.NLELogger_setLogLevel(LIZ.LIZ, LIZ, value.swigValue());
        }
    }

    public final void setLogger(NLELoggerListener nLELoggerListener) {
        if (libraryHasLoaded && nLELoggerListener != null) {
            NLELogger LIZ = NLELogger.LIZ();
            NLEEditorJniJNI.NLELogger_setDelegate(LIZ.LIZ, LIZ, NLELoggerFunc.getCPtr(nLELoggerListener), nLELoggerListener);
        }
        logger = nLELoggerListener;
    }

    public final void setMonitor(INLEMonitor iNLEMonitor) {
        NLEMonitor nLEMonitor;
        if (libraryHasLoaded && iNLEMonitor != null) {
            long NLEMonitor_obtain = NLEEditorJniJNI.NLEMonitor_obtain();
            if (NLEMonitor_obtain == 0) {
                nLEMonitor = null;
            } else {
                nLEMonitor = new NLEMonitor(NLEMonitor_obtain, false);
            }
            NLEEditorJniJNI.NLEMonitor_setListener(nLEMonitor.LIZ, nLEMonitor, INLEMonitor.getCPtr(iNLEMonitor), iNLEMonitor);
        }
        monitor = iNLEMonitor;
    }

    public static /* synthetic */ void loadNLELibrary$default(NLE nle, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        nle.loadNLELibrary(z);
    }
}
