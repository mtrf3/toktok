package X;

import Y.IDuS82S0200000_13;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.other.LiveImageLoaderModuleSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Cbl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31665Cbl {
    public static Rect LIZIZ(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.nativeOrder());
        if (order.get() == 0) {
            return null;
        }
        order.get();
        order.get();
        order.get();
        order.getInt();
        order.getInt();
        Rect rect = new Rect();
        rect.left = order.getInt();
        rect.right = order.getInt();
        rect.top = order.getInt();
        rect.bottom = order.getInt();
        return rect;
    }

    public static C73390SrC LIZJ(ImageModel imageModel) {
        return AbstractC73672Svk.LJIIJ(new IDuS82S0200000_13(imageModel, C38016Ew0.LIZ, 1));
    }

    public static NinePatchDrawable LIZ(float f, Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.postScale(f, f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        byte[] bArr = null;
        if (bitmap.getNinePatchChunk() == null) {
            return null;
        }
        byte[] ninePatchChunk = bitmap.getNinePatchChunk();
        if (ninePatchChunk != null) {
            ByteBuffer order = ByteBuffer.allocate(ninePatchChunk.length).order(ByteOrder.nativeOrder());
            ByteBuffer order2 = ByteBuffer.wrap(ninePatchChunk).order(ByteOrder.nativeOrder());
            if (order2.get() != 0) {
                order.put((byte) 1);
                int i = order2.get();
                int[] iArr = new int[i];
                int i2 = order2.get();
                int[] iArr2 = new int[i2];
                byte b = order2.get();
                order.put((byte) i);
                order.put((byte) i2);
                order.put(b);
                order.putInt(order2.getInt());
                order.putInt(order2.getInt());
                order.putInt((int) (order2.getInt() * f));
                order.putInt((int) (order2.getInt() * f));
                order.putInt((int) (order2.getInt() * f));
                order.putInt((int) (order2.getInt() * f));
                order.putInt(order2.getInt());
                iArr[0] = order2.getInt();
                iArr[1] = order2.getInt();
                order.putInt((int) (iArr[0] * f));
                order.putInt((int) (iArr[1] * f));
                iArr2[0] = order2.getInt();
                iArr2[1] = order2.getInt();
                order.putInt((int) (iArr2[0] * f));
                order.putInt((int) (iArr2[1] * f));
                for (int i3 = 0; i3 < b; i3++) {
                    order.putInt(order2.getInt());
                }
                bArr = order.array();
            }
        }
        return new NinePatchDrawable(C15380j0.LJIIJ(), createBitmap, bArr, LIZIZ(bArr), null);
    }

    public static void LJ(ImageModel imageModel, C47061t0 c47061t0) {
        List<String> arrayList = new ArrayList<>();
        if (imageModel != null && imageModel.getUrls() != null) {
            arrayList = imageModel.getUrls();
        }
        C15650jR.LIZ().LIZ(arrayList).LJIIJJI(c47061t0);
    }

    public static void LJI(C47061t0 c47061t0, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c47061t0.setImageURI(W5P.LIZLLL(UriProtector.parse(str)).LIZ().LIZIZ);
    }

    public static void LJFF(C47061t0 c47061t0, ImageModel imageModel, C78739UvH c78739UvH) {
        C15620jO.LIZJ(c47061t0, imageModel, null, c78739UvH, null, false);
    }

    public static void LJII(ImageView imageView, ImageModel imageModel, EnumC78722Uv0 enumC78722Uv0) {
        PointF pointF;
        if (LiveImageLoaderModuleSetting.useImageModule()) {
            if (!C15650jR.LIZIZ(imageModel)) {
                return;
            }
            C78720Uuy LIZ = C15650jR.LIZ().LIZ(imageModel.getUrls());
            LIZ.LJIIIIZZ = 0;
            LIZ.LJIILJJIL = enumC78722Uv0;
            LIZ.LJIIJJI = null;
            LIZ.LJIIJJI(imageView);
            return;
        }
        if (imageModel == null || C79004UzY.LJJIFFI(imageModel.getUrls()) || imageView == null || !C15640jQ.LIZIZ(imageView.getContext())) {
            return;
        }
        C17190lv LJII = C17190lv.LJII(imageView.getContext());
        LJII.LIZLLL(C15640jQ.LIZ(imageModel));
        LJII.LJFF = imageModel;
        LJII.LIZ(ImageView.ScaleType.CENTER_CROP);
        if (enumC78722Uv0 != null) {
            LJII.LJIIIIZZ = new AbstractC78707Uul() { // from class: X.1mg
                @Override // X.AbstractC78707Uul
                public final void LIZ(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
                    float f5;
                    float height;
                    float abs;
                    int i3;
                    if (rect != null) {
                        float f6 = i;
                        float LJIIL = C15380j0.LJIIL() / f6;
                        float f7 = i2;
                        float LJIIJJI = C15380j0.LJIIJJI() / f7;
                        if (LJIIJJI > LJIIL) {
                            f5 = ((rect.width() - (f6 * LJIIJJI)) * 0.5f) + rect.left;
                            if (f2 == 0.0f) {
                                i3 = rect.top;
                            } else if (f2 == 1.0f) {
                                abs = (rect.height() - (f7 * LJIIJJI)) + rect.top;
                                LJIIL = LJIIJJI;
                            } else {
                                i3 = rect.top;
                            }
                            abs = i3;
                            LJIIL = LJIIJJI;
                        } else {
                            f5 = rect.left;
                            float f8 = f7 * LJIIL;
                            float LJIIJJI2 = (C15380j0.LJIIJJI() - f8) * 0.5f;
                            if (f2 == 0.0f) {
                                height = rect.top;
                            } else if (f2 == 1.0f) {
                                abs = ((Math.abs(LJIIJJI2) + rect.height()) - f8) + rect.top;
                            } else {
                                LJIIJJI2 = rect.top;
                                height = (rect.height() - f8) * 0.5f;
                            }
                            abs = height + LJIIJJI2;
                        }
                        if (matrix != null) {
                            matrix.setScale(LJIIL, LJIIL);
                            matrix.postTranslate((int) (f5 + 0.5f), (int) (abs + 0.5f));
                        }
                    }
                }
            };
            int i = C15630jP.LIZ[enumC78722Uv0.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    pointF = new PointF(0.5f, 0.5f);
                } else {
                    pointF = new PointF(0.5f, 1.0f);
                }
            } else {
                pointF = new PointF(0.5f, 0.0f);
            }
            LJII.LJIIIZ = pointF;
        }
        LJII.LIZJ(imageView);
    }

    public static void LJIIIZ(ImageView imageView, ImageModel imageModel, int i) {
        C15640jQ.LJIIIZ(imageView, imageModel, 0, 0, i, null);
    }

    public static void LIZLLL(ImageView imageView, ImageModel imageModel, int i, int i2) {
        if (imageView == null || imageModel == null || C79004UzY.LJJIFFI(imageModel.getUrls()) || !C15640jQ.LIZIZ(imageView.getContext())) {
            return;
        }
        C15640jQ.LIZJ(i, i2, -1, imageView, imageModel, null, false);
    }

    public static void LJIIIIZZ(View view, ImageModel imageModel, boolean z, InterfaceC31672Cbs interfaceC31672Cbs) {
        if (imageModel == null || imageModel.getUrls() == null || imageModel.getUrls().size() == 0) {
            return;
        }
        W5I.LIZ().LJFF(W5P.LIZLLL(UriProtector.parse((String) ListProtector.get(imageModel.getUrls(), 0))).LIZ(), null).LJ(new C31670Cbq(view, z, interfaceC31672Cbs), FT1.LIZ());
    }

    public static void LJIIJ(ImageView imageView, ImageModel imageModel, int i, int i2, int i3) {
        C15640jQ.LJIIIZ(imageView, imageModel, i, i2, i3, null);
    }
}
