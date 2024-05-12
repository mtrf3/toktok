package X;

import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.EpC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37594EpC<INPUT extends XBaseParamModel, OUTPUT extends XBaseResultModel> implements InterfaceC37666EqM {
    public InterfaceC38263Ezz LJLIL;

    public boolean LJFF() {
        return false;
    }

    public abstract void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE enumC37844EtE);

    @Override // X.InterfaceC37666EqM
    public void release() {
    }

    @Override // X.InterfaceC37666EqM
    public final EnumC37643Epz LIZ() {
        return EnumC37643Epz.InCompatible;
    }

    @Override // X.InterfaceC37666EqM
    public EnumC38004Evo getAccess() {
        return EnumC38004Evo.PRIVATE;
    }

    @Override // X.InterfaceC37666EqM
    public final void LIZJ(InterfaceC38263Ezz interfaceC38263Ezz) {
        this.LJLIL = interfaceC38263Ezz;
    }

    public final String LJ(EnumC37844EtE type) {
        View view;
        View view2;
        o.LJIIJ(type, "type");
        if (type == EnumC37844EtE.LYNX) {
            InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
            if (interfaceC38263Ezz != null) {
                view2 = interfaceC38263Ezz.getView();
            } else {
                view2 = null;
            }
            if (!(view2 instanceof VNS)) {
                view2 = null;
            }
            VNS vns = (VNS) view2;
            if (vns == null) {
                return null;
            }
            return vns.getTemplateUrl();
        }
        InterfaceC38263Ezz interfaceC38263Ezz2 = this.LJLIL;
        if (interfaceC38263Ezz2 != null) {
            view = interfaceC38263Ezz2.getView();
        } else {
            view = null;
        }
        if (!(view instanceof WebView)) {
            view = null;
        }
        WebView webView = (WebView) view;
        if (webView == null) {
            return null;
        }
        return webView.getUrl();
    }

    @Override // X.InterfaceC37666EqM
    public final void LIZIZ(java.util.Map<String, ? extends Object> map, EX0 ex0, EnumC37844EtE type) {
        Class<?> cls;
        C37904EuC c37904EuC;
        C37904EuC c37904EuC2;
        String LIZIZ;
        C36562EWo LIZ;
        ConcurrentHashMap<Class<? extends InterfaceC37666EqM>, C36550EWc> concurrentHashMap;
        C36550EWc c36550EWc;
        o.LJIIJ(type, "type");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null && (LIZIZ = interfaceC38263Ezz.LIZIZ()) != null && (LIZ = C36551EWd.LIZ(LIZIZ)) != null && (concurrentHashMap = LIZ.LIZJ) != null && (c36550EWc = concurrentHashMap.get(getClass())) != null) {
            cls = c36550EWc.LJLIL;
        } else {
            cls = null;
        }
        if (cls == null) {
            System.out.println((Object) "idl Map->Model. no cache");
            Class<?>[] declaredClasses = getClass().getDeclaredClasses();
            o.LJFF(declaredClasses, "this.javaClass.declaredClasses");
            ArrayList arrayList = new ArrayList();
            for (Class<?> cls2 : declaredClasses) {
                if (cls2.getAnnotation(InterfaceC31169CLd.class) != null) {
                    arrayList.add(cls2);
                }
            }
            if (arrayList.isEmpty()) {
                Class<? super Object> superclass = getClass().getSuperclass();
                o.LJFF(superclass, "this.javaClass.superclass");
                Class<?>[] declaredClasses2 = superclass.getDeclaredClasses();
                o.LJFF(declaredClasses2, "this.javaClass.superclass.declaredClasses");
                arrayList = new ArrayList();
                for (Class<?> cls3 : declaredClasses2) {
                    if (cls3.getAnnotation(InterfaceC31169CLd.class) != null) {
                        arrayList.add(cls3);
                    }
                }
                if (arrayList.isEmpty()) {
                    throw new IllegalStateException("Illegal class format, no param model is defined in class");
                }
            }
            cls = (Class) ORZ.LJLLJ(arrayList);
            if (cls == null) {
                throw new IllegalStateException("params class is null");
            }
        }
        Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C36549EWb(this, map));
        if (newProxyInstance != null) {
            XBaseParamModel xBaseParamModel = (XBaseParamModel) newProxyInstance;
            if (getClass().getClassLoader() != null) {
                C37356ElM c37356ElM = new C37356ElM(this, ex0);
                InterfaceC38263Ezz interfaceC38263Ezz2 = this.LJLIL;
                if (interfaceC38263Ezz2 != null && (c37904EuC2 = (C37904EuC) interfaceC38263Ezz2.LJ(C37904EuC.class)) != null) {
                    c37904EuC2.LIZJ.LJIIIIZZ(c37904EuC2, null);
                }
                LJI(xBaseParamModel, c37356ElM, type);
                InterfaceC38263Ezz interfaceC38263Ezz3 = this.LJLIL;
                if (interfaceC38263Ezz3 != null && (c37904EuC = (C37904EuC) interfaceC38263Ezz3.LJ(C37904EuC.class)) != null) {
                    c37904EuC.LIZJ.LJII(c37904EuC, null);
                    return;
                }
                return;
            }
            o.LJIIZILJ();
            throw null;
        }
        throw new C37692Eqm("null cannot be cast to non-null type INPUT");
    }
}
