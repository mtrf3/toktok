package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes14.dex */
public final class V4M extends ProtoAdapter<V4L> {
    public V4M() {
        super(FieldEncoding.LENGTH_DELIMITED, V4L.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final V4L decode(ProtoReader protoReader) {
        V34 v34 = new V34();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                if (nextTag != 5) {
                                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                    v34.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    v34.LJII = V40.ADAPTER.decode(protoReader);
                                }
                            } else {
                                try {
                                    v34.LJI = V2T.ADAPTER.decode(protoReader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    v34.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            }
                        } else {
                            v34.LJFF = RUF.ADAPTER.decode(protoReader);
                        }
                    } else {
                        v34.LJ = RUF.ADAPTER.decode(protoReader);
                    }
                } else {
                    v34.LIZLLL = RUF.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return v34.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(V4L v4l) {
        V4L v4l2 = v4l;
        ProtoAdapter<RUF> protoAdapter = RUF.ADAPTER;
        return v4l2.unknownFields().size() + V40.ADAPTER.encodedSizeWithTag(5, v4l2.quote_picture_preview) + V2T.ADAPTER.encodedSizeWithTag(4, v4l2.quote_preview_type) + protoAdapter.encodedSizeWithTag(3, v4l2.quote_preview_text) + protoAdapter.encodedSizeWithTag(2, v4l2.receiver_preview_text) + protoAdapter.encodedSizeWithTag(1, v4l2.sender_preview_text);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.squareup.wire.Message$Builder, X.V34] */
    @Override // com.squareup.wire.ProtoAdapter
    public final V4L redact(V4L v4l) {
        ?? newBuilder2 = v4l.newBuilder2();
        RUF ruf = newBuilder2.LIZLLL;
        if (ruf != null) {
            newBuilder2.LIZLLL = RUF.ADAPTER.redact(ruf);
        }
        RUF ruf2 = newBuilder2.LJ;
        if (ruf2 != null) {
            newBuilder2.LJ = RUF.ADAPTER.redact(ruf2);
        }
        RUF ruf3 = newBuilder2.LJFF;
        if (ruf3 != null) {
            newBuilder2.LJFF = RUF.ADAPTER.redact(ruf3);
        }
        V40 v40 = newBuilder2.LJII;
        if (v40 != null) {
            newBuilder2.LJII = V40.ADAPTER.redact(v40);
        }
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, V4L v4l) {
        V4L v4l2 = v4l;
        ProtoAdapter<RUF> protoAdapter = RUF.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, v4l2.sender_preview_text);
        protoAdapter.encodeWithTag(protoWriter, 2, v4l2.receiver_preview_text);
        protoAdapter.encodeWithTag(protoWriter, 3, v4l2.quote_preview_text);
        V2T.ADAPTER.encodeWithTag(protoWriter, 4, v4l2.quote_preview_type);
        V40.ADAPTER.encodeWithTag(protoWriter, 5, v4l2.quote_picture_preview);
        protoWriter.writeBytes(v4l2.unknownFields());
    }
}
