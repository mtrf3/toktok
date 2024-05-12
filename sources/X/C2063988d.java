package X;

import Y.ARunnableS7S0400000_3;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.88d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2063988d extends LP1 {
    public static final /* synthetic */ int LJII = 0;
    public final E6B LJ;
    public final String LJFF;
    public final Aweme LJI;

    @Override // X.InterfaceC54194LOs
    public final void LIZJ() {
        LJFF("5001");
    }

    @Override // X.InterfaceC54194LOs
    public final boolean LIZLLL() {
        if (!((Boolean) C2064188f.LIZ.getValue()).booleanValue() || this.LJI.isAd()) {
            return false;
        }
        C62002c0.LIZ.getClass();
        if (!C62002c0.LIZ() || C2063688a.LIZ().LIZ.getBoolean("is_tooltip_shown", false)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC54194LOs
    public final void LIZ(InterfaceC65784Pro<C76800UCe> shown) {
        View view;
        Context context;
        ActivityC45651qj LJJIFFI;
        o.LJIIIZ(shown, "shown");
        WeakReference<View> weakReference = this.LJ.LIZ;
        if (weakReference == null || (view = weakReference.get()) == null || (context = view.getContext()) == null || (LJJIFFI = C45804HyK.LJJIFFI(context)) == null) {
            return;
        }
        view.post(new ARunnableS7S0400000_3(this, LJJIFFI, view, shown, 5));
    }

    public final void LJII(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("user_id", ((RBX) HG3.LJIILL()).getCurUserId());
        c188727au.LJIIIZ("enter_from", this.LJFF);
        c188727au.LJIIIZ("current_page", this.LJFF);
        FMX.LJIIL(str, c188727au.LIZ);
    }

    public C2063988d(E6B e6b, WeakReference<Context> weakReference, String str, Aweme aweme) {
        super(e6b, weakReference);
        this.LJ = e6b;
        this.LJFF = str;
        this.LJI = aweme;
    }
}
