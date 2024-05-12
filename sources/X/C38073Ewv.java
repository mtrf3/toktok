package X;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.Ewv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38073Ewv {
    public final java.util.Set<String> LIZ;
    public final java.util.Set<String> LIZIZ;
    public final C38065Ewn LIZJ = C38113ExZ.LJI.LIZ();
    public final C38072Ewu LIZLLL;

    public C38073Ewv(C38072Ewu c38072Ewu, java.util.Set<String> set, java.util.Set<String> set2) {
        this.LIZLLL = c38072Ewu;
        this.LIZ = new LinkedHashSet(set);
        this.LIZIZ = new LinkedHashSet(set2);
    }

    public final synchronized EnumC38078Ex0 LIZ(AbstractC38082Ex4 abstractC38082Ex4, C37960Ev6 c37960Ev6, String str, List list) {
        if (this.LIZLLL == null) {
            C38185Eyj c38185Eyj = new C38185Eyj();
            c38185Eyj.LIZJ("null", "call_permission_group");
            c38185Eyj.LIZJ("null", "config");
            c38185Eyj.LIZ("label_permission_checker_null_config", list);
            if (c37960Ev6 != null) {
                c37960Ev6.LIZJ(2);
            }
            return null;
        }
        C38065Ewn c38065Ewn = this.LIZJ;
        if (c38065Ewn != null) {
            C38061Ewj c38061Ewj = C38113ExZ.LJIIJ;
            if ((c38061Ewj.LIZ() == null || !c38061Ewj.LIZ().LIZ(EnumC35578Dxm.PERMISSION_CONFIG_DEFAULT_FETCHED)) && !c38065Ewn.LJII) {
                C38185Eyj c38185Eyj2 = new C38185Eyj();
                c38185Eyj2.LIZJ("false", "config_repository_fetched");
                c38185Eyj2.LIZ("label_permission_checker_fetch", list);
                throw new C38077Ewz("Permission configuration has not been fetched");
            }
        }
        C38076Ewy LIZIZ = this.LIZLLL.LIZIZ(str, list, c37960Ev6);
        if (((HashSet) LIZIZ.LIZJ).contains(abstractC38082Ex4.getName())) {
            if (c37960Ev6 != null) {
                c37960Ev6.LIZJ(1);
            }
            return null;
        }
        if (((HashSet) LIZIZ.LIZIZ).contains(abstractC38082Ex4.getName())) {
            return EnumC38078Ex0.PRIVATE;
        }
        if (LIZIZ.LIZ.compareTo(abstractC38082Ex4.getPermissionGroup()) < 0) {
            return null;
        }
        return LIZIZ.LIZ;
    }
}
