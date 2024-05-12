package com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.assem;

import X.C2068389v;
import X.C214298b3;
import X.C221108m2;
import X.C32151Nz;
import X.C47704Ins;
import X.C55749LuL;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C73306Spq;
import X.C78926UyI;
import X.C88033ct;
import X.C8YN;
import X.C94343n4;
import X.C9BE;
import X.InterfaceC65350Pko;
import X.TBT;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.viewmodel.StickerSetContentViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class StickerSetContentStatusAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public final C55749LuL LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;

    public StickerSetContentStatusAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(StickerSetContentViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 182), C94343n4.INSTANCE, null);
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LJ(this, C88033ct.class, "sticker_store_sticker_set_content_config"), checkSupervisorPrepared());
        this.LJLJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 183));
        this.LJLJJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 180));
    }

    public final C73305Spp A3() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-statusView>(...)");
        return (C73305Spp) value;
    }

    public final StickerSetContentViewModel v3() {
        return (StickerSetContentViewModel) this.LJLIL.getValue();
    }

    public final C73306Spq x3() {
        String str;
        String string;
        A3().setTopMargin(C32151Nz.LJIIZILJ(96));
        C73306Spq c73306Spq = new C73306Spq();
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_2pt_sticker;
        c2068389v.LJ = Integer.valueOf(R.attr.gp);
        c73306Spq.LIZJ = 0;
        c73306Spq.LIZIZ = c2068389v;
        Context context = getContext();
        String str2 = "";
        if (context == null || (str = context.getString(R.string.rod)) == null) {
            str = "";
        }
        c73306Spq.LJFF = str;
        Context context2 = getContext();
        if (context2 != null && (string = context2.getString(R.string.roc)) != null) {
            str2 = string;
        }
        c73306Spq.LJI = str2;
        return c73306Spq;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        AssemViewModel.asyncSubscribe$default(v3(), new TBT() { // from class: X.3n2
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C87503c2 c87503c2 = (C87503c2) obj;
                c87503c2.getClass();
                return C208708Ha.LIZLLL(c87503c2);
            }
        }, null, new AqS167S0100000_1(this, 81), new AqS151S0100000_1(this, 181), new AqS167S0100000_1(this, 82), 2, null);
        C8YN.LJII(this, v3(), new TBT() { // from class: X.3n3
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C87503c2 c87503c2 = (C87503c2) obj;
                c87503c2.getClass();
                return C208708Ha.LIZ(c87503c2);
            }
        }, null, new AqS183S0100000_1(this, 10), 6);
    }
}
