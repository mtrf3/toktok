package X;

import android.view.View;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.0lg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17040lg implements Serializable, Cloneable {
    public static final C17020le Companion = new Object() { // from class: X.0le
    };
    public static final long serialVersionUID = 1;
    public final WeakReference<View> LJLIL;
    public final AbstractC13940gg LJLILLLLZI;
    public final EnumC13960gi LJLJI;
    public boolean LJLJJI;
    public int LJLJJL;
    public Integer LJLJJLL;

    public final String getBTM_CD() {
        String invoke = this.LJLILLLLZI.LIZJ().invoke();
        if (invoke == null) {
            return "def";
        }
        return invoke;
    }

    public final String getEventName() {
        InterfaceC65784Pro<String> LIZ = this.LJLILLLLZI.LIZ();
        if (LIZ != null) {
            return LIZ.invoke();
        }
        return null;
    }

    public final int getExposePeriodSpecification() {
        return this.LJLILLLLZI.LIZIZ();
    }

    public final InterfaceC19520pg getOnDismissCallback() {
        return this.LJLILLLLZI.LIZLLL();
    }

    public final InterfaceC19530ph getOnExposeCallback() {
        return this.LJLILLLLZI.LJ();
    }

    public final java.util.Map<String, String> getParams() {
        java.util.Map<String, String> LJFF = this.LJLILLLLZI.LJFF();
        if (LJFF == null) {
            return new HashMap();
        }
        return LJFF;
    }

    public final boolean getRepeatedInsidePage() {
        return this.LJLILLLLZI.LJI();
    }

    public final boolean getRepeatedWhenBack() {
        return this.LJLILLLLZI.LJII();
    }

    public final float getVisiblePercent() {
        return this.LJLILLLLZI.LJIIIZ();
    }

    public int hashCode() {
        return this.LJLIL.hashCode();
    }

    public final boolean isCommon() {
        return this.LJLILLLLZI.LJIIJ();
    }

    public Object clone() {
        return super.clone();
    }

    public final int getActivityID() {
        return this.LJLJJL;
    }

    public final Integer getDialogTag$btm_release() {
        return this.LJLJJLL;
    }

    public final boolean getLastShowState() {
        return this.LJLJJI;
    }

    public final EnumC13960gi getStrategy() {
        return this.LJLJI;
    }

    public final WeakReference<View> getViewRef() {
        return this.LJLIL;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C17040lg) || this.LJLIL.get() != ((C17040lg) obj).LJLIL.get()) {
            return false;
        }
        return true;
    }

    public final void setActivityID(int i) {
        this.LJLJJL = i;
    }

    public final void setDialogTag$btm_release(Integer num) {
        this.LJLJJLL = num;
    }

    public final void setLastShowState(boolean z) {
        this.LJLJJI = z;
    }

    public C17040lg(WeakReference<View> viewRef, AbstractC13940gg provider) {
        o.LJIIIZ(viewRef, "viewRef");
        o.LJIIIZ(provider, "provider");
        this.LJLIL = viewRef;
        this.LJLILLLLZI = provider;
        this.LJLJI = provider.LJIIIIZZ();
    }
}
