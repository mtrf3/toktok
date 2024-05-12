package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RLI extends ProtoAdapter<RLJ> {
    public RLI() {
        super(FieldEncoding.LENGTH_DELIMITED, RLJ.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RLJ decode(ProtoReader protoReader) {
        RLJ rlj = new RLJ();
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
                                    rlj.hosts.add(ProtoAdapter.STRING.decode(protoReader));
                                }
                            } else {
                                rlj.tv_token = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            rlj.auth = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        rlj.token = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rlj.vid = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rlj;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RLJ rlj) {
        RLJ rlj2 = rlj;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rlj2.unknownFields().size() + protoAdapter.asRepeated().encodedSizeWithTag(5, rlj2.hosts) + protoAdapter.encodedSizeWithTag(4, rlj2.tv_token) + protoAdapter.encodedSizeWithTag(3, rlj2.auth) + protoAdapter.encodedSizeWithTag(2, rlj2.token) + protoAdapter.encodedSizeWithTag(1, rlj2.vid);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, RLJ rlj) {
    }
}
