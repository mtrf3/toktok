package com.ss.android.ugc.aweme.discover.model;

import X.F9E;
import X.HH1;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ShowItemsStruct extends F9E implements Serializable {

    @InterfaceC65349Pkn("desc")
    public final String desc;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    @InterfaceC65349Pkn("type")
    public final String type;

    public static /* synthetic */ ShowItemsStruct copy$default(ShowItemsStruct showItemsStruct, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = showItemsStruct.desc;
        }
        if ((i & 2) != 0) {
            str2 = showItemsStruct.schema;
        }
        if ((i & 4) != 0) {
            str3 = showItemsStruct.type;
        }
        return showItemsStruct.copy(str, str2, str3);
    }

    public final ShowItemsStruct copy(String desc, String schema, String type) {
        o.LJIIIZ(desc, "desc");
        o.LJIIIZ(schema, "schema");
        o.LJIIIZ(type, "type");
        return new ShowItemsStruct(desc, schema, type);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.desc, this.schema, this.type};
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final String getType() {
        return this.type;
    }

    public ShowItemsStruct(String str, String str2, String str3) {
        HH1.LIZ(str, "desc", str2, "schema", str3, "type");
        this.desc = str;
        this.schema = str2;
        this.type = str3;
    }
}
