package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.82r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2049782r extends C82K {
    public final ViewOnTouchListenerC82716WdE LIZLLL;
    public final C2049982t LJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.82t] */
    public C2049782r(View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        View findViewById = itemView.findViewById(R.id.k5v);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.smart_image_view)");
        this.LIZLLL = (ViewOnTouchListenerC82716WdE) findViewById;
        this.LJ = new InterfaceC70769Rq1() { // from class: X.82t
            @Override // X.InterfaceC70769Rq1
            public final void LJLLLLLL(android.net.Uri uri) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("PhotoMode Image is released uri: ");
                LIZ.append(uri);
                X1D.LIZIZ(LIZ);
            }

            @Override // X.InterfaceC70769Rq1
            public final void D1(android.net.Uri uri, C2047581v c2047581v) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("PhotoMode Intermediate image set uri: ");
                LIZ.append(uri);
                LIZ.append(' ');
                X1D.LIZIZ(LIZ);
            }

            @Override // X.InterfaceC70769Rq1
            public final void LLZZJLIL(android.net.Uri uri, Throwable th) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("PhotoMode Intermediate image failed uri: ");
                LIZ.append(uri);
                LIZ.append(' ');
                X1D.LIZIZ(LIZ);
            }

            @Override // X.InterfaceC70769Rq1
            public final void T1(android.net.Uri uri, SmartImageView smartImageView) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("PhotoMode Image fetch started uri: ");
                LIZ.append(uri);
                LIZ.append(' ');
                X1D.LIZIZ(LIZ);
                if (smartImageView != null) {
                    smartImageView.setBackgroundColor(0);
                }
            }

            @Override // X.InterfaceC70769Rq1
            public final void s2(android.net.Uri uri, View view, Throwable th) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("PhotoMode image onFailed: ");
                LIZ.append(uri);
                X1D.LIZIZ(LIZ);
            }

            @Override // X.InterfaceC70769Rq1
            public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
                boolean z;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("PhotoMode image onComplete ");
                if (c2047581v != null) {
                    z = true;
                } else {
                    z = false;
                }
                LIZ.append(z);
                LIZ.append(" uri: ");
                LIZ.append(uri);
                X1D.LIZIZ(LIZ);
                if (c2047581v != null && view != null) {
                    view.setBackgroundColor(-16777216);
                }
            }
        };
    }
}
