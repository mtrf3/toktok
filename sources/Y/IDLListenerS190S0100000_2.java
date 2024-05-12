package Y;

import X.AnonymousClass516;
import X.AnonymousClass668;
import X.C1559069y;
import X.C1559169z;
import X.C156086Aq;
import X.C157226Fa;
import X.C161416Vd;
import X.C170626mo;
import X.C173626re;
import X.C58U;
import X.C66Y;
import X.C6A2;
import X.C74275TDb;
import X.C79057V0z;
import X.C81184Vtc;
import X.H7R;
import X.InterfaceC153045zY;
import X.InterfaceC156116At;
import X.InterfaceC65784Pro;
import X.ViewTreeObserverOnGlobalLayoutListenerC1553167r;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.ss.android.ugc.aweme.shortvideo.cut.gif.Video2GifCutFragment;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.SpeedNormalFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class IDLListenerS190S0100000_2 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ void onGlobalLayout$1(IDLListenerS190S0100000_2 iDLListenerS190S0100000_2) {
        ((InterfaceC65784Pro) iDLListenerS190S0100000_2.l0).invoke();
    }

    public static final /* synthetic */ void onGlobalLayout$12(IDLListenerS190S0100000_2 iDLListenerS190S0100000_2) {
        ((InterfaceC65784Pro) iDLListenerS190S0100000_2.l0).invoke();
    }

    public static final /* synthetic */ void onGlobalLayout$2(IDLListenerS190S0100000_2 iDLListenerS190S0100000_2) {
        ((InterfaceC65784Pro) iDLListenerS190S0100000_2.l0).invoke();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                return;
            case 1:
                onGlobalLayout$1(this);
                return;
            case 2:
                onGlobalLayout$2(this);
                return;
            case 3:
                onGlobalLayout$3(this);
                return;
            case 4:
                onGlobalLayout$4(this);
                return;
            case 5:
                onGlobalLayout$5(this);
                return;
            case 6:
                onGlobalLayout$6(this);
                return;
            case 7:
                onGlobalLayout$7(this);
                return;
            case 8:
                onGlobalLayout$8(this);
                return;
            case 9:
                onGlobalLayout$9(this);
                return;
            case 10:
                onGlobalLayout$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onGlobalLayout$11(this);
                return;
            case 12:
                onGlobalLayout$12(this);
                return;
            default:
                return;
        }
    }

    public static final void onGlobalLayout$0(IDLListenerS190S0100000_2 iDLListenerS190S0100000_2) {
        if (C74275TDb.LJI((C173626re) iDLListenerS190S0100000_2.l0)) {
            C173626re c173626re = (C173626re) iDLListenerS190S0100000_2.l0;
            float f = c173626re.LJLJJLL;
            float f2 = c173626re.LJLJL;
            c173626re.LJLJJLL = f2;
            c173626re.LJLJL = f;
            c173626re.setPadding((int) f2, (int) c173626re.LJLJLJ, (int) f, (int) c173626re.LJLJLLL);
        }
        ((C173626re) iDLListenerS190S0100000_2.l0).getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS190S0100000_2);
    }

    public static final void onGlobalLayout$10(IDLListenerS190S0100000_2 iDLListenerS190S0100000_2) {
        ((C156086Aq) iDLListenerS190S0100000_2.l0).getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS190S0100000_2);
        ((C156086Aq) iDLListenerS190S0100000_2.l0).setVisibility(0);
        InterfaceC156116At interfaceC156116At = ((C156086Aq) iDLListenerS190S0100000_2.l0).LJLJL;
        if (interfaceC156116At != null) {
            interfaceC156116At.LIZ();
        }
    }

    public static final void onGlobalLayout$11(IDLListenerS190S0100000_2 iDLListenerS190S0100000_2) {
        C161416Vd c161416Vd = (C161416Vd) iDLListenerS190S0100000_2.l0;
        InterfaceC153045zY interfaceC153045zY = c161416Vd.LJLZ;
        if (interfaceC153045zY != null) {
            c161416Vd.LLIIII = (C81184Vtc.LJ(c161416Vd.LJLIL) - interfaceC153045zY.LLILZ().width) >> 1;
            if (AnonymousClass668.LIZ()) {
                C157226Fa.LIZ.LIZ();
                return;
            }
            C81184Vtc.LIZIZ(c161416Vd.LJLIL);
            AnonymousClass668.LIZIZ().getBottomMargin();
            AnonymousClass668.LIZIZ().LIZ();
        }
    }

    public static final void onGlobalLayout$3(IDLListenerS190S0100000_2 iDLListenerS190S0100000_2) {
        ViewTreeObserver viewTreeObserver;
        View _$_findCachedViewById = ((DTResourcePanelFragment) iDLListenerS190S0100000_2.l0)._$_findCachedViewById(R.id.c5z);
        if (_$_findCachedViewById != null) {
            DTResourcePanelFragment dTResourcePanelFragment = (DTResourcePanelFragment) iDLListenerS190S0100000_2.l0;
            dTResourcePanelFragment.LJLL = _$_findCachedViewById.getHeight();
            C79057V0z.LJJJJL(dTResourcePanelFragment.Jl(), "panel_bounce_event", new AnonymousClass516(dTResourcePanelFragment.Kl(), dTResourcePanelFragment.LJLL, true));
            dTResourcePanelFragment.Vl();
            o.LJIIIZ(dTResourcePanelFragment.Kl(), "<set-?>");
            _$_findCachedViewById.setTranslationY(dTResourcePanelFragment.LJLL);
            _$_findCachedViewById.animate().translationYBy(-dTResourcePanelFragment.LJLL).setDuration(350L).setInterpolator(new C58U(4.0f)).setListener(new IDAListenerS72S0000000_2(2));
        }
        View _$_findCachedViewById2 = ((DTResourcePanelFragment) iDLListenerS190S0100000_2.l0)._$_findCachedViewById(R.id.c5z);
        if (_$_findCachedViewById2 != null && (viewTreeObserver = _$_findCachedViewById2.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(iDLListenerS190S0100000_2);
        }
    }

    public static final void onGlobalLayout$4(IDLListenerS190S0100000_2 iDLListenerS190S0100000_2) {
        Video2GifCutFragment video2GifCutFragment = (Video2GifCutFragment) iDLListenerS190S0100000_2.l0;
        if (video2GifCutFragment.LJLL == null) {
            return;
        }
        video2GifCutFragment.LJLJI.getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS190S0100000_2);
        int height = ((Video2GifCutFragment) iDLListenerS190S0100000_2.l0).LJLJI.getHeight();
        int width = ((Video2GifCutFragment) iDLListenerS190S0100000_2.l0).LJLJI.getWidth();
        int[] LIZLLL = C170626mo.LIZLLL(((Video2GifCutFragment) iDLListenerS190S0100000_2.l0).LJLL.videoPath);
        if (LIZLLL[0] == 0) {
            int i = LIZLLL[2];
            int i2 = LIZLLL[3];
            VideoShare2GifEditContext videoShare2GifEditContext = ((Video2GifCutFragment) iDLListenerS190S0100000_2.l0).LJLL;
            videoShare2GifEditContext.originWidth = i;
            videoShare2GifEditContext.originHeight = i2;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (i < i2) {
                int i3 = (i * height) / i2;
                layoutParams.width = i3;
                layoutParams.height = height;
                layoutParams.leftMargin = (width - i3) / 2;
                layoutParams.topMargin = 0;
            } else {
                layoutParams.width = width;
                int i4 = (i2 * width) / i;
                layoutParams.height = i4;
                int i5 = (height - i4) / 2;
                layoutParams.topMargin = i5;
                if (i5 < 0) {
                    i5 = 0;
                }
                layoutParams.topMargin = i5;
                layoutParams.leftMargin = 0;
            }
            layoutParams.setMarginStart(layoutParams.leftMargin);
            Video2GifCutFragment video2GifCutFragment2 = (Video2GifCutFragment) iDLListenerS190S0100000_2.l0;
            VideoShare2GifEditContext videoShare2GifEditContext2 = video2GifCutFragment2.LJLL;
            videoShare2GifEditContext2.targetWidth = layoutParams.width;
            videoShare2GifEditContext2.targetHeight = layoutParams.height;
            video2GifCutFragment2.LJLJI.setLayoutParams(layoutParams);
        }
    }

    public static final void onGlobalLayout$5(IDLListenerS190S0100000_2 iDLListenerS190S0100000_2) {
        ((ViewTreeObserverOnGlobalLayoutListenerC1553167r) iDLListenerS190S0100000_2.l0).onGlobalLayout();
    }

    public static final void onGlobalLayout$6(IDLListenerS190S0100000_2 iDLListenerS190S0100000_2) {
        C66Y c66y = (C66Y) iDLListenerS190S0100000_2.l0;
        if (c66y.LJZI != null && !H7R.LJJJJL(c66y.LL)) {
            c66y.LLIIIJ = (C81184Vtc.LJ(c66y.LJLIL) - c66y.LJZI.LLILZ().width) >> 1;
            if (AnonymousClass668.LIZ()) {
                C157226Fa.LIZ.LIZ();
                return;
            }
            C81184Vtc.LIZIZ(c66y.LJLIL);
            AnonymousClass668.LIZIZ().getBottomMargin();
            AnonymousClass668.LIZIZ().LIZ();
        }
    }

    public static final void onGlobalLayout$7(IDLListenerS190S0100000_2 iDLListenerS190S0100000_2) {
        int i;
        C1559169z c1559169z = (C1559169z) iDLListenerS190S0100000_2.l0;
        View view = c1559169z.LJLIL;
        if (view != null) {
            c1559169z.getWindowVisibleDisplayFrame(new Rect());
            Display display = c1559169z.getDisplay();
            int i2 = 0;
            if (display != null) {
                i = display.getHeight();
            } else {
                i = 0;
            }
            if (i > c1559169z.getHeight()) {
                Display display2 = c1559169z.getDisplay();
                if (display2 != null) {
                    i2 = display2.getHeight();
                }
            } else {
                i2 = c1559169z.getHeight();
            }
            if (i2 - r5.height() > c1559169z.getBottomTabHeight()) {
                c1559169z.LJLJJL = c1559169z.getHeight() - r5.height();
                c1559169z.getViewTreeObserver().removeOnGlobalLayoutListener(c1559169z.LJLJLLL);
                int i3 = C1559069y.LIZ[c1559169z.LJLJJI.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        return;
                    }
                    c1559169z.LJLILLLLZI.LJLJJI = (c1559169z.getWidth() - view.getWidth()) / 2;
                    c1559169z.LJLILLLLZI.LJLJJL = ((c1559169z.getHeight() - c1559169z.LJLJJL) - view.getHeight()) / 2;
                    C6A2 c6a2 = c1559169z.LJLILLLLZI;
                    c1559169z.LIZIZ(c1559169z.LJLJI, new C6A2(1.0f, 1.0f, c6a2.LJLJJI, c6a2.LJLJJL, 32));
                    return;
                }
                c1559169z.LJLILLLLZI.LJLJJI = (c1559169z.getWidth() - view.getWidth()) / 2;
                c1559169z.LJLILLLLZI.LJLJJL = ((c1559169z.getHeight() - c1559169z.LJLJJL) - view.getHeight()) / 2;
                view.setX(c1559169z.LJLILLLLZI.LJLJJI);
                view.setY(c1559169z.LJLILLLLZI.LJLJJL);
                C6A2 c6a22 = c1559169z.LJLILLLLZI;
                C6A2 c6a23 = new C6A2(0.0f, 0.0f, c6a22.LJLJJI, c6a22.LJLJJL, 32);
                C6A2 c6a24 = c1559169z.LJLILLLLZI;
                C6A2 c6a25 = new C6A2(1.0f, 1.0f, c6a24.LJLJJI, c6a24.LJLJJL, 32);
                C6A2 c6a26 = c1559169z.LJLJI;
                c6a26.LJLILLLLZI = 1.0f;
                c6a26.LJLIL = 1.0f;
                c6a26.LJLJI = 0.0f;
                c6a26.LJLJJI = view.getX();
                c6a26.LJLJJL = view.getY();
                c1559169z.LIZIZ(c6a23, c6a25);
            }
        }
    }

    public static final void onGlobalLayout$8(IDLListenerS190S0100000_2 iDLListenerS190S0100000_2) {
        int[] iArr = new int[2];
        ((SpeedNormalFragment) iDLListenerS190S0100000_2.l0)._$_findCachedViewById(R.id.a6w).getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        ((SpeedNormalFragment) iDLListenerS190S0100000_2.l0)._$_findCachedViewById(R.id.c18).getLocationInWindow(iArr2);
        if (Math.abs(iArr2[0] - iArr[0]) - ((SpeedNormalFragment) iDLListenerS190S0100000_2.l0)._$_findCachedViewById(R.id.a6w).getMeasuredWidth() > 16) {
            ((TuxTextView) ((SpeedNormalFragment) iDLListenerS190S0100000_2.l0)._$_findCachedViewById(R.id.m3z)).setTuxFont(62);
            ((TuxTextView) ((SpeedNormalFragment) iDLListenerS190S0100000_2.l0)._$_findCachedViewById(R.id.lzs)).setTuxFont(62);
            ((SpeedNormalFragment) iDLListenerS190S0100000_2.l0)._$_findCachedViewById(R.id.c18).getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS190S0100000_2);
        } else {
            ((TuxTextView) ((SpeedNormalFragment) iDLListenerS190S0100000_2.l0)._$_findCachedViewById(R.id.m3z)).setTuxFont(81);
            ((TuxTextView) ((SpeedNormalFragment) iDLListenerS190S0100000_2.l0)._$_findCachedViewById(R.id.lzs)).setTuxFont(81);
        }
    }

    public static final void onGlobalLayout$9(IDLListenerS190S0100000_2 iDLListenerS190S0100000_2) {
        View view = ((C156086Aq) iDLListenerS190S0100000_2.l0).LJLIL;
        if (view != null) {
            if (view.getWidth() > 0) {
                ((C156086Aq) iDLListenerS190S0100000_2.l0).getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS190S0100000_2);
                ((C156086Aq) iDLListenerS190S0100000_2.l0).LIZIZ();
                return;
            }
            return;
        }
        o.LJIJI("root");
        throw null;
    }

    public IDLListenerS190S0100000_2(AqS152S0100000_2 function, int i) {
        this.$t = i;
        o.LJIIIZ(function, "function");
        this.l0 = function;
    }

    public IDLListenerS190S0100000_2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
