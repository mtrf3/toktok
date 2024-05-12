package com.ss.android.ugc.aweme.homepage.ui.inflate;

import X.C04270Et;
import X.C0RN;
import X.C2068389v;
import X.C34710Djm;
import X.C36093EEn;
import X.C63081OpJ;
import X.C63144OqK;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FU3;
import X.SY9;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class PreDrawableInflate implements IPreDrawableInflate {
    public final Map<String, Object> LJLIL = new ConcurrentHashMap();
    public final Map<Integer, Drawable> LJLILLLLZI = new ConcurrentHashMap();

    @Override // X.InterfaceC36101EEv
    public final int LIZIZ() {
        return R.style.ul;
    }

    @Override // X.EEY
    public final String key() {
        return "PreDrawableInflate";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "inflate_";
    }

    @Override // X.EEY
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.EEY
    public final /* synthetic */ int targetProcess() {
        return C63144OqK.LIZ();
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.inflate.IPreDrawableInflate
    public final Object LJIIIIZZ() {
        return ((ConcurrentHashMap) this.LJLIL).get("status_bar_height");
    }

    @Override // X.InterfaceC36101EEv
    public final Class<? extends Activity> LIZ() {
        return HomePageUIFrameServiceImpl.LIZ().getHomePageInflateActivityClass();
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EEY
    public final EnumC36103EEx triggerType() {
        return EnumC36103EEx.INFLATE;
    }

    public final Drawable LIZLLL(int i, Context context) {
        Drawable drawable = (Drawable) ((ConcurrentHashMap) this.LJLILLLLZI).remove(Integer.valueOf(i));
        if (drawable == null) {
            o.LJI(context);
            drawable = C04270Et.LIZIZ(context, i);
        }
        o.LJI(drawable);
        return drawable;
    }

    public final void LJ(Context context, int i) {
        try {
            Drawable LIZIZ = C04270Et.LIZIZ(context, i);
            ((ConcurrentHashMap) this.LJLILLLLZI).put(Integer.valueOf(i), LIZIZ);
        } catch (Exception unused) {
        }
    }

    @Override // X.InterfaceC36101EEv
    public final void LJFF(Activity activity, Context context) {
        o.LJIIIZ(context, "context");
        if (((Boolean) C34710Djm.LJJJJLI.getValue()).booleanValue()) {
            LJII(R.raw.icon_tab_home_fill, context);
            return;
        }
        if (!((Boolean) C34710Djm.LJIIIZ.getValue()).booleanValue()) {
            LJ(context, R.drawable.bnr);
            LJ(context, R.drawable.nl);
            LJ(context, R.drawable.aw6);
            LJ(context, R.drawable.avx);
        }
        if (SearchServiceImpl.LLLZI().LJLIIIL()) {
            LJ(context, R.drawable.avl);
            LJ(context, R.drawable.avj);
            LJ(context, R.drawable.avk);
        } else {
            LJ(context, R.drawable.avz);
            LJ(context, R.drawable.avy);
            LJ(context, R.drawable.aw1);
        }
        LJII(R.raw.icon_tab_home_fill, context);
        LJII(R.raw.icon_color_create_light, context);
        LJII(R.raw.icon_color_create_dark, context);
        LJ(context, R.drawable.avw);
        LJ(context, R.drawable.avp);
        LJ(context, R.drawable.avq);
        LJ(context, R.drawable.aw5);
        try {
            ((ConcurrentHashMap) this.LJLIL).put("status_bar_height", Integer.valueOf(C63081OpJ.LJJJJLI(context)));
        } catch (Exception unused) {
        }
        if (((Boolean) FU3.LIZJ.getValue()).booleanValue()) {
            C36093EEn.LIZ.getClass();
            C36093EEn.LJIIIZ().LIZ(new EE1() { // from class: com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate$inflate$1
                @Override // X.EEY
                public final String key() {
                    return "PreDrawableInflate$inflate$1";
                }

                @Override // X.EEY
                public final /* synthetic */ boolean meetTrigger() {
                    return true;
                }

                @Override // X.EEY
                public final /* synthetic */ String prefix() {
                    return "task_";
                }

                @Override // X.EE1
                public final /* synthetic */ boolean serialExecute() {
                    return false;
                }

                @Override // X.EEY
                public final /* synthetic */ int targetProcess() {
                    return C0RN.LIZ();
                }

                @Override // X.EEY
                public final /* synthetic */ List triggerOtherLegoComponents() {
                    return null;
                }

                @Override // X.EEY
                public final /* synthetic */ EnumC36103EEx triggerType() {
                    return C0RN.LIZIZ(this);
                }

                @Override // X.EEY
                public final EnumC36092EEm scenesType() {
                    return EnumC36092EEm.DEFAULT;
                }

                @Override // X.EE1
                public final EFK type() {
                    return EFK.BOOT_FINISH;
                }

                @Override // X.EEY
                public final void run(Context context2) {
                    o.LJIIIZ(context2, "context");
                    PreDrawableInflate preDrawableInflate = PreDrawableInflate.this;
                    ((ConcurrentHashMap) preDrawableInflate.LJLIL).clear();
                    ((ConcurrentHashMap) preDrawableInflate.LJLILLLLZI).clear();
                }
            });
        }
    }

    public final void LJII(int i, Context context) {
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = i;
        SY9 LIZ = c2068389v.LIZ(context);
        ((ConcurrentHashMap) this.LJLILLLLZI).put(Integer.valueOf(i), LIZ);
    }
}
