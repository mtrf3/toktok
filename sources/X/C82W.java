package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.model.SlidesImageLoadParams;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.82W, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C82W extends C82P {
    public final InterfaceC2048182b LJIILIIL;
    public final ViewOnTouchListenerC82716WdE LJIILJJIL;
    public final C82U LJIILL;

    @Override // X.C82P
    public final void LIZIZ() {
    }

    @Override // X.C82P
    public final void LJFF() {
        super.LJFF();
        ViewOnTouchListenerC82716WdE viewOnTouchListenerC82716WdE = this.LJIILJJIL;
        if (viewOnTouchListenerC82716WdE != null) {
            viewOnTouchListenerC82716WdE.setImageDisplayListener(null);
        }
    }

    @Override // X.C82P
    public final void LJ(W5F w5f) {
        w5f.LJJIIJ = this.LJIILJJIL;
        w5f.LJIIL = 0;
        w5f.LIZLLL(this.LJIILL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.82U] */
    public C82W(C82S feedPhotoParams, InterfaceC2048082a interfaceC2048082a, View itemView, C82Q c82q) {
        super(feedPhotoParams, interfaceC2048082a, itemView);
        o.LJIIIZ(feedPhotoParams, "feedPhotoParams");
        o.LJIIIZ(itemView, "itemView");
        this.LJIILIIL = c82q;
        View findViewById = itemView.findViewById(R.id.k5v);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.smart_image_view)");
        this.LJIILJJIL = (ViewOnTouchListenerC82716WdE) findViewById;
        this.LJIILL = new InterfaceC70769Rq1() { // from class: X.82U
            @Override // X.InterfaceC70769Rq1
            public final void D1(android.net.Uri uri, C2047581v c2047581v) {
            }

            @Override // X.InterfaceC70769Rq1
            public final void LJLLLLLL(android.net.Uri uri) {
            }

            @Override // X.InterfaceC70769Rq1
            public final void LLZZJLIL(android.net.Uri uri, Throwable th) {
            }

            @Override // X.InterfaceC70769Rq1
            public final void T1(android.net.Uri uri, SmartImageView smartImageView) {
            }

            @Override // X.InterfaceC70769Rq1
            public final void s2(android.net.Uri uri, View view, Throwable th) {
                int i;
                String str;
                C64799Pbv c64799Pbv;
                C82W c82w = C82W.this;
                if (th != null) {
                    i = C90393gh.LIZ(th);
                } else {
                    i = -1;
                }
                C64668PZo c64668PZo = null;
                if (th != null) {
                    str = th.getMessage();
                } else {
                    str = null;
                }
                if ((th instanceof C64799Pbv) && (c64799Pbv = (C64799Pbv) th) != null) {
                    c64668PZo = c64799Pbv.getRequestInfo();
                }
                c82w.LIZJ(i, str, String.valueOf(c64668PZo));
            }

            @Override // X.InterfaceC70769Rq1
            public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
                int i;
                if (c2047581v != null) {
                    C82W.this.LJIILIIL.LIZ(c2047581v.LIZ, c2047581v.LIZIZ);
                    C82W c82w = C82W.this;
                    int i2 = c2047581v.LIZ;
                    int i3 = c2047581v.LIZIZ;
                    Bitmap.Config config = C82P.LJIIL;
                    int i4 = i2 * i3;
                    if (config == null) {
                        i = -1;
                    } else {
                        i = C83E.LIZ[config.ordinal()];
                    }
                    int i5 = 1;
                    if (i != 1) {
                        if (i != 2 && (i == 3 || i == 4)) {
                            i5 = 2;
                        }
                    } else {
                        i5 = 4;
                    }
                    c82w.LIZLLL();
                    SlidesImageLoadParams LIZ = c82w.LIZ(0, SystemClock.elapsedRealtime() - c82w.LJIIIZ);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(i2);
                    LIZ2.append('*');
                    LIZ2.append(i3);
                    SlidesImageLoadParams LIZ3 = SlidesImageLoadParams.LIZ(LIZ, X1D.LIZIZ(LIZ2), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4 * i5), null, null, null, 8308735);
                    InterfaceC2048082a interfaceC2048082a2 = c82w.LIZIZ;
                    if (interfaceC2048082a2 != null) {
                        interfaceC2048082a2.LIZ(LIZ3);
                        return;
                    }
                    return;
                }
                C82W.this.LIZJ(-2, null, null);
            }
        };
    }
}
