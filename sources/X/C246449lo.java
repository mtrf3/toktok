package X;

import Y.ACListenerS39S0200000_4;
import android.app.Activity;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.bytedance.keva.Keva;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;
import ujb.s;

@InterfaceC55642Lsc("add_yours_profile_guide")
/* renamed from: X.9lo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C246449lo extends AbstractC56327M8t<View> {
    public final ViewStub LJLIL;
    public final int LJLILLLLZI;
    public final Activity LJLJI;
    public final int LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;

    @Override // X.M74
    public final boolean canShow() {
        return true;
    }

    public final int LJIIIIZZ() {
        return ((Number) this.LJLJJL.getValue()).intValue();
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLJJI;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C54082LKk context) {
        View findViewById;
        o.LJIIIZ(context, "context");
        ViewStub viewStub = this.LJLIL;
        if (viewStub == null) {
            return null;
        }
        viewStub.inflate();
        ViewGroup viewGroup = (ViewGroup) this.LJLJI.findViewById(this.LJLILLLLZI);
        String string = context.LIZ.getString(R.string.bcl);
        o.LJIIIIZZ(string, "context.context.getStrin…omBannerPlaceholder_body)");
        String string2 = context.LIZ.getString(R.string.bcm, string);
        o.LJIIIIZZ(string2, "context.context.getStrin…    colorString\n        )");
        SpannableString spannableString = new SpannableString(string2);
        Context context2 = viewGroup.getContext();
        o.LJIIIIZZ(context2, "rootView.context");
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(AnonymousClass636.LJIIIIZZ(R.attr.eb, context2));
        StyleSpan styleSpan = new StyleSpan(1);
        int LJJLIIIJL = s.LJJLIIIJL(spannableString, string, 0, false, 6);
        int length = string.length() + LJJLIIIJL;
        spannableString.setSpan(styleSpan, LJJLIIIJL, length, 17);
        spannableString.setSpan(foregroundColorSpan, LJJLIIIJL, length, 33);
        AKH akh = new AKH(viewGroup);
        akh.LIZLLL(new AqS167S0100000_1(this, 273), true);
        akh.LIZ.LIZIZ = 10000L;
        akh.LIZ.LJIIIIZZ = C7MY.LIZIZ(-14);
        AqS169S0100000_3 aqS169S0100000_3 = new AqS169S0100000_3(this, 682);
        A21 a21 = akh.LIZ;
        a21.LJIIL = aqS169S0100000_3;
        a21.LJ = spannableString;
        akh.LIZJ();
        AKJ akj = akh.LJ;
        if (akj != null && (findViewById = akj.findViewById(R.id.btt)) != null) {
            findViewById.setClickable(true);
            C16880lQ.LJIIJ(new ACListenerS39S0200000_4(this, akh, 60), findViewById);
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "personal_homepage");
        FMX.LJIIL("add_yours_personal_notice_show", c188727au.LIZ);
        Keva.getRepo("add_yours_profile_guide").storeLong("last_show_time", System.currentTimeMillis());
        return viewGroup;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C246449lo(C235769Nc c235769Nc, ViewStub viewStub, ActivityC45651qj activity) {
        super(c235769Nc);
        o.LJIIIZ(activity, "activity");
        this.LJLIL = viewStub;
        this.LJLILLLLZI = R.id.i6s;
        this.LJLJI = activity;
        this.LJLJJI = 505;
        this.LJLJJL = C221108m2.LIZIZ(C246459lp.LJLIL);
        this.LJLJJLL = C221108m2.LIZIZ(C246469lq.LJLIL);
    }
}
