package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RET extends ProtoAdapter<C69268RGm> {
    public RET() {
        super(FieldEncoding.LENGTH_DELIMITED, C69268RGm.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69268RGm decode(ProtoReader protoReader) {
        C69268RGm c69268RGm = new C69268RGm();
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
                                c69268RGm.media_type = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c69268RGm.dynamic_cover = REV.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c69268RGm.cover = REV.ADAPTER.decode(protoReader);
                    }
                } else {
                    c69268RGm.aweme_id = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69268RGm;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69268RGm c69268RGm) {
        C69268RGm c69268RGm2 = c69268RGm;
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, c69268RGm2.aweme_id);
        ProtoAdapter<REV> protoAdapter = REV.ADAPTER;
        return c69268RGm2.unknownFields().size() + ProtoAdapter.INT64.encodedSizeWithTag(4, c69268RGm2.media_type) + protoAdapter.encodedSizeWithTag(3, c69268RGm2.dynamic_cover) + protoAdapter.encodedSizeWithTag(2, c69268RGm2.cover) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69268RGm c69268RGm) {
        C69268RGm c69268RGm2 = c69268RGm;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c69268RGm2.aweme_id);
        ProtoAdapter<REV> protoAdapter = REV.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, c69268RGm2.cover);
        protoAdapter.encodeWithTag(protoWriter, 3, c69268RGm2.dynamic_cover);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, c69268RGm2.media_type);
        protoWriter.writeBytes(c69268RGm2.unknownFields());
    }
}
