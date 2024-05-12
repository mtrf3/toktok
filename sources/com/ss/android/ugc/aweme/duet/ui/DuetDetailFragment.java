package com.ss.android.ugc.aweme.duet.ui;

import X.C16880lQ;
import X.C1BC;
import X.C2068389v;
import X.C221108m2;
import X.C252569vg;
import X.C26045AKb;
import X.C47261Igj;
import X.C62822Ol8;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C74092T6a;
import X.C74153T8j;
import X.C74157T8n;
import X.C78920UyC;
import X.C80896Voy;
import X.C8BJ;
import X.EnumC74154T8k;
import X.EnumC80902Vp4;
import X.InterfaceC74150T8g;
import X.InterfaceC74156T8m;
import X.MGV;
import X.ORZ;
import X.T6H;
import X.T6Y;
import X.T9K;
import X.ViewOnClickListenerC13880ga;
import X.X1D;
import Y.ACListenerS27S0100000_7;
import Y.ACListenerS32S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.challenge.ui.BaseDetailFragment;
import com.ss.android.ugc.aweme.detail.AbstractDetailFragment;
import com.ss.android.ugc.aweme.duet.model.DuetDetailModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class DuetDetailFragment extends BaseDetailFragment implements InterfaceC74156T8m {
    public static final /* synthetic */ int LJZI = 0;
    public String LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public DuetAwemeListFragment LJLJJLL;
    public C74157T8n LJLJL;
    public float LJLJLLL;
    public float LJLL;
    public boolean LJLLI;
    public final Map<Integer, View> LJZ = new LinkedHashMap();
    public String LJLIL = "";
    public String LJLJJL = "";
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 190));
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 196));
    public final C62822Ol8 LJLLJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 192));
    public final C62822Ol8 LJLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 201));
    public final C62822Ol8 LJLLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 191));
    public final C62822Ol8 LJLLLLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 195));
    public final C62822Ol8 LJLZ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 193));

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final String getLabelName(int i) {
        return "duet_page";
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final int getResId() {
        return R.layout.cqv;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final String getShootWayLabel() {
        return "duet_page";
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return false;
    }

    public final void refresh() {
        if (NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false).isStandardUIEnable()) {
            if (Al().getVisibility() != 0) {
                Hl(null);
            }
            Gl().LIZIZ = new AqS162S0100000_12(this, 199);
            T9K Gl = Gl();
            Gl.getClass();
            Gl.LJIIIZ = System.currentTimeMillis();
            Dl().LJFF();
            C74157T8n c74157T8n = this.LJLJL;
            if (c74157T8n != null) {
                c74157T8n.LJIILL(this.LJLJJI);
                return;
            } else {
                o.LJIJI("detailPresenter");
                throw null;
            }
        }
        Dl().setVisibility(0);
        Dl().LJFF();
        C74157T8n c74157T8n2 = this.LJLJL;
        if (c74157T8n2 != null) {
            c74157T8n2.LJIILL(this.LJLJJI);
        } else {
            o.LJIJI("detailPresenter");
            throw null;
        }
    }

    public DuetDetailFragment() {
        C221108m2.LIZIZ(new AqS162S0100000_12(this, 194));
    }

    public final C80896Voy Al() {
        Object value = this.LJLZ.getValue();
        o.LJIIIIZZ(value, "<get-mRefreshLayout>(...)");
        return (C80896Voy) value;
    }

    public final C73305Spp Dl() {
        Object value = this.LJLLLLLL.getValue();
        o.LJIIIIZZ(value, "<get-mStatusView>(...)");
        return (C73305Spp) value;
    }

    public final T9K Gl() {
        return (T9K) this.LJLLILLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final String getCurId() {
        String str = this.LJLILLLLZI;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final C1BC getFragmentPagerAdapter() {
        String str;
        this.mFragments = new ArrayList();
        this.mFragmentList = new ArrayList();
        this.mFragmentTypes = new ArrayList();
        FragmentManager childFragmentManager = getChildFragmentManager();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(AbstractDetailFragment.FRAGMENT_TAG);
        LIZ.append('0');
        Fragment LJJJIL = childFragmentManager.LJJJIL(X1D.LIZIZ(LIZ));
        boolean z = LJJJIL instanceof DuetAwemeListFragment;
        Fragment fragment = LJJJIL;
        if (!z) {
            String str2 = this.LJLJJI;
            o.LJI(str2);
            String str3 = this.LJLILLLLZI;
            String from = this.LJLIL;
            String fromGroupId = this.LJLJJL;
            final String str4 = this.LJLJJI;
            o.LJI(str4);
            MGV mgv = new MGV(str4) { // from class: X.8lD
                public final String LJLIL;
                public WeakReference<ActivityC45651qj> LJLILLLLZI;

                @Override // X.MGV
                public /* bridge */ /* synthetic */ void onJumpToDetail(String str5) {
                    C220408ku.LIZ(this, str5);
                }

                @Override // X.MGV
                public boolean sendCustomRequest(C51031K1b<? extends AbstractC51036K1g<?, ?>> c51031K1b, int i) {
                    return false;
                }

                public final WeakReference<ActivityC45651qj> getActivity() {
                    return this.LJLILLLLZI;
                }

                {
                    o.LJIIIZ(str4, "hostId");
                    this.LJLIL = str4;
                }

                public final void setActivity(WeakReference<ActivityC45651qj> weakReference) {
                    this.LJLILLLLZI = weakReference;
                }

                @Override // X.MGV
                public MGX getJumpToVideoParam(MGX param, Aweme aweme) {
                    o.LJIIIZ(param, "param");
                    o.LJIIIZ(aweme, "aweme");
                    param.LIZ = "from_duet_detail";
                    param.LIZIZ = "duet_id";
                    param.LIZJ = "duet_page";
                    return param;
                }

                @Override // X.MGV
                public C51031K1b<? extends AbstractC51036K1g<?, ?>> getPresenter(int i, ActivityC45651qj activityC45651qj) {
                    C51031K1b<? extends AbstractC51036K1g<?, ?>> c51031K1b = new C51031K1b<>();
                    c51031K1b.LJJ(new C7D7());
                    return c51031K1b;
                }

                @Override // X.MGV
                public C220538l7 onCreateDetailAwemeViewHolder(final View itemView, final String str5, final MH9 mh9) {
                    o.LJIIIZ(itemView, "itemView");
                    final String str6 = this.LJLIL;
                    return new C220538l7(str6, itemView, str5, mh9) { // from class: X.8lF
                        public final String LLFII;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(itemView, str5, mh9);
                            o.LJIIIZ(str6, "hostId");
                            o.LJIIIZ(itemView, "itemView");
                            this.LLFII = str6;
                        }

                        @Override // X.C220538l7
                        public final void a0(Aweme aweme, int i, boolean z2, Bundle bundle) {
                            if (aweme == null) {
                                return;
                            }
                            super.a0(aweme, i, z2, bundle);
                            if (TextUtils.equals(this.LLFII, aweme.getAid())) {
                                this.LJLLL.setVisibility(0);
                                this.LJLLL.setText(R.string.hp_);
                            }
                            if (aweme.isPgcShow()) {
                                if (aweme.getTextTopLabels() != null && aweme.getTextTopLabels().size() > 0) {
                                    this.LJLLILLLL.setVisibility(0);
                                    this.LJLLI.setVisibility(8);
                                    C220538l7.h0(this.LJLLILLLL, (AwemeTextLabelModel) ListProtector.get(aweme.getTextTopLabels(), 0));
                                    return;
                                }
                                return;
                            }
                            if (aweme.getOriginAuthor() != null) {
                                this.LJLLJ.setVisibility(0);
                                if (!TextUtils.isEmpty(aweme.getLabelOriginAuthorText())) {
                                    this.LJLLJ.setText(aweme.getLabelOriginAuthorText());
                                }
                                this.LJLLI.setVisibility(4);
                                return;
                            }
                            if (aweme.getMusicStarter() != null || aweme.getOriginAuthor() != null || !TextUtils.equals(this.LJLJLLL, "challenge") || aweme.getIsTop() != 1) {
                                return;
                            }
                            if (aweme.getTextTopLabels() != null && aweme.getTextTopLabels().size() > 0) {
                                this.LJLLILLLL.setVisibility(0);
                                this.LJLLI.setVisibility(8);
                                C220538l7.h0(this.LJLLILLLL, (AwemeTextLabelModel) ListProtector.get(aweme.getTextTopLabels(), 0));
                            } else {
                                this.LJLLILLLL.setVisibility(8);
                                this.LJLLI.setVisibility(0);
                                UrlModel labelTop = aweme.getLabelTop();
                                o.LJIIIIZZ(labelTop, "data.getLabelTop()");
                                C78765Uvh.LJI(this.LJLLI, labelTop, (int) KL2.LIZJ(this.LJLJLJ, 6.0f), (int) KL2.LIZJ(this.LJLJLJ, 6.0f), null);
                            }
                        }
                    };
                }
            };
            o.LJIIIZ(from, "from");
            o.LJIIIZ(fromGroupId, "fromGroupId");
            DuetAwemeListFragment duetAwemeListFragment = new DuetAwemeListFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("detail_aweme_list_type", 24);
            bundle.putString("event_label", "duet_page");
            bundle.putString("detail_id", str2);
            String[] strArr = new String[2];
            String LIZ2 = C78920UyC.LIZ('\"', str2, '\"');
            boolean z2 = false;
            strArr[0] = LIZ2;
            if (str3 != null) {
                str = C78920UyC.LIZ('\"', str3, '\"');
            } else {
                str = null;
            }
            strArr[1] = str;
            bundle.putString("top_aweme_ids", ORZ.LLD(C47261Igj.LJJIJIIJI(strArr), ", ", "[", "]", null, 56));
            bundle.putBoolean("extra_challenge_is_hashtag", false);
            bundle.putString("extra_challenge_hashtag_name", "");
            bundle.putString("detail_aweme_from", from);
            bundle.putString("detail_aweme_from_aid", fromGroupId);
            duetAwemeListFragment.setArguments(bundle);
            duetAwemeListFragment.LLILLIZIL = mgv;
            if (this.mCurPos == 0) {
                z2 = true;
            }
            duetAwemeListFragment.LLIIJI = z2;
            duetAwemeListFragment.LLIIJLIL = true;
            fragment = duetAwemeListFragment;
        }
        o.LJII(fragment, "null cannot be cast to non-null type com.ss.android.ugc.aweme.duet.ui.DuetAwemeListFragment");
        DuetAwemeListFragment duetAwemeListFragment2 = (DuetAwemeListFragment) fragment;
        this.LJLJJLL = duetAwemeListFragment2;
        this.mFragments.add(duetAwemeListFragment2);
        List<AmeBaseFragment> list = this.mFragmentList;
        DuetAwemeListFragment duetAwemeListFragment3 = this.LJLJJLL;
        if (duetAwemeListFragment3 != null) {
            list.add(duetAwemeListFragment3);
            this.mFragmentTypes.add(24);
            return new T6H(getChildFragmentManager(), this.mFragmentList, this.mFragmentTypes);
        }
        o.LJIJI("mListFragment");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJZ).clear();
    }

    public final void Hl(Throwable th) {
        C252569vg.LIZ(Dl(), "DuetDetail", th, new AqS162S0100000_12(this, 200));
        Dl().setVisibility(0);
    }

    @Override // X.InterfaceC74156T8m
    public final void OY(DuetDetailModel duetDetailModel) {
        if (!isViewValid()) {
            return;
        }
        UrlModel urlModel = duetDetailModel.cover;
        if (urlModel == null || TextUtils.isEmpty(urlModel.getUri())) {
            Dl().setVisibility(0);
            C73306Spq c73306Spq = new C73306Spq();
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_large_no_video;
            c2068389v.LJ = Integer.valueOf(R.attr.gp);
            c73306Spq.LIZJ = 0;
            c73306Spq.LIZIZ = c2068389v;
            String string = getString(R.string.tob);
            o.LJIIIIZZ(string, "getString(R.string.video_unavailable_hint)");
            c73306Spq.LJI = string;
            Dl().setStatus(c73306Spq);
            return;
        }
        if (NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false).isStandardUIEnable()) {
            Al().setVisibility(0);
            Al().setRefreshing(false);
            Gl().LIZIZ();
        }
        this.LJLLI = true;
        Dl().setVisibility(8);
        ((InterfaceC74150T8g) this.LJLJLJ.getValue()).LIZIZ(duetDetailModel);
        C74153T8j c74153T8j = EnumC74154T8k.Companion;
        Integer num = duetDetailModel.remindType;
        c74153T8j.getClass();
        EnumC74154T8k LIZ = C74153T8j.LIZ(num);
        if (LIZ == null) {
            return;
        }
        if (LIZ == EnumC74154T8k.REMIND_DUET_NOT_ALLOWED || LIZ == EnumC74154T8k.REMIND_SOUND_NOT_READY) {
            Object value = this.LJLLJ.getValue();
            o.LJIIIIZZ(value, "<get-mRecordView>(...)");
            ((View) value).setVisibility(8);
            hideStartRecord();
            return;
        }
        Object value2 = this.LJLLJ.getValue();
        o.LJIIIIZZ(value2, "<get-mRecordView>(...)");
        ((View) value2).setVisibility(0);
    }

    @Override // X.InterfaceC74156T8m
    public final void W10(Exception e) {
        o.LJIIIZ(e, "e");
        if (isViewValid()) {
            if (NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false).isStandardUIEnable()) {
                Gl().LIZIZ = new AqS159S0200000_12(this, e, 12);
                Gl().LIZ(e);
                return;
            }
            C26045AKb c26045AKb = new C26045AKb(this);
            c26045AKb.LJIIIIZZ(R.string.img);
            c26045AKb.LJIIJ();
            if (this.LJLLI) {
                Dl().setVisibility(8);
                return;
            }
            Dl().setVisibility(0);
            C73305Spp Dl = Dl();
            C73306Spq c73306Spq = new C73306Spq();
            C73312Spw.LJI(c73306Spq, new AqS162S0100000_12(this, 197));
            Dl.setStatus(c73306Spq);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final T6Y createAnimator(ViewGroup viewGroup) {
        o.LJIIIZ(viewGroup, "viewGroup");
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        return new C74092T6a(requireContext, viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final void initArguments(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String string;
        if (bundle != null) {
            bundle.getString("enter_method");
        }
        String str4 = null;
        if (bundle != null) {
            str = bundle.getString("enter_from");
        } else {
            str = null;
        }
        String str5 = "";
        if (str == null) {
            str = "";
        }
        this.LJLIL = str;
        if (bundle != null) {
            str2 = bundle.getString("id");
        } else {
            str2 = null;
        }
        this.LJLILLLLZI = str2;
        if (bundle != null) {
            str4 = bundle.getString("author_id");
        }
        this.LJLJI = str4;
        if (bundle == null || (str3 = bundle.getString("origin_item_id")) == null) {
            str3 = "";
        }
        this.LJLJJI = str3;
        if (bundle != null && (string = bundle.getString("from_group_id")) != null) {
            str5 = string;
        }
        this.LJLJJL = str5;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, X.InterfaceC80650Vl0
    public final void onScroll(int i, int i2) {
        int i3;
        super.onScroll(i, i2);
        int i4 = 0;
        float f = 0.0f;
        if (this.LJLJLLL == 0.0f) {
            Object value = this.LJLLL.getValue();
            o.LJIIIIZZ(value, "<get-titleTextView>(...)");
            if (((View) value).getVisibility() == 0) {
                Object value2 = this.LJLLL.getValue();
                o.LJIIIIZZ(value2, "<get-titleTextView>(...)");
                int bottom = ((View) value2).getBottom();
                View view = this.mTitleColorCtrl;
                if (view != null) {
                    i3 = view.getBottom();
                } else {
                    i3 = 0;
                }
                this.LJLJLLL = bottom - i3;
            }
        }
        if (this.LJLL == 0.0f) {
            Object value3 = this.LJLLLL.getValue();
            o.LJIIIIZZ(value3, "<get-mHeadLayout>(...)");
            int bottom2 = ((View) value3).getBottom();
            View view2 = this.mTitleColorCtrl;
            if (view2 != null) {
                i4 = view2.getBottom();
            }
            this.LJLL = bottom2 - i4;
        }
        float f2 = this.LJLJLLL;
        float f3 = (i - f2) / (this.LJLL - f2);
        if (f3 > 0.2d) {
            f = f3;
            if (f > 1.0f) {
                f = 1.0f;
            }
        }
        this.mTitleColorCtrl.setAlpha(f);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.BaseDetailFragment, com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        ((InterfaceC74150T8g) this.LJLJLJ.getValue()).LIZ(view);
        super.onViewCreated(view, bundle);
        View view2 = null;
        if (NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false).isStandardUIEnable()) {
            Al().setVisibility(8);
            Al().setOnRefreshListener(new AqS162S0100000_12(this, 198));
        } else {
            Al().setOverScrollMode(EnumC80902Vp4.NONE);
            Al().setScrollMode(C8BJ.NONE);
            Al().setNestedHeader(null);
        }
        Object value = this.LJLLJ.getValue();
        o.LJIIIIZZ(value, "<get-mRecordView>(...)");
        C16880lQ.LJIIJ(new ACListenerS27S0100000_7(this, 169), (View) value);
        C74157T8n c74157T8n = new C74157T8n();
        this.LJLJL = c74157T8n;
        c74157T8n.LJLILLLLZI = this;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJZ;
        View view3 = (View) linkedHashMap.get(Integer.valueOf(R.id.aej));
        if (view3 == null) {
            View view4 = getView();
            if (view4 != null && (view3 = view4.findViewById(R.id.aej)) != null) {
                linkedHashMap.put(Integer.valueOf(R.id.aej), view3);
            }
            view2.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS32S0100000_12(this, 48)));
            refresh();
        }
        view2 = view3;
        view2.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS32S0100000_12(this, 48)));
        refresh();
    }
}
