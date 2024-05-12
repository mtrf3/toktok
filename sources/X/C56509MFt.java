package X;

import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.creative.model.TemplateEffectInfo;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.tools.mvtemplate.net.VideoResponse;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ttlivestreamer.core.utils.TTLSPreInitBusinessHelper;
import kotlin.jvm.internal.IDqS425S0100000;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CompletedExceptionally;

/* renamed from: X.MFt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56509MFt implements InterfaceC48038ItG, InterfaceC46111I7v {
    public static int LJLILLLLZI = -1;
    public static final C56509MFt LJLIL = new C56509MFt();
    public static final C56509MFt LJLJI = new C56509MFt();

    public static boolean LJIIJJI() {
        if (LJLILLLLZI < 0) {
            LJLILLLLZI = Build.MANUFACTURER.equalsIgnoreCase("Pico") ? 1 : 0;
        }
        if (LJLILLLLZI == 1) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC46111I7v
    public void LIZ() {
        TTLSPreInitBusinessHelper.preInitLiveCore(RunnableC30505By9.LJLIL);
    }

    public static final Object[] LIZIZ(int i) {
        if (i >= 0) {
            return new Object[i];
        }
        "capacity must be non-negative.".toString();
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    public static final String LIZLLL(KRA kra) {
        M89 m89;
        String eventType;
        if (kra == null || (m89 = kra.LIZJ) == null || (eventType = m89.getEventType()) == null) {
            return "";
        }
        return eventType;
    }

    public static final String LJ(KRA kra) {
        M89 m89;
        String from;
        if (kra == null || (m89 = kra.LIZJ) == null || (from = m89.getFrom()) == null) {
            return "";
        }
        return from;
    }

    public static final int LJFF(KRA kra) {
        M89 m89;
        if (kra != null && (m89 = kra.LIZJ) != null) {
            return m89.getPageType();
        }
        return 0;
    }

    public static final boolean LJI(Fragment fragment) {
        String str;
        o.LJIIIZ(fragment, "<this>");
        KRA LIZJ = KR8.LIZJ(fragment);
        if (LIZJ != null) {
            return LJII(LIZJ);
        }
        Bundle arguments = fragment.getArguments();
        if (arguments != null) {
            str = arguments.getString("com.ss.android.ugc.aweme.intent.extra.FEED_PANEL_SCENE", "");
        } else {
            str = null;
        }
        return ORZ.LJLJJI(str, A7F.LIZIZ);
    }

    public static final boolean LJII(KRA kra) {
        if (kra != null && A7F.LIZIZ.contains(kra.LIZ)) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIIIZZ(KRA kra) {
        String str;
        if (kra != null) {
            str = kra.LIZ;
        } else {
            str = null;
        }
        return o.LJ(str, "Following");
    }

    public static final boolean LJIIIZ(KRA kra) {
        if (kra != null && A7F.LIZ.contains(kra.LIZ)) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIJ(KRA kra) {
        String str;
        if (kra != null) {
            str = kra.LIZ;
        } else {
            str = null;
        }
        return o.LJ(str, "For You");
    }

    public static final C40431iJ LJIIL(InterfaceC07790Sh modifier) {
        o.LJIIIZ(modifier, "modifier");
        return C1DJ.LJFF(new IDqS425S0100000(modifier, 19), -1586257396, true);
    }

    public static final Object LJIILIIL(Object obj) {
        if (obj instanceof CompletedExceptionally) {
            C3C4 LIZ = C141335gf.LIZ(((CompletedExceptionally) obj).cause);
            C3C5.m7constructorimpl(LIZ);
            return LIZ;
        }
        C3C5.m7constructorimpl(obj);
        return obj;
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object it) {
        o.LJIIIZ(it, "it");
        VideoResponse videoResponse = new VideoResponse();
        videoResponse.status_code = -1;
        return videoResponse;
    }

    public static final FaceStickerBean LIZJ(Effect effect, UploadableMobileEffect2 uploadableMobileEffect2) {
        String str;
        TemplateEffectInfo templateEffectInfo = uploadableMobileEffect2.templateInfo;
        String str2 = null;
        if (templateEffectInfo != null) {
            str = templateEffectInfo.templateEffectId;
        } else {
            str = null;
        }
        if (o.LJ(str, effect.getEffectId())) {
            FaceStickerBean LJFF = SFS.LJFF(effect, null);
            LJFF.setMobileEffect(true);
            LJFF.setStickerId(CastLongProtector.parseLong(uploadableMobileEffect2.effectId));
            TemplateEffectInfo templateEffectInfo2 = uploadableMobileEffect2.templateInfo;
            if (templateEffectInfo2 != null) {
                str2 = templateEffectInfo2.templateResourceId;
            }
            LJFF.setResourceID(str2);
            LJFF.setName(uploadableMobileEffect2.effectName);
            LJFF.setCustomizedPropId(uploadableMobileEffect2.effectId);
            return LJFF;
        }
        FaceStickerBean faceStickerBean = FaceStickerBean.NONE;
        o.LJIIIIZZ(faceStickerBean, "{\n        FaceStickerBean.NONE\n    }");
        return faceStickerBean;
    }

    public static final void LJIILJJIL(int i, int i2, Object[] objArr) {
        o.LJIIIZ(objArr, "<this>");
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }
}
