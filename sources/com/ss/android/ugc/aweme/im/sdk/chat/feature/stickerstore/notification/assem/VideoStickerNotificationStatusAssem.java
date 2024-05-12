package com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.notification.assem;

import X.C2068389v;
import X.C214298b3;
import X.C221108m2;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C73306Spq;
import X.C78926UyI;
import X.C9BE;
import X.C9RV;
import X.TBT;
import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionIconHideTextMinimumDimensionSetting;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.notification.viewmodel.VideoStickerNotificationUserViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class VideoStickerNotificationStatusAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    public VideoStickerNotificationStatusAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoStickerNotificationUserViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 363), C9RV.INSTANCE, null);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 364));
        this.LJLJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 361));
    }

    public final C73306Spq v3() {
        String str;
        String string;
        C73306Spq c73306Spq = new C73306Spq();
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_large_refresh;
        c2068389v.LJ = Integer.valueOf(R.attr.go);
        c73306Spq.LIZJ = 0;
        c73306Spq.LIZIZ = c2068389v;
        Context context = getContext();
        String str2 = "";
        if (context == null || (str = context.getString(R.string.f3g)) == null) {
            str = "";
        }
        c73306Spq.LJFF = str;
        Context context2 = getContext();
        if (context2 != null && (string = context2.getString(R.string.f3f)) != null) {
            str2 = string;
        }
        c73306Spq.LJI = str2;
        c73306Spq.LJIIIIZZ = new AqS170S0100000_4(this, 389);
        return c73306Spq;
    }

    public final C73305Spp x3() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-statusView>(...)");
        return (C73305Spp) value;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.9RU
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C87493c1 c87493c1 = (C87493c1) obj;
                c87493c1.getClass();
                return C208708Ha.LIZLLL(c87493c1);
            }
        }, null, new AqS170S0100000_4(this, SubscriptionIconHideTextMinimumDimensionSetting.DEFAULT), new AqS154S0100000_4(this, 362), new AqS170S0100000_4(this, 391), 2, null);
    }
}
