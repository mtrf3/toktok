package X;

import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;

/* renamed from: X.H0q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43376H0q<T> implements InterfaceC86003Zc {
    public static final C43376H0q<T> LJLIL = new C43376H0q<>();

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<UploadAuthKeyConfig> interfaceC73573Su9) {
        C43375H0p c43375H0p = new C43375H0p((C73433Srt) interfaceC73573Su9);
        C76L<VideoCreation> LIZJ = C60903NvH.LJIIJJI().getPublishService().LJJIJIIJI().LIZJ(null);
        LIZJ.LJFF(new RunnableC65751PrH(LIZJ, c43375H0p), EnumC169566l6.LJLIL);
    }
}
