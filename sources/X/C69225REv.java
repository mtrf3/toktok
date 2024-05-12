package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.REv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69225REv extends ProtoAdapter<RH7> {
    public C69225REv() {
        super(FieldEncoding.LENGTH_DELIMITED, RH7.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RH7 decode(ProtoReader protoReader) {
        RH7 rh7 = new RH7();
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
                                rh7.option = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            rh7.vote_count = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        rh7.option_id = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    rh7.option_text = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rh7;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RH7 rh7) {
        RH7 rh72 = rh7;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, rh72.option_text);
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        return rh72.unknownFields().size() + protoAdapter.encodedSizeWithTag(4, rh72.option) + protoAdapter2.encodedSizeWithTag(3, rh72.vote_count) + protoAdapter2.encodedSizeWithTag(2, rh72.option_id) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RH7 rh7) {
        RH7 rh72 = rh7;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rh72.option_text);
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 2, rh72.option_id);
        protoAdapter2.encodeWithTag(protoWriter, 3, rh72.vote_count);
        protoAdapter.encodeWithTag(protoWriter, 4, rh72.option);
        protoWriter.writeBytes(rh72.unknownFields());
    }
}
