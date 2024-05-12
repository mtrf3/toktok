package com.ss.android.ugc.aweme.kids.commonfeed.feedwidget;

import X.AbstractC54946LhO;
import X.C207668Da;
import X.LV8;
import android.view.View;
import com.ss.android.ugc.aweme.arch.widgets.GenericWidget;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public abstract class AbsFeedWidget extends GenericWidget {
    public AbstractC54946LhO LJLJLJ;

    public abstract AbstractC54946LhO LJIILL(View view);

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onCreate() {
        super.onCreate();
        DataCenter dataCenter = this.LJLJJI;
        dataCenter.iv0("feed_item_params_data", this, false);
        dataCenter.iv0("on_page_selected", this, false);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onDestroy() {
        super.onDestroy();
        AbstractC54946LhO abstractC54946LhO = this.LJLJLJ;
        if (abstractC54946LhO != null) {
            o.LJI(abstractC54946LhO);
            abstractC54946LhO.LJFF();
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onStop() {
        super.onStop();
        AbstractC54946LhO abstractC54946LhO = this.LJLJLJ;
        if (abstractC54946LhO != null) {
            o.LJI(abstractC54946LhO);
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void LJIIL(View view) {
        o.LJIIIZ(view, "view");
        AbstractC54946LhO LJIILL = LJIILL(view);
        this.LJLJLJ = LJIILL;
        o.LJI(LJIILL);
        DataCenter dataCenter = this.LJLJJI;
        if (dataCenter != null) {
            LJIILL.LJ(dataCenter);
        }
        LV8 lv8 = (LV8) this.LJLJJI.get("feed_item_params_data");
        if (lv8 != null) {
            AbstractC54946LhO abstractC54946LhO = this.LJLJLJ;
            o.LJI(abstractC54946LhO);
            abstractC54946LhO.LIZ(lv8);
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.GenericWidget
    /* renamed from: LJIILJJIL */
    public final void onChanged(C207668Da c207668Da) {
        if (c207668Da != null) {
            String str = c207668Da.LIZ;
            int hashCode = str.hashCode();
            if (hashCode != 350216171) {
                if (hashCode != 1809593368 || !str.equals("feed_item_params_data")) {
                    return;
                }
                Object obj = c207668Da.LIZIZ;
                if (obj == null) {
                    obj = null;
                }
                LV8 lv8 = (LV8) obj;
                AbstractC54946LhO abstractC54946LhO = this.LJLJLJ;
                if (abstractC54946LhO == null) {
                    return;
                }
                abstractC54946LhO.LIZ(lv8);
                return;
            }
            str.equals("on_page_selected");
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.GenericWidget, androidx.lifecycle.Observer
    public final /* bridge */ /* synthetic */ void onChanged(C207668Da c207668Da) {
        onChanged(c207668Da);
    }
}
