package com.ss.android.ugc.aweme.favorites.business;

import X.AbstractC186377Td;
import X.ActivityC45651qj;
import X.C00F;
import X.C174796tX;
import X.C185527Pw;
import X.C1BC;
import X.C213228Yk;
import X.C213238Yl;
import X.C213288Yq;
import X.C213418Zd;
import X.C32I;
import X.C47261Igj;
import X.C51556KLg;
import X.C7VQ;
import X.FFL;
import X.ORZ;
import X.X1D;
import X.Z8A;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.challenge.service.ChallengeServiceImpl;
import com.ss.android.ugc.aweme.favorites.business.aweme.AwemeCollectionAgent;
import com.ss.android.ugc.aweme.favorites.business.collection.AllFavoriteFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionListFragmentForMineProfile;
import com.ss.android.ugc.aweme.favorites.business.comment.CommentCollectListFragment;
import com.ss.android.ugc.aweme.favorites.business.music.MusicCollectionFragment;
import com.ss.android.ugc.aweme.favorites.business.playlist.PlaylistCollectionPage;
import com.ss.android.ugc.aweme.favorites.business.question.QuestionCollectListFragment;
import com.ss.android.ugc.aweme.favorites.business.sticker.StickerCollectListFragment;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.topic.book.BookTokServiceImpl;
import com.ss.android.ugc.aweme.topic.movie.MovieTokServiceImpl;
import com.ss.android.ugc.tiktok.addyours.service.AddYoursServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.IDqS428S0100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes4.dex */
public final class FavoritesPagerAdapter extends C1BC implements LifecycleEventObserver {
    public final Context LJLJJLL;
    public final String LJLJL;
    public final Boolean LJLJLJ;
    public final List<AbstractC186377Td> LJLJLLL;

