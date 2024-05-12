package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.other.LiveImageLoaderModuleSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* renamed from: X.0jQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15640jQ {
    public static String LIZ(ImageModel imageModel) {
        if (imageModel == null || C32151Nz.LJJIIJZLJL(imageModel.getUrls())) {
            return "";
        }
        return (String) ListProtector.get(imageModel.getUrls(), 0);
    }

    public static boolean LIZIZ(Context context) {
        if (context == null) {
            return false;
        }
        if (!(context instanceof Activity)) {
            if ((context instanceof Application) || !(context instanceof ContextWrapper)) {
                return true;
            }
            return LIZIZ(((ContextWrapper) context).getBaseContext());
        }
        if (((Activity) context).isDestroyed()) {
            return false;
        }
        return !r3.isFinishing();
    }

    public static void LIZLLL(ImageView imageView, ImageModel imageModel) {
        if (imageModel == null || C79004UzY.LJJIFFI(imageModel.getUrls())) {
            return;
        }
        LJ(imageView, imageModel, 0);
    }

    public static void LJI(C47061t0 c47061t0, String str) {
        if (LiveImageLoaderModuleSetting.useImageModule()) {
            new ArrayList().add(str);
            C78720Uuy url = C15650jR.LIZ().setUrl(str);
            url.LJIIIIZZ = R.drawable.dcp;
            url.LIZLLL(ImageView.ScaleType.CENTER_CROP);
            url.LJIIJJI(c47061t0);
            return;
        }
        if (c47061t0 == null || TextUtils.isEmpty(str) || !LIZIZ(c47061t0.getContext())) {
            return;
        }
        C17190lv LJII = C17190lv.LJII(c47061t0.getContext());
        LJII.LIZLLL(str);
        LJII.LJ(R.drawable.dcp);
        LJII.LIZ(ImageView.ScaleType.CENTER_CROP);
        LJII.LIZJ(c47061t0);
    }

    public static void LJIIIIZZ(ImageView imageView, ImageModel imageModel) {
        if (LiveImageLoaderModuleSetting.useImageModule()) {
            if (!C15650jR.LIZIZ(imageModel)) {
                return;
            }
            C78720Uuy LIZ = C15650jR.LIZ().LIZ(imageModel.getUrls());
            LIZ.LIZLLL(ImageView.ScaleType.CENTER_CROP);
            LIZ.LJIIL = Boolean.TRUE;
            LIZ.LJIIJJI(imageView);
            return;
        }
        if (imageView == null || !LIZIZ(imageView.getContext())) {
            return;
        }
        C17190lv LJII = C17190lv.LJII(imageView.getContext());
        LJII.LJFF = imageModel;
        LJII.LJFF();
        LJII.LIZ(ImageView.ScaleType.CENTER_CROP);
        LJII.LIZJ(imageView);
    }

    public static void LJ(ImageView imageView, ImageModel imageModel, int i) {
        LIZJ(-1, -1, i, imageView, imageModel, null, false);
    }

    public static void LJFF(ImageView imageView, ImageModel imageModel, int i, InterfaceC75158Tec interfaceC75158Tec) {
        LIZJ(-1, -1, i, imageView, imageModel, interfaceC75158Tec, false);
    }

    public static void LJII(ImageView imageView, ImageModel imageModel, int i, int i2) {
        if (LiveImageLoaderModuleSetting.useImageModule()) {
            if (!C15650jR.LIZIZ(imageModel)) {
                return;
            }
            C78720Uuy LIZ = C15650jR.LIZ().LIZ(imageModel.getUrls());
            LIZ.LIZLLL(ImageView.ScaleType.CENTER_CROP);
            LIZ.LJIIIIZZ = i;
            LIZ.LJIIZILJ(Float.valueOf(C15380j0.LIZ(i2) + 0.0f));
            LIZ.LJIIJJI(imageView);
            return;
        }
        if (imageView == null || imageModel == null || !LIZIZ(imageView.getContext())) {
            return;
        }
        C17190lv LJII = C17190lv.LJII(imageView.getContext());
        LJII.LIZLLL(LIZ(imageModel));
        int LIZ2 = C15380j0.LIZ(i2);
        if (LJII.LJIIJ == null) {
            LJII.LJIIJ = new V8L();
        }
        LJII.LJIIJ.LJFF(LIZ2);
        LJII.LJFF = imageModel;
        LJII.LIZ(ImageView.ScaleType.CENTER_CROP);
        LJII.LJ(i);
        LJII.LIZJ(imageView);
    }

    public static void LJIIJ(ImageView imageView, int i, int i2, int i3) {
        if (LiveImageLoaderModuleSetting.useImageModule()) {
            C78720Uuy LJFF = C15650jR.LIZ().LJFF(i);
            LJFF.LJIIL = Boolean.TRUE;
            LJFF.LIZLLL(ImageView.ScaleType.CENTER_CROP);
            LJFF.LJ = i2;
            LJFF.LJFF = i3;
            LJFF.LJIIJJI(imageView);
            return;
        }
        if (imageView == null || !LIZIZ(imageView.getContext())) {
            return;
        }
        C17190lv LJII = C17190lv.LJII(imageView.getContext());
        LJII.LJ = C0F1.LIZ("res").path(String.valueOf(i)).build();
        LJII.LJFF();
        LJII.LIZ(ImageView.ScaleType.CENTER_CROP);
        if (i2 > 0 && i3 > 0) {
            LJII.LJI = new C79238V7y(i2, i3);
        }
        LJII.LIZJ(imageView);
    }

    public static void LJIIIZ(ImageView imageView, ImageModel imageModel, int i, int i2, int i3, InterfaceC75158Tec interfaceC75158Tec) {
        if (LiveImageLoaderModuleSetting.useImageModule()) {
            ArrayList arrayList = new ArrayList();
            if (imageModel != null && imageModel.getUrls() != null) {
                arrayList.addAll(imageModel.getUrls());
            }
            C78720Uuy LIZ = C15650jR.LIZ().LIZ(arrayList);
            LIZ.LJIIL = Boolean.TRUE;
            LIZ.LIZLLL(ImageView.ScaleType.CENTER_CROP);
            LIZ.LJ = i;
            LIZ.LJFF = i2;
            LIZ.LJIIIIZZ = i3;
            LIZ.LJIIJJI = interfaceC75158Tec;
            LIZ.LJIIJJI(imageView);
            return;
        }
        C15700jW.LIZ(i, i2, i3, imageView, imageModel, interfaceC75158Tec, false);
    }

    public static void LIZJ(int i, int i2, int i3, ImageView imageView, ImageModel imageModel, InterfaceC75158Tec interfaceC75158Tec, boolean z) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        String str = null;
        if (imageModel == null) {
            if (interfaceC75158Tec != null) {
                interfaceC75158Tec.LJIILL(new IllegalArgumentException("imageModel == null"), null);
                return;
            }
            return;
        }
        if (LiveImageLoaderModuleSetting.useImageModule()) {
            if (!C15650jR.LIZIZ(imageModel)) {
                return;
            }
            C78720Uuy LIZ = C15650jR.LIZ().LIZ(imageModel.getUrls());
            LIZ.LJIIIIZZ = i3;
            LIZ.LIZLLL(scaleType);
            LIZ.LJIJ = z;
            LIZ.LJ = i;
            LIZ.LJFF = i2;
            LIZ.LJIIJJI = interfaceC75158Tec;
            LIZ.LJIIJJI(imageView);
            return;
        }
        if (imageModel.getUrls().size() != 0) {
            str = (String) ListProtector.get(imageModel.getUrls(), 0);
        }
        if (C79004UzY.LJJIFFI(imageModel.getUrls())) {
            if (interfaceC75158Tec == null) {
                return;
            }
            interfaceC75158Tec.LJIILL(new IllegalArgumentException("CollectionUtils.isEmpty(imageModel.urls)"), str);
            return;
        }
        if (imageView == null || !LIZIZ(imageView.getContext())) {
            if (interfaceC75158Tec == null) {
                return;
            }
            interfaceC75158Tec.LJIILL(new IllegalArgumentException("!isActivityOK(view.getContext())"), str);
            return;
        }
        C17190lv LJII = C17190lv.LJII(imageView.getContext());
        LJII.LIZLLL(LIZ(imageModel));
        LJII.LJFF = imageModel;
        LJII.LIZ(scaleType);
        if (i > 0 && i2 > 0) {
            LJII.LJI = new C79238V7y(i, i2);
        }
        if (i3 > 0) {
            LJII.LJ(i3);
        }
        if (z) {
            LJII.LJIIJJI = true;
        }
        LJII.LIZLLL = new C1UQ(imageModel, interfaceC75158Tec);
        LJII.LIZJ(imageView);
    }
}
