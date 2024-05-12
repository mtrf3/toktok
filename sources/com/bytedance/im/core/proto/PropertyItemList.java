package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RRA;
import X.RRB;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class PropertyItemList extends Message<PropertyItemList, RRB> {
    public static final ProtoAdapter<PropertyItemList> ADAPTER = new RRA();
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("Items")
    public final List<PropertyItem> Items;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<PropertyItemList, RRB> newBuilder2() {
        RRB rrb = new RRB();
        rrb.LIZLLL = C63685Oz3.LIZJ("Items", this.Items);
        rrb.addUnknownFields(unknownFields());
        return rrb;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<PropertyItem> list = this.Items;
        if (list != null && !list.isEmpty()) {
            sb.append(", Items=");
            sb.append(this.Items);
        }
        return DIX.LIZLLL(sb, 0, 2, "PropertyItemList{", '}');
    }

    public PropertyItemList(List<PropertyItem> list) {
        this(list, C64537PUn.EMPTY);
    }

    public PropertyItemList(List<PropertyItem> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.Items = C63685Oz3.LJFF("Items", list);
    }
}
