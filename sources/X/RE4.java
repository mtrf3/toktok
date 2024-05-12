package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RE4 extends ProtoAdapter<RGU> {
    public RE4() {
        super(FieldEncoding.LENGTH_DELIMITED, RGU.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RGU decode(ProtoReader protoReader) {
        RGU rgu = new RGU();
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
                                    rgu.button_type = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                rgu.token = C69444RNg.ADAPTER.decode(protoReader);
                            }
                        } else {
                            rgu.platform_selected_by_user = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        rgu.song_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rgu.platform = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rgu;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RGU rgu) {
        RGU rgu2 = rgu;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        return rgu2.unknownFields().size() + protoAdapter.encodedSizeWithTag(5, rgu2.button_type) + C69444RNg.ADAPTER.encodedSizeWithTag(4, rgu2.token) + ProtoAdapter.BOOL.encodedSizeWithTag(3, rgu2.platform_selected_by_user) + ProtoAdapter.STRING.encodedSizeWithTag(2, rgu2.song_id) + protoAdapter.encodedSizeWithTag(1, rgu2.platform);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RGU rgu) {
        RGU rgu2 = rgu;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, rgu2.platform);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, rgu2.song_id);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, rgu2.platform_selected_by_user);
        C69444RNg.ADAPTER.encodeWithTag(protoWriter, 4, rgu2.token);
        protoAdapter.encodeWithTag(protoWriter, 5, rgu2.button_type);
        protoWriter.writeBytes(rgu2.unknownFields());
    }
}
