package com.ss.android.ugc.aweme.music.ui;

import X.AbstractC208618Gr;
import X.C0A2;
import X.C184077Kh;
import X.C214298b3;
import X.C214528bQ;
import X.C220578lB;
import X.C241269dS;
import X.C245319jz;
import X.C252669vq;
import X.C26045AKb;
import X.C48027It5;
import X.C62395OeF;
import X.C65352Pkq;
import X.C65776Prg;
import X.C6ZT;
import X.C78926UyI;
import X.C84763XOl;
import X.C9BD;
import X.C9BE;
import X.EnumC169566l6;
import X.ExecutorC142245i8;
import X.FV9;
import X.HG3;
import X.MGX;
import X.MHB;
import X.MHF;
import X.MHG;
import X.MHJ;
import X.MHK;
import X.N4C;
import X.N4D;
import X.QD3;
import X.RBX;
import X.TBT;
import X.V18;
import X.XP8;
import X.Z9N;
import Y.ACListenerS9S1110000_9;
import Y.ARunnableS28S0200000_9;
import Y.ARunnableS45S0100000_9;
import Y.IDcS38S0100000_9;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.commercialize.media.api.logging.ICommerceMusicLogger;
import com.ss.android.ugc.aweme.commercialize.media.impl.logging.CommerceMusicLogger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.music.v2.viewmodel.SharedMusicDetailViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.views.SpannedGridLayoutManager;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class MusicDetailAwemeListFragment extends DetailAwemeListFragment {
    public static final /* synthetic */ int LLJILJILJ = 0;
    public MHB LLILLL;
    public Music LLILZ;
    public boolean LLILZLL;
    public final C214298b3 LLIZLLLIL;
    public final ICommerceMusicLogger LLJ;
    public MusicDetail LLJI;
    public boolean LLJIJIL;
    public final Map<Integer, View> LLJILJIL = new LinkedHashMap();
    public boolean LLILZIL = true;
    public final XP8<MusicDetail> LLIZ = new XP8<>();

    @Override // com.ss.android.ugc.aweme.challenge.ui.AbsDetailAwemeListFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLJILJIL).clear();
    }

    public MusicDetailAwemeListFragment() {
        C214298b3 c214298b3;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(SharedMusicDetailViewModel.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ, 535);
        C220578lB c220578lB = C220578lB.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c220578lB, LIZ);
        } else if (c9bd == null || o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c220578lB, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LLIZLLLIL = c214298b3;
        this.LLJ = CommerceMusicLogger.LJJII();
        this.LLJIJIL = true;
    }

    public final int Rl() {
        String curSecUserId = HG3.LJIILL().getCurSecUserId();
        Music music = this.LLILZ;
        o.LJI(music);
        int i = 0;
        if (music.getMusicOwnerInfos() != null) {
            Music music2 = this.LLILZ;
            o.LJI(music2);
            if (music2.getMusicOwnerInfos().size() > 0) {
                Music music3 = this.LLILZ;
                o.LJI(music3);
                Iterator<MusicOwnerInfo> it = music3.getMusicOwnerInfos().iterator();
                while (it.hasNext()) {
                    if (TextUtils.equals(curSecUserId, it.next().getSecUid())) {
                        i = 1;
                    }
                }
            }
        }
        return i;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, com.ss.android.ugc.aweme.challenge.ui.AbsDetailAwemeListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        MHB mhb = this.LLILLL;
        o.LJI(mhb);
        mhb.LIZ(false);
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LLILZIL && FV9.LIZJ) {
            this.LLILZIL = false;
            ExecutorC142245i8.LJLILLLLZI.execute(new ARunnableS45S0100000_9(this, 83));
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (C84763XOl.LJIIIIZZ() == null) {
            C48027It5.LIZJ();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x009e, code lost:
    
        if (r1.contains(r0.getIdStr()) != false) goto L16;
     */
    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> Ml(java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> r8) {
        /*
            r7 = this;
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.K1b<X.K1g> r0 = r7.LJLJJL
            T extends X.8BS r2 = r0.LJLIL
            java.lang.String r0 = "mPresenter.model"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            boolean r0 = r2 instanceof X.C56542MHa
            r6 = 1
            r1 = 0
            if (r0 == 0) goto La1
            X.MHa r2 = (X.C56542MHa) r2
            boolean r0 = r2.LJLJL
            if (r0 == 0) goto La1
            r5 = 1
        L1b:
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            X.RBX r0 = (X.RBX) r0
            com.ss.android.ugc.aweme.profile.model.User r4 = r0.getCurUser()
            r0 = r8
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r0 <= 0) goto L4d
            java.lang.Object r2 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r8, r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.ss.android.ugc.aweme.feed.model.Aweme) r2
            java.util.List r0 = r2.getBehindTheSongMusicIds()
            if (r0 == 0) goto L4d
            com.ss.android.ugc.aweme.music.model.Music r0 = r7.LLILZ
            if (r0 == 0) goto L4d
            java.lang.String r1 = r0.getIdStr()
            java.lang.String r0 = "mMusic!!.idStr"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            int r0 = r1.length()
            if (r0 != 0) goto L8a
        L4d:
            r6 = 0
        L4e:
            if (r5 == 0) goto L69
            int r1 = r4.getAccountType()
            r0 = 3
            if (r1 == r0) goto L69
            X.Z8A r0 = X.Z8A.LIZIZ
            boolean r0 = r0.enableShowFeatureVideoEntrance()
            if (r0 == 0) goto L69
            if (r6 != 0) goto L69
            X.MHK r0 = new X.MHK
            r0.<init>()
            r3.add(r0)
        L69:
            r3.addAll(r8)
            com.ss.android.ugc.aweme.services.IExternalService r0 = com.ss.android.ugc.aweme.out.AVExternalServiceImpl.LIZ()
            com.ss.android.ugc.aweme.services.performance.IAVPerformance r2 = r0.provideAVPerformance()
            java.lang.String r1 = "tool_performance_music_shoot_same"
            java.lang.String r0 = "setData"
            r2.end(r1, r0)
            X.XP8<com.ss.android.ugc.aweme.music.model.MusicDetail> r2 = r7.LLIZ
            Y.ARunnableS28S0200000_9 r1 = new Y.ARunnableS28S0200000_9
            r0 = 22
            r1.<init>(r7, r8, r0)
            X.6l6 r0 = X.EnumC169566l6.LJLIL
            r2.LJFF(r1, r0)
            return r3
        L8a:
            java.util.List r1 = r2.getBehindTheSongMusicIds()
            kotlin.jvm.internal.o.LJI(r1)
            com.ss.android.ugc.aweme.music.model.Music r0 = r7.LLILZ
            kotlin.jvm.internal.o.LJI(r0)
            java.lang.String r0 = r0.getIdStr()
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L4d
            goto L4e
        La1:
            r5 = 0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.ui.MusicDetailAwemeListFragment.Ml(java.util.List):java.util.List");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:5|(1:7)(1:73)|8|(1:10)|11|(1:13)|14|(1:16)|17|(1:19)|20|(1:22)|45|(2:47|(9:49|50|(1:52)(1:54)|53|24|25|(5:32|(1:43)|34|(1:38)|39)|29|30))|55|(2:59|(2:64|(2:69|(1:71)(1:72))(1:68))(1:63))(1:58)|50|(0)(0)|53|24|25|(1:27)|32|(2:41|43)|34|(2:36|38)|39|29|30) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a0, code lost:
    
        if (X.MEX.LIZJ() != false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00db  */
    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    /* renamed from: Nl */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vk(X.AbstractC208618Gr<?> r13) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.ui.MusicDetailAwemeListFragment.vk(X.8Gr):void");
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final void Pl(C0A2 layoutManager) {
        o.LJIIIZ(layoutManager, "layoutManager");
        if (layoutManager instanceof WrapGridLayoutManager) {
            ((GridLayoutManager) layoutManager).LLIILII = new IDcS38S0100000_9(this, 0);
        } else {
            if (!(layoutManager instanceof SpannedGridLayoutManager)) {
                return;
            }
            ((SpannedGridLayoutManager) layoutManager).LJLZ = new MHJ(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final void initArguments(Bundle arguments) {
        o.LJIIIZ(arguments, "arguments");
        super.initArguments(arguments);
        this.LLILZ = (Music) arguments.getSerializable("detail_music_data");
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, X.MH9
    public final void l2(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        Music music = this.LLILZ;
        if (music != null) {
            music.setIsFollowerTagVisible(Boolean.valueOf(booleanValue));
        }
        Z9N.LIZIZ.LJFF().LJIILIIL(booleanValue);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((ArrayList) this.LLI).add(new MHG(this));
        this.LLFZ = new V18();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onUpdateFeaturedAwemeEvent(C241269dS event) {
        o.LJIIIZ(event, "event");
        if (event.LJLILLLLZI) {
            if (event.LJLJI) {
                C26045AKb c26045AKb = new C26045AKb(this);
                c26045AKb.LJIIIIZZ(R.string.gd2);
                c26045AKb.LJIIJ();
            }
            J4(false, false);
            return;
        }
        C26045AKb c26045AKb2 = new C26045AKb(this);
        c26045AKb2.LJIIIIZZ(R.string.img);
        c26045AKb2.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, X.JWG
    public final void p(AbstractC208618Gr holder) {
        o.LJIIIZ(holder, "holder");
        if (holder instanceof MHF) {
            C62395OeF.LIZLLL(0, Rl(), this.LJLJJI, "");
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, X.MH9
    public final void p4(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        Music music = this.LLILZ;
        if (music != null) {
            music.setIsFriendTagVisible(Boolean.valueOf(booleanValue));
        }
        Z9N.LIZIZ.LJFF().LJIL(booleanValue);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, X.JWG
    public final /* bridge */ /* synthetic */ void vk(AbstractC208618Gr abstractC208618Gr) {
        vk(abstractC208618Gr);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, X.MH9
    public final void Q7(TuxTextView view, Aweme aweme) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(aweme, "aweme");
        if (this.LLILZLL) {
            Sl(aweme, true);
            this.LLILZLL = false;
        }
    }

    public final void Sl(Aweme aweme, boolean z) {
        String aid = aweme.getAid();
        C62395OeF.LIZ(1, this.LJLJJI, aid);
        C245319jz c245319jz = new C245319jz();
        C252669vq c252669vq = new C252669vq();
        String string = getString(R.string.gco);
        o.LJIIIIZZ(string, "getString(R.string.featu…itVideo_actionSheet_cta1)");
        c252669vq.LIZ = string;
        c252669vq.LJ = new ACListenerS9S1110000_9(z, this, aid, 0);
        C252669vq c252669vq2 = new C252669vq();
        String string2 = getString(R.string.gcp);
        o.LJIIIIZZ(string2, "getString(R.string.featu…itVideo_actionSheet_cta2)");
        c252669vq2.LIZ = string2;
        c252669vq2.LJ = new ACListenerS9S1110000_9(z, this, aid, 1);
        c245319jz.LIZIZ(c252669vq, c252669vq2);
        TuxActionSheet LIZJ = c245319jz.LIZJ();
        FragmentManager fragmentManager = getFragmentManager();
        o.LJI(fragmentManager);
        LIZJ.show(fragmentManager, "edit_featured_video");
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        MHB mhb = new MHB(requireActivity());
        this.LLILLL = mhb;
        mhb.LIZ(true);
        AssemViewModel.asyncSubscribe$default(this.LLIZLLLIL.getValue(), new TBT() { // from class: X.MHi
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C187447Xg) obj).LJLIL;
            }
        }, null, null, null, new AqS175S0100000_9(this, 142), 14, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final void vl(SmartRoute smartRoute, Aweme aweme) {
        Long l;
        MusicDetail musicDetail = this.LLJI;
        if (musicDetail != null && (l = musicDetail.suggestionId) != null) {
            long longValue = l.longValue();
            if (smartRoute != null) {
                N4D.LIZ.getClass();
                smartRoute.withParam(N4D.LJI.LIZ, longValue);
            } else {
                return;
            }
        } else if (smartRoute == null) {
            return;
        }
        N4C n4c = N4C.LIZ;
        ShootExtraData shootExtraData = new ShootExtraData(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 4095, 0 == true ? 1 : 0);
        ICommerceMusicLogger iCommerceMusicLogger = this.LLJ;
        n4c.getClass();
        N4C.LIZIZ(shootExtraData, iCommerceMusicLogger.LJIIIIZZ(N4C.LJIILIIL.LIZIZ, new AqS175S0100000_9(aweme, 408)));
        smartRoute.withParam("extra_shoot_data", (Parcelable) shootExtraData);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final SmartRoute wl(MGX param, Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(param, "param");
        SmartRoute wl = super.wl(param, aweme);
        Music music = this.LLILZ;
        if (music != null) {
            wl.withParam("feed_data_music", music);
            wl.withParam("music_data_from_cache", this.LLJIJIL);
        }
        wl.withParam("feed_data_author_id", aweme.getAuthorUid());
        wl.withParam("feed_data_is_ad", aweme.isAd());
        return wl;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, X.MH9
    public final void LLLILZ(View view, Aweme aweme, String label) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(label, "label");
        this.LLIZ.LJFF(new ARunnableS28S0200000_9(aweme, this, 23), EnumC169566l6.LJLIL);
        if (aweme instanceof MHK) {
            User curUser = ((RBX) HG3.LJIILL()).getCurUser();
            if (curUser != null && curUser.isAccuratePrivateAccount()) {
                C26045AKb c26045AKb = new C26045AKb(this);
                c26045AKb.LJIIIIZZ(R.string.gcx);
                c26045AKb.LJIIJ();
                return;
            } else {
                if (C6ZT.LIZ(view)) {
                    return;
                }
                C62395OeF.LIZ(0, this.LJLJJI, "");
                SmartRoute buildRoute = SmartRouter.buildRoute(mo49getActivity(), "//music/artist/awemelist");
                Music music = this.LLILZ;
                o.LJI(music);
                buildRoute.withParam("artist_music_id", String.valueOf(music.getId()));
                Music music2 = this.LLILZ;
                o.LJI(music2);
                buildRoute.withParam("artist_music_name", music2.getMusicName());
                buildRoute.withParam("artist_music_data", this.LLILZ);
                buildRoute.withParam("enter_from", "single_song");
                buildRoute.open();
            }
        } else {
            Music music3 = this.LLILZ;
            if (music3 != null) {
                aweme.isFriendVideoPresent = music3.isFriendTagVisible;
                aweme.isFollowerVideoPresent = music3.isFollowerTagVisible;
            }
        }
        super.LLLILZ(view, aweme, label);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, X.MH9
    public final void yb(View view, Aweme aweme, String str) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(aweme, "aweme");
        Sl(aweme, false);
    }
}
