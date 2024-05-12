package com.ss.android.ugc.aweme.kids.choosemusic.widgets;

import X.C16880lQ;
import X.C207668Da;
import X.C61623OGl;
import X.C61634OGw;
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
    public C61634OGw LJLJLJ;
    public int LJLJLLL;

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onCreate() {
        this.LJLJJI.iv0("data_banner", this, false);
        this.LJLJLLL = ((Integer) this.LJLJJI.get("key_choose_music_type")).intValue();
        super.onCreate();
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void LJIIL(View view) {
        this.LJLJLJ = new C61634OGw(view, this.LJLJLLL);
        LJIILJJIL((List) this.LJLJJI.get("data_banner"));
    }

    public final void LJIILJJIL(List<Banner> list) {
        if (list != null && list.size() > 0) {
            this.LJLJI.setVisibility(0);
            C61634OGw c61634OGw = this.LJLJLJ;
            Context context = c61634OGw.LJI;
            if (C61634OGw.LJIIIIZZ.equals(list)) {
                return;
            }
            if (c61634OGw.LJ == null) {
                c61634OGw.LJ = new C61623OGl(context, C16880lQ.LLZIL(context), c61634OGw.LJII);
                c61634OGw.LIZ.setAdapter(new C80772Vmy(c61634OGw.LJ));
            }
            boolean LIZIZ = C90193gN.LIZIZ(context);
            if (LIZIZ) {
                Collections.reverse(list);
            }
            c61634OGw.LJFF.setRealCount(list.size());
            C61623OGl c61623OGl = c61634OGw.LJ;
            if (c61623OGl.LJLJL != list) {
                c61623OGl.LJLJL = list;
                c61623OGl.notifyDataSetChanged();
            }
            c61634OGw.LIZIZ.setUpViewPager(c61634OGw.LIZ);
            if (LIZIZ) {
                c61634OGw.LIZ.setCurrentItem(list.size() - 1);
            }
            c61634OGw.LJFF.startAutoSwitch();
            return;
        }
        this.LJLJI.setVisibility(8);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        C207668Da c207668Da = (C207668Da) obj;
        if (this.LJLJLJ == null || c207668Da == null) {
            return;
        }
        Object obj2 = c207668Da.LIZIZ;
        if (obj2 == null) {
            obj2 = null;
        }
        LJIILJJIL((List) obj2);
    }
}
