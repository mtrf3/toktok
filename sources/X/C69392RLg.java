package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RLg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69392RLg extends ProtoAdapter<C69393RLh> {
    public C69392RLg() {
        super(FieldEncoding.LENGTH_DELIMITED, C69393RLh.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69393RLh decode(ProtoReader protoReader) {
        C69393RLh c69393RLh = new C69393RLh();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            c69393RLh.fallback_url = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c69393RLh.backup_url = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    c69393RLh.main_url = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69393RLh;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69393RLh c69393RLh) {
        C69393RLh c69393RLh2 = c69393RLh;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return c69393RLh2.unknownFields().size() + protoAdapter.encodedSizeWithTag(3, c69393RLh2.fallback_url) + protoAdapter.encodedSizeWithTag(2, c69393RLh2.backup_url) + protoAdapter.encodedSizeWithTag(1, c69393RLh2.main_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69393RLh c69393RLh) {
        C69393RLh c69393RLh2 = c69393RLh;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, c69393RLh2.main_url);
        protoAdapter.encodeWithTag(protoWriter, 2, c69393RLh2.backup_url);
        protoAdapter.encodeWithTag(protoWriter, 3, c69393RLh2.fallback_url);
        protoWriter.writeBytes(c69393RLh2.unknownFields());
    }
}
