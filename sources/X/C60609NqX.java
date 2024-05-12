package X;

import com.weekend.recorder.api.IAutoRecorder;

/* renamed from: X.NqX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60609NqX extends AbstractC65781Prl implements InterfaceC65784Pro<IAutoRecorder> {
    public static final C60609NqX LJLIL = new C60609NqX();

    public C60609NqX() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IAutoRecorder invoke() {
        try {
            Object newInstance = Class.forName("com.weekend.recorder.RecorderWrapper").newInstance();
            if (newInstance != null) {
                return (IAutoRecorder) newInstance;
            }
            throw new C37692Eqm("null cannot be cast to non-null type com.weekend.recorder.api.IAutoRecorder");
        } catch (Exception unused) {
            return null;
        }
    }
}
