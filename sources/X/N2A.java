package X;

import android.graphics.drawable.Icon;
import defpackage.s0;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N2A {
    public final String LIZ;
    public final String LIZIZ;
    public final Icon LIZJ;
    public final List<String> LIZLLL;
    public final int LJ;
    public final boolean LJFF;
    public final Integer LJI;
    public final String LJII;

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Shortcut(label='");
        LIZ.append(this.LIZ);
        LIZ.append("', shortcutId='");
        LIZ.append(this.LIZIZ);
        LIZ.append("', urls=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", action=");
        LIZ.append(this.LJII);
        LIZ.append(", priority=");
        LIZ.append(this.LJ);
        LIZ.append(", preferRank=");
        return s0.LIZJ(LIZ, this.LJI, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!o.LJ(N2A.class, cls)) {
            return false;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.launcher.service.shortcut.Shortcut");
        if (o.LJ(this.LIZIZ, ((N2A) obj).LIZIZ)) {
            return true;
        }
        return false;
    }

    public /* synthetic */ N2A(N2B n2b, String str, Icon icon, List list, Integer num) {
        this(n2b, str, icon, list, num, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public N2A(N2B shortcutType, String str, Icon icon, List<String> list, Integer num, String str2) {
        this(shortcutType, str, icon, list, true, num, str2);
        o.LJIIIZ(shortcutType, "shortcutType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public N2A(N2B shortcutType, String str, Icon icon, List<String> list, boolean z, Integer num, String str2) {
        this(str, shortcutType.getShortcutId(), icon, list, shortcutType.getShortcutPriority(), z, num, str2);
        o.LJIIIZ(shortcutType, "shortcutType");
    }

    public N2A(String shortcutLabel, String shortcutId, Icon icon, List<String> list, int i, boolean z, Integer num, String str) {
        o.LJIIIZ(shortcutLabel, "shortcutLabel");
        o.LJIIIZ(shortcutId, "shortcutId");
        this.LIZ = shortcutLabel;
        this.LIZIZ = shortcutId;
        this.LIZJ = icon;
        this.LIZLLL = list;
        this.LJ = i;
        this.LJFF = z;
        this.LJI = num;
        this.LJII = str;
    }
}
