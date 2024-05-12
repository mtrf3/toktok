package X;

import com.ss.android.ugc.aweme.audio.copyrightdetect.AudioCopyrightDetectAPI;

/* renamed from: X.3VS, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3VS extends AbstractC65781Prl implements InterfaceC65784Pro<AudioCopyrightDetectAPI.MusicCheckApi> {
    public static final C3VS LJLIL = new C3VS();

    public C3VS() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.audio.copyrightdetect.AudioCopyrightDetectAPI$MusicCheckApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final AudioCopyrightDetectAPI.MusicCheckApi invoke() {
        return C169696lJ.LIZ(C60903NvH.LJIIJJI().getNetworkService(), true, AudioCopyrightDetectAPI.MusicCheckApi.class);
    }
}
