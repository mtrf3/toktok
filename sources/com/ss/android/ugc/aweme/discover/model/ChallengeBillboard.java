package com.ss.android.ugc.aweme.discover.model;

import X.F9E;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ChallengeBillboard extends F9E implements Serializable {
    public int rank;
    public String schema;
    public int version;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ChallengeBillboard() {
        /*
            r6 = this;
            r1 = 0
            r3 = 0
            r4 = 7
            r0 = r6
            r2 = r1
            r5 = r3
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.model.ChallengeBillboard.<init>():void");
    }

    public static /* synthetic */ ChallengeBillboard copy$default(ChallengeBillboard challengeBillboard, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = challengeBillboard.rank;
        }
        if ((i3 & 2) != 0) {
            i2 = challengeBillboard.version;
        }
        if ((i3 & 4) != 0) {
            str = challengeBillboard.schema;
        }
        return challengeBillboard.copy(i, i2, str);
    }

    public final ChallengeBillboard copy(int i, int i2, String schema) {
        o.LJIIIZ(schema, "schema");
        return new ChallengeBillboard(i, i2, schema);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.rank), Integer.valueOf(this.version), this.schema};
    }

    public final int getRank() {
        return this.rank;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final int getVersion() {
        return this.version;
    }

    public final void setRank(int i) {
        this.rank = i;
    }

    public final void setSchema(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.schema = str;
    }

    public final void setVersion(int i) {
        this.version = i;
    }

    public ChallengeBillboard(int i, int i2, String schema) {
        o.LJIIIZ(schema, "schema");
        this.rank = i;
        this.version = i2;
        this.schema = schema;
    }

    public /* synthetic */ ChallengeBillboard(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? "" : str);
    }
}
