package com.ss.android.ugc.aweme.choosemusic.widgets;

import X.C16880lQ;
import X.C207668Da;
import X.C61622OGk;
import X.C61635OGx;
import X.C80772Vmy;
import X.C90193gN;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.discover.model.Banner;
import java.util.Collections;
import java.util.List;

/* loaded from: classes11.dex */
public class MusicBannerWidget extends Widget implements Observer {
    public final long LJLJLJ;
    public final long LJLJLLL;
    public C61635OGx LJLL;
    public int LJLLI;
    public final int LJLLILLLL;

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onCreate() {
        this.LJLJJI.iv0("data_banner", this, false);
        this.LJLLI = ((Integer) this.LJLJJI.get("key_choose_music_type")).intValue();
        super.onCreate();
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void LJIIL(View view) {
        this.LJLL = new C61635OGx(view, this.LJLLI, this.LJLLILLLL, this.LJLJLJ, this.LJLJLLL);
        LJIILJJIL((List) this.LJLJJI.get("data_banner"));
    }

    public final void LJIILJJIL(List<Banner> list) {
        if (list != null && list.size() > 0) {
            this.LJLJI.setVisibility(0);
            C61635OGx c61635OGx = this.LJLL;
            Context context = c61635OGx.LJI;
            if (C61635OGx.LJIIJJI.equals(list)) {
                return;
            }
            if (c61635OGx.LJ == null) {
                c61635OGx.LJ = new C61622OGk(context, C16880lQ.LLZIL(context), c61635OGx.LJII, c61635OGx.LJIIIIZZ, c61635OGx.LJIIIZ, c61635OGx.LJIIJ);
                c61635OGx.LIZ.setAdapter(new C80772Vmy(c61635OGx.LJ));
            }
            boolean LIZIZ = C90193gN.LIZIZ(context);
            if (LIZIZ) {
                Collections.reverse(list);
            }
            c61635OGx.LJFF.setRealCount(list.size());
            C61622OGk c61622OGk = c61635OGx.LJ;
            if (c61622OGk.LJLJL != list) {
                c61622OGk.LJLJL = list;
                c61622OGk.notifyDataSetChanged();
            }
            c61635OGx.LIZIZ.setUpViewPager(c61635OGx.LIZ);
            if (LIZIZ) {
                c61635OGx.LIZ.setCurrentItem(list.size() - 1);
            }
            c61635OGx.LJFF.startAutoSwitch();
            return;
        }
        this.LJLJI.setVisibility(8);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        C207668Da c207668Da = (C207668Da) obj;
        if (this.LJLL == null || c207668Da == null) {
            return;
        }
        Object obj2 = c207668Da.LIZIZ;
        if (obj2 == null) {
            obj2 = null;
        }
        LJIILJJIL((List) obj2);
    }

    public MusicBannerWidget(int i, long j, long j2) {
        this.LJLLILLLL = i;
        this.LJLJLJ = j;
        this.LJLJLLL = j2;
    }
}
