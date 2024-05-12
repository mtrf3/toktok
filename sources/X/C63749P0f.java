package X;

import com.bytedance.im.core.proto.Participant;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.P0f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63749P0f extends ProtoAdapter<Participant> {
    public final ProtoAdapter<java.util.Map<String, String>> LJ;

    public C63749P0f() {
        super(FieldEncoding.LENGTH_DELIMITED, Participant.class);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        this.LJ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Participant decode(ProtoReader protoReader) {
        C63750P0g c63750P0g = new C63750P0g();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c63750P0g.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 2:
                        c63750P0g.LJ = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 3:
                        c63750P0g.LJFF = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 4:
                        c63750P0g.LJI = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        c63750P0g.LJII = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        try {
                            c63750P0g.LJIIIIZZ = EnumC63751P0h.ADAPTER.decode(protoReader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            c63750P0g.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            break;
                        }
                    case 7:
                        c63750P0g.LJIIIZ = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 8:
                        c63750P0g.LJIIJ.putAll(this.LJ.decode(protoReader));
                        break;
                    default:
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        c63750P0g.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c63750P0g.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Participant participant) {
        Participant participant2 = participant;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(3, participant2.role) + protoAdapter.encodedSizeWithTag(2, participant2.sort_order) + protoAdapter.encodedSizeWithTag(1, participant2.user_id);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        return participant2.unknownFields().size() + this.LJ.encodedSizeWithTag(8, participant2.ext) + protoAdapter.encodedSizeWithTag(7, participant2.left_block_time) + EnumC63751P0h.ADAPTER.encodedSizeWithTag(6, participant2.blocked) + protoAdapter2.encodedSizeWithTag(5, participant2.sec_uid) + protoAdapter2.encodedSizeWithTag(4, participant2.alias) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Participant participant) {
        Participant participant2 = participant;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, participant2.user_id);
        protoAdapter.encodeWithTag(protoWriter, 2, participant2.sort_order);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, participant2.role);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 4, participant2.alias);
        protoAdapter2.encodeWithTag(protoWriter, 5, participant2.sec_uid);
        EnumC63751P0h.ADAPTER.encodeWithTag(protoWriter, 6, participant2.blocked);
        protoAdapter.encodeWithTag(protoWriter, 7, participant2.left_block_time);
        this.LJ.encodeWithTag(protoWriter, 8, participant2.ext);
        protoWriter.writeBytes(participant2.unknownFields());
    }
}
