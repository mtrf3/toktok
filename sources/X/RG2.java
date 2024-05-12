package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RG2 extends Message<RG2, RIW> {
    public static final ProtoAdapter<RG2> ADAPTER = new REJ();
    public RLD allow_adding_as_post;
    public Integer allow_adding_to_story;
    public RLD allow_create_sticker;
    public RLD allow_story_switch_to_post;
    public Integer duet;
    public Integer duet_privacy_setting;
    public Integer stitch;
    public Integer stitch_privacy_setting;
    public Integer upvote;

    public RG2() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RG2, RIW> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RG2, RIW> newBuilder2() {
        newBuilder2();
        return null;
    }
}
