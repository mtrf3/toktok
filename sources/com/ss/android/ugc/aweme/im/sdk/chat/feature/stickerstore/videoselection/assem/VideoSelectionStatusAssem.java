package com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.videoselection.assem;

import X.C2068389v;
import X.C214298b3;
import X.C221108m2;
import X.C32151Nz;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C73306Spq;
import X.C78926UyI;
import X.C87523c4;
import X.C9BE;
import X.InterfaceC65350Pko;
import X.TBT;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.videoselection.viewmodel.VideoSelectionViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class VideoSelectionStatusAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    public VideoSelectionStatusAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoSelectionViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 282), C87523c4.INSTANCE, null);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 283));
        this.LJLJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 280));
    }

    public final C73305Spp x3() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-statusView>(...)");
        return (C73305Spp) value;
    }

    public final C73306Spq v3() {
        String str;
        String string;
        x3().setTopMargin(C32151Nz.LJIIZILJ(128));
        C73306Spq c73306Spq = new C73306Spq();
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_large_refresh;
        c2068389v.LJ = Integer.valueOf(R.attr.go);
        c73306Spq.LIZJ = 0;
        c73306Spq.LIZIZ = c2068389v;
        Context context = getContext();
        String str2 = "";
        if (context == null || (str = context.getString(R.string.dte)) == null) {
            str = "";
        }
        c73306Spq.LJFF = str;
        Context context2 = getContext();
        if (context2 != null && (string = context2.getString(R.string.dtb)) != null) {
            str2 = string;
        }
        c73306Spq.LJI = str2;
        c73306Spq.LJIIIIZZ = new AqS167S0100000_1(this, 109);
        return c73306Spq;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.3c3
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C87473bz c87473bz = (C87473bz) obj;
                c87473bz.getClass();
                return C208708Ha.LIZLLL(c87473bz);
            }
        }, null, new AqS167S0100000_1(this, 110), new AqS151S0100000_1(this, 281), new AqS167S0100000_1(this, 111), 2, null);
    }
}
