package X;

import Y.AObjectS89S0100000_14;
import android.view.GestureDetector;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WK8 extends AbstractC29891Fh<InterfaceC82053WIf> implements InterfaceC82053WIf, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLLL;
    public final WMH LJLIL;
    public final C82622Wbi LJLILLLLZI;
    public final int LJLJI;
    public final List<C81975WFf> LJLJJI;
    public final C81975WFf LJLJJL;
    public final InterfaceC65784Pro<C76800UCe> LJLJJLL;
    public final WKB LJLJL;
    public final ShortVideoContext LJLJLJ;
    public final InterfaceC45999I3n LJLJLLL;
    public final InterfaceC115514g7 LJLL;
    public final InterfaceC82053WIf LJLLI;
    public final C5H3 LJLLILLLL;
    public final C5H3 LJLLJ;
    public final C5H3 LJLLL;

    static {
        TBT tbt = new TBT(WK8.class, "speedApiComponent", "getSpeedApiComponent()Lcom/ss/android/ugc/aweme/ftc/speed/FTCSpeedApiComponent;", 0);
        C65352Pkq.LIZ.getClass();
        LJLLLL = new InterfaceC74236TBo[]{tbt};
    }

    private final WKD LJJLIIIIJ() {
        return (WKD) this.LJLLL.getValue();
    }

    public final WIB LJJLI() {
        return (WIB) this.LJLL.LIZ(this, LJLLLL[0]);
    }

    public final WK9 LJJLIIIJILLIZJL() {
        return (WK9) this.LJLLJ.getValue();
    }

    public final C29901Fi<Boolean> LJJLIIIJJI() {
        return (C29901Fi) this.LJLLILLLL.getValue();
    }

    @Override // X.InterfaceC82053WIf
    public int LJLLI() {
        return this.LJLJL.LJLLI();
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJJLL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        this.LJLJL.LJLILLLLZI(this.LJLJJI);
        this.LJLJL.LIZIZ(this.LJLJJL);
        this.LJLIL.add(this.LJLJI, LJJLIIIJILLIZJL(), "FTCToolbarScene");
        if (C53557L0f.LIZ()) {
            WK9 LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
            AqS164S0100000_14 aqS164S0100000_14 = new AqS164S0100000_14(this, 69);
            LJJLIIIJILLIZJL.getClass();
            GestureDetector gestureDetector = new GestureDetector(LJJLIIIJILLIZJL.getSceneContext(), new WKA(LJJLIIIJILLIZJL));
            RecyclerView recyclerView = LJJLIIIJILLIZJL.LJLJI;
            if (recyclerView != null) {
                recyclerView.setClickable(true);
                RecyclerView recyclerView2 = LJJLIIIJILLIZJL.LJLJI;
                if (recyclerView2 != null) {
                    recyclerView2.LJIIJ(new WK7(gestureDetector, LJJLIIIJILLIZJL, aqS164S0100000_14));
                } else {
                    o.LJIJI("toolbarRecyclerView");
                    throw null;
                }
            } else {
                o.LJIJI("toolbarRecyclerView");
                throw null;
            }
        }
        this.LJLJLLL.Na0().LIZIZ(this, new AObjectS89S0100000_14(this, 70));
        this.LJLJLLL.Et().LIZIZ(this, new AObjectS89S0100000_14(this, 71));
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC82053WIf getApiComponent() {
        return this.LJLLI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC82053WIf
    public void LJLILLLLZI(List<? extends C81975WFf> items) {
        o.LJIIIZ(items, "items");
        this.LJLJL.LJLILLLLZI(items);
    }

    @Override // X.InterfaceC82053WIf
    public void LJLLJ(C81975WFf item) {
        o.LJIIIZ(item, "item");
        this.LJLJL.LJLLJ(item);
    }

    @Override // X.InterfaceC82053WIf
    public void LJLLLL(int i) {
        this.LJLJL.LJLLLL(i);
    }

    @Override // X.InterfaceC82053WIf
    public void LL(C81975WFf item) {
        o.LJIIIZ(item, "item");
        this.LJLJL.LL(item);
    }

    @Override // X.InterfaceC82053WIf
    public void LLFF(C81975WFf item) {
        o.LJIIIZ(item, "item");
        this.LJLJL.LLFF(item);
    }

    @Override // X.InterfaceC82053WIf
    public View R3(int i) {
        return LJJLIIIJILLIZJL().LLJJ(i);
    }

    @Override // X.InterfaceC82053WIf
    public void a8(List<? extends C81975WFf> items) {
        o.LJIIIZ(items, "items");
        ArrayList arrayList = new ArrayList(this.LJLJL.getItems());
        arrayList.addAll(items);
        this.LJLJL.LJLILLLLZI(arrayList);
    }

    @Override // X.InterfaceC82053WIf
    public C81975WFf d7(int i) {
        return LJJLIIIJILLIZJL().LLJILJILJ(i);
    }

    @Override // X.InterfaceC82053WIf
    public void e4(boolean z) {
        if (C78897Uxp.LJIL(this.LJLIL) == null) {
            return;
        }
        NavigationScene LJIL = C78897Uxp.LJIL(this.LJLIL);
        o.LJI(LJIL);
        if (z) {
            if (LJJLIIIJILLIZJL().isVisible()) {
                this.LJLIL.hide(LJJLIIIJILLIZJL());
            }
            if (!C79057V0z.LJIILLIIL(LJIL, LJJLIIIIJ())) {
                WKD LJJLIIIIJ = LJJLIIIIJ();
                C42663Gol c42663Gol = new C42663Gol();
                c42663Gol.LIZ = true;
                c42663Gol.LIZJ = new C81014Vqs();
                LJIL.LLJJJJ(LJJLIIIIJ, c42663Gol.LIZ());
                return;
            }
            return;
        }
        if (LJJLIIIJILLIZJL().isVisible()) {
            return;
        }
        this.LJLIL.show(LJJLIIIJILLIZJL());
    }

    @Override // X.InterfaceC82053WIf
    public void t1(List<? extends C81975WFf> items) {
        o.LJIIIZ(items, "items");
        ArrayList arrayList = new ArrayList(this.LJLJL.getItems());
        Iterator<? extends C81975WFf> it = items.iterator();
        while (it.hasNext()) {
            arrayList.remove(it.next());
        }
        this.LJLJL.LJLILLLLZI(arrayList);
    }

    public WK8(WMH parentScene, C82622Wbi diContainer, int i, List<C81975WFf> items, C81975WFf c81975WFf, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, int i2, WKB toolbarManager) {
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(items, "items");
        o.LJIIIZ(toolbarManager, "toolbarManager");
        this.LJLIL = parentScene;
        this.LJLILLLLZI = diContainer;
        this.LJLJI = i;
        this.LJLJJI = items;
        this.LJLJJL = c81975WFf;
        this.LJLJJLL = interfaceC65784Pro;
        this.LJLJL = toolbarManager;
        this.LJLJLJ = (ShortVideoContext) getDiContainer().LJ(ShortVideoContext.class, null);
        this.LJLJLLL = (InterfaceC45999I3n) getDiContainer().LJ(InterfaceC45999I3n.class, null);
        this.LJLL = UCI.LJI(getDiContainer(), WIB.class, null);
        this.LJLLI = this;
        this.LJLLILLLL = C221108m2.LIZIZ(WKH.LJLIL);
        this.LJLLJ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 71));
        this.LJLLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 70));
        toolbarManager.LJLLLL(i2);
    }

    public /* synthetic */ WK8(WMH wmh, C82622Wbi c82622Wbi, int i, List list, C81975WFf c81975WFf, InterfaceC65784Pro interfaceC65784Pro, int i2, WKB wkb, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(wmh, c82622Wbi, i, list, (i3 & 16) != 0 ? null : c81975WFf, (i3 & 32) == 0 ? interfaceC65784Pro : null, (i3 & 64) != 0 ? Integer.MAX_VALUE : i2, (i3 & 128) != 0 ? new C82076WJc() : wkb);
    }
}
