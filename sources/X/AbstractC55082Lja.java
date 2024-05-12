package X;

import Y.ARunnableS2S0301000_1;
import Y.IDComparatorS32S0000000_4;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.zhiliaoapp.musically.R;
import defpackage.b0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.Lja, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC55082Lja extends AbstractC48746JBe implements InterfaceC55062LjG {
    public static int LLFZ;
    public final Context LJLJJL;
    public final LayoutInflater LJLJJLL;
    public final InterfaceC72642tA<C50420Jqa> LJLJL;
    public final Fragment LJLJLJ;
    public final View.OnTouchListener LJLJLLL;
    public final BaseFeedPageParams LJLL;
    public final InterfaceC2302191t LJLLI;
    public final C03900Di LJLLILLLL;
    public InterfaceC55100Ljs LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public InterfaceC88472Yns<? super String, ? extends View> LJLLLLLL;
    public long LJLZ;
    public final C92D LJZ;
    public final ViewOnTouchListenerC2059986p LJZI;
    public final C224238r5 LJZL;
    public final C62822Ol8 LL;
    public final C62822Ol8 LLD;
    public final C62822Ol8 LLF;
    public final java.util.Map<Integer, C2313796f> LLFF;
    public int LLFFF;
    public String LLFII;

    public Collection<C2313796f> LJJIJIIJIL() {
        return null;
    }

    public abstract String LJJIJLIJ();

    public List<C2313796f> LJJIJIIJI() {
        return (List) C55141LkX.LIZJ.getValue();
    }

    public final List<Aweme> LJJIL() {
        return (ArrayList) this.LJLLILLLL.LIZ;
    }

    public List<Aweme> Q8() {
        return (ArrayList) this.LJLLILLLL.LIZ;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((ArrayList) this.LJLLILLLL.LIZ).size();
    }

    public C55136LkS LJJJ() {
        return C55134LkQ.LJ;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    public static C2MA LJJJI(View view) {
        Object obj;
        if (view != null) {
            obj = view.getTag(R.id.d87);
        } else {
            obj = null;
        }
        return (C2MA) obj;
    }

    @Override // X.InterfaceC55062LjG
    public final void LJ(int i) {
        LJJIJL(i);
        notifyDataSetChanged();
    }

    public int LJI(String str) {
        Iterator<Aweme> it = Q8().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (o.LJ(C78886Uxe.LJIILIIL(it.next()), str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int LJIIL(Object any) {
        o.LJIIIZ(any, "any");
        C2MA LJJJI = LJJJI((View) any);
        int count = getCount();
        for (int i = 0; i < count; i++) {
            Aweme aweme = (Aweme) ListProtector.get(Q8(), i);
            if (LJJJI != null) {
                if (LJJJI.getAweme() == null) {
                    if (LJJJI.getAwemeType() == 21 && LJJJI.getAwemeType() == aweme.getAwemeType()) {
                        return i;
                    }
                } else if (C38354F3m.LIZJ(aweme.getAid(), LJJJI.getAweme().getAid())) {
                    if (C46384IIi.LIZ && !C54838Lfe.LJJ(LJJJI.getAweme()) && (LJJJI.getAweme() != aweme || !LJJJI.getAweme().equals(aweme))) {
                        LJJJI.E8(i, aweme);
                    }
                    return i;
                }
            }
        }
        return -2;
    }

    @Override // X.AbstractC48746JBe
    public int LJJIII(int i) {
        Aweme item = getItem(i);
        if (item != null) {
            for (Map.Entry<Integer, C2313796f> entry : this.LLFF.entrySet()) {
                int intValue = entry.getKey().intValue();
                InterfaceC88472Yns<C55127LkJ, Boolean> interfaceC88472Yns = entry.getValue().LIZIZ;
                Context context = this.LJLJJL;
                List<Aweme> Q8 = Q8();
                String str = this.LJLL.eventType;
                o.LJI(str);
                String from = this.LJLL.param.getFrom();
                if (from == null) {
                    from = "";
                }
                if (interfaceC88472Yns.invoke(new C55127LkJ(item, context, Q8, str, from)).booleanValue()) {
                    return intValue;
                }
            }
            return 0;
        }
        return 0;
    }

    @Override // X.AbstractC48746JBe
    public final int LJJIIJ(View view) {
        Object obj;
        if (view != null) {
            obj = view.getTag(R.id.d89);
        } else {
            obj = null;
        }
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        C36922EeM.LIZ(new RuntimeException(b0.LIZIZ("expect tag is type int,but no:", obj)));
        return 0;
    }

    @Override // X.AbstractC48746JBe
    public final int LJJIIJZLJL(int i) {
        return LJJIII(i);
    }

    @Override // X.AbstractC48746JBe
    public final void LJJIJ(View view) {
        C2MA c2ma;
        Object obj = null;
        if (view != null) {
            obj = view.getTag(R.id.d87);
        }
        if ((obj instanceof C2MA) && (c2ma = (C2MA) obj) != null) {
            c2ma.unBind();
        }
    }

    public void LJJIJL(int i) {
        if (i < 0 || i >= getCount()) {
            return;
        }
        Aweme aweme = (Aweme) ListProtector.remove(LJJIL(), i);
        ((AbstractC213068Xu) this.LL.getValue()).LIZJ(aweme);
        Iterator it = ((Collection) this.LLD.getValue()).iterator();
        while (it.hasNext()) {
            ((C8YB) it.next()).LIZJ(aweme);
        }
    }

    public Aweme LJJIZ(int i) {
        return getItem(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01df A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJIZL(int r15) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC55082Lja.LJJJJIZL(int):void");
    }

    @Override // X.InterfaceC55062LjG
    public final Aweme getItem(int i) {
        C03900Di c03900Di = this.LJLLILLLL;
        if (i >= 0) {
            if (i < ((ArrayList) c03900Di.LIZ).size()) {
                return (Aweme) ListProtector.get((ArrayList) c03900Di.LIZ, i);
            }
        } else {
            c03900Di.getClass();
        }
        return null;
    }

    public void setData(List<? extends Aweme> list) {
        List list2;
        C03900Di c03900Di = this.LJLLILLLL;
        ((ArrayList) c03900Di.LIZ).clear();
        if (list != null) {
            list2 = ORZ.LJLL(list);
        } else {
            list2 = null;
        }
        UC0.LIZLLL((ArrayList) c03900Di.LIZ, list2);
        ((AbstractC213068Xu) this.LL.getValue()).LIZLLL(list);
        Iterator it = ((Collection) this.LLD.getValue()).iterator();
        while (it.hasNext()) {
            ((C8YB) it.next()).LIZLLL(list);
        }
        notifyDataSetChanged();
    }

    @Override // X.AbstractC48746JBe
    public final void LJJIIZI(int i, View view) {
        if (i == 2) {
            C2MA LJJJI = LJJJI(view);
            if (LJJJI != null) {
                LJJJI.H8();
                return;
            }
            return;
        }
        if (!(view instanceof C2MA)) {
            return;
        }
        C2MA LJJJI2 = LJJJI(view);
        o.LJI(LJJJI2);
        LJJJI2.H8();
    }

    public void LJJJJ(int i, Aweme aweme) {
        if (aweme != null && i >= 0 && i <= getCount()) {
            ListProtector.add(LJJIL(), i, aweme);
            notifyDataSetChanged();
            return;
        }
        throw new IllegalArgumentException("position out of range");
    }

    public final void LJJJJI(long j, Aweme aweme) {
        String str;
        if (!FMX.LIZJ("mt_feed_total_bind_consumption")) {
            return;
        }
        if (aweme.isAd()) {
            str = "ad";
        } else if (aweme.getAwemeType() == 101) {
            str = "live";
        } else {
            str = "common";
        }
        FMX.LJIILL("mt_feed_total_bind_consumption", new OSZ(Long.valueOf(j), "duration"), new OSZ(str, "aweme_type"), new OSZ(LJJIJLIJ(), "feed_type"));
    }

    public void LJJJJJ(int i, Aweme aweme) {
        if (aweme == null || i < 0 || i > getCount()) {
            return;
        }
        List<Aweme> LJJIL = LJJIL();
        if (TextUtils.equals(aweme.getAid(), ((Aweme) ListProtector.get(LJJIL, i)).getAid())) {
            return;
        }
        ListProtector.set(LJJIL, i, aweme);
        notifyDataSetChanged();
    }

    public final void LJJJJJL(List<? extends Aweme> list, boolean z) {
        ((AbstractC213068Xu) this.LL.getValue()).LIZ(list);
        Iterator it = ((Collection) this.LLD.getValue()).iterator();
        while (it.hasNext()) {
            ((C8YB) it.next()).LIZ(list);
        }
        setData(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, android.view.View] */
    @Override // X.AbstractC48746JBe
    public View LJJIIZ(int i, View view, ViewGroup parent) {
        int i2;
        int i3;
        o.LJIIIZ(parent, "parent");
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = view;
        int LJJIII = LJJIII(i);
        Aweme LJJIZ = LJJIZ(i);
        if (LJJIZ != null && LJJIZ.getVideo() != null && LJJIZ.getVideo().getWidth() > 0 && LJJIZ.getVideo().getHeight() > 0) {
            i3 = LJJIZ.getVideo().getWidth();
            i2 = LJJIZ.getVideo().getHeight();
        } else {
            i2 = 0;
            i3 = 0;
        }
        View view2 = (View) c68322mC.element;
        if (view2 == null || !Objects.equals(view2.getTag(R.id.d89), Integer.valueOf(LJJIII))) {
            c68322mC.element = LJJIJIL(LJJIII, i3, i2, parent);
        }
        C2MA LJJJI = LJJJI((View) c68322mC.element);
        o.LJI(LJJJI);
        if (FN7.LIZ()) {
            LJJJI.c8(LJJIZ(i));
            LJJJI.F8();
        }
        if (C35168DrA.LIZ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AbstractFeedAdapter getView on position:");
            LIZ.append(i);
            C9K4.LIZIZ(X1D.LIZIZ(LIZ), "");
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("AbstractFeedAdapter getView>>> position:");
            LIZ2.append(i);
            C60392Yp.LIZIZ("LFeedView", X1D.LIZIZ(LIZ2));
        }
        FN7.LIZIZ(new ARunnableS2S0301000_1(this, i, c68322mC, LJJJI, 7));
        T t = c68322mC.element;
        o.LJI(t);
        return (View) t;
    }

    public final void LJJJIL(int i, int i2, List list) {
        if (list == null || list.isEmpty() || i < 0 || i >= list.size() || i > getCount()) {
            return;
        }
        List<Aweme> LJJIL = LJJIL();
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = ListProtector.get(list, i + i3);
            if (obj != null) {
                ListProtector.add(LJJIL, i, obj);
            }
        }
        C03900Di c03900Di = this.LJLLILLLL;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme : LJJIL) {
            if (hashSet.add(aweme.getAid())) {
                arrayList.add(aweme);
            }
        }
        ((ArrayList) c03900Di.LIZ).clear();
        UC0.LIZLLL((ArrayList) c03900Di.LIZ, ORZ.LJLL(arrayList));
        notifyDataSetChanged();
    }

    public final View LJJIJIL(int i, int i2, int i3, ViewGroup parent) {
        boolean z;
        o.LJIIIZ(parent, "parent");
        if (C90L.LIZ) {
            int i4 = C90L.LIZIZ;
            if (i4 == 0) {
                FAJ.LIZ("feed_ui_duration_first_videoviewcell_init", false);
            } else if (i4 == 1) {
                C56662Kg.LIZ().LIZJ("feed_ui_duration_second_videoviewcell_init", false);
            }
        }
        C2313796f c2313796f = this.LLFF.get(Integer.valueOf(i));
        if (c2313796f == null) {
            c2313796f = LJJJ();
        }
        InterfaceC88472Yns<FVC, View> interfaceC88472Yns = c2313796f.LIZJ;
        Context context = this.LJLJJL;
        LayoutInflater layoutInflater = this.LJLJJLL;
        String str = this.LJLL.eventType;
        if (str == null) {
            str = "";
        }
        View invoke = interfaceC88472Yns.invoke(new FVC(parent, context, layoutInflater, str, this.LJLJLJ));
        invoke.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        invoke.setTag(R.id.d89, Integer.valueOf(i));
        BaseFeedPageParams baseFeedPageParams = this.LJLL;
        baseFeedPageParams.videoWidth = i2;
        baseFeedPageParams.videoHeight = i3;
        InterfaceC88472Yns<C222588oQ, C2MA> interfaceC88472Yns2 = c2313796f.LIZLLL;
        InterfaceC72642tA<C50420Jqa> interfaceC72642tA = this.LJLJL;
        Fragment fragment = this.LJLJLJ;
        View.OnTouchListener onTouchListener = this.LJLJLLL;
        InterfaceC2302191t interfaceC2302191t = this.LJLLI;
        C224238r5 c224238r5 = this.LJZL;
        ViewOnTouchListenerC2059986p viewOnTouchListenerC2059986p = this.LJZI;
        C92D c92d = this.LJZ;
        String str2 = baseFeedPageParams.eventType;
        o.LJI(str2);
        BaseFeedPageParams baseFeedPageParams2 = this.LJLL;
        C2MA invoke2 = interfaceC88472Yns2.invoke(new C222588oQ(invoke, interfaceC72642tA, fragment, onTouchListener, baseFeedPageParams, interfaceC2302191t, c224238r5, viewOnTouchListenerC2059986p, c92d, str2, baseFeedPageParams2.pageType, this.LJLZ, this.LJLLJ, baseFeedPageParams2.challengeId, i, (AbstractC213068Xu) this.LL.getValue(), (java.util.Map) this.LLF.getValue(), this.LJLLLLLL));
        invoke.setTag(R.id.d87, invoke2);
        if (!C90L.LIZ) {
            z = false;
        } else {
            int i5 = C90L.LIZIZ;
            if (i5 == 0) {
                z = false;
                FAJ.LJFF("feed_ui_duration_first_videoviewcell_init", false);
            } else {
                z = false;
                if (i5 == 1) {
                    C56662Kg.LIZ().LJFF("feed_ui_duration_second_videoviewcell_init", false);
                }
            }
        }
        if (C90L.LIZ) {
            int i6 = C90L.LIZIZ;
            if (i6 == 0) {
                FAJ.LIZ("feed_ui_duration_first_videoviewcell_oncreate", z);
            } else if (i6 == 1) {
                C56662Kg.LIZ().LIZJ("feed_ui_duration_second_videoviewcell_oncreate", z);
            }
        }
        invoke2.k7(invoke);
        if (C90L.LIZ) {
            int i7 = C90L.LIZIZ;
            if (i7 == 0) {
                FAJ.LJFF("feed_ui_duration_first_videoviewcell_oncreate", z);
            } else if (i7 == 1) {
                C56662Kg.LIZ().LJFF("feed_ui_duration_second_videoviewcell_oncreate", z);
            }
        }
        return invoke;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC55082Lja(Context context, LayoutInflater inflater, InterfaceC72642tA<C50420Jqa> listener, Fragment fragment, View.OnTouchListener tapTouchListener, final BaseFeedPageParams baseFeedPageParams, InterfaceC2302191t iHandlePlay) {
        super(context, 40);
        C92D c92d;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(listener, "listener");
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(tapTouchListener, "tapTouchListener");
        o.LJIIIZ(baseFeedPageParams, "baseFeedPageParams");
        o.LJIIIZ(iHandlePlay, "iHandlePlay");
        this.LJLJJL = context;
        this.LJLJJLL = inflater;
        this.LJLJL = listener;
        this.LJLJLJ = fragment;
        this.LJLJLLL = tapTouchListener;
        this.LJLL = baseFeedPageParams;
        this.LJLLI = iHandlePlay;
        this.LJLLILLLL = new C03900Di();
        this.LJLLLL = true;
        UW2 uw2 = InterfaceC55219Lln.LJJ;
        final Context mContext = this.LJLJI;
        o.LJIIIIZZ(mContext, "mContext");
        uw2.getClass();
        if (baseFeedPageParams.param.isFromDuetMode() || baseFeedPageParams.param.isFromEffectDiscover()) {
            c92d = C55086Lje.LIZ;
        } else {
            c92d = new C92D() { // from class: X.91q
                @Override // X.C92D
                public final void LIZ(float f, float f2) {
                    if (baseFeedPageParams.isPlayListCleanMode()) {
                        return;
                    }
                    String str = baseFeedPageParams.eventType;
                    if (str == null) {
                        str = "";
                    }
                    if (C2Q9.LIZ(str)) {
                        C2U8.LIZ(new C55274Lmg(f, baseFeedPageParams.awemeFromPage, f2, mContext.hashCode()));
                    }
                }
            };
        }
        this.LJZ = c92d;
        this.LJZI = new ViewOnTouchListenerC2059986p();
        C224238r5 c224238r5 = new C224238r5();
        C224238r5.LJIIIIZZ(this.LJLJI);
        this.LJZL = c224238r5;
        this.LL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1642));
        this.LLD = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1643));
        this.LLF = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1644));
        C221108m2.LIZIZ(C74344TFs.LJLIL);
        List<C2313796f> LJJIJIIJI = LJJIJIIJI();
        Collection<C2313796f> LJJIJIIJIL = LJJIJIIJIL();
        if (LJJIJIIJIL != null) {
            LJJIJIIJI.addAll(LJJIJIIJIL);
        }
        List LLJILJILJ = ORZ.LLJILJILJ(ORZ.LLILII(new IDComparatorS32S0000000_4(10), LJJIJIIJI));
        ArrayList arrayList = (ArrayList) LLJILJILJ;
        arrayList.add(LJJJ());
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(LLJILJILJ, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C2313796f c2313796f = (C2313796f) it.next();
            arrayList2.add(new OSZ(Integer.valueOf(c2313796f.LIZ), c2313796f));
        }
        this.LLFF = C113554cx.LJJLIIIJLJLI(arrayList2);
        this.LLFFF = -1;
        this.LLFII = "";
    }
}
