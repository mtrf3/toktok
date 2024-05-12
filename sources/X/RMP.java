package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RMP extends ProtoAdapter<RMQ> {
    public RMP() {
        super(FieldEncoding.LENGTH_DELIMITED, RMQ.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RMQ decode(ProtoReader protoReader) {
        RMQ rmq = new RMQ();
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
                                rmq.lose_count = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            rmq.play_count = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        rmq.digg_count = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    rmq.aweme_id = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rmq;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RMQ rmq) {
        RMQ rmq2 = rmq;
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, rmq2.aweme_id);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return rmq2.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(4, rmq2.lose_count) + protoAdapter.encodedSizeWithTag(3, rmq2.play_count) + protoAdapter.encodedSizeWithTag(2, rmq2.digg_count) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, RMQ rmq) {
    }
}
