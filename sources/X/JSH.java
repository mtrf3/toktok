package X;

import Y.ARunnableS27S0200000_8;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.delegate.LifecycleDelegate;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.viewmodel.Taco;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS155S0200000_8;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class JSH extends RecyclerView.ViewHolder implements InterfaceC49284JVw, JP7, JQX, View.OnAttachStateChangeListener, JSO, InterfaceC49137JQf {
    public static long LJLLLLLL = -1;
    public static long LJLZ = -1;
    public static final /* synthetic */ int LJZ = 0;
    public JTS LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public Integer LJLJJL;
    public JQA LJLJJLL;
    public WeakReference<JIB> LJLJL;
    public WeakReference<JQT> LJLJLJ;
    public WeakReference<DynamicPatch> LJLJLLL;
    public InterfaceC48907JHj LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public String LJLLL;
    public final JSH LJLLLL;

    @Override // X.InterfaceC48907JHj
    public final void LJIILL() {
    }

    @Override // X.JP7
    public final SearchResultParam LJLJLLL() {
        return null;
    }

    @Override // X.JP7
    public final int LJLL() {
        return -1;
    }

    @Override // X.JP7
    public final Aweme LJLLILLLL(int i, String str) {
        return null;
    }

    @Override // X.JQX
    public final void LJLLLL() {
    }

    @Override // X.InterfaceC49148JQq
    public final Boolean LLFFF() {
        return null;
    }

    @Override // X.JP7
    public final boolean LLFZ() {
        return false;
    }

    @Override // X.JP7
    public final void LLIIL() {
    }

    @Override // X.JP7
    public final void LLJIJIL() {
    }

    @Override // X.JQX
    public final JP7 LLLLIIL() {
        return this;
    }

    @Override // X.JP7
    public final boolean LLLLILI() {
        return false;
    }

    @Override // X.JQX
    public final boolean LLZL() {
        return true;
    }

    @Override // X.InterfaceC49148JQq
    public final InterfaceC46334IGk getPreload() {
        return null;
    }

    @Override // X.InterfaceC48907JHj
    public final void pause() {
    }

    @Override // X.InterfaceC48907JHj
    public final void play() {
    }

    @Override // X.JSO
    public final int q() {
        return 17;
    }

    @Override // X.JP7
    public final View LJIIIIZZ() {
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        return itemView;
    }

    @Override // X.InterfaceC49280JVs
    public final JQA LJLJL() {
        JQA jqa = this.LJLJJLL;
        if (jqa == null) {
            return new JQA();
        }
        return jqa;
    }

    @Override // X.JP7
    public final int LJLLI() {
        C1BU c1bu;
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if ((layoutParams instanceof C1BU) && (c1bu = (C1BU) layoutParams) != null) {
            return c1bu.LJLIL;
        }
        return -1;
    }

    @Override // X.JQX, X.InterfaceC49148JQq
    public final boolean LLIIII() {
        Boolean LJFF = JWA.LJFF(this.LJLLL);
        if (LJFF != null) {
            return LJFF.booleanValue();
        }
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        return N(itemView);
    }

    @Override // X.JSO
    public final boolean LLLLLLL() {
        if (o.LJ(JWA.LJFF(this.LJLLL), Boolean.TRUE)) {
            return true;
        }
        String str = this.LJLLL;
        if (str != null) {
            if (JWA.LJI(str, "hotspot", "activity-video", "official-video", "trending-place") || (Q() instanceof JRJ) || (Q() instanceof JRP)) {
                return true;
            }
            return false;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final JSP P() {
        return (JSP) this.LJLILLLLZI.getValue();
    }

    public final InterfaceC48907JHj Q() {
        Object obj = this.LJLL;
        if (obj instanceof View) {
            o.LJII(obj, "null cannot be cast to non-null type android.view.View");
            if (((View) obj).getWindowVisibility() == 8) {
                View itemView = this.itemView;
                o.LJIIIIZZ(itemView, "itemView");
                N(itemView);
            }
        }
        return this.LJLL;
    }

    @Override // X.JSO
    public final View a() {
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        return itemView;
    }

    @Override // X.JSO
    public final JSL h() {
        if (o.LJ(JWA.LJFF(this.LJLLL), Boolean.TRUE)) {
            JTS jts = this.LJLIL;
            if (jts != null) {
                return new C49178JRu(jts);
            }
            o.LJIJI("bContext");
            throw null;
        }
        if (C49163JRf.LIZ(this.LJLLL)) {
            if (C49111JPf.LIZ()) {
                return new JSW(this);
            }
            return new JSY(this);
        }
        String str = this.LJLLL;
        if (str != null) {
            if (JWA.LJI(str, "hotspot") && C49111JPf.LIZ()) {
                return new JSX(30.0f);
            }
            return new C49189JSf();
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.JP7
    public final int LIZ() {
        if (Q() == null) {
            return 8;
        }
        return 62;
    }

    @Override // X.InterfaceC48907JHj
    public final View LJJIJIL() {
        View LJJIJIL;
        InterfaceC48907JHj Q = Q();
        if (Q == null || (LJJIJIL = Q.LJJIJIL()) == null) {
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            return itemView;
        }
        return LJJIJIL;
    }

    @Override // X.InterfaceC49137JQf
    public final double LJJJJ() {
        if (Q() instanceof View) {
            Object Q = Q();
            o.LJII(Q, "null cannot be cast to non-null type android.view.View");
            ((View) Q).getLocationOnScreen(new int[2]);
            o.LJII(Q(), "null cannot be cast to non-null type android.view.View");
            double LJIIIZ = (KL2.LJIIIZ(this.itemView.getContext()) - r3[1]) / ((View) r0).getHeight();
            if (LJIIIZ > 1.0d) {
                return 1.0d;
            }
            return LJIIIZ;
        }
        return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
    }

    @Override // X.InterfaceC49284JVw
    public final void LJJJJIZL() {
        JSL LJFF;
        JSP P = P();
        if (P != null) {
            VNS vns = P.LJLIL.LIZLLL;
            if (vns != null) {
                vns.onEnterBackground();
            }
            LifecycleDelegate lifecycleDelegate = P.LJLJI;
            lifecycleDelegate.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "recycled");
            lifecycleDelegate.LJII("pageScroll", jSONObject);
        }
        if (LLLLLLL()) {
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            Taco LIZ = C49218JTi.LIZ(itemView, false);
            if (LIZ != null && (LJFF = LIZ.LJFF(17)) != null) {
                LJFF.LJFF();
            }
        }
    }

    @Override // X.JQX
    public final C49128JPw LJJLJ() {
        JRJ jrj;
        InterfaceC48907JHj Q = Q();
        if (!(Q instanceof JRJ) || (jrj = (JRJ) Q) == null) {
            return null;
        }
        return jrj.getCurrentPlayingIndexInfo();
    }

    @Override // X.JP7
    public final int LLJJJ() {
        return getAdapterPosition();
    }

    @Override // X.InterfaceC48907JHj
    public final void LLLJIL() {
        String str;
        C48883JGl c48883JGl;
        C48880JGi LJI;
        DynamicPatch dynamicPatch;
        InterfaceC48907JHj Q = Q();
        if (Q != null) {
            if (Q instanceof JHN) {
                if (C46447IKt.LJLJLJ) {
                    WeakReference<DynamicPatch> weakReference = this.LJLJLLL;
                    C48883JGl c48883JGl2 = null;
                    if (weakReference != null && (dynamicPatch = weakReference.get()) != null) {
                        str = dynamicPatch.schema;
                    } else {
                        str = null;
                    }
                    if (!C49163JRf.LIZ(str)) {
                        JHN jhn = (JHN) Q;
                        EnumC48901JHd iSynergyAction = EnumC48901JHd.DO_NOTHING;
                        o.LJIIIZ(iSynergyAction, "iSynergyAction");
                        Aweme mAweme = jhn.getMAweme();
                        if (mAweme != null) {
                            mAweme.getAid();
                        }
                        C48881JGj c48881JGj = jhn.LJLIL;
                        if (c48881JGj != null && (LJI = c48881JGj.LJI()) != null && LJI.LIZ == 3) {
                            LJI.LIZ = 0;
                        }
                        C48899JHb c48899JHb = C48898JHa.LIZ;
                        Aweme mAweme2 = jhn.getMAweme();
                        C48881JGj c48881JGj2 = jhn.LJLIL;
                        if (c48881JGj2 != null) {
                            c48883JGl2 = c48881JGj2.LJIIJ;
                        }
                        c48899JHb.LIZ(mAweme2, c48883JGl2, jhn.LJLJL, iSynergyAction);
                        C48881JGj c48881JGj3 = jhn.LJLIL;
                        if (c48881JGj3 == null || (c48883JGl = c48881JGj3.LJIIJ) == null) {
                            return;
                        }
                        c48883JGl.LLLLII(150L);
                        return;
                    }
                }
                Q.play();
                return;
            }
            Q.LLLJIL();
        }
    }

    @Override // X.InterfaceC49148JQq
    public final void LLLLLIL() {
        String str;
        DynamicPatch dynamicPatch;
        if (Q() instanceof JRJ) {
            WeakReference<DynamicPatch> weakReference = this.LJLJLLL;
            if (weakReference != null && (dynamicPatch = weakReference.get()) != null) {
                str = dynamicPatch.schema;
            } else {
                str = null;
            }
            if (C49163JRf.LIZ(str)) {
                C48905JHh.LIZIZ(this);
                return;
            }
        }
        JSM.LIZLLL(this);
    }

    @Override // X.InterfaceC48907JHj
    public final void LLLLLJLJLL() {
        InterfaceC48907JHj Q = Q();
        if (Q != null) {
            if (Q instanceof JHN) {
                Q.pause();
            } else {
                Q.LLLLLJLJLL();
            }
        }
    }

    @Override // X.InterfaceC49148JQq
    public final View LLLLZLLIL() {
        return C48905JHh.LIZ(this);
    }

    @Override // X.InterfaceC48907JHj
    public final void contextPause() {
        InterfaceC48907JHj Q = Q();
        if (Q != null) {
            Q.contextPause();
        }
    }

    @Override // X.InterfaceC48907JHj
    public final void g9() {
        InterfaceC48907JHj Q = Q();
        if (Q != null) {
            Q.g9();
        }
    }

    @Override // X.JP7
    public final Aweme getCurrentAweme() {
        JTS jts;
        DynamicPatch dynamicPatch;
        List<Aweme> awemeList;
        Aweme aweme;
        JSP P = P();
        if (P == null || (jts = P.LJLIL) == null || (dynamicPatch = jts.LJII) == null) {
            return null;
        }
        if ((dynamicPatch.getOriginType() != 8 && dynamicPatch.getOriginType() != 20 && dynamicPatch.getOriginType() != 33) || (awemeList = dynamicPatch.getAwemeList()) == null || (aweme = (Aweme) ORZ.LJLLLL(awemeList)) == null) {
            return null;
        }
        return aweme;
    }

    @Override // X.InterfaceC49148JQq
    public final View getDetectView() {
        return C48984JKi.LIZIZ(this);
    }

    @Override // X.JQX
    public final InterfaceC48907JHj getPlayerView() {
        if (C51096K3o.LIZ()) {
            return Q();
        }
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final boolean isPlaying() {
        InterfaceC48907JHj Q = Q();
        if (Q != null) {
            return Q.isPlaying();
        }
        return false;
    }

    @Override // X.InterfaceC49137JQf
    public final boolean C() {
        return this.LJLLI;
    }

    @Override // X.JP7
    public final boolean LIZLLL() {
        return this.LJLJJI;
    }

    @Override // X.JP7
    public final Integer LLILLL() {
        return this.LJLJJL;
    }

    @Override // X.JP7
    public final boolean LLIZLLLIL() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC49148JQq
    public final InterfaceC49137JQf getPriority() {
        return this.LJLLLL;
    }

    public JSH(C50107JlX c50107JlX) {
        super(c50107JlX);
        List<JSR> list;
        Object obj;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS155S0200000_8(c50107JlX, this, 21));
        this.LJLLL = "";
        c50107JlX.addOnAttachStateChangeListener(this);
        JSP P = P();
        if (P != null && (list = P.LJLILLLLZI) != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (obj instanceof C50098JlO) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            JSR jsr = (JSR) obj;
            if (jsr != null) {
                ((C50098JlO) jsr).LJLLJ = new JSK(this);
            }
        }
        this.LJLLLL = this;
    }

    @Override // X.JP7
    public final void LJLZ(int i) {
        this.LJLJJL = Integer.valueOf(i);
    }

    @Override // X.JP7
    public final void LLLIIL(MotionEvent event) {
        o.LJIIIZ(event, "event");
    }

    @Override // X.InterfaceC49280JVs
    public final void LLLLIIIILLL(JQA jqa) {
        this.LJLJJLL = jqa;
        String str = jqa.LJ;
        if (!TextUtils.isEmpty(str)) {
            this.itemView.setTag(this.LJLJJLL);
            JTS jts = this.LJLIL;
            if (jts != null) {
                jts.LJIILJJIL = str;
            } else {
                o.LJIJI("bContext");
                throw null;
            }
        }
    }

    public final boolean N(View view) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addLast(view);
        while (true) {
            if (arrayDeque.isEmpty()) {
                return false;
            }
            Object first = arrayDeque.getFirst();
            o.LJII(first, "null cannot be cast to non-null type android.view.View");
            View view2 = (View) first;
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    if (viewGroup.getChildAt(i).getVisibility() == 0) {
                        if (viewGroup.getChildAt(i) instanceof C48929JIf) {
                            View childAt = viewGroup.getChildAt(i);
                            o.LJII(childAt, "null cannot be cast to non-null type com.ss.android.ugc.aweme.search.lynx.xsearch.searchlive.core.ui.SearchLiveForLynx");
                            this.LJLL = (C48929JIf) childAt;
                            return true;
                        }
                        if (viewGroup.getChildAt(i) instanceof JHN) {
                            View childAt2 = viewGroup.getChildAt(i);
                            o.LJII(childAt2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.search.lynx.xsearch.searchvideo.core.ui.SearchVideoForLynx");
                            this.LJLL = (JHN) childAt2;
                            return true;
                        }
                        if (viewGroup.getChildAt(i) instanceof JRJ) {
                            View childAt3 = viewGroup.getChildAt(i);
                            o.LJII(childAt3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.ui.SearchHorizontalForLynx");
                            this.LJLL = (JRJ) childAt3;
                            return true;
                        }
                        if (viewGroup.getChildAt(i) instanceof JRP) {
                            View childAt4 = viewGroup.getChildAt(i);
                            o.LJII(childAt4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.search.lynx.xsearch.searchlist.core.ui.SearchListForLynx");
                            this.LJLL = (JRP) childAt4;
                            return true;
                        }
                        arrayDeque.addLast(viewGroup.getChildAt(i));
                    }
                }
            }
            arrayDeque.pollFirst();
        }
    }

    @Override // X.JQX
    public final void f(C49128JPw info) {
        JRJ jrj;
        o.LJIIIZ(info, "info");
        InterfaceC48907JHj Q = Q();
        if (Q instanceof JRJ) {
            jrj = (JRJ) Q;
        } else {
            jrj = null;
        }
        new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS27S0200000_8(info, jrj, 45), 100L);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onSearchMediaViewCreateEvent(C233909Fy event) {
        int i;
        boolean z;
        DynamicPatch dynamicPatch;
        JQT jqt;
        o.LJIIIZ(event, "event");
        if (Q() != null) {
            return;
        }
        JSP P = P();
        if (P != null) {
            i = P.LJLJJI.LJLJL;
        } else {
            i = -1;
        }
        if (event.LJLIL != i) {
            return;
        }
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        boolean N = N(itemView);
        JIB jib = null;
        if (N) {
            WeakReference<JQT> weakReference = this.LJLJLJ;
            if (weakReference != null && (jqt = weakReference.get()) != null) {
                jqt.LJJIJLIJ(this);
            }
            if (Q() instanceof C48929JIf) {
                JQA jqa = this.LJLJJLL;
                if (jqa != null) {
                    jqa.LJI = "live_cover";
                }
                InterfaceC48907JHj Q = Q();
                o.LJII(Q, "null cannot be cast to non-null type com.ss.android.ugc.aweme.search.lynx.xsearch.searchlive.core.ui.SearchLiveForLynx");
                C48929JIf c48929JIf = (C48929JIf) Q;
                WeakReference<JIB> weakReference2 = this.LJLJL;
                if (weakReference2 != null) {
                    jib = weakReference2.get();
                }
                c48929JIf.LJIILIIL(jib, this.LJLJJLL);
            }
            WeakReference<DynamicPatch> weakReference3 = this.LJLJLLL;
            if (weakReference3 != null && (dynamicPatch = weakReference3.get()) != null) {
                z = dynamicPatch.isAutoplay();
            } else {
                z = false;
            }
            this.LJLLI = z;
            return;
        }
        this.LJLL = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        List<JSR> list;
        DynamicPatch dynamicPatch;
        List<Aweme> awemeList;
        Aweme aweme;
        JSP P;
        JTS jts;
        o.LJIIIZ(v, "v");
        this.LJLJJI = true;
        EventBus.LIZJ().LJIILJJIL(this);
        JSP P2 = P();
        if (P2 != null && (list = P2.LJLILLLLZI) != null) {
            Iterator<JSR> it = list.iterator();
            while (it.hasNext()) {
                it.next().LJFF();
            }
            WeakReference<DynamicPatch> weakReference = this.LJLJLLL;
            if (weakReference != null && (dynamicPatch = weakReference.get()) != null && (awemeList = dynamicPatch.getAwemeList()) != null && (aweme = (Aweme) ORZ.LJLLLLLL(getAdapterPosition(), awemeList)) != null && (P = P()) != null && (jts = P.LJLIL) != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("aid", aweme.getAid());
                jSONObject.put("dig_status", aweme.getUserDigg());
                jts.LIZ("changeDiggState", jSONObject);
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        List<JSR> list;
        o.LJIIIZ(v, "v");
        this.LJLJJI = false;
        this.LJLJI = false;
        EventBus.LIZJ().LJIJ(this);
        JSP P = P();
        if (P != null && (list = P.LJLILLLLZI) != null) {
            Iterator<JSR> it = list.iterator();
            while (it.hasNext()) {
                it.next().LJI();
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC49148JQq
    public final void x4(C49187JSd c49187JSd) {
        C48984JKi.LIZ(this, c49187JSd);
    }

    @Override // X.InterfaceC49148JQq
    public final void y(long j) {
        String str;
        DynamicPatch dynamicPatch;
        if (Q() instanceof JRJ) {
            WeakReference<DynamicPatch> weakReference = this.LJLJLLL;
            if (weakReference != null && (dynamicPatch = weakReference.get()) != null) {
                str = dynamicPatch.schema;
            } else {
                str = null;
            }
            if (C49163JRf.LIZ(str)) {
                C48905JHh.LIZJ(this, j);
                return;
            }
        }
        JSM.LJ(this, j);
    }

    @Override // X.InterfaceC49148JQq
    public final void z8(C49187JSd c49187JSd) {
        C48984JKi.LIZJ(this, c49187JSd);
    }

    @Override // X.JSO
    public final void LJIJJLI(Aweme aweme, C49196JSm c49196JSm) {
        JSM.LIZIZ(this, aweme, c49196JSm);
    }

    public static /* synthetic */ void M(JSH jsh, DynamicPatch dynamicPatch, java.util.Map map, JIB jib, int i) {
        java.util.Map map2 = map;
        JIB jib2 = jib;
        if ((i & 2) != 0) {
            map2 = null;
        }
        if ((i & 4) != 0) {
            jib2 = null;
        }
        jsh.L(dynamicPatch, map2, jib2, null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x02be, code lost:
    
        if (r23 != null) goto L203;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L(com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch r19, java.util.Map<java.lang.String, ? extends java.lang.Object> r20, X.JIB r21, X.JQT r22, com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.LynxSSRInfo r23) {
        /*
            Method dump skipped, instructions count: 833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JSH.L(com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch, java.util.Map, X.JIB, X.JQT, com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.LynxSSRInfo):void");
    }
}
