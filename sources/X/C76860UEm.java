package X;

import Y.ACListenerS33S0100000_13;
import Y.ACListenerS47S0200000_13;
import Y.ARunnableS4S0202000_13;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.liveinteract.multilive.model.BannerContentMultiGuest;
import com.bytedance.android.live.liveinteract.multilive.model.InRoomMultiGuestBanner;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.UEm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76860UEm extends AbstractC76218Tvi<InRoomMultiGuestBanner> {
    public final InterfaceC88471Ynr<String, String, C76800UCe> LJLIL;
    public final InterfaceC88472Yns<Integer, C76800UCe> LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public final C5H3 LJLJJLL;
    public final C5H3 LJLJL;
    public final C5H3 LJLJLJ;
    public final C5H3 LJLJLLL;
    public final C5H3 LJLL;

    public final ViewGroup M() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-bannerContainer>(...)");
        return (ViewGroup) value;
    }

    public final TextView N() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-bannerMainText>(...)");
        return (TextView) value;
    }

    public final TextView P() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-bannerSubText>(...)");
        return (TextView) value;
    }

    public static final int Q(String str) {
        try {
            if (str.length() > 0 && str.charAt(0) == '#') {
                String substring = str.substring(0, 7);
                o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                str = substring;
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return ColorProtector.parseColor(str);
    }

    @Override // X.AbstractC76218Tvi
    public final void L(int i, Object obj) {
        int i2;
        InRoomMultiGuestBanner data = (InRoomMultiGuestBanner) obj;
        o.LJIIIZ(data, "data");
        int LJIIL = C15380j0.LJIIL() - (C15380j0.LIZ(16.0f) * 2);
        int min = Math.min((int) (LJIIL * 0.3d), C15380j0.LIZ(98.0f));
        int i3 = LJIIL - min;
        BannerContentMultiGuest bannerContentMultiGuest = data.content;
        if (bannerContentMultiGuest != null) {
            String str = bannerContentMultiGuest.leftColor;
            String str2 = bannerContentMultiGuest.rightColor;
            if (str.length() > 0 && str2.length() > 0) {
                Drawable background = M().getBackground();
                if (background != null && (background instanceof GradientDrawable)) {
                    ((GradientDrawable) background).setColors(new int[]{Q(str), Q(str2)});
                }
            } else if (str.length() > 0 || str2.length() > 0) {
                if (str.length() <= 0) {
                    str = str2;
                }
                Drawable background2 = M().getBackground();
                if (background2 != null && (background2 instanceof GradientDrawable)) {
                    ((GradientDrawable) background2).setColor(Q(str));
                }
            }
            N().setWidth(i3);
            P().setWidth(i3);
            if (bannerContentMultiGuest.textColor.length() > 0) {
                i2 = Q(bannerContentMultiGuest.textColor);
            } else {
                i2 = -16777216;
            }
            N().setTextColor(i2);
            P().setAlpha(1.0f);
            P().setTextColor(i2);
            P().setAlpha(0.75f);
            N().setText(bannerContentMultiGuest.title);
            P().setText(bannerContentMultiGuest.subTitle);
            M().post(new ARunnableS4S0202000_13(min, LJIIL, this, bannerContentMultiGuest, 3));
        }
        C16880lQ.LJIIL(M(), new ACListenerS47S0200000_13(this, data, 20));
        Object value = this.LJLJLJ.getValue();
        o.LJIIIIZZ(value, "<get-bannerCloseIcon>(...)");
        C16880lQ.LJIIJ(new ACListenerS33S0100000_13(this, 131), (View) value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C76860UEm(View view, InterfaceC88471Ynr<? super String, ? super String, C76800UCe> onBannerClick, InterfaceC88472Yns<? super Integer, C76800UCe> onBannerClosed) {
        super(view);
        o.LJIIIZ(onBannerClick, "onBannerClick");
        o.LJIIIZ(onBannerClosed, "onBannerClosed");
        this.LJLIL = onBannerClick;
        this.LJLILLLLZI = onBannerClosed;
        this.LJLJI = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(view, 336));
        this.LJLJJI = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(view, 338));
        this.LJLJJL = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(view, 339));
        this.LJLJJLL = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(view, 337));
        this.LJLJL = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(view, 334));
        this.LJLJLJ = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(view, 335));
        this.LJLJLLL = C78996UzQ.LJJIJIIJI(C76862UEo.LJLIL);
        this.LJLL = C78996UzQ.LJJIJIIJI(C76861UEn.LJLIL);
    }
}
