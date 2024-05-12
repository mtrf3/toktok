package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RE3 extends Message<RE3, C69309RIb> {
    public static final ProtoAdapter<RE3> ADAPTER = new RDK();
    public Boolean allow_comment;
    public Boolean allow_share;
    public Integer audio_change_status;
    public String aweme_id;
    public Integer dont_share_status;
    public Integer download_status;
    public Boolean in_reviewing;
    public Boolean is_copyright_violation;
    public Boolean is_delete;
    public Boolean is_private;
    public Boolean is_prohibited;
    public Integer private_status;
    public Integer reviewed;
    public Boolean self_see;
    public Integer video_hide_search;
    public C69417RMf video_mute;
    public Boolean with_goods;

    public RE3() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RE3, C69309RIb> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RE3, C69309RIb> newBuilder2() {
        newBuilder2();
        return null;
    }
}
