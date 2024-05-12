package com.ss.android.ugc.aweme.ui.fragment;

import X.AV1;
import X.AbstractC51036K1g;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C174046sK;
import X.C174086sO;
import X.C174366sq;
import X.C174566tA;
import X.C176176vl;
import X.C176376w5;
import X.C176456wD;
import X.C176486wG;
import X.C176516wJ;
import X.C176996x5;
import X.C177156xL;
import X.C1807677o;
import X.C184077Kh;
import X.C184387Lm;
import X.C188727au;
import X.C191467fK;
import X.C201467vS;
import X.C203007xw;
import X.C2059186h;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C27740Aue;
import X.C29S;
import X.C33Q;
import X.C38619FDr;
import X.C3C5;
import X.C3C8;
import X.C56412MCa;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C66472jD;
import X.C71Y;
import X.C73210SoI;
import X.C73305Spp;
import X.C74Z;
import X.C76800UCe;
import X.C77123UOp;
import X.C77321UWf;
import X.C78926UyI;
import X.C79045V0n;
import X.C80S;
import X.C81M;
import X.C8YZ;
import X.C90903hW;
import X.EnumC201127uu;
import X.FMX;
import X.InterfaceC174016sH;
import X.InterfaceC1807877q;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC223218pR;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KL2;
import X.KPL;
import X.OSK;
import X.OSL;
import X.OSM;
import X.OSZ;
import X.QD3;
import X.TBW;
import X.W5F;
import X.XKX;
import Y.ACListenerS38S0200000_3;
import Y.AObserverS71S0100000_3;
import Y.ARunnableS39S0100000_3;
import Y.IDrS43S0100000_3;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.model.PostModeEntranceMechanism;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeContainerViewModel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS60S0110000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class PostModeCommentListFragment extends CommentListFragment implements InterfaceC1807877q, KPL {
    public static final /* synthetic */ int LLLZZIL = 0;
    public final C214378bB LLLLZLL;
    public int LLLLZLLIL;
    public PostModeDetailParams LLLLZLLLI;
    public boolean LLLZ;
    public C73210SoI LLLZI;
    public View LLLZIIL;
    public View LLLZIL;
    public ConstraintLayout LLLZL;
    public View LLLZLL;
    public C73305Spp LLLZLZ;
    public final Map<Integer, View> LLLZZ = new LinkedHashMap();
    public final C62822Ol8 LLLLZIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1141));

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLLZZ).clear();
    }

    @Override // com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment
    public final void dp() {
        C27740Aue.LJIIJ(false, this.LLJI, this.LJLJLJ, this.LJLJLLL);
    }

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment, X.InterfaceC177046xA
    public final String getFromPage() {
        return "graphic_detail";
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment
    public final boolean sm() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment
    public final void so() {
    }

    public PostModeCommentListFragment() {
        AqS60S0110000_3 LJJ;
        C65776Prg LIZ = C65352Pkq.LIZ(PhotoSharedViewModel.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3((Fragment) this, 1671);
        C1807677o c1807677o = C1807677o.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJJ = C78926UyI.LJJ(this, false);
        } else {
            LJJ = C78926UyI.LJJ(this, true);
        }
        this.LLLLZLL = new C214378bB(LIZ, aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c1807677o, LJJ, C78926UyI.LJIILLIIL(this, true));
    }

    @Override // com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment
    public final void Bo() {
        Integer num;
        boolean z;
        int i;
        ConstraintLayout constraintLayout = this.LLLZL;
        if (constraintLayout != null) {
            num = Integer.valueOf(constraintLayout.getVisibility());
        } else {
            num = null;
        }
        if (this.LLLIIIIL == null) {
            C73210SoI c73210SoI = this.LLLZI;
            if (c73210SoI != null) {
                c73210SoI.LLF(this.LLLZL);
            }
            z = true;
        } else {
            z = false;
        }
        super.Bo();
        if (z) {
            Ql(this.LLLZI);
            ConstraintLayout constraintLayout2 = this.LLLZL;
            if (constraintLayout2 == null) {
                return;
            }
            if (num != null) {
                i = num.intValue();
            } else {
                i = 8;
            }
            constraintLayout2.setVisibility(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment
    public final boolean Do() {
        User author;
        Integer valueOf;
        int intValue;
        if (C81M.LIZ(Integer.valueOf(this.LJLILLLLZI.getPageType())) && (valueOf = Integer.valueOf(this.LJLILLLLZI.getPageType())) != null) {
            if (valueOf.intValue() == 1000) {
                intValue = ((Number) C176516wJ.LIZ.getValue()).intValue();
            } else if (valueOf.intValue() == 2000 || valueOf.intValue() == 4000) {
                intValue = ((Number) C176486wG.LIZ.getValue()).intValue();
            }
            if (intValue > 0) {
                return true;
            }
        }
        if (((Boolean) C176456wD.LIZ.getValue()).booleanValue()) {
            PostModeDetailParams postModeDetailParams = this.LLLLZLLLI;
            String str = null;
            if (postModeDetailParams != null) {
                if (postModeDetailParams.postModeEntranceMechanism != PostModeEntranceMechanism.EXPLORE_CARD) {
                    Aweme aweme = this.LJLJI;
                    if (aweme != null && (author = aweme.getAuthor()) != null) {
                        str = author.getUid();
                    }
                    if (!o.LJ(str, AV1.LIZIZ().getUid())) {
                        return true;
                    }
                }
            } else {
                o.LJIJI("postModeDetailParams");
                throw null;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment, X.InterfaceC174486t2
    public final void E4() {
        View view;
        View view2 = this.LLLZIIL;
        View view3 = null;
        if (view2 != null) {
            view = view2.findViewById(R.id.hzn);
            if (view != null) {
                view3 = view.findViewById(R.id.hz_);
            }
        } else {
            view = null;
        }
        if (view3 != null) {
            C71Y.LIZLLL("PostModeCommentListFragment", "remove the disable comment view");
            view3.setVisibility(8);
            view.setVisibility(8);
            return;
        }
        C71Y.LIZLLL("PostModeCommentListFragment", "disable comment view not exist");
    }

    @Override // X.InterfaceC1807877q
    public final boolean Kg() {
        View view = this.LLLZIL;
        if (view != null && view.getVisibility() == 0) {
            PostModeDetailParams postModeDetailParams = this.LLLLZLLLI;
            if (postModeDetailParams != null) {
                if (postModeDetailParams.hasNextFeed) {
                    return true;
                }
            } else {
                o.LJIJI("postModeDetailParams");
                throw null;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment
    public final void Nl() {
        Integer num;
        boolean z;
        int i;
        ConstraintLayout constraintLayout = this.LLLZL;
        if (constraintLayout != null) {
            num = Integer.valueOf(constraintLayout.getVisibility());
        } else {
            num = null;
        }
        ConstraintLayout constraintLayout2 = this.LLLZL;
        if (constraintLayout2 != null) {
            C73210SoI c73210SoI = this.LLLZI;
            if (c73210SoI != null) {
                c73210SoI.LLF(constraintLayout2);
            }
            z = true;
        } else {
            z = false;
        }
        super.Nl();
        if (z) {
            Ql(this.LLLZI);
            ConstraintLayout constraintLayout3 = this.LLLZL;
            if (constraintLayout3 == null) {
                return;
            }
            if (num != null) {
                i = num.intValue();
            } else {
                i = 8;
            }
            constraintLayout3.setVisibility(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment, X.InterfaceC177046xA
    public final boolean checkCommentInputable() {
        PostModeContainerViewModel op;
        MutableLiveData<Boolean> mutableLiveData;
        if (C80S.LJFF(this.LJLJI) && (op = op()) != null && (mutableLiveData = op.LLIIIL) != null) {
            mutableLiveData.postValue(Boolean.TRUE);
        }
        return super.checkCommentInputable();
    }

    @Override // com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment, X.InterfaceC177046xA
    public final int getCommentInputViewType() {
        C176996x5 c176996x5 = this.LLIZ;
        if (c176996x5 != null && c176996x5.LJI()) {
            return 10;
        }
        return super.getCommentInputViewType();
    }

    public final PostModeContainerViewModel op() {
        return (PostModeContainerViewModel) this.LLLLZIL.getValue();
    }

    public final void rp() {
        if (((C176376w5) this.LLILIL.LJLIL).LJIILLIIL()) {
            View view = this.LLLZLL;
            if (view != null && view.getVisibility() == 0) {
                return;
            }
            View view2 = this.LLLZLL;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            Aweme aweme = this.LJLJI;
            PostModeDetailParams postModeDetailParams = this.LLLLZLLLI;
            if (postModeDetailParams != null) {
                long j = ((CommentItemList) this.LLILIL.LJLIL.getData()).total;
                C188727au c188727au = new C188727au();
                C201467vS.LIZJ(c188727au, postModeDetailParams);
                C201467vS.LIZLLL(c188727au, aweme);
                c188727au.LJI("from_page", "graphic_detail");
                C201467vS.LIZIZ(c188727au, aweme);
                c188727au.LJ(j, "total_comment_cnt");
                FMX.LJIIL("show_more_comment_button", c188727au.LIZ);
                return;
            }
            o.LJIJI("postModeDetailParams");
            throw null;
        }
        View view3 = this.LLLZLL;
        if (view3 == null) {
            return;
        }
        view3.setVisibility(8);
    }

    public final void sp() {
        AwemeStatistics statistics;
        Aweme aweme = this.LJLJI;
        if (aweme != null && (statistics = aweme.getStatistics()) != null) {
            long commentCount = statistics.getCommentCount();
            if (commentCount != 0 && getContext() != null) {
                String quantityString = getResources().getQuantityString(R.plurals.cb, (int) commentCount, C77123UOp.LJJIIJ(commentCount), Long.valueOf(commentCount));
                o.LJIIIIZZ(quantityString, "this.resources.getQuanti…  commentCount,\n        )");
                fp(quantityString, commentCount);
                return;
            }
        }
        fp("", 0L);
    }

    @Override // com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment
    public final void Ao() {
        super.Ao();
        RecyclerView recyclerView = this.LLFII;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        View view = this.LLLZIL;
        if (view == null) {
            return;
        }
        view.setVisibility(0);
    }

    @Override // com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment, X.InterfaceC223218pR
    public final void Ne() {
        super.Ne();
        sp();
        C176996x5 c176996x5 = this.LLIZ;
        if (c176996x5 != null) {
            c176996x5.LLD = 0;
        }
        View view = this.LLLZIL;
        if (view != null) {
            view.setVisibility(0);
        }
        this.LLLZ = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void np() {
        /*
            r11 = this;
            android.content.Context r0 = r11.requireContext()
            android.view.LayoutInflater r3 = X.C16880lQ.LLZIL(r0)
            android.view.View r2 = r11.getView()
            boolean r0 = r2 instanceof android.view.ViewGroup
            r6 = 0
            if (r0 == 0) goto Lb0
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
        L13:
            r1 = 0
            r0 = 2131562116(0x7f0d0e84, float:1.8749652E38)
            android.view.View r1 = X.C16880lQ.LLLLIILL(r3, r0, r2, r1)
            boolean r0 = r1 instanceof android.widget.FrameLayout
            if (r0 == 0) goto Lad
        L1f:
            r11.LLLZIIL = r1
            android.content.Context r10 = r11.requireContext()
            android.view.View r9 = r11.LLLZIIL
            boolean r0 = r9 instanceof android.widget.FrameLayout
            if (r0 == 0) goto La6
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            if (r9 == 0) goto La6
            X.1qj r8 = r11.requireActivity()
            boolean r0 = r8 instanceof com.ss.android.ugc.aweme.ui.activity.PostModeDetailActivity
            if (r0 == 0) goto La6
            com.ss.android.ugc.aweme.ui.activity.PostModeDetailActivity r8 = (com.ss.android.ugc.aweme.ui.activity.PostModeDetailActivity) r8
            if (r8 == 0) goto La6
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIIZZ(r10, r0)
            com.ss.android.ugc.aweme.ui.fragment.PostModeDetailPageFragment r0 = r8.LJLJI
            java.lang.String r5 = "PostModeCrash"
            r4 = 4
            if (r0 == 0) goto L86
            X.84I r0 = r0.LJLJL
            if (r0 == 0) goto Lab
            androidx.viewpager.widget.PagerAdapter r1 = r0.getAdapter()
        L4f:
            boolean r0 = r1 instanceof X.C54297LSr
            if (r0 == 0) goto L86
            X.LSr r1 = (X.C54297LSr) r1
            if (r1 == 0) goto L86
            java.lang.String r0 = "PostModeDetailFragment"
            com.ss.android.ugc.aweme.base.ui.CommonPageFragment r7 = r1.LJJIII(r0)
            boolean r0 = r7 instanceof com.ss.android.ugc.aweme.ui.fragment.PostModeDetailFragment
            if (r0 == 0) goto La7
            com.ss.android.ugc.aweme.ui.fragment.PostModeDetailFragment r7 = (com.ss.android.ugc.aweme.ui.fragment.PostModeDetailFragment) r7
            if (r7 == 0) goto La7
            X.7uS r3 = r7.LJLJL
            if (r3 == 0) goto L81
            X.7qG r2 = new X.7qG
            com.ss.android.ugc.aweme.ui.feed.photos.PostModeFullPageViewModel r0 = r7.Dl()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r1 = r0.LJLLI
            com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel r0 = r7.Al()
            r2.<init>(r10, r1, r0, r3)
            r7.LJLLLL = r2
            r9.addView(r2)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L86
        L81:
            java.lang.String r0 = "postmodemodel  is null"
            X.C36922EeM.LIZLLL(r4, r5, r0)
        L86:
            com.ss.android.ugc.aweme.ui.fragment.PostModeDetailPageFragment r0 = r8.LJLJI
            if (r0 != 0) goto L8f
            java.lang.String r0 = "postmodedetailpagefragment is null"
            X.C36922EeM.LIZLLL(r4, r5, r0)
        L8f:
            com.ss.android.ugc.aweme.ui.fragment.PostModeDetailPageFragment r0 = r8.LJLJI
            if (r0 == 0) goto L9b
            X.84I r0 = r0.LJLJL
            if (r0 == 0) goto L9b
            androidx.viewpager.widget.PagerAdapter r6 = r0.getAdapter()
        L9b:
            boolean r0 = r6 instanceof X.C54297LSr
            if (r0 == 0) goto La1
            if (r6 != 0) goto La6
        La1:
            java.lang.String r0 = "viewpager adapter is null"
            X.C36922EeM.LIZLLL(r4, r5, r0)
        La6:
            return
        La7:
            r8.finish()
            goto L86
        Lab:
            r1 = r6
            goto L4f
        Lad:
            r1 = r6
            goto L1f
        Lb0:
            r2 = r6
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragment.np():void");
    }

    @Override // com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment
    public final Map<String, Object> xm() {
        int i;
        PhotoModeImageInfo photoModeImageInfo;
        String title;
        Map<String, Object> xm = super.xm();
        xm.put("from_page", "graphic_detail");
        Aweme aweme = this.LJLJI;
        if (aweme == null || (photoModeImageInfo = aweme.getPhotoModeImageInfo()) == null || (title = photoModeImageInfo.getTitle()) == null || title.length() == 0) {
            i = 1;
        } else {
            i = 0;
        }
        xm.put("has_title", Integer.valueOf(i ^ 1));
        return xm;
    }

    public static final /* synthetic */ void kp(PostModeCommentListFragment postModeCommentListFragment) {
        super.so();
    }

    public static final /* synthetic */ void mp(PostModeCommentListFragment postModeCommentListFragment) {
        super.dp();
    }

    @Override // com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment
    public final InterfaceC174016sH Pm(View view) {
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        C73305Spp c73305Spp = new C73305Spp(requireContext, null, 6);
        this.LLLZLZ = c73305Spp;
        return new C174566tA(c73305Spp) { // from class: X.6tB
            @Override // X.C174566tA, X.InterfaceC174016sH
            public final void setVisibility(int i) {
                View view2;
                View view3;
                if (i == 4 || i == 8) {
                    if (this.LIZ.getParent() != null) {
                        Object parent = this.LIZ.getParent();
                        if ((parent instanceof View) && (view2 = (View) parent) != null) {
                            view2.setVisibility(8);
                        }
                        super.setVisibility(i);
                        return;
                    }
                } else if (i == 0 && this.LIZ.getParent() != null) {
                    Object parent2 = this.LIZ.getParent();
                    if ((parent2 instanceof View) && (view3 = (View) parent2) != null) {
                        view3.setVisibility(0);
                    }
                }
                super.setVisibility(i);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment
    public final void Ql(C73210SoI c73210SoI) {
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        View view = getView();
        o.LJII(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ConstraintLayout constraintLayout = (ConstraintLayout) C38619FDr.LIZIZ(R.layout.c25, requireActivity, (ViewGroup) view, false);
        this.LLLZL = constraintLayout;
        PostModeDetailParams postModeDetailParams = this.LLLLZLLLI;
        if (postModeDetailParams != null) {
            if ((postModeDetailParams.hasNextFeed || Do()) && c73210SoI != null) {
                c73210SoI.LJLLLLLL(constraintLayout);
            }
            PostModeDetailParams postModeDetailParams2 = this.LLLLZLLLI;
            if (postModeDetailParams2 != null) {
                if (postModeDetailParams2.hasNextFeed) {
                    View findViewById = constraintLayout.findViewById(R.id.hob);
                    this.LLLZIL = findViewById;
                    if (findViewById != null) {
                        findViewById.setVisibility(0);
                    }
                }
                if (Do()) {
                    View findViewById2 = constraintLayout.findViewById(R.id.l14);
                    this.LLLZLL = findViewById2;
                    if (findViewById2 != null) {
                        C16880lQ.LJIIJ(new ACListenerS38S0200000_3(this, c73210SoI, 48), findViewById2);
                        return;
                    }
                    return;
                }
                return;
            }
            o.LJIJI("postModeDetailParams");
            throw null;
        }
        o.LJIJI("postModeDetailParams");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment
    public final void Rl(C73210SoI c73210SoI) {
        C191467fK c191467fK;
        C203007xw c203007xw;
        this.LLLZI = c73210SoI;
        np();
        if (c73210SoI != null) {
            c73210SoI.LJZ(this.LLLZIIL);
        }
        View view = this.LLLZIIL;
        RecyclerView recyclerView = this.LLFII;
        if (recyclerView instanceof C191467fK) {
            c191467fK = (C191467fK) recyclerView;
        } else {
            c191467fK = null;
        }
        if (view == null || (c203007xw = (C203007xw) view.findViewById(R.id.hp0)) == null || c191467fK == null) {
            return;
        }
        c191467fK.setOnHorizontalSlopExceeded(new AqS150S0200000_3(c203007xw, c191467fK, 55));
        c191467fK.setOnActionUpLambda(new AqS150S0200000_3(c203007xw, c191467fK, 56));
    }

    @Override // com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment
    public final void Vn(boolean z) {
        View view;
        if (!z && (view = this.LLLZIL) != null) {
            view.setVisibility(0);
        }
        rp();
    }

    @Override // com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment
    public final View Xm(ViewGroup viewGroup) {
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        return C38619FDr.LIZJ(requireActivity, R.layout.pi, null);
    }

    @Override // com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment, X.InterfaceC223218pR
    public final void cb0(Exception e) {
        o.LJIIIZ(e, "e");
        super.cb0(e);
        sp();
        C176996x5 c176996x5 = this.LLIZ;
        if (c176996x5 != null) {
            c176996x5.LLD = 0;
        }
        View view = this.LLLZIL;
        if (view != null) {
            view.setVisibility(0);
        }
        this.LLLZ = true;
    }

    @Override // com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment
    public final void lm(W5F w5f) {
        w5f.LJ();
    }

    @Override // com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment
    @QD3
    public void onCommentEvent(C174046sK event) {
        RecyclerView recyclerView;
        o.LJIIIZ(event, "event");
        super.onCommentEvent(event);
        Integer num = event.LJLJJI;
        int hashCode = hashCode();
        if (num == null || num.intValue() != hashCode || (recyclerView = this.LLFII) == null) {
            return;
        }
        recyclerView.post(new ARunnableS39S0100000_3(this, 103));
    }

    @Override // com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment
    @QD3
    public void onEvent(C174086sO c174086sO) {
        if (op().LJLILLLLZI.getValue() != EnumC201127uu.PULL_UP) {
            super.onEvent(c174086sO);
        }
    }

    public final void pp(String str) {
        if (Do() && ((C176376w5) this.LLILIL.LJLIL).LJIILLIIL()) {
            Aweme aweme = this.LJLJI;
            PostModeDetailParams postModeDetailParams = this.LLLLZLLLI;
            if (postModeDetailParams != null) {
                long j = ((CommentItemList) this.LLILIL.LJLIL.getData()).total;
                C188727au c188727au = new C188727au();
                C201467vS.LIZJ(c188727au, postModeDetailParams);
                C201467vS.LIZLLL(c188727au, aweme);
                C201467vS.LIZIZ(c188727au, aweme);
                c188727au.LJI("from_page", "graphic_detail");
                c188727au.LJ(j, "total_comment_cnt");
                c188727au.LJI("action_type", str);
                FMX.LJIIL("click_more_comment_button", c188727au.LIZ);
                C176176vl c176176vl = this.LLILIL;
                T t = c176176vl.LJLIL;
                if (t != 0 && ((C176376w5) t).LJIILLIIL()) {
                    C176376w5 c176376w5 = (C176376w5) c176176vl.LJLIL;
                    c176376w5.LJIIIZ(4, c176376w5.LJZL);
                    c176376w5.LJZL.clear();
                    c176376w5.LJLLLLLL = false;
                    ((InterfaceC223218pR) c176176vl.LJLILLLLZI).j0(((AbstractC51036K1g) c176176vl.LJLIL).getItems(), ((AbstractC51036K1g) c176176vl.LJLIL).isHasMore());
                    return;
                }
                return;
            }
            o.LJIJI("postModeDetailParams");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment
    public final void Wn(List<Comment> list, boolean z) {
        View view;
        this.LLLZ = true;
        if (!z && (view = this.LLLZIL) != null) {
            view.setVisibility(0);
        }
        rp();
    }

    @Override // com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment
    public void fp(CharSequence charSequence, long j) {
        String str;
        PostModeContainerViewModel op = op();
        String valueOf = String.valueOf(charSequence);
        MutableLiveData<OSZ<String, String>> mutableLiveData = op.LJZ;
        try {
            str = C77123UOp.LJJIIJ(j);
            o.LJIIIIZZ(str, "{\n            I18nUiKit.…t(commentCount)\n        }");
        } catch (Exception unused) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        mutableLiveData.setValue(new OSZ<>(valueOf, str));
        C73210SoI c73210SoI = this.LLLZI;
        if (c73210SoI != null) {
            Iterator it = ((ArrayList) c73210SoI.LJZI()).iterator();
            while (it.hasNext()) {
                TextView textView = (TextView) ((View) it.next()).findViewById(R.id.bk2);
                if (textView != null) {
                    if (o.LJ(charSequence, "")) {
                        Context context = textView.getContext();
                        o.LJIIIIZZ(context, "tv.context");
                        C2059186h.LIZ(textView, C184387Lm.LIZJ(context));
                    } else {
                        C2059186h.LIZ(textView, charSequence);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment
    public final void ho(Comment comment, String str) {
        pp("click_comment_reply");
        super.ho(comment, str);
    }

    @Override // com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment, X.InterfaceC177046xA
    public final void onCommentInputKeyboardDismiss(boolean z, C177156xL c177156xL) {
        super.onCommentInputKeyboardDismiss(z, c177156xL);
        op().jv0(false);
    }

    @Override // com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        PostModeDetailParams postModeDetailParams;
        Serializable serializable;
        int i;
        int i2;
        int LJIIIZ;
        C191467fK c191467fK;
        C191467fK c191467fK2;
        C174366sq c174366sq;
        o.LJIIIZ(view, "view");
        Bundle arguments = getArguments();
        Integer num = null;
        if (arguments != null) {
            postModeDetailParams = (PostModeDetailParams) arguments.getParcelable("POST_DETAIL_PARAMS");
        } else {
            postModeDetailParams = null;
        }
        if (postModeDetailParams == null) {
            postModeDetailParams = new PostModeDetailParams(0);
        }
        this.LLLLZLLLI = postModeDetailParams;
        Aweme aweme = ((PhotoSharedViewModel) this.LLLLZLL.getValue()).LJLILLLLZI;
        if (aweme != null) {
            LLIFFJFJJ(aweme);
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable = arguments2.getSerializable("id");
        } else {
            serializable = null;
        }
        if ((serializable instanceof C174366sq) && (c174366sq = (C174366sq) serializable) != null) {
            c174366sq.setAweme(aweme);
            this.LJLILLLLZI = c174366sq;
        }
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = this.LLFII;
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        Integer LJI = C79045V0n.LJI(R.attr.cl, requireContext);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = -1;
        }
        recyclerView.setBackgroundColor(i);
        this.LLILZLL.LJLLILLLL = true;
        this.LLFII.LJIIJJI(new IDrS43S0100000_3(this, 15));
        RecyclerView recyclerView2 = this.LLFII;
        PostModeContainerViewModel postModeActivityViewModel = op();
        o.LJIIIZ(postModeActivityViewModel, "postModeActivityViewModel");
        IDrS43S0100000_3 iDrS43S0100000_3 = new IDrS43S0100000_3(postModeActivityViewModel, 11);
        IDrS43S0100000_3 iDrS43S0100000_32 = new IDrS43S0100000_3(postModeActivityViewModel, 12);
        if (recyclerView2 != null) {
            recyclerView2.LJIIJJI(iDrS43S0100000_3);
            recyclerView2.LJIIJJI(iDrS43S0100000_32);
        }
        RecyclerView recyclerView3 = this.LLFII;
        if ((recyclerView3 instanceof C191467fK) && (c191467fK2 = (C191467fK) recyclerView3) != null) {
            c191467fK2.setUpperThresholdCallback(new AqS153S0100000_3(this, 1768));
            c191467fK2.setFlingDownCallback(new AqS153S0100000_3(this, 1769));
            c191467fK2.setBottomThresholdCallback(new AqS153S0100000_3(this, 1770));
        }
        op().LLIIZ.observe(getViewLifecycleOwner(), new AObserverS71S0100000_3(this, 80));
        op().LLIIJLIL.observe(getViewLifecycleOwner(), new AObserverS71S0100000_3(this, 81));
        op().LJLJLJ.observe(getViewLifecycleOwner(), new AObserverS71S0100000_3(this, 82));
        op().LJLJJLL.observe(getViewLifecycleOwner(), new AObserverS71S0100000_3(this, 83));
        op().LLIIJI.observe(getViewLifecycleOwner(), new AObserverS71S0100000_3(this, 84));
        ViewGroup viewGroup = this.LJLLI;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        TextView textView = this.LLFZ;
        if (textView != null) {
            textView.setVisibility(8);
        }
        View findViewById = view.findViewById(R.id.kf_);
        if (findViewById != null) {
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            layoutParams.height = 0;
            findViewById.setLayoutParams(layoutParams);
        }
        RelativeLayout relativeLayout = this.LLIIJI;
        Context requireContext2 = requireContext();
        o.LJIIIIZZ(requireContext2, "requireContext()");
        Integer LJI2 = C79045V0n.LJI(R.attr.cl, requireContext2);
        if (LJI2 != null) {
            i2 = LJI2.intValue();
        } else {
            i2 = -1;
        }
        relativeLayout.setBackgroundColor(i2);
        RecyclerView recyclerView4 = this.LLFII;
        if ((recyclerView4 instanceof C191467fK) && (c191467fK = (C191467fK) recyclerView4) != null) {
            double upperThreshold = c191467fK.getUpperThreshold();
            o.LJIIIIZZ(requireActivity(), "requireActivity()");
            num = Integer.valueOf((int) ((upperThreshold + C184387Lm.LJ(r1)) * 1.3d));
        }
        RelativeLayout relativeLayout2 = this.LLIIJI;
        o.LJII(relativeLayout2, "null cannot be cast to non-null type android.widget.RelativeLayout");
        View imageView = new ImageView(requireContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(10, -1);
        if (num != null) {
            LJIIIZ = num.intValue();
        } else {
            LJIIIZ = KL2.LJIIIZ(requireContext()) / 3;
        }
        layoutParams2.height = LJIIIZ;
        imageView.setLayoutParams(layoutParams2);
        imageView.setBackgroundColor(-16777216);
        relativeLayout2.addView(imageView, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r0.previousPage, "personal_homepage") != false) goto L44;
     */
    @Override // com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment, X.InterfaceC1797373p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLZZLLIL(com.ss.android.ugc.aweme.comment.model.Comment r6, com.ss.android.ugc.aweme.profile.model.User r7, java.lang.String r8) {
        /*
            r5 = this;
            java.lang.String r0 = "user"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.String r0 = "comment"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            com.ss.android.ugc.aweme.model.PostModeDetailParams r0 = r5.LLLLZLLLI
            java.lang.String r4 = "postModeDetailParams"
            r3 = 0
            if (r0 == 0) goto L60
            java.lang.String r1 = r0.previousPage
            java.lang.String r0 = "others_homepage"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L29
            com.ss.android.ugc.aweme.model.PostModeDetailParams r0 = r5.LLLLZLLLI
            if (r0 == 0) goto L5c
            java.lang.String r1 = r0.previousPage
            java.lang.String r0 = "personal_homepage"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L58
        L29:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.LJLJI
            if (r0 == 0) goto L52
            java.lang.String r1 = r0.getAuthorUid()
        L31:
            java.lang.String r0 = r7.getUid()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L58
            X.1qj r2 = r5.mo49getActivity()
            boolean r0 = r2 instanceof com.ss.android.ugc.aweme.ui.activity.PostModeDetailActivity
            if (r0 == 0) goto L51
            com.ss.android.ugc.aweme.ui.activity.PostModeDetailActivity r2 = (com.ss.android.ugc.aweme.ui.activity.PostModeDetailActivity) r2
            if (r2 == 0) goto L51
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.LJLJI
            com.ss.android.ugc.aweme.model.PostModeDetailParams r0 = r5.LLLLZLLLI
            if (r0 == 0) goto L54
        L4e:
            r2.LLFZ(r1, r0, r3)
        L51:
            return
        L52:
            r1 = r3
            goto L31
        L54:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r3
        L58:
            super.LLZZLLIL(r6, r7, r8)
            return
        L5c:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r3
        L60:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragment.LLZZLLIL(com.ss.android.ugc.aweme.comment.model.Comment, com.ss.android.ugc.aweme.profile.model.User, java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment, X.InterfaceC177046xA
    public final void onCommentInputKeyboardShow(boolean z, String str, C177156xL c177156xL) {
        super.onCommentInputKeyboardShow(z, str, c177156xL);
        op().jv0(true);
        Aweme aweme = this.LJLJI;
        if (aweme != null && C77321UWf.LIZLLL(aweme, false)) {
            PostModeDetailParams postModeDetailParams = this.LLLLZLLLI;
            if (postModeDetailParams != null) {
                String str2 = postModeDetailParams.eventType;
                if (str2 == null) {
                    str2 = "";
                }
                C74Z.LJJIIJ(str2);
                return;
            }
            o.LJIJI("postModeDetailParams");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        o.LJIIIZ(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        C29S c29s = null;
        if (onCreateView instanceof ViewGroup) {
            view = onCreateView;
        } else {
            view = null;
        }
        if (view != null) {
            int i = -1;
            view.findViewById(R.id.isf).setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            View findViewById = view.findViewById(R.id.dd6);
            Context requireContext = requireContext();
            o.LJIIIIZZ(requireContext, "requireContext()");
            Integer LJI = C79045V0n.LJI(R.attr.cl, requireContext);
            if (LJI != null) {
                i = LJI.intValue();
            }
            findViewById.setBackgroundColor(i);
            view.findViewById(R.id.bk4).setVisibility(8);
        }
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C66472jD(this, null), 3);
        if (!(onCreateView instanceof View)) {
            onCreateView = null;
        }
        if (onCreateView != null) {
            try {
                ViewTreeLifecycleOwner.set(onCreateView, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(onCreateView, this);
                C10A.LIZIZ(onCreateView, this);
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
        return onCreateView;
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
