package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.o;

/* renamed from: X.4wZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C125714wZ extends F9E {
    public final NLETrackSlot LJLIL;
    public final NLETrackSlot LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public C125714wZ(NLETrackSlot preSlot, NLETrackSlot postSlot) {
        o.LJIIIZ(preSlot, "preSlot");
        o.LJIIIZ(postSlot, "postSlot");
        this.LJLIL = preSlot;
        this.LJLILLLLZI = postSlot;
    }
}
