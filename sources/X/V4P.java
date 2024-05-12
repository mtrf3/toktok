package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes14.dex */
public final class V4P extends ProtoAdapter<V46> {
    public V4P() {
        super(FieldEncoding.LENGTH_DELIMITED, V46.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final V46 decode(ProtoReader protoReader) {
        C79114V3e c79114V3e = new C79114V3e();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 10) {
                        if (nextTag != 11) {
                            if (nextTag != 201) {
                                if (nextTag != 202) {
                                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                    c79114V3e.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c79114V3e.LJII = RUB.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c79114V3e.LJI = RU2.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c79114V3e.LJFF = V4L.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c79114V3e.LJ = V4Q.ADAPTER.decode(protoReader);
                    }
                } else {
                    c79114V3e.LIZLLL = V44.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c79114V3e.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(V46 v46) {
        V46 v462 = v46;
        return v462.unknownFields().size() + RUB.ADAPTER.encodedSizeWithTag(202, v462.resp_base) + RU2.ADAPTER.encodedSizeWithTag(201, v462.req_base) + V4L.ADAPTER.encodedSizeWithTag(11, v462.preview_hint) + V4Q.ADAPTER.encodedSizeWithTag(10, v462.fallback_info) + V44.ADAPTER.encodedSizeWithTag(1, v462.dynamic_info);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.squareup.wire.Message$Builder, X.V3e] */
    @Override // com.squareup.wire.ProtoAdapter
    public final V46 redact(V46 v46) {
        ?? newBuilder2 = v46.newBuilder2();
        V44 v44 = newBuilder2.LIZLLL;
        if (v44 != null) {
            newBuilder2.LIZLLL = V44.ADAPTER.redact(v44);
        }
        V4Q v4q = newBuilder2.LJ;
        if (v4q != null) {
            newBuilder2.LJ = V4Q.ADAPTER.redact(v4q);
        }
        V4L v4l = newBuilder2.LJFF;
        if (v4l != null) {
            newBuilder2.LJFF = V4L.ADAPTER.redact(v4l);
        }
        RU2 ru2 = newBuilder2.LJI;
        if (ru2 != null) {
            newBuilder2.LJI = RU2.ADAPTER.redact(ru2);
        }
        RUB rub = newBuilder2.LJII;
        if (rub != null) {
            newBuilder2.LJII = RUB.ADAPTER.redact(rub);
        }
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, V46 v46) {
        V46 v462 = v46;
        V44.ADAPTER.encodeWithTag(protoWriter, 1, v462.dynamic_info);
        V4Q.ADAPTER.encodeWithTag(protoWriter, 10, v462.fallback_info);
        V4L.ADAPTER.encodeWithTag(protoWriter, 11, v462.preview_hint);
        RU2.ADAPTER.encodeWithTag(protoWriter, 201, v462.req_base);
        RUB.ADAPTER.encodeWithTag(protoWriter, 202, v462.resp_base);
        protoWriter.writeBytes(v462.unknownFields());
    }
}
