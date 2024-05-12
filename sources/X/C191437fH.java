package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.poi.map.service.GoogleMapServiceImpl;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.jvm.internal.o;

/* renamed from: X.7fH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C191437fH {
    public static final boolean LIZ(C191337f7 c191337f7) {
        boolean z;
        if (c191337f7.getPoiLat() == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && c191337f7.getPoiLng() == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            z = false;
        } else {
            z = true;
        }
        if (!GoogleMapServiceImpl.LJFF().LIZIZ()) {
            z = false;
        }
        if (!GoogleMapServiceImpl.LJFF().LIZJ()) {
            z = false;
        }
        if (c191337f7.getDisableInteraction()) {
            z = false;
        }
        Integer valueOf = Integer.valueOf((int) c191337f7.getDefaultZoomLevel());
        Double valueOf2 = Double.valueOf(c191337f7.getMaxLat());
        Double valueOf3 = Double.valueOf(c191337f7.getMinLat());
        Double valueOf4 = Double.valueOf(c191337f7.getMaxLng());
        Double valueOf5 = Double.valueOf(c191337f7.getMinLng());
        if (valueOf == null && valueOf2 != null && valueOf3 != null && valueOf4 != null && valueOf5 != null) {
            return false;
        }
        return z;
    }

    public static final String LIZJ(Context context) {
        int i;
        if (AnonymousClass636.LJIILJJIL(context)) {
            i = R.raw.poi_dynamic_google_map_dark_style;
        } else {
            i = R.raw.poi_dynamic_google_map_style;
        }
        InputStream openRawResource = context.getResources().openRawResource(i);
        o.LJIIIIZZ(openRawResource, "context.resources.openRawResource(raw)");
        byte[] bArr = new byte[openRawResource.available()];
        openRawResource.read(bArr);
        Charset defaultCharset = Charset.defaultCharset();
        o.LJIIIIZZ(defaultCharset, "defaultCharset()");
        return new String(bArr, defaultCharset);
    }

    public static final void LIZIZ(final ViewGroup viewGroup, String str, final InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, final InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, final InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3) {
        if (str == null) {
            if (interfaceC65784Pro2 != null) {
                interfaceC65784Pro2.invoke();
                return;
            }
            return;
        }
        if (viewGroup == null) {
            if (interfaceC65784Pro2 != null) {
                interfaceC65784Pro2.invoke();
                return;
            }
            return;
        }
        viewGroup.removeAllViews();
        Context context = viewGroup.getContext();
        o.LJIIIIZZ(context, "vpHolder.context");
        final TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setClickable(false);
        C51556KLg.LIZ.getClass();
        if (C51556KLg.LIZ().LJJJJLL() != null) {
            float LJIL = C51556KLg.LIZ().LJIL();
            if (LJIL <= 0.0f || LJIL > 1.0f) {
                LJIL = 1.0f;
            }
            float width = viewGroup.getWidth() * LJIL;
            float height = viewGroup.getHeight() * LJIL;
            if (width == 0.0f || height == 0.0f) {
                width = C60996Nwm.LJIIJ(viewGroup.getContext());
                height = C60996Nwm.LJFF(viewGroup.getContext());
            }
            if (width > 1024.0f || height > 1024.0f) {
                float f = 1024;
                float f2 = width / f;
                float f3 = height / f;
                if (f2 < f3) {
                    f2 = f3;
                }
                width /= f2;
                height /= f2;
            }
            W5F LJIIIIZZ = W5U.LJIIIIZZ(String.valueOf(C51556KLg.LIZ().LJJIJIL(str, (int) width, (int) height, i0.LJFF("color:0xFE2C55|", str), "2", "roadmap", "feature:poi|element:labels|visibility:off")));
            LJIIIIZZ.LJIJI = Bitmap.Config.ARGB_8888;
            LJIIIIZZ.LJIJJ = EnumC72807Shn.CENTER_CROP;
            LJIIIIZZ.LJIIIZ(new InterfaceC78660Uu0() { // from class: X.7fI
                @Override // X.InterfaceC78660Uu0
                public final void onProgress(float f4) {
                }

                @Override // X.InterfaceC78660Uu0
                public final void LIZ() {
                    InterfaceC65784Pro<C76800UCe> interfaceC65784Pro4 = interfaceC65784Pro3;
                    if (interfaceC65784Pro4 != null) {
                        interfaceC65784Pro4.invoke();
                    }
                }

                @Override // X.InterfaceC78660Uu0
                public final void LIZIZ(Bitmap bitmap) {
                    if (bitmap != null) {
                        TuxIconView tuxIconView2 = TuxIconView.this;
                        ViewGroup viewGroup2 = viewGroup;
                        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro4 = interfaceC65784Pro;
                        tuxIconView2.setImageBitmap(bitmap);
                        viewGroup2.addView(tuxIconView2);
                        if (interfaceC65784Pro4 != null) {
                            interfaceC65784Pro4.invoke();
                        }
                    }
                }

                @Override // X.InterfaceC78660Uu0
                public final void onFailed(Throwable th) {
                    InterfaceC65784Pro<C76800UCe> interfaceC65784Pro4 = interfaceC65784Pro2;
                    if (interfaceC65784Pro4 != null) {
                        interfaceC65784Pro4.invoke();
                    }
                }
            });
        }
    }
}
