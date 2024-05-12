package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RER extends ProtoAdapter<C69260RGe> {
    public RER() {
        super(FieldEncoding.LENGTH_DELIMITED, C69260RGe.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69260RGe decode(ProtoReader protoReader) {
        C69260RGe c69260RGe = new C69260RGe();
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
                                    c69260RGe.is_promote_ad_label = ProtoAdapter.BOOL.decode(protoReader);
                                }
                            } else {
                                c69260RGe.label_color = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c69260RGe.label_text = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c69260RGe.label_click = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    c69260RGe.label_icon = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69260RGe;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69260RGe c69260RGe) {
        C69260RGe c69260RGe2 = c69260RGe;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, c69260RGe2.label_click) + protoAdapter.encodedSizeWithTag(1, c69260RGe2.label_icon);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        return c69260RGe2.unknownFields().size() + ProtoAdapter.BOOL.encodedSizeWithTag(5, c69260RGe2.is_promote_ad_label) + protoAdapter2.encodedSizeWithTag(4, c69260RGe2.label_color) + protoAdapter2.encodedSizeWithTag(3, c69260RGe2.label_text) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69260RGe c69260RGe) {
        C69260RGe c69260RGe2 = c69260RGe;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, c69260RGe2.label_icon);
        protoAdapter.encodeWithTag(protoWriter, 2, c69260RGe2.label_click);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 3, c69260RGe2.label_text);
        protoAdapter2.encodeWithTag(protoWriter, 4, c69260RGe2.label_color);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, c69260RGe2.is_promote_ad_label);
        protoWriter.writeBytes(c69260RGe2.unknownFields());
    }
}
