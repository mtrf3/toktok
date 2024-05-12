package X;

import com.ss.android.ugc.aweme.music.model.MusicDetail;
import kotlin.jvm.internal.o;

/* renamed from: X.Mew, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57342Mew extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC57356MfA<C57338Mes>, MusicDetail, C57338Mes> {
    public static final C57342Mew LJLIL = new C57342Mew();

    public C57342Mew() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C57338Mes invoke(InterfaceC57356MfA<C57338Mes> interfaceC57356MfA, MusicDetail musicDetail) {
        MusicDetail musicDetail2 = musicDetail;
        o.LJIIIZ(interfaceC57356MfA, "<anonymous parameter 0>");
        if (musicDetail2 != null) {
            return new C57338Mes(musicDetail2);
        }
        return null;
    }
}
