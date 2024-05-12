package com.ss.android.ugc.aweme.story.feed.immersive.gallery;

import X.C06460Ne;
import X.C110614Vt;
import X.C16880lQ;
import X.C189717cV;
import X.C214298b3;
import X.C223358pf;
import X.C223368pg;
import X.C223378ph;
import X.C223388pi;
import X.C223408pk;
import X.C223418pl;
import X.C65352Pkq;
import X.C65776Prg;
import X.C74291TDr;
import X.C77339UWx;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC65784Pro;
import X.InterfaceC93923mO;
import Y.ACListenerS23S0100000_3;
import android.graphics.drawable.Drawable;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryGalleryCoverCell extends PowerCell<C189717cV> {
    public final C214298b3 LJLIL;
    public C74291TDr LJLILLLLZI;
    public SmartImageView LJLJI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.co8;
    }

    public final Drawable L() {
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.d_);
        return C06460Ne.LIZ(this.itemView, "itemView.context", c110614Vt);
    }

    public StoryGalleryCoverCell() {
        C214298b3 c214298b3;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(StoryGalleryListViewModel.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ, 991);
        C223388pi c223388pi = C223388pi.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C223368pg.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 992), new AqS153S0100000_3((InterfaceC93923mO) this, 993), C223418pl.INSTANCE, c223388pi, new AqS153S0100000_3((InterfaceC93923mO) this, 994), 256);
        } else if (o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C223378ph.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 995), new AqS153S0100000_3((InterfaceC93923mO) this, 986), C223408pk.INSTANCE, c223388pi, new AqS153S0100000_3((InterfaceC93923mO) this, 987), 256);
        } else if (c9bd == null || o.LJ(c9bd, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C223358pf.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 988), new AqS153S0100000_3((InterfaceC93923mO) this, 989), new AqS153S0100000_3((InterfaceC93923mO) this, 990), c223388pi, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(C77339UWx.LIZLLL("Don't support this VMScope: ", c9bd, " there"));
        }
        this.LJLIL = c214298b3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LJLILLLLZI = (C74291TDr) this.itemView.findViewById(R.id.ilw);
        this.LJLJI = (SmartImageView) this.itemView.findViewById(R.id.bxv);
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 156), this.itemView);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L10;
     */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.C189717cV r5, java.util.List r6) {
        /*
            r4 = this;
            X.7cV r5 = (X.C189717cV) r5
            java.lang.String r0 = "t"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r0 = "payloads"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            super.onBindItemView(r5, r6)
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r5.LJLIL
            X.8nM r0 = r5.LJLILLLLZI
            r1 = 0
            if (r0 == 0) goto L61
            X.HLp r2 = X.C43921HLp.LIZ
            java.lang.String r1 = r3.getScheduleId()
            java.lang.String r0 = "aweme.scheduleId"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2.getClass()
            java.util.Map<java.lang.String, android.graphics.Bitmap> r0 = X.C43921HLp.LJIIIZ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r1 = r0.get(r1)
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            if (r1 == 0) goto L3b
            com.bytedance.lighten.loader.SmartImageView r0 = r4.LJLJI
            if (r0 == 0) goto L3b
            r0.setImageBitmap(r1)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L46
        L3b:
            com.bytedance.lighten.loader.SmartImageView r1 = r4.LJLJI
            if (r1 == 0) goto L46
            android.graphics.drawable.Drawable r0 = r4.L()
            r1.setImageDrawable(r0)
        L46:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.LJLIL
            boolean r0 = r0.shouldShowReviewStatus()
            if (r0 != 0) goto L54
            X.8nM r1 = r5.LJLILLLLZI
            X.8nM r0 = X.EnumC221928nM.FAILED
            if (r1 != r0) goto L5f
        L54:
            r1 = 1
        L55:
            X.TDr r0 = r4.LJLILLLLZI
            if (r0 == 0) goto L5e
            r0.LJLIL = r1
            r0.invalidate()
        L5e:
            return
        L5f:
            r1 = 0
            goto L55
        L61:
            boolean r0 = r3.shouldShowReviewStatus()
            if (r0 != 0) goto L6d
            boolean r0 = X.C78555UsJ.LJJIII(r3)
            if (r0 == 0) goto L79
        L6d:
            com.bytedance.lighten.loader.SmartImageView r1 = r4.LJLJI
            if (r1 == 0) goto L46
            android.graphics.drawable.Drawable r0 = r4.L()
            r1.setImageDrawable(r0)
            goto L46
        L79:
            com.ss.android.ugc.aweme.feed.model.Video r0 = r3.getVideo()
            if (r0 == 0) goto L83
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r0.getCover()
        L83:
            com.ss.android.ugc.aweme.base.ImageUrlModel r0 = X.C78939UyV.LJ(r1)
            X.W5F r1 = X.W5U.LJII(r0)
            com.bytedance.lighten.loader.SmartImageView r0 = r4.LJLJI
            r1.LJJIIJ = r0
            android.graphics.drawable.Drawable r0 = r4.L()
            r1.LJIILLIIL = r0
            X.8pj r0 = new X.8pj
            r0.<init>()
            r1.LIZLLL(r0)
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryCoverCell.onBindItemView(X.Mm4, java.util.List):void");
    }
}
