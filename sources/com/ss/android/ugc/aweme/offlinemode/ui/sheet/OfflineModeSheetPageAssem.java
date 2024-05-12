package com.ss.android.ugc.aweme.offlinemode.ui.sheet;

import X.AG6;
import X.ActivityC45651qj;
import X.C110614Vt;
import X.C162476Zf;
import X.C16880lQ;
import X.C17N;
import X.C184077Kh;
import X.C212428Vi;
import X.C214298b3;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C221138m5;
import X.C237149Sk;
import X.C25851ACp;
import X.C26222AQw;
import X.C26338AVi;
import X.C32151Nz;
import X.C47261Igj;
import X.C5GC;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8W0;
import X.C8YN;
import X.C9BD;
import X.C9Q1;
import X.C9Q3;
import X.C9SA;
import X.C9SB;
import X.C9SC;
import X.C9SE;
import X.C9SG;
import X.C9SN;
import X.EnumC237169Sm;
import X.InterfaceC65784Pro;
import X.KR8;
import X.O6R;
import X.Q8U;
import X.SY4;
import X.SYL;
import X.TBT;
import X.ViewOnClickListenerC13880ga;
import X.X1D;
import Y.ACListenerS24S0100000_4;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeListVM;
import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeManagerVM;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;
import q03.IDaS484S0100000_4;

/* loaded from: classes5.dex */
public final class OfflineModeSheetPageAssem extends UIContentAssem {
    public static final C26222AQw LJLJLJ = new C26222AQw("SheetPageAssem");
    public static final List<Integer> LJLJLLL = C47261Igj.LJJIJIIJI(50, 100, 150, 200);
    public final C214378bB LJLIL;
    public final C214298b3 LJLILLLLZI;
    public final C221138m5 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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

