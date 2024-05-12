package com.ss.android.ugc.aweme.mix.videodetail;

import X.AMD;
import X.ActivityC45651qj;
import X.AnonymousClass944;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C16970lZ;
import X.C184077Kh;
import X.C212418Vh;
import X.C214298b3;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C228098xJ;
import X.C228118xL;
import X.C228888ya;
import X.C229238z9;
import X.C229618zl;
import X.C229718zv;
import X.C25903AEp;
import X.C26227ARb;
import X.C26231ARf;
import X.C29S;
import X.C2MA;
import X.C32151Nz;
import X.C38995FSd;
import X.C3C5;
import X.C53816LAe;
import X.C55657Lsr;
import X.C56302M7u;
import X.C56702Kk;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C80796VnM;
import X.C86793Y4n;
import X.C8OM;
import X.C90903hW;
import X.C92C;
import X.FMX;
import X.FRW;
import X.HG3;
import X.InterfaceC191547fS;
import X.InterfaceC51679KPz;
import X.InterfaceC56526MGk;
import X.InterfaceC65784Pro;
import X.KUR;
import X.LFH;
import X.LKF;
import X.M7D;
import X.M7J;
import X.M7L;
import X.M7N;
import X.M7P;
import X.M7R;
import X.M89;
import X.O6R;
import X.ORZ;
import X.QD3;
import X.RunnableC55655Lsp;
import X.UC0;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility;
import com.ss.android.ugc.aweme.detail.ui.search.MultiTypeDetailPageFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.MixFlowParam;
import com.ss.android.ugc.aweme.mix.bottom.MixBottomBarVM;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import com.ss.android.ugc.aweme.mix.platform.MixVideoDetailPageComponent;
import com.ss.android.ugc.feed.platform.cell.RootCellComponent;
import com.ss.android.ugc.feed.platform.panel.player.PlayerComponentTemp;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS60S0110000_3;
import kotlin.jvm.internal.AqS61S0110000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class MixVideoPlayDetailPageFragment extends MultiTypeDetailPageFragment implements AMD<C25903AEp>, InterfaceC191547fS, InterfaceC56526MGk, C92C {
    public static final int LLIIII = O6R.LJJIIZ(C32151Nz.LJIIZILJ(58));
    public boolean LJLZ;
    public M7D LJZI;
    public TuxSheet LJZL;
    public boolean LLD;
    public boolean LLF;
    public Aweme LLFF;
    public Aweme LLFFF;
    public final C214298b3 LLFZ;
    public final C214378bB LLI;
    public boolean LLIFFJFJJ;
    public final Map<Integer, View> LLII = new LinkedHashMap();
    public final C25903AEp LJLLLLLL = new C25903AEp();
    public String LJZ = "";
    public String LL = "";
    public final C62822Ol8 LLFII = C221108m2.LIZIZ(M7P.LJLIL);

    @Override // com.ss.android.ugc.aweme.detail.ui.search.MultiTypeDetailPageFragment
    public final void Tl(InterfaceC51679KPz interfaceC51679KPz) {
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.search.MultiTypeDetailPageFragment, com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.feed.platform.fragment.detail.DetailComponentFragment, com.ss.android.ugc.aweme.base.ui.CommonPageFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLII).clear();
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.search.MultiTypeDetailPageFragment, com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.feed.platform.fragment.detail.DetailComponentFragment, com.ss.android.ugc.aweme.base.ui.CommonPageFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLII;
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

    public MixVideoPlayDetailPageFragment() {
        AqS60S0110000_3 LJJ;
        C65776Prg LIZ = C65352Pkq.LIZ(MixVideosViewModel.class);
        AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(LIZ, 331);
        M7L m7l = M7L.INSTANCE;
        C214528bQ c214528bQ = C214528bQ.LJLIL;
        AqS61S0110000_4 LJJII = C78926UyI.LJJII(this, true);
        AqS60S0110000_3 LJJIIJZLJL = C78926UyI.LJJIIJZLJL(this, true);
        C184077Kh c184077Kh = C184077Kh.LJLIL;
        this.LLFZ = new C214298b3(LIZ, aqS159S0100000_9, c214528bQ, LJJII, LJJIIJZLJL, c184077Kh, m7l, (InterfaceC65784Pro) null, 384);
        M7R m7r = M7R.LJLIL;
        C65776Prg LIZ2 = C65352Pkq.LIZ(MixBottomBarVM.class);
        M7N m7n = M7N.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJJ = C78926UyI.LJJ(this, false);
        } else {
            LJJ = C78926UyI.LJJ(this, true);
        }
        this.LLI = new C214378bB(LIZ2, m7r, c214528bQ, C78926UyI.LJJII(this, false), c184077Kh, m7n, LJJ, C78926UyI.LJIILLIIL(this, true));
        this.LLIFFJFJJ = true;
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.search.MultiTypeDetailPageFragment, com.ss.android.ugc.aweme.detail.ui.DetailPageFragment
    public final DetailPageComponent Gl() {
        return new MixVideoDetailPageComponent();
    }

    @Override // X.InterfaceC56526MGk
    public final void LIZJ() {
        if (!this.LLIFFJFJJ) {
            return;
        }
        LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.search.MultiTypeDetailPageFragment
    public final MixFlowParam Vl() {
        String eventType = new M89().getEventType();
        if (eventType == null) {
            eventType = "";
        }
        return new MixFlowParam(eventType, "from_mix_video");
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.search.MultiTypeDetailPageFragment
    public final int Wl() {
        C229238z9 searchParam;
        M7D m7d = this.LJZI;
        if (m7d != null && (searchParam = m7d.getSearchParam()) != null) {
            return searchParam.getFlowStartPositionInGeneralSearch();
        }
        return 0;
    }

    public final Keva cm() {
        Object value = this.LLFII.getValue();
        o.LJIIIIZZ(value, "<get-keva>(...)");
        return (Keva) value;
    }

    public final MixVideosViewModel dm() {
        return (MixVideosViewModel) this.LLFZ.getValue();
    }

    public final void hm() {
        TuxSheet tuxSheet;
        if (this.LLD && this.LLF) {
            KUR statusView = Ol().getStatusView();
            if (statusView != null) {
                statusView.LJII();
            }
            HG3.LJIIL();
            if (o.LJ(HG3.LJLJL.LJFF().getCurUserId(), dm().LJLLJ)) {
                Context context = getContext();
                o.LJI(context);
                C26227ARb c26227ARb = new C26227ARb(context);
                String string = getString(R.string.g33);
                o.LJIIIIZZ(string, "getString(R.string.empty_prompt)");
                String LLLZ = C16880lQ.LLLZ(string, Arrays.copyOf(new Object[]{this.LL}, 1));
                o.LJIIIIZZ(LLLZ, "format(format, *args)");
                c26227ARb.LJFF(LLLZ);
                c26227ARb.LIZ(R.string.g34);
                UC0.LIZJ(c26227ARb, new AqS170S0100000_4(this, 878));
                C26231ARf LJI = c26227ARb.LJI();
                LJI.LIZLLL();
                LJI.LJIIIIZZ();
                TuxSheet tuxSheet2 = this.LJZL;
                if (tuxSheet2 != null) {
                    tuxSheet2.dismiss();
                }
            } else {
                Context context2 = getContext();
                o.LJI(context2);
                C26227ARb c26227ARb2 = new C26227ARb(context2);
                String string2 = getString(R.string.g33);
                o.LJIIIIZZ(string2, "getString(R.string.empty_prompt)");
                String LLLZ2 = C16880lQ.LLLZ(string2, Arrays.copyOf(new Object[]{this.LL}, 1));
                o.LJIIIIZZ(LLLZ2, "format(format, *args)");
                c26227ARb2.LIZIZ(LLLZ2);
                UC0.LIZJ(c26227ARb2, new AqS170S0100000_4(this, 880));
                C26231ARf LJI2 = c26227ARb2.LJI();
                LJI2.LIZLLL();
                LJI2.LJIIIIZZ();
                M7D m7d = this.LJZI;
                if (m7d != null && m7d.getFromShare() && (tuxSheet = this.LJZL) != null) {
                    tuxSheet.dismiss();
                }
            }
            this.LLD = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment
    public final DetailFragmentPanel Hl() {
        String str;
        HG3.LJIIL();
        String curUserId = HG3.LJLJL.LJFF().getCurUserId();
        M7D m7d = this.LJZI;
        if (m7d != null) {
            str = m7d.getPreviousPage();
        } else {
            str = null;
        }
        o.LJ(curUserId, this.LJLJJI.getUid());
        return new MixVideoPlayDetailPageFragmentPanel(this.LJLJJI, str);
    }

    @Override // X.InterfaceC191547fS
    public final void LJIIJJI() {
        dm().iv0(Long.valueOf(dm().LJLLILLLL), "", "");
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment
    public final void Pl() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putString("com.ss.android.ugc.aweme.intent.extra.FEED_PANEL_SCENE", "DETAIL_MIX_VIDEO");
        }
    }

    @Override // X.C92C
    public final boolean R0() {
        if (!C228098xJ.LIZIZ()) {
            return true;
        }
        return cm().getBoolean("autoplay_toast_show", false);
    }

    @Override // X.C92C
    public final boolean Td() {
        Object obj;
        if (!Yl()) {
            return true;
        }
        List<Aweme> list = dm().getVmDispatcher().getState().LJLIL;
        if (list != null) {
            obj = ORZ.LLFF(list);
        } else {
            obj = null;
        }
        if (!o.LJ(obj, Ol().getAweme()) || dm().LJLL) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r1 == (r0 - 1)) goto L13;
     */
    @Override // X.C92C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean W3() {
        /*
            r7 = this;
            boolean r0 = X.C228098xJ.LIZIZ()
            java.lang.String r4 = "autoplay_toast_show"
            r3 = 0
            if (r0 == 0) goto L27
            com.bytedance.keva.Keva r0 = r7.cm()
            boolean r0 = r0.getBoolean(r4, r3)
            if (r0 != 0) goto L27
            com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel r0 = r7.LJLJI
            r2 = 1
            if (r0 == 0) goto L32
            int r1 = r0.getCurIndex()
            com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel r0 = r7.LJLJI
            if (r0 == 0) goto L30
            int r0 = r0.getItemCount()
        L24:
            int r0 = r0 - r2
            if (r1 != r0) goto L32
        L27:
            com.bytedance.keva.Keva r0 = r7.cm()
            boolean r0 = r0.getBoolean(r4, r3)
            return r0
        L30:
            r0 = 0
            goto L24
        L32:
            boolean r0 = r7.f()
            if (r0 != 0) goto L27
            com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel r0 = r7.LJLJI
            if (r0 == 0) goto L43
            boolean r0 = r0.isScrollDragging()
            if (r0 != r2) goto L43
            goto L27
        L43:
            com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel r0 = r7.LJLJI
            if (r0 == 0) goto L4e
            boolean r0 = r0.isPinching()
            if (r0 != r2) goto L4e
            goto L27
        L4e:
            com.bytedance.keva.Keva r0 = r7.cm()
            r0.storeBoolean(r4, r2)
            r6 = 2131362846(0x7f0a041e, float:1.8345484E38)
            android.view.View r5 = r7._$_findCachedViewById(r6)
            if (r5 != 0) goto La7
        L5e:
            android.view.View r0 = r7._$_findCachedViewById(r6)
            if (r0 == 0) goto L67
            X.C17N.LJJLIIIJJI(r0)
        L67:
            android.view.View r1 = r7._$_findCachedViewById(r6)
            if (r1 != 0) goto La2
        L6d:
            android.view.View r0 = r7._$_findCachedViewById(r6)
            if (r0 == 0) goto L99
            android.view.ViewPropertyAnimator r1 = r0.animate()
            if (r1 == 0) goto L99
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r2 = r1.alpha(r0)
            if (r2 == 0) goto L99
            r0 = 100
            android.view.ViewPropertyAnimator r2 = r2.setDuration(r0)
            if (r2 == 0) goto L99
            Y.ARunnableS45S0100000_9 r1 = new Y.ARunnableS45S0100000_9
            r0 = 82
            r1.<init>(r7, r0)
            android.view.ViewPropertyAnimator r0 = r2.withEndAction(r1)
            if (r0 == 0) goto L99
            r0.start()
        L99:
            com.bytedance.keva.Keva r0 = r7.cm()
            boolean r0 = r0.getBoolean(r4, r3)
            return r0
        La2:
            r0 = 0
            r1.setAlpha(r0)
            goto L6d
        La7:
            android.content.Context r2 = r7.getContext()
            if (r2 == 0) goto Lcb
            X.4Vt r1 = new X.4Vt
            r1.<init>()
            r0 = 2130968630(0x7f040036, float:1.754592E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.LIZIZ = r0
            r0 = 24
            java.lang.Float r0 = X.C61328O5c.LIZJ(r0)
            r1.LIZJ = r0
            android.graphics.drawable.Drawable r0 = r1.LIZ(r2)
        Lc7:
            r5.setBackground(r0)
            goto L5e
        Lcb:
            r0 = 0
            goto Lc7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mix.videodetail.MixVideoPlayDetailPageFragment.W3():boolean");
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.search.MultiTypeDetailPageFragment
    public final TuxTextView Xl() {
        return (TuxTextView) _$_findCachedViewById(R.id.c98);
    }

    @Override // X.C92C
    public final boolean f() {
        if (CommentServiceImpl.LJJL().LJJIIZ(mo49getActivity()) || !this.LJLZ) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC56526MGk
    public final boolean hasMore() {
        return dm().LJLL;
    }

    public final void km() {
        String str;
        C229238z9 c229238z9;
        String mSecUid;
        DetailFragmentPanel detailFragmentPanel;
        C2MA curViewHolder;
        RootCellComponent LJJIII;
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (AnonymousClass944.LIZ && (detailFragmentPanel = this.LJLJI) != null && (curViewHolder = detailFragmentPanel.getCurViewHolder()) != null && (LJJIII = C86793Y4n.LJJIII(curViewHolder)) != null) {
            LJJIII.c4(C8OM.PAUSE);
        }
        String str2 = this.LJZ;
        Aweme aweme = this.LLFF;
        M7D m7d = this.LJZI;
        String str3 = "";
        if (m7d == null || (str = m7d.getMUsrId()) == null) {
            str = "";
        }
        M7D m7d2 = this.LJZI;
        if (m7d2 != null && (mSecUid = m7d2.getMSecUid()) != null) {
            str3 = mSecUid;
        }
        M7D m7d3 = this.LJZI;
        C229238z9 c229238z92 = null;
        if (m7d3 != null) {
            c229238z9 = m7d3.getSearchParam();
        } else {
            c229238z9 = null;
        }
        this.LJZL = C56302M7u.LIZ(context, "playlist", str2, aweme, str, str3, "", c229238z9, new AqS159S0100000_9(this, 330));
        Aweme aweme2 = this.LLFFF;
        String str4 = this.LJZ;
        M7D m7d4 = this.LJZI;
        if (m7d4 != null) {
            c229238z92 = m7d4.getSearchParam();
        }
        C228888ya.LJFF(aweme2, str4, "playlist", c229238z92);
        dm().LJLJL = this.LLFFF;
        dm().setState(M7J.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C212418Vh.LJIIJJI(dm(), new AqS175S0100000_9(this, 141));
        if (C228118xL.LIZJ() || C228118xL.LIZ()) {
            C38995FSd.LIZLLL().execute(RunnableC55655Lsp.LJLIL);
        }
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // X.AMD
    public final /* bridge */ /* synthetic */ C25903AEp getViewModelFactory() {
        return this.LJLLLLLL;
    }

    @Override // X.InterfaceC56526MGk
    public final void A8(boolean z) {
        this.LLIFFJFJJ = false;
    }

    public final void em(List list) {
        String str;
        String str2;
        IAwemeService LIZ = AwemeService.LIZ();
        Aweme aweme = dm().LJLJJLL;
        if (aweme == null || (str = aweme.getAid()) == null) {
            str = "";
        }
        Aweme i6 = LIZ.i6(str);
        Iterator it = ((ArrayList) list).iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            Aweme aweme2 = (Aweme) it.next();
            String aid = aweme2.getAid();
            Aweme aweme3 = dm().LJLJJLL;
            if (aweme3 != null) {
                str2 = aweme3.getAid();
            } else {
                str2 = null;
            }
            if (o.LJ(aid, str2) && i6 != null) {
                ListProtector.set(list, i, i6);
            } else {
                Aweme R1 = AwemeService.LIZ().R1(aweme2);
                o.LJI(R1);
                ListProtector.set(list, i, R1);
            }
            i = i2;
        }
    }

    public final void fm(List<? extends Aweme> list) {
        C80796VnM viewPager;
        PagerAdapter adapter;
        DetailFragmentPanel detailFragmentPanel;
        M7D m7d;
        Aweme aweme;
        String aid;
        DetailFragmentPanel detailFragmentPanel2;
        M89 m89;
        IDetailPageAbility Ml;
        DetailFragmentPanel Wr;
        PlayerComponentTemp playerComponentTemp;
        if (list.isEmpty()) {
            this.LLD = true;
            hm();
        }
        if (dm().LJLJJLL != null && Zl(dm().LJLJJLL, list) != 0 && (Ml = Ml()) != null && (Wr = Ml.Wr()) != null && (playerComponentTemp = Wr.playerComponent) != null) {
            playerComponentTemp.Cm0();
        }
        if (Yl()) {
            MixVideosViewModel dm = dm();
            List LLJILJILJ = ORZ.LLJILJILJ(list);
            em(LLJILJILJ);
            C229618zl c229618zl = new C229618zl(1, LLJILJILJ, dm().LJLL);
            dm.getClass();
            dm.withState(new AqS140S0200000_9(dm, c229618zl, 98));
        } else {
            M7D m7d2 = this.LJZI;
            if (m7d2 != null && m7d2.getShowLast() && (m7d = this.LJZI) != null && m7d.getTotalVideoCount() > 1 && (aweme = (Aweme) ORZ.LLFII(list)) != null && (aid = aweme.getAid()) != null && (detailFragmentPanel2 = this.LJLJI) != null && (m89 = detailFragmentPanel2.param) != null) {
                m89.setAid(aid);
            }
            if (C228118xL.LIZJ() || C228118xL.LIZ()) {
                ArrayList arrayList = new ArrayList();
                for (Aweme aweme2 : list) {
                    if (o.LJ(aweme2.getAid(), C55657Lsr.LIZ(this.LJZ))) {
                        arrayList.add(aweme2);
                    }
                }
                DetailFragmentPanel detailFragmentPanel3 = this.LJLJI;
                if (detailFragmentPanel3 != null && (viewPager = detailFragmentPanel3.getViewPager()) != null && (adapter = viewPager.getAdapter()) != null && adapter.getCount() == 0 && (true ^ arrayList.isEmpty()) && (detailFragmentPanel = this.LJLJI) != null) {
                    String aid2 = ((Aweme) ORZ.LJLLJ(arrayList)).getAid();
                    M89 m892 = detailFragmentPanel.param;
                    if (m892 != null) {
                        m892.setAid(aid2);
                    }
                }
            }
            DetailFragmentPanel detailFragmentPanel4 = this.LJLJI;
            if (detailFragmentPanel4 != null) {
                List<Aweme> LLJILJILJ2 = ORZ.LLJILJILJ(list);
                em(LLJILJILJ2);
                detailFragmentPanel4.J5(LLJILJILJ2, dm().LJLL);
            }
        }
        FRW.LIZ("playlist_first_open_dialog_cost_time");
        FMX.onEventV3("playlist_first_frame");
        C212418Vh.LJIIJJI(dm(), new AqS175S0100000_9(this, UserLevelGeckoUpdateSetting.DEFAULT));
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCommentListPanelShow(C56702Kk event) {
        MixVideoPlayDetailPageFragmentPanel mixVideoPlayDetailPageFragmentPanel;
        o.LJIIIZ(event, "event");
        if (event.LJLIL == 1) {
            DetailFragmentPanel detailFragmentPanel = this.LJLJI;
            if ((detailFragmentPanel instanceof MixVideoPlayDetailPageFragmentPanel) && (mixVideoPlayDetailPageFragmentPanel = (MixVideoPlayDetailPageFragmentPanel) detailFragmentPanel) != null) {
                mixVideoPlayDetailPageFragmentPanel.LJIIIIZZ("panel_open");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x031d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x029b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ae  */
    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mix.videodetail.MixVideoPlayDetailPageFragment.onCreate(android.os.Bundle):void");
    }

    public static int Zl(Aweme aweme, List list) {
        String str;
        if (list != null) {
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                String aid = ((Aweme) it.next()).getAid();
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                if (o.LJ(aid, str)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0266, code lost:
    
        if (r2.equals(r0) == false) goto L23;
     */
    @Override // com.ss.android.ugc.aweme.detail.ui.search.MultiTypeDetailPageFragment, com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mix.videodetail.MixVideoPlayDetailPageFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View rootView;
        Object obj;
        o.LJIIIZ(inflater, "inflater");
        C29S c29s = null;
        if (C16970lZ.LIZ(R.layout.bt8, null)) {
            FRW.LIZIZ(-1L, "playlist_detail_inflate");
        } else {
            FRW.LIZIZ(-2L, "playlist_detail_inflate");
        }
        FRW.LIZLLL("playlist_detail_inflate");
        if (C229718zv.LIZ) {
            rootView = C16970lZ.LIZJ(R.layout.bt8, mo49getActivity(), viewGroup, false);
        } else {
            rootView = C16880lQ.LLLLIILL(inflater, R.layout.bt8, viewGroup, false);
        }
        FRW.LIZ("playlist_detail_inflate");
        LFH.LIZIZ.LIZLLL().LJIILIIL();
        C53816LAe c53816LAe = C53816LAe.LIZ;
        DetailFragmentPanel detailFragmentPanel = this.LJLJI;
        if (detailFragmentPanel != null) {
            obj = detailFragmentPanel.getSplitTag();
        } else {
            obj = null;
        }
        if (obj == null) {
            obj = 0;
        }
        String valueOf = String.valueOf(obj);
        o.LJIIIIZZ(rootView, "rootView");
        LKF LIZ = c53816LAe.LIZ(rootView, this, valueOf);
        Ol().LLLLL(LIZ);
        View LJIILJJIL = LIZ.LJIILJJIL();
        if (!(LJIILJJIL instanceof View)) {
            LJIILJJIL = null;
        }
        if (LJIILJJIL != null) {
            try {
                ViewTreeLifecycleOwner.set(LJIILJJIL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LJIILJJIL, this);
                C10A.LIZIZ(LJIILJJIL, this);
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
        return LJIILJJIL;
    }
}
