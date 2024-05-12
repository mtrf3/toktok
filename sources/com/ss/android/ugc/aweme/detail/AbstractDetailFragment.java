package com.ss.android.ugc.aweme.detail;

import X.ActivityC45651qj;
import X.C04270Et;
import X.C04330Ez;
import X.C0C3;
import X.C0NY;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C17N;
import X.C1BC;
import X.C29S;
import X.C3C5;
import X.C43694HCw;
import X.C61845OOz;
import X.C63081OpJ;
import X.C74092T6a;
import X.C76800UCe;
import X.C80647Vkx;
import X.C80674VlO;
import X.C80675VlP;
import X.C82867Wff;
import X.C90903hW;
import X.FMX;
import X.InterfaceC80650Vl0;
import X.KL2;
import X.OGG;
import X.QD3;
import X.T6F;
import X.T6Y;
import X.TAY;
import Y.ARunnableS18S0101000_14;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.detail.AbstractDetailFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public abstract class AbstractDetailFragment extends AmeBaseFragment implements C0C3, InterfaceC80650Vl0 {
    public static final String FRAGMENT_TAG = C0NY.LIZIZ("android:switcher:", R.id.ncx, ":");
    public DetailViewModel detailViewModel;
    public T6Y mAnimator;
    public ImageView mBackBtn;
    public TuxIconView mCloseBtn;
    public int mCurPos;
    public int mCurrentPosition;
    public TuxIconView mExpandBtn;
    public List<AmeBaseFragment> mFragmentList;
    public C1BC mFragmentPagerAdapter;
    public List<T6F> mFragments;
    public C80647Vkx mScrollableLayout;
    public ImageView mShareButton;
    public List<T6F> mSingleLineFragments;
    public String mStickerIds;
    public C80675VlP mTabLayout;
    public TextView mTitle;
    public View mTitleColorCtrl;
    public ViewPager mViewPager;
    public boolean mHasRecordHideAnim = true;
    public final Observer<Boolean> scroll2TopObserver = new C82867Wff(0, this);
    public long mStartTime = -1;

    public static /* synthetic */ void vl(AbstractDetailFragment abstractDetailFragment) {
        abstractDetailFragment.lambda$startAnimator$1();
    }

    public abstract String getCurId();

    public abstract C1BC getFragmentPagerAdapter();

    public abstract String getLabelName(int i);

    public abstract int getResId();

    public abstract String getShootWayLabel();

    public int getTabViewResId() {
        return R.layout.akp;
    }

    public abstract void initArguments(Bundle bundle);

    public void initView(View view) {
    }

    public boolean isHaveLatestTab() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public boolean isRegisterEventBus() {
        return true;
    }

    public boolean mobStayTimeOnPause() {
        return true;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com_ss_android_ugc_aweme_detail_AbstractDetailFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyOnCreateView(this, layoutInflater, viewGroup, bundle);
    }

    @QD3
    public void onEvent(C43694HCw c43694HCw) {
    }

    public void onPageChange(int i, int i2) {
    }

    public void onPageChange(int i, boolean z) {
    }

    @Override // X.C0C3
    public void onPageScrollStateChanged(int i) {
    }

    @Override // X.C0C3
    public void onPageScrolled(int i, float f, int i2) {
    }

    @Override // X.InterfaceC80650Vl0
    public boolean onScrollEnd() {
        return false;
    }

    public void onTextClick(int i) {
    }

    public boolean showTabLayout() {
        return false;
    }

    private void initTabLayout() {
        C80675VlP c80675VlP = this.mTabLayout;
        if (c80675VlP == null) {
            return;
        }
        c80675VlP.setVisibility(0);
        this.mTabLayout.setCustomTabViewResId(getTabViewResId());
        this.mTabLayout.setBackgroundColor(C04330Ez.LIZIZ(getContext(), R.color.bp));
        this.mTabLayout.LJIIZILJ(C17N.LJIILL(16.0d), C17N.LJIILL(16.0d));
        addDividerForTabs();
        this.mTabLayout.setupWithViewPager(this.mViewPager);
        this.mTabLayout.setOnTabClickListener(new TAY() { // from class: X.T6Z
            @Override // X.TAY
            public final void LIZIZ(C80674VlO c80674VlO) {
                AbstractDetailFragment.this.lambda$initTabLayout$2(c80674VlO);
            }
        });
        if (!showTabLayout()) {
            this.mTabLayout.setVisibility(8);
        }
    }

    private void startAnimator() {
        if (this.mAnimator != null) {
            new Handler().postDelayed(new ARunnableS18S0101000_14(5, this, 21), 500L);
        }
    }

    private void stopAnimator() {
        T6Y t6y = this.mAnimator;
        if (t6y != null) {
            t6y.stop();
        }
    }

    public void addDividerForTabs() {
        C80675VlP c80675VlP = this.mTabLayout;
        if (c80675VlP == null) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) c80675VlP.getChildAt(0);
        linearLayout.setShowDividers(2);
        linearLayout.setDividerDrawable(C04270Et.LIZIZ(c80675VlP.getContext(), R.drawable.amd));
        linearLayout.setDividerPadding(C17N.LJIILL(16.0d));
    }

    public void initData() {
        C80647Vkx c80647Vkx = this.mScrollableLayout;
        if (c80647Vkx != null) {
            c80647Vkx.setOnScrollListener(this);
        }
        C1BC fragmentPagerAdapter = getFragmentPagerAdapter();
        this.mFragmentPagerAdapter = fragmentPagerAdapter;
        this.mViewPager.setAdapter(fragmentPagerAdapter);
        initTabLayout();
        this.mViewPager.addOnPageChangeListener(this);
        this.mViewPager.setCurrentItem(this.mCurPos);
        onPageSelected(this.mCurPos);
    }

    public void mobStayTime() {
        if (this.mStartTime != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.mStartTime;
            getContext();
            FMX.LJIIIZ("stay_time", getLabelName(this.mCurPos), C61845OOz.LIZ("", currentTimeMillis), getCurId());
            this.mStartTime = -1L;
        }
    }

    public void onNeedScrollToTop() {
        C80647Vkx c80647Vkx = this.mScrollableLayout;
        if (c80647Vkx != null) {
            c80647Vkx.setMaxScrollHeight(Integer.MAX_VALUE);
            this.mScrollableLayout.scrollTo(0, LiveNetAdaptiveHurryTimeSetting.DEFAULT);
        }
    }

    public /* synthetic */ void lambda$startAnimator$1() {
        if (isViewValid()) {
            this.mAnimator.start();
        }
    }

    public void controlScroll() {
        List<T6F> list;
        RecyclerView recyclerView;
        if (isViewValid() && (list = this.mFragments) != null) {
            int size = list.size();
            int i = this.mCurPos;
            if (size > i && ListProtector.get(this.mFragments, i) != null && (recyclerView = (RecyclerView) ((T6F) ListProtector.get(this.mFragments, this.mCurPos)).LJIJJ()) != null) {
                int childCount = recyclerView.getChildCount();
                C80647Vkx c80647Vkx = this.mScrollableLayout;
                if (c80647Vkx == null) {
                    return;
                }
                if (childCount == 0) {
                    if (c80647Vkx.LLFII != 0) {
                        c80647Vkx.scrollTo(0, 0);
                    }
                    List<T6F> list2 = this.mFragments;
                    ((T6F) ListProtector.get(list2, (this.mCurPos + 1) % list2.size())).LL();
                    this.mScrollableLayout.setMaxScrollHeight(0);
                    return;
                }
                View LJJJ = recyclerView.getLayoutManager().LJJJ(childCount - 1);
                int childCount2 = this.mScrollableLayout.getChildCount();
                if (childCount2 < 2 || LJJJ == null) {
                    return;
                }
                this.mScrollableLayout.setMaxScrollHeight((C63081OpJ.LJJJJLI(getContext()) + (this.mScrollableLayout.getCurScrollY() + ((this.mScrollableLayout.getChildAt(childCount2 - 1).getTop() + LJJJ.getBottom()) - this.mScrollableLayout.getCurScrollY()))) - KL2.LJIIIZ(getContext()));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.detailViewModel.LJLILLLLZI.removeObserver(this.scroll2TopObserver);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (mobStayTimeOnPause()) {
            mobStayTime();
        }
        stopAnimator();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.mStartTime = System.currentTimeMillis();
        startAnimator();
    }

    private void findView(View view) {
        this.mScrollableLayout = (C80647Vkx) view.findViewById(R.id.jcm);
        this.mTitle = (TextView) view.findViewById(R.id.title);
        this.mTitleColorCtrl = view.findViewById(R.id.l_i);
        this.mViewPager = (ViewPager) view.findViewById(R.id.ncx);
        this.mTabLayout = (C80675VlP) view.findViewById(R.id.kyt);
        this.mShareButton = (ImageView) view.findViewById(R.id.jsu);
        this.mBackBtn = (ImageView) view.findViewById(R.id.aej);
        this.mExpandBtn = (TuxIconView) view.findViewById(R.id.dp9);
        this.mCloseBtn = (TuxIconView) view.findViewById(R.id.bfh);
    }

    public /* synthetic */ void lambda$initTabLayout$2(C80674VlO c80674VlO) {
        onTextClick(c80674VlO.LJ);
        c80674VlO.LIZ();
    }

    public /* synthetic */ void lambda$new$0(Boolean bool) {
        if (bool.booleanValue()) {
            onNeedScrollToTop();
        }
    }

    public T6Y createAnimator(ViewGroup viewGroup) {
        return new C74092T6a(getContext(), viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initArguments(getArguments());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0C3
    public void onPageSelected(int i) {
        boolean z;
        ViewPager viewPager;
        if (i < 0 || ((viewPager = this.mViewPager) != null && viewPager.getAdapter() != null && i >= this.mViewPager.getAdapter().getCount())) {
            i = 0;
        }
        if (this.mStartTime != -1 && this.mCurPos != i) {
            long currentTimeMillis = System.currentTimeMillis() - this.mStartTime;
            getContext();
            FMX.LJIIIZ("stay_time", getLabelName(this.mCurPos), C61845OOz.LIZ("", currentTimeMillis), getCurId());
            this.mStartTime = System.currentTimeMillis();
        }
        if (i != this.mCurrentPosition) {
            z = true;
        } else {
            z = false;
        }
        onPageChange(i, z);
        this.mCurrentPosition = i;
        this.mCurPos = i;
        int currentItem = this.mViewPager.getCurrentItem();
        int i2 = this.mCurPos;
        if (currentItem != i2) {
            this.mViewPager.setCurrentItem(i2);
        }
        C80647Vkx c80647Vkx = this.mScrollableLayout;
        if (c80647Vkx != null && c80647Vkx.getHelper() != null && this.mFragments != null) {
            this.mScrollableLayout.getHelper().LIZIZ = (OGG) ListProtector.get(this.mFragments, this.mCurPos);
        }
        T6Y t6y = this.mAnimator;
        if (t6y != null) {
            t6y.LJJIJL();
        }
        C1BC c1bc = this.mFragmentPagerAdapter;
        if (c1bc != null && this.mViewPager != null) {
            int count = c1bc.getCount();
            for (int i3 = 0; i3 < count; i3++) {
                Fragment LJJIII = this.mFragmentPagerAdapter.LJJIII(i3);
                if (LJJIII != 0 && LJJIII.getFragmentManager() != null) {
                    if (i3 == i) {
                        LJJIII.setUserVisibleHint(true);
                        onPageChange(i, LJJIII.hashCode());
                    } else {
                        LJJIII.setUserVisibleHint(false);
                    }
                    ((T6F) LJJIII).Oi();
                }
            }
        }
        controlScroll();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("cur_pos", this.mCurPos);
        super.onSaveInstanceState(bundle);
    }

    public void onScroll(int i, int i2) {
        this.detailViewModel.LJLIL.setValue(Boolean.TRUE);
    }

    public void onScrolled(float f, float f2) {
        T6Y t6y;
        controlScroll();
        if (Math.abs(f) < Math.abs(f2) && this.mHasRecordHideAnim) {
            if (f2 > 30.0f) {
                T6Y t6y2 = this.mAnimator;
                if (t6y2 != null) {
                    t6y2.LIZIZ();
                    return;
                }
                return;
            }
            if (f2 >= -30.0f || (t6y = this.mAnimator) == null) {
                return;
            }
            t6y.LIZJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        findView(view);
        if (this.mAnimator == null) {
            this.mAnimator = createAnimator((ViewGroup) view);
        }
        if (bundle != null) {
            this.mCurPos = bundle.getInt("cur_pos", 0);
        }
        DetailViewModel detailViewModel = (DetailViewModel) ViewModelProviders.of(mo49getActivity()).get(DetailViewModel.class);
        this.detailViewModel = detailViewModel;
        detailViewModel.LJLILLLLZI.observeForever(this.scroll2TopObserver);
        initData();
    }

    public View com_ss_android_ugc_aweme_detail_AbstractDetailFragment__onCreateView$___twin___(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, getResId(), viewGroup, false);
        initView(LLLLIILL);
        return LLLLIILL;
    }

    public static View com_ss_android_ugc_aweme_detail_AbstractDetailFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyOnCreateView(AbstractDetailFragment abstractDetailFragment, LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View com_ss_android_ugc_aweme_detail_AbstractDetailFragment__onCreateView$___twin___ = abstractDetailFragment.com_ss_android_ugc_aweme_detail_AbstractDetailFragment__onCreateView$___twin___(inflater, viewGroup, bundle);
        C29S c29s = null;
        if (!(com_ss_android_ugc_aweme_detail_AbstractDetailFragment__onCreateView$___twin___ instanceof View)) {
            com_ss_android_ugc_aweme_detail_AbstractDetailFragment__onCreateView$___twin___ = null;
        }
        if (com_ss_android_ugc_aweme_detail_AbstractDetailFragment__onCreateView$___twin___ != null) {
            try {
                ViewTreeLifecycleOwner.set(com_ss_android_ugc_aweme_detail_AbstractDetailFragment__onCreateView$___twin___, abstractDetailFragment.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(com_ss_android_ugc_aweme_detail_AbstractDetailFragment__onCreateView$___twin___, abstractDetailFragment);
                C10A.LIZIZ(com_ss_android_ugc_aweme_detail_AbstractDetailFragment__onCreateView$___twin___, abstractDetailFragment);
                ActivityC45651qj mo49getActivity = abstractDetailFragment.mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return com_ss_android_ugc_aweme_detail_AbstractDetailFragment__onCreateView$___twin___;
    }
}
