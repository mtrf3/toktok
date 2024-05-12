package com.ss.android.ugc.aweme.ttsvoice.ui;

import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C04330Ez;
import X.C16880lQ;
import X.C184077Kh;
import X.C1BC;
import X.C214298b3;
import X.C214528bQ;
import X.C26045AKb;
import X.C35872E6a;
import X.C48203Ivv;
import X.C48750JBi;
import X.C56412MCa;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72434Sbm;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C74158T8o;
import X.C74159T8p;
import X.C74275TDb;
import X.C76800UCe;
import X.C78926UyI;
import X.C7W1;
import X.C80896Voy;
import X.C86850Y6s;
import X.C8BJ;
import X.E8I;
import X.EnumC80902Vp4;
import X.IWH;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.MGV;
import X.T64;
import X.T6F;
import X.T6H;
import X.T6X;
import X.T6Y;
import X.TBT;
import X.X1D;
import X.XKX;
import Y.ACListenerS21S0100000_1;
import Y.ACListenerS32S0100000_12;
import Y.AObserverS75S0100000_7;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.internal.i;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.audiomode.vopclone.experiment.VopSignUpConfig;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.challenge.ui.BaseDetailFragment;
import com.ss.android.ugc.aweme.detail.AbstractDetailFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.ttsvoice.viewmodel.TTSVoiceDetailsViewModel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;
import q03.IDaS489S0100000_12;

