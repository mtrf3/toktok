package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class ROH extends ProtoAdapter<ROG> {
    public ROH() {
        super(FieldEncoding.LENGTH_DELIMITED, ROG.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final ROG decode(ProtoReader protoReader) {
        ROG rog = new ROG();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                if (nextTag != 6) {
                                    C1EW.LIZJ(protoReader, protoReader);
                                } else {
                                    rog.play_addr_bytevc1 = REV.ADAPTER.decode(protoReader);
                                }
                            } else {
                                rog.play_addr = REV.ADAPTER.decode(protoReader);
                            }
                        } else {
                            rog.voice_type = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        rog.language_id = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    rog.lang = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rog;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ROG rog) {
        ROG rog2 = rog;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(3, rog2.voice_type) + ProtoAdapter.INT64.encodedSizeWithTag(2, rog2.language_id) + protoAdapter.encodedSizeWithTag(1, rog2.lang);
        ProtoAdapter<REV> protoAdapter2 = REV.ADAPTER;
        return rog2.unknownFields().size() + protoAdapter2.encodedSizeWithTag(6, rog2.play_addr_bytevc1) + protoAdapter2.encodedSizeWithTag(4, rog2.play_addr) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, ROG rog) {
        ROG rog2 = rog;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rog2.lang);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, rog2.language_id);
        protoAdapter.encodeWithTag(protoWriter, 3, rog2.voice_type);
        ProtoAdapter<REV> protoAdapter2 = REV.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 4, rog2.play_addr);
        protoAdapter2.encodeWithTag(protoWriter, 6, rog2.play_addr_bytevc1);
        protoWriter.writeBytes(rog2.unknownFields());
    }
}
