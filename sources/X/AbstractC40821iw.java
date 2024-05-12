package X;

import X.C1FU;
import android.os.Bundle;
import androidx.lifecycle.ViewModel;
import com.bytedance.als.dsl.AlsVMContainer;
import com.bytedance.als.dsl.OCAdapterViewModel;
import com.bytedance.scene.navigation.NavigationScene;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1iw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC40821iw<T extends C1FU> extends AbstractC29891Fh<T> implements C1FU, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo[] LJLL;
    public final InterfaceC115514g7 LJLIL;
    public HXO LJLILLLLZI;
    public Bundle LJLJI;
    public C2A0 LJLJJI;
    public final C5H3 LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public final C82622Wbi LJLJLJ;
    public final WMH LJLJLLL;

    static {
        TBT tbt = new TBT(AbstractC40821iw.class, "activity", "getActivity()Landroidx/appcompat/app/AppCompatActivity;", 0);
        C65352Pkq.LIZ.getClass();
        LJLL = new InterfaceC74236TBo[]{tbt};
    }

    public static /* synthetic */ void LJJLJLI() {
    }

    public abstract void LJJLIIIIJ();

    public final C29S LJJLIIIJLLLLLLLZ() {
        return (C29S) this.LJLIL.LIZ(this, LJLL[0]);
    }

    public final WMH LJJLIIJ() {
        return (WMH) this.LJLJJL.getValue();
    }

    public abstract int LJJZZI();

    public abstract int LJLIIL();

    public final List<AbstractC29891Fh<?>> LJJLIIIJILLIZJL() {
        if (this.LJLJJI == null) {
            return new ArrayList();
        }
        C2A0 c2a0 = this.LJLJJI;
        if (c2a0 != null) {
            return new ArrayList(C44384HbQ.LJJJ(c2a0).LJLJJL);
        }
        o.LJIJI(WM7.SCENE_SERVICE);
        throw null;
    }

    public final C2A0 LJJLJ() {
        C2A0 c2a0 = this.LJLJJI;
        if (c2a0 != null) {
            return c2a0;
        }
        o.LJIJI(WM7.SCENE_SERVICE);
        throw null;
    }

    public final boolean LJJLL() {
        if (this.LJLJJI != null) {
            return true;
        }
        return false;
    }

    @Override // X.C1FU
    public void close() {
        WMH wmh = this.LJLJLLL;
        if (wmh != null) {
            C2A0 c2a0 = this.LJLJJI;
            if (c2a0 != null) {
                wmh.remove(c2a0);
                return;
            } else {
                o.LJIJI(WM7.SCENE_SERVICE);
                throw null;
            }
        }
        HXO hxo = this.LJLILLLLZI;
        if (hxo != null) {
            hxo.LIZIZ();
        }
        this.LJLILLLLZI = null;
    }

    @Override // X.C1FU
    public boolean onBackPressed() {
        NavigationScene LJIL;
        HXO hxo = this.LJLILLLLZI;
        if (hxo != null) {
            o.LJI(hxo);
            return hxo.onBackPressed();
        }
        WMH wmh = this.LJLJLLL;
        if (wmh != null && (LJIL = C78897Uxp.LJIL(wmh)) != null) {
            return LJIL.onBackPressed();
        }
        return false;
    }

    @Override // X.C1FU
    public void x() {
        if (this.LJLJL) {
            return;
        }
        this.LJLJL = true;
        if (this.LJLJLLL != null) {
            this.LJLJJLL = true;
            C2A0 c2a0 = new C2A0();
            Bundle bundle = c2a0.mArguments;
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putInt("layoutId", LJJZZI());
            }
            c2a0.mArguments = bundle;
            this.LJLJJI = c2a0;
            final NavigationScene navigationScene = new NavigationScene();
            HJO hjo = new HJO((Bundle) null, C2A0.class);
            hjo.LIZJ = false;
            hjo.LIZLLL = false;
            navigationScene.mArguments = hjo.LIZ();
            navigationScene.LJLILLLLZI = new InterfaceC80245VeT() { // from class: X.1FV
                @Override // X.InterfaceC80245VeT
                public final WM7 LIZ(ClassLoader classLoader, String str) {
                    o.LJIIIZ(classLoader, "<anonymous parameter 0>");
                    o.LJIIIZ(str, "<anonymous parameter 1>");
                    return AbstractC40821iw.this.LJJLJ();
                }
            };
            navigationScene.registerChildSceneLifecycleCallbacks(new GF6() { // from class: X.1iu
                @Override // X.GF6, X.WMQ
                public final void LIZJ(WM7 scene) {
                    o.LJIIIZ(scene, "scene");
                    if (scene instanceof C2A0) {
                        navigationScene.unregisterChildSceneLifecycleCallbacks(this);
                        AbstractC40821iw.this.LJJLIIIIJ();
                    }
                }
            }, false);
            this.LJLJLLL.add(LJLIIL(), navigationScene, "UIRootContainerGroupScene");
            return;
        }
        HEP LIZ = C44272HZc.LIZ(LJJLIIIJLLLLLLLZ(), C2A0.class);
        LIZ.LJII = new InterfaceC80245VeT() { // from class: X.1FW
            @Override // X.InterfaceC80245VeT
            public final WM7 LIZ(ClassLoader classLoader, String str) {
                o.LJIIIZ(classLoader, "<anonymous parameter 0>");
                o.LJIIIZ(str, "<anonymous parameter 1>");
                AbstractC40821iw abstractC40821iw = AbstractC40821iw.this;
                C2A0 c2a02 = new C2A0();
                Bundle bundle2 = c2a02.mArguments;
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                    bundle2.putInt("layoutId", AbstractC40821iw.this.LJJZZI());
                }
                c2a02.mArguments = bundle2;
                abstractC40821iw.LJJZZIII(c2a02);
                AbstractC40821iw abstractC40821iw2 = AbstractC40821iw.this;
                abstractC40821iw2.LJLJJLL = true;
                return abstractC40821iw2.LJJLJ();
            }
        };
        LIZ.LIZLLL = false;
        LIZ.LJ = false;
        LIZ.LJFF = LJLIIL();
        LIZ.LJIIIZ = false;
        LIZ.LJI = false;
        HXO LIZ2 = LIZ.LIZ();
        this.LJLILLLLZI = LIZ2;
        NavigationScene LIZ3 = LIZ2.LIZ();
        if (LIZ3 == null) {
            return;
        }
        LIZ3.registerChildSceneLifecycleCallbacks(new GF6() { // from class: X.1iv
            @Override // X.GF6, X.WMQ
            public final void LIZJ(WM7 scene) {
                NavigationScene LIZ4;
                o.LJIIIZ(scene, "scene");
                if (scene instanceof C2A0) {
                    HXO hxo = AbstractC40821iw.this.LJLILLLLZI;
                    if (hxo != null && (LIZ4 = hxo.LIZ()) != null) {
                        LIZ4.unregisterChildSceneLifecycleCallbacks(this);
                    }
                    AbstractC40821iw.this.LJJLIIIIJ();
                }
            }
        }, false);
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJLJ;
    }

    public final void LJJZZIII(C2A0 c2a0) {
        o.LJIIIZ(c2a0, "<set-?>");
        this.LJLJJI = c2a0;
    }

    public AbstractC40821iw(C82622Wbi diContainer, WMH wmh) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLJLJ = diContainer;
        this.LJLJLLL = wmh;
        this.LJLIL = UCI.LJI(getDiContainer(), C29S.class, null);
        this.LJLJJL = C221108m2.LIZIZ(new IDqS420S0100000(this, 14));
    }

    public final C275416g LJJLI(AbstractC40821iw<?> attach, InterfaceC88472Yns<? super C275416g, C76800UCe> init) {
        o.LJIIIZ(attach, "$this$attach");
        o.LJIIIZ(init, "init");
        C2A0 c2a0 = attach.LJLJJI;
        if (c2a0 != null) {
            C275416g c275416g = new C275416g(C44384HbQ.LLIILII(c2a0, null));
            init.invoke(c275416g);
            c275416g.LIZIZ();
            return c275416g;
        }
        o.LJIJI(WM7.SCENE_SERVICE);
        throw null;
    }

    public final void LJJLIIIJJI(AbstractC40821iw<?> config, InterfaceC88472Yns<? super C275616i, C76800UCe> configInit) {
        o.LJIIIZ(config, "$this$config");
        o.LJIIIZ(configInit, "configInit");
        ViewModel viewModel = C165716et.LIZ(config.LJJLJ()).get(AlsVMContainer.class);
        o.LJIIIIZZ(viewModel, "SceneViewModelProviders.…sVMContainer::class.java]");
        C275616i c275616i = new C275616i(0);
        configInit.invoke(c275616i);
        ((AlsVMContainer) viewModel).LJLIL = c275616i;
    }

    public final C82622Wbi LJJLIIIJJIZ(AbstractC40821iw<?> data, InterfaceC88472Yns<? super C82621Wbh, C76800UCe> init) {
        o.LJIIIZ(data, "$this$data");
        o.LJIIIZ(init, "init");
        OCAdapterViewModel LJIJ = C78688UuS.LJIJ(data.LJJLJ(), false, data.getDiContainer(), 10);
        C82621Wbh c82621Wbh = LJIJ.LJLIL;
        c82621Wbh.LIZJ(WMH.class, null, data.LJJLJ());
        init.invoke(c82621Wbh);
        LJIJ.gv0();
        return LJIJ.hv0();
    }

    public /* synthetic */ AbstractC40821iw(C82622Wbi c82622Wbi, WMH wmh, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c82622Wbi, (i & 2) != 0 ? null : wmh);
    }
}
