package X;

import android.content.Context;
import android.view.View;
import android.widget.SeekBar;
import kotlin.jvm.internal.o;

/* renamed from: X.WPu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82250WPu {
    public final InterfaceC88472Yns<? super SeekBar, ? extends WQ8> LIZ;
    public final InterfaceC88471Ynr<? super View, ? super View, ? extends WQ5> LIZIZ;
    public final InterfaceC88471Ynr<? super Context, ? super WQ1, ? extends WQA> LIZJ;
    public final InterfaceC88472Yns<? super View, ? extends TPQ> LIZLLL;
    public final InterfaceC88471Ynr<? super View, ? super View, ? extends InterfaceC74483TLb> LJ;
    public final InterfaceC88472Yns<? super View, ? extends WQ9> LJFF;

    public C82250WPu(int i) {
        WQ6 defaultSeekBarViewProvider = WQ6.LJLIL;
        WQ3 defaultClearViewProvider = WQ3.LJLIL;
        C82253WPx defaultBoxEntranceViewProvider = C82253WPx.LJLIL;
        WQC defaultOutsideTouchViewProvider = WQC.LJLIL;
        C81326Vvu defaultTransitionViewProvider = C81326Vvu.LJLIL;
        WQ4 defaultApplyToAllView = WQ4.LJLIL;
        o.LJIIIZ(defaultSeekBarViewProvider, "defaultSeekBarViewProvider");
        o.LJIIIZ(defaultClearViewProvider, "defaultClearViewProvider");
        o.LJIIIZ(defaultBoxEntranceViewProvider, "defaultBoxEntranceViewProvider");
        o.LJIIIZ(defaultOutsideTouchViewProvider, "defaultOutsideTouchViewProvider");
        o.LJIIIZ(defaultTransitionViewProvider, "defaultTransitionViewProvider");
        o.LJIIIZ(defaultApplyToAllView, "defaultApplyToAllView");
        this.LIZ = defaultSeekBarViewProvider;
        this.LIZIZ = defaultClearViewProvider;
        this.LIZJ = defaultBoxEntranceViewProvider;
        this.LIZLLL = defaultOutsideTouchViewProvider;
        this.LJ = defaultTransitionViewProvider;
        this.LJFF = defaultApplyToAllView;
    }
}
