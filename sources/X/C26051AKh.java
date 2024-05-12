package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.PopupWindow;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.services.uikit.CreativeToast;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.AKh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26051AKh implements CreativeToast {
    public static long LJIIIIZZ;
    public static final java.util.Map<String, Long> LJIIIZ = new LinkedHashMap();
    public final C26045AKb LIZ;
    public final C26048AKe LIZIZ;
    public C26053AKj LIZJ;
    public final Context LIZLLL;
    public final Context LJ;
    public final boolean LJFF;
    public final String LJI;
    public final long LJII;

    @Override // com.ss.android.ugc.aweme.services.uikit.CreativeToast
    public final void dismiss() {
        C26048AKe c26048AKe = this.LIZIZ;
        if (c26048AKe != null) {
            ((C26044AKa) c26048AKe.LIZ).LJLIL.LJII = false;
            AKV akv = (AKV) c26048AKe.LIZLLL;
            if (akv != null) {
                akv.dismiss();
            }
        }
        C26045AKb c26045AKb = this.LIZ;
        if (c26045AKb != null) {
            c26045AKb.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.uikit.CreativeToast
    public final Object originalToast() {
        C26045AKb c26045AKb = this.LIZ;
        if (c26045AKb == null) {
            return this.LIZIZ;
        }
        return c26045AKb;
    }

    @Override // com.ss.android.ugc.aweme.services.uikit.CreativeToast
    public final void show() {
        long j;
        if (LJIIIIZZ + 600000 <= System.currentTimeMillis()) {
            LJIIIIZZ = System.currentTimeMillis();
            long currentTimeMillis = System.currentTimeMillis();
            java.util.Map<String, Long> map = LJIIIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                if (((Number) entry.getValue()).longValue() + 30000 < currentTimeMillis) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(((Map.Entry) it.next()).getKey());
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                LJIIIZ.remove(it2.next());
            }
        }
        if (this.LJFF) {
            java.util.Map<String, Long> map2 = LJIIIZ;
            if (!map2.containsKey(this.LJI)) {
                map2.put(this.LJI, Long.valueOf(System.currentTimeMillis() + this.LJII));
            } else {
                Long l = (Long) ((LinkedHashMap) map2).get(this.LJI);
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = 0;
                }
                if (System.currentTimeMillis() < j) {
                    return;
                } else {
                    map2.put(this.LJI, Long.valueOf(System.currentTimeMillis() + this.LJII));
                }
            }
        }
        C26048AKe c26048AKe = this.LIZIZ;
        if (c26048AKe != null) {
            c26048AKe.LJII();
        }
        C26045AKb c26045AKb = this.LIZ;
        if (c26045AKb != null) {
            c26045AKb.LJIIJ();
        }
        C26053AKj c26053AKj = this.LIZJ;
        if (c26053AKj != null) {
            c26053AKj.onShow(this);
        }
    }

    public C26051AKh(Object obj, CreativeToastBuilder creativeToastBuilder) {
        Context context;
        Integer themeRes;
        this.LJI = "";
        this.LJII = 3000L;
        boolean isCenterToast = creativeToastBuilder.getConfig().isCenterToast();
        if (obj instanceof View) {
            View view = (View) obj;
            this.LIZLLL = view.getContext();
            if (isCenterToast) {
                this.LIZIZ = new C26048AKe(view);
            } else {
                this.LIZ = new C26045AKb(view);
            }
        } else if (obj instanceof Activity) {
            this.LIZLLL = (Context) obj;
            if (isCenterToast) {
                this.LIZIZ = new C26048AKe((Activity) obj);
            } else {
                this.LIZ = new C26045AKb((Activity) obj);
            }
        } else if (obj instanceof Dialog) {
            Dialog dialog = (Dialog) obj;
            this.LIZLLL = dialog.getContext();
            if (isCenterToast) {
                this.LIZIZ = new C26048AKe(dialog);
            } else {
                this.LIZ = new C26045AKb(dialog);
            }
        } else if (obj instanceof Fragment) {
            Fragment fragment = (Fragment) obj;
            this.LIZLLL = fragment.getContext();
            if (isCenterToast) {
                this.LIZIZ = new C26048AKe(fragment);
            } else {
                this.LIZ = new C26045AKb(fragment);
            }
        } else if (obj instanceof PopupWindow) {
            PopupWindow popupWindow = (PopupWindow) obj;
            View contentView = popupWindow.getContentView();
            if (contentView != null) {
                context = contentView.getContext();
            } else {
                context = null;
            }
            this.LIZLLL = context;
            if (isCenterToast) {
                this.LIZIZ = new C26048AKe(popupWindow);
            } else {
                this.LIZ = new C26045AKb(popupWindow);
            }
        }
        this.LJI = creativeToastBuilder.getConfig().toString();
        this.LJFF = creativeToastBuilder.getConfig().getBlockContinuousToast();
        Long duration = creativeToastBuilder.getConfig().getDuration();
        if (duration != null) {
            this.LJII = duration.longValue();
        }
        C26045AKb c26045AKb = this.LIZ;
        if (c26045AKb != null) {
            Long duration2 = creativeToastBuilder.getConfig().getDuration();
            if (duration2 != null) {
                c26045AKb.LIZLLL(duration2.longValue());
            }
            String message = creativeToastBuilder.getConfig().getMessage();
            if (message != null) {
                c26045AKb.LJIIIZ(message);
            }
            Integer messageRes = creativeToastBuilder.getConfig().getMessageRes();
            if (messageRes != null) {
                c26045AKb.LJIIIIZZ(messageRes.intValue());
            }
            Integer icon = creativeToastBuilder.getConfig().getIcon();
            if (icon != null) {
                c26045AKb.LJFF(icon.intValue());
            }
            Integer iconColor = creativeToastBuilder.getConfig().getIconColor();
            if (iconColor != null) {
                c26045AKb.LJI(iconColor.intValue());
            }
            Integer iconColorRes = creativeToastBuilder.getConfig().getIconColorRes();
            if (iconColorRes != null) {
                c26045AKb.LJII(iconColorRes.intValue());
            }
            Integer maxWidth = creativeToastBuilder.getConfig().getMaxWidth();
            if (maxWidth != null) {
                c26045AKb.LIZ.LJLILLLLZI = maxWidth.intValue();
            }
            Boolean acrossActivities = creativeToastBuilder.getConfig().getAcrossActivities();
            if (acrossActivities != null) {
                c26045AKb.LIZ(acrossActivities.booleanValue());
            }
            Integer themeRes2 = creativeToastBuilder.getConfig().getThemeRes();
            if (themeRes2 != null) {
                c26045AKb.LJ(themeRes2.intValue());
            }
            if (creativeToastBuilder.getConfig().getThemeRes() != null && this.LIZLLL != null && (themeRes = creativeToastBuilder.getConfig().getThemeRes()) != null) {
                this.LJ = new ContextThemeWrapper(this.LIZLLL, themeRes.intValue());
            }
        }
        C26048AKe c26048AKe = this.LIZIZ;
        if (c26048AKe != null) {
            Long duration3 = creativeToastBuilder.getConfig().getDuration();
            if (duration3 != null) {
                c26048AKe.LIZIZ(duration3.longValue());
            }
            String message2 = creativeToastBuilder.getConfig().getMessage();
            if (message2 != null) {
                c26048AKe.LJI(message2);
            }
            Integer messageRes2 = creativeToastBuilder.getConfig().getMessageRes();
            if (messageRes2 != null) {
                c26048AKe.LJFF(messageRes2.intValue());
            }
            Integer icon2 = creativeToastBuilder.getConfig().getIcon();
            if (icon2 != null) {
                c26048AKe.LIZJ(icon2.intValue());
            }
            Integer iconColor2 = creativeToastBuilder.getConfig().getIconColor();
            if (iconColor2 != null) {
                c26048AKe.LIZLLL(iconColor2.intValue());
            }
            Integer iconColorRes2 = creativeToastBuilder.getConfig().getIconColorRes();
            if (iconColorRes2 != null) {
                c26048AKe.LJ(iconColorRes2.intValue());
            }
            Boolean acrossActivities2 = creativeToastBuilder.getConfig().getAcrossActivities();
            if (acrossActivities2 != null) {
                boolean booleanValue = acrossActivities2.booleanValue();
                AKW akw = ((C26044AKa) c26048AKe.LIZ).LJLIL;
                akw.LJII = booleanValue;
                if (booleanValue) {
                    int i = AKV.LIZJ + 1;
                    AKV.LIZJ = i;
                    if (i >= Integer.MAX_VALUE) {
                        AKV.LIZJ = 1;
                    }
                    akw.LJIIIIZZ = AKV.LIZJ;
                }
            }
        }
    }
}
