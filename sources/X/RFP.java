package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RFP extends ProtoAdapter<RH8> {
    public RFP() {
        super(FieldEncoding.LENGTH_DELIMITED, RH8.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RH8 decode(ProtoReader protoReader) {
        RH8 rh8 = new RH8();
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
                                    rh8.lat = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                rh8.lng = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            rh8.region_code = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        rh8.city_code = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rh8.city_name = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rh8;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RH8 rh8) {
        RH8 rh82 = rh8;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rh82.unknownFields().size() + protoAdapter.encodedSizeWithTag(5, rh82.lat) + protoAdapter.encodedSizeWithTag(4, rh82.lng) + protoAdapter.encodedSizeWithTag(3, rh82.region_code) + protoAdapter.encodedSizeWithTag(2, rh82.city_code) + protoAdapter.encodedSizeWithTag(1, rh82.city_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RH8 rh8) {
        RH8 rh82 = rh8;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rh82.city_name);
        protoAdapter.encodeWithTag(protoWriter, 2, rh82.city_code);
        protoAdapter.encodeWithTag(protoWriter, 3, rh82.region_code);
        protoAdapter.encodeWithTag(protoWriter, 4, rh82.lng);
        protoAdapter.encodeWithTag(protoWriter, 5, rh82.lat);
        protoWriter.writeBytes(rh82.unknownFields());
    }
}
