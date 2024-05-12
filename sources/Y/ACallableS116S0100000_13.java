package Y;

import X.C15420j4;
import X.C244309iM;
import X.C31819CeF;
import X.C31823CeJ;
import X.C38352F3k;
import X.C39579Fg7;
import X.C39687Fhr;
import X.C39849FkT;
import X.C52798Knq;
import X.C68322mC;
import X.C72545SdZ;
import X.C77338UWw;
import X.C77403UZj;
import X.C77404UZk;
import X.C81091Vs7;
import X.EnumC31874Cf8;
import X.OSZ;
import X.Q7K;
import X.UGO;
import X.UGT;
import X.X1D;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import com.aweme.storage.StorageCleanServiceImpl;
import com.bytedance.common.utility.BitmapUtils;
import com.ss.android.ugc.aweme.profile.ui.CropActivity;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.AqS129S0300000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class ACallableS116S0100000_13 implements Callable {
    public final int $t;
    public Object l0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.String] */
    public static final Object call$0(ACallableS116S0100000_13 aCallableS116S0100000_13) {
        OSZ osz;
        File file;
        UGT ugt = (UGT) aCallableS116S0100000_13.l0;
        ugt.getClass();
        EnumC31874Cf8 enumC31874Cf8 = EnumC31874Cf8.CROP_VIEW;
        StringBuilder LIZ = X1D.LIZ();
        String LIZLLL = C72545SdZ.LIZLLL(LIZ, "crop_", ".png", LIZ);
        C81091Vs7 c81091Vs7 = ugt.LJLILLLLZI;
        Bitmap.CompressFormat compressFormat = null;
        compressFormat = null;
        if (c81091Vs7 != null) {
            Bitmap bitmap = ugt.LJLJJI;
            if (bitmap != null) {
                RectF LIZJ = c81091Vs7.LIZJ(null);
                Rect rect = ugt.LJLJJL;
                Integer valueOf = Integer.valueOf(R.string.sp2);
                if (rect == null) {
                    osz = new OSZ(bitmap, valueOf);
                } else {
                    float width = bitmap.getWidth() / LIZJ.width();
                    float height = bitmap.getHeight() / LIZJ.height();
                    int i = (int) ((rect.left - LIZJ.left) * width);
                    if (i < 0) {
                        i = 0;
                    }
                    int i2 = (int) ((rect.top - LIZJ.top) * height);
                    if (i2 < 0) {
                        i2 = 0;
                    }
                    int width2 = (int) (rect.width() * width);
                    int width3 = bitmap.getWidth() - i;
                    if (width2 > width3) {
                        width2 = width3;
                    }
                    int height2 = (int) (rect.height() * height);
                    int height3 = bitmap.getHeight() - i2;
                    if (height2 > height3) {
                        height2 = height3;
                    }
                    if (width2 < 0 || height2 < 0) {
                        osz = new OSZ(null, Integer.valueOf(R.string.t04));
                    } else {
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap, i, i2, width2, height2);
                        if (createBitmap != null) {
                            int width4 = createBitmap.getWidth();
                            int width5 = bitmap.getWidth() - i;
                            if (width4 > width5) {
                                width4 = width5;
                            }
                            int height4 = createBitmap.getHeight();
                            int height5 = bitmap.getHeight() - i2;
                            if (height4 > height5) {
                                height4 = height5;
                            }
                            loop0: for (int i3 = 0; i3 < width4; i3++) {
                                int i4 = height4 - 10;
                                if (i4 < 0) {
                                    i4 = 0;
                                }
                                while (i4 < height4) {
                                    if (bitmap.getPixel(i + i3, i2 + i4) != createBitmap.getPixel(i3, i4)) {
                                        break loop0;
                                    }
                                    i4++;
                                }
                            }
                        }
                        osz = new OSZ(createBitmap, valueOf);
                    }
                }
                Bitmap bitmap2 = (Bitmap) osz.getFirst();
                if (bitmap2 == null) {
                    return new OSZ(null, osz.getSecond());
                }
                try {
                    file = C31819CeF.LIZIZ(new C31823CeJ(LIZLLL, enumC31874Cf8, bitmap2, false, compressFormat, 972));
                } catch (Exception unused) {
                    file = null;
                }
                if (file != null && file.exists()) {
                    compressFormat = file.getAbsolutePath();
                }
                return new OSZ(compressFormat, Integer.valueOf(R.string.sp2));
            }
            o.LJIJI("mOriginalBitmap");
            throw null;
        }
        o.LJIJI("mCoverImage");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, X.OSZ] */
    public static final Object call$1(ACallableS116S0100000_13 aCallableS116S0100000_13) {
        CropActivity cropActivity = (CropActivity) aCallableS116S0100000_13.l0;
        cropActivity.getClass();
        if (!((Boolean) C52798Knq.LIZ.getValue()).booleanValue() || CropActivity.LLILLIZIL) {
            return cropActivity.LLIZLLLIL();
        }
        new File(C39579Fg7.LJIIJ("profileHeader"), "profileHeaderCrop.png");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = new OSZ(null, 0);
        int LIZIZ = Q7K.LIZIZ("clear_storage_available_space_minimum_limitation", 1048576);
        long LJ = C39687Fhr.LJ(C39849FkT.LIZ());
        if (LJ < LIZIZ) {
            C244309iM.LIZLLL(C39849FkT.LIZ(), "checkAndHandleSaveFile storage low", null, null, LJ, null, 44);
            StorageCleanServiceImpl.LIZJ().LIZIZ(C39849FkT.LIZ(), new C77338UWw(new AqS129S0300000_13(c68322mC, (C68322mC<OSZ<String, Integer>>) cropActivity, (CropActivity) countDownLatch, (CountDownLatch) 2)));
            countDownLatch.await();
            return c68322mC.element;
        }
        return cropActivity.LLIZLLLIL();
    }

    public static final Object call$2(ACallableS116S0100000_13 aCallableS116S0100000_13) {
        OSZ osz;
        UGO ugo = (UGO) aCallableS116S0100000_13.l0;
        ugo.getClass();
        File LIZJ = C15420j4.LIZJ(ugo.getContext());
        StringBuilder LIZ = X1D.LIZ();
        File file = new File(LIZJ, C72545SdZ.LIZLLL(LIZ, "crop_", ".png", LIZ));
        C81091Vs7 c81091Vs7 = ugo.LJLILLLLZI;
        String str = null;
        if (c81091Vs7 != null) {
            Bitmap bitmap = ugo.LJLJJI;
            if (bitmap != null) {
                RectF LIZJ2 = c81091Vs7.LIZJ(null);
                Rect rect = ugo.LJLJJLL;
                Integer valueOf = Integer.valueOf(R.string.sp2);
                if (rect == null) {
                    osz = new OSZ(bitmap, valueOf);
                } else {
                    float width = bitmap.getWidth() / LIZJ2.width();
                    float height = bitmap.getHeight() / LIZJ2.height();
                    int i = (int) ((rect.left - LIZJ2.left) * width);
                    if (i < 0) {
                        i = 0;
                    }
                    int i2 = (int) ((rect.top - LIZJ2.top) * height);
                    if (i2 < 0) {
                        i2 = 0;
                    }
                    int width2 = (int) (rect.width() * width);
                    int width3 = bitmap.getWidth() - i;
                    if (width2 > width3) {
                        width2 = width3;
                    }
                    int height2 = (int) (rect.height() * height);
                    int height3 = bitmap.getHeight() - i2;
                    if (height2 > height3) {
                        height2 = height3;
                    }
                    if (width2 < ugo.LJLJL || height2 < ugo.LJLJLJ) {
                        osz = new OSZ(null, Integer.valueOf(R.string.t04));
                    } else {
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap, i, i2, width2, height2);
                        if (createBitmap != null) {
                            int width4 = createBitmap.getWidth();
                            int width5 = bitmap.getWidth() - i;
                            if (width4 > width5) {
                                width4 = width5;
                            }
                            int height4 = createBitmap.getHeight();
                            int height5 = bitmap.getHeight() - i2;
                            if (height4 > height5) {
                                height4 = height5;
                            }
                            loop0: for (int i3 = 0; i3 < width4; i3++) {
                                int i4 = height4 - 10;
                                if (i4 < 0) {
                                    i4 = 0;
                                }
                                while (i4 < height4) {
                                    if (bitmap.getPixel(i + i3, i2 + i4) != createBitmap.getPixel(i3, i4)) {
                                        break loop0;
                                    }
                                    i4++;
                                }
                            }
                        }
                        osz = new OSZ(createBitmap, valueOf);
                    }
                }
                Bitmap bitmap2 = (Bitmap) osz.getFirst();
                if (bitmap2 == null) {
                    return new OSZ(null, osz.getSecond());
                }
                if (BitmapUtils.saveBitmapToSD(bitmap2, file.getParent(), file.getName())) {
                    str = file.getAbsolutePath();
                }
                return new OSZ(str, Integer.valueOf(R.string.sp2));
            }
            o.LJIJI("mOriginalBitmap");
            throw null;
        }
        o.LJIJI("mCoverImage");
        throw null;
    }

    public static final Object call$3(ACallableS116S0100000_13 aCallableS116S0100000_13) {
        File[] listFiles;
        C77404UZk c77404UZk = ((C77403UZj) aCallableS116S0100000_13.l0).LJFF;
        boolean z = false;
        if (c77404UZk != null) {
            File file = new File(c77404UZk.LJ());
            File file2 = new File(c77404UZk.LIZLLL());
            String str = c77404UZk.LIZLLL;
            if (file.exists() && file2.exists() && file2.isDirectory() && (listFiles = file2.listFiles()) != null && listFiles.length != 0 && file.exists()) {
                z = TextUtils.equals(C38352F3k.LIZIZ(file), str);
            }
        }
        return Boolean.valueOf(z);
    }

    public ACallableS116S0100000_13(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
