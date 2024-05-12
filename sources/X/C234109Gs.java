package X;

import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* renamed from: X.9Gs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C234109Gs {
    public final String LIZ;
    public final InterfaceC65350Pko<? extends UIContentAssem> LIZIZ;
    public final View LIZJ;
    public final Integer LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C234109Gs)) {
            return false;
        }
        C234109Gs c234109Gs = (C234109Gs) obj;
        return o.LJ(this.LIZ, c234109Gs.LIZ) && o.LJ(this.LIZIZ, c234109Gs.LIZIZ) && o.LJ(this.LIZJ, c234109Gs.LIZJ) && o.LJ(this.LIZLLL, c234109Gs.LIZLLL);
    }

    public final int hashCode() {
        int hashCode = (this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31;
        View view = this.LIZJ;
        int hashCode2 = (hashCode + (view == null ? 0 : view.hashCode())) * 31;
        Integer num = this.LIZLLL;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProfileAssembleComponentInfo(componentId=");
        LIZ.append(this.LIZ);
        LIZ.append(", component=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", view=");
        LIZ.append(this.LIZJ);
        LIZ.append(", forceFixedIndex=");
        return s0.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C234109Gs(String componentId, C65776Prg c65776Prg, View view, Integer num) {
        o.LJIIIZ(componentId, "componentId");
        this.LIZ = componentId;
        this.LIZIZ = c65776Prg;
        this.LIZJ = view;
        this.LIZLLL = num;
    }
}
