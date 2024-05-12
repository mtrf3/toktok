package com.ss.android.ugc.aweme.kids.choosemusic.widgets;

import X.C207668Da;
import X.C84940XVg;
import X.C84991XXf;
import X.C85025XYn;
import X.N97;
import X.XXV;
import X.XYS;
import android.content.Intent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.ss.android.ugc.aweme.kids.music.model.MusicCollectionItem;
import java.util.List;

/* loaded from: classes16.dex */
public class MusicClassWidget extends ListItemWidget implements Observer {
    public int LJLJLLL;
    public int LJLL;
    public int LJLLI;

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

    @Override // com.ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public final void LJIILJJIL(XYS xys) {
        this.LJLJLJ = xys;
        LJIILLIIL((List) this.LJLJJI.get("list"));
    }

    public final void LJIILLIIL(List<Object> list) {
        if (list == null || list.size() < 1) {
            return;
        }
        List<MusicCollectionItem> list2 = ((C84940XVg) ListProtector.get(list, this.LJLJLLL)).LIZ;
        XXV xxv = (XXV) this.LJLJLJ;
        xxv.LJLILLLLZI.setAdapter(new N97(xxv, this.LJLLI, list2));
        XXV xxv2 = (XXV) this.LJLJLJ;
        xxv2.LJLJI = new C84991XXf(this);
        xxv2.LJLJJI = new C85025XYn(this);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        C207668Da c207668Da = (C207668Da) obj;
        if (this.LJLJLJ == null) {
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
