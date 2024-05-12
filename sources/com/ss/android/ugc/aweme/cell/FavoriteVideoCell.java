package com.ss.android.ugc.aweme.cell;

import X.C06490Nh;
import X.C16880lQ;
import X.C214298b3;
import X.C63044Ooi;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72090SRa;
import X.C72091SRb;
import X.C72092SRc;
import X.C72093SRd;
import X.C72094SRe;
import X.C9BD;
import X.C9BE;
import X.C9QW;
import X.C9XN;
import X.InterfaceC65784Pro;
import X.InterfaceC93923mO;
import X.SRZ;
import X.YE1;
import Y.ACListenerS32S0100000_12;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.viewmodel.MentionFavoriteVideoVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class FavoriteVideoCell extends BaseVideoCell<C9QW> {
    public final String LJLLI = "FavoriteVideoCell";
    public final C214298b3 LJLLILLLL;

    public final MentionFavoriteVideoVM U() {
        return (MentionFavoriteVideoVM) this.LJLLILLLL.getValue();
    }

    public FavoriteVideoCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MentionFavoriteVideoVM.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 110);
        C72092SRc c72092SRc = C72092SRc.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, C72090SRa.INSTANCE, new AqS162S0100000_12((InterfaceC93923mO) this, 111), new AqS162S0100000_12((InterfaceC93923mO) this, 112), C72094SRe.INSTANCE, c72092SRc, new AqS162S0100000_12((InterfaceC93923mO) this, 113), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, C72091SRb.INSTANCE, new AqS162S0100000_12((InterfaceC93923mO) this, 114), new AqS162S0100000_12((InterfaceC93923mO) this, 105), C72093SRd.INSTANCE, c72092SRc, new AqS162S0100000_12((InterfaceC93923mO) this, 106), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, SRZ.INSTANCE, new AqS162S0100000_12((InterfaceC93923mO) this, 107), new AqS162S0100000_12((InterfaceC93923mO) this, 108), new AqS162S0100000_12((InterfaceC93923mO) this, 109), c72092SRc, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLLILLLL = c214298b3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        C16880lQ.LJJIJLIJ(N(), new ACListenerS32S0100000_12(this, 29));
        C16880lQ.LJJJJ(L(), new ACListenerS32S0100000_12(this, 30));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C9QW c9qw) {
        UrlModel urlModel;
        C9QW t = c9qw;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        Aweme aweme = t.LJLIL;
        o.LJIIIZ(aweme, "<set-?>");
        this.LJLJL = aweme;
        Q(t);
        Video video = t.LJLIL.getVideo();
        if (video != null) {
            urlModel = video.getCover();
        } else {
            urlModel = null;
        }
        String str = this.LJLLI;
        Aweme aweme2 = this.LJLJL;
        if (aweme2 != null) {
            T(urlModel, str, aweme2);
        } else {
            o.LJIJI("mData");
            throw null;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View LIZIZ = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.bsn, viewGroup, false);
        View findViewById = LIZIZ.findViewById(R.id.cover);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.cover)");
        this.LJLIL = (SmartImageView) findViewById;
        View findViewById2 = LIZIZ.findViewById(R.id.b_o);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.checkbox)");
        this.LJLJJL = (C63044Ooi) findViewById2;
        View findViewById3 = LIZIZ.findViewById(R.id.n66);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.video_info_container)");
        this.LJLJJI = (ViewGroup) findViewById3;
        View findViewById4 = LIZIZ.findViewById(R.id.me4);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.tv_play_count)");
        this.LJLJI = (TuxTextView) findViewById4;
        View findViewById5 = LIZIZ.findViewById(R.id.n54);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.video_cover_mask)");
        this.LJLJJLL = findViewById5;
        return LIZIZ;
    }
}
