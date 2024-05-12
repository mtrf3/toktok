package com.ss.android.ugc.aweme.music.artist.powerlist;

import X.C025908h;
import X.C221108m2;
import X.C239959bL;
import X.C62822Ol8;
import X.C88913eJ;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionIconHideTextMinimumDimensionSetting;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ArtistMusicAwemeLisHintCell extends PowerCell<C239959bL> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS154S0100000_4(this, SubscriptionIconHideTextMinimumDimensionSetting.DEFAULT));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.bum;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C239959bL c239959bL) {
        C239959bL t = c239959bL;
        o.LJIIIZ(t, "t");
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-tvHint>(...)");
        C025908h.LJ(new Object[]{t.LJLIL}, 1, C88913eJ.LIZ(this.itemView, R.string.gcz, "itemView.context.getStri…eaturedVideo_description)"), "format(format, *args)", (TuxTextView) value);
    }
}
