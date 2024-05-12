package X;

import Y.ACListenerS28S0100000_8;
import Y.AObserverS76S0100000_8;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.setting.page.backgroundaudio.BGAudioViewModel;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class J87 extends C25828ABs {
    public final Fragment LJLJJI;
    public final ILF LJLJJL;
    public final C62822Ol8 LJLJJLL;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.AEC, X.ACl] */
    @Override // X.AG6
    public final C25847ACl LJI() {
        ((BGAudioViewModel) this.LJLJJLL.getValue()).LJLILLLLZI.observe(this.LJLJJI.getViewLifecycleOwner(), new AObserverS76S0100000_8(this, 90));
        return super.LJI();
    }

    @Override // X.AG6
    public final C25847ACl LJIIIIZZ() {
        boolean z;
        String string = this.LJLJJI.getString(this.LJLJJL.getTitle());
        if (((BGAudioViewModel) this.LJLJJLL.getValue()).LJLILLLLZI.getValue() == this.LJLJJL.getPlayOrder()) {
            z = true;
        } else {
            z = false;
        }
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = this.LJLJJL.getIcon();
        ACListenerS28S0100000_8 aCListenerS28S0100000_8 = new ACListenerS28S0100000_8(this, 72);
        o.LJIIIIZZ(string, "getString(option.title)");
        return new C25847ACl(z, string, c2068389v, null, aCListenerS28S0100000_8, 7146);
    }

    public J87(Fragment fragment, ILF option) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(option, "option");
        this.LJLJJI = fragment;
        this.LJLJJL = option;
        this.LJLJJLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 581));
    }
}
