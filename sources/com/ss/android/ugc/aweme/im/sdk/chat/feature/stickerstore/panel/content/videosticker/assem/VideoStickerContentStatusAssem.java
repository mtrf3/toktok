package com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.assem;

import X.C2068389v;
import X.C214298b3;
import X.C221108m2;
import X.C223338pd;
import X.C32151Nz;
import X.C47704Ins;
import X.C55749LuL;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C73306Spq;
import X.C78926UyI;
import X.C86463XwZ;
import X.C88033ct;
import X.C8YN;
import X.C9BE;
import X.EnumC87003bE;
import X.TBT;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.viewmodel.VideoStickerContentViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.AqS197S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class VideoStickerContentStatusAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public final C55749LuL LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;

    public VideoStickerContentStatusAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoStickerContentViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 365), C86463XwZ.INSTANCE, null);
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LJ(this, C88033ct.class, "sticker_store_video_sticker_content_config"), checkSupervisorPrepared());
        this.LJLJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 366));
        this.LJLJJI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 375));
    }

    public final C223338pd E3() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-loadingView>(...)");
        return (C223338pd) value;
    }

    public final C73305Spp F3() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-statusView>(...)");
        return (C73305Spp) value;
    }

    public final VideoStickerContentViewModel x3() {
        return (VideoStickerContentViewModel) this.LJLIL.getValue();
    }

    public final C73306Spq A3() {
        String str;
        String string;
        F3().setTopMargin(C32151Nz.LJIIZILJ(110));
        C73306Spq c73306Spq = new C73306Spq();
        Context context = getContext();
        String str2 = "";
        if (context == null || (str = context.getString(R.string.tl8)) == null) {
            str = "";
        }
        c73306Spq.LJFF = str;
        Context context2 = getContext();
        if (context2 != null && (string = context2.getString(R.string.tl7)) != null) {
            str2 = string;
        }
        c73306Spq.LJI = str2;
        return c73306Spq;
    }

    public final C73306Spq C3() {
        String str;
        String string;
        F3().setTopMargin(C32151Nz.LJIIZILJ(86));
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
        c73306Spq.LJIIIIZZ = new AqS181S0100000_15(this, 58);
        return c73306Spq;
    }

    public static boolean v3(Integer num) {
        int type = EnumC87003bE.OTHERS_PROFILE_FROM_STICKER_STORE.getType();
        if (num != null && num.intValue() == type) {
            return true;
        }
        int type2 = EnumC87003bE.OTHERS_PROFILE_NOT_FROM_STICKER_STORE.getType();
        if (num != null && num.intValue() == type2) {
            return true;
        }
        int type3 = EnumC87003bE.PERSONAL_PROFILE_NOT_FROM_STICKER_STORE.getType();
        if (num != null && num.intValue() == type3) {
            return true;
        }
        int type4 = EnumC87003bE.PERSONAL_PROFILE_FROM_STICKER_STORE.getType();
        if (num != null && num.intValue() == type4) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        AssemViewModel.asyncSubscribe$default(x3(), new TBT() { // from class: X.XcH
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C87483c0 c87483c0 = (C87483c0) obj;
                c87483c0.getClass();
                return C208708Ha.LIZLLL(c87483c0);
            }
        }, null, new AqS181S0100000_15(this, 59), new AqS165S0100000_15(this, 376), new AqS181S0100000_15(this, 60), 2, null);
        C8YN.LJII(this, x3(), new TBT() { // from class: X.XcI
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C87483c0 c87483c0 = (C87483c0) obj;
                c87483c0.getClass();
                return C208708Ha.LIZ(c87483c0);
            }
        }, null, new AqS197S0100000_15(this, 15), 6);
    }
}
