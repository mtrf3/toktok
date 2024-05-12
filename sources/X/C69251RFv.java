package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RFv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69251RFv extends Message<C69251RFv, C69330RIw> {
    public static final ProtoAdapter<C69251RFv> ADAPTER = new RDX();
    public Integer collect_status;
    public C69277RGv default_performer_avatar;
    public String full_clip_author;
    public String full_clip_id;
    public String full_clip_title;
    public Boolean is_show_entrance;
    public Long mv_id;

    public C69251RFv() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69251RFv, C69330RIw> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69251RFv, C69330RIw> newBuilder2() {
        newBuilder2();
        return null;
    }
}
