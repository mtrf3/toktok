package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RL7 extends Message<RL7, RL8> {
    public static final ProtoAdapter<RL7> ADAPTER = new RL6();
    public String image_url;
    public String text;
    public Integer wait_time;

    public RL7() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RL7, RL8> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RL7, RL8> newBuilder2() {
        newBuilder2();
        return null;
    }
}
