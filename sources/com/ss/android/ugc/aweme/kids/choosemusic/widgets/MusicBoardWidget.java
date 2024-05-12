package com.ss.android.ugc.aweme.kids.choosemusic.widgets;

import X.C207668Da;
import X.C79004UzY;
import X.C84941XVh;
import X.C85022XYk;
import X.G88;
import X.InterfaceC85019XYh;
import X.SFS;
import X.XTE;
import X.XXI;
import X.XXL;
import X.XXR;
import X.XY6;
import X.XYD;
import X.XYN;
import X.XYS;
import Y.IDiS276S0100000_15;
import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.kids.choosemusic.activity.MusicDetailListActivity;
import com.ss.android.ugc.aweme.kids.choosemusic.widgets.MusicBoardWidget;
import com.ss.android.ugc.aweme.kids.music.model.MusicCollectionItem;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes16.dex */
public class MusicBoardWidget extends ListItemWidget implements Observer {
    public XY6 LJLJLLL;
    public int LJLL;
    public int LJLLJ;
    public int LJLLL;
    public XTE LJLLLL;
    public List<MusicModel> LJLLLLLL;
    public InterfaceC85019XYh<XYN> LJLZ;
    public int LJLLI = -1;
    public int LJLLILLLL = -1;
    public final boolean[] LJZ = new boolean[3];
    public final boolean[] LJZI = new boolean[3];
    public final IDiS276S0100000_15 LJZL = new IDiS276S0100000_15(this, 3);

