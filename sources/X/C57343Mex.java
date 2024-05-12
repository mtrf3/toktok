package X;

import com.ss.android.ugc.aweme.music.model.MusicDetail;
import kotlin.jvm.internal.o;

/* renamed from: X.Mex, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57343Mex extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC57356MfA<C57346Mf0>, MusicDetail, C57346Mf0> {
    public static final C57343Mex LJLIL = new C57343Mex();

    public C57343Mex() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C57346Mf0 invoke(InterfaceC57356MfA<C57346Mf0> interfaceC57356MfA, MusicDetail musicDetail) {
        MusicDetail musicDetail2 = musicDetail;
        o.LJIIIZ(interfaceC57356MfA, "<anonymous parameter 0>");
        if (musicDetail2 != null) {
            return new C57346Mf0(musicDetail2);
        }
        return null;
    }
}
