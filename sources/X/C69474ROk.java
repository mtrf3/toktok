package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.ROk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69474ROk extends ProtoAdapter<C69475ROl> {
    public C69474ROk() {
        super(FieldEncoding.LENGTH_DELIMITED, C69475ROl.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69475ROl decode(ProtoReader protoReader) {
        C69475ROl c69475ROl = new C69475ROl();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        c69475ROl.total_task_cnt = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    c69475ROl.compeleted_task_cnt = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69475ROl;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69475ROl c69475ROl) {
        C69475ROl c69475ROl2 = c69475ROl;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        return c69475ROl2.unknownFields().size() + protoAdapter.encodedSizeWithTag(2, c69475ROl2.total_task_cnt) + protoAdapter.encodedSizeWithTag(1, c69475ROl2.compeleted_task_cnt);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69475ROl c69475ROl) {
        C69475ROl c69475ROl2 = c69475ROl;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, c69475ROl2.compeleted_task_cnt);
        protoAdapter.encodeWithTag(protoWriter, 2, c69475ROl2.total_task_cnt);
        protoWriter.writeBytes(c69475ROl2.unknownFields());
    }
}
