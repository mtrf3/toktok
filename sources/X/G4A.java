package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public abstract class G4A extends G48 {
    public WeakReference<BaseFragment> LIZIZ;

    @Override // X.G48, X.InterfaceC87439YTj
    public final void LJIIL(FragmentManager fm, BaseFragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        super.LJIIL(fm, f);
        this.LIZIZ = null;
    }

    @Override // X.G48, X.InterfaceC87439YTj
    public final void LJIIIZ(FragmentManager fm, BaseFragment f, Context context) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        o.LJIIIZ(context, "context");
        super.LJIIIZ(fm, f, context);
        this.LIZIZ = new WeakReference<>(f);
    }
}
