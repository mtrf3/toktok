package X;

import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;

/* renamed from: X.H0n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43373H0n<T> implements InterfaceC86003Zc {
    public static final C43373H0n<T> LJLIL = new C43373H0n<>();

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<UploadAuthKeyConfig> interfaceC73573Su9) {
        C43374H0o c43374H0o = new C43374H0o((C73433Srt) interfaceC73573Su9);
        C76L<VideoCreation> LIZJ = C60903NvH.LJIIJJI().getPublishService().LJJIJIIJI().LIZJ(null);
        LIZJ.LJFF(new RunnableC65751PrH(LIZJ, c43374H0o), EnumC169566l6.LJLIL);
    }
}
