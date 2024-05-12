package X;

import Y.ARunnableS16S0201000_13;
import Y.ARunnableS9S0101000_5;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.bytedance.pia.core.setting.Config;
import com.bytedance.pia.core.setting.Settings;
import com.bytedance.pia.core.utils.DefaultResourceLoader;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Enf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37499Enf extends C37463En5 {
    public final ConcurrentLinkedQueue<AbstractC37502Eni> LJIIZILJ;
    public volatile WeakReference<View> LJIJ;
    public final C37449Emr LJIJI;
    public final boolean LJIJJ;
    public final AtomicBoolean LJIJJLI;
    public final AtomicBoolean LJIL;
    public final AtomicBoolean LJJ;
    public final AtomicBoolean LJJI;
    public final AtomicBoolean LJJIFFI;
    public volatile BQ8 LJJII;

    public final View LJI() {
        if (this.LJIJ != null) {
            return this.LJIJ.get();
        }
        return null;
    }

    public final void LJII() {
        if (this.LJJIFFI.get()) {
            C37238EjS.LIZLLL(6, "[Runtime] call initialize after release.", null);
            return;
        }
        if (!this.LJIJJLI.compareAndSet(false, true)) {
            C37238EjS.LIZLLL(6, "[Runtime] initialize more than once!", null);
            return;
        }
        Iterator<AbstractC37502Eni> it = this.LJIIZILJ.iterator();
        while (it.hasNext()) {
            AbstractC37502Eni next = it.next();
            try {
                next.LIZIZ();
            } catch (Throwable th) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("[Runtime] ");
                LIZ.append(next.LIZ());
                LIZ.append("initialize error:");
                C37238EjS.LIZLLL(4, X1D.LIZIZ(LIZ), th);
                this.LJIIZILJ.remove(next);
            }
        }
    }

    @Override // X.C37496Enc, X.InterfaceC37489EnV
    public final void release() {
        if (!this.LJJIFFI.compareAndSet(false, true)) {
            C37238EjS.LIZLLL(6, "[Runtime] release more than once!", null);
            return;
        }
        this.LJJII.remove("ctx-pia-runtime");
        this.LJJII = null;
        super.release();
        Iterator<AbstractC37502Eni> it = this.LJIIZILJ.iterator();
        while (it.hasNext()) {
            it.next().release();
        }
        this.LJIIZILJ.clear();
        C37449Emr c37449Emr = this.LJIJI;
        c37449Emr.getClass();
        C37613EpV.LIZJ(new ARunnableS9S0101000_5(3, c37449Emr, 13));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[Runtime] release runtime. url=");
        LIZ.append(this.LJ);
        C37238EjS.LJFF(X1D.LIZIZ(LIZ));
    }

    public final boolean LJIIIZ() {
        if (Settings.LIZ().isPiaQueryDisable) {
            return !this.LJ.getBooleanQueryParameter("__pia_manifest__", false);
        }
        return this.LJ.getBooleanQueryParameter("_pia_", false);
    }

    public final AbstractC37502Eni LJFF(String str) {
        if (this.LJJIFFI.get()) {
            C37238EjS.LIZLLL(6, "[Runtime] call getPlugin after release.", null);
            return null;
        }
        if (!str.isEmpty()) {
            Object obj = get(str);
            if (obj instanceof AbstractC37502Eni) {
                return (AbstractC37502Eni) obj;
            }
        }
        return null;
    }

    public final void LJIIJ(View view) {
        if (this.LJJIFFI.get()) {
            C37238EjS.LIZLLL(6, "[Runtime] call onBindView after release.", null);
            return;
        }
        if (!this.LJIL.compareAndSet(false, true)) {
            C37238EjS.LIZLLL(6, "[Runtime] onBindView more than once!", null);
            return;
        }
        if (view instanceof WebView) {
            C37477EnJ c37477EnJ = this.LJII;
            c37477EnJ.getClass();
            C37613EpV.LIZJ(new ARunnableS16S0201000_13(0, c37477EnJ, (ViewGroup) view, 13));
        }
        this.LJIJ = new WeakReference<>(view);
        Iterator<AbstractC37502Eni> it = this.LJIIZILJ.iterator();
        while (it.hasNext()) {
            AbstractC37502Eni next = it.next();
            try {
                next.LJ(view);
            } catch (Throwable th) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("[Runtime] ");
                LIZ.append(next.LIZ());
                LIZ.append(" onBindView error:");
                C37238EjS.LIZLLL(4, X1D.LIZIZ(LIZ), th);
            }
        }
    }

    public final void LJIIIIZZ(Class<? extends AbstractC37502Eni> cls, Object obj) {
        AbstractC37502Eni newInstance;
        if (this.LJIJJLI.get()) {
            C37238EjS.LIZLLL(6, "[Runtime] can not install plugin after initialized!", null);
            return;
        }
        if (this.LJJIFFI.get()) {
            C37238EjS.LIZLLL(6, "[Runtime] call installPlugin after release.", null);
            return;
        }
        try {
            if (obj != null) {
                newInstance = cls.getConstructor(C37499Enf.class, obj.getClass()).newInstance(this, obj);
            } else {
                newInstance = cls.getConstructor(C37499Enf.class).newInstance(this);
            }
            if (get(newInstance.LIZ()) != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("[Runtime] duplicate plugin registered, name=");
                LIZ.append(newInstance.LIZ());
                C37238EjS.LJFF(X1D.LIZIZ(LIZ));
                return;
            }
            LIZ(newInstance, newInstance.LIZ());
            this.LJIIZILJ.add(newInstance);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("[Runtime] install plugin success, name=");
            LIZ2.append(newInstance.LIZ());
            C37238EjS.LJFF(X1D.LIZIZ(LIZ2));
        } catch (Throwable th) {
            C37238EjS.LIZLLL(4, "[Runtime] install plugin error:", th);
        }
    }

    public final void LJIIJJI(String str, Object... objArr) {
        if (!this.LJIJJLI.get()) {
            C37238EjS.LIZLLL(6, "[Runtime] can not send event before initialize!", null);
            return;
        }
        if (this.LJJIFFI.get()) {
            C37238EjS.LIZLLL(6, "[Runtime] can not send event after released!", null);
            return;
        }
        Iterator<AbstractC37502Eni> it = this.LJIIZILJ.iterator();
        while (it.hasNext()) {
            AbstractC37502Eni next = it.next();
            try {
                next.LJFF(str, objArr);
            } catch (Throwable th) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("[Runtime] ");
                LIZ.append(next.LIZ());
                LIZ.append(" onEvent error:");
                C37238EjS.LIZLLL(4, X1D.LIZIZ(LIZ), th);
            }
        }
    }

    public C37499Enf(android.net.Uri uri, String str, String str2, Object obj, boolean z, DefaultResourceLoader defaultResourceLoader, InterfaceC37169EiL interfaceC37169EiL, String str3, Config config, java.util.Map map, InterfaceC37524Eo4 interfaceC37524Eo4) {
        super(uri, str, str2, obj, defaultResourceLoader, interfaceC37169EiL, str3, config, map, interfaceC37524Eo4);
        this.LJIIZILJ = new ConcurrentLinkedQueue<>();
        this.LJIJ = null;
        this.LJIJI = new C37449Emr(EnumC37404Em8.Render, this, this.LJI);
        this.LJIJJLI = new AtomicBoolean(false);
        this.LJIL = new AtomicBoolean(false);
        this.LJJ = new AtomicBoolean(false);
        this.LJJI = new AtomicBoolean(false);
        this.LJJIFFI = new AtomicBoolean(false);
        this.LJJII = null;
        this.LJIJJ = z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[Runtime] created runtime. url=");
        LIZ.append(uri);
        C37238EjS.LJFF(X1D.LIZIZ(LIZ));
    }
}
