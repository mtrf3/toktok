package X;

import Y.AObjectS89S0100000_14;
import Y.ARunnableS33S0200000_14;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.Vxd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81433Vxd extends WMH implements InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIII;
    public final C82622Wbi LJLIL;
    public final C29901Fi<WS0> LJLILLLLZI;
    public final C40871j1<Integer> LJLJI;
    public final C0IB<Boolean> LJLJJI;
    public final C0IB<C76800UCe> LJLJJL;
    public final LiveEvent<C35512Dwi> LJLJJLL;
    public final String LJLJL;
    public final C46611sH<Integer> LJLJLJ;
    public final Object LJLJLLL;
    public ViewOnTouchListenerC81419VxP LJLL;
    public C119344mI LJLLI;
    public View LJLLILLLL;
    public final int LJLLJ;
    public final java.util.Set<String> LJLLL;
    public final C81435Vxf LJLLLL;
    public final C53266KvO LJLLLLLL;
    public final java.util.Map<Integer, View> LJLZ;
    public final int LJZ;
    public final int LJZI;
    public final int LJZL;
    public final int LL;
    public final int LLD;
    public final int LLF;
    public final int LLFF;
    public final boolean LLFFF;
    public final C82631Wbr LLFII;
    public final SafeHandler LLFZ;
    public int LLI;
    public final AObjectS89S0100000_14 LLIFFJFJJ;
    public final C62822Ol8 LLII;

    static {
        TBT tbt = new TBT(C81433Vxd.class, "recordPermissionApiComponent", "getRecordPermissionApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/permissionmanager/RecordPermissionUIApiComponent;", 0);
        C65352Pkq.LIZ.getClass();
        LLIIII = new InterfaceC74236TBo[]{tbt};
    }

    public final ViewOnTouchListenerC81419VxP LLJILJILJ() {
        ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP = this.LJLL;
        if (viewOnTouchListenerC81419VxP != null) {
            return viewOnTouchListenerC81419VxP;
        }
        o.LJIJI("tabHost");
        throw null;
    }

    public final void LLJJIII() {
        C0IB<Boolean> iz;
        if (!C78605Ut7.LIZJ(new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"})) {
            I8W i8w = (I8W) this.LLFII.LIZ(this, LLIIII[0]);
            if (i8w != null && (iz = i8w.iz()) != null) {
                iz.LIZIZ(this, new AObjectS89S0100000_14(this, 356));
                return;
            }
            return;
        }
        if (this.LJZ >= 0 && !requireActivity().isFinishing()) {
            C53266KvO c53266KvO = this.LJLLLLLL;
            if (c53266KvO.LIZ.getBoolean("has_enable_shoot_10_min_video_tip_shown", c53266KvO.LIZIZ)) {
                return;
            }
            C119344mI c119344mI = this.LJLLI;
            if (c119344mI != null) {
                int[] iArr = new int[2];
                c119344mI.getChildAt(this.LJZ).getLocationOnScreen(iArr);
                if (iArr[0] > 0) {
                    C119344mI c119344mI2 = this.LJLLI;
                    if (c119344mI2 != null) {
                        View childAt = c119344mI2.getChildAt(this.LJZ);
                        if (childAt != null) {
                            C119344mI c119344mI3 = this.LJLLI;
                            if (c119344mI3 != null) {
                                Context context = c119344mI3.getContext();
                                o.LJIIIIZZ(context, "tabContainer.context");
                                C139825eE c139825eE = new C139825eE(context);
                                c139825eE.LIZ.LIZIZ = childAt;
                                c139825eE.LJI(WHL.TOP);
                                c139825eE.LIZ.LJIIIIZZ = 50;
                                c139825eE.LJIIJJI(R.string.bgq);
                                c139825eE.LIZ.LJII = 5000L;
                                c139825eE.LIZJ().show();
                                this.LJLILLLLZI.LJFF(this.LLIFFJFJJ);
                                this.LJLLLLLL.LIZ.storeBoolean("has_enable_shoot_10_min_video_tip_shown", true);
                                return;
                            }
                            o.LJIJI("tabContainer");
                            throw null;
                        }
                        return;
                    }
                    o.LJIJI("tabContainer");
                    throw null;
                }
                return;
            }
            o.LJIJI("tabContainer");
            throw null;
        }
    }

    @Override // X.WM7
    public final void onDestroyView() {
        H7B.LJ("SplitShootScene onDestroyView");
        super.onDestroyView();
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public final void LLJJ(int i) {
        if (((Boolean) this.LLII.getValue()).booleanValue()) {
            return;
        }
        View view = this.LJLLILLLL;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = i;
            View view2 = this.LJLLILLLL;
            if (view2 != null) {
                view2.setLayoutParams(layoutParams);
                return;
            } else {
                o.LJIJI("selectedBg");
                throw null;
            }
        }
        o.LJIJI("selectedBg");
        throw null;
    }

    public final void LLJJI(int i) {
        C81366VwY c81366VwY;
        TextView textView;
        C119344mI c119344mI = this.LJLLI;
        if (c119344mI != null) {
            int childCount = c119344mI.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                C119344mI c119344mI2 = this.LJLLI;
                if (c119344mI2 != null) {
                    View childAt = c119344mI2.getChildAt(i2);
                    if ((childAt instanceof C81366VwY) && (c81366VwY = (C81366VwY) childAt) != null && (textView = c81366VwY.getTextView()) != null) {
                        if (i2 == i) {
                            if (!this.LLFFF) {
                                textView.setShadowLayer(8.0f, 0.0f, 1.0f, textView.getContext().getResources().getColor(R.color.c_));
                            } else {
                                textView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                            }
                            textView.post(new ARunnableS33S0200000_14(textView, this, 47));
                        } else if (!this.LLFFF) {
                            textView.setShadowLayer(8.0f, 0.0f, 1.0f, textView.getContext().getResources().getColor(R.color.j7));
                        } else {
                            textView.setShadowLayer(5.0f, 0.0f, 1.0f, textView.getContext().getResources().getColor(R.color.ca));
                        }
                    }
                } else {
                    o.LJIJI("tabContainer");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("tabContainer");
        throw null;
    }

    @Override // X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        int i;
        String string;
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        H7B.LJ("SplitShootScene onCreateView");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.bmy, container, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) LLLLIILL;
        View findViewById = viewGroup.findViewById(R.id.ka_);
        o.LJIIIIZZ(findViewById, "viewGroup.findViewById(R.id.split_top_tab_host)");
        ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP = (ViewOnTouchListenerC81419VxP) findViewById;
        this.LJLL = viewOnTouchListenerC81419VxP;
        View findViewById2 = viewOnTouchListenerC81419VxP.findViewById(R.id.bs8);
        o.LJIIIIZZ(findViewById2, "tabHost.findViewById(R.id.container)");
        this.LJLLI = (C119344mI) findViewById2;
        ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP2 = this.LJLL;
        if (viewOnTouchListenerC81419VxP2 != null) {
            View findViewById3 = viewOnTouchListenerC81419VxP2.findViewById(R.id.ka8);
            o.LJIIIIZZ(findViewById3, "tabHost.findViewById(R.id.split_tab_selected_bg)");
            this.LJLLILLLL = findViewById3;
            if (((Boolean) this.LLII.getValue()).booleanValue()) {
                ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP3 = this.LJLL;
                if (viewOnTouchListenerC81419VxP3 != null) {
                    viewOnTouchListenerC81419VxP3.LLD = true;
                    Paint paint = new Paint();
                    viewOnTouchListenerC81419VxP3.LLF = paint;
                    paint.setColor(-1);
                    viewOnTouchListenerC81419VxP3.LLF.setAntiAlias(true);
                    viewOnTouchListenerC81419VxP3.LLF.setStyle(Paint.Style.FILL);
                    viewOnTouchListenerC81419VxP3.LLFF = C74275TDb.LIZ(27.0f);
                    viewOnTouchListenerC81419VxP3.LLFFF = C74275TDb.LIZ(24.0f);
                    viewOnTouchListenerC81419VxP3.LLFZ = C74275TDb.LIZ(15.0f);
                    View view = this.LJLLILLLL;
                    if (view != null) {
                        view.setVisibility(8);
                    } else {
                        o.LJIJI("selectedBg");
                        throw null;
                    }
                } else {
                    o.LJIJI("tabHost");
                    throw null;
                }
            }
            if (this.LLFFF) {
                View view2 = this.LJLLILLLL;
                if (view2 != null) {
                    view2.setBackground(C04270Et.LIZIZ(requireActivity(), R.drawable.sp));
                    View view3 = this.LJLLILLLL;
                    if (view3 != null) {
                        C1JI.LJJIIZI(view3, -1, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(24))));
                        ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP4 = this.LJLL;
                        if (viewOnTouchListenerC81419VxP4 != null) {
                            viewOnTouchListenerC81419VxP4.setSelectedTextColor(R.attr.do);
                            ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP5 = this.LJLL;
                            if (viewOnTouchListenerC81419VxP5 != null) {
                                viewOnTouchListenerC81419VxP5.setUnselectedTextColor(R.attr.dk);
                                ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP6 = this.LJLL;
                                if (viewOnTouchListenerC81419VxP6 != null) {
                                    viewOnTouchListenerC81419VxP6.setTabHostGestureListener(new C81414VxK(this));
                                } else {
                                    o.LJIJI("tabHost");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("tabHost");
                                throw null;
                            }
                        } else {
                            o.LJIJI("tabHost");
                            throw null;
                        }
                    } else {
                        o.LJIJI("selectedBg");
                        throw null;
                    }
                } else {
                    o.LJIJI("selectedBg");
                    throw null;
                }
            }
            Activity requireActivity = requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            int i2 = this.LJZ;
            if (i2 >= 0) {
                String string2 = requireActivity.getString(R.string.s5v);
                o.LJIIIIZZ(string2, "context.getString(this)");
                LLJILJIL(this, i2, string2, C44269HYz.LIZLLL);
            }
            int i3 = this.LJZI;
            if (i3 >= 0) {
                String string3 = requireActivity.getString(R.string.s7s);
                o.LJIIIIZZ(string3, "context.getString(this)");
                LLJILJIL(this, i3, string3, C44269HYz.LIZJ);
            }
            int i4 = this.LJZL;
            String string4 = requireActivity.getString(R.string.pvl);
            o.LJIIIIZZ(string4, "context.getString(this)");
            String str = C44269HYz.LIZIZ;
            LLJILJIL(this, i4, string4, str);
            int i5 = this.LL;
            String string5 = requireActivity.getString(R.string.pvk);
            o.LJIIIIZZ(string5, "context.getString(this)");
            LLJILJIL(this, i5, string5, C44269HYz.LIZ);
            int i6 = this.LLD;
            if (i6 >= 0) {
                String string6 = requireActivity.getString(R.string.rrl);
                o.LJIIIIZZ(string6, "context.getString(this)");
                LLJILJIL(this, i6, string6, "RecordCombinePhoto");
            }
            int i7 = this.LLF;
            if (i7 >= 0) {
                Activity requireActivity2 = requireActivity();
                o.LJIIIIZZ(requireActivity2, "requireActivity()");
                if (GX0.LIZ() && C41669GWz.LIZ()) {
                    C149225tO.LIZ.getClass();
                    if (C149225tO.LIZ()) {
                        string = requireActivity2.getString(R.string.rrk);
                        o.LJIIIIZZ(string, "context.getString(this)");
                    } else {
                        string = requireActivity2.getString(R.string.rrl);
                        o.LJIIIIZZ(string, "context.getString(this)");
                    }
                } else {
                    string = requireActivity2.getString(I38.RECORD_NOW.getNameResId());
                    o.LJIIIIZZ(string, "context.getString(this)");
                }
                LLJILJIL(this, i7, string, I38.RECORD_NOW.getTag());
            }
            int i8 = this.LLFF;
            if (i8 >= 0) {
                I38 i38 = I38.RECORD_LIGHTENING_TEXT;
                String string7 = requireActivity.getString(i38.getNameResId());
                o.LJIIIIZZ(string7, "context.getString(this)");
                LLJILJIL(this, i8, string7, i38.getTag());
            }
            ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP7 = this.LJLL;
            if (viewOnTouchListenerC81419VxP7 != null) {
                viewOnTouchListenerC81419VxP7.setOnIndexChangedListener(new C81416VxM(this));
                String str2 = this.LJLJL;
                if (o.LJ(str2, C44269HYz.LIZLLL)) {
                    i = this.LJZ;
                    if (i < 0) {
                        i = this.LL;
                    }
                } else if (o.LJ(str2, C44269HYz.LIZJ)) {
                    i = this.LJZI;
                    if (i < 0) {
                        i = this.LL;
                    }
                } else if (o.LJ(str2, str)) {
                    i = this.LJZL;
                } else if (o.LJ(str2, I38.RECORD_NOW.getTag())) {
                    i = this.LLF;
                } else if (o.LJ(str2, "RecordCombinePhoto")) {
                    i = this.LLD;
                } else {
                    i = this.LL;
                }
                ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP8 = this.LJLL;
                if (viewOnTouchListenerC81419VxP8 != null) {
                    if (i < 0) {
                        i = this.LL;
                    }
                    viewOnTouchListenerC81419VxP8.LJIIIIZZ(i, true, true);
                    this.LJLJI.LIZIZ(this, new AObjectS89S0100000_14(this, 351));
                    C0IB<Boolean> c0ib = this.LJLJJI;
                    if (c0ib != null) {
                        c0ib.LIZIZ(this, new AObjectS89S0100000_14(this, 352));
                    }
                    C0IB<C76800UCe> c0ib2 = this.LJLJJL;
                    if (c0ib2 != null) {
                        c0ib2.LIZIZ(this, new AObjectS89S0100000_14(this, 353));
                    }
                    LiveEvent<C35512Dwi> liveEvent = this.LJLJJLL;
                    if (liveEvent != null) {
                        liveEvent.LIZLLL(this, new AObjectS89S0100000_14(this, 354));
                    }
                    this.LJLJLJ.LIZIZ(this, new AObjectS89S0100000_14(this, 355));
                    if (this.LJZ > -1) {
                        C53266KvO c53266KvO = this.LJLLLLLL;
                        if (!c53266KvO.LIZ.getBoolean("has_enable_shoot_10_min_video_tip_shown", c53266KvO.LIZIZ)) {
                            this.LJLILLLLZI.LIZLLL(this, this.LLIFFJFJJ);
                            LLJJIII();
                        }
                    }
                    return viewGroup;
                }
                o.LJIJI("tabHost");
                throw null;
            }
            o.LJIJI("tabHost");
            throw null;
        }
        o.LJIJI("tabHost");
        throw null;
    }

    @Override // X.WMH, X.WM7
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }

    public static void LLJILJIL(C81433Vxd c81433Vxd, int i, String str, String str2) {
        c81433Vxd.getClass();
        C119344mI c119344mI = c81433Vxd.LJLLI;
        if (c119344mI != null) {
            C81366VwY c81366VwY = new C81366VwY(c119344mI.getContext(), 0);
            if (L1D.LIZIZ() || L1D.LIZ()) {
                c81366VwY.LJJLL(9, 8);
            } else {
                c81366VwY.LJJLL(6, 6);
            }
            c81366VwY.setText(str);
            c81366VwY.setEnabled(true);
            c81366VwY.setTag(str2);
            c81366VwY.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
            if (c81433Vxd.LLFFF) {
                c81366VwY.LJJLJLI();
            }
            C119344mI c119344mI2 = c81433Vxd.LJLLI;
            if (c119344mI2 != null) {
                c119344mI2.addView(c81366VwY, i);
                c81433Vxd.LJLLL.add(str2);
                return;
            } else {
                o.LJIJI("tabContainer");
                throw null;
            }
        }
        o.LJIJI("tabContainer");
        throw null;
    }

    public C81433Vxd(C82622Wbi diContainer, C29901Fi tabIndexChangeEvent, C40871j1 splitTabVisibility, C0IB c0ib, C40871j1 c40871j1, C29901Fi c29901Fi, String defaultSelectTabTag, boolean z, boolean z2, boolean z3, boolean z4, C46611sH translationY, Object parentTag) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(tabIndexChangeEvent, "tabIndexChangeEvent");
        o.LJIIIZ(splitTabVisibility, "splitTabVisibility");
        o.LJIIIZ(defaultSelectTabTag, "defaultSelectTabTag");
        o.LJIIIZ(translationY, "translationY");
        o.LJIIIZ(parentTag, "parentTag");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = tabIndexChangeEvent;
        this.LJLJI = splitTabVisibility;
        this.LJLJJI = c0ib;
        this.LJLJJL = c40871j1;
        this.LJLJJLL = c29901Fi;
        this.LJLJL = defaultSelectTabTag;
        this.LJLJLJ = translationY;
        this.LJLJLLL = parentTag;
        if (C44363Hb5.LIZ()) {
            i = 25;
        } else {
            i = 40;
        }
        this.LJLLJ = C7MY.LIZIZ(i);
        this.LJLLL = new LinkedHashSet();
        this.LJLLLL = new C81435Vxf();
        this.LJLLLLLL = new C53266KvO();
        this.LJLZ = new LinkedHashMap();
        int i6 = -1;
        if (z2) {
            i2 = 0;
        } else {
            i2 = -1;
        }
        this.LJZ = i2;
        if (z) {
            i3 = i2 + 1;
        } else {
            i3 = -1;
        }
        this.LJZI = i3;
        int max = Math.max(i2, i3);
        this.LJZL = max + 1;
        int i7 = max + 2;
        this.LL = i7;
        if (z3) {
            i4 = max + 3;
        } else {
            i4 = -1;
        }
        this.LLD = i4;
        if (C44253HYj.LIZ((ShortVideoContext) diContainer.LJ(ShortVideoContext.class, null))) {
            if (z3) {
                i5 = i4 + 1;
            } else {
                i5 = max + 3;
            }
        } else {
            i5 = -1;
        }
        this.LLF = i5;
        if (((Boolean) IIT.LIZ.getValue()).booleanValue() && z4) {
            i6 = Math.max(i7, Math.max(i4, i5)) + 1;
        }
        this.LLFF = i6;
        this.LLFFF = C52286Kfa.LIZ();
        this.LLFII = UCI.LJII(diContainer, I8W.class, null);
        this.LLFZ = new SafeHandler(this);
        this.LLIFFJFJJ = new AObjectS89S0100000_14(this, 357);
        this.LLII = C221108m2.LIZIZ(DKJ.LJLIL);
    }
}
