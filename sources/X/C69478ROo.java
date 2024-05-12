package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* renamed from: X.ROo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69478ROo extends Message<C69478ROo, C69479ROp> {
    public static final ProtoAdapter<C69478ROo> ADAPTER = new C69477ROn();
    public List<String> invitedToDuetUserIds;
    public Boolean micPermissionOn;
    public String stickerContent;

    public C69478ROo() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.invitedToDuetUserIds = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69478ROo, C69479ROp> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69478ROo, C69479ROp> newBuilder2() {
        newBuilder2();
        return null;
    }
}
