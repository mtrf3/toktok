package X;

import com.bytedance.im.core.proto.PropertyItem;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes17.dex */
public final class YYN extends ProtoAdapter<PropertyItem> {
    public YYN() {
        super(FieldEncoding.LENGTH_DELIMITED, PropertyItem.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final PropertyItem decode(ProtoReader protoReader) {
        YYO yyo = new YYO();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        yyo.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 2:
                        yyo.LJ = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 3:
                        yyo.LJFF = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 4:
                        yyo.LJI = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        yyo.LJII = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        yyo.LJIIIIZZ = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    default:
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        yyo.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return yyo.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(PropertyItem propertyItem) {
        PropertyItem propertyItem2 = propertyItem;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, propertyItem2.uid);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        return propertyItem2.unknownFields().size() + protoAdapter.encodedSizeWithTag(6, propertyItem2.create_time_micro) + protoAdapter2.encodedSizeWithTag(5, propertyItem2.value) + protoAdapter2.encodedSizeWithTag(4, propertyItem2.idempotent_id) + protoAdapter.encodedSizeWithTag(3, propertyItem2.create_time) + protoAdapter2.encodedSizeWithTag(2, propertyItem2.sec_uid) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, PropertyItem propertyItem) {
        PropertyItem propertyItem2 = propertyItem;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, propertyItem2.uid);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 2, propertyItem2.sec_uid);
        protoAdapter.encodeWithTag(protoWriter, 3, propertyItem2.create_time);
        protoAdapter2.encodeWithTag(protoWriter, 4, propertyItem2.idempotent_id);
        protoAdapter2.encodeWithTag(protoWriter, 5, propertyItem2.value);
        protoAdapter.encodeWithTag(protoWriter, 6, propertyItem2.create_time_micro);
        protoWriter.writeBytes(propertyItem2.unknownFields());
    }
}
