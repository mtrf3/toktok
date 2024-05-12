package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RHX extends ProtoAdapter<RHW> {
    public RHX() {
        super(FieldEncoding.LENGTH_DELIMITED, RHW.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RHW decode(ProtoReader protoReader) {
        RHW rhw = new RHW();
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
                                rhw.second_floor_info = RLS.ADAPTER.decode(protoReader);
                            }
                        } else {
                            rhw.with_text_entry = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        rhw.quick_shop_name = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rhw.quick_shop_url = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rhw;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RHW rhw) {
        RHW rhw2 = rhw;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rhw2.unknownFields().size() + RLS.ADAPTER.encodedSizeWithTag(4, rhw2.second_floor_info) + ProtoAdapter.BOOL.encodedSizeWithTag(3, rhw2.with_text_entry) + protoAdapter.encodedSizeWithTag(2, rhw2.quick_shop_name) + protoAdapter.encodedSizeWithTag(1, rhw2.quick_shop_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RHW rhw) {
        RHW rhw2 = rhw;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rhw2.quick_shop_url);
        protoAdapter.encodeWithTag(protoWriter, 2, rhw2.quick_shop_name);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, rhw2.with_text_entry);
        RLS.ADAPTER.encodeWithTag(protoWriter, 4, rhw2.second_floor_info);
        protoWriter.writeBytes(rhw2.unknownFields());
    }
}
