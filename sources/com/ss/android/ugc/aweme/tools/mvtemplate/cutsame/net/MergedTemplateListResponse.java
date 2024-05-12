package com.ss.android.ugc.aweme.tools.mvtemplate.cutsame.net;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class MergedTemplateListResponse extends F9E {

    @InterfaceC65349Pkn("next_cursor")
    public final long cursor;

    @InterfaceC65349Pkn("has_more")
    public final int hasMore;

    @InterfaceC65349Pkn("template_list")
    public final ArrayList<UlikeMergedTemplateStruct> templateList;

    @InterfaceC65349Pkn("total")
    public final int total;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MergedTemplateListResponse() {
        /*
            r8 = this;
            r1 = 0
            r2 = 0
            r4 = 0
            r6 = 15
            r0 = r8
            r5 = r4
            r7 = r1
            r0.<init>(r1, r2, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.mvtemplate.cutsame.net.MergedTemplateListResponse.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.templateList, Long.valueOf(this.cursor), Integer.valueOf(this.hasMore), Integer.valueOf(this.total)};
    }

    public MergedTemplateListResponse(ArrayList<UlikeMergedTemplateStruct> templateList, long j, int i, int i2) {
        o.LJIIIZ(templateList, "templateList");
        this.templateList = templateList;
        this.cursor = j;
        this.hasMore = i;
        this.total = i2;
    }

    public /* synthetic */ MergedTemplateListResponse(ArrayList arrayList, long j, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? new ArrayList() : arrayList, (i3 & 2) != 0 ? -1L : j, (i3 & 4) != 0 ? -1 : i, (i3 & 8) != 0 ? -1 : i2);
    }
}
