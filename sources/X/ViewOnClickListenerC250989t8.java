package X;

import Y.ACListenerS26S1200000_4;
import Y.ACListenerS39S0200000_4;
import Y.ARunnableS40S0100000_4;
import Y.AUListenerS68S0101000_4;
import Y.AfS56S0100000_4;
import Y.IDAListenerS2S0110000_4;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.keva.Keva;
import com.bytedance.touchpoint.core.model.Bubble;
import com.bytedance.touchpoint.core.model.NormalPendant;
import com.bytedance.touchpoint.core.model.TimerPendant;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.9t8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC250989t8 implements InterfaceC249909rO, View.OnClickListener {
    public ViewGroup LJLIL;
    public C250999t9 LJLILLLLZI;
    public C251009tA LJLJI;
    public View.OnClickListener LJLJJI;
    public int LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public int LJLJLJ;
    public boolean LJLJLLL;
    public C9OT LJLL;
    public boolean LJLLI;
    public boolean LJLLJ;
    public boolean LJLLL;
    public Bubble LJLLLL;
    public int LJLLLLLL;
    public C73411SrX LJZ;
    public String LJLLILLLL = "ForYou";
    public boolean LJLZ = true;

    public static Context LIZ() {
        AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
        if (abstractC247499nV != null) {
            return abstractC247499nV.LJ();
        }
        return null;
    }

    @Override // X.InterfaceC249909rO
    public final void LJIILIIL() {
        if (this.LJLJJL == 1 && this.LJLJJLL && this.LJLLLLLL == 1) {
            C250999t9 c250999t9 = this.LJLILLLLZI;
            if (c250999t9 != null) {
                c250999t9.LJIIJ(C251659uD.LIZ());
            }
            this.LJLLLLLL = 0;
            C250209rs LIZ = C95J.LIZ(1);
            if (LIZ == null || !(LIZ instanceof C250659sb)) {
                C247669nm.LIZ().LJJJ(0, "tracker", "ongoing");
            }
        }
    }

    @Override // X.InterfaceC249909rO
    public final boolean LJIJ() {
        if (this.LJLJJL == 1) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC249909rO
    public final void LJIJJ() {
        C250999t9 c250999t9 = this.LJLILLLLZI;
        if (c250999t9 != null && (c250999t9.getTranslationX() != 0.0f || c250999t9.getTranslationY() != 0.0f)) {
            c250999t9.setTranslationX(0.0f);
            c250999t9.setTranslationY(0.0f);
        }
        C251009tA c251009tA = this.LJLJI;
        if (c251009tA != null) {
            if (c251009tA.getTranslationX() != 0.0f || c251009tA.getTranslationY() != 0.0f) {
                c251009tA.setTranslationX(0.0f);
                c251009tA.setTranslationY(0.0f);
            }
        }
    }

    @Override // X.InterfaceC249909rO
    public final boolean LJIJJLI() {
        C250999t9 c250999t9;
        C251009tA c251009tA;
        if (this.LJLIL != null && (((c250999t9 = this.LJLILLLLZI) != null && c250999t9.getParent() != null) || ((c251009tA = this.LJLJI) != null && c251009tA.getParent() != null))) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC249909rO
    public final boolean LJJII() {
        C251009tA c251009tA = this.LJLJI;
        if (c251009tA != null && c251009tA.getStaticPendantIsFold()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC249909rO
    public final boolean LJJIJ() {
        boolean z;
        if (this.LJLJJL == 0) {
            C251009tA c251009tA = this.LJLJI;
            if (c251009tA != null) {
                boolean z2 = this.LJLJLLL;
                if (!c251009tA.LLIIJI) {
                    if (z2) {
                        z = c251009tA.LLIIIZ;
                    } else {
                        z = c251009tA.LLIIIL;
                    }
                }
            } else {
                z = false;
            }
            if (!this.LJLJJLL && z) {
                return true;
            }
        }
        z = true;
        return !this.LJLJJLL ? false : false;
    }

    @Override // X.InterfaceC249909rO
    public final int LJJIJL() {
        C251009tA c251009tA = this.LJLJI;
        if (c251009tA != null) {
            return c251009tA.getNormalPendantSubType();
        }
        return 1;
    }

    @Override // X.InterfaceC249909rO
    public final void LIZIZ() {
        C250999t9 c250999t9;
        if (LJIJ() && (c250999t9 = this.LJLILLLLZI) != null) {
            c250999t9.LJFF(this.LJLLLLLL);
        }
        LIZJ(0);
        if (LJIJ() && this.LJLLLLLL == 2) {
            LJI(0);
        }
    }

    @Override // X.InterfaceC249909rO
    public final boolean LJIIJJI() {
        if (LJIJ() && this.LJLLLLLL == 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC249909rO
    public final boolean LJJIJIL() {
        if (LJIJ() && this.LJLLLLLL == 1) {
            return true;
        }
        if (!LJIJ() && this.LJLJLLL) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC249909rO
    public final boolean LJJIZ() {
        if (LJIJ()) {
            return this.LJLLL;
        }
        return this.LJLLJ;
    }

    @Override // X.InterfaceC249909rO
    public final void clear() {
        ViewParent viewParent;
        ViewParent parent;
        ViewParent parent2;
        if (LJIJJLI()) {
            this.LJLIL = null;
            C250999t9 c250999t9 = this.LJLILLLLZI;
            if (c250999t9 != null) {
                viewParent = c250999t9.getParent();
            } else {
                viewParent = null;
            }
            if (viewParent != null) {
                C250999t9 c250999t92 = this.LJLILLLLZI;
                if (c250999t92 != null && (parent2 = c250999t92.getParent()) != null) {
                    C16880lQ.LJLLL(this.LJLILLLLZI, (ViewGroup) parent2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                }
            }
            C251009tA c251009tA = this.LJLJI;
            if (c251009tA != null && c251009tA.getParent() != null) {
                C251009tA c251009tA2 = this.LJLJI;
                if (c251009tA2 != null && (parent = c251009tA2.getParent()) != null) {
                    C16880lQ.LJLLL(this.LJLJI, (ViewGroup) parent);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                }
            }
        }
        this.LJLILLLLZI = null;
        this.LJLJI = null;
        this.LJLJJLL = false;
        this.LJLJLJ = 0;
        this.LJLJLLL = false;
        this.LJLLLLLL = 0;
    }

    @Override // X.InterfaceC249909rO
    public final Bubble LJIL() {
        return this.LJLLLL;
    }

    @Override // X.InterfaceC249909rO
    public final void LIZJ(int i) {
        List arrayList;
        String str;
        TimerPendant timerPendant;
        String str2;
        TimerPendant timerPendant2;
        int i2;
        TimerPendant timerPendant3;
        TimerPendant timerPendant4;
        C9OT c9ot = this.LJLL;
        Boolean bool = null;
        if (c9ot != null && c9ot.LJLILLLLZI != null && LJIJ() && this.LJLLLLLL == 0) {
            C9OT c9ot2 = this.LJLL;
            if (c9ot2 == null || (timerPendant4 = c9ot2.LJLILLLLZI) == null || (arrayList = timerPendant4.textBGColors) == null) {
                arrayList = new ArrayList();
            }
            if (arrayList.isEmpty() || arrayList.size() < 2) {
                C9OT c9ot3 = this.LJLL;
                String str3 = "#FFAF37";
                if (c9ot3 == null || (timerPendant2 = c9ot3.LJLILLLLZI) == null || (str = timerPendant2.textBGColor) == null) {
                    str = "#FFAF37";
                }
                arrayList.add(str);
                C9OT c9ot4 = this.LJLL;
                if (c9ot4 != null && (timerPendant = c9ot4.LJLILLLLZI) != null && (str2 = timerPendant.textBGColor) != null) {
                    str3 = str2;
                }
                arrayList.add(str3);
            }
            C250999t9 c250999t9 = this.LJLILLLLZI;
            if (c250999t9 != null) {
                C9OT c9ot5 = c250999t9.LJZ;
                if (c9ot5 != null && (timerPendant3 = c9ot5.LJLILLLLZI) != null) {
                    bool = timerPendant3.bottomTexShow;
                }
                if (o.LJ(bool, Boolean.TRUE)) {
                    TextView coinTextView = c250999t9.getCoinTextView();
                    if (i > 0) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    coinTextView.setVisibility(i2);
                    c250999t9.getCoinTextView().setText(String.valueOf(i));
                    c250999t9.getCoinTextView().setShadowLayer(1.0f, 3.0f, 3.0f, C247489nU.LIZIZ(C247489nU.LIZ, "#FF7C02"));
                    c250999t9.LLIIJI = i;
                    TextView coinTextView2 = c250999t9.getCoinTextView();
                    GradientDrawable LIZIZ = T28.LIZIZ(0);
                    LIZIZ.setCornerRadius(KL2.LIZJ(c250999t9.getContext(), 8.0f));
                    ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(Integer.valueOf(C247489nU.LIZIZ(C247489nU.LIZ, (String) it.next())));
                    }
                    LIZIZ.setColors(ORZ.LLJ(arrayList2));
                    coinTextView2.setBackground(LIZIZ);
                }
            }
        }
    }

    public final void LIZLLL(C9OT c9ot) {
        List<String> arrayList;
        TimerPendant timerPendant;
        List<String> arrayList2;
        TimerPendant timerPendant2;
        if (c9ot != null && c9ot.LJLILLLLZI != null) {
            C250999t9 c250999t9 = this.LJLILLLLZI;
            if (c250999t9 != null) {
                if (c9ot == null || (timerPendant2 = c9ot.LJLILLLLZI) == null || (arrayList2 = timerPendant2.bgColor) == null) {
                    arrayList2 = new ArrayList<>();
                }
                c250999t9.setProgressBackgroundColor(arrayList2);
            }
            C250999t9 c250999t92 = this.LJLILLLLZI;
            if (c250999t92 != null) {
                if (c9ot == null || (timerPendant = c9ot.LJLILLLLZI) == null || (arrayList = timerPendant.barColor) == null) {
                    arrayList = new ArrayList<>();
                }
                c250999t92.setProgressForegroundColor(arrayList);
            }
            C250999t9 c250999t93 = this.LJLILLLLZI;
            if (c250999t93 != null) {
                c250999t93.setVisibility(8);
            }
        }
    }

    @Override // X.InterfaceC249909rO
    public final void LJI(int i) {
        if (this.LJLJJL == 1 && this.LJLJJLL && this.LJLLLLLL == 2) {
            C250999t9 c250999t9 = this.LJLILLLLZI;
            if (c250999t9 != null) {
                c250999t9.LJIIJ(C251659uD.LIZ());
            }
            this.LJLLLLLL = 0;
            C247679nn.LIZ();
            C249479qh.LJJIII(false);
            LIZJ(i);
            C250209rs LIZ = C95J.LIZ(1);
            if (LIZ == null || !(LIZ instanceof C250659sb)) {
                C247669nm.LIZ().LJJJ(0, "tracker", "ongoing");
            }
        }
    }

    @Override // X.InterfaceC249909rO
    public final void LJIIIIZZ(boolean z) {
        this.LJLZ = z;
    }

    @Override // X.InterfaceC249909rO
    public final void LJIIJ(String content) {
        o.LJIIIZ(content, "content");
        C250999t9 c250999t9 = this.LJLILLLLZI;
        if (c250999t9 != null) {
            c250999t9.LJIIIIZZ(content);
        }
    }

    @Override // X.InterfaceC249909rO
    public final void LJIIZILJ(ViewGroup viewGroup) {
        ViewParent viewParent;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        int i;
        ViewParent parent;
        ViewParent parent2;
        if (LJIJJLI()) {
            return;
        }
        Context LIZ = LIZ();
        this.LJLIL = viewGroup;
        if (this.LJLILLLLZI == null && LIZ != null) {
            final C250999t9 c250999t9 = new C250999t9(LIZ);
            C16880lQ.LJIILJJIL(c250999t9.getShrinkView(), this);
            c250999t9.setOnClickListener(new ViewOnClickListenerC13880ga(this));
            C16880lQ.LJIIJ(this, c250999t9.getLongBubbleLayout());
            c250999t9.getShapeBubbleView().setOnClickListener(new ViewOnClickListenerC13880ga(this));
            c250999t9.setSubViewListener(new InterfaceC251479tv() { // from class: X.9ro
                @Override // X.InterfaceC251479tv
                public final void LIZ() {
                    String str;
                    String str2;
                    String str3;
                    if (!this.LJIJJLI()) {
                        return;
                    }
                    C249969rU c249969rU = (C249969rU) C95J.LIZ(1);
                    if (c249969rU == null || (str = c249969rU.LIZIZ()) == null) {
                        str = "";
                    }
                    boolean z = this.LJLJL;
                    C9OT pendant = C250999t9.this.getPendant();
                    if (o.LJ(this.LJLLILLLL, "ForYou")) {
                        str2 = "homepage_hot";
                    } else {
                        str2 = "homepage_follow";
                    }
                    ViewOnClickListenerC250989t8 viewOnClickListenerC250989t8 = this;
                    boolean z2 = viewOnClickListenerC250989t8.LJLLI;
                    if (viewOnClickListenerC250989t8.LJLJLLL) {
                        str3 = "fold";
                    } else {
                        str3 = "unfold";
                    }
                    C247519nX.LJFF("finished", "non_tracker", str, z ? 1 : 0, "close", pendant, str2, z2, str3, C247669nm.LIZ().LJLJJL, String.valueOf(this.LJJIJL()));
                    ViewOnClickListenerC250989t8 viewOnClickListenerC250989t82 = this;
                    viewOnClickListenerC250989t82.LJLLL = true;
                    viewOnClickListenerC250989t82.LJJIFFI(false, false);
                }
            });
            c250999t9.setVisibility(8);
            C12460eI.LIZIZ(c250999t9, new AbstractC13940gg() { // from class: X.9tP
                public InterfaceC65784Pro<String> LJ = C251329tg.LJLIL;
                public final C251139tN LJFF = new InterfaceC19530ph() { // from class: X.9tN
                    @Override // X.InterfaceC19530ph
                    public final void LIZ(View view, String itemID) {
                        o.LJIIIZ(itemID, "itemID");
                        C250209rs LIZ2 = C95J.LIZ(1);
                        if (LIZ2 != null && (LIZ2 instanceof C250659sb)) {
                            C247669nm.LIZ().LJJJ(0, "tracker", "ongoing");
                        }
                    }
                };

                @Override // X.AbstractC13940gg
                public final InterfaceC65784Pro<String> LIZJ() {
                    return this.LJ;
                }

                @Override // X.AbstractC13940gg
                public final /* bridge */ /* synthetic */ InterfaceC19530ph LJ() {
                    return this.LJFF;
                }

                @Override // X.AbstractC13940gg
                public final void LJIIJJI(InterfaceC65784Pro<String> interfaceC65784Pro) {
                    this.LJ = interfaceC65784Pro;
                }
            });
            this.LJLILLLLZI = c250999t9;
        }
        if (this.LJLJI == null && LIZ != null) {
            final C251009tA c251009tA = new C251009tA(LIZ);
            c251009tA.setOnClickListener(new ViewOnClickListenerC13880ga(this));
            C16880lQ.LJIIJ(this, c251009tA.getLongBubbleLayout());
            c251009tA.setSubViewListener(new InterfaceC251479tv() { // from class: X.9rm
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC251479tv
                public final void LIZ() {
                    String str;
                    String str2;
                    String str3;
                    if (!this.LJIJJLI()) {
                        return;
                    }
                    C249969rU c249969rU = (C249969rU) C95J.LIZ(1);
                    if (c249969rU == null || (str = c249969rU.LIZIZ()) == null) {
                        str = "";
                    }
                    ViewOnClickListenerC250989t8 viewOnClickListenerC250989t8 = this;
                    boolean z = viewOnClickListenerC250989t8.LJLJL;
                    C9OT c9ot = viewOnClickListenerC250989t8.LJLL;
                    if (o.LJ(viewOnClickListenerC250989t8.LJLLILLLL, "ForYou")) {
                        str2 = "homepage_hot";
                    } else {
                        str2 = "homepage_follow";
                    }
                    ViewOnClickListenerC250989t8 viewOnClickListenerC250989t82 = this;
                    boolean z2 = viewOnClickListenerC250989t82.LJLLI;
                    if (viewOnClickListenerC250989t82.LJLJLLL) {
                        str3 = "fold";
                    } else {
                        str3 = "unfold";
                    }
                    C247519nX.LJFF("finished", "non_tracker", str, z ? 1 : 0, "close", c9ot, str2, z2, str3, C247669nm.LIZ().LJLJJL, String.valueOf(C251009tA.this.getNormalPendantSubType()));
                    ViewOnClickListenerC250989t8 viewOnClickListenerC250989t83 = this;
                    viewOnClickListenerC250989t83.LJLLJ = true;
                    int i2 = 0;
                    viewOnClickListenerC250989t83.LJJIFFI(false, false);
                    C249939rR c249939rR = C250079rf.LIZ;
                    C250159rn c250159rn = c249939rR.LIZIZ;
                    if (c250159rn != null) {
                        long LIZ2 = C250159rn.LIZ();
                        String[] stringArray = c250159rn.LIZ.getStringArray(c250159rn.LIZIZ, new String[0]);
                        o.LJIIIIZZ(stringArray, "getKeva().getStringArray(type, arrayOf())");
                        ArrayList arrayList = (ArrayList) ORY.LJLIIIL(stringArray);
                        arrayList.add(String.valueOf(LIZ2));
                        Keva keva = c250159rn.LIZ;
                        String str4 = c250159rn.LIZIZ;
                        String[] strArr = new String[arrayList.size()];
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            strArr[i2] = it.next();
                            i2++;
                        }
                        keva.storeStringArray(str4, strArr);
                        if (c249939rR.LJFF <= 0) {
                            int i3 = c249939rR.LIZJ;
                            if (i3 > 0 && c249939rR.LJ > 0 && c249939rR.LIZLLL > 0 && c249939rR.LIZIZ.LIZIZ(i3) >= c249939rR.LIZLLL) {
                                c249939rR.LIZLLL().storeLong("not_show_before_stamp", C249939rR.LIZ() + (c249939rR.LJ * 86400000));
                                return;
                            }
                            return;
                        }
                        int i4 = c249939rR.LIZJ;
                        if (i4 <= 0 || c249939rR.LIZLLL <= 0 || c249939rR.LIZIZ.LIZIZ(i4) < c249939rR.LIZLLL) {
                            return;
                        }
                        c249939rR.LIZLLL().storeLong("not_show_before_stamp", System.currentTimeMillis() + (c249939rR.LJFF * 3600000));
                    }
                }
            });
            c251009tA.setVisibility(8);
            C12460eI.LIZIZ(c251009tA, new AbstractC13940gg() { // from class: X.9tQ
                public InterfaceC65784Pro<String> LJ = C251339th.LJLIL;
                public final C251149tO LJFF = new InterfaceC19530ph() { // from class: X.9tO
                    @Override // X.InterfaceC19530ph
                    public final void LIZ(View view, String itemID) {
                        o.LJIIIZ(itemID, "itemID");
                        C250209rs LIZ2 = C95J.LIZ(1);
                        if (LIZ2 != null && (LIZ2 instanceof C250659sb)) {
                            C247669nm.LIZ().LJJJ(0, "non_tracker", "finished");
                        }
                    }
                };

                @Override // X.AbstractC13940gg
                public final boolean LJI() {
                    return true;
                }

                @Override // X.AbstractC13940gg
                public final boolean LJII() {
                    return true;
                }

                @Override // X.AbstractC13940gg
                public final boolean LJIIJ() {
                    return true;
                }

                @Override // X.AbstractC13940gg
                public final InterfaceC65784Pro<String> LIZJ() {
                    return this.LJ;
                }

                @Override // X.AbstractC13940gg
                public final /* bridge */ /* synthetic */ InterfaceC19530ph LJ() {
                    return this.LJFF;
                }

                @Override // X.AbstractC13940gg
                public final void LJIIJJI(InterfaceC65784Pro<String> interfaceC65784Pro) {
                    this.LJ = interfaceC65784Pro;
                }
            });
            this.LJLJI = c251009tA;
        }
        C250999t9 c250999t92 = this.LJLILLLLZI;
        ViewGroup.LayoutParams layoutParams3 = null;
        if (c250999t92 != null) {
            viewParent = c250999t92.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent != null) {
            C250999t9 c250999t93 = this.LJLILLLLZI;
            if (c250999t93 != null && (parent2 = c250999t93.getParent()) != null) {
                C16880lQ.LJLLL(this.LJLILLLLZI, (ViewGroup) parent2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
        }
        C251009tA c251009tA2 = this.LJLJI;
        if (c251009tA2 != null && c251009tA2.getParent() != null) {
            C251009tA c251009tA3 = this.LJLJI;
            if (c251009tA3 != null && (parent = c251009tA3.getParent()) != null) {
                C16880lQ.LJLLL(this.LJLJI, (ViewGroup) parent);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
        }
        if ((viewGroup instanceof FrameLayout) || (viewGroup instanceof RelativeLayout)) {
            viewGroup.addView(this.LJLILLLLZI);
            viewGroup.addView(this.LJLJI);
        }
        int LJIILL = KL2.LJIILL(LIZ(), KL2.LJIIL(LIZ()) + 0.0f);
        if (LIZ != null) {
            if (C248069oQ.LIZ(LIZ)) {
                i = 80;
            } else {
                i = 70;
            }
            LJIILL += i;
        }
        C250999t9 c250999t94 = this.LJLILLLLZI;
        if (c250999t94 != null && (layoutParams = c250999t94.getLayoutParams()) != null) {
            layoutParams.height = -2;
            layoutParams.width = -2;
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).topMargin = (int) KL2.LIZJ(LIZ(), LJIILL);
        }
        C250999t9 c250999t95 = this.LJLILLLLZI;
        if (c250999t95 != null) {
            c250999t95.setLayoutParams(layoutParams);
        }
        C251009tA c251009tA4 = this.LJLJI;
        if (c251009tA4 != null && (layoutParams2 = c251009tA4.getLayoutParams()) != null) {
            layoutParams2.height = -2;
            layoutParams2.width = -2;
            layoutParams3 = layoutParams2;
        }
        if (layoutParams3 instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams3).topMargin = (int) KL2.LIZJ(LIZ(), LJIILL);
        }
        C251009tA c251009tA5 = this.LJLJI;
        if (c251009tA5 != null) {
            c251009tA5.setLayoutParams(layoutParams3);
        }
    }

    @Override // X.InterfaceC249909rO
    public final void LJIJI(int i) {
        float width;
        if (i == 0 || !this.LJLZ || this.LJLLLLLL != 0) {
            return;
        }
        int i2 = this.LJLJLJ + 1;
        this.LJLJLJ = i2;
        if (i2 < i) {
            return;
        }
        this.LJLLLLLL = 1;
        C250999t9 c250999t9 = this.LJLILLLLZI;
        if (c250999t9 != null) {
            c250999t9.getShapeBubbleView().setVisibility(8);
            boolean LIZ = C251659uD.LIZ();
            C250999t9 c250999t92 = this.LJLILLLLZI;
            if (c250999t92 != null) {
                c250999t92.setCanDrag(false);
                Object parent = c250999t92.getParent();
                if (parent != null) {
                    View view = (View) parent;
                    if (!LIZ) {
                        width = KL2.LIZJ(c250999t92.getContext(), -56.0f);
                    } else {
                        width = view.getWidth();
                    }
                    c250999t92.animate().setListener(new IDAListenerS2S0110000_4(c250999t92, LIZ, 2)).x(width).y(c250999t92.getY()).setInterpolator(new DecelerateInterpolator()).setDuration(200L).start();
                    c250999t92.getLongBubbleLayout().setVisibility(8);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                }
            }
            this.LJLJLJ = 0;
        }
        C250209rs LIZ2 = C95J.LIZ(1);
        if (LIZ2 != null && (LIZ2 instanceof C250659sb)) {
            return;
        }
        C247669nm.LIZ().LJJJ(0, "tracker", "ongoing");
    }

    @Override // X.InterfaceC249909rO
    public final void LJJ(String str) {
        int LIZJ;
        int i;
        ViewGroup.LayoutParams layoutParams;
        C251009tA c251009tA = this.LJLJI;
        if (c251009tA != null) {
            if (c251009tA.LLF == null) {
                c251009tA.LLD = c251009tA.findViewById(R.id.jz1);
                c251009tA.LLF = (TextView) c251009tA.findViewById(R.id.jz2);
            }
            TextView textView = c251009tA.LLF;
            if (textView != null) {
                textView.setText(str);
            }
            View view = c251009tA.LLD;
            ViewGroup.LayoutParams layoutParams2 = null;
            if (view != null) {
                layoutParams2 = view.getLayoutParams();
            }
            if (str.length() <= 11) {
                LIZJ = (int) KL2.LIZJ(c251009tA.getContext(), 80.0f);
                i = 1;
            } else {
                LIZJ = (int) KL2.LIZJ(c251009tA.getContext(), 300.0f);
                i = 0;
            }
            if (layoutParams2 != null) {
                layoutParams2.width = LIZJ;
            }
            View view2 = c251009tA.LLD;
            if (view2 != null) {
                view2.setLayoutParams(layoutParams2);
            }
            TextView textView2 = c251009tA.LLF;
            if (textView2 != null && (layoutParams = textView2.getLayoutParams()) != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams3.gravity = i;
                TextView textView3 = c251009tA.LLF;
                if (textView3 != null) {
                    textView3.setLayoutParams(layoutParams3);
                }
                View view3 = c251009tA.LLD;
                if (view3 != null) {
                    C251199tT c251199tT = new C251199tT(c251009tA, view3);
                    c251199tT.LIZIZ.setCanDrag(false);
                    c251199tT.LIZJ.setVisibility(4);
                    c251199tT.LIZJ.postDelayed(new ARunnableS40S0100000_4(c251199tT, 131), 100L);
                }
                InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
                if (interfaceC247459nR != null) {
                    interfaceC247459nR.LIZIZ("widget_bubble2_show", C0JU.LIZ("type", "tapme_short_inform"));
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
    }

    @Override // X.InterfaceC249909rO
    public final void LJJIII(boolean z) {
        C250999t9 c250999t9 = this.LJLILLLLZI;
        if (c250999t9 != null) {
            c250999t9.setDragForbidden(z);
        }
        C251009tA c251009tA = this.LJLJI;
        if (c251009tA != null) {
            c251009tA.setDragForbidden(z);
        }
    }

    @Override // X.InterfaceC249909rO
    public final void LJJIIZ(String str) {
        float f;
        C250999t9 c250999t9 = this.LJLILLLLZI;
        if (c250999t9 != null) {
            if (c250999t9.LLIIL == null) {
                c250999t9.LLIIJLIL = c250999t9.findViewById(R.id.jz1);
                c250999t9.LLIIL = (TextView) c250999t9.findViewById(R.id.jz2);
            }
            TextView textView = c250999t9.LLIIL;
            if (textView != null) {
                textView.setText(str);
            }
            View view = c250999t9.LLIIJLIL;
            if (view != null) {
                C251239tX c251239tX = new C251239tX(c250999t9, view);
                View view2 = c251239tX.LIZJ;
                Context context = view2.getContext();
                float f2 = 0.0f;
                if (context != null) {
                    Resources resources = context.getResources();
                    o.LJIIIIZZ(resources, "context.resources");
                    f = (resources.getDisplayMetrics().density * 20.0f) + 0.5f;
                } else {
                    f = 0.0f;
                }
                view2.setPivotX(f);
                View view3 = c251239tX.LIZJ;
                Context context2 = view3.getContext();
                if (context2 != null) {
                    Resources resources2 = context2.getResources();
                    o.LJIIIIZZ(resources2, "context.resources");
                    f2 = (resources2.getDisplayMetrics().density * 25.0f) + 0.5f;
                }
                view3.setPivotY(f2);
                final AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(c251239tX.LIZJ, "scaleX", 1.3f, 1.0f), ObjectAnimator.ofFloat(c251239tX.LIZJ, "scaleY", 1.3f, 1.0f));
                animatorSet.setDuration(297L);
                animatorSet.addListener(new C251259tZ(c251239tX));
                animatorSet.setTarget(c251239tX.LIZJ);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ObjectAnimator.ofFloat(c251239tX.LIZJ, "scaleX", 0.0f, 1.3f), ObjectAnimator.ofFloat(c251239tX.LIZJ, "scaleY", 0.0f, 1.3f));
                animatorSet2.setDuration(528L);
                animatorSet2.addListener(new C251319tf() { // from class: X.9tS
                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animation) {
                        o.LJIIIZ(animation, "animation");
                        animatorSet.start();
                    }
                });
                animatorSet2.setTarget(c251239tX.LIZJ);
                c251239tX.LIZJ.setVisibility(0);
                animatorSet2.start();
                c251239tX.LIZ = false;
            }
            InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
            if (interfaceC247459nR != null) {
                interfaceC247459nR.LIZIZ("widget_bubble2_show", C0JU.LIZ("type", "tapme_timer_short_inform"));
            }
        }
    }

    @Override // X.InterfaceC249909rO
    public final void LJJIJIIJI(String curTab) {
        o.LJIIIZ(curTab, "curTab");
        this.LJLLILLLL = curTab;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        float width;
        if (view != null && view.getId() == R.id.k09) {
            if (this.LJLJJL == 1 && this.LJLJJLL && this.LJLLLLLL == 1) {
                C247669nm.LIZ().LJJIZ("tracker");
                C250999t9 c250999t9 = this.LJLILLLLZI;
                if (c250999t9 != null) {
                    boolean LIZ = C251659uD.LIZ();
                    Object parent = c250999t9.getParent();
                    if (parent != null) {
                        View view2 = (View) parent;
                        if (!LIZ) {
                            width = KL2.LIZJ(c250999t9.getContext(), -56.0f);
                        } else {
                            width = view2.getWidth();
                        }
                        c250999t9.animate().setListener(new IDAListenerS2S0110000_4(c250999t9, LIZ, 3)).x(width).y(c250999t9.getY()).setInterpolator(new DecelerateInterpolator()).setDuration(200L).start();
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                    }
                }
                this.LJLLLLLL = 0;
                C250209rs LIZ2 = C95J.LIZ(1);
                if (LIZ2 == null || !(LIZ2 instanceof C250659sb)) {
                    C247669nm.LIZ().LJJJ(0, "tracker", "ongoing");
                    return;
                }
                return;
            }
            return;
        }
        View.OnClickListener onClickListener = this.LJLJJI;
        if (onClickListener == null) {
            return;
        }
        onClickListener.onClick(view);
    }

    @Override // X.InterfaceC249909rO
    public final void LJIIIZ(boolean z, boolean z2) {
        C250999t9 c250999t9 = this.LJLILLLLZI;
        if (c250999t9 != null) {
            c250999t9.LJI(z, z2);
        }
    }

    @Override // X.InterfaceC249909rO
    public final void LJIIL(int i, int i2) {
        C250999t9 c250999t9;
        if (!LJIJJLI() || !LJIJ() || (c250999t9 = this.LJLILLLLZI) == null || i < 0 || i2 < 0 || i > i2 || c250999t9.LJLLL > i) {
            return;
        }
        c250999t9.getProgressBarTimerView().setVisibility(0);
        ValueAnimator animator = ValueAnimator.ofFloat(c250999t9.LJLLL, i);
        o.LJIIIIZZ(animator, "animator");
        animator.setDuration(1000L);
        animator.setInterpolator(new LinearInterpolator());
        animator.addUpdateListener(new AUListenerS68S0101000_4(c250999t9, i2, 0));
        c250999t9.LJLLL = i;
        animator.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.9rp] */
    @Override // X.InterfaceC249909rO
    public final void LJIILLIIL(String str, List<String> list) {
        if (this.LJLLLLLL == 0 && str.length() > 0) {
            this.LJLLLLLL = 2;
            C247679nn.LIZ();
            C249479qh.LJJIII(true);
            C250999t9 c250999t9 = this.LJLILLLLZI;
            if (c250999t9 != 0) {
                c250999t9.LJIIIZ(str, list, new InterfaceC250539sP() { // from class: X.9rp
                    @Override // X.InterfaceC250539sP
                    public final void LIZ() {
                        C9OT c9ot;
                        TimerPendant timerPendant;
                        Integer num;
                        final ViewOnClickListenerC250989t8 viewOnClickListenerC250989t8 = ViewOnClickListenerC250989t8.this;
                        if (viewOnClickListenerC250989t8.LJZ != null || (c9ot = viewOnClickListenerC250989t8.LJLL) == null || (timerPendant = c9ot.LJLILLLLZI) == null || (num = timerPendant.awardCycleInterval) == null) {
                            return;
                        }
                        long intValue = num.intValue();
                        viewOnClickListenerC250989t8.LJZ = (C73411SrX) AbstractC73672Svk.LJJIIZI(intValue, intValue, TimeUnit.SECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS56S0100000_4(viewOnClickListenerC250989t8, 4));
                        C250999t9 c250999t92 = viewOnClickListenerC250989t8.LJLILLLLZI;
                        if (c250999t92 == null) {
                            return;
                        }
                        c250999t92.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.9rq
                            @Override // android.view.View.OnAttachStateChangeListener
                            public final void onViewAttachedToWindow(View v) {
                                o.LJIIIZ(v, "v");
                            }

                            @Override // android.view.View.OnAttachStateChangeListener
                            public final void onViewDetachedFromWindow(View v) {
                                o.LJIIIZ(v, "v");
                                ViewOnClickListenerC250989t8 viewOnClickListenerC250989t82 = ViewOnClickListenerC250989t8.this;
                                C73411SrX c73411SrX = viewOnClickListenerC250989t82.LJZ;
                                if (c73411SrX != null && !c73411SrX.isDisposed()) {
                                    c73411SrX.dispose();
                                }
                                viewOnClickListenerC250989t82.LJZ = null;
                            }
                        });
                    }
                });
            }
            C250209rs LIZ = C95J.LIZ(1);
            if (LIZ == null || !(LIZ instanceof C250659sb)) {
                C247669nm.LIZ().LJJJ(0, "tracker", "ongoing");
            }
        }
    }

    @Override // X.InterfaceC249909rO
    public final boolean LJJI(int i, int i2) {
        if (i2 > 0 && C249919rP.LIZLLL(this.LJLL) + i2 <= i) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC249909rO
    public final void LJJIFFI(boolean z, boolean z2) {
        C250209rs LIZ;
        if (!LJIJJLI()) {
            return;
        }
        if (z2) {
            C247669nm.LIZ().LJLJJI = 0;
        }
        if (this.LJLJJLL == z && this.LJLJL == z2) {
            return;
        }
        this.LJLJJLL = z;
        this.LJLJL = z2;
        if (z2) {
            this.LJLLJ = false;
            this.LJLLL = false;
        }
        int i = this.LJLJJL;
        int i2 = 8;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            C250999t9 c250999t9 = this.LJLILLLLZI;
            if (c250999t9 != null) {
                if (z) {
                    i2 = 0;
                }
                c250999t9.setVisibility(i2);
            }
            if (!this.LJLJJLL) {
                return;
            }
            C250209rs LIZ2 = C95J.LIZ(1);
            if (LIZ2 != null && (LIZ2 instanceof C250659sb)) {
                return;
            }
            C247669nm.LIZ().LJJJ(0, "tracker", "ongoing");
            return;
        }
        C251009tA c251009tA = this.LJLJI;
        if (c251009tA != null) {
            if (z) {
                i2 = 0;
            }
            c251009tA.setVisibility(i2);
        }
        if (LJJIJ() && ((LIZ = C95J.LIZ(1)) == null || !(LIZ instanceof C250659sb))) {
            C247669nm.LIZ().LJJJ(0, "non_tracker", "finished");
        }
        if (!this.LJLJL || !LJJII()) {
            return;
        }
        C251009tA c251009tA2 = this.LJLJI;
        if (c251009tA2 != null) {
            c251009tA2.LJI();
        }
        this.LJLJLLL = false;
    }

    @Override // X.InterfaceC249909rO
    public final void LJJIIJ(Bubble bubble, String countdownString) {
        String str;
        o.LJIIIZ(countdownString, "countdownString");
        this.LJLLLL = bubble;
        C250999t9 c250999t9 = this.LJLILLLLZI;
        if (c250999t9 == null || !c250999t9.LJLZ || (str = bubble.longContent) == null) {
            return;
        }
        String LJJJJZ = ujb.o.LJJJJZ(str, "{countdownTimer}", countdownString, false);
        AAY shapeBubbleView = c250999t9.getShapeBubbleView();
        AnimatorSet animatorSet = shapeBubbleView.LJLJJL;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = shapeBubbleView.LJLJJL;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            shapeBubbleView.setVisibility(8);
        }
        c250999t9.getShapeBubbleView().setBubbleText(LJJJJZ);
        if (c250999t9.getShapeBubbleView().getVisibility() == 0) {
            if (!o.LJ(countdownString, "00:00")) {
                return;
            }
            c250999t9.getShapeBubbleView().LIZIZ(new AqS154S0100000_4(c250999t9, 1023));
            return;
        }
        c250999t9.getShapeBubbleView().LIZ();
    }

    @Override // X.InterfaceC249909rO
    public final void LJJIJLIJ(C9OT c9ot, boolean z) {
        this.LJLL = c9ot;
        this.LJLLI = z;
        C250999t9 c250999t9 = this.LJLILLLLZI;
        if (c250999t9 != null) {
            c250999t9.setPendant(c9ot);
        }
    }

    @Override // X.InterfaceC249909rO
    public final void LJIILJJIL(String str, String str2, Bubble bubble) {
        C251349ti c251349ti;
        this.LJLLLL = bubble;
        C251009tA c251009tA = this.LJLJI;
        if (c251009tA != null) {
            c251009tA.LLFFF = c251009tA.findViewById(R.id.g_h);
            c251009tA.LLFII = (TextView) c251009tA.findViewById(R.id.g_j);
            View findViewById = c251009tA.findViewById(R.id.bfu);
            c251009tA.LLFZ = findViewById;
            if (findViewById != null) {
                C16880lQ.LJIIJ(new ACListenerS26S1200000_4(c251009tA, bubble, str2, 4), findViewById);
            }
            TextView textView = c251009tA.LLFII;
            if (textView != null) {
                textView.setText(str);
            }
            View view = c251009tA.LLFFF;
            if (view != null) {
                c251349ti = new C251349ti(c251009tA, c251009tA.getLongBubbleLayout(), view);
            } else {
                c251349ti = null;
            }
            c251009tA.LLIIL = c251349ti;
            if (c251349ti != null) {
                c251349ti.LIZJ.setVisibility(4);
                c251349ti.LIZJ.postDelayed(new ARunnableS40S0100000_4(c251349ti, 117), 100L);
            }
            InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
            if (interfaceC247459nR != null) {
                interfaceC247459nR.LIZIZ("widget_bubble2_show", C0JU.LIZ("type", str2));
            }
        }
    }

    @Override // X.InterfaceC249909rO
    public final void LJIILL(boolean z, boolean z2, C249929rQ c249929rQ) {
        TimerPendant timerPendant;
        String str;
        C250999t9 c250999t9;
        TimerPendant timerPendant2;
        String str2;
        List<String> arrayList;
        String str3;
        TimerPendant timerPendant3;
        TimerPendant timerPendant4;
        this.LJLJJL = z ? 1 : 0;
        this.LJLJJLL = true;
        this.LJLLJ = false;
        this.LJLJLLL = false;
        NormalPendant normalPendant = null;
        if (z) {
            if (!z) {
                return;
            }
            C250999t9 c250999t92 = this.LJLILLLLZI;
            if (c250999t92 != null) {
                c250999t92.LJFF(this.LJLLLLLL);
            }
            C251009tA c251009tA = this.LJLJI;
            if (c251009tA != null) {
                c251009tA.setVisibility(8);
            }
            C250999t9 c250999t93 = this.LJLILLLLZI;
            if (c250999t93 != null) {
                c250999t93.setVisibility(0);
            }
            if (z2) {
                C9OT c9ot = this.LJLL;
                if (c9ot != null && (timerPendant2 = c9ot.LJLILLLLZI) != null && (str2 = timerPendant2.rewardLottieName) != null && str2.length() != 0) {
                    C9OT c9ot2 = this.LJLL;
                    if (c9ot2 == null || (timerPendant4 = c9ot2.LJLILLLLZI) == null || (arrayList = timerPendant4.awardTextBGColor) == null) {
                        arrayList = new ArrayList<>();
                    }
                    if (arrayList.isEmpty() || arrayList.size() < 2) {
                        arrayList.add("#FF6C89");
                        arrayList.add("#FE2C55");
                    }
                    C9OT c9ot3 = this.LJLL;
                    if (c9ot3 == null || (timerPendant3 = c9ot3.LJLILLLLZI) == null || (str3 = timerPendant3.rewardText) == null) {
                        str3 = "";
                    }
                    LJIILLIIL(str3, arrayList);
                }
            } else {
                if (this.LJLLLLLL == 2) {
                    LJI(0);
                }
                C9OT c9ot4 = this.LJLL;
                if (c9ot4 != null && (timerPendant = c9ot4.LJLILLLLZI) != null && (str = timerPendant.breathLottieName) != null && str.length() != 0 && (c250999t9 = this.LJLILLLLZI) != null) {
                    c250999t9.LJLLLLLL = true;
                    if (c250999t9.getVisibility() == 0) {
                        c250999t9.getLottieView().setVisibility(8);
                        c250999t9.getBreathLottieView().setVisibility(0);
                        C251069tG.LIZ(c250999t9.getBreathLottieView());
                    }
                }
            }
            c249929rQ.invoke(Boolean.TRUE);
            return;
        }
        C250999t9 c250999t94 = this.LJLILLLLZI;
        if (c250999t94 != null) {
            c250999t94.setVisibility(8);
        }
        C251009tA c251009tA2 = this.LJLJI;
        if (c251009tA2 != null) {
            c251009tA2.setVisibility(0);
        }
        C251009tA c251009tA3 = this.LJLJI;
        if (c251009tA3 == null) {
            return;
        }
        C9OT c9ot5 = this.LJLL;
        if (c9ot5 != null) {
            normalPendant = c9ot5.LJLIL;
        }
        c251009tA3.LIZ(normalPendant, c249929rQ);
    }

    @Override // X.InterfaceC249909rO
    public final void LJJIJIIJIL(String str, String str2, Bubble bubble) {
        C251389tm c251389tm;
        View view;
        this.LJLLLL = bubble;
        C250999t9 c250999t9 = this.LJLILLLLZI;
        if (c250999t9 != null) {
            if (c250999t9.LLIIL == null) {
                c250999t9.LLIIJLIL = c250999t9.findViewById(R.id.jz1);
                c250999t9.LLIIL = (TextView) c250999t9.findViewById(R.id.jz2);
                c250999t9.LLIILII = c250999t9.findViewById(R.id.g_h);
                c250999t9.LLIILZL = (TextView) c250999t9.findViewById(R.id.g_j);
                View findViewById = c250999t9.findViewById(R.id.bfu);
                c250999t9.LLIIZ = findViewById;
                if (findViewById != null) {
                    C16880lQ.LJIIJ(new ACListenerS39S0200000_4(c250999t9, bubble, 54), findViewById);
                }
            }
            TextView textView = c250999t9.LLIILZL;
            if (textView != null) {
                textView.setText(str);
            }
            TextView textView2 = c250999t9.LLIIL;
            if (textView2 != null) {
                textView2.setText(str2);
            }
            View view2 = c250999t9.LLIIJLIL;
            if (view2 != null && (view = c250999t9.LLIILII) != null) {
                c251389tm = new C251389tm(c250999t9, view2, c250999t9.getLongBubbleLayout(), view);
            } else {
                c251389tm = null;
            }
            c250999t9.LLIL = c251389tm;
            if (c251389tm != null) {
                c251389tm.LJ.setVisibility(4);
                c251389tm.LJ.postDelayed(new ARunnableS40S0100000_4(c251389tm, 119), 100L);
            }
            InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
            if (interfaceC247459nR != null) {
                interfaceC247459nR.LIZIZ("widget_bubble_show", new LinkedHashMap());
            }
        }
    }

    @Override // X.InterfaceC249909rO
    public final void LJJIIJZLJL(int i, int i2, final String str, boolean z) {
        NormalPendant normalPendant;
        float width;
        C9OT c9ot = this.LJLL;
        if (c9ot != null && (normalPendant = c9ot.LJLIL) != null && normalPendant.shrinkAfter != 0 && !this.LJLJLLL && i >= C249919rP.LIZLLL(c9ot) + i2) {
            this.LJLJLLL = true;
            if (this.LJLJI != null) {
                final boolean LIZ = C251659uD.LIZ();
                final C251009tA c251009tA = this.LJLJI;
                if (c251009tA != null) {
                    c251009tA.LL = true;
                    c251009tA.setCanDrag(false);
                    c251009tA.setCloseViewStatus(z);
                    c251009tA.LLIIIJ = z;
                    Object parent = c251009tA.getParent();
                    if (parent != null) {
                        View view = (View) parent;
                        if (!LIZ) {
                            width = KL2.LIZJ(c251009tA.getContext(), -80.0f);
                        } else {
                            width = view.getWidth();
                        }
                        c251009tA.animate().setListener(new Animator.AnimatorListener() { // from class: X.9tR
                            @Override // android.animation.Animator.AnimatorListener
                            public final void onAnimationCancel(Animator animation) {
                                o.LJIIIZ(animation, "animation");
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public final void onAnimationRepeat(Animator animation) {
                                o.LJIIIZ(animation, "animation");
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public final void onAnimationStart(Animator animation) {
                                o.LJIIIZ(animation, "animation");
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animation) {
                                o.LJIIIZ(animation, "animation");
                                C251009tA.this.setCloseViewStatus(false);
                                C251009tA.this.LIZLLL(str, LIZ);
                            }
                        }).x(width).y(c251009tA.getY()).setInterpolator(new DecelerateInterpolator()).setDuration(200L).start();
                        c251009tA.getLongBubbleLayout().setVisibility(8);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                }
            }
        }
    }

    @Override // X.InterfaceC249909rO
    public final void LJJIIZI(final Bubble bubble, final String templateValue, final String str, final boolean z) {
        o.LJIIIZ(templateValue, "templateValue");
        this.LJLLLL = bubble;
        C250999t9 c250999t9 = this.LJLILLLLZI;
        if (c250999t9 != null && c250999t9.getLottieView().isAnimating()) {
            C250999t9 c250999t92 = this.LJLILLLLZI;
            if (c250999t92 != null) {
                c250999t92.getLottieView().addAnimatorListener(new AnimatorListenerAdapter() { // from class: X.9tD
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animation) {
                        o.LJIIIZ(animation, "animation");
                        C250999t9 c250999t93 = ViewOnClickListenerC250989t8.this.LJLILLLLZI;
                        if (c250999t93 != null) {
                            c250999t93.getLottieView().removeAnimatorListener(this);
                        }
                        C250999t9 c250999t94 = ViewOnClickListenerC250989t8.this.LJLILLLLZI;
                        if (c250999t94 != null) {
                            c250999t94.LJII(bubble, templateValue, str, z);
                        }
                    }
                });
                return;
            }
            return;
        }
        C250999t9 c250999t93 = this.LJLILLLLZI;
        if (c250999t93 == null) {
            return;
        }
        c250999t93.LJII(bubble, templateValue, str, z);
    }

    @Override // X.InterfaceC249909rO
    public final void LJJIL(String str, Bubble bubble, boolean z, View.OnClickListener onClickListener) {
        C251409to c251409to;
        int i;
        this.LJLLLL = bubble;
        C250999t9 c250999t9 = this.LJLILLLLZI;
        if (c250999t9 != null) {
            if (c250999t9.LLIILZL == null) {
                c250999t9.LLIILII = c250999t9.findViewById(R.id.g_h);
                c250999t9.LLIILZL = (TextView) c250999t9.findViewById(R.id.g_j);
                View findViewById = c250999t9.findViewById(R.id.bfu);
                c250999t9.LLIIZ = findViewById;
                if (findViewById != null) {
                    C16880lQ.LJIIJ(new ACListenerS39S0200000_4(c250999t9, bubble, 53), findViewById);
                }
            }
            View view = c250999t9.LLIILII;
            if (view != null) {
                C16880lQ.LJIIJ(onClickListener, view);
            }
            TextView textView = c250999t9.LLIILZL;
            if (textView != null) {
                String str2 = bubble.highlightContent;
                int LIZIZ = C247489nU.LIZIZ(C247489nU.LIZ, "#FFAE0F");
                int length = str.length();
                CharSequence charSequence = str;
                charSequence = str;
                if (length != 0 && str2 != null) {
                    charSequence = str;
                    if (str2.length() != 0) {
                        boolean LJJJLZIJ = s.LJJJLZIJ(str, str2, false);
                        charSequence = str;
                        if (LJJJLZIJ) {
                            int LJJLIIIJL = s.LJJLIIIJL(str, str2, 0, false, 6);
                            int length2 = str2.length() + LJJLIIIJL;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            spannableStringBuilder.append((CharSequence) str);
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(LIZIZ), LJJLIIIJL, length2, 33);
                            charSequence = new SpannedString(spannableStringBuilder);
                        }
                    }
                }
                textView.setText(charSequence);
            }
            View view2 = c250999t9.LLIILII;
            if (view2 != null) {
                View longBubbleLayout = c250999t9.getLongBubbleLayout();
                Integer num = bubble.showDuration;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 5;
                }
                c251409to = new C251409to(c250999t9, longBubbleLayout, view2, i);
            } else {
                c251409to = null;
            }
            c250999t9.LLILII = c251409to;
            if (c251409to != null) {
                c251409to.LIZJ.setVisibility(4);
                if (z) {
                    c251409to.LIZJ.postDelayed(new ARunnableS40S0100000_4(c251409to, 123), 1000L);
                } else {
                    c251409to.LIZIZ();
                }
            }
            InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
            if (interfaceC247459nR != null) {
                interfaceC247459nR.LIZIZ("widget_bubble2_show", C0JU.LIZ("type", "watch_video"));
            }
        }
    }

    @Override // X.InterfaceC249909rO
    public final void LJII(boolean z, int i, InterfaceC88472Yns interfaceC88472Yns, boolean z2, boolean z3) {
        C250999t9 c250999t9;
        if (!LJIJJLI() || !LJIJ() || (c250999t9 = this.LJLILLLLZI) == null) {
            return;
        }
        c250999t9.LIZ(z, i, interfaceC88472Yns, this.LJLLLLLL, z2, z3);
    }
}
