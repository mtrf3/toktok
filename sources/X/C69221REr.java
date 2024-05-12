package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.REr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69221REr extends ProtoAdapter<C69263RGh> {
    public C69221REr() {
        super(FieldEncoding.LENGTH_DELIMITED, C69263RGh.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69263RGh decode(ProtoReader protoReader) {
        C69263RGh c69263RGh = new C69263RGh();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c69263RGh.scenario = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 2:
                        c69263RGh.appear_time = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 3:
                        c69263RGh.continuous_show_count = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 4:
                        c69263RGh.silence_days = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 5:
                        c69263RGh.show_count_per_interval = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 6:
                        c69263RGh.interval_days = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69263RGh;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69263RGh c69263RGh) {
        C69263RGh c69263RGh2 = c69263RGh;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        return c69263RGh2.unknownFields().size() + protoAdapter.encodedSizeWithTag(6, c69263RGh2.interval_days) + protoAdapter.encodedSizeWithTag(5, c69263RGh2.show_count_per_interval) + protoAdapter.encodedSizeWithTag(4, c69263RGh2.silence_days) + protoAdapter.encodedSizeWithTag(3, c69263RGh2.continuous_show_count) + protoAdapter.encodedSizeWithTag(2, c69263RGh2.appear_time) + protoAdapter.encodedSizeWithTag(1, c69263RGh2.scenario);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69263RGh c69263RGh) {
        C69263RGh c69263RGh2 = c69263RGh;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, c69263RGh2.scenario);
        protoAdapter.encodeWithTag(protoWriter, 2, c69263RGh2.appear_time);
        protoAdapter.encodeWithTag(protoWriter, 3, c69263RGh2.continuous_show_count);
        protoAdapter.encodeWithTag(protoWriter, 4, c69263RGh2.silence_days);
        protoAdapter.encodeWithTag(protoWriter, 5, c69263RGh2.show_count_per_interval);
        protoAdapter.encodeWithTag(protoWriter, 6, c69263RGh2.interval_days);
        protoWriter.writeBytes(c69263RGh2.unknownFields());
    }
}
