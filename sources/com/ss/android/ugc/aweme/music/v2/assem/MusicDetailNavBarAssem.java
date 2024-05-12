package com.ss.android.ugc.aweme.music.v2.assem;

import X.ActivityC45651qj;
import X.C107794Kx;
import X.C16880lQ;
import X.C214298b3;
import X.C221108m2;
import X.C234529Ii;
import X.C252709vu;
import X.C32151Nz;
import X.C42625Go9;
import X.C55096Ljo;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C7MY;
import X.C9BE;
import X.InterfaceC109344Qw;
import X.InterfaceC65350Pko;
import X.O6R;
import X.OH9;
import X.OHA;
import X.QD3;
import X.TBT;
import Y.ACListenerS32S0400000_10;
import Y.IDObjectS0S0101000;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.detail.prefab.DetailNavBarAssem;
import com.ss.android.ugc.aweme.detail.prefab.ability.PageHeaderScrollAbility;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.v2.assem.MusicDetailNavBarAssem;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class MusicDetailNavBarAssem extends DetailNavBarAssem implements PageHeaderScrollAbility {
    public final C62822Ol8 LJLLJ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 267));
    public final C62822Ol8 LJLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 268));
    public final C62822Ol8 LJLLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 269));
    public final C214298b3 LJLLLLLL;
    public boolean LJLZ;
    public final List<OHA> LJZ;

    public MusicDetailNavBarAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MusicDetailViewModel.class);
        this.LJLLLLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS160S0100000_10((InterfaceC65350Pko) LIZ, 270), OH9.INSTANCE, null);
        this.LJZ = new ArrayList();
    }

    public final String N3() {
        return (String) this.LJLLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.DetailNavBarAssem, com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onCreateView() {
        ViewGroup viewGroup;
        super.onCreateView();
        ViewParent parent = x3().getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            IDObjectS0S0101000 iDObjectS0S0101000 = new IDObjectS0S0101000(viewGroup, 2);
            if (iDObjectS0S0101000.hasNext() && !o.LJ(iDObjectS0S0101000.next(), x3())) {
                iDObjectS0S0101000.remove();
            }
        }
    }

    /* loaded from: classes11.dex */
    public final class ShareMusicAction implements OHA {
        public final MusicDetail LIZ;
        public final ActivityC45651qj LIZIZ;
        public final /* synthetic */ MusicDetailNavBarAssem LIZJ;

        @Override // X.OHA
        public final void LIZJ(int i) {
        }

        @Override // X.OHA
        public final void LIZ(C252709vu c252709vu) {
            Music music;
            UrlModel playUrl;
            List<String> urlList;
            Music music2 = this.LIZ.music;
            if (music2 == null || music2.getMusicStatus() == 0 || (music = this.LIZ.music) == null || (playUrl = music.getPlayUrl()) == null || (urlList = playUrl.getUrlList()) == null || !(!urlList.isEmpty())) {
                return;
            }
            C234529Ii c234529Ii = new C234529Ii();
            c234529Ii.LIZIZ = "share_music";
            c234529Ii.LIZJ();
            c234529Ii.LIZJ = R.raw.icon_arrow_turn_up_right;
            c234529Ii.LIZLLL = true;
            c252709vu.LIZIZ(c234529Ii);
            this.LIZJ.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.music.v2.assem.MusicDetailNavBarAssem$ShareMusicAction$initAction$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                    o.LJIIIZ(source, "source");
                    o.LJIIIZ(event, "event");
                    if (event == Lifecycle.Event.ON_CREATE) {
                        C42625Go9.LIZIZ(MusicDetailNavBarAssem.ShareMusicAction.this);
                    } else {
                        if (event != Lifecycle.Event.ON_DESTROY) {
                            return;
                        }
                        C42625Go9.LIZJ(MusicDetailNavBarAssem.ShareMusicAction.this);
                    }
                }
            });
        }

        @Override // X.OHA
        public final void LIZIZ(C252709vu c252709vu) {
            MusicModel convertToMusicModel;
            TuxIconView tuxIconView;
            Music music = this.LIZ.music;
            if (music == null || (convertToMusicModel = music.convertToMusicModel()) == null) {
                return;
            }
            View LJI = c252709vu.LJI("share_music");
            if (!(LJI instanceof TuxIconView) || (tuxIconView = (TuxIconView) LJI) == null) {
                return;
            }
            Context context = c252709vu.getContext();
            if (context != null) {
                tuxIconView.setContentDescription(context.getString(R.string.at4));
            }
            C16880lQ.LJJJ(tuxIconView, new ACListenerS32S0400000_10(convertToMusicModel, this, music, this.LIZJ, 0));
        }

        @QD3
        public final void onEvent(C107794Kx event) {
            View view;
            o.LJIIIZ(event, "event");
            if (TextUtils.equals("music", event.LJLJJI)) {
                InterfaceC109344Qw shareService = IMService.createIIMServicebyMonsterPlugin(false).getShareService();
                ActivityC45651qj activityC45651qj = this.LIZIZ;
                Fragment LJIIIZ = C55096Ljo.LJIIIZ(this.LIZJ);
                if (LJIIIZ != null) {
                    view = LJIIIZ.getView();
                } else {
                    view = null;
                }
                shareService.LJIIL(activityC45651qj, view, event);
            }
        }

        public ShareMusicAction(MusicDetailNavBarAssem musicDetailNavBarAssem, MusicDetail musicDetail, ActivityC45651qj activityC45651qj) {
            o.LJIIIZ(musicDetail, "musicDetail");
            this.LIZJ = musicDetailNavBarAssem;
            this.LIZ = musicDetail;
            this.LIZIZ = activityC45651qj;
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.PageHeaderScrollAbility
    public final void SQ(int i) {
        boolean z;
        TuxTextView tuxTextView = this.LJLL;
        if (tuxTextView != null) {
            tuxTextView.setAlpha(M3(C7MY.LIZIZ(100), O6R.LJJIIZ(C32151Nz.LJIIZILJ(160)), i));
            C252709vu L3 = L3();
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            L3.LJIILJJIL(z);
            Iterator it = ((ArrayList) this.LJZ).iterator();
            while (it.hasNext()) {
                ((OHA) it.next()).LIZJ(i);
            }
            return;
        }
        o.LJIJI("titleTv");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.DetailNavBarAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLLLLLL.getValue(), new TBT() { // from class: X.OGc
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C187447Xg) obj).LJLIL;
            }
        }, null, null, null, new AqS176S0100000_10(this, 54), 14, null);
    }

    public static float M3(int i, int i2, int i3) {
        int i4 = i2 - i;
        if (i3 - i < 0) {
            return 0.0f;
        }
        return Math.min(r3, i4) / i4;
    }
}
