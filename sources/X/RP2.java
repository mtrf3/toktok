package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RP2 extends ProtoAdapter<RP3> {
    public RP2() {
        super(FieldEncoding.LENGTH_DELIMITED, RP3.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RP3 decode(ProtoReader protoReader) {
        RP3 rp3 = new RP3();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                C1EW.LIZJ(protoReader, protoReader);
                            } else {
                                rp3.icon_url = REV.ADAPTER.decode(protoReader);
                            }
                        } else {
                            rp3.text_color = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        rp3.sub_title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rp3.title = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rp3;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RP3 rp3) {
        RP3 rp32 = rp3;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rp32.unknownFields().size() + REV.ADAPTER.encodedSizeWithTag(4, rp32.icon_url) + protoAdapter.encodedSizeWithTag(3, rp32.text_color) + protoAdapter.encodedSizeWithTag(2, rp32.sub_title) + protoAdapter.encodedSizeWithTag(1, rp32.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RP3 rp3) {
        RP3 rp32 = rp3;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rp32.title);
        protoAdapter.encodeWithTag(protoWriter, 2, rp32.sub_title);
        protoAdapter.encodeWithTag(protoWriter, 3, rp32.text_color);
        REV.ADAPTER.encodeWithTag(protoWriter, 4, rp32.icon_url);
        protoWriter.writeBytes(rp32.unknownFields());
    }
}
