package X;

import Y.IDCListenerS160S0100000_7;
import android.app.Activity;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HJA implements HJE {
    @Override // X.HJE
    public final boolean LJI() {
        return HJC.LJ();
    }

    @Override // X.HJE
    public final boolean LIZIZ(ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        if (HJC.LJ()) {
            return !shortVideoContext.LJJJI();
        }
        return false;
    }

    @Override // X.HJE
    public final int LIZJ(Parcelable parcelable) {
        MvThemeData mvThemeData;
        if ((parcelable instanceof MvThemeData) && (mvThemeData = (MvThemeData) parcelable) != null) {
            return mvThemeData.isMvAnchor;
        }
        return 0;
    }

    @Override // X.HJE
    public final OSZ<String, String> LJ(String templateId) {
        String str;
        o.LJIIIZ(templateId, "templateId");
        HEX hex = (HEX) HEU.LJ.getValue();
        hex.getClass();
        C35516Dwm c35516Dwm = (C35516Dwm) ((LinkedHashMap) hex.LIZ).get(templateId);
        String str2 = null;
        if (c35516Dwm != null) {
            str2 = c35516Dwm.LIZ;
        }
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        if (c35516Dwm != null && (str = c35516Dwm.LIZIZ) != null) {
            str3 = str;
        }
        return new OSZ<>(str2, str3);
    }

    @Override // X.HJE
    public final String LJFF(Parcelable parcelable) {
        MvThemeData mvThemeData;
        String LIZIZ;
        if (!(parcelable instanceof MvThemeData) || (mvThemeData = (MvThemeData) parcelable) == null || (LIZIZ = mvThemeData.LIZIZ()) == null) {
            return "";
        }
        return LIZIZ;
    }

    @Override // X.HJE
    public final void LIZ(Parcelable parcelable, Activity activity, IDCListenerS160S0100000_7 iDCListenerS160S0100000_7) {
        MvThemeData mvThemeData;
        EnumC43998HOo enumC43998HOo;
        if (parcelable instanceof MvThemeData) {
            mvThemeData = (MvThemeData) parcelable;
            if (mvThemeData != null) {
                enumC43998HOo = EnumC43998HOo.MV_TEMPLATE;
                if (enumC43998HOo != EnumC43998HOo.MV_TEMPLATE && HJC.LIZLLL(mvThemeData)) {
                    HJC.LJFF(activity, mvThemeData, null, iDCListenerS160S0100000_7);
                    return;
                }
            }
        } else {
            mvThemeData = null;
        }
        enumC43998HOo = null;
        if (enumC43998HOo != EnumC43998HOo.MV_TEMPLATE) {
        }
    }

    @Override // X.HJE
    public final void LIZLLL(String templateId, int i, InterfaceC88476Ynw<? super String, ? super String, ? super Long, ? super String, ? super String, ? super String, C76800UCe> interfaceC88476Ynw, InterfaceC88471Ynr<? super String, ? super String, C76800UCe> interfaceC88471Ynr) {
        o.LJIIIZ(templateId, "templateId");
        HEU.LIZIZ(templateId, i, new HJB(interfaceC88476Ynw), new AqS189S0100000_7(interfaceC88471Ynr, (InterfaceC88471Ynr<? super String, ? super String, C76800UCe>) 31));
    }
}
