package com.ss.android.ugc.aweme.cell;

import X.C04270Et;
import X.C04330Ez;
import X.C16880lQ;
import X.C221108m2;
import X.C62822Ol8;
import X.C63044Ooi;
import X.C77123UOp;
import X.C78939UyV;
import X.C9QW;
import X.J7H;
import X.W5F;
import X.W5U;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class BaseVideoCell<T> extends PowerCell<C9QW> {
    public SmartImageView LJLIL;
    public Drawable LJLILLLLZI;
    public TuxTextView LJLJI;
    public ViewGroup LJLJJI;
    public C63044Ooi LJLJJL;
    public View LJLJJLL;
    public Aweme LJLJL;
    public final IAVPublishService LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final String LJLL;

    public final C63044Ooi L() {
        C63044Ooi c63044Ooi = this.LJLJJL;
        if (c63044Ooi != null) {
            return c63044Ooi;
        }
        o.LJIJI("mCheckBox");
        throw null;
    }

    public final Context M() {
        return (Context) this.LJLJLLL.getValue();
    }

    public final SmartImageView N() {
        SmartImageView smartImageView = this.LJLIL;
        if (smartImageView != null) {
            return smartImageView;
        }
        o.LJIJI("mCoverView");
        throw null;
    }

    public final TuxTextView P() {
        TuxTextView tuxTextView = this.LJLJI;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        o.LJIJI("tvtPlayCount");
        throw null;
    }

    public BaseVideoCell() {
        IAVPublishService publishService = AVExternalServiceImpl.LIZ().publishService();
        this.LJLJLJ = publishService;
        this.LJLJLLL = C221108m2.LIZIZ(new AqS162S0100000_12((BaseVideoCell) this, 104));
        this.LJLL = publishService.getCurrentUserId();
    }

    public final void Q(C9QW t) {
        long j;
        o.LJIIIZ(t, "t");
        AwemeStatistics statistics = t.LJLIL.getStatistics();
        P().setVisibility(0);
        if (statistics != null) {
            j = statistics.getPlayCount();
        } else {
            j = 0;
        }
        String LJJIIJ = C77123UOp.LJJIIJ(j);
        if (this.LJLILLLLZI == null) {
            this.LJLILLLLZI = C04270Et.LIZIZ(M(), R.drawable.byd);
        }
        P().setCompoundDrawablesRelativeWithIntrinsicBounds(this.LJLILLLLZI, (Drawable) null, (Drawable) null, (Drawable) null);
        P().setText(LJJIIJ);
        P().setTextColor(C04330Ez.LIZIZ(M(), R.color.ar));
        P().setTuxFont(72);
    }

    public final void T(UrlModel urlModel, String str, Aweme aweme) {
        W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
        int[] LIZ = J7H.LIZ(200);
        if (LIZ != null) {
            LJII.LJIILIIL(LIZ);
        }
        LJII.LJJIIJ = N();
        LJII.LIZIZ(str);
        C16880lQ.LLJJJ(LJII);
        if (aweme.getVideo() != null && !e1.LIZ(31744, "enable_reuse_external_image_include_static_image", true, true)) {
            aweme.getVideo().setCachedOuterCoverUrl(urlModel);
            aweme.getVideo().setCachedOuterCoverSize(LIZ);
        }
    }
}
