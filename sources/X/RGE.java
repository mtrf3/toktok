package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RGE extends ProtoAdapter<RGD> {
    public RGE() {
        super(FieldEncoding.LENGTH_DELIMITED, RGD.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RGD decode(ProtoReader protoReader) {
        RGD rgd = new RGD();
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
                                    rgd.caption_anchor = RL4.ADAPTER.decode(protoReader);
                                }
                            } else {
                                rgd.caption_info = RNF.ADAPTER.decode(protoReader);
                            }
                        } else {
                            rgd.match_info.add(RH1.ADAPTER.decode(protoReader));
                        }
                    } else {
                        rgd.query_limit = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    rgd.total_limit = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rgd;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RGD rgd) {
        RGD rgd2 = rgd;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        return rgd2.unknownFields().size() + RL4.ADAPTER.encodedSizeWithTag(5, rgd2.caption_anchor) + RNF.ADAPTER.encodedSizeWithTag(4, rgd2.caption_info) + RH1.ADAPTER.asRepeated().encodedSizeWithTag(3, rgd2.match_info) + protoAdapter.encodedSizeWithTag(2, rgd2.query_limit) + protoAdapter.encodedSizeWithTag(1, rgd2.total_limit);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RGD rgd) {
        RGD rgd2 = rgd;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, rgd2.total_limit);
        protoAdapter.encodeWithTag(protoWriter, 2, rgd2.query_limit);
        RH1.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, rgd2.match_info);
        RNF.ADAPTER.encodeWithTag(protoWriter, 4, rgd2.caption_info);
        RL4.ADAPTER.encodeWithTag(protoWriter, 5, rgd2.caption_anchor);
        protoWriter.writeBytes(rgd2.unknownFields());
    }
}
