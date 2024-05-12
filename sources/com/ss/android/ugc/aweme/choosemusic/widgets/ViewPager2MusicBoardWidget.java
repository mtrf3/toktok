package com.ss.android.ugc.aweme.choosemusic.widgets;

import X.C207668Da;
import X.C72834SiE;
import X.C72H;
import X.C79004UzY;
import X.C84936XVc;
import X.C84987XXb;
import X.G87;
import X.InterfaceC61443O9n;
import X.InterfaceC84937XVd;
import X.InterfaceC85027XYp;
import X.RunnableC61442O9m;
import X.VWE;
import X.XVF;
import X.XVG;
import X.XXH;
import X.XXJ;
import X.XXQ;
import X.XY4;
import X.XYC;
import X.XYM;
import X.XYS;
import Y.IDiS276S0100000_15;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity;
import com.ss.android.ugc.aweme.choosemusic.cutmusic.ChooseMusicCutViewModel;
import com.ss.android.ugc.aweme.choosemusic.view.ChooseMusicSelectView;
import com.ss.android.ugc.aweme.choosemusic.widgets.ViewPager2MusicBoardWidget;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.performance.SelectMusicFromSelectFirstPageMonitor;
import com.ss.android.ugc.aweme.services.performance.IAVPerformance;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import defpackage.t1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes16.dex */
public class ViewPager2MusicBoardWidget extends ListItemWidget implements Observer, InterfaceC85027XYp, InterfaceC61443O9n {
    public final Fragment LJLJLLL;
    public XY4 LJLL;
    public int LJLLI;
    public int LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public XVG LJLZ;
    public List<MusicModel> LJZ;
    public C72H<XYM> LJZI;
    public final int LLD;
    public long LLF;
    public long LLFF;
    public boolean LLFFF;
    public final Rect LLFZ;
    public int LJLLILLLL = -1;
    public int LJLLJ = -1;
    public final boolean[] LJZL = new boolean[3];
    public final boolean[] LL = new boolean[3];
    public final Rect LLFII = new Rect();
    public final IDiS276S0100000_15 LLI = new IDiS276S0100000_15(this, 2);

