package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RGJ extends Message<RGJ, RIB> {
    public static final ProtoAdapter<RGJ> ADAPTER = new RES();
    public Boolean chat_disabled;
    public Long expired_at;
    public Boolean is_official;
    public Long story_style_version;
    public Long total_comments;
    public Boolean viewed;
    public Long viewer_count;

    public RGJ() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RGJ, RIB> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RGJ, RIB> newBuilder2() {
        newBuilder2();
        return null;
    }
}
