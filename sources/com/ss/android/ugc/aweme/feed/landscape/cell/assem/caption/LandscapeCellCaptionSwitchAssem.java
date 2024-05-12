package com.ss.android.ugc.aweme.feed.landscape.cell.assem.caption;

import X.ACR;
import X.AK4;
import X.AnonymousClass114;
import X.C16880lQ;
import X.C2068389v;
import X.C221108m2;
import X.C32151Nz;
import X.C41032G8m;
import X.C42625Go9;
import X.C45804HyK;
import X.C51029K0z;
import X.C62822Ol8;
import X.C79045V0n;
import X.C7MY;
import X.C86645XzV;
import X.C86670Xzu;
import X.EnumC86689Y0n;
import X.O6R;
import X.QD3;
import Y.ACListenerS24S0100000_4;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.service.CLACaptionAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class LandscapeCellCaptionSwitchAssem extends FeedBaseContentAssem<LandscapeCellCaptionSwitchAssem> {
    public final C62822Ol8 LJZL;
    public TuxIconView LL;

    public LandscapeCellCaptionSwitchAssem() {
        new LinkedHashMap();
        this.LJZL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 402));
    }

    public final boolean c4() {
        EnumC86689Y0n enumC86689Y0n;
        if (this.LJZL.getValue() == null) {
            return AK4.LIZ().LJI();
        }
        CLACaptionAbility cLACaptionAbility = (CLACaptionAbility) this.LJZL.getValue();
        if (cLACaptionAbility != null) {
            enumC86689Y0n = cLACaptionAbility.LLZLL();
        } else {
            enumC86689Y0n = null;
        }
        if (enumC86689Y0n == EnumC86689Y0n.COLLAPSED) {
            return true;
        }
        return false;
    }

    public static int b4() {
        if (C41032G8m.LIZ()) {
            return R.raw.icon_closed_captions;
        }
        return R.raw.icon_closed_caption;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        C42625Go9.LIZIZ(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void W3() {
        C42625Go9.LIZJ(this);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        if (C41032G8m.LIZ()) {
            TuxIconView tuxIconView = this.LL;
            if (tuxIconView != null) {
                Aweme aweme = item.getAweme();
                o.LJIIIIZZ(aweme, "item.aweme");
                tuxIconView.setTuxIcon(a4(aweme));
                return;
            }
            o.LJIJI("captionSwitch");
            throw null;
        }
        TuxIconView tuxIconView2 = this.LL;
        if (tuxIconView2 != null) {
            Aweme aweme2 = item.getAweme();
            o.LJIIIIZZ(aweme2, "item.aweme");
            tuxIconView2.setTuxIcon(Z3(aweme2));
            return;
        }
        o.LJIJI("captionSwitch");
        throw null;
    }

    public final C2068389v Z3(Aweme aweme) {
        C2068389v c2068389v;
        int i;
        Integer num = null;
        if (!C86670Xzu.LIZJ(aweme)) {
            c2068389v = new C2068389v();
            c2068389v.LIZ = b4();
            Context context = getContext();
            if (context != null) {
                num = C79045V0n.LJI(R.attr.dn, context);
            }
            c2068389v.LIZLLL = num;
            c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
            c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
        } else if (C86670Xzu.LJJIIZI() || c4()) {
            c2068389v = new C2068389v();
            c2068389v.LIZ = b4();
            Context context2 = getContext();
            if (context2 != null) {
                num = C79045V0n.LJI(R.attr.dj, context2);
            }
            c2068389v.LIZLLL = num;
            c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
            c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
        } else {
            c2068389v = new C2068389v();
            if (C41032G8m.LIZ()) {
                i = R.raw.icon_closed_captions_fill;
            } else {
                i = R.raw.icon_closed_caption_fill;
            }
            c2068389v.LIZ = i;
            Context context3 = getContext();
            if (context3 != null) {
                num = C79045V0n.LJI(R.attr.dj, context3);
            }
            c2068389v.LIZLLL = num;
            c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
            c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
        }
        return c2068389v;
    }

    public final C2068389v a4(Aweme aweme) {
        C2068389v c2068389v;
        int i;
        Integer num = null;
        if (!C86670Xzu.LJJIII(aweme)) {
            c2068389v = new C2068389v();
            c2068389v.LIZ = b4();
            Context context = getContext();
            if (context != null) {
                num = C79045V0n.LJI(R.attr.dn, context);
            }
            c2068389v.LIZLLL = num;
            c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
            c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
        } else if (!C86670Xzu.LJ(aweme)) {
            c2068389v = new C2068389v();
            c2068389v.LIZ = b4();
            Context context2 = getContext();
            if (context2 != null) {
                num = C79045V0n.LJI(R.attr.dj, context2);
            }
            c2068389v.LIZLLL = num;
            c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
            c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
        } else {
            c2068389v = new C2068389v();
            if (C41032G8m.LIZ()) {
                i = R.raw.icon_closed_captions_fill;
            } else {
                i = R.raw.icon_closed_caption_fill;
            }
            c2068389v.LIZ = i;
            Context context3 = getContext();
            if (context3 != null) {
                num = C79045V0n.LJI(R.attr.dj, context3);
            }
            c2068389v.LIZLLL = num;
            c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
            c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
        }
        return c2068389v;
    }

    public final void e4(int i) {
        Activity LJIJJ;
        Context context = getContext();
        if (context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null) {
            AnonymousClass114.LIZ(LJIJJ, i);
        }
    }

    @QD3
    public final void onAutogeneratedCaptionTempEvent(ACR captionToggleEvent) {
        o.LJIIIZ(captionToggleEvent, "captionToggleEvent");
        if (C41032G8m.LIZ()) {
            TuxIconView tuxIconView = this.LL;
            if (tuxIconView != null) {
                Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
                o.LJIIIIZZ(aweme, "item.aweme");
                tuxIconView.setTuxIcon(a4(aweme));
                return;
            }
            o.LJIJI("captionSwitch");
            throw null;
        }
        TuxIconView tuxIconView2 = this.LL;
        if (tuxIconView2 != null) {
            Aweme aweme2 = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
            o.LJIIIIZZ(aweme2, "item.aweme");
            tuxIconView2.setTuxIcon(Z3(aweme2));
            return;
        }
        o.LJIJI("captionSwitch");
        throw null;
    }

    @QD3
    public final void onCaptionToggleEvent(C86645XzV captionToggleEvent) {
        o.LJIIIZ(captionToggleEvent, "captionToggleEvent");
        if (C41032G8m.LIZ()) {
            TuxIconView tuxIconView = this.LL;
            if (tuxIconView != null) {
                Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
                o.LJIIIIZZ(aweme, "item.aweme");
                tuxIconView.setTuxIcon(a4(aweme));
                return;
            }
            o.LJIJI("captionSwitch");
            throw null;
        }
        TuxIconView tuxIconView2 = this.LL;
        if (tuxIconView2 != null) {
            Aweme aweme2 = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
            o.LJIIIIZZ(aweme2, "item.aweme");
            tuxIconView2.setTuxIcon(Z3(aweme2));
            return;
        }
        o.LJIJI("captionSwitch");
        throw null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        TuxIconView tuxIconView = (TuxIconView) C7MY.LIZLLL(view, "view", R.id.lay, "view.findViewById(R.id.tiv_caption_switch)");
        this.LL = tuxIconView;
        C16880lQ.LJJJ(tuxIconView, new ACListenerS24S0100000_4(this, 58));
    }
}
