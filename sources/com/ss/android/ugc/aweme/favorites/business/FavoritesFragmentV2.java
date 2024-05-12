package com.ss.android.ugc.aweme.favorites.business;

import X.AbstractC186347Ta;
import X.ActivityC45651qj;
import X.ActivityC86117Xqz;
import X.C00F;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C16970lZ;
import X.C174796tX;
import X.C178456zR;
import X.C192187gU;
import X.C193507ic;
import X.C213228Yk;
import X.C213238Yl;
import X.C213268Yo;
import X.C213298Yr;
import X.C213408Zc;
import X.C213418Zd;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C51556KLg;
import X.C55230Lly;
import X.C55247LmF;
import X.C61712OJw;
import X.C61713OJx;
import X.C62822Ol8;
import X.C73411SrX;
import X.C76800UCe;
import X.C7SG;
import X.C7SH;
import X.C7VM;
import X.C80672VlM;
import X.C80674VlO;
import X.C80675VlP;
import X.C84364X9c;
import X.C8Z6;
import X.C8ZC;
import X.C8ZK;
import X.C90903hW;
import X.FFL;
import X.GFU;
import X.HT5;
import X.InterfaceC36571c5;
import X.InterfaceC55235Lm3;
import X.InterfaceC61213O0r;
import X.JBR;
import X.JBS;
import X.KOV;
import X.OGG;
import X.VW3;
import X.Z8A;
import Y.ARunnableS39S0100000_3;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.challenge.service.ChallengeServiceImpl;
import com.ss.android.ugc.aweme.favorites.base.FavoriteTabItemV2;
import com.ss.android.ugc.aweme.favorites.business.powerviewpager.CollectionListFragmentForMineProfileFragmentData;
import com.ss.android.ugc.aweme.favorites.business.powerviewpager.CommentCollectListFragmentData;
import com.ss.android.ugc.aweme.favorites.business.powerviewpager.FavoritePowerViewPagerViewModel;
import com.ss.android.ugc.aweme.favorites.business.powerviewpager.FavoriteVideoListFragmentData;
import com.ss.android.ugc.aweme.favorites.business.powerviewpager.MusicCollectionFragmentData;
import com.ss.android.ugc.aweme.favorites.business.powerviewpager.QuestionCollectListFragmentData;
import com.ss.android.ugc.aweme.favorites.business.powerviewpager.StickerCollectListFragmentData;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.topic.book.BookTokServiceImpl;
import com.ss.android.ugc.aweme.topic.movie.MovieTokServiceImpl;
import com.ss.android.ugc.tiktok.addyours.service.AddYoursServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

@InterfaceC61213O0r
/* loaded from: classes4.dex */
public final class FavoritesFragmentV2 extends AmeBaseFragment implements OGG, JBS {
    public final Boolean LJLIL;
    public String LJLILLLLZI;
    public C80675VlP LJLJI;
    public VW3 LJLJJI;
    public C8ZC LJLJJL;
    public int LJLJJLL;
    public boolean LJLJL;
    public int LJLJLJ;
    public Long LJLJLLL;
    public KOV LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;

    @Override // X.JBS
    public final /* synthetic */ void onActivityResult_Activity(int i, int i2, Intent intent) {
        JBR.LIZ(this, i, i2, intent);
    }

    @Override // X.JBS
    public final /* synthetic */ void onBackPressed_Activity() {
        JBR.LIZIZ(this);
    }

    @Override // X.JBS
    public final /* synthetic */ void onNewIntent(Intent intent) {
    }

