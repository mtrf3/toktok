package X;

import android.text.Layout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* renamed from: X.84j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C2054184j extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public C2054184j(Object obj) {
        super(0, obj, C2054084i.class, "showOriginal", "showOriginal()V", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        Aweme aweme;
        C2054084i c2054084i = (C2054084i) this.receiver;
        VideoItemParams gv0 = c2054084i.LJLILLLLZI.gv0();
        if (gv0 != null && (aweme = gv0.getAweme()) != null && c2054084i.LJLZ.LIZ(aweme)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Desc: Trigger aid ");
            LIZ.append(aweme.getAid());
            LIZ.append(" turn back original source");
            C36922EeM.LIZLLL(4, "VideoDescView", X1D.LIZIZ(LIZ));
            if (c2054084i.LLF == null) {
                c2054084i.LJIIIIZZ(c2054084i.LJLLLL, aweme, false, AnonymousClass843.LIZJ(aweme));
            }
            Layout layout = c2054084i.LLF;
            if (layout != null) {
                c2054084i.LJLZ.LJI = false;
                c2054084i.LJIIJ(layout, c2054084i.LLFF);
            }
        }
        return C76800UCe.LIZ;
    }
}
