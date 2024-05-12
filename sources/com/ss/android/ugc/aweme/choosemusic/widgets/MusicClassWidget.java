package com.ss.android.ugc.aweme.choosemusic.widgets;

import X.C207668Da;
import X.C84935XVb;
import X.C85014XYc;
import X.InterfaceC84937XVd;
import X.N98;
import X.XWV;
import X.XXU;
import X.XYS;
import android.content.Intent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import java.util.List;

/* loaded from: classes16.dex */
public class MusicClassWidget extends ListItemWidget implements Observer {
    public int LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public final int LJLLILLLL;
    public long LJLLJ;
    public long LJLLL;

    @Override // com.ss.android.ugc.aweme.arch.widgets.ListItemWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onCreate() {
        super.onCreate();
        this.LJLJJI.iv0("list", this, false);
        this.LJLLI = ((Integer) this.LJLJJI.get("key_choose_music_type")).intValue();
    }

    public MusicClassWidget(int i) {
        this.LJLLILLLL = i;
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public final void LJIILJJIL(XYS xys) {
        this.LJLJLJ = xys;
        LJIILLIIL((List) this.LJLJJI.get("list"));
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public final boolean LJIILL(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof XXU) {
            return true;
        }
        return false;
    }

    public final void LJIILLIIL(List<InterfaceC84937XVd> list) {
        if (list == null || list.size() < 1 || !(ListProtector.get(list, this.LJLJLLL) instanceof C84935XVb)) {
            return;
        }
        List<MusicCollectionItem> list2 = ((C84935XVb) ListProtector.get(list, this.LJLJLLL)).LIZ;
        XXU xxu = (XXU) this.LJLJLJ;
        xxu.LJLILLLLZI.setAdapter(new N98(xxu, this.LJLLI, list2));
        XXU xxu2 = (XXU) this.LJLJLJ;
        xxu2.LJLJI = new C85014XYc(this);
        xxu2.LJLJJI = new XWV(this);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        C207668Da c207668Da = (C207668Da) obj;
        if (this.LJLJLJ == null || c207668Da == null) {
            return;
        }
        String str = c207668Da.LIZ;
        str.getClass();
        if (!str.equals("list")) {
            return;
        }
        Object obj2 = c207668Da.LIZIZ;
        if (obj2 == null) {
            obj2 = null;
        }
        LJIILLIIL((List) obj2);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void LJIIJJI(int i, int i2, Intent intent) {
        if (i2 == -1 && i == this.LJLL) {
            LJIIIZ().setResult(-1, intent);
            LJIIIZ().finish();
        }
    }
}
