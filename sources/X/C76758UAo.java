package X;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.UAo, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76758UAo extends F9E {
    public String LJLIL;
    public final WeakReference<U66> LJLILLLLZI;
    public final U94 LJLJI;
    public final String LJLJJI;
    public final C76786UBq LJLJJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL};
    }

    public C76758UAo(String str, WeakReference<U66> weakReference, U94 scene, String str2, C76786UBq linkLayerSeqEventReporter) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(linkLayerSeqEventReporter, "linkLayerSeqEventReporter");
        this.LJLIL = str;
        this.LJLILLLLZI = weakReference;
        this.LJLJI = scene;
        this.LJLJJI = str2;
        this.LJLJJL = linkLayerSeqEventReporter;
    }
}
