package X;

import com.bytedance.im.core.proto.ClientMetric;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.Oye, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63660Oye extends ProtoAdapter<ClientMetric> {
    public final ProtoAdapter<java.util.Map<String, String>> LJ;

    public C63660Oye() {
        super(FieldEncoding.LENGTH_DELIMITED, ClientMetric.class);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        this.LJ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final ClientMetric decode(ProtoReader protoReader) {
        C63659Oyd c63659Oyd = new C63659Oyd();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                c63659Oyd.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c63659Oyd.LJI.putAll(this.LJ.decode(protoReader));
                            }
                        } else {
                            c63659Oyd.LJFF = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c63659Oyd.LJ = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    try {
                        c63659Oyd.LIZLLL = EnumC63665Oyj.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        c63659Oyd.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                    }
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c63659Oyd.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ClientMetric clientMetric) {
        ClientMetric clientMetric2 = clientMetric;
        return clientMetric2.unknownFields().size() + this.LJ.encodedSizeWithTag(4, clientMetric2.tags) + ProtoAdapter.INT64.encodedSizeWithTag(3, clientMetric2.v) + ProtoAdapter.STRING.encodedSizeWithTag(2, clientMetric2.k) + EnumC63665Oyj.ADAPTER.encodedSizeWithTag(1, clientMetric2.metric_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, ClientMetric clientMetric) {
        ClientMetric clientMetric2 = clientMetric;
        EnumC63665Oyj.ADAPTER.encodeWithTag(protoWriter, 1, clientMetric2.metric_type);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, clientMetric2.k);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, clientMetric2.v);
        this.LJ.encodeWithTag(protoWriter, 4, clientMetric2.tags);
        protoWriter.writeBytes(clientMetric2.unknownFields());
    }
}