/* loaded from: classes13.dex */
public final class TTSVoiceDetailsFragment extends BaseDetailFragment {
    public static final /* synthetic */ int LLFF = 0;
    public C7W1 LJLIL;
    public RelativeLayout LJLILLLLZI;
    public RelativeLayout LJLJI;
    public C73305Spp LJLJJI;
    public TTSVoiceDetailAwemeListFragment LJLJJL;
    public C80896Voy LJLJJLL;
    public ViewGroup LJLJL;
    public View LJLJLJ;
    public View LJLJLLL;
    public View LJLL;
    public TuxIconView LJLLI;
    public TuxTextView LJLLILLLL;
    public TuxTextView LJLLJ;
    public TuxTextView LJLLL;
    public C72434Sbm LJLLLL;
    public TuxTextView LJLLLLLL;
    public Music LJZI;
    public boolean LJZL;
    public final C214298b3 LLD;
    public final Map<Integer, View> LLF = new LinkedHashMap();
    public String LJLZ = "";
    public String LJZ = "";
    public int LL = -1;

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final String getLabelName(int i) {
        return "tts_page";
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final int getResId() {
        return R.layout.cr3;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final String getShootWayLabel() {
        return "tts_page";
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return false;
    }

    public TTSVoiceDetailsFragment() {
        C65776Prg LIZ = C65352Pkq.LIZ(TTSVoiceDetailsViewModel.class);
        this.LLD = new C214298b3(LIZ, new AqS158S0100000_8((InterfaceC65350Pko) LIZ, 348), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C48750JBi.INSTANCE, (InterfaceC65784Pro) null, 384);
    }

    public final TTSVoiceDetailsViewModel Dl() {
        return (TTSVoiceDetailsViewModel) this.LLD.getValue();
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final C1BC getFragmentPagerAdapter() {
        boolean z;
        this.mFragments = new ArrayList();
        this.mFragmentList = new ArrayList();
        this.mFragmentTypes = new ArrayList();
        FragmentManager childFragmentManager = getChildFragmentManager();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(AbstractDetailFragment.FRAGMENT_TAG);
        LIZ.append('0');
        Fragment LJJJIL = childFragmentManager.LJJJIL(X1D.LIZIZ(LIZ));
        boolean z2 = LJJJIL instanceof TTSVoiceDetailAwemeListFragment;
        Fragment fragment = LJJJIL;
        if (!z2) {
            String id = this.LJLZ;
            MGV mgv = new MGV() { // from class: X.8lQ
                @Override // X.MGV
                public /* bridge */ /* synthetic */ void onJumpToDetail(String str) {
                    C220408ku.LIZ(this, str);
                }

                @Override // X.MGV
                public boolean sendCustomRequest(C51031K1b<? extends AbstractC51036K1g<?, ?>> c51031K1b, int i) {
                    return false;
                }

                @Override // X.MGV
                public MGX getJumpToVideoParam(MGX param, Aweme aweme) {
                    o.LJIIIZ(param, "param");
                    param.LIZ = "from_tts_page";
                    param.LIZIZ = "voice_id";
                    return param;
                }

                @Override // X.MGV
                public C51031K1b<? extends AbstractC51036K1g<?, ?>> getPresenter(int i, ActivityC45651qj activityC45651qj) {
                    C51031K1b<? extends AbstractC51036K1g<?, ?>> c51031K1b = new C51031K1b<>();
                    c51031K1b.LJJ(new C74166T8w());
                    return c51031K1b;
                }

                @Override // X.MGV
                public C220538l7 onCreateDetailAwemeViewHolder(View itemView, String str, MH9 mh9) {
                    o.LJIIIZ(itemView, "itemView");
                    return new C220538l7(itemView, str, mh9) { // from class: X.8lL
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(itemView, str, mh9);
                            o.LJIIIZ(itemView, "itemView");
                        }

                        @Override // X.C220538l7
                        public final void a0(Aweme aweme, int i, boolean z3, Bundle bundle) {
                            boolean z4;
                            super.a0(aweme, i, z3, bundle);
                            if (aweme != null && aweme.isPgcShow()) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                List<AwemeTextLabelModel> list = aweme.textTopLabels;
                                if (list != null && list.size() > 0) {
                                    this.LJLLILLLL.setVisibility(0);
                                    this.LJLLI.setVisibility(8);
                                    TextView textView = this.LJLLILLLL;
                                    List<AwemeTextLabelModel> textTopLabels = aweme.getTextTopLabels();
                                    o.LJIIIIZZ(textTopLabels, "data.getTextTopLabels()");
                                    C220538l7.h0(textView, (AwemeTextLabelModel) ORZ.LJLLJ(textTopLabels));
                                    return;
                                }
                                return;
                            }
                            if (aweme == null) {
                                return;
                            }
                            if (aweme.getOriginAuthor() != null) {
                                this.LJLLJ.setVisibility(0);
                                if (C78685UuP.LJJJZ(aweme.getLabelOriginAuthorText())) {
                                    this.LJLLJ.setText(aweme.getLabelOriginAuthorText());
                                }
                                this.LJLLI.setVisibility(4);
                                return;
                            }
                            if (aweme == null || aweme.getMusicStarter() != null || aweme == null || aweme.getOriginAuthor() != null || aweme == null || aweme.getIsTop() != 1) {
                                return;
                            }
                            if (aweme.getTextTopLabels() != null && aweme.getTextTopLabels().size() > 0) {
                                this.LJLLILLLL.setVisibility(0);
                                this.LJLLI.setVisibility(8);
                                TextView textView2 = this.LJLLILLLL;
                                List<AwemeTextLabelModel> textTopLabels2 = aweme.getTextTopLabels();
                                o.LJIIIIZZ(textTopLabels2, "data.getTextTopLabels()");
                                C220538l7.h0(textView2, (AwemeTextLabelModel) ORZ.LJLLJ(textTopLabels2));
                                return;
                            }
                            this.LJLLILLLL.setVisibility(8);
                            this.LJLLI.setVisibility(0);
                            C78765Uvh.LJI(this.LJLLI, aweme.getLabelTop(), (int) KL2.LIZJ(this.LJLJLJ, 6.0f), (int) KL2.LIZJ(this.LJLJLJ, 6.0f), null);
                        }
                    };
                }
            };
            o.LJIIIZ(id, "id");
            TTSVoiceDetailAwemeListFragment tTSVoiceDetailAwemeListFragment = new TTSVoiceDetailAwemeListFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("detail_aweme_list_type", 33);
            bundle.putString("event_label", "tts_page");
            bundle.putString("detail_id", id);
            tTSVoiceDetailAwemeListFragment.setArguments(bundle);
            tTSVoiceDetailAwemeListFragment.LLILLIZIL = mgv;
            if (this.mCurPos == 0) {
                z = true;
            } else {
                z = false;
            }
            tTSVoiceDetailAwemeListFragment.LLIIJI = z;
            tTSVoiceDetailAwemeListFragment.LLIIJLIL = true;
            fragment = tTSVoiceDetailAwemeListFragment;
        }
        TTSVoiceDetailAwemeListFragment tTSVoiceDetailAwemeListFragment2 = (TTSVoiceDetailAwemeListFragment) fragment;
        this.LJLJJL = tTSVoiceDetailAwemeListFragment2;
        List<T6F> list = this.mFragments;
        if (tTSVoiceDetailAwemeListFragment2 != null) {
            list.add(tTSVoiceDetailAwemeListFragment2);
            List<AmeBaseFragment> list2 = this.mFragmentList;
            TTSVoiceDetailAwemeListFragment tTSVoiceDetailAwemeListFragment3 = this.LJLJJL;
            if (tTSVoiceDetailAwemeListFragment3 != null) {
                list2.add(tTSVoiceDetailAwemeListFragment3);
                this.mFragmentTypes.add(33);
                return new T6H(getChildFragmentManager(), this.mFragmentList, this.mFragmentTypes);
            }
            o.LJIJI("mHotFragment");
            throw null;
        }
        o.LJIJI("mHotFragment");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LLF).clear();
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        IWH LIZ = Dl().gv0().LIZ();
        if (LIZ != null) {
            LIZ.pause();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final String getCurId() {
        return this.LJLZ;
    }

    public final void Al(Context context) {
        if (E8I.LIZIZ()) {
            C86850Y6s.LIZIZ.LIZ.LIZJ(context, "voice_anchor");
            return;
        }
        if (!C35872E6a.LIZ()) {
            return;
        }
        String curUserId = AccountService.LJIJ().LJFF().getCurUserId();
        C62822Ol8 c62822Ol8 = T64.LIZ;
        if (((Keva) c62822Ol8.getValue()).getInt("is_first_enter", 1) == 1) {
            T64.LIZ(1, "voice_anchor", curUserId);
            ((Keva) c62822Ol8.getValue()).storeInt("is_first_enter", 0);
        } else {
            T64.LIZ(0, "voice_anchor", curUserId);
        }
        String str = ((VopSignUpConfig) C35872E6a.LIZIZ.getValue()).webUrl;
        if (str == null) {
            str = "";
        }
        SmartRouter.buildRoute(context, str).open(0, new C74158T8o(curUserId));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        if (r0 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Gl(com.ss.android.ugc.aweme.ttsvoice.model.TTSVoiceDetailsResponse r12) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ttsvoice.ui.TTSVoiceDetailsFragment.Gl(com.ss.android.ugc.aweme.ttsvoice.model.TTSVoiceDetailsResponse):void");
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final T6Y createAnimator(ViewGroup viewGroup) {
        o.LJIIIZ(viewGroup, "viewGroup");
        C7W1 c7w1 = this.LJLIL;
        if (c7w1 != null) {
            return c7w1.LIZ(viewGroup);
        }
        o.LJIJI("buttonDelegate");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final void initArguments(Bundle bundle) {
        Serializable serializable;
        String string;
        String str = "";
        Music music = null;
        if (bundle != null && (string = bundle.getString("voice_id", "")) != null) {
            str = string;
        }
        this.LJLZ = str;
        if (bundle != null) {
            serializable = bundle.getSerializable("music_model");
        } else {
            serializable = null;
        }
        if (serializable instanceof Music) {
            music = (Music) serializable;
        }
        this.LJZI = music;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final void initView(View view) {
        o.LJIIIZ(view, "view");
        super.initView(view);
        View findViewById = view.findViewById(R.id.la4);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.title_layout)");
        this.LJLJI = (RelativeLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.kf_);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.status_view)");
        this.LJLJJI = (C73305Spp) findViewById2;
        View findViewById3 = view.findViewById(R.id.itq);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.refresh_layout)");
        this.LJLJJLL = (C80896Voy) findViewById3;
        View findViewById4 = view.findViewById(R.id.e3y);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.header_container)");
        this.LJLJL = (ViewGroup) findViewById4;
        View findViewById5 = view.findViewById(R.id.nea);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.vop_title_btn)");
        this.LJLJLLL = findViewById5;
        View findViewById6 = view.findViewById(R.id.ne_);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.vop_icon_btn)");
        this.LJLL = findViewById6;
        LayoutInflater layoutInflater = getLayoutInflater();
        ViewGroup viewGroup = this.LJLJL;
        if (viewGroup != null) {
            View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.cr4, viewGroup, true);
            o.LJIIIIZZ(LLLLIILL, "layoutInflater.inflate(R…d, headerContainer, true)");
            this.LJLJLJ = LLLLIILL;
            View findViewById7 = LLLLIILL.findViewById(R.id.hs0);
            o.LJIIIIZZ(findViewById7, "headerView.findViewById(R.id.play_pause)");
            this.LJLLI = (TuxIconView) findViewById7;
            View view2 = this.LJLJLJ;
            if (view2 != null) {
                View findViewById8 = view2.findViewById(R.id.ndx);
                o.LJIIIIZZ(findViewById8, "headerView.findViewById(R.id.voice_title)");
                this.LJLLILLLL = (TuxTextView) findViewById8;
                View view3 = this.LJLJLJ;
                if (view3 != null) {
                    View findViewById9 = view3.findViewById(R.id.ndl);
                    o.LJIIIIZZ(findViewById9, "headerView.findViewById(R.id.voice_creator)");
                    this.LJLLJ = (TuxTextView) findViewById9;
                    View view4 = this.LJLJLJ;
                    if (view4 != null) {
                        View findViewById10 = view4.findViewById(R.id.n_q);
                        o.LJIIIIZZ(findViewById10, "headerView.findViewById(R.id.view_count)");
                        this.LJLLL = (TuxTextView) findViewById10;
                        View view5 = this.LJLJLJ;
                        if (view5 != null) {
                            View findViewById11 = view5.findViewById(R.id.ndj);
                            o.LJIIIIZZ(findViewById11, "headerView.findViewById(R.id.voice_cover)");
                            this.LJLLLL = (C72434Sbm) findViewById11;
                            View view6 = this.LJLJLJ;
                            if (view6 != null) {
                                View findViewById12 = view6.findViewById(R.id.ndz);
                                o.LJIIIIZZ(findViewById12, "headerView.findViewById(R.id.voice_tts_label)");
                                this.LJLLLLLL = (TuxTextView) findViewById12;
                                View findViewById13 = view.findViewById(R.id.kdf);
                                o.LJIIIIZZ(findViewById13, "view.findViewById(R.id.start_record_container)");
                                this.LJLILLLLZI = (RelativeLayout) findViewById13;
                                Context requireContext = requireContext();
                                o.LJIIIIZZ(requireContext, "requireContext()");
                                LayoutInflater layoutInflater2 = getLayoutInflater();
                                o.LJIIIIZZ(layoutInflater2, "layoutInflater");
                                C7W1 c7w1 = new C7W1(requireContext, layoutInflater2, R.string.zu);
                                this.LJLIL = c7w1;
                                RelativeLayout relativeLayout = this.LJLILLLLZI;
                                if (relativeLayout != null) {
                                    c7w1.LIZIZ(relativeLayout);
                                    View startRecordContainer = view.findViewById(R.id.kdb);
                                    o.LJIIIIZZ(startRecordContainer, "startRecordContainer");
                                    C16880lQ.LJIIJ(new ACListenerS21S0100000_1(new AqS174S0100000_8(this, 271), (InterfaceC88472Yns<? super View, C76800UCe>) 255), startRecordContainer);
                                    return;
                                }
                                o.LJIJI("recordContainer");
                                throw null;
                            }
                            o.LJIJI("headerView");
                            throw null;
                        }
                        o.LJIJI("headerView");
                        throw null;
                    }
                    o.LJIJI("headerView");
                    throw null;
                }
                o.LJIJI("headerView");
                throw null;
            }
            o.LJIJI("headerView");
            throw null;
        }
        o.LJIJI("headerContainer");
        throw null;
    }

    public final void J4(boolean z, boolean z2) {
        if (!isViewValid()) {
            C80896Voy c80896Voy = this.LJLJJLL;
            if (c80896Voy != null) {
                c80896Voy.setRefreshing(false);
                return;
            } else {
                o.LJIJI("refreshLayout");
                throw null;
            }
        }
        C73305Spp c73305Spp = this.LJLJJI;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(0);
            Context requireContext = requireContext();
            o.LJIIIIZZ(requireContext, "requireContext()");
            if (!C48203Ivv.LJ(requireContext)) {
                C26045AKb c26045AKb = new C26045AKb(this);
                c26045AKb.LJIIIIZZ(R.string.img);
                c26045AKb.LJIIJ();
                C73305Spp c73305Spp2 = this.LJLJJI;
                if (c73305Spp2 != null) {
                    C73306Spq c73306Spq = new C73306Spq();
                    C73312Spw.LJI(c73306Spq, new AqS162S0100000_12(this, 920));
                    c73305Spp2.setStatus(c73306Spq);
                    C80896Voy c80896Voy2 = this.LJLJJLL;
                    if (c80896Voy2 != null) {
                        c80896Voy2.setRefreshing(false);
                        return;
                    } else {
                        o.LJIJI("refreshLayout");
                        throw null;
                    }
                }
                o.LJIJI("mStatusView");
                throw null;
            }
            C73305Spp c73305Spp3 = this.LJLJJI;
            if (c73305Spp3 != null) {
                c73305Spp3.LJFF();
                TTSVoiceDetailsViewModel Dl = Dl();
                String voiceId = this.LJLZ;
                Dl.getClass();
                o.LJIIIZ(voiceId, "voiceId");
                XKX.LIZLLL(Dl.getAssemVMScope(), null, null, new C74159T8p(Dl, voiceId, null), 3);
                List<T6F> list = this.mFragments;
                if (!z || list == null) {
                    return;
                }
                Iterator<T6F> it = list.iterator();
                while (it.hasNext()) {
                    it.next().J4(false, false);
                }
                return;
            }
            o.LJIJI("mStatusView");
            throw null;
        }
        o.LJIJI("mStatusView");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, X.InterfaceC80650Vl0
    public final void onScroll(int i, int i2) {
        ColorDrawable colorDrawable;
        super.onScroll(i, i2);
        int i3 = this.LL;
        ViewGroup viewGroup = this.LJLJL;
        if (viewGroup != null) {
            if (i3 != viewGroup.getBottom()) {
                ViewGroup viewGroup2 = this.LJLJL;
                if (viewGroup2 != null) {
                    viewGroup2.getBottom();
                    this.mTitleColorCtrl.getBottom();
                    RelativeLayout relativeLayout = this.LJLJI;
                    if (relativeLayout != null) {
                        relativeLayout.getHeight();
                        Context requireContext = requireContext();
                        o.LJIIIIZZ(requireContext, "requireContext()");
                        C74275TDb.LIZIZ(requireContext, 20.0f);
                        ViewGroup viewGroup3 = this.LJLJL;
                        if (viewGroup3 != null) {
                            this.LL = viewGroup3.getBottom();
                        } else {
                            o.LJIJI("headerContainer");
                            throw null;
                        }
                    } else {
                        o.LJIJI("titleLayout");
                        throw null;
                    }
                } else {
                    o.LJIJI("headerContainer");
                    throw null;
                }
            }
            RelativeLayout relativeLayout2 = this.LJLJI;
            if (relativeLayout2 != null) {
                if (i == 0) {
                    RelativeLayout relativeLayout3 = this.LJLJI;
                    if (relativeLayout3 != null) {
                        colorDrawable = new ColorDrawable(C04330Ez.LIZIZ(relativeLayout3.getContext(), R.color.yi));
                    } else {
                        o.LJIJI("titleLayout");
                        throw null;
                    }
                } else {
                    RelativeLayout relativeLayout4 = this.LJLJI;
                    if (relativeLayout4 != null) {
                        Context context = relativeLayout4.getContext();
                        o.LJIIIIZZ(context, "titleLayout.context");
                        colorDrawable = new ColorDrawable(AnonymousClass636.LJIIIIZZ(R.attr.cl, context));
                    } else {
                        o.LJIJI("titleLayout");
                        throw null;
                    }
                }
                relativeLayout2.setBackground(colorDrawable);
                float f = i;
                float f2 = 1;
                float f3 = f / f2;
                float f4 = 0.0f;
                if (f3 < 0.0f) {
                    f3 = 0.0f;
                } else if (f3 > 1.0f) {
                    f3 = 1.0f;
                }
                this.mTitle.setAlpha(f3);
                this.LJZL = T6X.LIZ(f3, this.LJZL, this);
                float f5 = f / i2;
                if (f5 >= 0.0f) {
                    if (f5 > 1.0f) {
                        f4 = 1.0f;
                    } else {
                        f4 = f5;
                    }
                }
                if (E8I.LIZIZ()) {
                    View view = this.LJLJLLL;
                    if (view != null) {
                        view.setAlpha(f2 - f4);
                        View view2 = this.LJLL;
                        if (view2 != null) {
                            if (f4 == 1.0f) {
                                view2.setVisibility(0);
                                return;
                            } else {
                                view2.setVisibility(8);
                                return;
                            }
                        }
                        o.LJIJI("vopIconEntrance");
                        throw null;
                    }
                    o.LJIJI("vopTitleEntrance");
                    throw null;
                }
                return;
            }
            o.LJIJI("titleLayout");
            throw null;
        }
        o.LJIJI("headerContainer");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, X.InterfaceC80650Vl0
    public final void onScrolled(float f, float f2) {
        this.LJZL = T6X.LIZIZ(f, f2, this.LJZL, this);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.BaseDetailFragment, com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (this.LJLZ.length() == 0) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                mo49getActivity.finish();
                return;
            }
            return;
        }
        TextView textView = this.mTitle;
        textView.setAlpha(0.0f);
        C16880lQ.LJIJI(textView, new ACListenerS32S0100000_12(this, 197));
        ImageView mBackBtn = this.mBackBtn;
        o.LJIIIIZZ(mBackBtn, "mBackBtn");
        C16880lQ.LJIIJ(new ACListenerS21S0100000_1(new AqS173S0100000_7(this, 417), (InterfaceC88472Yns<? super View, C76800UCe>) 255), mBackBtn);
        C80896Voy c80896Voy = this.LJLJJLL;
        if (c80896Voy != null) {
            c80896Voy.setOverScrollMode(EnumC80902Vp4.NONE);
            c80896Voy.setScrollMode(C8BJ.NONE);
            c80896Voy.setNestedHeader(null);
            Dl().LJLJJI.observe(getViewLifecycleOwner(), new AObserverS75S0100000_7(this, 123));
            TTSVoiceDetailsViewModel Dl = Dl();
            C56412MCa c56412MCa = new C56412MCa();
            c56412MCa.LIZIZ = i.LJLILLLLZI;
            AssemViewModel.asyncSubscribe$default(Dl, new TBT() { // from class: X.Jcs
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C49566Jco) obj).LJLIL;
                }
            }, c56412MCa, new AqS178S0100000_12(this, 713), null, new AqS178S0100000_12(this, 714), 8, null);
            if (E8I.LIZIZ() || C35872E6a.LIZ()) {
                View view2 = this.LJLJLLL;
                if (view2 != null) {
                    view2.setVisibility(0);
                    View view3 = this.LJLJLLL;
                    if (view3 != null) {
                        C16880lQ.LJIIJ(new IDaS489S0100000_12(this, 14), view3);
                        View view4 = this.LJLL;
                        if (view4 != null) {
                            C16880lQ.LJIIJ(new IDaS489S0100000_12(this, 15), view4);
                        } else {
                            o.LJIJI("vopIconEntrance");
                            throw null;
                        }
                    } else {
                        o.LJIJI("vopTitleEntrance");
                        throw null;
                    }
                } else {
                    o.LJIJI("vopTitleEntrance");
                    throw null;
                }
            }
            J4(false, false);
            return;
        }
        o.LJIJI("refreshLayout");
        throw null;
    }
}
