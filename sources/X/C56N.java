package X;

import com.ss.android.vesdk.VERTAudioWaveformMgr;
import com.ss.android.vesdk.VEUtils;

/* renamed from: X.56N, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C56N extends AbstractC65781Prl implements InterfaceC65784Pro<VERTAudioWaveformMgr> {
    public static final C56N LJLIL = new C56N();

    public C56N() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final VERTAudioWaveformMgr invoke() {
        return VEUtils.createRTAudioWaveformMgr(2, 2, 44100, 33.0f, 2);
    }
}
