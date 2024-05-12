package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.o;

/* renamed from: X.4vi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C125184vi extends F9E {
    public final C125244vo LJLIL;
    public final NLETrackSlot LJLILLLLZI;
    public final NLEModel LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    public C125184vi(C125244vo c125244vo, NLETrackSlot operatedSlot, NLEModel nLEModel) {
        o.LJIIIZ(operatedSlot, "operatedSlot");
        this.LJLIL = c125244vo;
        this.LJLILLLLZI = operatedSlot;
        this.LJLJI = nLEModel;
    }
}
