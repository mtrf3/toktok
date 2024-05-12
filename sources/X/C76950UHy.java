package X;

import Y.ACListenerS5S0401000_13;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.wallet.LiveKYCVerifyUrlSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveKYCViewDetailUrlSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.UHy, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76950UHy {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(DialogC77438UaI dialogC77438UaI) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", dialogC77438UaI, new Object[0], "void", new C65300Pk0(false, "()V", "790349276036420796")).LIZ) {
            return;
        }
        dialogC77438UaI.show();
    }

    public static android.net.Uri LJ(String str, UI8 ui8) {
        android.net.Uri uri = UriProtector.parse(new C32364Cn2(str).LIZLLL());
        String queryParameter = UriProtector.getQueryParameter(uri, "url");
        if (queryParameter == null) {
            queryParameter = "";
        }
        android.net.Uri rawUrlUri = UriProtector.parse(queryParameter);
        o.LJIIIIZZ(rawUrlUri, "rawUrlUri");
        android.net.Uri LIZ2 = C243059gL.LIZ(rawUrlUri, "enter_from", C77541Ubx.LJII(ui8));
        o.LJIIIIZZ(uri, "uri");
        String uri2 = LIZ2.toString();
        o.LJIIIIZZ(uri2, "newUrlUri.toString()");
        return C243059gL.LIZ(uri, "url", uri2);
    }

    public static void LIZIZ(Context context, UI5 dialogType, String str, int i, UI8 ui8) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(dialogType, "dialogType");
        C77541Ubx.LJIILLIIL(i, ui8);
        android.net.Uri LJ = LJ(LiveKYCVerifyUrlSetting.INSTANCE.getValue(), ui8);
        C77437UaH c77437UaH = new C77437UaH(context);
        c77437UaH.LJI(dialogType.getTitleResId());
        c77437UaH.LJI = str;
        c77437UaH.LJ(dialogType.getPositiveResId(), new DialogInterfaceOnClickListenerC76951UHz(context, LJ, i, ui8), false);
        c77437UaH.LIZJ(dialogType.getNegativeResId(), new UI0(i, ui8), false);
        c77437UaH.LJJII = false;
        LIZ(c77437UaH.LIZ());
    }

    public static void LIZJ(Context context, UI5 dialogType, String str, int i, UI8 ui8) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(dialogType, "dialogType");
        C77541Ubx.LJIILLIIL(i, ui8);
        android.net.Uri LJ = LJ(LiveKYCVerifyUrlSetting.INSTANCE.getValue(), ui8);
        C77437UaH c77437UaH = new C77437UaH(context);
        c77437UaH.LJI(dialogType.getTitleResId());
        c77437UaH.LJI = str;
        c77437UaH.LJ(dialogType.getPositiveResId(), new DialogInterfaceOnClickListenerC76920UGu(context, LJ, i, ui8), false);
        c77437UaH.LIZJ(dialogType.getNegativeResId(), new DialogInterfaceOnClickListenerC76921UGv(i, ui8), false);
        c77437UaH.LJJII = false;
        LIZ(c77437UaH.LIZ());
    }

    public static void LIZLLL(Context context, UI5 dialogType, String str, int i, UI8 ui8) {
        View findViewById;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(dialogType, "dialogType");
        C77541Ubx.LJIILLIIL(i, ui8);
        android.net.Uri LJ = LJ(LiveKYCViewDetailUrlSetting.INSTANCE.getValue(), ui8);
        View inflate = View.inflate(context, R.layout.d7z, null);
        if (inflate != null) {
            TextView textView = (TextView) inflate.findViewById(R.id.m_a);
            if (textView != null) {
                textView.setText(str);
            }
            TextView textView2 = (TextView) inflate.findViewById(R.id.m__);
            if (textView2 != null) {
                textView2.setText(dialogType.getNegativeResId());
            }
        }
        C77437UaH c77437UaH = new C77437UaH(context);
        c77437UaH.LJI(dialogType.getTitleResId());
        c77437UaH.LJIJI = inflate;
        c77437UaH.LJ(dialogType.getPositiveResId(), new DialogInterfaceOnClickListenerC76922UGw(i, ui8), false);
        c77437UaH.LJJII = false;
        DialogC77438UaI LIZ2 = c77437UaH.LIZ();
        if (inflate != null && (findViewById = inflate.findViewById(R.id.g72)) != null) {
            C16880lQ.LJIIJ(new ACListenerS5S0401000_13(context, LJ, i, ui8, LIZ2, 0), findViewById);
        }
        LIZ(LIZ2);
    }

    public static final UI4 LJFF(Context context, Throwable th, Runnable runnable, Runnable runnable2, int i, int i2, boolean z) {
        int i3;
        Exception exc;
        if (context == null) {
            return new UI4(false, false);
        }
        if (th instanceof C29401Dk) {
            i3 = ((C276516r) th).getErrorCode();
        } else if (th instanceof C0TL) {
            i3 = ((C0TL) th).statusCode;
        } else {
            i3 = -1;
        }
        UI8 ui8 = new UI8();
        ui8.LIZIZ = i3;
        ui8.LJIIJJI = i;
        ui8.LJIIL = i2;
        ui8.LJIILIIL = z;
        if (th instanceof Exception) {
            exc = (Exception) th;
        } else {
            exc = null;
        }
        ui8.LIZLLL = exc;
        ui8.LJIIJ = new UI1(runnable2, runnable);
        return UI6.LIZJ(context, ui8);
    }
}
