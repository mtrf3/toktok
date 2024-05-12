package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RF6 extends ProtoAdapter<C69275RGt> {
    public RF6() {
        super(FieldEncoding.LENGTH_DELIMITED, C69275RGt.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69275RGt decode(ProtoReader protoReader) {
        C69275RGt c69275RGt = new C69275RGt();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                if (nextTag != 5) {
                                    C1EW.LIZJ(protoReader, protoReader);
                                } else {
                                    c69275RGt.has_updated_episode = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c69275RGt.updated_to_episode = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c69275RGt.current_episode = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c69275RGt.collect_vv = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    c69275RGt.play_vv = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69275RGt;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69275RGt c69275RGt) {
        C69275RGt c69275RGt2 = c69275RGt;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return c69275RGt2.unknownFields().size() + protoAdapter.encodedSizeWithTag(5, c69275RGt2.has_updated_episode) + protoAdapter.encodedSizeWithTag(4, c69275RGt2.updated_to_episode) + protoAdapter.encodedSizeWithTag(3, c69275RGt2.current_episode) + protoAdapter.encodedSizeWithTag(2, c69275RGt2.collect_vv) + protoAdapter.encodedSizeWithTag(1, c69275RGt2.play_vv);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69275RGt c69275RGt) {
        C69275RGt c69275RGt2 = c69275RGt;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, c69275RGt2.play_vv);
        protoAdapter.encodeWithTag(protoWriter, 2, c69275RGt2.collect_vv);
        protoAdapter.encodeWithTag(protoWriter, 3, c69275RGt2.current_episode);
        protoAdapter.encodeWithTag(protoWriter, 4, c69275RGt2.updated_to_episode);
        protoAdapter.encodeWithTag(protoWriter, 5, c69275RGt2.has_updated_episode);
        protoWriter.writeBytes(c69275RGt2.unknownFields());
    }
}
