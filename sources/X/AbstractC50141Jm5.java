package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.ComponentInfo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Jm5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50141Jm5 implements InterfaceC50155JmJ {
    public ComponentInfo LIZ;
    public final ViewGroup LIZIZ;
    public final java.util.Map<String, InterfaceC50155JmJ> LIZJ;
    public View LIZLLL;
    public boolean LJ;

    public abstract boolean LIZLLL(ComponentInfo componentInfo);

    public abstract InterfaceC50155JmJ LJ(ViewGroup viewGroup, ComponentInfo componentInfo);

    public abstract int LJFF();

    public abstract void LJI(ComponentInfo componentInfo);

    @Override // X.InterfaceC50155JmJ
    public final void LJJIIJZLJL() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("component:");
        LIZ.append(this);
        LIZ.append(" detach");
        C49133JQb.LIZ("AbsComponentNode", X1D.LIZIZ(LIZ));
        View view = this.LIZLLL;
        ViewParent viewParent = null;
        if (view != null) {
            viewParent = view.getParent();
        }
        if ((viewParent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) viewParent) != null) {
            C16880lQ.LJLLL(this.LIZLLL, viewGroup2);
        }
        View view2 = this.LIZLLL;
        if ((view2 instanceof ViewGroup) && (viewGroup = (ViewGroup) view2) != null) {
            viewGroup.removeAllViews();
        }
        Iterator it = ((LinkedHashMap) this.LIZJ).entrySet().iterator();
        while (it.hasNext()) {
            ((InterfaceC50155JmJ) ((Map.Entry) it.next()).getValue()).LJJIIJZLJL();
        }
    }

    @Override // X.InterfaceC50155JmJ
    public void init() {
        List<ComponentInfo> list;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("component:");
        LIZ.append(this);
        LIZ.append(" init");
        C49133JQb.LIZ("AbsComponentNode", X1D.LIZIZ(LIZ));
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LIZIZ.getContext()), LJFF(), this.LIZIZ, false);
        this.LIZLLL = LLLLIILL;
        if ((LLLLIILL instanceof ViewGroup) && (list = this.LIZ.components) != null) {
            for (ComponentInfo componentInfo : list) {
                InterfaceC50155JmJ LJ = LJ((ViewGroup) LLLLIILL, componentInfo);
                if (LJ != null) {
                    this.LIZJ.put(componentInfo.type, LJ);
                    LJ.init();
                }
            }
        }
        this.LJ = true;
    }

    @Override // X.InterfaceC50155JmJ
    public final boolean LIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC50155JmJ
    public final ComponentInfo LIZJ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC50155JmJ
    public final java.util.Map<String, InterfaceC50155JmJ> getChildNodes() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC50155JmJ
    public final View getContentView() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC50155JmJ
    public final void LIZIZ(ComponentInfo componentInfo) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("component:");
        LIZ.append(this);
        LIZ.append(" update");
        X1D.LIZIZ(LIZ);
        View view = this.LIZLLL;
        if (view != null) {
            if (view instanceof ViewGroup) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                List<ComponentInfo> list = componentInfo.components;
                if (list != null) {
                    for (ComponentInfo componentInfo2 : list) {
                        InterfaceC50155JmJ interfaceC50155JmJ = (InterfaceC50155JmJ) ((LinkedHashMap) this.LIZJ).get(componentInfo2.type);
                        if (interfaceC50155JmJ != null || (interfaceC50155JmJ = LJ((ViewGroup) view, componentInfo2)) != null) {
                            if (interfaceC50155JmJ.LIZ()) {
                                interfaceC50155JmJ.LIZIZ(componentInfo2);
                            } else {
                                interfaceC50155JmJ.init();
                            }
                            linkedHashMap.put(componentInfo2.type, interfaceC50155JmJ);
                        }
                    }
                }
                for (Map.Entry entry : ((LinkedHashMap) this.LIZJ).entrySet()) {
                    if (!linkedHashMap.containsKey(entry.getKey())) {
                        ((InterfaceC50155JmJ) entry.getValue()).LJJIIJZLJL();
                    }
                }
                ((LinkedHashMap) this.LIZJ).clear();
                this.LIZJ.putAll(linkedHashMap);
            }
            if (LIZLLL(componentInfo)) {
                this.LIZ = componentInfo;
                LJI(componentInfo);
                return;
            }
            return;
        }
        "component should call init(parentView: ViewGroup) method first".toString();
        throw new IllegalStateException("component should call init(parentView: ViewGroup) method first");
    }

    public AbstractC50141Jm5(ViewGroup parentView, ComponentInfo componentInfo) {
        o.LJIIIZ(componentInfo, "componentInfo");
        o.LJIIIZ(parentView, "parentView");
        this.LIZ = componentInfo;
        this.LIZIZ = parentView;
        this.LIZJ = new LinkedHashMap();
    }
}
