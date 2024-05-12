package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.gift.GiftImageCacheExpVerifySetting;
import com.bytedance.android.livesdk.livesetting.gift.GiftImageCacheRefactorSettings;
import com.bytedance.android.livesdk.livesetting.other.LiveImageLoaderModuleSetting;
import com.bytedance.android.livesdk.livesetting.performance.RoomSlowFunctionOptSetting;
import java.util.List;

/* renamed from: X.C5k */
/* loaded from: classes6.dex */
public final class C30760C5k {
    public static int LIZ = -1;

    public static int LIZJ() {
        int i = LIZ;
        if (i > 0) {
            return i;
        }
        int LJIIJJI = C87277YNd.LJIIJJI(56);
        LIZ = LJIIJJI;
        return LJIIJJI;
    }

    public static final void LJFF(ImageModel imageModel) {
        List<String> list = null;
        if (GiftImageCacheRefactorSettings.INSTANCE.isEnabled()) {
            BQO LIZ2 = C15650jR.LIZ();
            if (imageModel != null) {
                list = imageModel.getUrls();
            }
            C78720Uuy LIZ3 = LIZ2.LIZ(list);
            LIZ3.LJIL = true;
            LIZ3.LJIJI = Boolean.FALSE;
            LIZ3.LJIILLIIL();
            return;
        }
        if (GiftImageCacheExpVerifySetting.INSTANCE.isEnabled()) {
            BQO LIZ4 = C15650jR.LIZ();
            if (imageModel != null) {
                list = imageModel.getUrls();
            }
            C78720Uuy LIZ5 = LIZ4.LIZ(list);
            int LIZJ = LIZJ();
            int LIZJ2 = LIZJ();
            LIZ5.LJI = LIZJ;
            LIZ5.LJII = LIZJ2;
            LIZ5.LJIJI = Boolean.FALSE;
            LIZ5.LJIILLIIL();
            return;
        }
        C15620jO.LJFF(imageModel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(int i, int i2, ImageModel imageModel, C47061t0 c47061t0) {
        W5O[] LIZLLL;
        List<String> list = null;
        if (GiftImageCacheRefactorSettings.INSTANCE.isEnabled()) {
            BQO LIZ2 = C15650jR.LIZ();
            if (imageModel != null) {
                list = imageModel.getUrls();
            }
            C78720Uuy LIZ3 = LIZ2.LIZ(list);
            LIZ3.LJIL = true;
            LIZ3.LJIJI = Boolean.FALSE;
            LIZ3.LJIJ = true;
            LIZ3.LJIIJJI(c47061t0);
            return;
        }
        if (GiftImageCacheExpVerifySetting.INSTANCE.isEnabled()) {
            BQO LIZ4 = C15650jR.LIZ();
            if (imageModel != null) {
                list = imageModel.getUrls();
            }
            C78720Uuy LIZ5 = LIZ4.LIZ(list);
            LIZ5.LJI = i;
            LIZ5.LJII = i2;
            LIZ5.LJIJI = Boolean.FALSE;
            LIZ5.LJIJ = true;
            LIZ5.LJIIJJI(c47061t0);
            return;
        }
        if (LiveImageLoaderModuleSetting.useImageModule()) {
            if (!C15650jR.LIZIZ(imageModel)) {
                return;
            }
            C78720Uuy LIZ6 = C15650jR.LIZ().LIZ(imageModel.getUrls());
            LIZ6.LJIJ = true;
            LIZ6.LJIIJJI(c47061t0);
            return;
        }
        if (imageModel == null || imageModel.getUrls() == null || imageModel.getUrls().size() == 0 || (LIZLLL = C15620jO.LIZLLL(imageModel, null, null)) == 0 || LIZLLL.length == 0) {
            return;
        }
        C81705W4v LIZJ = W5I.LIZJ();
        LIZJ.LJIIL = c47061t0.getController();
        LIZJ.LJIIJ = true;
        if (!RoomSlowFunctionOptSetting.watchOpt()) {
            LIZJ.LJFF(true, LIZLLL);
        } else if (LIZLLL.length == 1) {
            LIZJ.LIZLLL = LIZLLL[0];
        } else {
            LIZJ.LJFF(false, LIZLLL);
        }
        c47061t0.setController(LIZJ.LIZ());
    }

    public static void LIZIZ(C47061t0 c47061t0, ImageModel imageModel, int i, V1B v1b, int i2, int i3) {
        Drawable drawable = null;
        List<String> list = null;
        List<String> list2 = null;
        if (GiftImageCacheRefactorSettings.INSTANCE.isEnabled()) {
            BQO LIZ2 = C15650jR.LIZ();
            if (imageModel != null) {
                list = imageModel.getUrls();
            }
            C78720Uuy LIZ3 = LIZ2.LIZ(list);
            LIZ3.LJIL = true;
            LIZ3.LJIJI = Boolean.FALSE;
            LIZ3.LJIIIIZZ = i;
            LIZ3.LJIIJJI = v1b;
            LIZ3.LJIIJJI(c47061t0);
            return;
        }
        if (GiftImageCacheExpVerifySetting.INSTANCE.isEnabled()) {
            BQO LIZ4 = C15650jR.LIZ();
            if (imageModel != null) {
                list2 = imageModel.getUrls();
            }
            C78720Uuy LIZ5 = LIZ4.LIZ(list2);
            LIZ5.LJI = i2;
            LIZ5.LJII = i3;
            LIZ5.LJIJI = Boolean.FALSE;
            LIZ5.LJIIIIZZ = i;
            LIZ5.LJIIJJI = v1b;
            LIZ5.LJIIJJI(c47061t0);
            return;
        }
        if (i > 0) {
            drawable = C15380j0.LIZLLL().getResources().getDrawable(i);
        }
        C15620jO.LIZJ(c47061t0, imageModel, drawable, null, v1b, false);
    }

    public static void LIZLLL(int i, int i2, int i3, ImageView imageView, ImageModel imageModel, InterfaceC75158Tec interfaceC75158Tec, boolean z) {
        List<String> list = null;
        if (GiftImageCacheRefactorSettings.INSTANCE.isEnabled()) {
            BQO LIZ2 = C15650jR.LIZ();
            if (imageModel != null) {
                list = imageModel.getUrls();
            }
            C78720Uuy LIZ3 = LIZ2.LIZ(list);
            LIZ3.LJIL = true;
            LIZ3.LJIJI = Boolean.FALSE;
            LIZ3.LJIIIIZZ = i3;
            LIZ3.LIZLLL(ImageView.ScaleType.CENTER_CROP);
            LIZ3.LJIJ = z;
            LIZ3.LJIIJJI = interfaceC75158Tec;
            LIZ3.LJIIJJI(imageView);
            return;
        }
        if (GiftImageCacheExpVerifySetting.INSTANCE.isEnabled()) {
            BQO LIZ4 = C15650jR.LIZ();
            if (imageModel != null) {
                list = imageModel.getUrls();
            }
            C78720Uuy LIZ5 = LIZ4.LIZ(list);
            LIZ5.LJI = i;
            LIZ5.LJII = i2;
            LIZ5.LJIJI = Boolean.FALSE;
            LIZ5.LJIIIIZZ = i3;
            LIZ5.LIZLLL(ImageView.ScaleType.CENTER_CROP);
            LIZ5.LJIJ = z;
            LIZ5.LJIIJJI = interfaceC75158Tec;
            LIZ5.LJIIJJI(imageView);
            return;
        }
        C15640jQ.LIZJ(i, i2, i3, imageView, imageModel, interfaceC75158Tec, z);
    }

    public static /* synthetic */ void LJ(ImageView imageView, ImageModel imageModel, int i, int i2, int i3, V1B v1b, int i4) {
        V1B v1b2 = v1b;
        int i5 = i3;
        int i6 = i;
        int i7 = i2;
        if ((i4 & 4) != 0) {
            i6 = -1;
        }
        if ((i4 & 8) != 0) {
            i7 = -1;
        }
        if ((i4 & 32) != 0) {
            i5 = -1;
        }
        if ((i4 & 64) != 0) {
            v1b2 = null;
        }
        LIZLLL(i6, i7, i5, imageView, imageModel, v1b2, false);
    }
}
