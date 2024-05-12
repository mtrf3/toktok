package com.ss.android.ugc.aweme.experiment;

import X.C47261Igj;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class PopupRules extends F9E {

    @InterfaceC65349Pkn("frequency")
    public final int freq;

    @InterfaceC65349Pkn("group")
    public final int group;

    @InterfaceC65349Pkn("interval")
    public final int interval;

    @InterfaceC65349Pkn("rules")
    public final List<Rules> rules;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PopupRules() {
        /*
            r7 = this;
            r1 = 0
            r2 = 0
            r5 = 15
            r0 = r7
            r3 = r2
            r4 = r2
            r6 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.experiment.PopupRules.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.rules, Integer.valueOf(this.interval), Integer.valueOf(this.freq), Integer.valueOf(this.group)};
    }

    public PopupRules(List<Rules> rules, int i, int i2, int i3) {
        o.LJIIIZ(rules, "rules");
        this.rules = rules;
        this.interval = i;
        this.freq = i2;
        this.group = i3;
    }

    public /* synthetic */ PopupRules(List list, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? C47261Igj.LJJIJIIJI(new Rules(C47261Igj.LJJIJ(1), C47261Igj.LJJIJ(0)), new Rules(C47261Igj.LJJIJIIJI(2, 1), C47261Igj.LJJIJIIJI(3, 0)), new Rules(C47261Igj.LJJIJIIJI(3, 2, 1), C47261Igj.LJJIJIIJI(3, 3, 0)), new Rules(C47261Igj.LJJIJIIJI(3, 2, 1), C47261Igj.LJJIJIIJI(4, 4, 0))) : list, (i4 & 2) != 0 ? 7 : i, (i4 & 4) != 0 ? 4 : i2, (i4 & 8) != 0 ? 4 : i3);
    }
}
