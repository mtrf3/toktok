package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class REY extends Message<REY, C69311RId> {
    public static final ProtoAdapter<REY> ADAPTER = new RD5();
    public REV avatar;
    public Integer enter_type;
    public Integer follow_status;
    public Integer follower_status;
    public String handle;
    public Boolean is_block;
    public Boolean is_blocked;
    public Boolean is_private_account;
    public Boolean is_verified;
    public Boolean is_visible;
    public String nick_name;
    public String sec_uid;
    public Integer status;
    public String uid;

    public REY() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<REY, C69311RId> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<REY, C69311RId> newBuilder2() {
        newBuilder2();
        return null;
    }
}