    @Override // X.InterfaceC85027XYp
    public final void LJIIIIZZ() {
        int i = 0;
        while (true) {
            boolean[] zArr = this.LL;
            if (i < zArr.length) {
                this.LJZL[i] = false;
                zArr[i] = false;
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.ListItemWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJIJ() {
        if (C79004UzY.LJJIFFI(this.LJZ)) {
            return;
        }
        int max = Math.max(this.LJLLI * 3, 0);
        int min = Math.min(max + 3, this.LJZ.size());
        for (int i = max; i < min; i++) {
            boolean[] zArr = this.LL;
            int i2 = i - max;
            if (zArr[i2]) {
                zArr[i2] = false;
                MusicModel musicModel = (MusicModel) ListProtector.get(this.LJZ, i);
                if (musicModel != null) {
                    XVF.LJIIL(new RunnableC61442O9m(this, musicModel, i), this.LJLJJL.LIZ, this.LJLZ, musicModel, i, true, false);
                    if (musicModel.getNeedRecordConsumption()) {
                        C72834SiE.LIZIZ(musicModel);
                    }
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
        dataCenter.iv0("music_reset_play_start", this, false);
        this.LJLLLL = ((Integer) this.LJLJJI.get("key_choose_music_type")).intValue();
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public final void LJIILJJIL(XYS xys) {
        this.LJLJLJ = xys;
        LJIILLIIL((List) this.LJLJJI.get("list"));
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public final boolean LJIILL(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof XXJ) {
            return true;
        }
        return false;
    }

    public final void LJIILLIIL(List<InterfaceC84937XVd> list) {
        boolean z;
        VWE vwe;
        if (list == null || this.LJLLJ >= list.size() || !(ListProtector.get(list, this.LJLLJ) instanceof C84936XVc)) {
            return;
        }
        this.LJLLLLLL = ((C84936XVc) ListProtector.get(list, this.LJLLJ)).LIZJ;
        List<MusicModel> list2 = ((C84936XVc) ListProtector.get(list, this.LJLLJ)).LIZIZ;
        final MusicCollectionItem musicCollectionItem = ((C84936XVc) ListProtector.get(list, this.LJLLJ)).LIZ;
        if (this.LLF != 0 || this.LLFF != 0) {
            z = true;
        } else {
            z = false;
        }
        if (list2 == null || musicCollectionItem == null) {
            ViewGroup.LayoutParams layoutParams = this.LJLJLJ.itemView.getLayoutParams();
            layoutParams.height = 0;
            this.LJLJLJ.itemView.setLayoutParams(layoutParams);
            return;
        }
        if (this.LJLLJ == 0) {
            ((XXJ) this.LJLJLJ).LJLJJI.setVisibility(4);
        } else {
            ((XXJ) this.LJLJLJ).LJLJJI.setVisibility(0);
        }
        this.LJZ = list2;
        String str = musicCollectionItem.mcName;
        String str2 = XVF.LIZ;
        XVG xvg = new XVG("change_music_page", str, "", str2);
        this.LJLZ = xvg;
        xvg.LJIIJ = XVF.LIZIZ(str2);
        this.LJLZ.LIZIZ(musicCollectionItem.mcId);
        XVG xvg2 = this.LJLZ;
        int i = this.LJLLJ;
        xvg2.getClass();
        if (i != 0 && i != 1) {
            xvg2.LJIIL = Integer.valueOf(i + 4);
        }
        XXJ xxj = (XXJ) this.LJLJLJ;
        IDiS276S0100000_15 iDiS276S0100000_15 = this.LLI;
        if (xxj.LJLJL != null && (vwe = xxj.LJLJI) != null) {
            vwe.removeOnPageChangeListener(xxj.LJLJJLL);
        }
        xxj.LJLJJLL = iDiS276S0100000_15;
        XXJ xxj2 = (XXJ) this.LJLJLJ;
        int i2 = this.LJLLI;
        int i3 = this.LJLLILLLL;
        int i4 = this.LJLLJ;
        XVG xvg3 = this.LJLZ;
        boolean z2 = musicCollectionItem.isHot;
        xxj2.LJLILLLLZI.setText(musicCollectionItem.mcName);
        xxj2.LJLJI.getLayoutParams().height = -2;
        xxj2.LJLLL = z2;
        xxj2.LJLLLL = z;
        xxj2.LJLJLLL = i4;
        xxj2.LJLJLJ = i3;
        XXH xxh = xxj2.LJLLI;
        xxh.LJLILLLLZI = list2;
        xxh.notifyDataSetChanged();
        xxj2.LJLLI.notifyDataSetChanged();
        xxj2.LJLJI.setCurrentItem(i2);
        xxj2.LJLJI.addOnPageChangeListener(xxj2.LJLJJLL);
        xxj2.LJLL = xvg3;
        XXJ xxj3 = (XXJ) this.LJLJLJ;
        G87 g87 = new G87() { // from class: X.XX3
            @Override // X.G87
            public final void LIZ(C84987XXb c84987XXb, View view, MusicModel musicModel, int i5) {
                final ViewPager2MusicBoardWidget viewPager2MusicBoardWidget = ViewPager2MusicBoardWidget.this;
                MusicCollectionItem musicCollectionItem2 = musicCollectionItem;
                viewPager2MusicBoardWidget.getClass();
                int id = view.getId();
                if (id == R.id.f75) {
                    Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                    if (LJIIIIZZ != null) {
                        LJIIIIZZ.getString(R.string.gaf);
                    }
                    if (!t1.LJI()) {
                        C84964XWe.LIZIZ(C84763XOl.LJIIIIZZ(), C44426Hc6.LIZJ(i5));
                        return;
                    } else {
                        c84987XXb.P();
                        XVF.LJII(c84987XXb.LLF, musicModel, viewPager2MusicBoardWidget.LJLZ, c84987XXb.LLI, musicModel.getLogPb());
                        return;
                    }
                }
                boolean z3 = false;
                if (id == R.id.f79) {
                    if (musicModel == null) {
                        return;
                    }
                    if (musicModel.getMusicStatus() == 0 && musicModel.getMusic() != null) {
                        String offlineDesc = musicModel.getMusic().getOfflineDesc();
                        if (TextUtils.isEmpty(offlineDesc)) {
                            offlineDesc = view.getContext().getString(R.string.iia);
                        }
                        C26045AKb c26045AKb = new C26045AKb(view);
                        c26045AKb.LJIIIZ(offlineDesc);
                        c26045AKb.LJIIJ();
                        return;
                    }
                    if (!XU0.LIZ(musicModel, view.getContext(), true)) {
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
                    XVF.LJIIIIZZ(viewPager2MusicBoardWidget.LJLZ, musicModel.getMusicId(), false, uuid);
                    return;
                }
                if (id == R.id.moa) {
                    Intent intent = new Intent(viewPager2MusicBoardWidget.LJLIL, (Class<?>) MusicDetailListActivity.class);
                    if (viewPager2MusicBoardWidget.LJLLJ == 0 && !viewPager2MusicBoardWidget.LLFFF) {
                        intent.putExtra("music_type", 1);
                        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", viewPager2MusicBoardWidget.LJLLLL);
                        intent.putExtra("sound_page_scene", viewPager2MusicBoardWidget.LLD);
                    } else {
                        intent.putExtra("music_class_id", musicCollectionItem2.mcId);
                        intent.putExtra("music_class_name", musicCollectionItem2.mcName);
                        intent.putExtra("music_type", 2);
                        intent.putExtra("music_category_is_hot", musicCollectionItem2.isHot);
                        intent.putExtra("music_class_enter_method", "click_more");
                        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", viewPager2MusicBoardWidget.LJLLLL);
                        intent.putExtra("music_class_level", musicCollectionItem2.level);
                        intent.putExtra("sound_page_scene", viewPager2MusicBoardWidget.LLD);
                        intent.putExtra("playlist_order_in_csp", viewPager2MusicBoardWidget.LJLLJ + 4);
                    }
                    intent.putExtra("max_video_duration", viewPager2MusicBoardWidget.LLF);
                    intent.putExtra("shoot_video_length", viewPager2MusicBoardWidget.LLFF);
                    intent.putExtra("music_discovery_type", viewPager2MusicBoardWidget.LJLLLLLL);
                    viewPager2MusicBoardWidget.LJIILIIL(intent, viewPager2MusicBoardWidget.LJLLL);
                    XVF.LJIIIZ(musicCollectionItem2.mcName, "click_more", Integer.valueOf(viewPager2MusicBoardWidget.LJLLJ), null, "", "change_music_page", musicCollectionItem2.mcId);
                    return;
                }
                if (id == R.id.g4i) {
                    if (c84987XXb == null || musicModel == null) {
                        return;
                    }
                    ChooseMusicSelectView chooseMusicSelectView = XVI.LIZ;
                    if (chooseMusicSelectView != null) {
                        chooseMusicSelectView.LIZIZ();
                    }
                    if (viewPager2MusicBoardWidget.LJLLILLLL == c84987XXb.LLI && ((Integer) viewPager2MusicBoardWidget.LJLJJI.get("music_position", -1)).intValue() == viewPager2MusicBoardWidget.LJLLJ) {
                        viewPager2MusicBoardWidget.LJLJJI.jv0(-1, "music_position");
                        viewPager2MusicBoardWidget.LJLJJI.jv0(-1, "music_index");
                        c84987XXb.V(false, false, false);
                        viewPager2MusicBoardWidget.LJLL.k2(null);
                        return;
                    }
                    XY4 xy4 = viewPager2MusicBoardWidget.LJLL;
                    if (xy4 != null) {
                        xy4.k2(null);
                        viewPager2MusicBoardWidget.LJLL.za0(new XUP() { // from class: X.XXw
                            @Override // X.XUP
                            public final void LIZ() {
                                ViewPager2MusicBoardWidget.this.LJLJJI.jv0(Boolean.FALSE, "music_loading");
                            }
                        });
                        viewPager2MusicBoardWidget.LJLL.oj0(musicModel, viewPager2MusicBoardWidget.LJLZ);
                        XVF.LIZLLL = c84987XXb.LLI;
                    }
                    viewPager2MusicBoardWidget.LJLJJI.jv0(Integer.valueOf(viewPager2MusicBoardWidget.LJLLJ), "music_position");
                    viewPager2MusicBoardWidget.LJLJJI.jv0(Integer.valueOf(c84987XXb.LLI), "music_index");
                    viewPager2MusicBoardWidget.LJLJJI.jv0(Boolean.TRUE, "music_loading");
                    return;
                }
                if (id == R.id.g6y) {
                    if (musicModel == null || viewPager2MusicBoardWidget.LJLL == null || viewPager2MusicBoardWidget.LJLZ == null) {
                        return;
                    }
                    IAVPerformance provideAVPerformance = AVExternalServiceImpl.LIZ().provideAVPerformance();
                    SelectMusicFromSelectFirstPageMonitor selectMusicFromSelectFirstPageMonitor = SelectMusicFromSelectFirstPageMonitor.INSTANCE;
                    provideAVPerformance.start(selectMusicFromSelectFirstPageMonitor, "click recommend music use");
                    C5IO.LIZ(selectMusicFromSelectFirstPageMonitor, musicModel.getMusicId());
                    ICommerceMediaService LIZJ = CommerceMediaServiceImpl.LIZJ();
                    if (viewPager2MusicBoardWidget.LJLLJ == 0) {
                        z3 = true;
                    }
                    musicModel.setFromSection(LIZJ.LJIIJ(musicModel, z3));
                    CommerceMediaServiceImpl.LIZJ().LJIIL(viewPager2MusicBoardWidget.LJLJLLL).nX(c84987XXb.LLI, Integer.valueOf(viewPager2MusicBoardWidget.LJLLJ), viewPager2MusicBoardWidget.LJLZ.LJ);
                    MusicModel m159clone = musicModel.m159clone();
                    String str3 = viewPager2MusicBoardWidget.LJLZ.LJ;
                    if (C38354F3m.LJ(str3)) {
                        str3 = "";
                    }
                    m159clone.setCategoryID(str3);
                    m159clone.setEditFrom("");
                    m159clone.setFromCollectionType(viewPager2MusicBoardWidget.LJLLLLLL);
                    viewPager2MusicBoardWidget.LJLL.y8(m159clone);
                    XVF.LJIILL(viewPager2MusicBoardWidget.LJLZ, m159clone, c84987XXb.LLI, m159clone.getLogPb());
                    return;
                }
                if (id != R.id.f77) {
                    return;
                }
                viewPager2MusicBoardWidget.LJLJJI.jv0(-1, "music_position");
                viewPager2MusicBoardWidget.LJLJJI.jv0(-1, "music_index");
                c84987XXb.V(false, false, false);
                viewPager2MusicBoardWidget.LJLL.k2(null);
                viewPager2MusicBoardWidget.LJLZ.LIZJ = "change_music";
                ChooseMusicCutViewModel chooseMusicCutViewModel = (ChooseMusicCutViewModel) C165706es.LJ(viewPager2MusicBoardWidget.LJLJLLL).get(ChooseMusicCutViewModel.class);
                chooseMusicCutViewModel.hv0().postValue(musicModel);
                chooseMusicCutViewModel.gv0().postValue(viewPager2MusicBoardWidget.LJLZ);
            }
        };
        C72H<XYM> c72h = this.LJZI;
        xxj3.LJLJJL = g87;
        xxj3.LJLJL = c72h;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        char c;
        XXQ xxq;
        ArrayList<C84987XXb> musicItemViews;
        MusicModel.CollectionType collectionType;
        XXQ xxq2;
        ArrayList<C84987XXb> musicItemViews2;
        XXQ xxq3;
        ArrayList<C84987XXb> musicItemViews3;
        C207668Da c207668Da = (C207668Da) obj;
        if (c207668Da == null) {
            return;
        }
        String str = c207668Da.LIZ;
        str.getClass();
        int i = 0;
        switch (str.hashCode()) {
            case -1635157503:
                if (str.equals("music_collect_status")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1322093457:
                if (str.equals("play_compeleted")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3322014:
                if (str.equals("list")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 199458657:
                if (str.equals("music_reset_play_start")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 502104354:
                if (str.equals("music_loading")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1579846200:
                if (str.equals("music_index")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        Object obj2 = null;
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c != 5) {
                                return;
                            }
                            LJIIZILJ(((Integer) this.LJLJJI.get("music_position")).intValue(), ((Integer) this.LJLJJI.get("music_index")).intValue());
                            return;
                        }
                        XYS xys = this.LJLJLJ;
                        if (xys == null) {
                            return;
                        }
                        XXJ xxj = (XXJ) xys;
                        int i2 = this.LJLLILLLL;
                        boolean booleanValue = ((Boolean) this.LJLJJI.get("music_loading")).booleanValue();
                        if (i2 < 0) {
                            return;
                        }
                        while (i < xxj.LJLJI.getChildCount() && (xxq3 = (XXQ) xxj.LJLJI.getChildAt(i)) != null && (musicItemViews3 = xxq3.getMusicItemViews()) != null) {
                            Iterator<C84987XXb> it = musicItemViews3.iterator();
                            while (it.hasNext()) {
                                C84987XXb next = it.next();
                                if (next.LLI == i2) {
                                    next.V(booleanValue, true, true);
                                    return;
                                }
                            }
                            i++;
                        }
                        return;
                    }
                    XYS xys2 = this.LJLJLJ;
                    if (xys2 == null) {
                        return;
                    }
                    XXJ xxj2 = (XXJ) xys2;
                    int i3 = this.LJLLILLLL;
                    Pair pair = (Pair) this.LJLJJI.get("music_reset_play_start");
                    if (i3 < 0) {
                        return;
                    }
                    while (i < xxj2.LJLJI.getChildCount() && (xxq2 = (XXQ) xxj2.LJLJI.getChildAt(i)) != null && (musicItemViews2 = xxq2.getMusicItemViews()) != null) {
                        Iterator<C84987XXb> it2 = musicItemViews2.iterator();
                        while (it2.hasNext()) {
                            if (it2.next().LLI == i3) {
                                if (pair == null) {
                                    return;
                                }
                                ((Integer) pair.first).intValue();
                                ((Float) pair.second).floatValue();
                                return;
                            }
                        }
                        i++;
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
            this.LJLL.k2(null);
            return;
        }
        Object obj4 = c207668Da.LIZIZ;
        if (obj4 != null) {
            obj2 = obj4;
        }
        XYC xyc = (XYC) obj2;
        int i4 = xyc.LIZ;
        if (i4 == 1) {
            if (this.LJLLJ != xyc.LIZIZ) {
                return;
            }
        } else if (i4 != 0) {
            return;
        }
        XYS xys3 = this.LJLJLJ;
        if (xys3 == null) {
            return;
        }
        XXJ xxj3 = (XXJ) xys3;
        for (int i5 = 0; i5 < xxj3.LJLJI.getChildCount() && (xxq = (XXQ) xxj3.LJLJI.getChildAt(i5)) != null && (musicItemViews = xxq.getMusicItemViews()) != null; i5++) {
            Iterator<C84987XXb> it3 = musicItemViews.iterator();
            while (it3.hasNext()) {
                C84987XXb next2 = it3.next();
                MusicModel musicModel = xyc.LJ;
                if (musicModel != null && !TextUtils.isEmpty(musicModel.getMusicId()) && next2.LLFII != null && musicModel.getMusicId().equals(next2.LLFII.getMusicId())) {
                    MusicModel musicModel2 = next2.LLFII;
                    if (xyc.LIZLLL == 1) {
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

    public ViewPager2MusicBoardWidget(int i, Fragment fragment) {
        this.LLFZ = new Rect();
        this.LJLJLLL = fragment;
        this.LLD = i;
        this.LLFZ = new Rect(0, 0, fragment.getResources().getDisplayMetrics().widthPixels, fragment.getResources().getDisplayMetrics().heightPixels);
    }

    @Override // X.InterfaceC85027XYp
    public final void LJI(int i, int i2) {
        XYS xys = this.LJLJLJ;
        if (xys == null || !(xys instanceof XXJ)) {
            return;
        }
        XXJ xxj = (XXJ) xys;
        boolean[] zArr = this.LJZL;
        boolean[] zArr2 = this.LL;
        for (int i3 = 0; i3 < zArr2.length; i3++) {
            if ((xxj.LJLLILLLL * i3) + xxj.LJLJI.getTop() <= i2) {
                if (((i3 + 1) * xxj.LJLLILLLL) + xxj.LJLJI.getTop() >= i) {
                    if (!zArr[i3]) {
                        zArr[i3] = true;
                        zArr2[i3] = true;
                    }
                }
            }
            zArr[i3] = false;
            zArr2[i3] = false;
        }
        LJIJ();
    }

    public final void LJIIZILJ(int i, int i2) {
        int i3;
        XXQ xxq;
        ArrayList<C84987XXb> musicItemViews;
        XYS xys = this.LJLJLJ;
        if (xys != null && (xys instanceof XXJ)) {
            XXJ xxj = (XXJ) xys;
            int i4 = this.LJLLILLLL;
            if (i == this.LJLLJ) {
                i3 = i2;
            } else {
                i3 = -1;
            }
            xxj.LJLJLJ = i3;
            if (i4 >= 0) {
                for (int i5 = 0; i5 < xxj.LJLJI.getChildCount() && (xxq = (XXQ) xxj.LJLJI.getChildAt(i5)) != null && (musicItemViews = xxq.getMusicItemViews()) != null; i5++) {
                    Iterator<C84987XXb> it = musicItemViews.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            C84987XXb next = it.next();
                            if (next.LLI == i4) {
                                next.V(false, false, false);
                                break;
                            }
                        }
                    }
                }
            }
        }
        if (i != this.LJLLJ) {
            this.LJLLILLLL = -1;
        } else if (this.LJLLILLLL == i2) {
            this.LJLL.k2(null);
        } else {
            this.LJLLILLLL = i2;
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void LJIIJJI(int i, int i2, Intent intent) {
        if (i2 == -1 && i == this.LJLLL) {
            LJIIIZ().setResult(-1, intent);
            LJIIIZ().finish();
        }
    }
}
