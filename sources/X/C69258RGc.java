package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RGc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69258RGc extends Message<C69258RGc, C69302RHu> {
    public static final ProtoAdapter<C69258RGc> ADAPTER = new C69206REc();
    public Integer blur_comment_action;
    public Integer blur_like_action;
    public Boolean disable_comment;
    public Boolean disable_like;
    public Boolean disable_reaction;

    public C69258RGc() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69258RGc, C69302RHu> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69258RGc, C69302RHu> newBuilder2() {
        newBuilder2();
        return null;
    }
}
