package X;

import com.ss.android.ugc.aweme.avatar.SocialAvatarEntry;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L6K<T> implements InterfaceC04760Gq {
    public final /* synthetic */ SocialAvatarEntry LIZ;

    public L6K(SocialAvatarEntry socialAvatarEntry) {
        this.LIZ = socialAvatarEntry;
    }

    @Override // X.InterfaceC04760Gq
    public final void onResult(Object obj) {
        C53691L5j c53691L5j;
        C0GY it = (C0GY) obj;
        o.LJIIIIZZ(it, "it");
        L6M.LIZIZ = it;
        L6R l6r = this.LIZ.LJLILLLLZI;
        if (!(l6r instanceof C53691L5j) || (c53691L5j = (C53691L5j) l6r) == null) {
            return;
        }
        c53691L5j.setLottieComposition(it);
    }
}
