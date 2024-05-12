package X;

import com.bytedance.im.core.proto.PropertyItem;
import com.bytedance.im.core.proto.PropertyItemList;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RRA extends ProtoAdapter<PropertyItemList> {
    public RRA() {
        super(FieldEncoding.LENGTH_DELIMITED, PropertyItemList.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final PropertyItemList decode(ProtoReader protoReader) {
        RRB rrb = new RRB();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    rrb.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    rrb.LIZLLL.add(PropertyItem.ADAPTER.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rrb.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(PropertyItemList propertyItemList) {
        PropertyItemList propertyItemList2 = propertyItemList;
        return propertyItemList2.unknownFields().size() + PropertyItem.ADAPTER.asRepeated().encodedSizeWithTag(1, propertyItemList2.Items);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, PropertyItemList propertyItemList) {
        PropertyItemList propertyItemList2 = propertyItemList;
        PropertyItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, propertyItemList2.Items);
        protoWriter.writeBytes(propertyItemList2.unknownFields());
    }
}
