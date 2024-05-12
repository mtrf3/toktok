package X;

import Y.ALAdapterS1S0300000_2;
import Y.AUListenerS0S0200002_1;
import Y.IDxS132S0200000_10;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.setting.model.ShareSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Oi0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62628Oi0 {
    public static Keva LIZLLL() {
        Object value = C62629Oi1.LIZJ.getValue();
        o.LJIIIIZZ(value, "<get-lemon8Repo>(...)");
        return (Keva) value;
    }

    public static boolean LIZ() {
        Boolean LIZ = SharePrefCache.inst().getIsAwemePrivate().LIZ();
        o.LJIIIIZZ(LIZ, "inst().isAwemePrivate.cache");
        if (LIZ.booleanValue()) {
            return false;
        }
        return LIZLLL().getBoolean("key_silent_share_lemon8", false);
    }

    public static boolean LIZIZ(List channels) {
        ShareSettings shareSettings;
        Boolean LJ;
        o.LJIIIZ(channels, "channels");
        if (C62629Oi1.LIZIZ) {
            return false;
        }
        ArrayList arrayList = new ArrayList(C32I.LJJL(channels, 10));
        Iterator it = channels.iterator();
        while (it.hasNext()) {
            arrayList.add(((EnumC62419Oed) it.next()).getKey());
        }
        if (!arrayList.contains(EnumC62419Oed.LEMON8.getKey()) || (shareSettings = C36698Eak.LIZIZ().LJLJI) == null || (LJ = shareSettings.LJ()) == null || !LJ.booleanValue()) {
            return false;
        }
        return true;
    }

    public static void LJ(TuxIconView tuxIconView, DialogC25756A8y dialogC25756A8y, Activity activity) {
        EnumC62419Oed.Companion.getClass();
        if (LIZIZ(C62418Oec.LIZ(activity))) {
            C62629Oi1.LJII = false;
            C62629Oi1.LJI = false;
            EnumC62630Oi2 enumC62630Oi2 = EnumC62630Oi2.REQUESTING;
            o.LJIIIZ(enumC62630Oi2, "<set-?>");
            C62629Oi1.LIZ = enumC62630Oi2;
            C74832wh.LIZ().LIZ(new IDxS132S0200000_10(dialogC25756A8y, tuxIconView, 1));
        }
    }

    public static void LJFF(TuxIconView lemon8Button, EnumC62419Oed channel, boolean z) {
        o.LJIIIZ(lemon8Button, "lemon8Button");
        o.LJIIIZ(channel, "channel");
        C62629Oi1.LJIIIIZZ = z;
        Context context = lemon8Button.getContext();
        o.LJIIIIZZ(context, "lemon8Button.context");
        lemon8Button.setBackground(C62417Oeb.LIZIZ(channel.getUncheckedIconRes(), channel.getCheckedIconRes(), C62629Oi1.LJ, C62629Oi1.LJFF, context, C62629Oi1.LJIIIIZZ));
    }

    public static Animator LIZJ(TuxIconView tuxIconView, float f, Drawable drawable, Drawable drawable2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, f);
        ofFloat.addUpdateListener(new AUListenerS0S0200002_1(f, tuxIconView, drawable, 0));
        ofFloat.addListener(new ALAdapterS1S0300000_2(tuxIconView, drawable, drawable2, 1));
        ofFloat.setDuration(300L);
        return ofFloat;
    }
}
