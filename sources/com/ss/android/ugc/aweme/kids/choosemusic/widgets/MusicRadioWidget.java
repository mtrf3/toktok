package com.ss.android.ugc.aweme.kids.choosemusic.widgets;

import X.C207668Da;
import X.C84941XVh;
import X.C84995XXj;
import X.C84998XXm;
import X.InterfaceC85019XYh;
import X.ORZ;
import X.SFS;
import X.XTE;
import X.XXE;
import X.XY6;
import X.XYN;
import X.XYS;
import X.XZ1;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class MusicRadioWidget extends ListItemWidget implements Observer {
    public XTE LJLJLLL;
    public int LJLL = -1;
    public int LJLLI = -1;
    public XY6 LJLLILLLL;
    public boolean LJLLJ;
    public InterfaceC85019XYh<XYN> LJLLL;
    public XZ1 LJLLLL;

    @Override // com.ss.android.ugc.aweme.arch.widgets.ListItemWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onCreate() {
        super.onCreate();
        DataCenter dataCenter = this.LJLJJI;
        dataCenter.iv0("music_index", this, false);
        dataCenter.iv0("music_collect_status", this, false);
        dataCenter.iv0("status_pick_load_more", this, false);
        dataCenter.iv0("pick_list_more", this, false);
        dataCenter.iv0("play_compeleted", this, false);
        dataCenter.iv0("play_error", this, false);
        dataCenter.iv0("music_loading", this, false);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public final void LJIILJJIL(XYS view) {
        o.LJIIIZ(view, "view");
        this.LJLJLJ = view;
        List list = (List) this.LJLJJI.get("list");
        XTE xte = new XTE("change_music_page", "my_fm", "click_start_your_fm", SFS.LJLJJI);
        this.LJLJLLL = xte;
        xte.LJFF = true;
        if (list != null && this.LJLL < list.size()) {
            Object obj = ListProtector.get(list, this.LJLL);
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.choosemusic.model.MusicBlockItem");
            List<MusicModel> list2 = ((C84941XVh) obj).LIZIZ;
            C84995XXj c84995XXj = (C84995XXj) this.LJLJLJ;
            c84995XXj.LJLZ = list2;
            if (list2 != null && !list2.isEmpty()) {
                c84995XXj.M(c84995XXj.LJZ, false);
            }
            C84995XXj c84995XXj2 = (C84995XXj) this.LJLJLJ;
            XXE xxe = new XXE(list2, this);
            c84995XXj2.getClass();
            c84995XXj2.LJLLLL = xxe;
        }
        C84995XXj c84995XXj3 = (C84995XXj) this.LJLJLJ;
        c84995XXj3.LJLLLLLL = this.LJLLL;
        c84995XXj3.LJLLL = new C84998XXm(this);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        MusicModel musicModel;
        MusicModel musicModel2;
        C207668Da c207668Da = (C207668Da) obj;
        if (this.LJLJLJ == null) {
            return;
        }
        o.LJI(c207668Da);
        String str = c207668Da.LIZ;
        Object obj2 = null;
        int i = -1;
        switch (str.hashCode()) {
            case -1322093457:
                if (!str.equals("play_compeleted")) {
                    return;
                }
                Object obj3 = c207668Da.LIZIZ;
                if (obj3 == null) {
                    obj3 = null;
                }
                C84995XXj c84995XXj = (C84995XXj) this.LJLJLJ;
                List<MusicModel> list = c84995XXj.LJLZ;
                if (list != null && (musicModel2 = (MusicModel) ORZ.LJLLLLLL(c84995XXj.LJZ, list)) != null) {
                    obj2 = musicModel2.getMusicId();
                }
                if (!o.LJ(obj3, obj2)) {
                    return;
                }
                this.LJLJJI.jv0(-1, "music_position");
                this.LJLJJI.jv0(-1, "music_index");
                return;
            case -60075939:
                if (!str.equals("status_pick_load_more")) {
                    return;
                }
                this.LJLLJ = false;
                ((C84995XXj) this.LJLJLJ).L(null);
                return;
            case 502104354:
                if (!str.equals("music_loading")) {
                    return;
                }
                Integer num = (Integer) this.LJLJJI.get("music_position");
                if (num != null) {
                    i = num.intValue();
                }
                if (this.LJLL != i) {
                    return;
                }
                C84995XXj c84995XXj2 = (C84995XXj) this.LJLJLJ;
                Object obj4 = this.LJLJJI.get("music_loading");
                o.LJIIIIZZ(obj4, "mDataCenter[WidgetConstants.KEY_MUSIC_LOADING]");
                c84995XXj2.N(true, ((Boolean) obj4).booleanValue());
                return;
            case 945257400:
                if (!str.equals("pick_list_more")) {
                    return;
                }
                this.LJLLJ = false;
                C84995XXj c84995XXj3 = (C84995XXj) this.LJLJLJ;
                Object obj5 = c207668Da.LIZIZ;
                if (obj5 != null) {
                    obj2 = obj5;
                }
                c84995XXj3.L((List) obj2);
                return;
            case 1579846200:
                if (!str.equals("music_index")) {
                    return;
                }
                Integer num2 = (Integer) this.LJLJJI.get("music_position", -1);
                Integer musicIndex = (Integer) this.LJLJJI.get("music_index", -1);
                int i2 = this.LJLL;
                if (num2 == null || num2.intValue() != i2) {
                    ((C84995XXj) this.LJLJLJ).N(false, false);
                    this.LJLLI = -1;
                    return;
                }
                int i3 = this.LJLLI;
                if (musicIndex == null || i3 != musicIndex.intValue()) {
                    o.LJIIIIZZ(musicIndex, "musicIndex");
                    this.LJLLI = musicIndex.intValue();
                    return;
                }
                ((C84995XXj) this.LJLJLJ).N(false, false);
                XY6 xy6 = this.LJLLILLLL;
                if (xy6 == null) {
                    return;
                }
                xy6.k2(null);
                return;
            case 1912965437:
                if (!str.equals("play_error")) {
                    return;
                }
                Object obj6 = c207668Da.LIZIZ;
                if (obj6 == null) {
                    obj6 = null;
                }
                C84995XXj c84995XXj4 = (C84995XXj) this.LJLJLJ;
                List<MusicModel> list2 = c84995XXj4.LJLZ;
                if (list2 != null && (musicModel = (MusicModel) ORZ.LJLLLLLL(c84995XXj4.LJZ, list2)) != null) {
                    obj2 = musicModel.getMusicId();
                }
                if (!o.LJ(obj6, obj2)) {
                    return;
                }
                this.LJLJJI.jv0(-1, "music_position");
                this.LJLJJI.jv0(-1, "music_index");
                return;
            default:
                return;
        }
    }
}
