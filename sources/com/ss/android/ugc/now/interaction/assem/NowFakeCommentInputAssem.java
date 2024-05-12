package com.ss.android.ugc.now.interaction.assem;

import X.ActivityC45651qj;
import X.AnonymousClass729;
import X.C16880lQ;
import X.C1788570f;
import X.C1788770h;
import X.C1788870i;
import X.C1790070u;
import X.C1790170v;
import X.C1790370x;
import X.C1B3;
import X.C212428Vi;
import X.C213688a4;
import X.C214298b3;
import X.C221108m2;
import X.C224738rt;
import X.C2K0;
import X.C55096Ljo;
import X.C62562cu;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71799SFv;
import X.C71Y;
import X.C73G;
import X.C78926UyI;
import X.C79234V7u;
import X.C8YN;
import X.C9BD;
import X.C9BE;
import X.InterfaceC55102Lju;
import X.TBT;
import X.ViewOnClickListenerC13880ga;
import Y.ACListenerS22S0101000_3;
import Y.ACListenerS23S0100000_3;
import Y.IDObjectS176S0100000_3;
import Y.IDTListenerS113S0100000_3;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.NowKeyboardFragment;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.NowKeyboardVM;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowFakeCommentInputAssem extends UISlotAssem implements IFakeKeyboardInputAssemAbility, InterfaceC55102Lju {
    public static final /* synthetic */ int LL = 0;
    public C73G LJLJLLL;
    public final C214298b3 LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;
    public String LJLLLLLL;
    public String LJLZ;
    public Comment LJZ;
    public String LJZI;
    public final Map<Integer, View> LJZL = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJZL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -430695812) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.qr;
    }

    public NowFakeCommentInputAssem() {
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(NowKeyboardVM.class);
        this.LJLL = C78926UyI.LJ(this, LIZ, c9bd, new AqS153S0100000_3(LIZ, 1386), C1790070u.INSTANCE, null);
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ2 = C65352Pkq.LIZ(CommentListVM.class);
        C78926UyI.LJ(this, LIZ2, c9be, new AqS153S0100000_3(LIZ2, 1387), C1790170v.INSTANCE, null);
        this.LJLLI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1381));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1384));
        this.LJLLJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1385));
        this.LJLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1383));
        this.LJLLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1382));
        this.LJLZ = CardStruct.IStatusCode.DEFAULT;
    }

    public final C224738rt H3() {
        Object value = this.LJLLLL.getValue();
        o.LJIIIIZZ(value, "<get-editTextComment>(...)");
        return (C224738rt) value;
    }

    public final C73G I3() {
        C73G c73g = this.LJLJLLL;
        if (c73g == null) {
            return C63081OpJ.LJJII(this);
        }
        return c73g;
    }

    public final NowKeyboardVM K3() {
        return (NowKeyboardVM) this.LJLL.getValue();
    }

    @Override // X.C8W0
    public final void onParentSet() {
        C55096Ljo.LIZJ(this);
    }

    public final void L3(C1788870i c1788870i) {
        ActivityC45651qj mo49getActivity;
        int i;
        View childAt;
        Fragment LJIIIZ = C79234V7u.LJIIIZ(H3());
        if (LJIIIZ != null && (mo49getActivity = LJIIIZ.mo49getActivity()) != null) {
            C71Y.LIZLLL("xjccccc", "showKeyboardFragment click input ");
            if (c1788870i != null) {
                c1788870i.LIZIZ = H3().getEditableText();
            }
            C73G I3 = I3();
            long currentTimeMillis = System.currentTimeMillis();
            C1788570f c1788570f = C1788770h.LIZ;
            if (c1788570f.LIZIZ == 0) {
                c1788570f.LIZIZ = currentTimeMillis;
            }
            ViewGroup viewGroup = (ViewGroup) mo49getActivity.findViewById(android.R.id.content);
            if (viewGroup != null) {
                i = viewGroup.getChildCount();
            } else {
                i = 0;
            }
            View view = null;
            boolean z = false;
            int i2 = -1;
            for (int i3 = 0; i3 < i; i3++) {
                if (viewGroup != null && (childAt = viewGroup.getChildAt(i3)) != null) {
                    if (childAt.getId() == R.id.h6l) {
                        i2 = i3;
                        view = childAt;
                        z = true;
                    } else {
                        childAt.getId();
                    }
                }
            }
            if (z && viewGroup != null) {
                C16880lQ.LLIFFJFJJ(i2, viewGroup);
                viewGroup.addView(view);
            }
            Window window = mo49getActivity.getWindow();
            if (window != null) {
                window.setSoftInputMode(48);
            }
            FragmentManager supportFragmentManager = mo49getActivity.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
            Fragment LJJJIL = supportFragmentManager.LJJJIL("NowKeyboardFragment");
            View findViewById = mo49getActivity.findViewById(R.id.h6l);
            if ((LJJJIL instanceof NowKeyboardFragment) && findViewById != null) {
                NowKeyboardFragment nowKeyboardFragment = (NowKeyboardFragment) LJJJIL;
                nowKeyboardFragment.LLJJIJI(I3);
                nowKeyboardFragment.LJLIL = c1788870i;
                nowKeyboardFragment.xl();
                return;
            }
            if (LJJJIL != null) {
                C1B3 c1b3 = new C1B3(supportFragmentManager);
                c1b3.LJJI(LJJJIL);
                c1b3.LJI();
            }
            if (findViewById == null) {
                FrameLayout frameLayout = new FrameLayout(mo49getActivity);
                frameLayout.setId(R.id.h6l);
                if (viewGroup != null) {
                    viewGroup.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
                }
            }
            NowKeyboardFragment nowKeyboardFragment2 = new NowKeyboardFragment();
            nowKeyboardFragment2.LLJJIJI(I3);
            nowKeyboardFragment2.LJLIL = c1788870i;
            C1B3 c1b32 = new C1B3(supportFragmentManager);
            c1b32.LJIIIIZZ(R.id.h6l, 1, nowKeyboardFragment2, "NowKeyboardFragment");
            c1b32.LJI();
            nowKeyboardFragment2.xl();
        }
    }

    @Override // com.ss.android.ugc.now.interaction.assem.IFakeKeyboardInputAssemAbility
    public final void LLJJIJI(C73G c73g) {
        this.LJLJLLL = c73g;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int i;
        int LJIIZILJ;
        String str;
        String enterFrom;
        o.LJIIIZ(view, "view");
        C62562cu LIZ = AnonymousClass729.LIZ(AccountService.LJIJ().LJFF().getCurUser());
        if (LIZ != null) {
            Object value = this.LJLLILLLL.getValue();
            o.LJIIIIZZ(value, "<get-ivAvatar>(...)");
            C71799SFv.LJIIJ((C71799SFv) value, LIZ, null, false, null, 110);
        }
        Object value2 = this.LJLLL.getValue();
        o.LJIIIIZZ(value2, "<get-ivAt>(...)");
        View view2 = (View) value2;
        boolean z = false;
        if (C1790370x.LIZ()) {
            i = 0;
        } else {
            i = 8;
        }
        view2.setVisibility(i);
        H3().setFocusable(false);
        H3().setFocusableInTouchMode(false);
        H3().setInputType(0);
        H3().addTextChangedListener(new IDObjectS176S0100000_3(this, 13));
        H3().setOnTouchListener(new IDTListenerS113S0100000_3(this, 18));
        H3().setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS23S0100000_3(this, 230)));
        C8YN.LJII(this, K3(), new TBT() { // from class: X.6zJ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C178336zF) obj).LJLLILLLL;
            }
        }, null, new AqS185S0100000_3(this, 190), 6);
        C8YN.LJII(this, K3(), new TBT() { // from class: X.70s
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C178336zF) obj).LJLZ;
            }
        }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 170), 4);
        C8YN.LJII(this, K3(), new TBT() { // from class: X.70o
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C178336zF) obj).LJLLLL;
            }
        }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 182), 4);
        C8YN.LJII(this, K3(), new TBT() { // from class: X.6zI
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C178336zF) obj).LJLLL;
            }
        }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 185), 4);
        C8YN.LJII(this, K3(), new TBT() { // from class: X.70r
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C178336zF) obj).LJLJLLL;
            }
        }, null, new AqS185S0100000_3(this, 188), 6);
        Object value3 = this.LJLLL.getValue();
        o.LJIIIIZZ(value3, "<get-ivAt>(...)");
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 229), (View) value3);
        NowFeedMobHierarchyData nowFeedMobHierarchyData = I3().LJLJJL;
        if (nowFeedMobHierarchyData != null && (enterFrom = nowFeedMobHierarchyData.getEnterFrom()) != null && !enterFrom.equals("from_music")) {
            z = true;
        }
        Aweme aweme = null;
        if (!z) {
            LJIIZILJ = -1;
        } else {
            FeedCommonService LJJIJLIJ = CommonFeedServiceImpl.LJJIJLIJ();
            ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
            C73G I3 = I3();
            if (I3 != null) {
                aweme = I3.LJLIL;
            }
            LJIIZILJ = LJJIJLIJ.LJIIZILJ(LIZ2, aweme);
        }
        Object value4 = this.LJLLJ.getValue();
        o.LJIIIIZZ(value4, "<get-ivSend>(...)");
        C16880lQ.LJIILJJIL((FrameLayout) value4, new ACListenerS22S0101000_3(LJIIZILJ, this, 3));
        Aweme aweme2 = I3().LJLIL;
        if (aweme2 == null || (str = aweme2.getAid()) == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        this.LJLZ = str;
    }
}
