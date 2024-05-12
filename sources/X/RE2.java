package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RE2 extends ProtoAdapter<RGT> {
    public RE2() {
        super(FieldEncoding.LENGTH_DELIMITED, RGT.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RGT decode(ProtoReader protoReader) {
        RGT rgt = new RGT();
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
                                    rgt.live_info = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                rgt.feed_show_time = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            rgt.topview_valid = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        rgt.end_time = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    rgt.start_time = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rgt;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RGT rgt) {
        RGT rgt2 = rgt;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return rgt2.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(5, rgt2.live_info) + ProtoAdapter.INT32.encodedSizeWithTag(4, rgt2.feed_show_time) + ProtoAdapter.BOOL.encodedSizeWithTag(3, rgt2.topview_valid) + protoAdapter.encodedSizeWithTag(2, rgt2.end_time) + protoAdapter.encodedSizeWithTag(1, rgt2.start_time);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RGT rgt) {
        RGT rgt2 = rgt;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, rgt2.start_time);
        protoAdapter.encodeWithTag(protoWriter, 2, rgt2.end_time);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, rgt2.topview_valid);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, rgt2.feed_show_time);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, rgt2.live_info);
        protoWriter.writeBytes(rgt2.unknownFields());
    }
}
