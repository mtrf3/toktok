package X;

import com.ss.android.vesdk.VERTAudioWaveformMgr;
import com.ss.android.vesdk.VEUtils;

/* renamed from: X.56O, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C56O extends AbstractC65781Prl implements InterfaceC65784Pro<VERTAudioWaveformMgr> {
    public static final C56O LJLIL = new C56O();

    public C56O() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final VERTAudioWaveformMgr invoke() {
        return VEUtils.createRTAudioWaveformMgr(2, 1, 44100, 33.0f, 2);
    }
}
