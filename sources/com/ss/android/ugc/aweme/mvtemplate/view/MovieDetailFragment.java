package com.ss.android.ugc.aweme.mvtemplate.view;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C186557Tv;
import X.C188727au;
import X.C1BC;
import X.C221108m2;
import X.C26045AKb;
import X.C2NU;
import X.C3A5;
import X.C50420Jqa;
import X.C62822Ol8;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C74144T8a;
import X.C74145T8b;
import X.C7MY;
import X.C80896Voy;
import X.C8BJ;
import X.C8BR;
import X.C8BS;
import X.C8I9;
import X.C8IA;
import X.EnumC80902Vp4;
import X.FMX;
import X.InterfaceC74146T8c;
import X.InterfaceC74147T8d;
import X.MGV;
import X.QD3;
import X.T6H;
import X.T6X;
import X.T6Y;
import X.T8Z;
import X.ViewOnClickListenerC13880ga;
import X.X1D;
import Y.ACListenerS27S0100000_7;
import Y.ACListenerS32S0100000_12;
import Y.ACallableS106S0100000_3;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.challenge.ui.BaseDetailFragment;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.detail.AbstractDetailFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.mvtemplate.model.MvDetailModel;
import com.ss.android.ugc.aweme.mvtemplate.model.TemplateResponseItem;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MvModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class MovieDetailFragment extends BaseDetailFragment implements C8IA {
    public static final /* synthetic */ int LLF = 0;
    public String LJLIL;
    public Integer LJLJI;
    public MovieDetailAwemeListFragment LJLJJI;
    public C8I9 LJLJLLL;
    public float LJLL;
    public float LJLLI;
    public String LJLLILLLL;
    public MvModel LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public boolean LL;
    public final Map<Integer, View> LLD = new LinkedHashMap();
    public int LJLILLLLZI = 1;
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 143));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 144));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 794));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 142));
    public String LJLLJ = "";
    public String LJLLL = "";
    public final LogPbBean LJLLLL = new LogPbBean();
    public final C62822Ol8 LJZI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 793));
    public final C62822Ol8 LJZL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 796));

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLD;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final String getLabelName(int i) {
        return "movie";
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final int getResId() {
        return R.layout.awr;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final String getShootWayLabel() {
        return "movie_hot";
    }

    @QD3
    public final void onVideoEvent(C50420Jqa event) {
        o.LJIIIZ(event, "event");
    }

    public final View Al() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-mRecordView>(...)");
        return (View) value;
    }

    public final C73305Spp Dl() {
        Object value = this.LJLJL.getValue();
        o.LJIIIIZZ(value, "<get-mStatusView>(...)");
        return (C73305Spp) value;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final String getCurId() {
        String str = this.LJLIL;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final C1BC getFragmentPagerAdapter() {
        int i;
        this.mFragments = new ArrayList();
        this.mFragmentList = new ArrayList();
        this.mFragmentTypes = new ArrayList();
        FragmentManager childFragmentManager = getChildFragmentManager();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(AbstractDetailFragment.FRAGMENT_TAG);
        LIZ.append('0');
        Fragment LJJJIL = childFragmentManager.LJJJIL(X1D.LIZIZ(LIZ));
        boolean z = LJJJIL instanceof MovieDetailAwemeListFragment;
        Fragment fragment = LJJJIL;
        if (!z) {
            Integer num = this.LJLJI;
            if (num == null || num.intValue() != 2) {
                i = 20;
            } else {
                i = 32;
            }
            String str = this.LJLIL;
            String from = this.LJLLJ;
            String groupId = this.LJLLL;
            MGV mgv = new MGV() { // from class: X.8lI
                public WeakReference<ActivityC45651qj> LJLIL;

                @Override // X.MGV
                public /* bridge */ /* synthetic */ void onJumpToDetail(String str2) {
                    C220408ku.LIZ(this, str2);
                }

                @Override // X.MGV
                public boolean sendCustomRequest(C51031K1b<? extends AbstractC51036K1g<?, ?>> c51031K1b, int i2) {
                    return false;
                }

                public final WeakReference<ActivityC45651qj> getActivity() {
                    return this.LJLIL;
                }

                public final void setActivity(WeakReference<ActivityC45651qj> weakReference) {
                    this.LJLIL = weakReference;
                }

                @Override // X.MGV
                public MGX getJumpToVideoParam(MGX param, Aweme aweme) {
                    String str2;
                    o.LJIIIZ(param, "param");
                    o.LJIIIZ(aweme, "aweme");
                    param.LIZ = "from_detail_activity";
                    param.LIZIZ = "movie_id";
                    if (aweme.getUploadMiscInfoStruct().mvType == 1) {
                        str2 = "jianying_mv_page";
                    } else {
                        str2 = "mv_page";
                    }
                    param.LIZJ = str2;
                    return param;
                }

                @Override // X.MGV
                public C51031K1b<? extends AbstractC51036K1g<?, ?>> getPresenter(int i2, ActivityC45651qj activityC45651qj) {
                    C51031K1b<? extends AbstractC51036K1g<?, ?>> c51031K1b = new C51031K1b<>();
                    c51031K1b.LJJ(new C8BL());
                    return c51031K1b;
                }

                @Override // X.MGV
                public C220538l7 onCreateDetailAwemeViewHolder(View view, String str2, MH9 mh9) {
                    return new C220538l7(view, str2, mh9) { // from class: X.8lH
                        @Override // X.C220538l7
                        public final void a0(Aweme aweme, int i2, boolean z2, Bundle bundle) {
                            super.a0(aweme, i2, z2, bundle);
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
                                C78765Uvh.LJI(this.LJLLI, aweme.getLabelTop(), (int) KL2.LIZJ(this.LJLJLJ, 6.0f), (int) KL2.LIZJ(this.LJLJLJ, 6.0f), null);
                            }
                        }
                    };
                }
            };
            int i2 = this.LJLILLLLZI;
            o.LJIIIZ(from, "from");
            o.LJIIIZ(groupId, "groupId");
            MovieDetailAwemeListFragment movieDetailAwemeListFragment = new MovieDetailAwemeListFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("detail_aweme_list_type", i);
            bundle.putString("event_label", "movie");
            bundle.putString("detail_id", str);
            boolean z2 = false;
            bundle.putBoolean("extra_challenge_is_hashtag", false);
            bundle.putString("extra_challenge_hashtag_name", "");
            bundle.putString("detail_aweme_from", from);
            bundle.putString("detail_aweme_from_aid", groupId);
            bundle.putInt("detail_source_id", i2);
            movieDetailAwemeListFragment.setArguments(bundle);
            movieDetailAwemeListFragment.LLILLIZIL = mgv;
            if (this.mCurPos == 0) {
                z2 = true;
            }
            movieDetailAwemeListFragment.LLIIJI = z2;
            movieDetailAwemeListFragment.LLIIJLIL = true;
            fragment = movieDetailAwemeListFragment;
        }
        o.LJII(fragment, "null cannot be cast to non-null type com.ss.android.ugc.aweme.mvtemplate.view.MovieDetailAwemeListFragment");
        MovieDetailAwemeListFragment movieDetailAwemeListFragment2 = (MovieDetailAwemeListFragment) fragment;
        this.LJLJJI = movieDetailAwemeListFragment2;
        this.mFragments.add(movieDetailAwemeListFragment2);
        List<AmeBaseFragment> list = this.mFragmentList;
        MovieDetailAwemeListFragment movieDetailAwemeListFragment3 = this.LJLJJI;
        if (movieDetailAwemeListFragment3 != null) {
            list.add(movieDetailAwemeListFragment3);
            this.mFragmentTypes.add(20);
            return new T6H(getChildFragmentManager(), this.mFragmentList, this.mFragmentTypes);
        }
        o.LJIJI("mHotFragment");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LLD).clear();
    }

    public final void refresh() {
        getContext();
        if (C2NU.LIZ.LIZIZ()) {
            if (!this.LL) {
                Dl().setVisibility(0);
                Dl().LJFF();
            }
            C8I9 c8i9 = this.LJLJLLL;
            if (c8i9 != null) {
                c8i9.LJIILL("", this.LJLIL, this.LJLJI, Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLILLLLZI));
                return;
            }
            return;
        }
        ((C80896Voy) _$_findCachedViewById(R.id.kat)).setRefreshing(false);
        C26045AKb c26045AKb = new C26045AKb(this);
        c26045AKb.LJIIIIZZ(R.string.img);
        c26045AKb.LJIIJ();
        if (!this.LL) {
            Dl().setVisibility(0);
            C73305Spp Dl = Dl();
            C73306Spq c73306Spq = new C73306Spq();
            C73312Spw.LJI(c73306Spq, new C74145T8b(this));
            Dl.setStatus(c73306Spq);
        }
    }

    @Override // X.C8IA
    public final void Re0(Exception e) {
        o.LJIIIZ(e, "e");
        C80896Voy c80896Voy = (C80896Voy) _$_findCachedViewById(R.id.kat);
        if (c80896Voy != null) {
            c80896Voy.setRefreshing(false);
        }
        if (isViewValid()) {
            C26045AKb c26045AKb = new C26045AKb(this);
            c26045AKb.LJIIIIZZ(R.string.img);
            c26045AKb.LJIIJ();
            if (this.LL) {
                Dl().setVisibility(8);
                return;
            }
            Dl().setVisibility(0);
            C73305Spp Dl = Dl();
            C73306Spq c73306Spq = new C73306Spq();
            C73312Spw.LJI(c73306Spq, new T8Z(this));
            Dl.setStatus(c73306Spq);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final T6Y createAnimator(ViewGroup viewGroup) {
        o.LJIIIZ(viewGroup, "viewGroup");
        return ((InterfaceC74147T8d) this.LJZI.getValue()).LIZ(viewGroup);
    }

    @Override // X.C8IA
    public final void iQ(MvDetailModel mvDetailModel) {
        String extra;
        String str;
        String str2;
        String str3;
        C80896Voy c80896Voy = (C80896Voy) _$_findCachedViewById(R.id.kat);
        int i = 0;
        if (c80896Voy != null) {
            c80896Voy.setRefreshing(false);
        }
        if (!isViewValid()) {
            return;
        }
        MvModel mvModel = mvDetailModel.mvInfo;
        if (mvModel == null && mvDetailModel.template == null) {
            this.LL = false;
            C26045AKb c26045AKb = new C26045AKb(this);
            c26045AKb.LJIIIIZZ(R.string.img);
            c26045AKb.LJIIJ();
            Dl().setVisibility(0);
            C73305Spp Dl = Dl();
            C73306Spq c73306Spq = new C73306Spq();
            C73312Spw.LJI(c73306Spq, new C74144T8a(this));
            Dl.setStatus(c73306Spq);
            return;
        }
        this.LJLLLLLL = mvModel;
        String str4 = null;
        if (CommerceMediaServiceImpl.LIZJ().LJIIZILJ()) {
            try {
                MvModel mvModel2 = this.LJLLLLLL;
                if (mvModel2 == null || (extra = mvModel2.getExtra()) == null || extra.length() == 0) {
                    Al().setVisibility(8);
                } else {
                    MvModel mvModel3 = this.LJLLLLLL;
                    if (mvModel3 != null) {
                        str = mvModel3.getExtra();
                    } else {
                        str = null;
                    }
                    if (!new JSONObject(str).optBoolean("is_commerce_music", false)) {
                        Al().setVisibility(8);
                    }
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        MovieDetailAwemeListFragment movieDetailAwemeListFragment = this.LJLJJI;
        if (movieDetailAwemeListFragment != null) {
            movieDetailAwemeListFragment.LLILLL = mvDetailModel.mvInfo;
            movieDetailAwemeListFragment.LLIIIILZ = this.LJLLL;
            movieDetailAwemeListFragment.LLILZ = this.LJLJI;
            this.LL = true;
            Dl().setVisibility(8);
            Integer num = this.LJLJI;
            if (num == null || num.intValue() != 2) {
                TextView textView = this.mTitle;
                MvModel mvModel4 = mvDetailModel.mvInfo;
                if (mvModel4 != null) {
                    str4 = mvModel4.getName();
                }
                textView.setText(str4);
            } else {
                TextView textView2 = this.mTitle;
                TemplateResponseItem templateResponseItem = mvDetailModel.template;
                if (templateResponseItem != null) {
                    str4 = templateResponseItem.title;
                }
                textView2.setText(str4);
            }
            mvDetailModel.LIZ = this.LJLJI;
            ((InterfaceC74146T8c) this.LJZL.getValue()).LIZJ(mvDetailModel);
            LogPbBean logPbBean = mvDetailModel.logPb;
            if (logPbBean == null || (str2 = logPbBean.getImprId()) == null) {
                str2 = "";
            }
            this.LJLLLL.setImprId(str2);
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", this.LJLLJ);
            c188727au.LJIIIZ("log_pb", C3A5.LIZ.LIZ(this.LJLLLL));
            c188727au.LJIIIZ("group_id", this.LJLLL);
            c188727au.LJIIIZ("mv_id", this.LJLIL);
            c188727au.LJIIIZ("enter_method", this.LJLLILLLL);
            Integer num2 = this.LJLJI;
            if (num2 != null && num2.intValue() == 2) {
                i = 1;
            }
            c188727au.LIZLLL(i, "is_capcut");
            Integer num3 = this.LJLJI;
            if (num3 == null || num3.intValue() != 2) {
                str3 = "mv";
            } else {
                str3 = "jianying_mv";
            }
            c188727au.LJIIIZ("mv_type", str3);
            FMX.LJIIL("enter_mv_detail", c188727au.LIZ);
            return;
        }
        o.LJIJI("mHotFragment");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final void initArguments(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String string;
        String str4 = "";
        if (bundle == null || (str = bundle.getString("mv_id")) == null) {
            str = "";
        }
        this.LJLIL = str;
        boolean z = false;
        this.mHasRecordHideAnim = false;
        if (bundle == null || (str2 = bundle.getString("enter_method")) == null) {
            str2 = "";
        }
        this.LJLLILLLL = str2;
        Integer num = null;
        if (bundle == null || (str3 = bundle.getString("enter_from")) == null) {
            str3 = "";
        }
        this.LJLLJ = str3;
        if (bundle != null && (string = bundle.getString("group_id")) != null) {
            str4 = string;
        }
        this.LJLLL = str4;
        if (bundle != null) {
            num = Integer.valueOf(bundle.getInt("type", 0));
        }
        this.LJLJI = num;
        int i = 1;
        if (bundle != null) {
            i = bundle.getInt("source_id", 1);
        }
        this.LJLILLLLZI = i;
        if (bundle != null) {
            z = bundle.getBoolean("enter_record_from_feed");
        }
        this.LJZ = z;
        o.LJIIIIZZ(AVExternalServiceImpl.LIZ().configService().shortVideoConfig().cutsameSdkVersion(), "get().getService(IExtern…fig().cutsameSdkVersion()");
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, X.InterfaceC80650Vl0
    public final void onScroll(int i, int i2) {
        super.onScroll(i, i2);
        boolean z = false;
        float f = 0.0f;
        if (this.LJLLI == 0.0f) {
            Object value = this.LJLJJLL.getValue();
            o.LJIIIIZZ(value, "<get-titleTextView>(...)");
            if (((View) value).getVisibility() == 0) {
                int LIZIZ = C7MY.LIZIZ(58);
                o.LJIIIIZZ(this.LJLJJLL.getValue(), "<get-titleTextView>(...)");
                this.LJLLI = (((View) r0).getBottom() + LIZIZ) - this.mTitleColorCtrl.getBottom();
            }
        }
        if (this.LJLL == 0.0f) {
            z = true;
        }
        if (z) {
            o.LJIIIIZZ(this.LJLJLJ.getValue(), "<get-mHeadLayout>(...)");
            this.LJLL = ((View) r0).getBottom() - this.mTitleColorCtrl.getBottom();
        }
        float f2 = i;
        float f3 = this.LJLLI;
        float f4 = (f2 - f3) / (this.LJLL - f3);
        if (f4 > 0.2d) {
            f = f4;
            if (f4 > 1.0f) {
                f = 1.0f;
            }
        }
        this.mTitleColorCtrl.setAlpha(f);
        TextView mTitle = this.mTitle;
        o.LJIIIIZZ(mTitle, "mTitle");
        Object value2 = this.LJLJLJ.getValue();
        o.LJIIIIZZ(value2, "<get-mHeadLayout>(...)");
        float f5 = this.LJLL;
        mTitle.setAlpha(f);
        ((View) value2).setAlpha(1 - (f2 / f5));
        this.LJLZ = T6X.LIZ(f, this.LJLZ, this);
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, X.InterfaceC80650Vl0
    public final void onScrolled(float f, float f2) {
        this.LJLZ = T6X.LIZIZ(f, f2, this.LJLZ, this);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.8I9, X.8BR] */
    @Override // com.ss.android.ugc.aweme.challenge.ui.BaseDetailFragment, com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        ((InterfaceC74146T8c) this.LJZL.getValue()).LIZ(view);
        InterfaceC74147T8d interfaceC74147T8d = (InterfaceC74147T8d) this.LJZI.getValue();
        View findViewById = view.findViewById(R.id.kdf);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.start_record_container)");
        interfaceC74147T8d.LIZIZ((RelativeLayout) findViewById);
        super.onViewCreated(view, bundle);
        if (TextUtils.isEmpty(this.LJLIL)) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                mo49getActivity.finish();
                return;
            }
            return;
        }
        ?? r0 = new C8BR<C8BS<MvDetailModel>, C8IA>() { // from class: X.8I9
            @Override // X.C8BR, X.C8BT
            public final void onSuccess() {
                T t;
                K k = this.LJLILLLLZI;
                if (k != 0 && (t = this.LJLIL) != 0) {
                    Object data = t.getData();
                    o.LJIIIIZZ(data, "mModel.data");
                    ((C8IA) k).iQ((MvDetailModel) data);
                }
            }

            {
                LJJ(new C8BS<MvDetailModel>() { // from class: X.8I8
                    @Override // X.C8BS
                    public final boolean checkParams(Object... params) {
                        o.LJIIIZ(params, "params");
                        return true;
                    }

                    @Override // X.C8BS
                    public final boolean sendRequest(Object... params) {
                        o.LJIIIZ(params, "params");
                        if (!super.sendRequest(params)) {
                            return false;
                        }
                        C8I9 c8i9 = C8I9.this;
                        WeakHandler mHandler = this.mHandler;
                        o.LJIIIIZZ(mHandler, "mHandler");
                        Object obj = params[1];
                        o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
                        Object obj2 = params[2];
                        o.LJII(obj2, "null cannot be cast to non-null type kotlin.Int");
                        int intValue = ((Integer) obj2).intValue();
                        Object obj3 = params[4];
                        o.LJII(obj3, "null cannot be cast to non-null type kotlin.Int");
                        int intValue2 = ((Integer) obj3).intValue();
                        c8i9.getClass();
                        FGR.LIZIZ().LIZ(mHandler, new ACallableS106S0100000_3(new C8BN((String) obj, intValue, intValue2), 10), 0);
                        return true;
                    }
                });
            }

            @Override // X.C8BR, X.C8BT
            public final void onFailed(Exception e) {
                o.LJIIIZ(e, "e");
                K k = this.LJLILLLLZI;
                if (k != 0) {
                    ((C8IA) k).Re0(e);
                }
            }
        };
        this.LJLJLLL = r0;
        r0.LJLILLLLZI = this;
        _$_findCachedViewById(R.id.aej).setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS32S0100000_12(this, 68)));
        if (Al().getVisibility() == 0) {
            C16880lQ.LJIIJ(new ACListenerS27S0100000_7(this, 201), Al());
        }
        if (C186557Tv.LIZ()) {
            ((C80896Voy) _$_findCachedViewById(R.id.kat)).setOnRefreshListener(new AqS162S0100000_12(this, 795));
        } else {
            ((C80896Voy) _$_findCachedViewById(R.id.kat)).setNestedHeader(null);
            ((C80896Voy) _$_findCachedViewById(R.id.kat)).setScrollMode(C8BJ.NONE);
            ((C80896Voy) _$_findCachedViewById(R.id.kat)).setOverScrollMode(EnumC80902Vp4.NONE);
        }
        refresh();
    }
}
