package X;

import Y.ARunnableS29S0200000_10;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.ss.android.ugc.aweme.screenshot.ScreenShotContent;
import com.ss.android.ugc.aweme.screenshot.ScreenShotShareMobParam;
import com.ss.android.ugc.aweme.screenshot.event.ScreenshotSharePopupShowEvent;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Okx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62811Okx {
    public ViewGroup LIZ;
    public ViewGroup LIZIZ;
    public ComposeView LIZJ;
    public ARunnableS29S0200000_10 LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(ComposeView composeView, ViewGroup viewGroup, ViewGroup viewGroup2, String str, boolean z, AbstractC65590Pog<ESM<?>> abstractC65590Pog) {
        float f;
        int LJIILJJIL;
        float f2;
        ScreenShotContent screenShotContent;
        ScreenShotShareMobParam mobParam;
        Iterator it = abstractC65590Pog.iterator();
        while (it.hasNext()) {
            T t = ((ESM) it.next()).LIZJ;
            if ((t instanceof ScreenShotContent) && (screenShotContent = (ScreenShotContent) t) != null && (mobParam = screenShotContent.getMobParam()) != null) {
                ScreenshotSharePopupShowEvent screenshotSharePopupShowEvent = new ScreenshotSharePopupShowEvent();
                String enterFrom = mobParam.getEnterFrom();
                o.LJIIIZ(enterFrom, "enterFrom");
                screenshotSharePopupShowEvent.LIZLLL(enterFrom, "enter_from");
                String itemId = mobParam.getItemId();
                o.LJIIIZ(itemId, "itemId");
                screenshotSharePopupShowEvent.LIZLLL(itemId, "item_id");
                String itemType = mobParam.getItemType();
                o.LJIIIZ(itemType, "itemType");
                screenshotSharePopupShowEvent.LIZLLL(itemType, "item_type");
                screenshotSharePopupShowEvent.LJFF();
            }
        }
        composeView.setViewCompositionStrategy(C283619k.LIZIZ);
        V66.LIZIZ(composeView, C1DJ.LJFF(new C62812Oky(viewGroup2, str, z, abstractC65590Pog), -421539082, true));
        if (z) {
            f = 12.0f;
        } else {
            f = 56.0f;
        }
        float LJIJJLI = C17N.LJIJJLI(f);
        if (z) {
            LJIILJJIL = C77119UOl.LJIILIIL(viewGroup2.getContext());
            f2 = 0.35f;
        } else {
            LJIILJJIL = C77119UOl.LJIILJJIL(viewGroup2.getContext());
            f2 = 0.312f;
        }
        if (C90193gN.LIZ()) {
            LJIJJLI = -LJIJJLI;
        }
        composeView.setX(LJIJJLI);
        composeView.setY(LJIILJJIL * f2);
        Runnable runnable = this.LIZLLL;
        if (runnable != null) {
            viewGroup.removeCallbacks(runnable);
        }
        ARunnableS29S0200000_10 aRunnableS29S0200000_10 = new ARunnableS29S0200000_10(viewGroup, viewGroup2, 72);
        this.LIZLLL = aRunnableS29S0200000_10;
        viewGroup.postDelayed(aRunnableS29S0200000_10, 5000L);
        this.LIZIZ = viewGroup2;
        this.LIZJ = composeView;
    }
}
