package X;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.filter.FilterBean;
import java.util.List;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WSN extends AbstractC29891Fh<WXJ> implements WXJ, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo[] LJLJLJ;
    public final WSN LJLIL;
    public final ActivityC45651qj LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public final C82622Wbi LJLJJLL;
    public final boolean LJLJL;

    static {
        TBT tbt = new TBT(WSN.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJLJ = new InterfaceC74236TBo[]{tbt};
    }

    private final WSP LJJLI() {
        return (WSP) this.LJLJJI.getValue();
    }

    private final InterfaceC82311WSd LJJLIIIIJ() {
        return (InterfaceC82311WSd) this.LJLJJL.getValue();
    }

    private final InterfaceC82086WJm getCameraApiComponent() {
        return (InterfaceC82086WJm) this.LJLJI.LIZ(this, LJLJLJ[0]);
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        LJJLI().LIZ(LJJLIIIIJ());
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        LJJLI().destroy();
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ WXJ getApiComponent() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLJJLL;
    }

    public final void LJJLIIIJJI(EnumC82314WSg enumC82314WSg) {
        List list;
        int i;
        FilterBean filterBean;
        C0IB<FilterBean> curSelectedFilter;
        LiveData<WPD> currentFilterSource;
        WPD value;
        InterfaceC82236WPg interfaceC82236WPg;
        WPX LJJJJIZL;
        MutableLiveData LIZJ;
        InterfaceC83624Wrs e8;
        InterfaceC83727WtX effectController;
        if (this.LJLJL && (e8 = getCameraApiComponent().e8()) != null && (effectController = e8.getEffectController()) != null) {
            effectController.la();
        }
        WRP wrp = (WRP) findReadyComponent(this, WRP.class);
        FilterBean filterBean2 = null;
        if (wrp == null || (currentFilterSource = wrp.getCurrentFilterSource()) == null || (value = currentFilterSource.getValue()) == null || (interfaceC82236WPg = value.LJLILLLLZI) == null || (LJJJJIZL = interfaceC82236WPg.LJJJJIZL()) == null || (LIZJ = LJJJJIZL.LIZJ()) == null || (list = (List) LIZJ.getValue()) == null) {
            list = C61878OQg.INSTANCE;
        }
        if (wrp == null || (curSelectedFilter = wrp.getCurSelectedFilter()) == null || (filterBean2 = curSelectedFilter.LIZ()) == null || (i = list.indexOf(filterBean2)) < 0) {
            i = 0;
        }
        int i2 = C82315WSh.LIZ[enumC82314WSg.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    filterBean = filterBean2;
                } else {
                    throw new C162476Zf();
                }
            } else {
                filterBean = (FilterBean) ORZ.LJLLLLLL(i + 1, list);
            }
        } else {
            filterBean = (FilterBean) ORZ.LJLLLLLL(i - 1, list);
        }
        if (filterBean != null && wrp != null) {
            wrp.setFilterChosen(filterBean, "slide", true ^ o.LJ(filterBean, filterBean2), true, o.LJ(filterBean, filterBean2));
        }
    }

    @Override // X.WXJ
    public void Wa(float f) {
        InterfaceC83624Wrs e8;
        InterfaceC83727WtX effectController;
        if (this.LJLJL && (e8 = getCameraApiComponent().e8()) != null && (effectController = e8.getEffectController()) != null) {
            effectController.la();
        }
        LJJLI().LIZIZ(f);
    }

    public WSN(C82622Wbi diContainer, boolean z) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLJJLL = diContainer;
        this.LJLJL = z;
        this.LJLIL = this;
        this.LJLILLLLZI = (ActivityC45651qj) getDiContainer().LJ(ActivityC45651qj.class, null);
        this.LJLJI = UCI.LJI(getDiContainer(), InterfaceC82086WJm.class, null);
        this.LJLJJI = C221108m2.LIZ(EnumC221088m0.NONE, WSQ.LJLIL);
        this.LJLJJL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 41));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x007f, code lost:
    
        if (r3 < 0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJILLIZJL(float r7, X.LDV r8) {
        /*
            r6 = this;
            boolean r0 = r6.LJLJL
            if (r0 == 0) goto L17
            X.WJm r0 = r6.getCameraApiComponent()
            X.Wrs r0 = r0.e8()
            if (r0 == 0) goto L17
            X.WtX r0 = r0.getEffectController()
            if (r0 == 0) goto L17
            r0.la()
        L17:
            java.lang.Class<X.WRP> r0 = X.WRP.class
            X.0I6 r5 = r6.findReadyComponent(r6, r0)
            X.WRP r5 = (X.WRP) r5
            if (r5 == 0) goto L6f
            androidx.lifecycle.LiveData r0 = r5.getCurrentFilterSource()
            if (r0 == 0) goto L6f
            java.lang.Object r0 = r0.getValue()
            X.WPD r0 = (X.WPD) r0
            if (r0 == 0) goto L6f
            X.WPg r0 = r0.LJLILLLLZI
            X.WPX r0 = r0.LJJJJIZL()
            androidx.lifecycle.MutableLiveData r0 = r0.LIZJ()
            java.lang.Object r4 = r0.getValue()
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L48
        L41:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L4b
            return
        L48:
            X.OQg r4 = X.C61878OQg.INSTANCE
            goto L41
        L4b:
            X.0IB r0 = r5.getCurSelectedFilter()
            if (r0 == 0) goto L82
            java.lang.Object r0 = r0.LIZ()
            com.ss.android.ugc.aweme.filter.FilterBean r0 = (com.ss.android.ugc.aweme.filter.FilterBean) r0
            if (r0 != 0) goto L7b
        L59:
            r3 = 0
        L5a:
            X.LDV r2 = X.LDV.LEFT
            if (r8 != r2) goto L79
            int r1 = r3 + (-1)
            java.lang.Object r1 = X.ORZ.LJLLLLLL(r1, r4)
            com.ss.android.ugc.aweme.filter.FilterBean r1 = (com.ss.android.ugc.aweme.filter.FilterBean) r1
        L66:
            if (r8 != r2) goto L70
        L68:
            if (r1 == 0) goto L6f
            if (r0 == 0) goto L6f
            r5.setFilterScroll(r1, r0, r7)
        L6f:
            return
        L70:
            int r0 = r3 + 1
            java.lang.Object r0 = X.ORZ.LJLLLLLL(r0, r4)
            com.ss.android.ugc.aweme.filter.FilterBean r0 = (com.ss.android.ugc.aweme.filter.FilterBean) r0
            goto L68
        L79:
            r1 = r0
            goto L66
        L7b:
            int r3 = r4.indexOf(r0)
            if (r3 >= 0) goto L5a
            goto L59
        L82:
            r0 = 0
            goto L59
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WSN.LJJLIIIJILLIZJL(float, X.LDV):void");
    }

    @Override // X.WXJ
    public void h7(float f, float f2) {
        InterfaceC83624Wrs e8;
        InterfaceC83727WtX effectController;
        if (this.LJLJL && (e8 = getCameraApiComponent().e8()) != null && (effectController = e8.getEffectController()) != null) {
            effectController.la();
        }
        WSP LJJLI = LJJLI();
        Window window = this.LJLILLLLZI.getWindow();
        o.LJIIIIZZ(window, "activity.window");
        View decorView = window.getDecorView();
        o.LJIIIIZZ(decorView, "activity.window.decorView");
        LJJLI.LIZJ(f, f2, decorView.getWidth());
    }

    public /* synthetic */ WSN(C82622Wbi c82622Wbi, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c82622Wbi, (i & 2) != 0 ? false : z);
    }
}
