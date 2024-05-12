package Y;

import X.ActivityC45651qj;
import X.C03150Al;
import X.C140615fV;
import X.C16530kr;
import X.C188727au;
import X.C1DD;
import X.C1DH;
import X.C34K;
import X.C3C5;
import X.C47261Igj;
import X.C55116Lk8;
import X.C64336PMu;
import X.C71076Ruy;
import X.C71090RvC;
import X.C71362Rza;
import X.C71379Rzr;
import X.C71417S1d;
import X.C71510S4s;
import X.C72440Sbs;
import X.C72808Sho;
import X.C72929Sjl;
import X.C73042Sla;
import X.C73043Slb;
import X.C73044Slc;
import X.C73051Slj;
import X.C73227SoZ;
import X.C73231Sod;
import X.C73305Spp;
import X.C73353Sqb;
import X.C73701SwD;
import X.C74275TDb;
import X.C74499TLr;
import X.C76732zl;
import X.C76800UCe;
import X.C78473Uqz;
import X.C81184Vtc;
import X.C81185Vtd;
import X.ExecutorC142245i8;
import X.ExecutorC73290Spa;
import X.FMX;
import X.InterfaceC55117Lk9;
import X.InterfaceC57784Mm4;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.KL2;
import X.LB1;
import X.MKQ;
import X.RX9;
import X.RunnableC73233Sof;
import X.S08;
import X.S5M;
import X.S5P;
import X.S5S;
import X.SZP;
import X.SZY;
import X.ViewOnClickListenerC74332TFg;
import X.W5F;
import X.W5G;
import X.W5U;
import X.WM7;
import X.X1D;
import X.XJL;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.MultiGuestConnectDistributeQAFragment;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.ies.powerlist.page.PowerPageLoader;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.account.profilebadge.ProfileBadgeServiceImpl;
import com.ss.android.ugc.aweme.commercialize.feed.assem.product.AdProductTileAssem;
import com.ss.android.ugc.aweme.commercialize.feed.assem.product.AdProductTileVM;
import com.ss.android.ugc.aweme.commercialize.model.AdNativeProduct;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpBodyWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpHeadNavBarWidget;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectItem;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectOption;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.viewholder.AbsReviewCellViewHolder;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.card.container.view.biz.vm.DefaultFeedEcCardBizVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BigThumb;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.following.ui.FollowerRelationFragment;
import com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment;
import com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.LiveReplayVideoClipActivity;
import com.ss.android.ugc.aweme.poi.anchor.videoanchor.PoiAnchorElementWidthData;
import com.ss.android.ugc.aweme.profile.ListLiveCircleItemVM;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class ARunnableS31S0200000_12 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;

    public final void LIZ$4() {
        int i;
        int i2;
        int i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        ((S08) this.l1).LIZ(R.id.a3m).measure(makeMeasureSpec, makeMeasureSpec2);
        ((S08) this.l1).LIZ(R.id.a3n).measure(makeMeasureSpec, makeMeasureSpec2);
        ((S08) this.l1).LIZ(R.id.a3l).measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredHeight = ((S08) this.l1).LIZ(R.id.a3n).getMeasuredHeight();
        int width = ((S08) this.l1).LIZ(R.id.a3l).getWidth() + ((S08) this.l1).LIZ(R.id.a3n).getMeasuredWidth();
        View anchor_privilege_div = ((S08) this.l1).LIZ(R.id.a3l);
        o.LJIIIIZZ(anchor_privilege_div, "anchor_privilege_div");
        ViewGroup.LayoutParams layoutParams = anchor_privilege_div.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            i = C16530kr.LIZJ((ViewGroup.MarginLayoutParams) layoutParams);
        } else {
            i = 0;
        }
        int i4 = width + i;
        View anchor_privilege_div2 = ((S08) this.l1).LIZ(R.id.a3l);
        o.LJIIIIZZ(anchor_privilege_div2, "anchor_privilege_div");
        ViewGroup.LayoutParams layoutParams2 = anchor_privilege_div2.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            i2 = C16530kr.LIZIZ((ViewGroup.MarginLayoutParams) layoutParams2);
        } else {
            i2 = 0;
        }
        int measuredWidth = ((S08) this.l1).LIZ(R.id.a3m).getMeasuredWidth() + i4 + i2;
        View anchor_promotion_flow = ((S08) this.l1).LIZ(R.id.a3s);
        o.LJIIIIZZ(anchor_promotion_flow, "anchor_promotion_flow");
        ViewGroup.LayoutParams layoutParams3 = anchor_promotion_flow.getLayoutParams();
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            i3 = C16530kr.LIZJ((ViewGroup.MarginLayoutParams) layoutParams3);
        } else {
            i3 = 0;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new AUListenerS9S0102000_12((S08) this.l1, measuredHeight, measuredWidth + i3, 0));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(((S08) this.l1).LIZ(R.id.a3s), "alpha", 0.0f, 1.0f);
        ofFloat2.setStartDelay(50L);
        ofFloat2.setDuration(300L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.addListener(new IDAListenerS79S0100000_12((S08) this.l1, 7));
        animatorSet.start();
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            case 14:
                run$14(this);
                return;
            case 15:
                run$15(this);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                run$16(this);
                return;
            case 17:
                run$17(this);
                return;
            case 18:
                run$18(this);
                return;
            case 19:
                run$19(this);
                return;
            case 20:
                run$20(this);
                return;
            case 21:
                run$21(this);
                return;
            case 22:
                run$22(this);
                return;
            case 23:
                run$23(this);
                return;
            case 24:
                run$24(this);
                return;
            case 25:
                run$25(this);
                return;
            case 26:
                run$26(this);
                return;
            case 27:
                run$27(this);
                return;
            case 28:
                run$28(this);
                return;
            case 29:
                run$29(this);
                return;
            case 30:
                run$30(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$1() {
        ListLiveCircleItemVM LIZ;
        LB1 lb1;
        User user;
        FollowingRelationFragment followingRelationFragment;
        View _$_findCachedViewById;
        List<Object> list = ((ListState) this.l0).getList();
        FollowListAdapter followListAdapter = ((FollowingRelationFragment) this.l1).LJLLLLLL;
        if (followListAdapter != null) {
            C73227SoZ.LIZ(followListAdapter, list);
            if ((!list.isEmpty()) && (_$_findCachedViewById = (followingRelationFragment = (FollowingRelationFragment) this.l1)._$_findCachedViewById(R.id.j_9)) != null) {
                _$_findCachedViewById.post(new ARunnableS48S0100000_12(followingRelationFragment, 61));
            }
            FollowingRelationFragment followingRelationFragment2 = (FollowingRelationFragment) this.l1;
            List<Object> list2 = ((ListState) this.l0).getList();
            followingRelationFragment2.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if ((obj instanceof LB1) && (lb1 = (LB1) obj) != null && (user = lb1.LJLILLLLZI) != null) {
                    arrayList.add(user);
                }
            }
            C72929Sjl LJIILIIL = LiveOuterService.LJJJLL().LJIILIIL();
            InterfaceC55117Lk9.LJJZ.getClass();
            ActivityC45651qj mo49getActivity = followingRelationFragment2.mo49getActivity();
            LJIILIIL.getClass();
            if (mo49getActivity != null && (LIZ = C55116Lk8.LIZ(1, mo49getActivity)) != null) {
                LIZ.jv0("tiktok_relation_following_living_exit", arrayList);
            }
            C73353Sqb.LIZIZ().LIZ(arrayList);
            return;
        }
        o.LJIJI("mFollowingListAdapter");
        throw null;
    }

    public final void LIZ$2() {
        ListLiveCircleItemVM LIZ;
        LB1 lb1;
        User user;
        FollowListAdapter followListAdapter = ((FollowerRelationFragment) this.l0).LJLLLL;
        if (followListAdapter != null) {
            C73227SoZ.LIZ(followListAdapter, ((ListState) this.l1).getList());
            FollowerRelationFragment followerRelationFragment = (FollowerRelationFragment) this.l0;
            List<Object> list = ((ListState) this.l1).getList();
            followerRelationFragment.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if ((obj instanceof LB1) && (lb1 = (LB1) obj) != null && (user = lb1.LJLILLLLZI) != null) {
                    arrayList.add(user);
                }
            }
            C72929Sjl LJIILIIL = LiveOuterService.LJJJLL().LJIILIIL();
            InterfaceC55117Lk9.LJJZ.getClass();
            ActivityC45651qj mo49getActivity = followerRelationFragment.mo49getActivity();
            LJIILIIL.getClass();
            if (mo49getActivity != null && (LIZ = C55116Lk8.LIZ(2, mo49getActivity)) != null) {
                LIZ.jv0("tiktok_relation_follower_living_exit", arrayList);
            }
            C73353Sqb.LIZ().LIZ(arrayList);
            return;
        }
        o.LJIJI("mFollowerListAdapter");
        throw null;
    }

    public final void LIZ$5() {
        Video video;
        List<BigThumb> bigThumbs;
        Aweme aweme = ((C73701SwD) this.l0).LIZ;
        if (aweme == null || (video = aweme.getVideo()) == null || (bigThumbs = video.getBigThumbs()) == null || bigThumbs.isEmpty()) {
            return;
        }
        C73701SwD c73701SwD = (C73701SwD) this.l0;
        int i = ((RX9) this.l1).LIZIZ;
        Object obj = ListProtector.get(bigThumbs, 0);
        o.LJIIIIZZ(obj, "thumbs[0]");
        BigThumb bigThumb = (BigThumb) obj;
        c73701SwD.getClass();
        W5U.LJIIIIZZ((String) ListProtector.get(bigThumb.getImgUrls(), i)).LJIIIZ(new C64336PMu(c73701SwD, bigThumb, i));
    }

    public final void LIZ$6() {
        Aweme aweme;
        boolean z;
        boolean z2;
        Iterator it = ((List) this.l0).iterator();
        while (true) {
            Aweme aweme2 = null;
            if (!it.hasNext()) {
                break;
            }
            AdNativeProduct adNativeProduct = (AdNativeProduct) it.next();
            if (C72440Sbs.LIZIZ(adNativeProduct.getImageUrl())) {
                AdProductTileAssem adProductTileAssem = (AdProductTileAssem) this.l1;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("add state, index is ");
                LIZ.append(((List) this.l0).indexOf(adNativeProduct));
                X1D.LIZIZ(LIZ);
                adProductTileAssem.getClass();
                C1DH.LJJIJIIJI(new ARunnableS48S0100000_12((AdProductTileAssem) this.l1, 86));
                C72808Sho<InterfaceC57784Mm4> state = ((AdProductTileAssem) this.l1).q4().getState();
                VideoItemParams gv0 = ((AdProductTileAssem) this.l1).u4().gv0();
                if (gv0 != null) {
                    aweme2 = gv0.getAweme();
                }
                if (((List) this.l0).indexOf(adNativeProduct) == ((List) this.l0).size() - 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int indexOf = ((List) this.l0).indexOf(adNativeProduct);
                AdProductTileAssem adProductTileAssem2 = (AdProductTileAssem) this.l1;
                String productId = adNativeProduct.getProductId();
                int indexOf2 = ((List) this.l0).indexOf(adNativeProduct);
                adProductTileAssem2.getClass();
                state.LIZJ(new S5M(adNativeProduct, aweme2, z2, indexOf, new S5S(adProductTileAssem2, productId, indexOf2)));
                ((AdProductTileAssem) this.l1).LLI++;
            }
        }
        AdProductTileVM u4 = ((AdProductTileAssem) this.l1).u4();
        int i = ((AdProductTileAssem) this.l1).LLI;
        int size = ((List) this.l0).size();
        u4.getClass();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ(WM7.SCENE_SERVICE, "AdPlp");
        c188727au.LIZLLL(i, "preload_count");
        c188727au.LIZLLL(size, "total_count");
        FMX.LJIIL("product_tile_product_preload_success_count", c188727au.LIZ);
        AdProductTileAssem adProductTileAssem3 = (AdProductTileAssem) this.l1;
        adProductTileAssem3.LLIFFJFJJ = (int) KL2.LIZJ(adProductTileAssem3.getContext(), (adProductTileAssem3.LLI * 56.0f) - 4);
        AdProductTileAssem adProductTileAssem4 = (AdProductTileAssem) this.l1;
        if (adProductTileAssem4.LLI < 3) {
            adProductTileAssem4.u4().getClass();
            C188727au c188727au2 = new C188727au();
            c188727au2.LJIIIZ(WM7.SCENE_SERVICE, "AdPlp");
            FMX.LJIIL("product_tile_preload_fail", c188727au2.LIZ);
            ((AdProductTileAssem) this.l1).q4().getState().LJFF();
            for (AdNativeProduct adNativeProduct2 : (List) this.l0) {
                AdProductTileAssem adProductTileAssem5 = (AdProductTileAssem) this.l1;
                String productId2 = adNativeProduct2.getProductId();
                int indexOf3 = ((List) this.l0).indexOf(adNativeProduct2);
                adProductTileAssem5.getClass();
                S5S s5s = new S5S(adProductTileAssem5, productId2, indexOf3);
                if (C72440Sbs.LIZIZ(adNativeProduct2.getImageUrl())) {
                    AdProductTileAssem adProductTileAssem6 = (AdProductTileAssem) this.l1;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("add state, index is ");
                    LIZ2.append(((List) this.l0).indexOf(adNativeProduct2));
                    X1D.LIZIZ(LIZ2);
                    adProductTileAssem6.getClass();
                    C72808Sho<InterfaceC57784Mm4> state2 = ((AdProductTileAssem) this.l1).q4().getState();
                    VideoItemParams gv02 = ((AdProductTileAssem) this.l1).u4().gv0();
                    if (gv02 != null) {
                        aweme = gv02.getAweme();
                    } else {
                        aweme = null;
                    }
                    if (((List) this.l0).indexOf(adNativeProduct2) == ((List) this.l0).size() - 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    state2.LIZJ(new S5M(adNativeProduct2, aweme, z, ((List) this.l0).indexOf(adNativeProduct2), s5s));
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    W5F LJIIIIZZ = W5U.LJIIIIZZ(adNativeProduct2.getImageUrl());
                    int LIZJ = (int) KL2.LIZJ(((AdProductTileAssem) this.l1).getContext(), 52.0f);
                    int LIZJ2 = (int) KL2.LIZJ(((AdProductTileAssem) this.l1).getContext(), 52.0f);
                    LJIIIIZZ.LJII = LIZJ;
                    LJIIIIZZ.LJIIIIZZ = LIZJ2;
                    LJIIIIZZ.LIZJ = ((AdProductTileAssem) this.l1).getContext();
                    LJIIIIZZ.LJIIIZ(new S5P((List) this.l0, adNativeProduct2, (AdProductTileAssem) this.l1, currentTimeMillis, s5s));
                }
            }
        }
    }

    public final void LIZ$7() {
        int i;
        int i2;
        C71417S1d c71417S1d = (C71417S1d) this.l0;
        PoiAnchorElementWidthData poiAnchorElementWidthData = c71417S1d.LL;
        int LJIILIIL = C71417S1d.LJIILIIL(c71417S1d.LJLJLLL, false);
        int LJIILIIL2 = C71417S1d.LJIILIIL(((C71417S1d) this.l0).LJLLI, false);
        int LJIILIIL3 = C71417S1d.LJIILIIL(((C71417S1d) this.l0).LJLLILLLL, false);
        ViewGroup viewGroup = ((C71417S1d) this.l0).LJLLILLLL;
        if (viewGroup != null && viewGroup.getVisibility() == 0) {
            i = viewGroup.getPaddingRight() + viewGroup.getPaddingLeft();
        } else {
            i = 0;
        }
        int i3 = LJIILIIL3 - i;
        int LJIILIIL4 = C71417S1d.LJIILIIL(((C71417S1d) this.l0).LJLLL, false);
        int LJIILIIL5 = C71417S1d.LJIILIIL(((C71417S1d) this.l0).LJLLLLLL, false);
        int LJIILIIL6 = C71417S1d.LJIILIIL(((C71417S1d) this.l0).LJLLJ, false);
        ViewGroup viewGroup2 = ((C71417S1d) this.l0).LJLLJ;
        if (viewGroup2 != null && viewGroup2.getVisibility() == 0) {
            i2 = viewGroup2.getPaddingRight() + viewGroup2.getPaddingLeft();
        } else {
            i2 = 0;
        }
        c71417S1d.LL = PoiAnchorElementWidthData.copy$default(poiAnchorElementWidthData, 0, 0, 0, 0, LJIILIIL, 0, LJIILIIL2, i3, LJIILIIL4, 0, LJIILIIL5, LJIILIIL6 - i2, 559, null);
        XJL xjl = (XJL) this.l1;
        C76800UCe c76800UCe = C76800UCe.LIZ;
        C3C5.m7constructorimpl(c76800UCe);
        xjl.resumeWith(c76800UCe);
    }

    public final void LIZ$8() {
        List<ReviewAspectItem> list;
        String str;
        if (((AbsReviewCellViewHolder) this.l0)._$_findCachedViewById(R.id.mf7).getParent() != null) {
            StringBuilder sb = new StringBuilder();
            TextPaint paint = ((TextView) ((AbsReviewCellViewHolder) this.l0)._$_findCachedViewById(R.id.mhz)).getPaint();
            int measuredWidth = ((AbsReviewCellViewHolder) this.l0)._$_findCachedViewById(R.id.mf7).getMeasuredWidth();
            ReviewItemStruct.MainReview mainReview = ((ReviewItemStruct) this.l1).review;
            if (mainReview != null && (list = mainReview.reviewAspectItems) != null) {
                int i = 0;
                for (ReviewAspectItem reviewAspectItem : list) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        ReviewAspectOption reviewAspectOption = reviewAspectItem.answer;
                        if (reviewAspectOption == null || (str = reviewAspectOption.optionText) == null) {
                            str = "";
                        }
                        if (i == 0) {
                            sb.append(str);
                        } else {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append((Object) sb);
                            LIZ.append(" · ");
                            LIZ.append(str);
                            if (paint.measureText(X1D.LIZIZ(LIZ)) <= measuredWidth) {
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append(" · ");
                                LIZ2.append(str);
                                sb.append(X1D.LIZIZ(LIZ2));
                            }
                        }
                        i = i2;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
            ((TextView) ((AbsReviewCellViewHolder) this.l0)._$_findCachedViewById(R.id.mhz)).setText(sb);
        }
    }

    public final void LIZ$0() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("measureHeight = ");
        LIZ.append(((View) this.l0).getMeasuredHeight());
        LIZ.append(" maxheight = ");
        ((MultiGuestConnectDistributeQAFragment) this.l1).getClass();
        C1DD.LJFF(LIZ, (int) (C81185Vtd.LIZIZ() * 0.6f), LIZ, "ConnectStatusDistribute_MultiGuestConnectDistributeQAFragment");
        int measuredHeight = ((View) this.l0).getMeasuredHeight();
        ((MultiGuestConnectDistributeQAFragment) this.l1).getClass();
        if (measuredHeight > ((int) (C81185Vtd.LIZIZ() * 0.6f))) {
            View view = (View) this.l0;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ((MultiGuestConnectDistributeQAFragment) this.l1).getClass();
            layoutParams.height = (int) (C81185Vtd.LIZIZ() * 0.6f);
            view.setLayoutParams(layoutParams);
        }
    }

    public final void LIZ$3() {
        int i;
        int i2;
        ViewGroup.LayoutParams layoutParams;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(1073741823, LiveLayoutPreloadThreadPriority.DEFAULT);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(1073741823, LiveLayoutPreloadThreadPriority.DEFAULT);
        TextView textView = ((ViewOnClickListenerC74332TFg) this.l0).LJLJJI;
        if (textView != null) {
            textView.measure(makeMeasureSpec, makeMeasureSpec2);
        }
        W5G w5g = ((ViewOnClickListenerC74332TFg) this.l0).LJLILLLLZI;
        if (w5g != null && (layoutParams = w5g.getLayoutParams()) != null) {
            i = layoutParams.width;
        } else {
            i = -1;
        }
        TextView textView2 = ((ViewOnClickListenerC74332TFg) this.l0).LJLJJI;
        if (textView2 != null) {
            i2 = textView2.getMeasuredWidth();
        } else {
            i2 = -1;
        }
        if (i != -1 && i2 != -1) {
            int LJ = (int) (((C81184Vtc.LJ((Context) this.l1) - i) - i2) - C74275TDb.LIZIZ((Context) this.l1, 106));
            TextView textView3 = ((ViewOnClickListenerC74332TFg) this.l0).LJLJI;
            if (textView3 != null) {
                textView3.setMaxWidth(LJ);
            }
        }
    }

    public static final void run$0(ARunnableS31S0200000_12 aRunnableS31S0200000_12) {
        boolean LIZ;
        try {
            C71510S4s c71510S4s = (C71510S4s) aRunnableS31S0200000_12.l0;
            c71510S4s.LJLLI = 0;
            c71510S4s.LJLIL = (Rect) aRunnableS31S0200000_12.l1;
            c71510S4s.LJLJLLL.start();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS31S0200000_12 aRunnableS31S0200000_12) {
        boolean LIZ;
        try {
            aRunnableS31S0200000_12.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS31S0200000_12 aRunnableS31S0200000_12) {
        boolean LIZ;
        try {
            ExecutorC142245i8.LJLILLLLZI.execute(new ARunnableS31S0200000_12((Bitmap) aRunnableS31S0200000_12.l1, (View) aRunnableS31S0200000_12.l0, 9));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(ARunnableS31S0200000_12 aRunnableS31S0200000_12) {
        boolean LIZ;
        try {
            ((C140615fV) ((View) aRunnableS31S0200000_12.l0).findViewById(R.id.dib)).setFlashSaleBg((Bitmap) aRunnableS31S0200000_12.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(ARunnableS31S0200000_12 aRunnableS31S0200000_12) {
        boolean LIZ;
        try {
            ExecutorC142245i8.LJLILLLLZI.execute(new ARunnableS31S0200000_12((Bitmap) aRunnableS31S0200000_12.l1, (View) aRunnableS31S0200000_12.l0, 11));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$13(ARunnableS31S0200000_12 aRunnableS31S0200000_12) {
        boolean LIZ;
        try {
            ((PdpHeadNavBarWidget) aRunnableS31S0200000_12.l0).bindSearchBox((Context) aRunnableS31S0200000_12.l1);
            PdpViewModel viewModel = ((PdpHeadNavBarWidget) aRunnableS31S0200000_12.l0).getViewModel();
            AqS178S0100000_12 aqS178S0100000_12 = new AqS178S0100000_12((PdpHeadNavBarWidget) aRunnableS31S0200000_12.l0, 142);
            viewModel.getClass();
            viewModel.withState(aqS178S0100000_12);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$14(ARunnableS31S0200000_12 aRunnableS31S0200000_12) {
        boolean LIZ;
        try {
            ((PdpBodyWidget) aRunnableS31S0200000_12.l0).trackImpression((MKQ) aRunnableS31S0200000_12.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$15(ARunnableS31S0200000_12 aRunnableS31S0200000_12) {
        boolean LIZ;
        try {
            C73042Sla.LIZ((TextureView) ((C73044Slc) aRunnableS31S0200000_12.l0).LJ(R.id.n8n), (C73043Slb) aRunnableS31S0200000_12.l1, ((C73044Slc) aRunnableS31S0200000_12.l0).LJLLILLLL);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$16(ARunnableS31S0200000_12 aRunnableS31S0200000_12) {
        boolean LIZ;
        try {
            LiveOuterService.LJJJLL().LJJJIL();
            Boolean LIZ2 = C78473Uqz.LIZ();
            if ((LIZ2 == null || !LIZ2.booleanValue()) && !((LiveReplayVideoClipActivity) aRunnableS31S0200000_12.l0).LJLLLLLL) {
                ((C73051Slj) aRunnableS31S0200000_12.l1).LJ();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$17(ARunnableS31S0200000_12 aRunnableS31S0200000_12) {
        boolean LIZ;
        try {
            aRunnableS31S0200000_12.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$18(ARunnableS31S0200000_12 aRunnableS31S0200000_12) {
        boolean LIZ;
        try {
            aRunnableS31S0200000_12.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$19(ARunnableS31S0200000_12 aRunnableS31S0200000_12) {
        boolean LIZ;
        try {
            ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel = ((C71362Rza) aRunnableS31S0200000_12.l0).LIZLLL;
            if (eCommerceAnchorPanelViewModel != null) {
                List<C71379Rzr> items = (List) aRunnableS31S0200000_12.l1;
                o.LJIIIZ(items, "items");
                eCommerceAnchorPanelViewModel.LJLLJ.setValue(items);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS31S0200000_12 aRunnableS31S0200000_12) {
        boolean LIZ;
        try {
            ((PowerPageLoader) aRunnableS31S0200000_12.l0).LJ().LIZ(SZY.End, (SZP) aRunnableS31S0200000_12.l1, null);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$20(ARunnableS31S0200000_12 aRunnableS31S0200000_12) {
        boolean LIZ;
        try {
            if (((TuxIconView) aRunnableS31S0200000_12.l0).getViewTreeObserver().isAlive()) {
                ((TuxIconView) aRunnableS31S0200000_12.l0).getViewTreeObserver().removeOnDrawListener((ViewTreeObserver.OnDrawListener) aRunnableS31S0200000_12.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$21(ARunnableS31S0200000_12 aRunnableS31S0200000_12) {
        boolean LIZ;
        try {
            aRunnableS31S0200000_12.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$22(ARunnableS31S0200000_12 aRunnableS31S0200000_12) {
        boolean LIZ;
        try {
            RunnableC73233Sof runnableC73233Sof = (RunnableC73233Sof) aRunnableS31S0200000_12.l0;
            C73231Sod c73231Sod = runnableC73233Sof.LJLIL;
            if (c73231Sod.LIZIZ == runnableC73233Sof.LJLJJI) {
                List<? extends T> list = runnableC73233Sof.LJLJI;
                C03150Al c03150Al = (C03150Al) aRunnableS31S0200000_12.l1;
                InterfaceC65784Pro interfaceC65784Pro = runnableC73233Sof.LJLJJL;
                c73231Sod.LIZJ = list;
                c03150Al.LIZIZ(c73231Sod.LIZLLL);
                if (interfaceC65784Pro != null) {
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$23(ARunnableS31S0200000_12 aRunnableS31S0200000_12) {
        boolean LIZ;
        try {
            try {
                ((Runnable) aRunnableS31S0200000_12.l1).run();
                ((ExecutorC73290Spa) aRunnableS31S0200000_12.l0).LIZ();
            } catch (Throwable th) {
                ((ExecutorC73290Spa) aRunnableS31S0200000_12.l0).LIZ();
                throw th;
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$24(ARunnableS31S0200000_12 aRunnableS31S0200000_12) {
        boolean LIZ;
        try {
            View view = ((C74499TLr) aRunnableS31S0200000_12.l0).LJLLILLLL;
            if (view != null) {
                view.setVisibility(((C76732zl) aRunnableS31S0200000_12.l1).element);
            } else {
                o.LJIJI("shadowView");
                throw null;
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$25(ARunnableS31S0200000_12 aRunnableS31S0200000_12) {
        boolean LIZ;
        try {
            aRunnableS31S0200000_12.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$26(ARunnableS31S0200000_12 aRunnableS31S0200000_12) {
        boolean LIZ;
        try {
            aRunnableS31S0200000_12.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$27(ARunnableS31S0200000_12 aRunnableS31S0200000_12) {
        boolean LIZ;
        try {
            aRunnableS31S0200000_12.LIZ$6();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$28(ARunnableS31S0200000_12 aRunnableS31S0200000_12) {
        boolean LIZ;
        List<? extends Object> list;
        try {
            C71076Ruy c71076Ruy = (C71076Ruy) aRunnableS31S0200000_12.l0;
            if (c71076Ruy != null && (list = c71076Ruy.LIZLLL) != null) {
                ((DefaultFeedEcCardBizVM) aRunnableS31S0200000_12.l1).setState(new AqS143S0200000_12(c71076Ruy, (C71076Ruy) list, (List<? extends Object>) 107));
            } else {
                ((DefaultFeedEcCardBizVM) aRunnableS31S0200000_12.l1).setState(C71090RvC.LJLIL);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$29(ARunnableS31S0200000_12 aRunnableS31S0200000_12) {
        boolean LIZ;
        try {
            aRunnableS31S0200000_12.LIZ$7();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS31S0200000_12 aRunnableS31S0200000_12) {
        boolean LIZ;
        try {
            ((InterfaceC88472Yns) aRunnableS31S0200000_12.l0).invoke((C73305Spp) aRunnableS31S0200000_12.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$30(ARunnableS31S0200000_12 aRunnableS31S0200000_12) {
        boolean LIZ;
        try {
            aRunnableS31S0200000_12.LIZ$8();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS31S0200000_12 aRunnableS31S0200000_12) {
        boolean LIZ;
        try {
            ((ProfileBadgeServiceImpl) aRunnableS31S0200000_12.l0).safeUpdateIsShowListeners(true, (ProfileBadgeStruct) aRunnableS31S0200000_12.l1);
            ((ProfileBadgeServiceImpl) aRunnableS31S0200000_12.l0).safeUpdateIdListeners(true, (ProfileBadgeStruct) aRunnableS31S0200000_12.l1);
            ((ProfileBadgeServiceImpl) aRunnableS31S0200000_12.l0).safeUpdateListeners((ProfileBadgeStruct) aRunnableS31S0200000_12.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS31S0200000_12 aRunnableS31S0200000_12) {
        boolean LIZ;
        try {
            if (!((C34K) aRunnableS31S0200000_12.l0).element) {
                ((View) aRunnableS31S0200000_12.l1).setEnabled(true);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS31S0200000_12 aRunnableS31S0200000_12) {
        boolean LIZ;
        try {
            ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel = (ECommerceAnchorPanelViewModel) aRunnableS31S0200000_12.l0;
            List<C71379Rzr> items = (List) aRunnableS31S0200000_12.l1;
            eCommerceAnchorPanelViewModel.getClass();
            o.LJIIIZ(items, "items");
            eCommerceAnchorPanelViewModel.LJLLJ.setValue(items);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS31S0200000_12 aRunnableS31S0200000_12) {
        boolean LIZ;
        try {
            ((C140615fV) ((View) aRunnableS31S0200000_12.l0).findViewById(R.id.dib)).setFlashSaleBg((Bitmap) aRunnableS31S0200000_12.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS31S0200000_12 aRunnableS31S0200000_12) {
        boolean LIZ;
        try {
            ExecutorC142245i8.LJLILLLLZI.execute(new ARunnableS31S0200000_12((Bitmap) aRunnableS31S0200000_12.l1, (View) aRunnableS31S0200000_12.l0, 7));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS31S0200000_12 aRunnableS31S0200000_12) {
        boolean LIZ;
        try {
            ((C140615fV) ((View) aRunnableS31S0200000_12.l0).findViewById(R.id.dib)).setFlashSaleBg((Bitmap) aRunnableS31S0200000_12.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS31S0200000_12(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
