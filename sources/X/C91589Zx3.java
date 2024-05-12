package X;

import com.ss.android.ugc.aweme.dsp.playpage.model.DspMusicPlayedInfo;

/* renamed from: X.Zx3, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91589Zx3 extends AbstractC65781Prl implements InterfaceC65784Pro<IUT<DspMusicPlayedInfo>> {
    public static final C91589Zx3 LJLIL = new C91589Zx3();

    public C91589Zx3() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IUT<DspMusicPlayedInfo> invoke() {
        YBK.LIZ.getClass();
        return new IUT<>(YBK.LIZ().feedbackConfig.getRingBufferSize());
    }
}
