package X;

import Y.ACListenerS29S0100000_9;
import Y.AUListenerS71S0101000_9;
import Y.IDAListenerS77S0100000_9;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Lk0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C55108Lk0 extends FrameLayout {
    public static final String[] LLFZ = {"personal_homepage", "others_homepage", "challenge", "single_song", "prop_page", "duet_page", "mv_page", "poi_detail", "tts_page", "places_discover"};
    public int LJLIL;
    public KUR LJLILLLLZI;
    public AbstractC55113Lk5 LJLJI;
    public InterfaceC54976Lhs LJLJJI;
    public IRefreshAbility LJLJJL;
    public int LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public float LJLJLLL;
    public float LJLL;
    public InterfaceC55112Lk4 LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public ValueAnimator LJLLLL;
    public long LJLLLLLL;
    public String LJLZ;
    public boolean LJZ;
    public Drawable LJZI;
    public View LJZL;
    public final List<InterfaceC55109Lk1> LL;
    public InterfaceC55110Lk2 LLD;
    public String LLF;
    public boolean LLFF;
    public boolean LLFFF;
    public final ArrayList<KR1> LLFII;

    public C55108Lk0() {
        throw null;
    }

    public final void LIZ() {
        this.LJLLLL = ValueAnimator.ofFloat(0.0f, 1.0f);
        int viewPagerMarginTop = getViewPagerMarginTop();
        this.LJLLLL.setDuration(200);
        this.LJLLLL.setInterpolator(new DecelerateInterpolator());
        this.LJLLLL.addUpdateListener(new AUListenerS71S0101000_9(this, viewPagerMarginTop, 0));
        this.LJLLLL.addListener(new IDAListenerS77S0100000_9(this, 1));
        this.LJLLLL.start();
        LIZLLL();
    }

    public final void LIZIZ() {
        this.LJLLLL = ValueAnimator.ofFloat(0.0f, 1.0f);
        int viewPagerMarginTop = getViewPagerMarginTop();
        int i = ((this.LJLLL + viewPagerMarginTop) * (-200)) / this.LJLLJ;
        if (i < 0) {
            i = 200;
        }
        this.LJLLLL.setDuration(i);
        this.LJLLLL.addUpdateListener(new AUListenerS71S0101000_9(this, viewPagerMarginTop, 1));
        this.LJLLLL.addListener(new IDAListenerS77S0100000_9(this, 2));
        this.LJLLLL.start();
    }

    public final void LIZLLL() {
        KUR LIZJ = LIZJ(false);
        if (LIZJ != null) {
            LIZJ.setVisibility(8);
        }
        Iterator it = ((ArrayList) this.LL).iterator();
        while (it.hasNext()) {
            InterfaceC55109Lk1 interfaceC55109Lk1 = (InterfaceC55109Lk1) it.next();
            if (interfaceC55109Lk1 != null) {
                interfaceC55109Lk1.onHide();
            }
        }
    }

    public final void LJI() {
        KUR LIZJ = LIZJ(false);
        if (LIZJ != null) {
            LIZJ.LJI();
        }
        this.LJLLILLLL = -1;
        if (this.LJLJI != null) {
            LIZ();
        }
        if (this.LJLLLLLL != -1 && !TextUtils.isEmpty(this.LJLZ)) {
            long currentTimeMillis = System.currentTimeMillis() - this.LJLLLLLL;
            FUA.LJFF("aweme_feed_load_more_duration", this.LJLZ, (float) currentTimeMillis);
            C769130d.LIZ = currentTimeMillis;
            this.LJLLLLLL = -1L;
        }
    }

    public final void LJII() {
        KUR LIZJ = LIZJ(true);
        if (LIZJ != null) {
            LIZJ.setVisibility(0);
        }
        if (!this.LLFFF) {
            setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.d4, getContext()));
        }
        Iterator it = ((ArrayList) this.LL).iterator();
        while (it.hasNext()) {
            InterfaceC55109Lk1 interfaceC55109Lk1 = (InterfaceC55109Lk1) it.next();
            if (interfaceC55109Lk1 != null) {
                interfaceC55109Lk1.onShow();
            }
        }
    }

    public final void LJIIIIZZ() {
        KUR LIZJ = LIZJ(true);
        if (LIZJ != null) {
            LIZJ.LJII();
        }
        this.LJLLILLLL = 1;
        if (this.LJLJI != null) {
            LIZ();
        }
        if (this.LJLLLLLL != -1 && !TextUtils.isEmpty(this.LJLZ)) {
            FUA.LJFF("aweme_feed_load_more_duration", this.LJLZ, (float) (System.currentTimeMillis() - this.LJLLLLLL));
            this.LJLLLLLL = -1L;
        }
    }

    public final boolean LJ() {
        IRefreshAbility iRefreshAbility = this.LJLJJL;
        if (iRefreshAbility != null) {
            return iRefreshAbility.O6();
        }
        InterfaceC54976Lhs interfaceC54976Lhs = this.LJLJJI;
        if (interfaceC54976Lhs != null && interfaceC54976Lhs.O6()) {
            return true;
        }
        return false;
    }

    public final void LJFF() {
        if (this.LJLJI.getCurrentItem() == this.LJLJI.getAdapter().getCount() - 1 && this.LJZL != null) {
            C2U8.LIZ(new IEvent() { // from class: X.3Ht
                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent post() {
                    C2U8.LIZ(this);
                    return this;
                }

                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent postSticky() {
                    C2U8.LIZIZ(this);
                    return this;
                }
            });
        }
    }

    public final void LJIIIZ() {
        if (this.LJLJLJ) {
            InterfaceC55110Lk2 interfaceC55110Lk2 = this.LLD;
            if (interfaceC55110Lk2 != null) {
                interfaceC55110Lk2.LIZ();
            }
            this.LJLJLJ = false;
        }
        if (getViewPagerMarginTop() != 0) {
            LIZ();
        }
    }

    public int getViewPagerMarginTop() {
        AbstractC55113Lk5 abstractC55113Lk5 = this.LJLJI;
        if (abstractC55113Lk5 == null) {
            return 0;
        }
        return ((ViewGroup.MarginLayoutParams) abstractC55113Lk5.getLayoutParams()).topMargin;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        try {
            super.onFinishInflate();
            this.LJZ = true;
        } catch (Exception unused) {
        }
    }

    public final KUR LIZJ(boolean z) {
        if (this.LJLILLLLZI == null && z && this.LJZ) {
            try {
                this.LJLILLLLZI = new KUR(getContext(), null);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C17N.LJIILL(60.0d));
                layoutParams.gravity = 80;
                layoutParams.setMargins(0, 0, 0, C17N.LJIILL(49.0d));
                addView(this.LJLILLLLZI, 0, layoutParams);
                if (this.LJZL == null) {
                    TextView textView = (TextView) C16880lQ.LLLZIIL(R.layout.dsp, C16880lQ.LLZIL(getContext()), null);
                    textView.setGravity(17);
                    textView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dm, getContext()));
                    this.LJZL = textView;
                }
                KUY LIZ = KUY.LIZ(getContext());
                ACListenerS29S0100000_9 aCListenerS29S0100000_9 = new ACListenerS29S0100000_9(this, 19);
                C50258Jny c50258Jny = new C50258Jny(LIZ.LIZ);
                c50258Jny.LIZ(R.string.hve);
                C50259Jnz c50259Jnz = c50258Jny.LIZ;
                C51612KNk c51612KNk = new C51612KNk(LIZ.LIZ);
                c51612KNk.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                c51612KNk.setStatus(c50259Jnz);
                LIZ.LIZLLL = c51612KNk;
                C16880lQ.LJIIJ(aCListenerS29S0100000_9, c51612KNk);
                if (C52208KeK.LIZ) {
                    String str = this.LLF;
                    if (!TextUtils.isEmpty(str)) {
                        for (String str2 : LLFZ) {
                            if (str.equals(str2)) {
                                break;
                            }
                        }
                    }
                }
                LIZ.LIZIZ(this.LJZL);
                this.LJLILLLLZI.setBuilder(LIZ);
                Drawable drawable = this.LJZI;
                if (drawable != null) {
                    this.LJLILLLLZI.setBackgroundDrawable(drawable);
                }
            } catch (Exception unused) {
                this.LJLILLLLZI = null;
                this.LJZI = null;
            }
        }
        KUR kur = this.LJLILLLLZI;
        if (kur != null && kur.LIZLLL()) {
            this.LJLLILLLL = -1;
        }
        return this.LJLILLLLZI;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        if (r1 != 3) goto L26;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            X.Lk5 r0 = r6.LJLJI
            r2 = 0
            if (r0 == 0) goto L45
            androidx.viewpager.widget.PagerAdapter r0 = r0.getAdapter()
            if (r0 == 0) goto L45
            X.Lk5 r0 = r6.LJLJI
            androidx.viewpager.widget.PagerAdapter r0 = r0.getAdapter()
            int r0 = r0.getCount()
            if (r0 == 0) goto L45
            X.Lk5 r0 = r6.LJLJI
            int r0 = r0.getCurrentItem()
            r4 = 1
            if (r0 <= 0) goto L33
            X.Lk5 r0 = r6.LJLJI
            int r1 = r0.getCurrentItem()
            X.Lk5 r0 = r6.LJLJI
            androidx.viewpager.widget.PagerAdapter r0 = r0.getAdapter()
            int r0 = r0.getCount()
            int r0 = r0 - r4
            if (r1 < r0) goto L45
        L33:
            X.Lk5 r0 = r6.LJLJI
            boolean r0 = r0.LJIIIIZZ()
            if (r0 != 0) goto L45
            boolean r0 = r6.LJ()
            if (r0 != 0) goto L45
            boolean r0 = r6.LLFF
            if (r0 == 0) goto L46
        L45:
            return r2
        L46:
            int r1 = r7.getAction()
            if (r1 == 0) goto Lbd
            if (r1 == r4) goto Lba
            r0 = 2
            if (r1 == r0) goto L57
            r0 = 3
            if (r1 == r0) goto Lba
        L54:
            boolean r0 = r6.LJLJL
            return r0
        L57:
            float r5 = r7.getY()
            X.Lk5 r0 = r6.LJLJI
            int r0 = r0.getCurrentItem()
            if (r0 != 0) goto L7c
            float r0 = r6.LJLJLLL
            float r1 = r5 - r0
            int r0 = r6.LJLJJLL
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L7c
            boolean r0 = r6.LJLJL
            if (r0 != 0) goto L7c
            r6.LJLJL = r4
            android.animation.ValueAnimator r0 = r6.LJLLLL
            if (r0 == 0) goto L54
            r0.cancel()
            goto L54
        L7c:
            X.Lk5 r0 = r6.LJLJI
            androidx.viewpager.widget.PagerAdapter r0 = r0.getAdapter()
            int r1 = r0.getCount()
            int r1 = r1 - r4
            X.Lk5 r0 = r6.LJLJI
            int r0 = r0.getCurrentItem()
            if (r1 != r0) goto L54
            float r3 = r6.LJLJLLL
            float r2 = r3 - r5
            int r1 = r6.LJLJJLL
            float r0 = (float) r1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L9e
            boolean r0 = r6.LJLJL
            if (r0 == 0) goto Lb0
        L9e:
            float r5 = r5 - r3
            float r0 = (float) r1
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L54
            boolean r0 = r6.LJLJL
            if (r0 != 0) goto L54
            X.Lk5 r0 = r6.LJLJI
            int r0 = r0.getTop()
            if (r0 >= 0) goto L54
        Lb0:
            r6.LJLJL = r4
            android.animation.ValueAnimator r0 = r6.LJLLLL
            if (r0 == 0) goto L54
            r0.cancel()
            goto L54
        Lba:
            r6.LJLJL = r2
            goto L54
        Lbd:
            r6.LJLJL = r2
            float r0 = r7.getY()
            r6.LJLJLLL = r0
            r6.LJLL = r0
            goto L54
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55108Lk0.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f3, code lost:
    
        if (r6 <= 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0120, code lost:
    
        r7 = -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x011e, code lost:
    
        if (r6 < 0) goto L75;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55108Lk0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBottomViewBackground(Drawable drawable) {
        KUR LIZJ = LIZJ(false);
        if (LIZJ != null) {
            LIZJ.setBackgroundDrawable(drawable);
        } else {
            this.LJZI = drawable;
        }
    }

    public void setEnableOverdarwOpt(boolean z) {
        this.LLFFF = z;
    }

    public void setEnterFromPage(String str) {
        this.LLF = str;
    }

    public void setLabel(String str) {
        this.LJLZ = str;
    }

    public void setLoadMoreEmptyView(View view) {
        this.LJZL = view;
        this.LJLILLLLZI = null;
    }

    public void setLoadMoreListener(InterfaceC55112Lk4 interfaceC55112Lk4) {
        this.LJLLI = interfaceC55112Lk4;
    }

    public void setOnGestureTriggerExit(InterfaceC55110Lk2 interfaceC55110Lk2) {
        this.LLD = interfaceC55110Lk2;
    }

    public void setSkipTouchEvent(boolean z) {
        this.LLFF = z;
    }

    public void setViewPagerMarginTopByDelta(int i) {
        AbstractC55113Lk5 abstractC55113Lk5 = this.LJLJI;
        if (abstractC55113Lk5 == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) abstractC55113Lk5.getLayoutParams();
        int i2 = marginLayoutParams.topMargin + i;
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.bottomMargin = -i2;
        if (!this.LLFII.isEmpty()) {
            Iterator<KR1> it = this.LLFII.iterator();
            while (it.hasNext()) {
                it.next().LIZ(marginLayoutParams.topMargin);
            }
        }
        this.LJLJI.setLayoutParams(marginLayoutParams);
    }

    public C55108Lk0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLLILLLL = -1;
        this.LJLLLLLL = -1L;
        this.LL = new ArrayList();
        this.LLFF = false;
        this.LLFFF = false;
        this.LLFII = new ArrayList<>();
        this.LJLJJLL = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LJLLL = (int) (getContext().getResources().getDisplayMetrics().density * 109.0f);
        this.LJLLJ = (int) (getContext().getResources().getDisplayMetrics().density * 218.0f);
    }
}
