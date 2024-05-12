package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RKc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69362RKc extends ProtoAdapter<C69363RKd> {
    public C69362RKc() {
        super(FieldEncoding.LENGTH_DELIMITED, C69363RKd.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69363RKd decode(ProtoReader protoReader) {
        C69363RKd c69363RKd = new C69363RKd();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        c69363RKd.sati_param_for_pitaya = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    c69363RKd.client_ai_upload_json_str = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69363RKd;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69363RKd c69363RKd) {
        C69363RKd c69363RKd2 = c69363RKd;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return c69363RKd2.unknownFields().size() + protoAdapter.encodedSizeWithTag(2, c69363RKd2.sati_param_for_pitaya) + protoAdapter.encodedSizeWithTag(1, c69363RKd2.client_ai_upload_json_str);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69363RKd c69363RKd) {
        C69363RKd c69363RKd2 = c69363RKd;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, c69363RKd2.client_ai_upload_json_str);
        protoAdapter.encodeWithTag(protoWriter, 2, c69363RKd2.sati_param_for_pitaya);
        protoWriter.writeBytes(c69363RKd2.unknownFields());
    }
}