    @Override // com.ss.android.ugc.aweme.arch.widgets.ListItemWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJIJ() {
        if (C79004UzY.LJJIFFI(this.LJLLLLLL)) {
            return;
        }
        int i = this.LJLL * 3;
        if (i < 0) {
            i = 0;
        }
        int min = Math.min(i + 3, this.LJLLLLLL.size());
        for (int i2 = i; i2 < min; i2++) {
            boolean[] zArr = this.LJZI;
            int i3 = i2 - i;
            if (zArr[i3]) {
                zArr[i3] = false;
                MusicModel musicModel = (MusicModel) ListProtector.get(this.LJLLLLLL, i2);
                if (musicModel != null) {
                    SFS.LJJIII(this.LJLLLL, musicModel.getMusicId(), i2, true);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onCreate() {
        super.onCreate();
        DataCenter dataCenter = this.LJLJJI;
        dataCenter.iv0("list", this, false);
        dataCenter.iv0("music_index", this, false);
        dataCenter.iv0("music_collect_status", this, false);
        dataCenter.iv0("play_compeleted", this, false);
        dataCenter.iv0("music_loading", this, false);
        this.LJLLL = ((Integer) this.LJLJJI.get("key_choose_music_type")).intValue();
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public final void LJIILJJIL(XYS xys) {
        this.LJLJLJ = xys;
        LJIILLIIL((List) this.LJLJJI.get("list"));
    }

    public final void LJIILLIIL(List<Object> list) {
        ViewPager viewPager;
        if (list == null || this.LJLLILLLL >= list.size()) {
            return;
        }
        List<MusicModel> list2 = ((C84941XVh) ListProtector.get(list, this.LJLLILLLL)).LIZIZ;
        final MusicCollectionItem musicCollectionItem = ((C84941XVh) ListProtector.get(list, this.LJLLILLLL)).LIZ;
        if (list2 == null || musicCollectionItem == null) {
            ViewGroup.LayoutParams layoutParams = this.LJLJLJ.itemView.getLayoutParams();
            layoutParams.height = 0;
            this.LJLJLJ.itemView.setLayoutParams(layoutParams);
            return;
        }
        if (this.LJLLILLLL == 0) {
            ((XXL) this.LJLJLJ).LJLJJI.setVisibility(4);
        } else {
            ((XXL) this.LJLJLJ).LJLJJI.setVisibility(0);
        }
        this.LJLLLLLL = list2;
        XTE xte = new XTE("change_music_page", musicCollectionItem.mcName, "", SFS.LJLJJI);
        this.LJLLLL = xte;
        String str = musicCollectionItem.mcId;
        xte.LJ = str;
        if (TextUtils.equals(str, "recommend_mc_id")) {
            xte.LIZIZ = "recommend";
        }
        XXL xxl = (XXL) this.LJLJLJ;
        IDiS276S0100000_15 iDiS276S0100000_15 = this.LJZL;
        if (xxl.LJLJL != null && (viewPager = xxl.LJLJI) != null) {
            viewPager.removeOnPageChangeListener(xxl.LJLJJLL);
        }
        xxl.LJLJJLL = iDiS276S0100000_15;
        XXL xxl2 = (XXL) this.LJLJLJ;
        int i = this.LJLL;
        int i2 = this.LJLLI;
        int i3 = this.LJLLILLLL;
        boolean z = musicCollectionItem.isHot;
        xxl2.LJLILLLLZI.setText(musicCollectionItem.mcName);
        xxl2.LJLJI.getLayoutParams().height = Math.min(3, list2.size()) * xxl2.LJLLI;
        xxl2.LJLLJ = z;
        xxl2.LJLJLLL = i3;
        xxl2.LJLJLJ = i2;
        XXI xxi = xxl2.LJLL;
        xxi.LJLILLLLZI = list2;
        xxi.notifyDataSetChanged();
        xxl2.LJLJI.setCurrentItem(i);
        xxl2.LJLJI.addOnPageChangeListener(xxl2.LJLJJLL);
        xxl2.getClass();
        XXL xxl3 = (XXL) this.LJLJLJ;
        G88 g88 = new G88() { // from class: X.XXA
            @Override // X.G88
            public final void LIZIZ(C85022XYk c85022XYk, View view, MusicModel musicModel) {
                final MusicBoardWidget musicBoardWidget = MusicBoardWidget.this;
                MusicCollectionItem musicCollectionItem2 = musicCollectionItem;
                musicBoardWidget.getClass();
                int id = view.getId();
                if (id == R.id.f75) {
                    Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                    if (LJIIIIZZ != null) {
                        LJIIIIZZ.getString(R.string.gaf);
                    }
                    c85022XYk.P();
                    boolean z2 = c85022XYk.LJLLLLLL;
                    String musicId = musicModel.getMusicId();
                    XTE xte2 = musicBoardWidget.LJLLLL;
                    musicModel.getLogPb();
                    SFS.LJJIFFI(z2, musicId, xte2);
                    return;
                }
                if (id == R.id.f79) {
                    if (musicModel == null) {
                        return;
                    }
                    if (musicModel.getMusicStatus() == 0 && musicModel.getMusic() != null) {
                        String offlineDesc = musicModel.getMusic().getOfflineDesc();
                        if (TextUtils.isEmpty(offlineDesc)) {
                            offlineDesc = view.getContext().getString(R.string.iia);
                        }
                        C5S1 c5s1 = new C5S1(view.getContext());
                        c5s1.LIZLLL(offlineDesc);
                        c5s1.LJ();
                        return;
                    }
                    if (!SS0.LIZIZ(musicModel, view.getContext(), true)) {
                        return;
                    }
                    String uuid = UUID.randomUUID().toString();
                    C61200O0e LIZLLL = C61200O0e.LIZLLL();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("aweme://music/detail/");
                    LIZ.append(musicModel.getMusicId());
                    C39061g6 c39061g6 = new C39061g6(X1D.LIZIZ(LIZ));
                    c39061g6.LIZIZ("process_id", uuid);
                    LIZLLL.LJII(c39061g6.LIZJ());
                    return;
                }
                String str2 = "";
                if (id == R.id.moa) {
                    Intent intent = new Intent(musicBoardWidget.LJLIL, (Class<?>) MusicDetailListActivity.class);
                    if (musicBoardWidget.LJLLILLLL == 0) {
                        intent.putExtra("music_type", 1);
                        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", musicBoardWidget.LJLLL);
                    } else {
                        intent.putExtra("music_class_id", musicCollectionItem2.mcId);
                        intent.putExtra("music_class_name", musicCollectionItem2.mcName);
                        intent.putExtra("music_type", 2);
                        intent.putExtra("music_category_is_hot", musicCollectionItem2.isHot);
                        intent.putExtra("music_class_enter_method", "click_more");
                        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", musicBoardWidget.LJLLL);
                        intent.putExtra("music_class_level", musicCollectionItem2.level);
                    }
                    musicBoardWidget.LJIILIIL(intent, musicBoardWidget.LJLLJ);
                    SFS.LJJII(musicCollectionItem2.mcName, "click_more", "", "change_music_page", musicCollectionItem2.mcId);
                    return;
                }
                if (id == R.id.g4i) {
                    if (c85022XYk == null || musicModel == null) {
                        return;
                    }
                    if (musicBoardWidget.LJLLI == c85022XYk.LJZL && ((Integer) musicBoardWidget.LJLJJI.get("music_position", -1)).intValue() == musicBoardWidget.LJLLILLLL) {
                        musicBoardWidget.LJLJJI.jv0(-1, "music_position");
                        musicBoardWidget.LJLJJI.jv0(-1, "music_index");
                        c85022XYk.U(false, false);
                        musicBoardWidget.LJLJLLL.k2(null);
                        return;
                    }
                    XY6 xy6 = musicBoardWidget.LJLJLLL;
                    if (xy6 != null) {
                        xy6.k2(null);
                        musicBoardWidget.LJLJLLL.C7(new XT7() { // from class: X.XXy
                            @Override // X.XT7
                            public final void LIZ() {
                                MusicBoardWidget.this.LJLJJI.jv0(Boolean.FALSE, "music_loading");
                            }
                        });
                        musicBoardWidget.LJLJLLL.t2(musicBoardWidget.LJLLLL, musicModel);
                        SFS.LJLJJL = c85022XYk.LJZL;
                    }
                    musicBoardWidget.LJLJJI.jv0(Integer.valueOf(musicBoardWidget.LJLLILLLL), "music_position");
                    musicBoardWidget.LJLJJI.jv0(Integer.valueOf(c85022XYk.LJZL), "music_index");
                    musicBoardWidget.LJLJJI.jv0(Boolean.TRUE, "music_loading");
                    return;
                }
                if (id != R.id.g6y || musicBoardWidget.LJLJLLL == null || musicModel == null) {
                    return;
                }
                String str3 = musicBoardWidget.LJLLLL.LJ;
                if (!C38354F3m.LJ(str3)) {
                    str2 = str3;
                }
                musicModel.setCategoryID(str2);
                musicBoardWidget.LJLJLLL.y8(musicModel);
                XTE xte3 = musicBoardWidget.LJLLLL;
                String musicId2 = musicModel.getMusicId();
                int i4 = c85022XYk.LJZL;
                musicModel.getLogPb();
                SFS.LJJIIJ(xte3, musicId2, i4);
            }
        };
        InterfaceC85019XYh<XYN> interfaceC85019XYh = this.LJLZ;
        xxl3.LJLJJL = g88;
        xxl3.LJLJL = interfaceC85019XYh;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        XXR xxr;
        ArrayList<C85022XYk> musicItemViews;
        MusicModel.CollectionType collectionType;
        XXR xxr2;
        ArrayList<C85022XYk> musicItemViews2;
        C207668Da c207668Da = (C207668Da) obj;
        String str = c207668Da.LIZ;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1635157503:
                if (str.equals("music_collect_status")) {
                    c = 0;
                    break;
                }
                break;
            case -1322093457:
                if (str.equals("play_compeleted")) {
                    c = 1;
                    break;
                }
                break;
            case 3322014:
                if (str.equals("list")) {
                    c = 2;
                    break;
                }
                break;
            case 502104354:
                if (str.equals("music_loading")) {
                    c = 3;
                    break;
                }
                break;
            case 1579846200:
                if (str.equals("music_index")) {
                    c = 4;
                    break;
                }
                break;
        }
        Object obj2 = null;
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            return;
                        }
                        LJIIZILJ(((Integer) this.LJLJJI.get("music_position")).intValue(), ((Integer) this.LJLJJI.get("music_index")).intValue());
                        return;
                    }
                    XYS xys = this.LJLJLJ;
                    if (xys == null) {
                        return;
                    }
                    XXL xxl = (XXL) xys;
                    int i = this.LJLLI;
                    boolean booleanValue = ((Boolean) this.LJLJJI.get("music_loading")).booleanValue();
                    if (i < 0) {
                        return;
                    }
                    for (int i2 = 0; i2 < xxl.LJLJI.getChildCount() && (xxr2 = (XXR) xxl.LJLJI.getChildAt(i2)) != null && (musicItemViews2 = xxr2.getMusicItemViews()) != null; i2++) {
                        Iterator<C85022XYk> it = musicItemViews2.iterator();
                        while (it.hasNext()) {
                            C85022XYk next = it.next();
                            if (next.LJZL == i) {
                                next.U(booleanValue, true);
                                return;
                            }
                        }
                    }
                    return;
                }
                if (this.LJLJLJ == null) {
                    return;
                }
                Object obj3 = c207668Da.LIZIZ;
                if (obj3 != null) {
                    obj2 = obj3;
                }
                LJIILLIIL((List) obj2);
                return;
            }
            LJIIZILJ(((Integer) this.LJLJJI.get("music_position", -1)).intValue(), ((Integer) this.LJLJJI.get("music_index", -1)).intValue());
            this.LJLJJI.jv0(-1, "music_position");
            this.LJLJJI.jv0(-1, "music_index");
            this.LJLJLLL.k2(null);
            return;
        }
        Object obj4 = c207668Da.LIZIZ;
        if (obj4 != null) {
            obj2 = obj4;
        }
        XYD xyd = (XYD) obj2;
        int i3 = xyd.LIZ;
        if (i3 == 1) {
            if (this.LJLLILLLL != xyd.LIZIZ) {
                return;
            }
        } else if (i3 != 0) {
            return;
        }
        XYS xys2 = this.LJLJLJ;
        if (xys2 == null) {
            return;
        }
        XXL xxl2 = (XXL) xys2;
        for (int i4 = 0; i4 < xxl2.LJLJI.getChildCount() && (xxr = (XXR) xxl2.LJLJI.getChildAt(i4)) != null && (musicItemViews = xxr.getMusicItemViews()) != null; i4++) {
            Iterator<C85022XYk> it2 = musicItemViews.iterator();
            while (it2.hasNext()) {
                C85022XYk next2 = it2.next();
                MusicModel musicModel = xyd.LJ;
                if (musicModel != null && !TextUtils.isEmpty(musicModel.getMusicId()) && next2.LJZ != null && musicModel.getMusicId().equals(next2.LJZ.getMusicId())) {
                    MusicModel musicModel2 = next2.LJZ;
                    if (xyd.LIZLLL == 1) {
                        collectionType = MusicModel.CollectionType.COLLECTED;
                    } else {
                        collectionType = MusicModel.CollectionType.NOT_COLLECTED;
                    }
                    musicModel2.setCollectionType(collectionType);
                    next2.M();
                    return;
                }
            }
        }
    }

    public final void LJIIZILJ(int i, int i2) {
        int i3;
        XXR xxr;
        ArrayList<C85022XYk> musicItemViews;
        XYS xys = this.LJLJLJ;
        if (xys != null) {
            XXL xxl = (XXL) xys;
            int i4 = this.LJLLI;
            if (i == this.LJLLILLLL) {
                i3 = i2;
            } else {
                i3 = -1;
            }
            xxl.LJLJLJ = i3;
            if (i4 >= 0) {
                for (int i5 = 0; i5 < xxl.LJLJI.getChildCount() && (xxr = (XXR) xxl.LJLJI.getChildAt(i5)) != null && (musicItemViews = xxr.getMusicItemViews()) != null; i5++) {
                    Iterator<C85022XYk> it = musicItemViews.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            C85022XYk next = it.next();
                            if (next.LJZL == i4) {
                                next.U(false, false);
                                break;
                            }
                        }
                    }
                }
            }
        }
        if (i != this.LJLLILLLL) {
            this.LJLLI = -1;
        } else if (this.LJLLI == i2) {
            this.LJLJLLL.k2(null);
        } else {
            this.LJLLI = i2;
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void LJIIJJI(int i, int i2, Intent intent) {
        if (i2 == -1 && i == this.LJLLJ) {
            LJIIIZ().setResult(-1, intent);
            LJIIIZ().finish();
        }
    }
}
