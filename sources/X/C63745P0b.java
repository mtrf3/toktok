package X;

import com.bytedance.im.core.proto.Config;
import com.bytedance.im.core.proto.GetConfigsResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.P0b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63745P0b extends ProtoAdapter<GetConfigsResponseBody> {
    public C63745P0b() {
        super(FieldEncoding.LENGTH_DELIMITED, GetConfigsResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final GetConfigsResponseBody decode(ProtoReader protoReader) {
        C63746P0c c63746P0c = new C63746P0c();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        c63746P0c.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c63746P0c.LJ.add(Config.ADAPTER.decode(protoReader));
                    }
                } else {
                    c63746P0c.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c63746P0c.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetConfigsResponseBody getConfigsResponseBody) {
        GetConfigsResponseBody getConfigsResponseBody2 = getConfigsResponseBody;
        return getConfigsResponseBody2.unknownFields().size() + Config.ADAPTER.asRepeated().encodedSizeWithTag(2, getConfigsResponseBody2.configs) + ProtoAdapter.INT32.encodedSizeWithTag(1, getConfigsResponseBody2.version);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, GetConfigsResponseBody getConfigsResponseBody) {
    }
}
