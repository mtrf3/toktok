package com.ss.android.ugc.aweme.nows.limit.ui;

import X.C16880lQ;
import X.C196367nE;
import X.C197267og;
import X.C221108m2;
import X.C32151Nz;
import X.C61122aa;
import X.C62822Ol8;
import X.C78939UyV;
import X.C7MK;
import X.C7MY;
import X.C90193gN;
import X.EnumC86195XsF;
import X.MCQ;
import X.S3I;
import X.S3L;
import X.W5F;
import X.W5U;
import android.graphics.drawable.Drawable;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowPostAggregationPowerCell extends PowerCell<C61122aa> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 668));
    public final C62822Ol8 LJLILLLLZI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.byb;
    }

    public NowPostAggregationPowerCell() {
        C221108m2.LIZIZ(new AqS153S0100000_3(this, 667));
        C221108m2.LIZIZ(new AqS153S0100000_3(this, 670));
        C221108m2.LIZIZ(new AqS153S0100000_3(this, 666));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 669));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C61122aa c61122aa) {
        C61122aa item = c61122aa;
        o.LJIIIZ(item, "item");
        super.onBindItemView(item);
        C7MK.LJI("video_play", new AqS134S0200000_3(this, item, 208));
        C7MK.LJI("now_button_action", new AqS134S0200000_3(this, item, 209));
        W5F LJII = W5U.LJII(C78939UyV.LJ(null));
        C196367nE.LIZ.getClass();
        LJII.LJIJI = C196367nE.LIZIZ();
        S3I s3i = new S3I();
        s3i.LIZLLL = C32151Nz.LJIIZILJ(28);
        LJII.LJIJJLI = new S3L(s3i);
        LJII.LJIILIIL = (Drawable) this.LJLILLLLZI.getValue();
        LJII.LIZJ = this.itemView.getContext();
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-coverIv>(...)");
        LJII.LJJIIJ = (SmartImageView) value;
        C16880lQ.LLJJJ(LJII);
        new MCQ(C7MY.LIZIZ(72), C7MY.LIZIZ(3), Integer.valueOf(R.attr.d4), 4, 0.7f, 0.5f, R.attr.ed, R.attr.cl, Boolean.valueOf(C90193gN.LIZIZ(this.itemView.getContext())), EnumC86195XsF.NUMBER_TAIL, false, 2048);
        o.LJIIIIZZ(this.itemView.getContext(), "itemView.context");
        new C197267og(null, 0);
        throw null;
    }
}
