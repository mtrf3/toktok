package com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.qa;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C226388uY;
import X.C234529Ii;
import X.C234869Jq;
import X.C252709vu;
import X.C29S;
import X.C3C5;
import X.C47261Igj;
import X.C61712OJw;
import X.C61713OJx;
import X.C72045SPh;
import X.C73318Sq2;
import X.C73969T1h;
import X.C76800UCe;
import X.C90903hW;
import X.C9KF;
import X.INH;
import X.INI;
import X.InterfaceC61213O0r;
import X.InterfaceC64592gB;
import X.JBS;
import X.SKJ;
import X.SKL;
import X.SL7;
import X.SLF;
import X.SLG;
import X.SLJ;
import X.SLR;
import X.SLS;
import X.SLT;
import X.SLU;
import X.SLV;
import X.SN1;
import X.SNL;
import X.T16;
import Y.AObserverS75S0200000_12;
import Y.AObserverS80S0100000_12;
import Y.AfS64S0100000_12;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.addyours.AddYoursProfileEntryViewModel;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.qa.QAProfileEntranceViewModel;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes13.dex */
public final class QASettingFragment extends Fragment implements JBS, SKJ {
    public boolean LJLIL;
    public List<? extends SLJ> LJLILLLLZI;
    public SLS LJLJI;
    public SLJ LJLJJI;
    public BasePrivacySettingViewModel LJLJJL;
    public QAInviteViewModel LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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

    @Override // X.JBS
    public final /* synthetic */ void onBeforeActivityCreated(Activity activity) {
    }

    @Override // X.JBS
    public final /* synthetic */ void onNewIntent(Intent intent) {
    }

