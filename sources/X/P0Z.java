package X;

import com.bytedance.im.core.proto.Config;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes11.dex */
public final class P0Z extends ProtoAdapter<Config> {
    public P0Z() {
        super(FieldEncoding.LENGTH_DELIMITED, Config.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Config decode(ProtoReader protoReader) {
        C63744P0a c63744P0a = new C63744P0a();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        c63744P0a.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c63744P0a.LJ = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    c63744P0a.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c63744P0a.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Config config) {
        Config config2 = config;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return config2.unknownFields().size() + protoAdapter.encodedSizeWithTag(2, config2.conf_value) + protoAdapter.encodedSizeWithTag(1, config2.conf_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Config config) {
        Config config2 = config;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, config2.conf_name);
        protoAdapter.encodeWithTag(protoWriter, 2, config2.conf_value);
        protoWriter.writeBytes(config2.unknownFields());
    }
}
