package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes14.dex */
public final class V4F extends ProtoAdapter<C79129V3t> {
    public V4F() {
        super(FieldEncoding.LENGTH_DELIMITED, C79129V3t.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C79129V3t decode(ProtoReader protoReader) {
        V36 v36 = new V36();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        v36.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 2:
                        v36.LJ = RUF.ADAPTER.decode(protoReader);
                        break;
                    case 3:
                        v36.LJFF = RUF.ADAPTER.decode(protoReader);
                        break;
                    case 4:
                        v36.LJI = C79135V3z.ADAPTER.decode(protoReader);
                        break;
                    case 5:
                        v36.LJII = C63714OzW.ADAPTER.decode(protoReader);
                        break;
                    case 6:
                        v36.LJIIIIZZ = RUF.ADAPTER.decode(protoReader);
                        break;
                    case 7:
                        v36.LJIIIZ = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 8:
                        v36.LJIIJ = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    default:
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        v36.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return v36.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C79129V3t c79129V3t) {
        C79129V3t c79129V3t2 = c79129V3t;
        int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, c79129V3t2.user_id);
        ProtoAdapter<RUF> protoAdapter = RUF.ADAPTER;
        return c79129V3t2.unknownFields().size() + ProtoAdapter.BOOL.encodedSizeWithTag(8, c79129V3t2.is_verify) + ProtoAdapter.INT32.encodedSizeWithTag(7, c79129V3t2.follower_count) + protoAdapter.encodedSizeWithTag(6, c79129V3t2.username) + C63714OzW.ADAPTER.encodedSizeWithTag(5, c79129V3t2.link_info) + C79135V3z.ADAPTER.encodedSizeWithTag(4, c79129V3t2.avatar) + protoAdapter.encodedSizeWithTag(3, c79129V3t2.description) + protoAdapter.encodedSizeWithTag(2, c79129V3t2.nickname) + encodedSizeWithTag;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.squareup.wire.Message$Builder, X.V36] */
    @Override // com.squareup.wire.ProtoAdapter
    public final C79129V3t redact(C79129V3t c79129V3t) {
        ?? newBuilder2 = c79129V3t.newBuilder2();
        RUF ruf = newBuilder2.LJ;
        if (ruf != null) {
            newBuilder2.LJ = RUF.ADAPTER.redact(ruf);
        }
        RUF ruf2 = newBuilder2.LJFF;
        if (ruf2 != null) {
            newBuilder2.LJFF = RUF.ADAPTER.redact(ruf2);
        }
        C79135V3z c79135V3z = newBuilder2.LJI;
        if (c79135V3z != null) {
            newBuilder2.LJI = C79135V3z.ADAPTER.redact(c79135V3z);
        }
        C63714OzW c63714OzW = newBuilder2.LJII;
        if (c63714OzW != null) {
            newBuilder2.LJII = C63714OzW.ADAPTER.redact(c63714OzW);
        }
        RUF ruf3 = newBuilder2.LJIIIIZZ;
        if (ruf3 != null) {
            newBuilder2.LJIIIIZZ = RUF.ADAPTER.redact(ruf3);
        }
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C79129V3t c79129V3t) {
        C79129V3t c79129V3t2 = c79129V3t;
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c79129V3t2.user_id);
        ProtoAdapter<RUF> protoAdapter = RUF.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, c79129V3t2.nickname);
        protoAdapter.encodeWithTag(protoWriter, 3, c79129V3t2.description);
        C79135V3z.ADAPTER.encodeWithTag(protoWriter, 4, c79129V3t2.avatar);
        C63714OzW.ADAPTER.encodeWithTag(protoWriter, 5, c79129V3t2.link_info);
        protoAdapter.encodeWithTag(protoWriter, 6, c79129V3t2.username);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, c79129V3t2.follower_count);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, c79129V3t2.is_verify);
        protoWriter.writeBytes(c79129V3t2.unknownFields());
    }
}
