package X;

import X.InterfaceC29871Ff;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.als.dsl.OCAdapterViewModel;
import com.bytedance.scene.navigation.NavigationScene;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1j0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC40861j0<T extends InterfaceC29871Ff> extends AbstractC29891Fh<T> implements InterfaceC29871Ff, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo[] LJLJL;
    public final T LJLIL;
    public final InterfaceC115514g7 LJLILLLLZI;
    public HXO LJLJI;
    public C2A1 LJLJJI;
    public final C5H3 LJLJJL;
    public final C82622Wbi LJLJJLL;

    static {
        TBT tbt = new TBT(AbstractC40861j0.class, "activity", "getActivity()Landroidx/appcompat/app/AppCompatActivity;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJL = new InterfaceC74236TBo[]{tbt};
    }

    public static /* synthetic */ void LJJLJ() {
    }

    public abstract void LJJLIIIIJ();

    public final C29S LJJLIIIJJIZ() {
        return (C29S) this.LJLILLLLZI.LIZ(this, LJLJL[0]);
    }

    public final WMH LJJLIIIJLLLLLLLZ() {
        return (WMH) this.LJLJJL.getValue();
    }

    public abstract int LJJLJLI();

    public final List<AbstractC29891Fh<?>> LJJLIIIJILLIZJL() {
        NavigationScene LIZ;
        List<WM7> sceneList;
        HXO hxo = this.LJLJI;
        WMH wmh = null;
        if (hxo != null && (LIZ = hxo.LIZ()) != null && (sceneList = LIZ.getSceneList()) != null) {
            for (WM7 wm7 : sceneList) {
                if (wm7 instanceof C2A1) {
                    wmh = (WMH) wm7;
                }
            }
            if (wmh != null) {
                return new ArrayList(C44384HbQ.LJJJ(wmh).LJLJJL);
            }
        }
        return new ArrayList();
    }

    public final C2A1 LJJLIIJ() {
        C2A1 c2a1 = this.LJLJJI;
        if (c2a1 != null) {
            return c2a1;
        }
        o.LJIJI(WM7.SCENE_SERVICE);
        throw null;
    }

    @Override // X.InterfaceC29871Ff
    public void close() {
        HXO hxo = this.LJLJI;
        if (hxo != null) {
            hxo.LIZIZ();
        }
        this.LJLJI = null;
    }

    @Override // X.InterfaceC29871Ff
    public boolean onBackPressed() {
        HXO hxo = this.LJLJI;
        if (hxo != null) {
            o.LJI(hxo);
            return hxo.onBackPressed();
        }
        return false;
    }

    @Override // X.InterfaceC29871Ff
    public void x() {
        if (this.LJLJI != null) {
            return;
        }
        HEP LIZ = C44272HZc.LIZ(LJJLIIIJJIZ(), C2A1.class);
        LIZ.LJII = new InterfaceC80245VeT() { // from class: X.1Fg
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [X.2A1, X.WM7] */
            @Override // X.InterfaceC80245VeT
            public final WM7 LIZ(ClassLoader classLoader, String str) {
                o.LJIIIZ(classLoader, "<anonymous parameter 0>");
                o.LJIIIZ(str, "<anonymous parameter 1>");
                AbstractC40861j0 abstractC40861j0 = AbstractC40861j0.this;
                ?? r3 = new WMH() { // from class: X.2A1
                    @Override // X.WM7
                    public final void onActivityCreated(Bundle bundle) {
                        super.onActivityCreated(bundle);
                    }

                    @Override // X.WMH, X.WM7
                    public final ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
                        o.LJIIIZ(inflater, "inflater");
                        o.LJIIIZ(container, "container");
                        View LLLLIILL = C16880lQ.LLLLIILL(inflater, requireArguments().getInt("layoutId"), container, false);
                        if (LLLLIILL != null) {
                            return (ViewGroup) LLLLIILL;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                    }

                    @Override // X.WMH, X.WM7
                    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
                        return onCreateView(layoutInflater, viewGroup, bundle);
                    }
                };
                Bundle bundle = new Bundle();
                bundle.putInt("layoutId", AbstractC40861j0.this.LJJLJLI());
                r3.mArguments = bundle;
                abstractC40861j0.LJJLL(r3);
                return AbstractC40861j0.this.LJJLIIJ();
            }
        };
        LIZ.LJIIIZ = false;
        LIZ.LJI = false;
        HXO LIZ2 = LIZ.LIZ();
        this.LJLJI = LIZ2;
        NavigationScene LIZ3 = LIZ2.LIZ();
        if (LIZ3 != null) {
            LIZ3.registerChildSceneLifecycleCallbacks(new GF6() { // from class: X.1iz
                @Override // X.GF6, X.WMQ
                public final void LIZJ(WM7 scene) {
                    NavigationScene LIZ4;
                    o.LJIIIZ(scene, "scene");
                    if (scene instanceof C2A1) {
                        HXO hxo = AbstractC40861j0.this.LJLJI;
                        if (hxo != null && (LIZ4 = hxo.LIZ()) != null) {
                            LIZ4.unregisterChildSceneLifecycleCallbacks(this);
                        }
                        AbstractC40861j0.this.LJJLIIIIJ();
                    }
                }
            }, false);
        }
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ C0I6 getApiComponent() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJJLL;
    }

    public AbstractC40861j0(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLJJLL = diContainer;
        this.LJLIL = this;
        this.LJLILLLLZI = UCI.LJI(getDiContainer(), C29S.class, null);
        this.LJLJJL = C221108m2.LIZIZ(new IDqS420S0100000(this, 20));
    }

    public final void LJJLL(C2A1 c2a1) {
        o.LJIIIZ(c2a1, "<set-?>");
        this.LJLJJI = c2a1;
    }

    public final C275416g LJJLI(AbstractC40861j0<T> attach, InterfaceC88472Yns<? super C275416g, C76800UCe> init) {
        o.LJIIIZ(attach, "$this$attach");
        o.LJIIIZ(init, "init");
        C2A1 c2a1 = attach.LJLJJI;
        if (c2a1 != null) {
            C275416g c275416g = new C275416g(C44384HbQ.LLIILII(c2a1, null));
            init.invoke(c275416g);
            c275416g.LIZIZ();
            return c275416g;
        }
        o.LJIJI(WM7.SCENE_SERVICE);
        throw null;
    }

    public final C82622Wbi LJJLIIIJJI(AbstractC40861j0<T> data, InterfaceC88472Yns<? super C82621Wbh, C76800UCe> init) {
        o.LJIIIZ(data, "$this$data");
        o.LJIIIZ(init, "init");
        OCAdapterViewModel LJIJ = C78688UuS.LJIJ(data.LJJLIIJ(), false, null, 14);
        C82621Wbh c82621Wbh = LJIJ.LJLIL;
        c82621Wbh.LIZJ(WMH.class, null, data.LJJLIIJ());
        init.invoke(c82621Wbh);
        LJIJ.gv0();
        return LJIJ.hv0();
    }
}
