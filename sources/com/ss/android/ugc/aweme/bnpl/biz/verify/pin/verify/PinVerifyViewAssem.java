package com.ss.android.ugc.aweme.bnpl.biz.verify.pin.verify;

import X.ActivityC45651qj;
import X.C018905p;
import X.C16880lQ;
import X.C184077Kh;
import X.C212428Vi;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C32151Nz;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8W0;
import X.C8YN;
import X.C91813a0f;
import X.C92058a4c;
import X.C92295a8R;
import X.C92320a8q;
import X.C92627aDn;
import X.C92630aDq;
import X.C9KF;
import X.InterfaceC65784Pro;
import X.O6R;
import X.TBT;
import Y.IDCListenerS138S0100000_31;
import Y.IDRunnableS89S0100000_31;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.BasePinUIAssem;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.IDqS422S0100000_31;
import kotlin.jvm.internal.IDqS441S0100000_31;
import kotlin.jvm.internal.IDqS445S0100000_31;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class PinVerifyViewAssem extends BasePinUIAssem {
    public final C214378bB LJLILLLLZI;
    public final C55749LuL LJLJI;
    public long LJLJJI;
    public final Rect LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.bnpl.biz.verify.pin.BasePinUIAssem
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLJ;
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

    public PinVerifyViewAssem() {
        InterfaceC65784Pro LJIILJJIL;
        C65776Prg LIZ = C65352Pkq.LIZ(PinVerifyViewModel.class);
        C92627aDn c92627aDn = C92627aDn.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new IDqS422S0100000_31((C8W0) this, 63);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLILLLLZI = new C214378bB(LIZ, null, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c92627aDn, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
        this.LJLJI = new C55749LuL(C47704Ins.LIZJ(this, C92295a8R.class, "KEY_VERIFY_DATA"), checkSupervisorPrepared());
        this.LJLJJL = new Rect();
    }

    public final C92295a8R A3() {
        return (C92295a8R) this.LJLJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.bnpl.biz.verify.pin.BasePinUIAssem, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        Window window;
        super.onCreate();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null && (window = LIZ.getWindow()) != null) {
            window.setFlags(FileUtils.BUFFER_SIZE, FileUtils.BUFFER_SIZE);
        }
    }

    @Override // com.ss.android.ugc.aweme.bnpl.biz.verify.pin.BasePinUIAssem, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        Window window;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null && (window = LIZ.getWindow()) != null) {
            window.clearFlags(FileUtils.BUFFER_SIZE);
        }
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.bnpl.biz.verify.pin.BasePinUIAssem, android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Window window;
        View decorView;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null && (window = LIZ.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.getWindowVisibleDisplayFrame(this.LJLJJL);
        }
        int height = this.LJLJJL.height();
        C018905p c018905p = new C018905p(-2, -2);
        c018905p.bottomToBottom = 0;
        c018905p.leftToLeft = 0;
        c018905p.rightToRight = 0;
        c018905p.setMargins(0, 0, 0, this.LJLJJLL - height);
        _$_findCachedViewById(R.id.fu).setLayoutParams(c018905p);
        if (height - this.LJLIL < 0) {
            this.LJLIL = height;
            C018905p c018905p2 = new C018905p(-2, -2);
            c018905p2.topToBottom = R.id.ge;
            c018905p2.leftToLeft = 0;
            c018905p2.rightToRight = 0;
            int[] iArr = new int[2];
            _$_findCachedViewById(R.id.ge).getLocationOnScreen(iArr);
            c018905p2.setMargins(0, (((((height + this.LJLJL) - _$_findCachedViewById(R.id.fu).getHeight()) - _$_findCachedViewById(R.id.ge).getHeight()) - iArr[1]) - _$_findCachedViewById(R.id.gb).getHeight()) / 2, 0, 0);
            _$_findCachedViewById(R.id.gb).setLayoutParams(c018905p2);
        }
    }

    @Override // com.ss.android.ugc.aweme.bnpl.biz.verify.pin.BasePinUIAssem
    public final void v3() {
        int i;
        Window window;
        View decorView;
        ViewTreeObserver viewTreeObserver;
        Window window2;
        View decorView2;
        Window window3;
        View decorView3;
        Window window4;
        View decorView4;
        int i2 = C91813a0f.LIZ[A3().LJLILLLLZI.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
            ActivityC45651qj LIZ = C212428Vi.LIZ(this);
            int i3 = 0;
            if (LIZ != null && (window4 = LIZ.getWindow()) != null && (decorView4 = window4.getDecorView()) != null) {
                i = decorView4.getHeight();
            } else {
                i = 0;
            }
            this.LJLIL = i;
            ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
            if (LIZ2 != null && (window3 = LIZ2.getWindow()) != null && (decorView3 = window3.getDecorView()) != null) {
                decorView3.getWindowVisibleDisplayFrame(this.LJLJJL);
            }
            this.LJLJJLL = this.LJLJJL.height();
            ActivityC45651qj LIZ3 = C212428Vi.LIZ(this);
            if (LIZ3 != null && (window2 = LIZ3.getWindow()) != null && (decorView2 = window2.getDecorView()) != null) {
                i3 = decorView2.getHeight();
            }
            this.LJLJL = i3 - this.LJLJJLL;
            ActivityC45651qj LIZ4 = C212428Vi.LIZ(this);
            if (LIZ4 == null || (window = LIZ4.getWindow()) == null || (decorView = window.getDecorView()) == null || (viewTreeObserver = decorView.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.addOnGlobalLayoutListener(this);
            return;
        }
        super.v3();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C8YN.LJII(this, (AssemViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.aNV
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C92321a8r) obj).LJLIL;
            }
        }, null, new IDqS445S0100000_31(this, 26), 6);
        C8YN.LJIIJ(this, (AssemViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.aNW
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C92321a8r) obj).LJLILLLLZI;
            }
        }, new TBT() { // from class: X.aNX
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C92321a8r) obj).LJLJI;
            }
        }, null, new IDqS441S0100000_31(this, 12), 12);
        int i = C91813a0f.LIZ[A3().LJLILLLLZI.ordinal()];
        if (i != 1) {
            if (i == 2) {
                _$_findCachedViewById(R.id.ge).setVisibility(0);
                _$_findCachedViewById(R.id.gb).setVisibility(0);
                _$_findCachedViewById(R.id.fu).setVisibility(4);
                ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.ge).getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins(0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), 0, 0);
                _$_findCachedViewById(R.id.ge).setLayoutParams(marginLayoutParams);
                C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.ge);
                C235119Kp c235119Kp = new C235119Kp();
                C9KF c9kf = new C9KF();
                Context context = getContext();
                if (context != null) {
                    str = context.getString(R.string.jrd);
                } else {
                    str = null;
                }
                c9kf.LIZJ = String.valueOf(str);
                c235119Kp.LIZJ = c9kf;
                C234529Ii c234529Ii = new C234529Ii();
                c234529Ii.LIZJ();
                c234529Ii.LIZJ = R.raw.icon_x_mark_small;
                c234529Ii.LIZIZ(new IDqS422S0100000_31(this, LiveTryModeCountDownThresholdSetting.DEFAULT));
                c235119Kp.LIZIZ(c234529Ii);
                c252709vu.setNavActions(c235119Kp);
                C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.fu), new IDCListenerS138S0100000_31(this, 19));
                ViewGroup.LayoutParams layoutParams2 = _$_findCachedViewById(R.id.gc).getLayoutParams();
                o.LJII(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                C018905p c018905p = (C018905p) layoutParams2;
                c018905p.bottomToBottom = R.id.fu;
                _$_findCachedViewById(R.id.gc).setLayoutParams(c018905p);
            }
        } else {
            ((TuxTextView) _$_findCachedViewById(R.id.gj)).LJJJ(32.0f);
            _$_findCachedViewById(R.id.ge).setVisibility(0);
            _$_findCachedViewById(R.id.gj).setVisibility(0);
            _$_findCachedViewById(R.id.gb).setVisibility(0);
            _$_findCachedViewById(R.id.fu).setVisibility(4);
            C252709vu c252709vu2 = (C252709vu) _$_findCachedViewById(R.id.ge);
            C235119Kp c235119Kp2 = new C235119Kp();
            C234529Ii c234529Ii2 = new C234529Ii();
            c234529Ii2.LIZJ();
            c234529Ii2.LIZJ = R.raw.icon_chevron_left_offset_ltr;
            c234529Ii2.LIZIZ(new IDqS422S0100000_31(this, 119));
            c235119Kp2.LIZLLL(c234529Ii2);
            c252709vu2.setNavActions(c235119Kp2);
            ((TextView) _$_findCachedViewById(R.id.gj)).setText(R.string.jrd);
            C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.fu), new IDCListenerS138S0100000_31(this, 18));
        }
        ((C92630aDq) _$_findCachedViewById(R.id.gb)).setInputCallback(new C92320a8q(this));
        ((TextView) _$_findCachedViewById(R.id.fu)).setText(R.string.jrc);
        _$_findCachedViewById(R.id.gb).post(new IDRunnableS89S0100000_31(this, 8));
        this.LJLJJI = System.currentTimeMillis();
        C92058a4c.LJFF(0L, "bnpl_pin_use", A3().LJLJI);
    }
}
