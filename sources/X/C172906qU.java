package X;

import com.bytedance.ies.cutsame.cut_android.NLEPrepareListener;
import com.bytedance.ies.cutsame.cut_android.NLETemplateSource;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS152S0100000_2;

/* renamed from: X.6qU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C172906qU implements NLEPrepareListener {
    public final WeakReference<NLETemplateSource> LIZ;
    public final AqS152S0100000_2 LIZIZ = new AqS152S0100000_2(this, 60);

    public C172906qU(WeakReference<NLETemplateSource> weakReference) {
        this.LIZ = weakReference;
    }

    @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
    public final void onPreSuccess(NLETemplateModel nLETemplateModel) {
        NLETemplateSource nLETemplateSource = (NLETemplateSource) this.LIZIZ.invoke();
        if (nLETemplateSource == null) {
            return;
        }
        Iterator it = ((ArrayList) nLETemplateSource.LJ).iterator();
        while (it.hasNext()) {
            ((NLEPrepareListener) it.next()).onPreSuccess(nLETemplateModel);
        }
    }

    @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
    public final void onSuccess(NLETemplateModel nLETemplateModel) {
        NLETemplateSource nLETemplateSource = (NLETemplateSource) this.LIZIZ.invoke();
        if (nLETemplateSource != null) {
            Iterator it = ((ArrayList) nLETemplateSource.LJ).iterator();
            while (it.hasNext()) {
                ((NLEPrepareListener) it.next()).onSuccess(nLETemplateModel);
            }
        }
        NLETemplateSource nLETemplateSource2 = (NLETemplateSource) this.LIZIZ.invoke();
        if (nLETemplateSource2 == null) {
            return;
        }
        nLETemplateSource2.LJII = 0;
    }

    @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
    public final void onError(int i, String str) {
        NLETemplateSource nLETemplateSource = (NLETemplateSource) this.LIZIZ.invoke();
        if (nLETemplateSource != null) {
            Iterator it = ((ArrayList) nLETemplateSource.LJ).iterator();
            while (it.hasNext()) {
                ((NLEPrepareListener) it.next()).onError(i, str);
            }
        }
        NLETemplateSource nLETemplateSource2 = (NLETemplateSource) this.LIZIZ.invoke();
        if (nLETemplateSource2 == null) {
            return;
        }
        nLETemplateSource2.LJII = i;
    }

    @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
    public final void onProgress(float f, String str) {
        NLETemplateSource nLETemplateSource = (NLETemplateSource) this.LIZIZ.invoke();
        if (nLETemplateSource == null) {
            return;
        }
        Iterator it = ((ArrayList) nLETemplateSource.LJ).iterator();
        while (it.hasNext()) {
            ((NLEPrepareListener) it.next()).onProgress(f, str);
        }
    }
}
