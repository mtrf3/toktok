package X;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.709, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass709 extends F9E implements InterfaceC55260LmS, Serializable {
    public static final C70A Companion = new C70A();
    public final AnonymousClass707 LJLIL;
    public final String LJLILLLLZI;

    /* JADX WARN: Multi-variable type inference failed */
    public AnonymousClass709() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AnonymousClass709 copy$default(AnonymousClass709 anonymousClass709, AnonymousClass707 anonymousClass707, int i, Object obj) {
        if ((i & 1) != 0) {
            anonymousClass707 = anonymousClass709.LJLIL;
        }
        return anonymousClass709.copy(anonymousClass707);
    }

    public static final AnonymousClass707 fetchOwnFragmentData(View view) {
        Companion.getClass();
        return C70A.LIZ(view);
    }

    public final AnonymousClass709 copy(AnonymousClass707 fragmentData) {
        o.LJIIIZ(fragmentData, "fragmentData");
        return new AnonymousClass709(fragmentData);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public final AnonymousClass707 getFragmentData() {
        return this.LJLIL;
    }

    public String getSourceId() {
        return this.LJLILLLLZI;
    }

    public AnonymousClass709(AnonymousClass707 fragmentData) {
        o.LJIIIZ(fragmentData, "fragmentData");
        this.LJLIL = fragmentData;
        this.LJLILLLLZI = AnonymousClass629.LIZ("randomUUID().toString()");
    }

    public static final AnonymousClass707 fetchOwnFragmentData(Fragment fragment) {
        InterfaceC55235Lm3 LIZJ;
        InterfaceC55251LmJ LIZLLL;
        AnonymousClass709 anonymousClass709;
        Companion.getClass();
        if (fragment == null || fragment.getContext() == null || (LIZJ = C55230Lly.LIZJ(fragment, null)) == null || (LIZLLL = C55247LmF.LIZLLL(LIZJ, AnonymousClass709.class, "source_default_key")) == null || (anonymousClass709 = (AnonymousClass709) LIZLLL.getSource()) == null) {
            return null;
        }
        return anonymousClass709.getFragmentData();
    }

    public static final void bindSource(LifecycleOwner lifecycleOwner, AnonymousClass709 source) {
        Companion.getClass();
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(source, "source");
        if (lifecycleOwner instanceof Activity) {
            C1DH.LIZ(lifecycleOwner, source, AnonymousClass709.class);
        } else {
            if (lifecycleOwner instanceof Fragment) {
                C55247LmF.LIZIZ(C55230Lly.LIZJ((Fragment) lifecycleOwner, null), source, AnonymousClass709.class, "source_default_key");
                return;
            }
            throw new RuntimeException("SearchContextSource not support this lifecycleOwner except Activity&Fragment");
        }
    }

    public /* synthetic */ AnonymousClass709(AnonymousClass707 anonymousClass707, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new AnonymousClass707(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null) : anonymousClass707);
    }
}
