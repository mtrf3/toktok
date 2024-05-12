package X;

import com.ss.android.ugc.aweme.relation.model.RecUser;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MjZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57629MjZ implements C33Q {
    public final C57634Mje LJLIL;
    public final HashSet<EnumC57597Mj3> LJLILLLLZI;
    public final RecUser LJLJI;
    public final AbstractC72932td<List<RecUser>> LJLJJI;
    public final boolean LJLJJL;
    public final C43I<Integer> LJLJJLL;
    public final Integer LJLJL;
    public final C43I<Boolean> LJLJLJ;
    public final C43I<String> LJLJLLL;

    public C57629MjZ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57629MjZ)) {
            return false;
        }
        C57629MjZ c57629MjZ = (C57629MjZ) obj;
        return o.LJ(this.LJLIL, c57629MjZ.LJLIL) && o.LJ(this.LJLILLLLZI, c57629MjZ.LJLILLLLZI) && o.LJ(this.LJLJI, c57629MjZ.LJLJI) && o.LJ(this.LJLJJI, c57629MjZ.LJLJJI) && this.LJLJJL == c57629MjZ.LJLJJL && o.LJ(this.LJLJJLL, c57629MjZ.LJLJJLL) && o.LJ(this.LJLJL, c57629MjZ.LJLJL) && o.LJ(this.LJLJLJ, c57629MjZ.LJLJLJ) && o.LJ(this.LJLJLLL, c57629MjZ.LJLJLLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        C57634Mje c57634Mje = this.LJLIL;
        int i = 0;
        if (c57634Mje == null) {
            hashCode = 0;
        } else {
            hashCode = c57634Mje.hashCode();
        }
        int hashCode3 = (this.LJLILLLLZI.hashCode() + (hashCode * 31)) * 31;
        RecUser recUser = this.LJLJI;
        if (recUser == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = recUser.hashCode();
        }
        int LIZ = C03090Af.LIZ(this.LJLJJI, (hashCode3 + hashCode2) * 31, 31);
        boolean z = this.LJLJJL;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int LIZIZ = C40328FsC.LIZIZ(this.LJLJJLL, (LIZ + i2) * 31, 31);
        Integer num = this.LJLJL;
        if (num != null) {
            i = num.hashCode();
        }
        return this.LJLJLLL.hashCode() + C40328FsC.LIZIZ(this.LJLJLJ, (LIZIZ + i) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecSwipeVMState(cursor=");
        LIZ.append(this.LJLIL);
        LIZ.append(", actionSet=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", currRecUser=");
        LIZ.append(this.LJLJI);
        LIZ.append(", listState=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", relationButtonsDisabled=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", deleteCardAtPosEvent=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", curPos=");
        LIZ.append(this.LJLJL);
        LIZ.append(", followOrRequestEvent=");
        LIZ.append(this.LJLJLJ);
        LIZ.append(", refreshListEvent=");
        return C61845OOz.LIZIZ(LIZ, this.LJLJLLL, ')', LIZ);
    }

    public /* synthetic */ C57629MjZ(int i) {
        this(null, new HashSet(), null, C33X.LIZ, false, new C43I(null), null, new C43I(null), new C43I(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C57629MjZ(C57634Mje c57634Mje, HashSet<EnumC57597Mj3> actionSet, RecUser recUser, AbstractC72932td<? extends List<RecUser>> listState, boolean z, C43I<Integer> deleteCardAtPosEvent, Integer num, C43I<Boolean> followOrRequestEvent, C43I<String> refreshListEvent) {
        o.LJIIIZ(actionSet, "actionSet");
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(deleteCardAtPosEvent, "deleteCardAtPosEvent");
        o.LJIIIZ(followOrRequestEvent, "followOrRequestEvent");
        o.LJIIIZ(refreshListEvent, "refreshListEvent");
        this.LJLIL = c57634Mje;
        this.LJLILLLLZI = actionSet;
        this.LJLJI = recUser;
        this.LJLJJI = listState;
        this.LJLJJL = z;
        this.LJLJJLL = deleteCardAtPosEvent;
        this.LJLJL = num;
        this.LJLJLJ = followOrRequestEvent;
        this.LJLJLLL = refreshListEvent;
    }

    public static C57629MjZ LIZ(C57629MjZ c57629MjZ, C57634Mje c57634Mje, HashSet hashSet, RecUser recUser, AbstractC72932td abstractC72932td, boolean z, C43I c43i, Integer num, C43I c43i2, C43I c43i3, int i) {
        C43I refreshListEvent = c43i3;
        C43I followOrRequestEvent = c43i2;
        Integer num2 = num;
        HashSet actionSet = hashSet;
        C57634Mje c57634Mje2 = c57634Mje;
        RecUser recUser2 = recUser;
        AbstractC72932td listState = abstractC72932td;
        boolean z2 = z;
        C43I deleteCardAtPosEvent = c43i;
        if ((i & 1) != 0) {
            c57634Mje2 = c57629MjZ.LJLIL;
        }
        if ((i & 2) != 0) {
            actionSet = c57629MjZ.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            recUser2 = c57629MjZ.LJLJI;
        }
        if ((i & 8) != 0) {
            listState = c57629MjZ.LJLJJI;
        }
        if ((i & 16) != 0) {
            z2 = c57629MjZ.LJLJJL;
        }
        if ((i & 32) != 0) {
            deleteCardAtPosEvent = c57629MjZ.LJLJJLL;
        }
        if ((i & 64) != 0) {
            num2 = c57629MjZ.LJLJL;
        }
        if ((i & 128) != 0) {
            followOrRequestEvent = c57629MjZ.LJLJLJ;
        }
        if ((i & 256) != 0) {
            refreshListEvent = c57629MjZ.LJLJLLL;
        }
        c57629MjZ.getClass();
        o.LJIIIZ(actionSet, "actionSet");
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(deleteCardAtPosEvent, "deleteCardAtPosEvent");
        o.LJIIIZ(followOrRequestEvent, "followOrRequestEvent");
        o.LJIIIZ(refreshListEvent, "refreshListEvent");
        return new C57629MjZ(c57634Mje2, actionSet, recUser2, listState, z2, deleteCardAtPosEvent, num2, followOrRequestEvent, refreshListEvent);
    }
}
