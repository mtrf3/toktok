package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RPh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69497RPh extends Message<C69497RPh, C69498RPi> {
    public static final ProtoAdapter<C69497RPh> ADAPTER = new C69496RPg();
    public Boolean is_restitch;
    public Long original_aweme_id;
    public String parent_aweme_id;
    public String root_aweme_id;
    public Long stitch_trim_end_time;
    public Long stitch_trim_start_time;

    public C69497RPh() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69497RPh, C69498RPi> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69497RPh, C69498RPi> newBuilder2() {
        newBuilder2();
        return null;
    }
}
