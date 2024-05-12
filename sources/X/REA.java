package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class REA extends ProtoAdapter<RGM> {
    public REA() {
        super(FieldEncoding.LENGTH_DELIMITED, RGM.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RGM decode(ProtoReader protoReader) {
        RGM rgm = new RGM();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                if (nextTag != 7) {
                                    if (nextTag != 8) {
                                        if (nextTag != 9) {
                                            C1EW.LIZJ(protoReader, protoReader);
                                        } else {
                                            rgm.source_height = ProtoAdapter.DOUBLE.decode(protoReader);
                                        }
                                    } else {
                                        rgm.source_width = ProtoAdapter.DOUBLE.decode(protoReader);
                                    }
                                } else {
                                    rgm.alignment = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                rgm.text_language = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            rgm.bg_color = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        rgm.text_color = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rgm.text_size = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rgm;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RGM rgm) {
        RGM rgm2 = rgm;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, rgm2.text_size);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(7, rgm2.alignment) + protoAdapter2.encodedSizeWithTag(4, rgm2.text_language) + protoAdapter2.encodedSizeWithTag(3, rgm2.bg_color) + protoAdapter2.encodedSizeWithTag(2, rgm2.text_color) + encodedSizeWithTag;
        ProtoAdapter<Double> protoAdapter3 = ProtoAdapter.DOUBLE;
        return rgm2.unknownFields().size() + protoAdapter3.encodedSizeWithTag(9, rgm2.source_height) + protoAdapter3.encodedSizeWithTag(8, rgm2.source_width) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RGM rgm) {
        RGM rgm2 = rgm;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, rgm2.text_size);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 2, rgm2.text_color);
        protoAdapter2.encodeWithTag(protoWriter, 3, rgm2.bg_color);
        protoAdapter2.encodeWithTag(protoWriter, 4, rgm2.text_language);
        protoAdapter.encodeWithTag(protoWriter, 7, rgm2.alignment);
        ProtoAdapter<Double> protoAdapter3 = ProtoAdapter.DOUBLE;
        protoAdapter3.encodeWithTag(protoWriter, 8, rgm2.source_width);
        protoAdapter3.encodeWithTag(protoWriter, 9, rgm2.source_height);
        protoWriter.writeBytes(rgm2.unknownFields());
    }
}
