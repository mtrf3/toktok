package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RFI extends ProtoAdapter<C69269RGn> {
    public RFI() {
        super(FieldEncoding.LENGTH_DELIMITED, C69269RGn.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69269RGn decode(ProtoReader protoReader) {
        C69269RGn c69269RGn = new C69269RGn();
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
                                c69269RGn.light_up = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c69269RGn.is_fan = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c69269RGn.fans_level = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    c69269RGn.fans_name = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69269RGn;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69269RGn c69269RGn) {
        C69269RGn c69269RGn2 = c69269RGn;
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(2, c69269RGn2.fans_level) + ProtoAdapter.STRING.encodedSizeWithTag(1, c69269RGn2.fans_name);
        ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
        return c69269RGn2.unknownFields().size() + protoAdapter.encodedSizeWithTag(4, c69269RGn2.light_up) + protoAdapter.encodedSizeWithTag(3, c69269RGn2.is_fan) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69269RGn c69269RGn) {
        C69269RGn c69269RGn2 = c69269RGn;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c69269RGn2.fans_name);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, c69269RGn2.fans_level);
        ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 3, c69269RGn2.is_fan);
        protoAdapter.encodeWithTag(protoWriter, 4, c69269RGn2.light_up);
        protoWriter.writeBytes(c69269RGn2.unknownFields());
    }
}
