package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RGs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69274RGs extends Message<C69274RGs, RI5> {
    public static final ProtoAdapter<C69274RGs> ADAPTER = new C69220REq();
    public String nickname;
    public String sec_uid;
    public REV user_avatar_url;
    public String user_id;
    public String user_name;

    public C69274RGs() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69274RGs, RI5> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69274RGs, RI5> newBuilder2() {
        newBuilder2();
        return null;
    }
}