    public final List<Fragment> LJJIIJZLJL() {
        List<AbstractC186377Td> list = this.LJLJLLL;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<AbstractC186377Td> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().LIZ().LIZ);
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (r0 == null) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, com.ss.android.ugc.aweme.commercialize.ecommerce.wishlist.ui.WishListFragment] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C213288Yq LJJIJ() {
        /*
            r6 = this;
            X.2mC r3 = new X.2mC
            r3.<init>()
            java.lang.String r0 = "ec_new_wish_list_enable"
            r2 = 0
            int r1 = X.Q7K.LIZIZ(r0, r2)
            r0 = 1
            if (r1 != r0) goto L60
        Lf:
            java.lang.String r4 = "profile"
            r5 = 0
            if (r0 == 0) goto L47
            com.ss.android.ugc.aweme.ecommerce.service.IECommerceService r2 = com.ss.android.ugc.aweme.ecommerce.core.services.ECommerceService.createIECommerceServicebyMonsterPlugin(r2)
            if (r2 == 0) goto L39
            java.lang.String r0 = r6.LJLJL
            if (r0 == 0) goto L31
            java.lang.Boolean r1 = r6.LJLJLJ
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L45
            r1 = r4
        L29:
            java.lang.String r0 = r6.LJLJL
            androidx.fragment.app.Fragment r0 = r2.createWishListFragment(r1, r0)
            if (r0 != 0) goto L37
        L31:
            java.lang.String r0 = "personal_homepage"
            androidx.fragment.app.Fragment r0 = r2.createWishListFragment(r4, r0)
        L37:
            r3.element = r0
        L39:
            T r1 = r3.element
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L62
            X.8Yq r0 = new X.8Yq
            r0.<init>(r1, r6)
            return r0
        L45:
            r1 = r5
            goto L29
        L47:
            com.ss.android.ugc.aweme.commercialize.ecommerce.service.IShoppingAdsService r2 = com.ss.android.ugc.aweme.commercialize.ecommerce.service.ShoppingAdsServiceImpl.LJIIIZ()
            if (r2 == 0) goto L39
            java.lang.Boolean r1 = r6.LJLJLJ
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L5e
        L57:
            com.ss.android.ugc.aweme.commercialize.ecommerce.wishlist.ui.WishListFragment r0 = r2.LJIIIIZZ(r4)
            r3.element = r0
            goto L39
        L5e:
            r4 = r5
            goto L57
        L60:
            r0 = 0
            goto Lf
        L62:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.business.FavoritesPagerAdapter.LJJIJ():X.8Yq");
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LJLJLLL.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIIL(Object object) {
        o.LJIIIZ(object, "object");
        if (ORZ.LJLJJI(object, LJJIIJZLJL())) {
            return ((ArrayList) LJJIIJZLJL()).indexOf(object);
        }
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIILIIL(int i) {
        return ((AbstractC186377Td) ListProtector.get(this.LJLJLLL, i)).LIZ().LIZIZ;
    }

    @Override // X.C1BC
    public final Fragment LJJIII(int i) {
        return ((AbstractC186377Td) ListProtector.get(this.LJLJLLL, i)).LIZ().LIZ;
    }

    public final String LJJIIZ(int i) {
        return ((AbstractC186377Td) ListProtector.get(this.LJLJLLL, i)).LIZ().LIZJ;
    }

    public final int LJJIIZI(String str) {
        Iterator it = ((ArrayList) this.LJLJLLL).iterator();
        int i = 0;
        while (it.hasNext()) {
            if (o.LJ(((AbstractC186377Td) it.next()).LIZ().LIZJ, str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void LJJIJIIJI(int i) {
        ProfileListFragment profileListFragment;
        boolean z;
        int i2 = 0;
        for (Fragment fragment : LJJIIJZLJL()) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                Fragment fragment2 = fragment;
                if ((fragment2 instanceof ProfileListFragment) && (profileListFragment = (ProfileListFragment) fragment2) != null) {
                    if (profileListFragment.getFragmentManager() != null) {
                        if (i2 == i) {
                            z = true;
                        } else {
                            z = false;
                        }
                        profileListFragment.setUserVisibleHint(z);
                    }
                    profileListFragment.Oi();
                }
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    public final String LJJIJIIJIL(int i, String str) {
        String string = this.LJLJJLL.getString(i);
        o.LJIIIIZZ(string, "context.getString(key)");
        if (!o.LJ(string, str)) {
            StringBuilder LIZ = X1D.LIZ();
            String substring = string.substring(0, 1);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Locale ROOT = Locale.ROOT;
            o.LJIIIIZZ(ROOT, "ROOT");
            String upperCase = substring.toUpperCase(ROOT);
            o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(locale)");
            LIZ.append(upperCase);
            String substring2 = string.substring(1);
            o.LJIIIIZZ(substring2, "this as java.lang.String).substring(startIndex)");
            String lowerCase = substring2.toLowerCase(ROOT);
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            LIZ.append(lowerCase);
            return X1D.LIZIZ(LIZ);
        }
        return string;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        Iterator<AbstractC186377Td> it = this.LJLJLLL.iterator();
        while (it.hasNext()) {
            it.next().LIZJ(event);
        }
    }

    public FavoritesPagerAdapter(FragmentManager fragmentManager, ActivityC45651qj activityC45651qj, String str, Boolean bool) {
        super(fragmentManager, 0);
        AbstractC186377Td videoCollectionFavoriteTab;
        final boolean z;
        C213288Yq LJJIJ;
        C213288Yq LJJIJ2;
        C213288Yq LJJIJ3;
        this.LJLJJLL = activityC45651qj;
        this.LJLJL = str;
        this.LJLJLJ = bool;
        ArrayList arrayList = new ArrayList();
        this.LJLJLLL = arrayList;
        if (((Boolean) C213418Zd.LIZ.getValue()).booleanValue()) {
            videoCollectionFavoriteTab = new AbstractC186377Td(this) { // from class: X.7i6
                public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1460));
                public final IDqS428S0100000_3 LJLJI = new IDqS428S0100000_3(this, 13);
                public final C213218Yj LJLJJI;

                @Override // X.AbstractC186377Td
                public final void LJ(boolean z2) {
                }

                @Override // X.AbstractC186377Td
                public final C213218Yj LIZ() {
                    return this.LJLJJI;
                }

                {
                    int i;
                    AllFavoriteFragment allFavoriteFragment = new AllFavoriteFragment();
                    allFavoriteFragment.setArguments(V3N.LJ(new OSZ("is_show_navbar", Boolean.FALSE)));
                    if (C8SG.LIZIZ.LJJIFFI()) {
                        i = R.string.jlh;
                    } else {
                        i = R.string.dgr;
                    }
                    this.LJLJJI = new C213218Yj(allFavoriteFragment, this.LJJIJIIJIL(i, "video"), "video", "videos", this.LJLJJLL.getString(R.string.gap));
                }

                @Override // X.AbstractC186377Td
                public final void LIZJ(Lifecycle.Event event) {
                    o.LJIIIZ(event, "event");
                    super.LIZJ(event);
                    if (C52535Kjb.LIZ()) {
                        int i = C193197i7.LIZ[event.ordinal()];
                        if (i != 1) {
                            if (i != 2) {
                                return;
                            }
                            if (C52535Kjb.LIZIZ()) {
                                AwemeCollectionAgent.LJIILLIIL().LIZJ(this.LJLJI);
                                return;
                            } else {
                                AwemeCollectionAgent.LJIILLIIL().LJIIIIZZ((C193207i8) this.LJLILLLLZI.getValue());
                                return;
                            }
                        }
                        if (C52535Kjb.LIZIZ()) {
                            AwemeCollectionAgent.LJIILLIIL().LJFF(this.LJLJI);
                        } else {
                            AwemeCollectionAgent.LJIILLIIL().LJI((C193207i8) this.LJLILLLLZI.getValue());
                        }
                    }
                }

                @QD3(threadMode = ThreadMode.MAIN)
                public final void onVideoCollect(C193087hw e) {
                    o.LJIIIZ(e, "e");
                    if (e.LJLILLLLZI == 1) {
                        LJFF(this.LJLIL);
                    } else {
                        LIZIZ(this.LJLIL);
                    }
                }
            };
        } else {
            videoCollectionFavoriteTab = Z8A.LIZIZ.getVideoCollectionFavoriteTab(activityC45651qj, (int) activityC45651qj.getResources().getDimension(R.dimen.rh), bool);
        }
        AbstractC186377Td abstractC186377Td = new AbstractC186377Td(this) { // from class: X.7h8
            public final C213218Yj LJLILLLLZI;

            @Override // X.AbstractC186377Td
            public final void LJ(boolean z2) {
            }

            @Override // X.AbstractC186377Td
            public final C213218Yj LIZ() {
                return this.LJLILLLLZI;
            }

            {
                CollectionListFragmentForMineProfile collectionListFragmentForMineProfile = new CollectionListFragmentForMineProfile();
                String string = this.LJLJJLL.getString(R.string.pdy);
                o.LJIIIIZZ(string, "context.getString(R.stri…avorites_tab_collections)");
                this.LJLILLLLZI = new C213218Yj(collectionListFragmentForMineProfile, string, "collection", "collections");
            }

            @QD3(threadMode = ThreadMode.MAIN)
            public final void onCollectionChange(C191937g5 e) {
                o.LJIIIZ(e, "e");
                int i = e.LJLIL.operation;
                if (i == 1) {
                    LJFF(this.LJLIL);
                } else {
                    if (i != 2) {
                        return;
                    }
                    LIZIZ(this.LJLIL);
                }
            }
        };
        AbstractC186377Td abstractC186377Td2 = new AbstractC186377Td(this) { // from class: X.7Qa
            public final C213218Yj LJLILLLLZI;

            @Override // X.AbstractC186377Td
            public final C213218Yj LIZ() {
                return this.LJLILLLLZI;
            }

            {
                this.LJLILLLLZI = new C213218Yj(new StickerCollectListFragment(), this.LJJIJIIJIL(R.string.dgk, "tool"), "prop", "effects");
            }

            @QD3(threadMode = ThreadMode.MAIN)
            public final void onStickerCollect(C76P e) {
                o.LJIIIZ(e, "e");
                NewFaceStickerBean newFaceStickerBean = e.LJLIL;
                o.LJIIIIZZ(newFaceStickerBean, "e.stickerBean");
                if (newFaceStickerBean.isFavorite) {
                    LJFF(this.LJLIL);
                } else {
                    LIZIZ(this.LJLIL);
                }
            }
        };
        if (C00F.LIZ(31744, 0, "favorite_reverse", false) != 1) {
            if (videoCollectionFavoriteTab != null) {
                arrayList.add(videoCollectionFavoriteTab);
            }
            arrayList.add(abstractC186377Td);
            z = true;
        } else {
            z = false;
        }
        arrayList.add(new AbstractC186377Td(this, z) { // from class: X.8Yu
            public final HashMap<String, Boolean> LJLILLLLZI = new HashMap<>();
            public final C213218Yj LJLJI;

            @Override // X.AbstractC186377Td
            public final C213218Yj LIZ() {
                return this.LJLJI;
            }

            @Override // X.AbstractC186377Td
            public final void LIZJ(Lifecycle.Event event) {
                o.LJIIIZ(event, "event");
                super.LIZJ(event);
                if (C213318Yt.LIZ[event.ordinal()] == 1) {
                    this.LJLILLLLZI.clear();
                }
            }

            @Override // X.AbstractC186377Td
            public final void LJ(boolean z2) {
                Fragment fragment = this.LJLJI.LIZ;
                o.LJII(fragment, "null cannot be cast to non-null type com.ss.android.ugc.aweme.favorites.business.music.MusicCollectionFragment");
                fragment.setUserVisibleHint(z2);
            }

            @QD3(threadMode = ThreadMode.MAIN)
            public final void onCollectMusicEvent(C213358Yx event) {
                boolean z2;
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
                        String str2 = event.LJLIL;
                        if (event.LJLILLLLZI == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        hashMap.put(str2, Boolean.valueOf(z2));
                    }
                    if (event.LJLILLLLZI == 1) {
                        LJFF(this.LJLIL);
                    } else {
                        LIZIZ(this.LJLIL);
                    }
                }
            }

            @QD3(threadMode = ThreadMode.MAIN)
            public final void onMusicCollect(C72197SVd e) {
                boolean z2;
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
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    hashMap3.put(musicId3, Boolean.valueOf(z2));
                }
                if (e.LJLIL == 1) {
                    LJFF(this.LJLIL);
                } else {
                    LIZIZ(this.LJLIL);
                }
            }

            {
                MusicCollectionFragment musicCollectionFragment = new MusicCollectionFragment();
                musicCollectionFragment.LJLJJI = z;
                this.LJLJI = new C213218Yj(musicCollectionFragment, this.LJJIJIIJIL(R.string.dgp, "music"), "music", "sounds", this.LJLJJLL.getString(R.string.gan));
            }
        });
        if (C00F.LIZ(31744, 0, "favorite_product_after_effect", true) == 2 && (LJJIJ3 = LJJIJ()) != null) {
            arrayList.add(LJJIJ3);
        }
        arrayList.add(abstractC186377Td2);
        FFL.LJIIIZ().getClass();
        if (FFL.LJIIJ(31744, 0, "favorite_product_after_effect", true) == 1 && (LJJIJ2 = LJJIJ()) != null) {
            arrayList.add(LJJIJ2);
        }
        C51556KLg.LIZ.getClass();
        AbstractC186377Td LJJIZ = C51556KLg.LIZ().LJJIZ(activityC45651qj);
        if (LJJIZ != null) {
            arrayList.add(LJJIZ);
        }
        if (C213228Yk.LIZ) {
            arrayList.add(new PlaylistCollectionPage().vl(activityC45651qj));
        }
        C7VQ LIZJ = MovieTokServiceImpl.LJFF().LIZJ(activityC45651qj);
        if (LIZJ != null) {
            arrayList.add(LIZJ);
        }
        C185527Pw LIZLLL = BookTokServiceImpl.LJFF().LIZLLL(activityC45651qj);
        if (LIZLLL != null) {
            arrayList.add(LIZLLL);
        }
        if (C174796tX.LIZ()) {
            arrayList.add(new AbstractC186377Td(this) { // from class: X.7Pt
                public final C213218Yj LJLILLLLZI;

                @Override // X.AbstractC186377Td
                public final C213218Yj LIZ() {
                    return this.LJLILLLLZI;
                }

                {
                    boolean z2;
                    Boolean bool2 = this.LJLJLJ;
                    if (bool2 != null) {
                        z2 = bool2.booleanValue();
                    } else {
                        z2 = false;
                    }
                    CommentCollectListFragment commentCollectListFragment = new CommentCollectListFragment(z2);
                    String string = this.LJLJJLL.getString(R.string.gar);
                    o.LJIIIIZZ(string, "context.getString(R.string.favorites_comment_tab)");
                    this.LJLILLLLZI = new C213218Yj(commentCollectListFragment, string, "comment", "comments");
                }

                @QD3(threadMode = ThreadMode.MAIN)
                public final void omCommentDeleteEvent(C174046sK c174046sK) {
                    if (c174046sK != null && c174046sK.LJLIL == 4 && c174046sK.LJLJJL) {
                        LIZIZ(this.LJLIL);
                    }
                }

                @QD3(threadMode = ThreadMode.MAIN)
                public final void onCommentsCollect(C176166vk e) {
                    o.LJIIIZ(e, "e");
                    if (e.LJLIL.isCollected()) {
                        LJFF(this.LJLIL);
                    } else {
                        LIZIZ(this.LJLIL);
                    }
                }
            });
        }
        AbstractC186377Td LIZJ2 = AddYoursServiceImpl.LJIJ().LIZJ(activityC45651qj);
        if (LIZJ2 != null) {
            arrayList.add(LIZJ2);
        } else if (C213238Yl.LIZ) {
            arrayList.add(new AbstractC186377Td(this) { // from class: X.7Pu
                public final C213218Yj LJLILLLLZI;

                @Override // X.AbstractC186377Td
                public final C213218Yj LIZ() {
                    return this.LJLILLLLZI;
                }

                {
                    QuestionCollectListFragment questionCollectListFragment = new QuestionCollectListFragment();
                    String string = this.LJLJJLL.getString(R.string.pn2);
                    o.LJIIIIZZ(string, "context.getString(R.string.qa_page_tab_questions)");
                    this.LJLILLLLZI = new C213218Yj(questionCollectListFragment, string, "question", "questions");
                }

                @QD3(threadMode = ThreadMode.MAIN)
                public final void onQuestionsCollect(C185517Pv e) {
                    o.LJIIIZ(e, "e");
                    Integer collectStatus = e.LJLIL.getCollectStatus();
                    if (collectStatus == null || collectStatus.intValue() != 1) {
                        LIZIZ(this.LJLIL);
                    } else {
                        LJFF(this.LJLIL);
                    }
                }
            });
        }
        AbstractC186377Td LJ = ChallengeServiceImpl.LJFF().LJ(activityC45651qj, Boolean.FALSE);
        o.LJIIIIZZ(LJ, "get().getService(IChalle…voriteTab(context, false)");
        arrayList.add(LJ);
        FFL.LJIIIZ().getClass();
        if (FFL.LJIIJ(31744, 0, "favorite_product_after_effect", true) == 0 && (LJJIJ = LJJIJ()) != null) {
            arrayList.add(LJJIJ);
        }
    }
}
