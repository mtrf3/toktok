package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import java.io.Serializable;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.JuK */
/* loaded from: classes9.dex */
public final class C50652JuK extends F9E implements InterfaceC55260LmS, Serializable, KK7 {
    public static final C50651JuJ Companion = new C50651JuJ();
    public final C50650JuI LJLIL;
    public final C50438Jqs LJLILLLLZI;
    public final String LJLJI;

    public C50652JuK() {
        this(null, null, 3, null);
    }

    public static final void attachSource(LifecycleOwner lifecycleOwner, C50652JuK c50652JuK) {
        Companion.getClass();
        C50651JuJ.LIZ(lifecycleOwner, c50652JuK);
    }

    public static /* synthetic */ C50652JuK copy$default(C50652JuK c50652JuK, C50650JuI c50650JuI, C50438Jqs c50438Jqs, int i, Object obj) {
        if ((i & 1) != 0) {
            c50650JuI = c50652JuK.LJLIL;
        }
        if ((i & 2) != 0) {
            c50438Jqs = c50652JuK.LJLILLLLZI;
        }
        return c50652JuK.copy(c50650JuI, c50438Jqs);
    }

    public static final C50321Joz fetchCurrentFragmentData() {
        Companion.getClass();
        return C50651JuJ.LIZIZ();
    }

    public static final C50650JuI fetchImmutableData() {
        Companion.getClass();
        return C50651JuJ.LIZJ();
    }

    public static final C50321Joz fetchOwnFragmentData(View view) {
        Companion.getClass();
        return C50651JuJ.LIZLLL(view);
    }

    public static final C50321Joz fetchOwnFragmentData(Fragment fragment) {
        Companion.getClass();
        return C50651JuJ.LJ(fragment);
    }

    public static final C50431Jql fetchOwnGlobalData(LifecycleOwner lifecycleOwner) {
        Companion.getClass();
        return C50651JuJ.LJFF(lifecycleOwner);
    }

    public static final C50650JuI fetchOwnImmutableData(InterfaceC55235Lm3 interfaceC55235Lm3) {
        Companion.getClass();
        return C50651JuJ.LJIIIIZZ(interfaceC55235Lm3);
    }

    public static final C50650JuI fetchOwnImmutableData(View view) {
        Companion.getClass();
        return C50651JuJ.LJI(view);
    }

    public static final C50650JuI fetchOwnImmutableData(LifecycleOwner lifecycleOwner) {
        Companion.getClass();
        return C50651JuJ.LJII(lifecycleOwner);
    }

    public static final C50652JuK fetchOwnSource(View view) {
        Companion.getClass();
        return C50651JuJ.LJIIIZ(view);
    }

    public static final C50652JuK fetchOwnSource(LifecycleOwner lifecycleOwner) {
        Companion.getClass();
        return C50651JuJ.LJIIJ(lifecycleOwner);
    }

    public static final C50321Joz fetchTopFragmentData(ActivityC45651qj activityC45651qj) {
        Companion.getClass();
        return C50651JuJ.LJIIJJI(activityC45651qj);
    }

    public final C50652JuK copy(C50650JuI immutableData, C50438Jqs mutableData) {
        o.LJIIIZ(immutableData, "immutableData");
        o.LJIIIZ(mutableData, "mutableData");
        return new C50652JuK(immutableData, mutableData);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    @Override // X.KK7
    public boolean isLog() {
        return true;
    }

    public void prepare() {
    }

    public final C50650JuI getImmutableData() {
        return this.LJLIL;
    }

    public final C50438Jqs getMutableData() {
        return this.LJLILLLLZI;
    }

    public String getSourceId() {
        return this.LJLJI;
    }

    public static final C50431Jql fetchOwnGlobalData(View view) {
        InterfaceC55235Lm3 LJIIL;
        InterfaceC55251LmJ LIZLLL;
        C50652JuK c50652JuK;
        C50438Jqs mutableData;
        Companion.getClass();
        if (view == null || (LJIIL = C50651JuJ.LJIIL(view)) == null || (LIZLLL = C55247LmF.LIZLLL(LJIIL, C50652JuK.class, "source_default_key")) == null || (c50652JuK = (C50652JuK) LIZLLL.getSource()) == null || (mutableData = c50652JuK.getMutableData()) == null) {
            return null;
        }
        return mutableData.getGlobalData();
    }

    public static final C50431Jql fetchOwnGlobalData(InterfaceC55235Lm3 interfaceC55235Lm3) {
        InterfaceC55251LmJ LIZLLL;
        C50652JuK c50652JuK;
        C50438Jqs mutableData;
        Companion.getClass();
        if (interfaceC55235Lm3 == null || (LIZLLL = C55247LmF.LIZLLL(interfaceC55235Lm3, C50652JuK.class, "source_default_key")) == null || (c50652JuK = (C50652JuK) LIZLLL.getSource()) == null || (mutableData = c50652JuK.getMutableData()) == null) {
            return null;
        }
        return mutableData.getGlobalData();
    }

    public C50652JuK(C50650JuI immutableData, C50438Jqs mutableData) {
        o.LJIIIZ(immutableData, "immutableData");
        o.LJIIIZ(mutableData, "mutableData");
        this.LJLIL = immutableData;
        this.LJLILLLLZI = mutableData;
        this.LJLJI = AnonymousClass629.LIZ("randomUUID().toString()");
    }

    public static final void updateContextSource(LifecycleOwner lifecycleOwner, InterfaceC88472Yns<? super C50652JuK, C50652JuK> update) {
        Companion.getClass();
        o.LJIIIZ(update, "update");
        if (lifecycleOwner != null) {
            C85855Xml.LIZJ(lifecycleOwner, C50652JuK.class, new AqS174S0100000_8(update, (InterfaceC88472Yns<? super C50652JuK, C50652JuK>) 159));
        }
    }

    public /* synthetic */ C50652JuK(C50650JuI c50650JuI, C50438Jqs c50438Jqs, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C50650JuI(null, null, null, null, null, null, null, 127, null) : c50650JuI, (i & 2) != 0 ? new C50438Jqs(null, null, 3, null) : c50438Jqs);
    }
}
