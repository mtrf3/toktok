package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class RM5 extends Message<RM5, RM6> {
    public static final ProtoAdapter<RM5> ADAPTER = new RM4();
    public List<String> fatal_item_ids;
    public String logid;
    public Long now;

    public RM5() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.fatal_item_ids = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RM5, RM6> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RM5, RM6> newBuilder2() {
        newBuilder2();
        return null;
    }
}
