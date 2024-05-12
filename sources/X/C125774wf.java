package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;

/* renamed from: X.4wf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C125774wf {
    public final NLETrackSlot LIZ;
    public final String LIZIZ;

    public C125774wf(NLETrackSlot nLETrackSlot) {
        Long l;
        this.LIZ = nLETrackSlot;
        if (nLETrackSlot != null) {
            C124574uj.LJJJJZI(nLETrackSlot);
            l = Long.valueOf(nLETrackSlot.getId());
        } else {
            l = null;
        }
        this.LIZIZ = String.valueOf(l);
    }
}
