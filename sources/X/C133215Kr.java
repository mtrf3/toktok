package X;

import com.bytedance.ies.nle.editor_jni.INLEResourceDownloadStatusListener;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLELoggerListener;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.5Kr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C133215Kr extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ NLEResourceNode LJLIL;
    public final /* synthetic */ C133205Kq LJLILLLLZI;
    public final /* synthetic */ NLEResourceNode LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ NLEEditor LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C133215Kr(NLEResourceNode nLEResourceNode, C133205Kq c133205Kq, NLEResourceNode nLEResourceNode2, boolean z, NLEEditor nLEEditor) {
        super(0);
        this.LJLIL = nLEResourceNode;
        this.LJLILLLLZI = c133205Kq;
        this.LJLJI = nLEResourceNode2;
        this.LJLJJI = z;
        this.LJLJJL = nLEEditor;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        String str;
        NLEResourceNode nLEResourceNode = this.LJLIL;
        if (nLEResourceNode != null) {
            NLEResourceNode nLEResourceNode2 = this.LJLJI;
            if (nLEResourceNode2 != null) {
                str = nLEResourceNode2.LIZJ();
            } else {
                str = null;
            }
            nLEResourceNode.LJIIIZ(str);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLILLLLZI.LIZ.LJJ).iterator();
        while (it.hasNext()) {
            INLEResourceDownloadStatusListener iNLEResourceDownloadStatusListener = (INLEResourceDownloadStatusListener) it.next();
            if (iNLEResourceDownloadStatusListener != null) {
                iNLEResourceDownloadStatusListener.onSuccess(this.LJLJI, this.LJLJJI);
            }
        }
        this.LJLILLLLZI.LIZ.getClass();
        NLELoggerListener logger = com.bytedance.ies.nleeditor.NLE.INSTANCE.getLogger();
        if (logger != null) {
            logger.onLog(LogLevel.LEVEL_DEBUG, "NLEModelChangeListener save event");
        }
        this.LJLILLLLZI.LIZ.getClass();
        return C76800UCe.LIZ;
    }
}
