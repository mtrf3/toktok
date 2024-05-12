package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkFrescoUseBitmap565Setting;
import com.bytedance.android.livesdk.livesetting.performance.RoomSlowFunctionOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.WidgetSlowFuncOptSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import java.util.ArrayList;

/* renamed from: X.0lv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17190lv {
    public final Context LIZ;
    public android.net.Uri LJ;
    public ImageModel LJFF;
    public C79238V7y LJI;
    public boolean LJIIL;
    public ViewOnAttachStateChangeListenerC17180lu LIZIZ = null;
    public Drawable LJII = null;
    public InterfaceC78716Uuu LJIIIIZZ = C79077V1t.LJIIZILJ;
    public PointF LJIIIZ = null;
    public V8L LJIIJ = null;
    public boolean LJIIJJI = false;
    public W4Z LIZLLL = null;
    public C81250Vug<InterfaceC81253Vuj> LIZJ = null;

    public final void LJFF() {
        if (this.LJIIJ == null) {
            this.LJIIJ = new V8L();
        }
        this.LJIIJ.LIZIZ = true;
    }

    public C17190lv(Context context) {
        this.LIZ = C16880lQ.LLLLL(context);
    }

    public static C17190lv LJII(Context context) {
        if (context != null) {
            return new C17190lv(context);
        }
        throw new IllegalArgumentException("appContext == null");
    }

    public final void LIZ(ImageView.ScaleType scaleType) {
        InterfaceC78716Uuu interfaceC78716Uuu = C79077V1t.LJIIZILJ;
        switch (C17170lt.LIZ[scaleType.ordinal()]) {
            case 1:
                interfaceC78716Uuu = InterfaceC78716Uuu.LJJLIIIIJ;
                break;
            case 2:
                interfaceC78716Uuu = InterfaceC78716Uuu.LJJLIIIJILLIZJL;
                break;
            case 3:
                interfaceC78716Uuu = InterfaceC78716Uuu.LJJLIIIJ;
                break;
            case 4:
                interfaceC78716Uuu = InterfaceC78716Uuu.LJJL;
                break;
            case 5:
                interfaceC78716Uuu = InterfaceC78716Uuu.LJJJZ;
                break;
            case 6:
                interfaceC78716Uuu = InterfaceC78716Uuu.LJJLI;
                break;
            case 7:
                interfaceC78716Uuu = InterfaceC78716Uuu.LJJJLZIJ;
                break;
            case 8:
                interfaceC78716Uuu = InterfaceC78716Uuu.LJJLIIIJJI;
                break;
        }
        this.LJIIIIZZ = interfaceC78716Uuu;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZJ(View view) {
        if (view == null) {
            return;
        }
        if (this.LJ == null && this.LJFF == null) {
            return;
        }
        if (this.LIZJ == null) {
            Object LIZ = C17220ly.LIZ(view, "DraweeHolder");
            if (LIZ instanceof C81250Vug) {
                this.LIZJ = (C81250Vug) LIZ;
            }
        }
        if (this.LJI == null && view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0) {
            this.LJI = new C79238V7y(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
        C81250Vug<InterfaceC81253Vuj> c81250Vug = this.LIZJ;
        if (c81250Vug == null) {
            view.getContext();
            this.LIZJ = new C81250Vug<>(null);
            if (this.LIZIZ == null) {
                this.LIZIZ = new ViewOnAttachStateChangeListenerC17180lu(this);
            }
            C79077V1t c79077V1t = new C79077V1t(view.getResources());
            c79077V1t.LJIIJJI = this.LJIIIZ;
            c79077V1t.LJIIJ = this.LJIIIIZZ;
            c79077V1t.LJIILL = this.LJIIJ;
            if (WidgetSlowFuncOptSetting.isEnable()) {
                c79077V1t.LIZJ = this.LJII;
            }
            this.LIZJ.LJIIIIZZ(c79077V1t.LIZ());
            W5O[] LIZIZ = LIZIZ(this.LJ, this.LJFF, this.LJI, this.LJIIL);
            if (LIZIZ == 0 || LIZIZ.length == 0) {
                return;
            }
            C81705W4v LIZJ = W5I.LIZJ();
            LIZJ.LJIIJ = this.LJIIJJI;
            LIZJ.LJII = this.LIZLLL;
            LIZJ.LJIIL = this.LIZJ.LJ;
            LIZJ.LJIIJJI = false;
            LIZJ.LJIIIZ = false;
            if (!RoomSlowFunctionOptSetting.watchOpt()) {
                LIZJ.LJFF(true, LIZIZ);
            } else if (LIZIZ.length == 1) {
                LIZJ.LIZLLL = LIZIZ[0];
            } else {
                LIZJ.LJFF(false, LIZIZ);
            }
            this.LIZJ.LJII(LIZJ.LIZ());
            if (view.isAttachedToWindow()) {
                this.LIZIZ.onViewAttachedToWindow(view);
            }
            view.addOnAttachStateChangeListener(this.LIZIZ);
            view.setOnTouchListener(this.LIZIZ);
            C17220ly.LIZIZ(view, "DraweeHolder", this.LIZJ);
        } else {
            c81250Vug.LJFF();
            C79077V1t c79077V1t2 = new C79077V1t(view.getResources());
            c79077V1t2.LJIIJJI = this.LJIIIZ;
            c79077V1t2.LJIIJ = this.LJIIIIZZ;
            c79077V1t2.LJIILL = this.LJIIJ;
            if (WidgetSlowFuncOptSetting.isEnable()) {
                c79077V1t2.LIZJ = this.LJII;
            }
            this.LIZJ.LJIIIIZZ(c79077V1t2.LIZ());
            W5O[] LIZIZ2 = LIZIZ(this.LJ, this.LJFF, this.LJI, this.LJIIL);
            if (LIZIZ2 != 0 && LIZIZ2.length != 0) {
                C81705W4v LIZJ2 = W5I.LIZJ();
                LIZJ2.LJIIJ = this.LJIIJJI;
                LIZJ2.LJII = this.LIZLLL;
                LIZJ2.LJIIL = this.LIZJ.LJ;
                LIZJ2.LJIIJJI = false;
                LIZJ2.LJIIIZ = false;
                if (!RoomSlowFunctionOptSetting.watchOpt()) {
                    LIZJ2.LJFF(true, LIZIZ2);
                } else if (LIZIZ2.length == 1) {
                    LIZJ2.LIZLLL = LIZIZ2[0];
                } else {
                    LIZJ2.LJFF(false, LIZIZ2);
                }
                this.LIZJ.LJII(LIZJ2.LIZ());
                this.LIZJ.LJ();
            } else {
                return;
            }
        }
        if (view instanceof ImageView) {
            ((ImageView) view).setImageDrawable(this.LIZJ.LIZJ());
        } else {
            view.setBackground(this.LIZJ.LIZJ());
        }
    }

    public final void LIZLLL(String str) {
        this.LJ = UriProtector.parse(str);
    }

    public final void LJ(int i) {
        this.LJII = this.LIZ.getResources().getDrawable(i);
    }

    public static void LJI(boolean z, W5P w5p) {
        if (z && LiveSdkFrescoUseBitmap565Setting.INSTANCE.isEnable()) {
            ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
            imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.RGB_565);
            w5p.LJ = new C81810W8w(imageDecodeOptionsBuilder);
        }
    }

    public static W5O[] LIZIZ(android.net.Uri uri, ImageModel imageModel, C79238V7y c79238V7y, boolean z) {
        if (uri == null && (imageModel == null || C32151Nz.LJJIIJZLJL(imageModel.getUrls()))) {
            return new W5O[0];
        }
        ArrayList arrayList = new ArrayList();
        if (uri != null) {
            W5P LIZLLL = W5P.LIZLLL(uri);
            if (c79238V7y != null) {
                LIZLLL.LIZJ = c79238V7y;
            }
            LJI(z, LIZLLL);
            W5O LIZ = LIZLLL.LIZ();
            if (LIZ != null) {
                arrayList.add(LIZ);
            }
        }
        if (imageModel != null && !C32151Nz.LJJIIJZLJL(imageModel.getUrls())) {
            C43331mz c43331mz = new C43331mz();
            for (String str : imageModel.getUrls()) {
                if (!C38354F3m.LJ(str)) {
                    W5P LIZLLL2 = W5P.LIZLLL(UriProtector.parse(str));
                    if (c79238V7y != null) {
                        LIZLLL2.LIZJ = c79238V7y;
                    }
                    LJI(z, LIZLLL2);
                    c43331mz.LIZIZ++;
                    LIZLLL2.LJIILJJIL = c43331mz;
                    W5O LIZ2 = LIZLLL2.LIZ();
                    if (!arrayList.contains(LIZ2)) {
                        arrayList.add(LIZ2);
                    }
                }
            }
        }
        if (arrayList.size() == 0) {
            return new W5O[0];
        }
        return (W5O[]) arrayList.toArray(new W5O[arrayList.size()]);
    }
}
