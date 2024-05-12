package X;

import Y.ACListenerS32S0100000_12;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.gamora.recorder.navi.view.NaviAvatarListViewModel;
import com.ss.android.ugc.gamora.recorder.navi.view.NaviAvatarListViewState;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.S4i, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71500S4i extends C71310Ryk {
    public final ActivityC45651qj LJLJJI;
    public final C62822Ol8 LJLJJL;
    public C73318Sq2 LJLJJLL;
    public C72707SgB LJLJL;

    private final NaviAvatarListViewModel getViewModel() {
        return (NaviAvatarListViewModel) this.LJLJJL.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C73318Sq2 c73318Sq2 = this.LJLJJLL;
        if (c73318Sq2 != null) {
            c73318Sq2.dispose();
        }
        this.LJLJJLL = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        InterfaceC92693kP Kv0;
        InterfaceC92693kP Kv02;
        InterfaceC92693kP Kv03;
        super.onAttachedToWindow();
        this.LJLJJLL = new C73318Sq2();
        LifecycleOwner LJI = C78598Ut0.LJI(this);
        if (LJI == null) {
            LJI = this.LJLJJI;
        }
        C73318Sq2 c73318Sq2 = this.LJLJJLL;
        if (c73318Sq2 != null) {
            Kv03 = getViewModel().Kv0(LJI, new TBT() { // from class: X.S4l
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((NaviAvatarListViewState) obj).getAvatarList();
                }
            }, new C73165SnZ(), new AqS178S0100000_12(this, 735));
            c73318Sq2.LIZ(Kv03);
        }
        C73318Sq2 c73318Sq22 = this.LJLJJLL;
        if (c73318Sq22 != null) {
            Kv02 = getViewModel().Kv0(LJI, new TBT() { // from class: X.S4j
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((NaviAvatarListViewState) obj).getSelectedIndex();
                }
            }, new C73165SnZ(), new AqS178S0100000_12(this, 736));
            c73318Sq22.LIZ(Kv02);
        }
        C73318Sq2 c73318Sq23 = this.LJLJJLL;
        if (c73318Sq23 != null) {
            Kv0 = getViewModel().Kv0(LJI, new TBT() { // from class: X.S4k
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((NaviAvatarListViewState) obj).getLoadingIndex();
                }
            }, new C73165SnZ(), new AqS178S0100000_12(this, 737));
            c73318Sq23.LIZ(Kv0);
        }
        setOnAvatarClickListener(new AqS194S0100000_12(this, 300));
        setPlusClickListener(new ACListenerS32S0100000_12(this, 210));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71500S4i(ActivityC45651qj context) {
        super(context, null, 0);
        o.LJIIIZ(context, "context");
        new LinkedHashMap();
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        o.LJI(LJJIFFI);
        this.LJLJJI = LJJIFFI;
        this.LJLJJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1262));
    }
}
