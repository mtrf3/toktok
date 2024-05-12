package X;

import com.bytedance.im.core.proto.NewDirectPushNotify;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.Ozp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63733Ozp extends ProtoAdapter<NewDirectPushNotify> {
    public final ProtoAdapter<java.util.Map<String, String>> LJ;

    public C63733Ozp() {
        super(FieldEncoding.LENGTH_DELIMITED, NewDirectPushNotify.class);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        this.LJ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final NewDirectPushNotify decode(ProtoReader protoReader) {
        C63734Ozq c63734Ozq = new C63734Ozq();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        try {
                            c63734Ozq.LIZLLL = EnumC63735Ozr.ADAPTER.decode(protoReader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            c63734Ozq.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            break;
                        }
                    case 2:
                        c63734Ozq.LJ = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 3:
                        c63734Ozq.LJFF = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 4:
                        c63734Ozq.LJI = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        c63734Ozq.LJII = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 6:
                        c63734Ozq.LJIIIIZZ = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 7:
                        c63734Ozq.LJIIIZ = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 8:
                        c63734Ozq.LJIIJ = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 9:
                        c63734Ozq.LJIIJJI.putAll(this.LJ.decode(protoReader));
                        break;
                    case 10:
                        c63734Ozq.LJIIL = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    default:
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        c63734Ozq.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c63734Ozq.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(NewDirectPushNotify newDirectPushNotify) {
        NewDirectPushNotify newDirectPushNotify2 = newDirectPushNotify;
        int encodedSizeWithTag = EnumC63735Ozr.ADAPTER.encodedSizeWithTag(1, newDirectPushNotify2.send_type);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(2, newDirectPushNotify2.sender) + encodedSizeWithTag;
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        int encodedSizeWithTag3 = protoAdapter.encodedSizeWithTag(5, newDirectPushNotify2.conversation_short_id) + protoAdapter2.encodedSizeWithTag(4, newDirectPushNotify2.conversation_id) + protoAdapter2.encodedSizeWithTag(3, newDirectPushNotify2.sec_sender) + encodedSizeWithTag2;
        ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
        return newDirectPushNotify2.unknownFields().size() + protoAdapter.encodedSizeWithTag(10, newDirectPushNotify2.create_time) + this.LJ.encodedSizeWithTag(9, newDirectPushNotify2.ext) + protoAdapter2.encodedSizeWithTag(8, newDirectPushNotify2.content) + protoAdapter3.encodedSizeWithTag(7, newDirectPushNotify2.message_type) + protoAdapter3.encodedSizeWithTag(6, newDirectPushNotify2.conversation_type) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, NewDirectPushNotify newDirectPushNotify) {
        NewDirectPushNotify newDirectPushNotify2 = newDirectPushNotify;
        EnumC63735Ozr.ADAPTER.encodeWithTag(protoWriter, 1, newDirectPushNotify2.send_type);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 2, newDirectPushNotify2.sender);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 3, newDirectPushNotify2.sec_sender);
        protoAdapter2.encodeWithTag(protoWriter, 4, newDirectPushNotify2.conversation_id);
        protoAdapter.encodeWithTag(protoWriter, 5, newDirectPushNotify2.conversation_short_id);
        ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
        protoAdapter3.encodeWithTag(protoWriter, 6, newDirectPushNotify2.conversation_type);
        protoAdapter3.encodeWithTag(protoWriter, 7, newDirectPushNotify2.message_type);
        protoAdapter2.encodeWithTag(protoWriter, 8, newDirectPushNotify2.content);
        this.LJ.encodeWithTag(protoWriter, 9, newDirectPushNotify2.ext);
        protoAdapter.encodeWithTag(protoWriter, 10, newDirectPushNotify2.create_time);
        protoWriter.writeBytes(newDirectPushNotify2.unknownFields());
    }
}
