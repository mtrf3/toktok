package X;

import android.view.View;
import com.ss.android.ugc.aweme.avatar.SocialAvatarEntry;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L6I implements InterfaceC19530ph {
    public final /* synthetic */ SocialAvatarEntry LIZ;

    public L6I(SocialAvatarEntry socialAvatarEntry) {
        this.LIZ = socialAvatarEntry;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC19530ph
    public final void LIZ(View view, String itemID) {
        L6R l6r;
        o.LJIIIZ(itemID, "itemID");
        if (!(view instanceof L6R) || (l6r = (L6R) view) == null) {
            return;
        }
        SocialAvatarEntry socialAvatarEntry = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ.LJLIL.getTagName());
        LIZ.append("_show");
        socialAvatarEntry.LJIIIZ(X1D.LIZIZ(LIZ), l6r.getMode());
    }
}
