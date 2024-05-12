package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RFy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69254RFy extends Message<C69254RFy, RJG> {
    public static final ProtoAdapter<C69254RFy> ADAPTER = new RDY();
    public Long alias_comment_id;
    public Long aweme_id;
    public Integer collect_stat;
    public Long comment_id;
    public String comment_msg;
    public Long comment_user_id;
    public REV user_avatar;
    public String user_name;

    public C69254RFy() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69254RFy, RJG> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69254RFy, RJG> newBuilder2() {
        newBuilder2();
        return null;
    }
}
