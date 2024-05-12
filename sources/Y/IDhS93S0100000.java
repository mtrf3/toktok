package Y;

import X.AbstractC73672Svk;
import X.C14540he;
import X.C1VH;
import X.C21220sQ;
import X.C32I;
import X.C33771Uf;
import X.C61878OQg;
import X.C79007Uzb;
import X.C79016Uzk;
import X.InterfaceC48038ItG;
import X.Q8U;
import X.V0B;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.text.SpannableStringBuilder;
import com.bytedance.android.live.broadcast.fragment.GameDualDeviceQRCodeFragment;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.live.effect.navi.model.ProfileNaviCustom;
import com.bytedance.android.live.effect.navi.model.ProfileNaviListResponse;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class IDhS93S0100000 implements InterfaceC48038ItG {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            case 5:
                return apply$5(this, obj);
            default:
                return null;
        }
    }

    public IDhS93S0100000(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object apply$0(IDhS93S0100000 iDhS93S0100000, Object obj) {
        Bitmap it = (Bitmap) obj;
        o.LJIIIZ(it, "it");
        int width = it.getWidth();
        int height = it.getHeight();
        Matrix matrix = new Matrix();
        float f = (((C14540he) iDhS93S0100000.l0).LIZ.LIZJ.LIZJ.LJLILLLLZI[0] * 1.0f) / width;
        matrix.preScale(f, f);
        Bitmap createBitmap = Bitmap.createBitmap(it, 0, 0, width, height, matrix, false);
        it.recycle();
        return createBitmap;
    }

    public static final Object apply$1(IDhS93S0100000 iDhS93S0100000, Object obj) {
        C33771Uf c33771Uf = (C33771Uf) iDhS93S0100000.l0;
        c33771Uf.getClass();
        return AbstractC73672Svk.LJIIJ(new IDuS74S0200000(c33771Uf, (FilterModel) obj, 2));
    }

    public static final Object apply$2(IDhS93S0100000 iDhS93S0100000, Object obj) {
        LiveEffect effect = (LiveEffect) obj;
        o.LJIIIZ(effect, "effect");
        return AbstractC73672Svk.LJIIJ(new IDuS74S0200000((C1VH) iDhS93S0100000.l0, effect, 3));
    }

    public static final Object apply$3(IDhS93S0100000 iDhS93S0100000, Object obj) {
        ProfileNaviListResponse naviListResponse = (ProfileNaviListResponse) obj;
        o.LJIIIZ(naviListResponse, "naviListResponse");
        ArrayList arrayList = new ArrayList();
        C21220sQ c21220sQ = (C21220sQ) iDhS93S0100000.l0;
        List list = naviListResponse.naviList;
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ProfileNaviCustom) it.next()).transformToProfileNavi());
        }
        arrayList.addAll(arrayList2);
        arrayList.addAll(c21220sQ.LIZIZ);
        return arrayList;
    }

    public static final Object apply$4(IDhS93S0100000 iDhS93S0100000, Object it) {
        o.LJIIIZ(it, "it");
        GameDualDeviceQRCodeFragment gameDualDeviceQRCodeFragment = (GameDualDeviceQRCodeFragment) iDhS93S0100000.l0;
        gameDualDeviceQRCodeFragment.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String string = gameDualDeviceQRCodeFragment.getString(R.string.mvu);
        o.LJIIIIZZ(string, "getString(R.string.pm_ls…ctionSheet2_placeholder1)");
        String string2 = gameDualDeviceQRCodeFragment.getString(R.string.mvo);
        o.LJIIIIZZ(string2, "getString(R.string.pm_ls…ndCam_actionSheet2_body1)");
        spannableStringBuilder.append((CharSequence) GameDualDeviceQRCodeFragment.vl(Q8U.LIZIZ(new Object[]{string}, 1, string2, "format(format, *args)"), string));
        spannableStringBuilder.append((CharSequence) "\n");
        String string3 = gameDualDeviceQRCodeFragment.getString(R.string.mvv);
        o.LJIIIIZZ(string3, "getString(R.string.pm_ls…ctionSheet2_placeholder2)");
        String string4 = gameDualDeviceQRCodeFragment.getString(R.string.mvp);
        o.LJIIIIZZ(string4, "getString(R.string.pm_ls…ndCam_actionSheet2_body2)");
        SpannableStringBuilder vl = GameDualDeviceQRCodeFragment.vl(Q8U.LIZIZ(new Object[]{string3}, 1, string4, "format(format, *args)"), string3);
        GameDualDeviceQRCodeFragment.wl(vl, "ttlive_icon_person_bold.png", "{icon}");
        spannableStringBuilder.append((CharSequence) vl);
        spannableStringBuilder.append((CharSequence) "\n");
        String string5 = gameDualDeviceQRCodeFragment.getString(R.string.mvw);
        o.LJIIIIZZ(string5, "getString(R.string.pm_ls…ctionSheet2_placeholder3)");
        String string6 = gameDualDeviceQRCodeFragment.getString(R.string.mvx);
        o.LJIIIIZZ(string6, "getString(R.string.pm_ls…ctionSheet2_placeholder4)");
        String string7 = gameDualDeviceQRCodeFragment.getString(R.string.mvq);
        o.LJIIIIZZ(string7, "getString(R.string.pm_ls…ndCam_actionSheet2_body3)");
        SpannableStringBuilder vl2 = GameDualDeviceQRCodeFragment.vl(Q8U.LIZIZ(new Object[]{string5, string6}, 2, string7, "format(format, *args)"), string5, string6);
        GameDualDeviceQRCodeFragment.wl(vl2, "ttlive_icon_lines_horizon.png", "{icon1}");
        GameDualDeviceQRCodeFragment.wl(vl2, "ttlive_icon_qr_code.png", "{icon2}");
        spannableStringBuilder.append((CharSequence) vl2);
        spannableStringBuilder.append((CharSequence) "\n");
        String string8 = gameDualDeviceQRCodeFragment.getString(R.string.mvy);
        o.LJIIIIZZ(string8, "getString(R.string.pm_ls…ctionSheet2_placeholder5)");
        String string9 = gameDualDeviceQRCodeFragment.getString(R.string.mvr);
        o.LJIIIIZZ(string9, "getString(R.string.pm_ls…ndCam_actionSheet2_body4)");
        SpannableStringBuilder vl3 = GameDualDeviceQRCodeFragment.vl(Q8U.LIZIZ(new Object[]{string8}, 1, string9, "format(format, *args)"), string8);
        GameDualDeviceQRCodeFragment.wl(vl3, "ttlive_icon_scan.png", "{icon}");
        spannableStringBuilder.append((CharSequence) vl3);
        spannableStringBuilder.append((CharSequence) "\n");
        spannableStringBuilder.append((CharSequence) gameDualDeviceQRCodeFragment.getString(R.string.mvs));
        return spannableStringBuilder;
    }

    public static final Object apply$5(IDhS93S0100000 iDhS93S0100000, Object obj) {
        int i;
        String str = (String) obj;
        o.LJIIIZ(str, "str");
        ((GameDualDeviceQRCodeFragment) iDhS93S0100000.l0).getClass();
        C79007Uzb LJ = new C79016Uzk().LJ(str, V0B.QR_CODE, LiveMaxRetainAlogMessageSizeSetting.DEFAULT, LiveMaxRetainAlogMessageSizeSetting.DEFAULT, null);
        Bitmap bitmap = Bitmap.createBitmap(LiveMaxRetainAlogMessageSizeSetting.DEFAULT, LiveMaxRetainAlogMessageSizeSetting.DEFAULT, Bitmap.Config.ARGB_8888);
        int i2 = 0;
        do {
            int i3 = 0;
            do {
                if (LJ.LIZ(i2, i3)) {
                    i = -16777216;
                } else {
                    i = -1;
                }
                bitmap.setPixel(i2, i3, i);
                i3++;
            } while (i3 < 500);
            i2++;
        } while (i2 < 500);
        o.LJIIIIZZ(bitmap, "bitmap");
        return bitmap;
    }
}
