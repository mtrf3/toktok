package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.5og, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146305og extends AbstractC29891Fh<InterfaceC148205rk> implements InterfaceC148205rk {
    public final C82622Wbi LJLIL;
    public final WMH LJLILLLLZI;
    public final int LJLJI;
    public final InterfaceC148205rk LJLJJI;
    public C146485oy LJLJJL;

    @Override // X.InterfaceC148205rk
    public void cD() {
        C146485oy c146485oy = this.LJLJJL;
        if (c146485oy != null) {
            View view = c146485oy.mView;
            o.LJIIIIZZ(view, "view");
            C146485oy.LLJILJIL(view, false);
        }
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        C146485oy c146485oy = new C146485oy(this.LJLIL);
        this.LJLJJL = c146485oy;
        this.LJLILLLLZI.add(this.LJLJI, c146485oy, "SwipeHintGestureAnimationScene");
        this.LJLILLLLZI.show(c146485oy);
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC148205rk getApiComponent() {
        return this.LJLJJI;
    }

    public C146305og(C82622Wbi diContainer, WMH parentScene, int i) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = parentScene;
        this.LJLJI = i;
        this.LJLJJI = this;
    }
}
