package X;

import android.graphics.Bitmap;
import android.view.View;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import defpackage.e1;

/* renamed from: X.8Gc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC208468Gc extends AbstractC208618Gr<Aweme> {
    public C8GU LJLJJLL;
    public final C208488Ge LJLJL;

    public boolean N() {
        return false;
    }

    public int[] P() {
        return J7H.LIZ(200);
    }

    public void Q() {
        if (!this.LJLJJI && e1.LIZ(31744, "stop_main_anim_when_invisible", true, false)) {
            this.LJLILLLLZI.LJFF();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.8Ge] */
    public AbstractC208468Gc(View view) {
        super(view);
        this.LJLJL = new W61() { // from class: X.8Ge
            @Override // X.W61
            public final void LIZ() {
                AbstractC208468Gc.this.Q();
            }

            @Override // X.W61
            public final void LIZIZ() {
                AbstractC208468Gc.this.getClass();
            }
        };
    }

    public boolean U(Video video, String str) {
        return V(video, str, null, N());
    }

    public final void T(UrlModel urlModel, String str, Bitmap.Config config, SIR sir) {
        W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
        int[] P = P();
        if (P != null) {
            LJII.LJIILIIL(P);
        }
        if ("AwemeViewHolder".equals(str) && C8I5.LIZ()) {
            LJII.LJJIII = EnumC62195Ob1.CUSTOM;
            LJII.LJJJ = "profile_post_img";
        }
        LJII.LJJIIJ = this.LJLILLLLZI;
        LJII.LIZIZ(str);
        if (config != null) {
            LJII.LJIJI = config;
        }
        if (sir != null) {
            LJII.LJJIZ = sir;
        }
        if (N()) {
            LJII.LJ();
        } else {
            C16880lQ.LLJJJ(LJII);
        }
        Aweme aweme = this.LJLIL;
        if (aweme != null && aweme.getVideo() != null && !e1.LIZ(31744, "enable_reuse_external_image_include_static_image", true, true)) {
            this.LJLIL.getVideo().setCachedOuterCoverUrl(urlModel);
            this.LJLIL.getVideo().setCachedOuterCoverSize(P);
        }
    }

    public final boolean V(Video video, String str, Bitmap.Config config, boolean z) {
        if (L() && C208458Gb.LIZIZ(this.LJLILLLLZI, video, str, true, this.LJLJJLL, null, true, config, false, z)) {
            return true;
        }
        return false;
    }
}
