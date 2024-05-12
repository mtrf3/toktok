package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.vega.nletodraft.model.ZipInputExtra;
import kotlin.jvm.internal.o;

/* renamed from: X.5WL, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5WL extends F9E {
    public final NLEModel LJLIL;
    public final ZipInputExtra LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public C5WL(NLEModel nleModel, ZipInputExtra zipInputExtra) {
        o.LJIIIZ(nleModel, "nleModel");
        this.LJLIL = nleModel;
        this.LJLILLLLZI = zipInputExtra;
    }
}
