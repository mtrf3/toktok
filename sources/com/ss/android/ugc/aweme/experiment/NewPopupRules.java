package com.ss.android.ugc.aweme.experiment;

import X.C47261Igj;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class NewPopupRules extends F9E {

    @InterfaceC65349Pkn("frequency")
    public final int frequency;

    @InterfaceC65349Pkn("group")
    public final int group;

    @InterfaceC65349Pkn("interval")
    public final List<Integer> interval;

    @InterfaceC65349Pkn("rules")
    public final List<List<Integer>> rules;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NewPopupRules() {
        /*
            r7 = this;
            r1 = 0
            r3 = 0
            r5 = 15
            r0 = r7
            r2 = r1
            r4 = r3
            r6 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.experiment.NewPopupRules.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.group), Integer.valueOf(this.frequency), this.interval, this.rules};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NewPopupRules(int i, int i2, List<Integer> interval, List<? extends List<Integer>> rules) {
        o.LJIIIZ(interval, "interval");
        o.LJIIIZ(rules, "rules");
        this.group = i;
        this.frequency = i2;
        this.interval = interval;
        this.rules = rules;
    }

    public /* synthetic */ NewPopupRules(int i, int i2, List list, List list2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? C47261Igj.LJJIJIIJI(15, 8, 3) : list, (i3 & 8) != 0 ? C47261Igj.LJJIJIIJI(C47261Igj.LJJIJ(3), C47261Igj.LJJIJIIJI(2, 3), C47261Igj.LJJIJIIJI(1, 2, 3)) : list2);
    }
}