    public FavoritesFragmentV2() {
        this(Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        C8ZK c8zk;
        C178456zR.LIZ = this.LJLILLLLZI;
        super.onResume();
        if (!this.LJLJL) {
            KOV kov = this.LJLL;
            if (kov != null) {
                C84364X9c.LIZ(kov, C213408Zc.LJLIL);
                this.LJLJL = true;
            } else {
                o.LJIJI("powerViewPager");
                throw null;
            }
        }
        FavoritePowerViewPagerViewModel vl = vl();
        KOV kov2 = this.LJLL;
        if (kov2 != null) {
            int i = this.LJLJJLL;
            vl.getClass();
            InterfaceC36571c5 LJ = kov2.getFragmentItemOperator().LJ(i);
            if ((LJ instanceof C8ZK) && (c8zk = (C8ZK) LJ) != null) {
                c8zk.onPageSelected(i);
                return;
            }
            return;
        }
        o.LJIJI("powerViewPager");
        throw null;
    }

    public final FavoritePowerViewPagerViewModel vl() {
        return (FavoritePowerViewPagerViewModel) this.LJLLI.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.OGG
    public final View LJIJJ() {
        if (getHost() == null) {
            return null;
        }
        FavoritePowerViewPagerViewModel vl = vl();
        KOV kov = this.LJLL;
        if (kov != null) {
            int i = this.LJLJJLL;
            vl.getClass();
            Fragment LJ = kov.getFragmentItemOperator().LJ(i);
            if (LJ == 0) {
                return null;
            }
            if (LJ instanceof OGG) {
                return ((OGG) LJ).LJIJJ();
            }
            return C8Z6.LIZ(LJ.getView());
        }
        o.LJIJI("powerViewPager");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C8ZC c8zc = this.LJLJJL;
        if (c8zc != null) {
            C73411SrX c73411SrX = c8zc.LIZJ;
            if (c73411SrX != null) {
                c73411SrX.dispose();
            }
            ((LinkedHashMap) c8zc.LIZLLL).clear();
            C16970lZ.LJII(R.layout.av1);
            return;
        }
        o.LJIJI("tabCountHelper");
        throw null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        HT5.LIZ = false;
        HT5.LIZIZ = -1;
    }

    public FavoritesFragmentV2(Boolean bool) {
        new LinkedHashMap();
        this.LJLIL = bool;
        this.LJLILLLLZI = "personal_homepage";
        this.LJLLI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 230));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 229));
    }

    @Override // X.JBS
    public final void onBeforeActivityCreated(Activity activity) {
        Intent intent;
        ActivityC86117Xqz activityC86117Xqz;
        String str = null;
        if ((activity instanceof ActivityC86117Xqz) && (activityC86117Xqz = (ActivityC86117Xqz) activity) != null) {
            C61713OJx LIZJ = C61712OJw.LIZJ(activityC86117Xqz);
            LIZJ.LJII(R.attr.cl);
            LIZJ.LIZJ();
            activityC86117Xqz.activityConfiguration(GFU.LJLIL);
        }
        if (activity != null && (intent = activity.getIntent()) != null) {
            str = intent.hasExtra("enter_from") ? C16880lQ.LLJJIJIIJIL(intent, "enter_from") : "h5";
        }
        this.LJLILLLLZI = str;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        C80672VlM c80672VlM;
        LinearLayout.LayoutParams layoutParams;
        o.LJIIIZ(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        C80675VlP c80675VlP = this.LJLJI;
        if (c80675VlP == null) {
            return;
        }
        int tabCount = c80675VlP.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            C80675VlP c80675VlP2 = this.LJLJI;
            if (c80675VlP2 != null) {
                C80674VlO LJIIJ = c80675VlP2.LJIIJ(i);
                if (LJIIJ != null && (c80672VlM = LJIIJ.LJIIIIZZ) != null) {
                    ViewGroup.LayoutParams layoutParams2 = c80672VlM.getLayoutParams();
                    if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
                        layoutParams.width = -2;
                        c80672VlM.setLayoutParams(layoutParams);
                    }
                }
            } else {
                o.LJIJI("tabLayout");
                throw null;
            }
        }
        C80675VlP c80675VlP3 = this.LJLJI;
        if (c80675VlP3 != null) {
            c80675VlP3.postDelayed(new ARunnableS39S0100000_3(this, 48), 300L);
        } else {
            o.LJIJI("tabLayout");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        AbstractC186347Ta videoCollectionFavoriteTabV2;
        final boolean z;
        C213298Yr LIZ;
        C213298Yr LIZ2;
        C213298Yr LIZ3;
        super.onCreate(bundle);
        FavoritePowerViewPagerViewModel vl = vl();
        final C213268Yo helper = (C213268Yo) this.LJLLILLLL.getValue();
        vl.getClass();
        o.LJIIIZ(helper, "helper");
        MutableLiveData<List<AbstractC186347Ta>> mutableLiveData = vl.LJLIL;
        ArrayList arrayList = new ArrayList();
        if (((Boolean) C213418Zd.LIZ.getValue()).booleanValue()) {
            videoCollectionFavoriteTabV2 = new AbstractC186347Ta(helper) { // from class: X.7i2
                public final FavoriteTabItemV2 LJLILLLLZI;

                @Override // X.AbstractC186347Ta
                public final FavoriteTabItemV2 LIZ() {
                    return this.LJLILLLLZI;
                }

                {
                    int i;
                    FavoriteVideoListFragmentData favoriteVideoListFragmentData = new FavoriteVideoListFragmentData(false);
                    if (C8SG.LIZIZ.LJJIFFI()) {
                        i = R.string.jlh;
                    } else {
                        i = R.string.dgr;
                    }
                    this.LJLILLLLZI = new FavoriteTabItemV2(favoriteVideoListFragmentData, helper.LIZIZ(i, "video"), "video", "videos", helper.LIZ.getString(R.string.gap));
                }

                @QD3(threadMode = ThreadMode.MAIN)
                public final void onVideoCollect(C193087hw e) {
                    o.LJIIIZ(e, "e");
                    if (e.LJLILLLLZI == 1) {
                        LIZLLL(this.LJLIL);
                    } else {
                        LIZIZ(this.LJLIL);
                    }
                }
            };
        } else {
            Z8A z8a = Z8A.LIZIZ;
            Context context = helper.LIZ;
            videoCollectionFavoriteTabV2 = z8a.getVideoCollectionFavoriteTabV2(context, (int) context.getResources().getDimension(R.dimen.rh), helper.LIZJ);
        }
        AbstractC186347Ta abstractC186347Ta = new AbstractC186347Ta(helper) { // from class: X.7h9
            public final FavoriteTabItemV2 LJLILLLLZI;

            @Override // X.AbstractC186347Ta
            public final FavoriteTabItemV2 LIZ() {
                return this.LJLILLLLZI;
            }

            {
                CollectionListFragmentForMineProfileFragmentData collectionListFragmentForMineProfileFragmentData = new CollectionListFragmentForMineProfileFragmentData();
                String string = helper.LIZ.getString(R.string.pdy);
                o.LJIIIIZZ(string, "context.getString(R.stri…avorites_tab_collections)");
                this.LJLILLLLZI = new FavoriteTabItemV2(collectionListFragmentForMineProfileFragmentData, string, "collection", "collections");
            }

            @QD3(threadMode = ThreadMode.MAIN)
            public final void onCollectionChange(C191937g5 e) {
                o.LJIIIZ(e, "e");
                int i = e.LJLIL.operation;
                if (i == 1) {
                    LIZLLL(this.LJLIL);
                } else {
                    if (i != 2) {
                        return;
                    }
                    LIZIZ(this.LJLIL);
                }
            }
        };
        AbstractC186347Ta abstractC186347Ta2 = new AbstractC186347Ta(helper) { // from class: X.7SK
            public final FavoriteTabItemV2 LJLILLLLZI;

            @Override // X.AbstractC186347Ta
            public final FavoriteTabItemV2 LIZ() {
                return this.LJLILLLLZI;
            }

            {
                this.LJLILLLLZI = new FavoriteTabItemV2(new StickerCollectListFragmentData(), helper.LIZIZ(R.string.dgk, "tool"), "prop", "effects");
            }

            @QD3(threadMode = ThreadMode.MAIN)
            public final void onStickerCollect(C76P e) {
                o.LJIIIZ(e, "e");
                NewFaceStickerBean newFaceStickerBean = e.LJLIL;
                o.LJIIIIZZ(newFaceStickerBean, "e.stickerBean");
                if (newFaceStickerBean.isFavorite) {
                    LIZLLL(this.LJLIL);
                } else {
                    LIZIZ(this.LJLIL);
                }
            }
        };
        boolean z2 = false;
        if (C00F.LIZ(31744, 0, "favorite_reverse", false) != 1) {
            if (videoCollectionFavoriteTabV2 != null) {
                arrayList.add(videoCollectionFavoriteTabV2);
            }
            arrayList.add(abstractC186347Ta);
            z = true;
        } else {
            z = false;
        }
        arrayList.add(new AbstractC186347Ta(z, helper) { // from class: X.8Yv
            public final HashMap<String, Boolean> LJLILLLLZI = new HashMap<>();
            public final FavoriteTabItemV2 LJLJI;

            @Override // X.AbstractC186347Ta
            public final FavoriteTabItemV2 LIZ() {
                return this.LJLJI;
            }

            @Override // X.AbstractC186347Ta
            public final void LIZJ(Lifecycle.Event event) {
                o.LJIIIZ(event, "event");
                super.LIZJ(event);
                if (C213368Yy.LIZ[event.ordinal()] == 1) {
                    this.LJLILLLLZI.clear();
                }
            }

            @QD3(threadMode = ThreadMode.MAIN)
            public final void onCollectMusicEvent(C213358Yx event) {
                boolean z3;
                o.LJIIIZ(event, "event");
                if (event.LJLJI) {
                    if (this.LJLILLLLZI.containsKey(event.LJLIL)) {
                        if (event.LJLILLLLZI == 1 && o.LJ(this.LJLILLLLZI.get(event.LJLIL), Boolean.FALSE)) {
                            this.LJLILLLLZI.put(event.LJLIL, Boolean.TRUE);
                        } else if (event.LJLILLLLZI == 0 && o.LJ(this.LJLILLLLZI.get(event.LJLIL), Boolean.TRUE)) {
                            this.LJLILLLLZI.put(event.LJLIL, Boolean.FALSE);
                        } else {
                            return;
                        }
                    } else {
                        HashMap<String, Boolean> hashMap = this.LJLILLLLZI;
                        String str = event.LJLIL;
                        if (event.LJLILLLLZI == 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        hashMap.put(str, Boolean.valueOf(z3));
                    }
                    if (event.LJLILLLLZI == 1) {
                        LIZLLL(this.LJLIL);
                    } else {
                        LIZIZ(this.LJLIL);
                    }
                }
            }

            @QD3(threadMode = ThreadMode.MAIN)
            public final void onMusicCollect(C72197SVd e) {
                boolean z3;
                o.LJIIIZ(e, "e");
                if (this.LJLILLLLZI.containsKey(e.LJLILLLLZI.getMusicId())) {
                    if (e.LJLIL == 1 && o.LJ(this.LJLILLLLZI.get(e.LJLILLLLZI.getMusicId()), Boolean.FALSE)) {
                        HashMap<String, Boolean> hashMap = this.LJLILLLLZI;
                        String musicId = e.LJLILLLLZI.getMusicId();
                        o.LJIIIIZZ(musicId, "e.musicModel.musicId");
                        hashMap.put(musicId, Boolean.TRUE);
                    } else if (e.LJLIL == 0 && o.LJ(this.LJLILLLLZI.get(e.LJLILLLLZI.getMusicId()), Boolean.TRUE)) {
                        HashMap<String, Boolean> hashMap2 = this.LJLILLLLZI;
                        String musicId2 = e.LJLILLLLZI.getMusicId();
                        o.LJIIIIZZ(musicId2, "e.musicModel.musicId");
                        hashMap2.put(musicId2, Boolean.FALSE);
                    } else {
                        return;
                    }
                } else {
                    HashMap<String, Boolean> hashMap3 = this.LJLILLLLZI;
                    String musicId3 = e.LJLILLLLZI.getMusicId();
                    o.LJIIIIZZ(musicId3, "e.musicModel.musicId");
                    if (e.LJLIL == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    hashMap3.put(musicId3, Boolean.valueOf(z3));
                }
                if (e.LJLIL == 1) {
                    LIZLLL(this.LJLIL);
                } else {
                    LIZIZ(this.LJLIL);
                }
            }

            {
                this.LJLJI = new FavoriteTabItemV2(new MusicCollectionFragmentData(z), helper.LIZIZ(R.string.dgp, "music"), "music", "sounds", helper.LIZ.getString(R.string.gan));
            }
        });
        if (C00F.LIZ(31744, 0, "favorite_product_after_effect", true) == 2 && (LIZ3 = helper.LIZ()) != null) {
            arrayList.add(LIZ3);
        }
        arrayList.add(abstractC186347Ta2);
        FFL.LJIIIZ().getClass();
        if (FFL.LJIIJ(31744, 0, "favorite_product_after_effect", true) == 1 && (LIZ2 = helper.LIZ()) != null) {
            arrayList.add(LIZ2);
        }
        C51556KLg.LIZ.getClass();
        AbstractC186347Ta LJJIJL = C51556KLg.LIZ().LJJIJL(helper.LIZ);
        if (LJJIJL != null) {
            arrayList.add(LJJIJL);
        }
        if (C213228Yk.LIZ) {
            arrayList.add(new C192187gU(helper));
        }
        C7SH LJ = MovieTokServiceImpl.LJFF().LJ(helper.LIZ);
        if (LJ != null) {
            arrayList.add(LJ);
        }
        C7SG LIZ4 = BookTokServiceImpl.LJFF().LIZ(helper.LIZ);
        if (LIZ4 != null) {
            arrayList.add(LIZ4);
        }
        if (C174796tX.LIZ()) {
            arrayList.add(new AbstractC186347Ta(helper) { // from class: X.7SJ
                public final FavoriteTabItemV2 LJLILLLLZI;

                @Override // X.AbstractC186347Ta
                public final FavoriteTabItemV2 LIZ() {
                    return this.LJLILLLLZI;
                }

                {
                    boolean z3;
                    Boolean bool = helper.LIZJ;
                    if (bool != null) {
                        z3 = bool.booleanValue();
                    } else {
                        z3 = false;
                    }
                    CommentCollectListFragmentData commentCollectListFragmentData = new CommentCollectListFragmentData(z3);
                    String string = helper.LIZ.getString(R.string.gar);
                    o.LJIIIIZZ(string, "context.getString(R.string.favorites_comment_tab)");
                    this.LJLILLLLZI = new FavoriteTabItemV2(commentCollectListFragmentData, string, "comment", "comments");
                }

                @QD3(threadMode = ThreadMode.MAIN)
                public final void onCommentsCollect(C176166vk e) {
                    o.LJIIIZ(e, "e");
                    if (e.LJLIL.isCollected()) {
                        LIZLLL(this.LJLIL);
                    } else {
                        LIZIZ(this.LJLIL);
                    }
                }
            });
        }
        AbstractC186347Ta LIZIZ = AddYoursServiceImpl.LJIJ().LIZIZ(helper.LIZ);
        if (LIZIZ != null) {
            arrayList.add(LIZIZ);
        } else if (C213238Yl.LIZ) {
            arrayList.add(new AbstractC186347Ta(helper) { // from class: X.7SL
                public final FavoriteTabItemV2 LJLILLLLZI;

                @Override // X.AbstractC186347Ta
                public final FavoriteTabItemV2 LIZ() {
                    return this.LJLILLLLZI;
                }

                {
                    QuestionCollectListFragmentData questionCollectListFragmentData = new QuestionCollectListFragmentData();
                    String string = helper.LIZ.getString(R.string.pn2);
                    o.LJIIIIZZ(string, "context.getString(R.string.qa_page_tab_questions)");
                    this.LJLILLLLZI = new FavoriteTabItemV2(questionCollectListFragmentData, string, "question", "questions");
                }

                @QD3(threadMode = ThreadMode.MAIN)
                public final void onQuestionsCollect(C185517Pv e) {
                    o.LJIIIZ(e, "e");
                    Integer collectStatus = e.LJLIL.getCollectStatus();
                    if (collectStatus == null || collectStatus.intValue() != 1) {
                        LIZIZ(this.LJLIL);
                    } else {
                        LIZLLL(this.LJLIL);
                    }
                }
            });
        }
        AbstractC186347Ta LIZ5 = ChallengeServiceImpl.LJFF().LIZ(helper.LIZ, Boolean.FALSE);
        o.LJIIIIZZ(LIZ5, "get().getService(IChalle…riteTabV2(context, false)");
        arrayList.add(LIZ5);
        FFL.LJIIIZ().getClass();
        if (FFL.LJIIJ(31744, 0, "favorite_product_after_effect", true) == 0 && (LIZ = helper.LIZ()) != null) {
            arrayList.add(LIZ);
        }
        mutableLiveData.setValue(arrayList);
        getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.favorites.business.FavoritesFragmentV2$onCreate$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                o.LJIIIZ(source, "source");
                o.LJIIIZ(event, "event");
                List list = (List) FavoritesFragmentV2.this.vl().LJLILLLLZI.getValue();
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((AbstractC186347Ta) it.next()).LIZJ(event);
                    }
                }
            }
        });
        InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(this, null);
        if (getParentFragment() != null) {
            z2 = true;
        }
        C55247LmF.LIZIZ(LIZJ, new C7VM(z2), C7VM.class, "source_default_key");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cf, code lost:
    
        if (r22 != false) goto L24;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setUserVisibleHint(boolean r22) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.business.FavoritesFragmentV2.setUserVisibleHint(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ad  */
    /* JADX WARN: Type inference failed for: r0v56, types: [X.8ZO] */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r18, android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.business.FavoritesFragmentV2.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View LLLLIILL;
        o.LJIIIZ(inflater, "inflater");
        if (C193507ic.LIZ()) {
            LLLLIILL = C16970lZ.LIZJ(R.layout.av1, mo49getActivity(), viewGroup, false);
        } else {
            LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.av1, viewGroup, false);
        }
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