    @Override // X.SKJ
    public final void Ra() {
        String LLIIIILZ;
        List<? extends SLJ> list = this.LJLILLLLZI;
        if (list == null) {
            return;
        }
        String str = null;
        Iterator<? extends SLJ> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            SLJ next = it.next();
            if ((next instanceof SN1) && (LLIIIILZ = ((SN1) next).LLIIIILZ()) != null) {
                str = LLIIIILZ;
                break;
            }
        }
        TextView textView = (TextView) _$_findCachedViewById(R.id.lgi);
        if (textView != null) {
            if (str == null || str.length() == 0) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(str);
            }
        }
    }

    @Override // X.JBS
    public final void onBackPressed_Activity() {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        SKL skl;
        Intent intent;
        super.onCreate(bundle);
        C61713OJx LIZIZ = C61712OJw.LIZIZ(this);
        LIZIZ.LIZ(true);
        LIZIZ.LJII(R.attr.cl);
        LIZIZ.LIZJ();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (intent = mo49getActivity.getIntent()) != null) {
            intent.putExtra("activity_translation_type", 0);
        }
        SNL.LIZIZ().getClass();
        C72045SPh.LIZ(false);
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 != null) {
            skl = new SKL(mo49getActivity2);
        } else {
            skl = new SKL(this);
        }
        this.LJLIL = C234869Jq.LIZ();
        Context context = getContext();
        if (context != null) {
            if (this.LJLIL) {
                AddYoursProfileEntryViewModel addYoursProfileEntryViewModel = (AddYoursProfileEntryViewModel) new ViewModelProvider(this).get(AddYoursProfileEntryViewModel.class);
                addYoursProfileEntryViewModel.mv0(skl);
                ((C73318Sq2) addYoursProfileEntryViewModel.LJLJJL.getValue()).LIZ(SLF.LIZ().LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS64S0100000_12(addYoursProfileEntryViewModel, 119), SLT.LJLIL));
                this.LJLJJI = new SL7(addYoursProfileEntryViewModel, context);
                addYoursProfileEntryViewModel.LJLJI.observe(this, new AObserverS80S0100000_12(this, 105));
                addYoursProfileEntryViewModel.LJLJJI.observe(this, new AObserverS80S0100000_12(this, 106));
                this.LJLJJL = addYoursProfileEntryViewModel;
            } else {
                QAProfileEntranceViewModel qAProfileEntranceViewModel = (QAProfileEntranceViewModel) new ViewModelProvider(this).get(QAProfileEntranceViewModel.class);
                qAProfileEntranceViewModel.mv0(skl);
                ActivityC45651qj mo49getActivity3 = mo49getActivity();
                o.LJI(mo49getActivity3);
                if (mo49getActivity3.getIntent().hasExtra("enable_qna_on_profile")) {
                    ActivityC45651qj mo49getActivity4 = mo49getActivity();
                    o.LJI(mo49getActivity4);
                    qAProfileEntranceViewModel.LJLJI.postValue(Integer.valueOf(mo49getActivity4.getIntent().getIntExtra("enable_qna_on_profile", -1)));
                } else {
                    SLF.LIZ().LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJIJJLI(SLU.LJLIL).LJIJJ(SLV.LJLIL).LJJJLIIL(new AfS64S0100000_12(qAProfileEntranceViewModel, 145), new InterfaceC64592gB() { // from class: X.9ET
                        @Override // X.InterfaceC64592gB
                        public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        }
                    });
                }
                this.LJLJJI = new SLG(qAProfileEntranceViewModel, this);
                this.LJLJJL = qAProfileEntranceViewModel;
            }
        }
        Context context2 = getContext();
        if (context2 != null) {
            QAInviteViewModel qAInviteViewModel = (QAInviteViewModel) new ViewModelProvider(this).get(QAInviteViewModel.class);
            qAInviteViewModel.mv0(skl);
            qAInviteViewModel.LJLJLLL = this.LJLIL;
            this.LJLJI = new SLS(qAInviteViewModel, context2, this, skl);
            this.LJLJJLL = qAInviteViewModel;
        }
        if (!this.LJLIL) {
            return;
        }
        QAInviteViewModel qAInviteViewModel2 = this.LJLJJLL;
        if (qAInviteViewModel2 != null) {
            MutableLiveData<Integer> liveData = qAInviteViewModel2.LJLJI;
            INH transformer = INH.LJLIL;
            o.LJIIIZ(liveData, "liveData");
            o.LJIIIZ(transformer, "transformer");
            qAInviteViewModel2.LJLJL.addSource(liveData, new AObserverS75S0200000_12(transformer, qAInviteViewModel2, 41));
            QAInviteViewModel qAInviteViewModel3 = this.LJLJJLL;
            if (qAInviteViewModel3 != null) {
                BasePrivacySettingViewModel basePrivacySettingViewModel = this.LJLJJL;
                if (basePrivacySettingViewModel != null) {
                    MutableLiveData<Integer> liveData2 = basePrivacySettingViewModel.LJLJI;
                    INI transformer2 = INI.LJLIL;
                    o.LJIIIZ(liveData2, "liveData");
                    o.LJIIIZ(transformer2, "transformer");
                    qAInviteViewModel3.LJLJL.addSource(liveData2, new AObserverS75S0200000_12(transformer2, qAInviteViewModel3, 41));
                    QAInviteViewModel qAInviteViewModel4 = this.LJLJJLL;
                    if (qAInviteViewModel4 != null) {
                        qAInviteViewModel4.LJLJLJ.observe(this, new AObserverS80S0100000_12(this, 104));
                        return;
                    } else {
                        o.LJIJI("inviteVM");
                        throw null;
                    }
                }
                o.LJIJI("profileEntryVM");
                throw null;
            }
            o.LJIJI("inviteVM");
            throw null;
        }
        o.LJIJI("inviteVM");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.la4);
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
        LIZJ.LIZIZ(new AqS162S0100000_12(this, 172));
        c252709vu.LIZJ(LIZJ);
        getContext();
        ((RecyclerView) _$_findCachedViewById(R.id.ftq)).setLayoutManager(new WrapLinearLayoutManager(1));
        ((RecyclerView) _$_findCachedViewById(R.id.ftq)).setItemAnimator(null);
        SLJ[] sljArr = new SLJ[2];
        SLJ slj = this.LJLJJI;
        if (slj != null) {
            sljArr[0] = slj;
            SLS sls = this.LJLJI;
            if (sls != null) {
                sljArr[1] = sls;
                this.LJLILLLLZI = C47261Igj.LJJIJIIJI(sljArr);
                RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.ftq);
                List<? extends SLJ> list = this.LJLILLLLZI;
                if (list != null) {
                    recyclerView.setAdapter(SLR.LIZ(list));
                    Ra();
                    if (this.LJLIL) {
                        String string = getString(C226388uY.LIZJ(R.string.beu, R.string.bev));
                        o.LJIIIIZZ(string, "getString(titleResId)");
                        C252709vu c252709vu2 = (C252709vu) _$_findCachedViewById(R.id.la4);
                        C9KF c9kf = new C9KF();
                        c9kf.LIZJ = string;
                        c252709vu2.LJIILLIIL(c9kf);
                        return;
                    }
                    String string2 = getString(R.string.ppt);
                    o.LJIIIIZZ(string2, "getString(R.string.qapublic_qasettings)");
                    C252709vu c252709vu3 = (C252709vu) _$_findCachedViewById(R.id.la4);
                    C9KF c9kf2 = new C9KF();
                    c9kf2.LIZJ = string2;
                    c252709vu3.LJIILLIIL(c9kf2);
                    return;
                }
                o.LJIJI("adapters");
                throw null;
            }
            o.LJIJI("inviteAdapter");
            throw null;
        }
        o.LJIJI("profileEntranceAdapter");
        throw null;
    }

    @Override // X.JBS
    public final void onActivityResult_Activity(int i, int i2, Intent intent) {
        onActivityResult(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ahi, viewGroup, false);
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
