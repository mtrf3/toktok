package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.REq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69220REq extends ProtoAdapter<C69274RGs> {
    public C69220REq() {
        super(FieldEncoding.LENGTH_DELIMITED, C69274RGs.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69274RGs decode(ProtoReader protoReader) {
        C69274RGs c69274RGs = new C69274RGs();
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
                                    c69274RGs.user_avatar_url = REV.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c69274RGs.nickname = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c69274RGs.user_id = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c69274RGs.user_name = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    c69274RGs.sec_uid = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69274RGs;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69274RGs c69274RGs) {
        C69274RGs c69274RGs2 = c69274RGs;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return c69274RGs2.unknownFields().size() + REV.ADAPTER.encodedSizeWithTag(5, c69274RGs2.user_avatar_url) + protoAdapter.encodedSizeWithTag(4, c69274RGs2.nickname) + protoAdapter.encodedSizeWithTag(3, c69274RGs2.user_id) + protoAdapter.encodedSizeWithTag(2, c69274RGs2.user_name) + protoAdapter.encodedSizeWithTag(1, c69274RGs2.sec_uid);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69274RGs c69274RGs) {
        C69274RGs c69274RGs2 = c69274RGs;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, c69274RGs2.sec_uid);
        protoAdapter.encodeWithTag(protoWriter, 2, c69274RGs2.user_name);
        protoAdapter.encodeWithTag(protoWriter, 3, c69274RGs2.user_id);
        protoAdapter.encodeWithTag(protoWriter, 4, c69274RGs2.nickname);
        REV.ADAPTER.encodeWithTag(protoWriter, 5, c69274RGs2.user_avatar_url);
        protoWriter.writeBytes(c69274RGs2.unknownFields());
    }
}
