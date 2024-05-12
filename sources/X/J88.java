package X;

import Y.ACListenerS28S0100000_8;
import Y.AObserverS76S0100000_8;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.setting.page.backgroundaudio.BGAudioViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class J88 extends C25849ACn {
    public final Fragment LJLJJL;
    public final C62822Ol8 LJLJJLL;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.AEC, X.ACm] */
    @Override // X.AG6
    public final C25848ACm LJI() {
        ((BGAudioViewModel) this.LJLJJLL.getValue()).LJLIL.observe(this.LJLJJL.getViewLifecycleOwner(), new AObserverS76S0100000_8(this, 89));
        return super.LJI();
    }

    @Override // X.C25849ACn
    /* renamed from: LJIIJJI */
    public final C25848ACm LJIIIIZZ() {
        Boolean value = ((BGAudioViewModel) this.LJLJJLL.getValue()).LJLIL.getValue();
        if (value == null) {
            value = Boolean.FALSE;
        }
        boolean booleanValue = value.booleanValue();
        String string = this.LJLJJL.getString(R.string.bv2);
        o.LJIIIIZZ(string, "fragment.getString(R.str…audio_mode_setting_title)");
        return new C25848ACm(booleanValue, string, new ACListenerS28S0100000_8(this, 71), false, null, null, null, null, false, false, false, null, 65528);
    }

    @Override // X.C25849ACn, X.AG6
    public final /* bridge */ /* synthetic */ C25848ACm LJIIIIZZ() {
        return LJIIIIZZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J88(Fragment fragment) {
        super(null);
        o.LJIIIZ(fragment, "fragment");
        this.LJLJJL = fragment;
        this.LJLJJLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 580));
    }
}
