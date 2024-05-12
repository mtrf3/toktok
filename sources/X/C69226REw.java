package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.REw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69226REw extends ProtoAdapter<C69266RGk> {
    public C69226REw() {
        super(FieldEncoding.LENGTH_DELIMITED, C69266RGk.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69266RGk decode(ProtoReader protoReader) {
        C69266RGk c69266RGk = new C69266RGk();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            c69266RGk.trailer_start_time = ProtoAdapter.DOUBLE.decode(protoReader);
                        }
                    } else {
                        c69266RGk.long_video_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    c69266RGk.video = C69174RCw.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69266RGk;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69266RGk c69266RGk) {
        C69266RGk c69266RGk2 = c69266RGk;
        return c69266RGk2.unknownFields().size() + ProtoAdapter.DOUBLE.encodedSizeWithTag(3, c69266RGk2.trailer_start_time) + ProtoAdapter.INT32.encodedSizeWithTag(2, c69266RGk2.long_video_type) + C69174RCw.ADAPTER.encodedSizeWithTag(1, c69266RGk2.video);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C69266RGk c69266RGk) {
    }
}
