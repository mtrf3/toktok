package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.ViewGroup;
import com.bytedance.keva.Keva;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.LEa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53916LEa implements InterfaceC53923LEh {
    public static final C53916LEa LJLIL = new C53916LEa();

    @Override // X.InterfaceC53923LEh
    public final boolean LIZJ() {
        if (C35686DzW.LIZ("ITabletFeed.photoModeForceFitCenter")) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC53923LEh
    public final InterfaceC224288rA LJI() {
        if (C35686DzW.LIZ("ITabletFeed.feedResizeHelper")) {
            return C53918LEc.LJLIL.LJI();
        }
        if (C54966Lhi.LIZIZ() || C54966Lhi.LIZ()) {
            return C98103t8.LJLJI;
        }
        if (((Boolean) C34483Dg7.LIZIZ.getValue()).booleanValue()) {
            if (((Boolean) C34483Dg7.LIZJ.getValue()).booleanValue()) {
                return new C3G6() { // from class: X.3G8
                    @Override // X.InterfaceC224288rA
                    public final boolean LIZ(C3G7 c3g7) {
                        if (c3g7 != null && LJII(c3g7)) {
                            return true;
                        }
                        return false;
                    }

                    @Override // X.InterfaceC224288rA
                    public final C3G7 LIZLLL(C3G7 c3g7) {
                        return C3G6.LJFF(c3g7);
                    }

                    @Override // X.C3G6
                    public final boolean LJII(C3G7 param) {
                        o.LJIIIZ(param, "param");
                        if (param.LJLIL > 0 && param.LJLILLLLZI > 0 && param.LJLJI > 0 && param.LJLJJI > 0) {
                            return true;
                        }
                        return false;
                    }
                };
            }
            return C53918LEc.LJLIL.LJI();
        }
        if (LEQ.LIZIZ(null)) {
            return C98103t8.LJLJI;
        }
        return new C3G6() { // from class: X.3t7
            @Override // X.InterfaceC224288rA
            public final boolean LIZ(C3G7 c3g7) {
                boolean z = false;
                if (c3g7 != null && LJII(c3g7)) {
                    C62822Ol8 c62822Ol8 = C98403tc.LIZ;
                    if (((Number) c62822Ol8.getValue()).intValue() == 0) {
                        return false;
                    }
                    if (((Number) c62822Ol8.getValue()).intValue() == 1) {
                        return true;
                    }
                    float LJI = C3G6.LJI(c3g7);
                    if (LJI < 1.0f && !C53946LFe.LIZJ(null, null).LJFF) {
                        C98373tZ.LIZ.getClass();
                        C62822Ol8 c62822Ol82 = C98373tZ.LIZJ;
                        if (((float[]) c62822Ol82.getValue()).length == 2) {
                            float f = 1;
                            if (LJI >= f - ((float[]) c62822Ol82.getValue())[0]) {
                                return false;
                            }
                            if (LJI >= f - ((float[]) c62822Ol82.getValue())[1]) {
                                if (((Number) c62822Ol8.getValue()).intValue() == 3) {
                                    z = true;
                                }
                                return !z;
                            }
                        }
                    }
                }
                if (((Number) C98403tc.LIZ.getValue()).intValue() == 0) {
                    z = true;
                }
                return !z;
            }

            @Override // X.InterfaceC224288rA
            public final C3G7 LIZLLL(C3G7 c3g7) {
                return C3G6.LJFF(c3g7);
            }

            @Override // X.C3G6
            public final boolean LJII(C3G7 param) {
                o.LJIIIZ(param, "param");
                if (param.LJLIL > 0 && param.LJLILLLLZI > 0 && param.LJLJI > 0 && param.LJLJJI > 0) {
                    return true;
                }
                return false;
            }
        };
    }

    @Override // X.InterfaceC53923LEh
    public final boolean LJIIIIZZ() {
        if (C35686DzW.LIZ("ITabletFeed.hasShareCampaignFeature")) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC53923LEh
    public final int LJIILL() {
        if (C35686DzW.LIZ("ITabletFeed.getVideoImageLayoutMode")) {
            return 1;
        }
        C62822Ol8 c62822Ol8 = C53917LEb.LIZIZ;
        Object value = c62822Ol8.getValue();
        o.LJIIIIZZ(value, "<get-diffKeva>(...)");
        if (((Keva) value).getBoolean("get_video_image_layout_is_first", true)) {
            Object value2 = c62822Ol8.getValue();
            o.LJIIIIZZ(value2, "<get-diffKeva>(...)");
            ((Keva) value2).storeBoolean("get_video_image_layout_is_first", false);
            return 1;
        }
        return !LEP.LIZ(null) ? 1 : 0;
    }

    @Override // X.InterfaceC53923LEh
    public final AnonymousClass840 LJIJI() {
        if (C35686DzW.LIZ("ITabletFeed.getVideoViewHelper")) {
            return C53918LEc.LJLIL;
        }
        return new AnonymousClass840() { // from class: X.844
            public static final int LJLILLLLZI = C7MY.LIZIZ(20);

            @Override // X.AnonymousClass840
            public final int LJ(int i) {
                return C7MY.LIZIZ(16);
            }

            @Override // X.AnonymousClass840
            public final void LJIJJ(Configuration configuration, ViewGroup viewGroup, AqS169S0100000_3 aqS169S0100000_3) {
                int i;
                int i2;
                Context context = viewGroup.getContext();
                o.LJIIIIZZ(context, "captionContainer.context");
                Activity LJIJJ = C45804HyK.LJIJJ(context);
                if (LJIJJ == null) {
                    return;
                }
                C53948LFg LIZJ = C53946LFe.LIZJ(LJIJJ, configuration);
                int i3 = 0;
                if (LEZ.LIZ.LIZIZ(LJIJJ, configuration)) {
                    i = C7MY.LIZIZ(60);
                } else {
                    i = 0;
                }
                if (C53816LAe.LJI(LJIJJ, configuration)) {
                    i3 = LJLILLLLZI;
                }
                if (LIZJ.LJFF) {
                    i2 = ((LIZJ.LIZIZ - i) / 2) - i3;
                    viewGroup.getLayoutParams().width = i2;
                } else {
                    i2 = LIZJ.LIZIZ - i;
                    viewGroup.getLayoutParams().width = -2;
                }
                aqS169S0100000_3.invoke(Integer.valueOf(i2));
            }
        };
    }

    @Override // X.InterfaceC53923LEh
    public final boolean LJJIII() {
        if (C35686DzW.LIZ("ITabletFeed.isSwipeOptOpen")) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC53923LEh
    public final boolean LJJIJIIJI() {
        if (C35686DzW.LIZ("ITabletFeed.isUseTabletSwipeUpGuide") || !LEP.LIZ(null) || !((Boolean) C52360Kgm.LIZ.getValue()).booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC53923LEh
    public final String LJJII() {
        if (LJJIJIIJI()) {
            return "tablet_horizontal_guide.json";
        }
        return "";
    }

    @Override // X.InterfaceC53923LEh
    public final C56142Ig d1() {
        int i;
        String str;
        if (LJJIJIIJI()) {
            str = "tablet_horizontal_guide2.json";
            i = R.string.imw;
        } else {
            i = R.string.ryt;
            str = "home_swipe_up_lottie_android.json";
        }
        return new C56142Ig(str, i);
    }

    @Override // X.InterfaceC53923LEh
    public final IFP LIZLLL() {
        return IFY.LJLIL;
    }

    @Override // X.InterfaceC53923LEh
    public final boolean LIZIZ(boolean z) {
        if (C35686DzW.LIZ("ITabletFeed.isOptShareDialog") || !z || !((Boolean) C52358Kgk.LIZ.getValue()).booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC53923LEh
    public final float LJFF(float f) {
        if (C35686DzW.LIZ("ITabletFeed.swipeOptDistance")) {
            return f;
        }
        return ((Number) IJD.LIZ.getValue()).floatValue();
    }

    @Override // X.InterfaceC53923LEh
    public final float LJJJJI(float f) {
        if (C35686DzW.LIZ("ITabletFeed.swipeOptOffset")) {
            return f;
        }
        return ((Number) IJF.LIZ.getValue()).floatValue();
    }
}
