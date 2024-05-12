package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class ROG extends Message<ROG, ROF> {
    public static final ProtoAdapter<ROG> ADAPTER = new ROH();
    public String lang;
    public Long language_id;
    public REV play_addr;
    public REV play_addr_bytevc1;
    public String voice_type;

    public ROG() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<ROG, ROF> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<ROG, ROF> newBuilder2() {
        newBuilder2();
        return null;
    }
}