    @Override // X.C8W0
    public final void onAssemPostCreate() {
        String str;
        super.onAssemPostCreate();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            LIZ.setTheme(R.style.kp);
        }
        getContainerView().findViewById(R.id.h_o);
        C26222AQw c26222AQw = LJLJLJ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("updatePowerList with sheetStyle ");
        LIZ2.append(x3());
        LIZ2.append(' ');
        C9Q1 x3 = x3();
        if (x3 != null && x3.getWithBack()) {
            str = "withBack";
        } else {
            str = "";
        }
        LIZ2.append(str);
        c26222AQw.LIZ(null, X1D.LIZIZ(LIZ2));
        C9Q1 x32 = x3();
        if (x32 != null) {
            int i = C9SB.LIZIZ[x32.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    View _$_findCachedViewById = _$_findCachedViewById(R.id.h_n);
                    _$_findCachedViewById.setVisibility(0);
                    F3(true, _$_findCachedViewById, true);
                    C16880lQ.LJJIJLIJ((SmartImageView) _$_findCachedViewById(R.id.h_h), new ACListenerS24S0100000_4(this, 221));
                    View offline_mode_download_error_icon = _$_findCachedViewById(R.id.h_6);
                    o.LJIIIIZZ(offline_mode_download_error_icon, "offline_mode_download_error_icon");
                    C16880lQ.LJIIJ(new IDaS484S0100000_4(this, 15), offline_mode_download_error_icon);
                    View _$_findCachedViewById2 = _$_findCachedViewById(R.id.h_q);
                    _$_findCachedViewById2.setVisibility(0);
                    F3(true, _$_findCachedViewById2, false);
                    _$_findCachedViewById(R.id.h_p).setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS24S0100000_4(this, 222)));
                    RelativeLayout setDownloadVideoStateCell$lambda$3 = (RelativeLayout) _$_findCachedViewById(R.id.h_a);
                    o.LJIIIIZZ(setDownloadVideoStateCell$lambda$3, "setDownloadVideoStateCell$lambda$3");
                    F3(false, setDownloadVideoStateCell$lambda$3, false);
                    setDownloadVideoStateCell$lambda$3.setVisibility(0);
                    C16880lQ.LJIJ(setDownloadVideoStateCell$lambda$3, new ACListenerS24S0100000_4(this, 223));
                    View _$_findCachedViewById3 = _$_findCachedViewById(R.id.h_8);
                    _$_findCachedViewById3.setVisibility(0);
                    F3(false, _$_findCachedViewById3, true);
                    C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.h_7), new ACListenerS24S0100000_4(this, 224));
                    withState(v3(), new AqS170S0100000_4(this, 919));
                    C8YN.LJII(this, v3(), new TBT() { // from class: X.9SF
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return Double.valueOf(((C9S3) obj).LJLIL);
                        }
                    }, null, new AqS186S0100000_4(this, 254), 6);
                    C8YN.LJII(this, v3(), new TBT() { // from class: X.9SH
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return Boolean.valueOf(((C9S3) obj).LJLJJI);
                        }
                    }, null, new AqS185S0100000_3(this, 161), 6);
                    C8YN.LJII(this, v3(), new TBT() { // from class: X.9SI
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return Integer.valueOf(((C9S3) obj).LJLILLLLZI);
                        }
                    }, null, new AqS186S0100000_4(this, 255), 6);
                    C8YN.LJII(this, (AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.9TU
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            C240039bT c240039bT = (C240039bT) obj;
                            c240039bT.getClass();
                            return C208708Ha.LIZ(c240039bT);
                        }
                    }, null, new AqS185S0100000_3(this, 162), 6);
                    C8YN.LJII(this, v3(), new TBT() { // from class: X.9Q8
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return Integer.valueOf(((C9S3) obj).LJLJJL);
                        }
                    }, null, new AqS186S0100000_4(this, 252), 6);
                    C8YN.LJII(this, v3(), new TBT() { // from class: X.9S9
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C9S3) obj).LJLJI;
                        }
                    }, null, new AqS186S0100000_4(this, 253), 6);
                }
            } else {
                SYL syl = (SYL) getContainerView().findViewById(R.id.h_o);
                getContext();
                syl.setLayoutManager(new LinearLayoutManager() { // from class: com.ss.android.ugc.aweme.offlinemode.ui.sheet.OfflineModeSheetPageAssem$updatePowerList$1
                    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
                    public final boolean LJIL() {
                        return false;
                    }
                });
                C25851ACp c25851ACp = new C25851ACp(syl);
                c25851ACp.LIZ.LLLF.LJZL(DownloadButtonCell.class);
                Iterator it = ((List) this.LJLJJI.getValue()).iterator();
                while (it.hasNext()) {
                    c25851ACp.LIZ((AG6) it.next());
                }
                C9Q1 x33 = x3();
                if (x33 != null && !x33.getWithBack()) {
                    c25851ACp.LIZ((AG6) this.LJLJJL.getValue());
                } else {
                    c25851ACp.LIZ((AG6) this.LJLJJLL.getValue());
                }
                c25851ACp.LIZLLL();
            }
        }
        if (x3() == C9Q1.OFFLINE_MODE_PANEL) {
            v3().qv0(null);
        }
        LJLJLJ.LIZ(x3(), "[onViewCreated]");
    }

    public OfflineModeSheetPageAssem() {
        InterfaceC65784Pro LJIILJJIL;
        C9SE c9se = C9SE.LJLIL;
        C65776Prg LIZ = C65352Pkq.LIZ(OfflineModeListVM.class);
        C9SG c9sg = C9SG.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS154S0100000_4((C8W0) this, 519);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLIL = new C214378bB(LIZ, c9se, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c9sg, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ2 = C65352Pkq.LIZ(OfflineModeManagerVM.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ2, c9bd, new AqS154S0100000_4(LIZ2, 518), C9Q3.INSTANCE, null);
        this.LJLJI = KR8.LJIIJJI(new AqS154S0100000_4(this, 517));
        C221108m2.LIZIZ(new AqS154S0100000_4(this, 514));
        this.LJLJJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 516));
        this.LJLJJL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 515));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 513));
    }

    public final OfflineModeManagerVM v3() {
        return (OfflineModeManagerVM) this.LJLILLLLZI.getValue();
    }

    public final C9Q1 x3() {
        return (C9Q1) this.LJLJI.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        LJLJLJ.LIZ(this, "[onCreate]");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        LJLJLJ.LIZ(this, "[onDestroy]");
    }

    @Override // X.C8W0
    public final void onPause() {
        super.onPause();
        LJLJLJ.LIZ(this, "[onPause]");
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        LJLJLJ.LIZ(this, "[onResume]");
    }

    public final void C3(double d) {
        String str;
        int i;
        String string;
        TextView textView = (TextView) _$_findCachedViewById(R.id.h_9);
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        boolean z = true;
        if (LIZ != null && (string = LIZ.getString(R.string.j8v)) != null) {
            str = Q8U.LIZIZ(new Object[]{Double.valueOf(d)}, 1, ujb.o.LJJJJZ(string, "%d", "%.1f", false), "format(this, *args)");
        } else {
            str = "";
        }
        textView.setText(str);
        if (d <= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            z = false;
        }
        TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.h_7);
        if (z) {
            i = R.attr.go;
        } else {
            i = R.attr.gp;
        }
        tuxTextView.setTextColorRes(i);
    }

    public final void E3(C9SN state) {
        C9SA c9sa;
        String str;
        int i;
        C9SA.Companion.getClass();
        o.LJIIIZ(state, "state");
        switch (C9SC.LIZ[state.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                c9sa = C9SA.PAUSE;
                break;
            case 6:
                c9sa = C9SA.RESUME;
                break;
            case 7:
                c9sa = C9SA.DOWNLOADED;
                break;
            default:
                throw new C162476Zf();
        }
        ((TuxIconView) _$_findCachedViewById(R.id.h_k)).setTuxIcon(c9sa.getIcon());
        TextView textView = (TextView) _$_findCachedViewById(R.id.h_l);
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            str = LIZ.getString(c9sa.getTitle());
        } else {
            str = null;
        }
        textView.setText(str);
        int i2 = C9SB.LIZ[state.ordinal()];
        boolean z = true;
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            C17N.LJJIIJZLJL(_$_findCachedViewById(R.id.h_6));
        } else {
            C17N.LJJLIIIJJI(_$_findCachedViewById(R.id.h_6));
        }
        if (state == C9SN.DOWNLOADING) {
            z = false;
        }
        TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.h_b);
        if (z) {
            i = R.attr.gu;
        } else {
            i = R.attr.gp;
        }
        tuxTextView.setTextColorRes(i);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
    }

    public final void A3(int i, int i2) {
        String string;
        String LIZIZ;
        String string2;
        float f = (i * 100.0f) / i2;
        TextView textView = (TextView) _$_findCachedViewById(R.id.h_f);
        if (i >= i2) {
            ActivityC45651qj LIZ = C212428Vi.LIZ(this);
            if (LIZ != null && (string2 = LIZ.getString(R.string.j8x)) != null) {
                LIZIZ = Q8U.LIZIZ(new Object[]{Integer.valueOf(i2)}, 1, string2, "format(this, *args)");
            }
            LIZIZ = null;
        } else {
            ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
            if (LIZ2 != null && (string = LIZ2.getString(R.string.j8l)) != null) {
                LIZIZ = Q8U.LIZIZ(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, 2, string, "format(this, *args)");
            }
            LIZIZ = null;
        }
        textView.setText(LIZIZ);
        ((C5GC) _$_findCachedViewById(R.id.h_e)).setProgress(f);
        TextView textView2 = (TextView) _$_findCachedViewById(R.id.h_b);
        C237149Sk c237149Sk = EnumC237169Sm.Companion;
        ActivityC45651qj LIZ3 = C212428Vi.LIZ(this);
        c237149Sk.getClass();
        textView2.setText(C237149Sk.LIZ(LIZ3, i2));
    }

    public static void F3(boolean z, View view, boolean z2) {
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(8));
        int LJJIIZ2 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(8));
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.cl);
        if (z) {
            float f = LJJIIZ;
            c110614Vt.LJIIIIZZ = Float.valueOf(f);
            c110614Vt.LJIIIZ = Float.valueOf(f);
        }
        if (z2) {
            float f2 = LJJIIZ;
            c110614Vt.LJIIJ = Float.valueOf(f2);
            c110614Vt.LJIIJJI = Float.valueOf(f2);
        }
        Context context = view.getContext();
        if (context != null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c110614Vt.LIZ(context)});
            layerDrawable.setLayerInset(0, LJJIIZ2, 0, LJJIIZ2, 0);
            view.setBackground(layerDrawable);
        }
        C26338AVi.LJIIIZ(view, Integer.valueOf(LJJIIZ2), null, Integer.valueOf(LJJIIZ2), null, 26);
    }
}
