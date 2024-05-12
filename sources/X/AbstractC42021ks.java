package X;

import X.C0I6;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModel;
import com.bytedance.als.dsl.AlsVMContainer;
import com.bytedance.als.dsl.OCAdapterViewModel;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* renamed from: X.1ks, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC42021ks<T extends C0I6> extends AbstractC29891Fh<T> implements C0I6, InterfaceC135635Tz, InterfaceC04060Dy {
    public final T LJLIL;
    public final String LJLILLLLZI;
    public int LJLJI;
    public EnumC06840Oq LJLJJI;
    public HXO LJLJJL;
    public WMH LJLJJLL;
    public boolean LJLJL;
    public final C42011kr LJLJLJ;
    public final WMH LJLJLLL;
    public final C82622Wbi LJLL;

    public static /* synthetic */ void LJJLIIJ() {
    }

    public abstract void LJJLIIIIJ(WMH wmh);

    public abstract int LJJLJLI();

    private final void LJJLIIIJJI() {
        if (this.LJLJJLL == null) {
            final int LJJLJLI = LJJLJLI();
            this.LJLJJLL = new WMH(LJJLJLI) { // from class: X.2CZ
                public final int LJLIL;

                {
                    this.LJLIL = LJJLJLI;
                }

                @Override // X.WMH, X.WM7
                public final void onCreate(Bundle bundle) {
                    super.onCreate(bundle);
                    List<WM7> sceneList = getSceneList();
                    o.LJIIIIZZ(sceneList, "sceneList");
                    Iterator it = ORZ.LLJI(sceneList).iterator();
                    while (it.hasNext()) {
                        remove((WM7) it.next());
                    }
                }

                @Override // X.WMH, X.WM7
                public final ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
                    o.LJIIIZ(inflater, "inflater");
                    o.LJIIIZ(container, "container");
                    View LLLLIILL = C16880lQ.LLLLIILL(inflater, this.LJLIL, container, false);
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
        }
        if (this.LJLJLLL.findSceneByTag(this.LJLILLLLZI) != null) {
            C79234V7u.LJJIIZ(this.LJLJLLL, this.LJLILLLLZI);
        }
        this.LJLJL = true;
        this.LJLJLLL.registerChildSceneLifecycleCallbacks(this.LJLJLJ, false);
        this.LJLJLLL.disableSupportRestore();
        WMH wmh = this.LJLJLLL;
        int i = this.LJLJI;
        WMH wmh2 = this.LJLJJLL;
        if (wmh2 != null) {
            wmh.add(i, wmh2, this.LJLILLLLZI);
        } else {
            o.LJIJI("childContainerGroupScene");
            throw null;
        }
    }

    public final WMH LJJLIIIJLLLLLLLZ() {
        WMH wmh = this.LJLJJLL;
        if (wmh != null) {
            return wmh;
        }
        o.LJIJI("childContainerGroupScene");
        throw null;
    }

    public final EnumC06840Oq LJJLJ() {
        EnumC06840Oq enumC06840Oq = this.LJLJJI;
        if (enumC06840Oq != null) {
            return enumC06840Oq;
        }
        o.LJIJI("defaultVisibility");
        throw null;
    }

    public final void clear() {
        C79234V7u.LJJIIZ(this.LJLJLLL, this.LJLILLLLZI);
        HXO hxo = this.LJLJJL;
        if (hxo != null) {
            hxo.LIZIZ();
        }
    }

    public final void hide() {
        WMH wmh = this.LJLJJLL;
        if (wmh == null) {
            return;
        }
        this.LJLJLLL.hide(wmh);
    }

    public final void show() {
        WMH wmh = this.LJLJJLL;
        if (wmh == null) {
            LJJLIIIJJI();
            return;
        }
        if (this.LJLJLLL.isShowing(wmh)) {
            return;
        }
        WMH wmh2 = this.LJLJLLL;
        WMH wmh3 = this.LJLJJLL;
        if (wmh3 != null) {
            wmh2.show(wmh3);
        } else {
            o.LJIJI("childContainerGroupScene");
            throw null;
        }
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        if (this.LJLJLLL.findSceneByTag(this.LJLILLLLZI) != null) {
            C79234V7u.LJJIIZ(this.LJLJLLL, this.LJLILLLLZI);
        }
        EnumC06840Oq enumC06840Oq = this.LJLJJI;
        if (enumC06840Oq != null) {
            if (enumC06840Oq == EnumC06840Oq.SHOW) {
                show();
                return;
            }
            return;
        }
        o.LJIJI("defaultVisibility");
        throw null;
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        if (this.LJLJL) {
            this.LJLJLLL.unregisterChildSceneLifecycleCallbacks(this.LJLJLJ);
        }
    }

    @Override // X.AbstractC29891Fh
    public T getApiComponent() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLL;
    }

    public final C275416g LJJLI(InterfaceC88472Yns<? super C275416g, C76800UCe> init) {
        o.LJIIIZ(init, "init");
        WMH wmh = this.LJLJJLL;
        if (wmh != null) {
            C275416g c275416g = new C275416g(C44384HbQ.LLIILII(wmh, null));
            init.invoke(c275416g);
            c275416g.LIZIZ();
            return c275416g;
        }
        o.LJIJI("childContainerGroupScene");
        throw null;
    }

    public final void LJJLIIIJILLIZJL(InterfaceC88472Yns<? super C275616i, C76800UCe> configInit) {
        o.LJIIIZ(configInit, "configInit");
        ViewModel viewModel = C165716et.LIZ(LJJLIIIJLLLLLLLZ()).get(AlsVMContainer.class);
        o.LJIIIIZZ(viewModel, "SceneViewModelProviders.…sVMContainer::class.java]");
        C275616i c275616i = new C275616i(0);
        configInit.invoke(c275616i);
        ((AlsVMContainer) viewModel).LJLIL = c275616i;
    }

    public final C82622Wbi LJJLIIIJJIZ(InterfaceC88472Yns<? super C82621Wbh, C76800UCe> init) {
        o.LJIIIZ(init, "init");
        WMH wmh = this.LJLJJLL;
        if (wmh != null) {
            OCAdapterViewModel LJIJ = C78688UuS.LJIJ(wmh, false, this.LJLL, 2);
            init.invoke(LJIJ.LJLIL);
            LJIJ.gv0();
            return LJIJ.hv0();
        }
        o.LJIJI("childContainerGroupScene");
        throw null;
    }

    public final void LJJLL(WMH wmh) {
        o.LJIIIZ(wmh, "<set-?>");
        this.LJLJJLL = wmh;
    }

    public final void LJJZZI(EnumC06840Oq enumC06840Oq) {
        o.LJIIIZ(enumC06840Oq, "<set-?>");
        this.LJLJJI = enumC06840Oq;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.1kr] */
    public AbstractC42021ks(WMH parentGroupScene, C82622Wbi diContainer) {
        o.LJIIIZ(parentGroupScene, "parentGroupScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLJLLL = parentGroupScene;
        this.LJLL = diContainer;
        this.LJLIL = this;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UIGroupLogicComponent#");
        LIZ.append(getClass().getName());
        LIZ.append('#');
        LIZ.append(UUID.randomUUID().toString());
        this.LJLILLLLZI = X1D.LIZIZ(LIZ);
        this.LJLJI = -1;
        this.LJLJLJ = new GF6() { // from class: X.1kr
            @Override // X.GF6, X.WMQ
            public final void LIZJ(WM7 scene) {
                o.LJIIIZ(scene, "scene");
                if (o.LJ(scene, AbstractC42021ks.this.LJJLIIIJLLLLLLLZ())) {
                    AbstractC42021ks abstractC42021ks = AbstractC42021ks.this;
                    abstractC42021ks.LJLJL = false;
                    abstractC42021ks.LJLJLLL.unregisterChildSceneLifecycleCallbacks(this);
                    AbstractC42021ks abstractC42021ks2 = AbstractC42021ks.this;
                    abstractC42021ks2.LJJLIIIIJ(abstractC42021ks2.LJJLIIIJLLLLLLLZ());
                }
            }
        };
    }
}
