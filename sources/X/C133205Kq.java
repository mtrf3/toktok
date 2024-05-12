package X;

import com.bytedance.ies.nle.editor_jni.INLEResourceDownloadStatusListener;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLELoggerListener;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.VecNLEResourceNodeSPtr;
import java.util.Iterator;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS14S1201000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5Kq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C133205Kq extends INLEResourceDownloadStatusListener {
    public final /* synthetic */ C5J1 LIZ;

    @Override // com.bytedance.ies.nle.editor_jni.INLEResourceDownloadStatusListener
    public final void onAllResourceDownloadFinished() {
        NLELoggerListener logger = com.bytedance.ies.nleeditor.NLE.INSTANCE.getLogger();
        if (logger != null) {
            logger.onLog(LogLevel.LEVEL_DEBUG, "NLEResourceDownloadStatusListener onAllResourceDownloadFinished");
        }
        C5NB.LIZ(new AqS152S0100000_2(this, 764));
    }

    public C133205Kq(C5J1 c5j1) {
        this.LIZ = c5j1;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEResourceDownloadStatusListener
    public final void onStart(NLEResourceNode nLEResourceNode) {
        NLELoggerListener logger = com.bytedance.ies.nleeditor.NLE.INSTANCE.getLogger();
        if (logger != null) {
            logger.onLog(LogLevel.LEVEL_DEBUG, "NLEResourceDownloadStatusListener onStart");
        }
        C5NB.LIZ(new AqS149S0200000_2(this, nLEResourceNode, 81));
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEResourceDownloadStatusListener
    public final void onSuccess(NLEResourceNode nLEResourceNode, boolean z) {
        String str;
        String str2;
        String str3;
        com.bytedance.ies.nleeditor.NLE nle = com.bytedance.ies.nleeditor.NLE.INSTANCE;
        NLELoggerListener logger = nle.getLogger();
        if (logger != null) {
            logger.onLog(LogLevel.LEVEL_DEBUG, "NLEResourceDownloadStatusListener onSuccess");
        }
        if (this.LIZ.LJIL.get()) {
            NLELoggerListener logger2 = nle.getLogger();
            if (logger2 != null) {
                logger2.onLog(LogLevel.LEVEL_WARNING, "player has been destroyed");
                return;
            }
            return;
        }
        NLEEditor nLEEditor = this.LIZ.LJJIIJ;
        if (nLEEditor == null) {
            NLELoggerListener logger3 = nle.getLogger();
            if (logger3 != null) {
                logger3.onLog(LogLevel.LEVEL_WARNING, "editor is null");
                return;
            }
            return;
        }
        NLELoggerListener logger4 = nle.getLogger();
        NLEResourceNode nLEResourceNode2 = null;
        if (logger4 != null) {
            LogLevel logLevel = LogLevel.LEVEL_DEBUG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("NLEResourceDownloadStatusListener onSuccess: resourceId: ");
            if (nLEResourceNode != null) {
                str2 = nLEResourceNode.LIZLLL();
            } else {
                str2 = null;
            }
            LIZ.append(str2);
            LIZ.append(", resourceFile: ");
            if (nLEResourceNode != null) {
                str3 = nLEResourceNode.LIZJ();
            } else {
                str3 = null;
            }
            LIZ.append(str3);
            LIZ.append(", isFromCache: ");
            LIZ.append(z);
            logger4.onLog(logLevel, X1D.LIZIZ(LIZ));
        }
        NLEModel LJ = nLEEditor.LJ();
        o.LJIIIIZZ(LJ, "nleEditor.model");
        VecNLEResourceNodeSPtr allResources = LJ.getAllResources();
        o.LJIIIIZZ(allResources, "nleEditor.model.allResources");
        Iterator<NLEResourceNode> it = allResources.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            NLEResourceNode next = it.next();
            NLEResourceNode it2 = next;
            o.LJIIIIZZ(it2, "it");
            String LIZLLL = it2.LIZLLL();
            if (nLEResourceNode != null) {
                str = nLEResourceNode.LIZLLL();
            } else {
                str = null;
            }
            if (o.LJ(LIZLLL, str)) {
                nLEResourceNode2 = next;
                break;
            }
        }
        C5NB.LIZ(new C133215Kr(nLEResourceNode2, this, nLEResourceNode, z, nLEEditor));
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEResourceDownloadStatusListener
    public final void onFail(NLEResourceNode nLEResourceNode, int i, String str) {
        NLELoggerListener logger = com.bytedance.ies.nleeditor.NLE.INSTANCE.getLogger();
        if (logger != null) {
            logger.onLog(LogLevel.LEVEL_DEBUG, "NLEResourceDownloadStatusListener onFailed");
        }
        C5NB.LIZ(new AqS14S1201000_2(this, nLEResourceNode, i, str, 3));
    }
}
