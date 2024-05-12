package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RKx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69383RKx extends ProtoAdapter<C69384RKy> {
    public C69383RKx() {
        super(FieldEncoding.LENGTH_DELIMITED, C69384RKy.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69384RKy decode(ProtoReader protoReader) {
        C69384RKy c69384RKy = new C69384RKy();
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
                                    c69384RKy.hosts.add(ProtoAdapter.STRING.decode(protoReader));
                                }
                            } else {
                                c69384RKy.tv_token = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c69384RKy.auth = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c69384RKy.token = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    c69384RKy.vid = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69384RKy;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69384RKy c69384RKy) {
        C69384RKy c69384RKy2 = c69384RKy;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return c69384RKy2.unknownFields().size() + protoAdapter.asRepeated().encodedSizeWithTag(5, c69384RKy2.hosts) + protoAdapter.encodedSizeWithTag(4, c69384RKy2.tv_token) + protoAdapter.encodedSizeWithTag(3, c69384RKy2.auth) + protoAdapter.encodedSizeWithTag(2, c69384RKy2.token) + protoAdapter.encodedSizeWithTag(1, c69384RKy2.vid);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69384RKy c69384RKy) {
        C69384RKy c69384RKy2 = c69384RKy;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, c69384RKy2.vid);
        protoAdapter.encodeWithTag(protoWriter, 2, c69384RKy2.token);
        protoAdapter.encodeWithTag(protoWriter, 3, c69384RKy2.auth);
        protoAdapter.encodeWithTag(protoWriter, 4, c69384RKy2.tv_token);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 5, c69384RKy2.hosts);
        protoWriter.writeBytes(c69384RKy2.unknownFields());
    }
}
