package X;

import com.ss.android.ugc.gamora.editor.audio.copyrightdetect.longvideo.LongAudioCopyrightDetectAPI;

/* renamed from: X.3VQ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3VQ extends AbstractC65781Prl implements InterfaceC65784Pro<LongAudioCopyrightDetectAPI.Api> {
    public static final C3VQ LJLIL = new C3VQ();

    public C3VQ() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.gamora.editor.audio.copyrightdetect.longvideo.LongAudioCopyrightDetectAPI$Api, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final LongAudioCopyrightDetectAPI.Api invoke() {
        return C169696lJ.LIZ(C60903NvH.LJIIJJI().getNetworkService(), true, LongAudioCopyrightDetectAPI.Api.class);
    }
}
