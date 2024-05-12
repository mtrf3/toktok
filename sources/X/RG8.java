package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class RG8 extends Message<RG8, C69318RIk> {
    public static final ProtoAdapter<RG8> ADAPTER = new RF1();
    public Integer interest_level;
    public List<RF0> tagged_users;
    public String video_label_text;

    public RG8() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.tagged_users = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RG8, C69318RIk> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RG8, C69318RIk> newBuilder2() {
        newBuilder2();
        return null;
    }
}
