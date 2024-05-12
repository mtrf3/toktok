package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class ROJ extends ProtoAdapter<ROK> {
    public ROJ() {
        super(FieldEncoding.LENGTH_DELIMITED, ROK.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final ROK decode(ProtoReader protoReader) {
        ROK rok = new ROK();
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
                                rok.is_prohibited = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            rok.is_private = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        rok.is_delete = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    rok.aweme_id = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rok;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ROK rok) {
        ROK rok2 = rok;
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, rok2.aweme_id);
        ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
        return rok2.unknownFields().size() + protoAdapter.encodedSizeWithTag(4, rok2.is_prohibited) + protoAdapter.encodedSizeWithTag(3, rok2.is_private) + protoAdapter.encodedSizeWithTag(2, rok2.is_delete) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, ROK rok) {
    }
}
