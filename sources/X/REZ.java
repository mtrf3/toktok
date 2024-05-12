package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class REZ extends ProtoAdapter<RG6> {
    public REZ() {
        super(FieldEncoding.LENGTH_DELIMITED, RG6.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RG6 decode(ProtoReader protoReader) {
        RG6 rg6 = new RG6();
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
                                    rg6.emoji_recommend_list.add(RHP.ADAPTER.decode(protoReader));
                                }
                            } else {
                                rg6.empty_list_text = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            rg6.non_zero_input_box_text = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        rg6.zero_input_box_text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rg6.zero_icon_text = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rg6;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RG6 rg6) {
        RG6 rg62 = rg6;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rg62.unknownFields().size() + RHP.ADAPTER.asRepeated().encodedSizeWithTag(5, rg62.emoji_recommend_list) + protoAdapter.encodedSizeWithTag(4, rg62.empty_list_text) + protoAdapter.encodedSizeWithTag(3, rg62.non_zero_input_box_text) + protoAdapter.encodedSizeWithTag(2, rg62.zero_input_box_text) + protoAdapter.encodedSizeWithTag(1, rg62.zero_icon_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RG6 rg6) {
        RG6 rg62 = rg6;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rg62.zero_icon_text);
        protoAdapter.encodeWithTag(protoWriter, 2, rg62.zero_input_box_text);
        protoAdapter.encodeWithTag(protoWriter, 3, rg62.non_zero_input_box_text);
        protoAdapter.encodeWithTag(protoWriter, 4, rg62.empty_list_text);
        RHP.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, rg62.emoji_recommend_list);
        protoWriter.writeBytes(rg62.unknownFields());
    }
}
