package X;

import com.bytedance.ies.nle.editor_jni.NLETrack;
import kotlin.jvm.internal.o;

/* renamed from: X.51S, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C51S extends AbstractC65781Prl implements InterfaceC88472Yns<NLETrack, Boolean> {
    public static final C51S LJLIL = new C51S();

    public C51S() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(NLETrack nLETrack) {
        boolean z;
        NLETrack audioTrack = nLETrack;
        o.LJIIIZ(audioTrack, "audioTrack");
        if (C124574uj.LJJIL(audioTrack) || C124574uj.LJJJ(audioTrack) || C124574uj.LJJJJLL(audioTrack) || C124574uj.LJJIJIL(audioTrack)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
