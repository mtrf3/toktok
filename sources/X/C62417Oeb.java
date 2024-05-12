package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS114S0300000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Oeb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62417Oeb {
    public static UrlModel LIZJ(CreateAwemeResponse createAwemeResponse) {
        String str;
        o.LJIIIZ(createAwemeResponse, "createAwemeResponse");
        Aweme aweme = createAwemeResponse.aweme;
        AVUploadSaveModel aVUploadSaveModel = createAwemeResponse.mSaveModel;
        o.LJIIIIZZ(aweme, "aweme");
        if (LJ(aweme)) {
            ArrayList arrayList = new ArrayList();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("file://");
            if (aVUploadSaveModel != null) {
                str = aVUploadSaveModel.getImageModeCoverPathNoWatermark();
            } else {
                str = null;
            }
            LIZ.append(str);
            arrayList.add(X1D.LIZIZ(LIZ));
            UrlModel urlModel = new UrlModel();
            urlModel.setUrlList(arrayList);
            return urlModel;
        }
        return aweme.getVideo().getCover();
    }

    public static boolean LJ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        if (aweme.getAwemeType() == 150 || C1DF.LJJIII(aweme)) {
            return true;
        }
        return false;
    }

    public static void LIZLLL(Aweme aweme, EnumC62419Oed channel, String str, Activity activity) {
        InterfaceC62544Oge c62416Oea;
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(activity, "activity");
        C62281OcP c62281OcP = OYR.LIZ;
        String key = channel.getKey();
        c62281OcP.getClass();
        InterfaceC62225ObV LIZ = C62281OcP.LIZ(activity, key);
        if (LIZ == null) {
            return;
        }
        if (C62514OgA.LIZ[channel.ordinal()] == 1) {
            c62416Oea = new C62524OgK(LIZ);
        } else {
            c62416Oea = new C62416Oea(LIZ);
        }
        c62416Oea.LIZ(activity, str, new C62463OfL(channel, aweme), new AqS114S0300000_10(LIZ, aweme, activity, 14));
    }

    public static Drawable LIZ(Context context, int i, int i2, int i3, int i4) {
        o.LJIIIZ(context, "context");
        StateListDrawable stateListDrawable = new StateListDrawable();
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = i;
        c2068389v.LJ = Integer.valueOf(R.attr.gp);
        c2068389v.LIZIZ = C7MY.LIZIZ(i4);
        c2068389v.LIZJ = C7MY.LIZIZ(i4);
        SY9 LIZ = c2068389v.LIZ(context);
        C110614Vt c110614Vt = new C110614Vt();
        if (AVExternalServiceImpl.LIZ().publishService().isEnablePutSettingsIntoMoreOption()) {
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.cf);
        } else {
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.cs);
            c110614Vt.LJFF = Integer.valueOf(R.attr.e0);
            c110614Vt.LIZLLL = AnonymousClass391.LIZJ(1);
        }
        c110614Vt.LJII = C7MY.LIZIZ(i3);
        c110614Vt.LJI = C7MY.LIZIZ(i3);
        c110614Vt.LIZJ = C61328O5c.LIZJ(50);
        LayerDrawable LJIIJ = C26338AVi.LJIIJ(LIZ, c110614Vt.LIZ(context));
        C2068389v c2068389v2 = new C2068389v();
        c2068389v2.LIZ = i2;
        c2068389v2.LIZIZ = C7MY.LIZIZ(i3);
        c2068389v2.LIZJ = C7MY.LIZIZ(i3);
        SY9 LIZ2 = c2068389v2.LIZ(context);
        stateListDrawable.addState(new int[]{-16842912}, LJIIJ);
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, LIZ2);
        stateListDrawable.addState(new int[0], LJIIJ);
        return stateListDrawable;
    }

    public static Drawable LIZIZ(int i, int i2, int i3, int i4, Context context, boolean z) {
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = i;
        c2068389v.LJ = Integer.valueOf(R.attr.gp);
        c2068389v.LIZIZ = C7MY.LIZIZ(i4);
        c2068389v.LIZJ = C7MY.LIZIZ(i4);
        SY9 LIZ = c2068389v.LIZ(context);
        C110614Vt c110614Vt = new C110614Vt();
        if (AVExternalServiceImpl.LIZ().publishService().isEnablePutSettingsIntoMoreOption()) {
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.cv);
        } else {
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.cs);
            c110614Vt.LJFF = Integer.valueOf(R.attr.e0);
            c110614Vt.LIZLLL = AnonymousClass391.LIZJ(1);
        }
        c110614Vt.LJII = C7MY.LIZIZ(i3);
        c110614Vt.LJI = C7MY.LIZIZ(i3);
        c110614Vt.LIZJ = C61328O5c.LIZJ(50);
        LayerDrawable LJIIJ = C26338AVi.LJIIJ(LIZ, c110614Vt.LIZ(context));
        C2068389v c2068389v2 = new C2068389v();
        c2068389v2.LIZ = i2;
        c2068389v2.LIZIZ = C7MY.LIZIZ(i3);
        c2068389v2.LIZJ = C7MY.LIZIZ(i3);
        SY9 LIZ2 = c2068389v2.LIZ(context);
        if (z) {
            return LIZ2;
        }
        return LJIIJ;
    }
}
