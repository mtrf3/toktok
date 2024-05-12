package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RGU extends Message<RGU, C69327RIt> {
    public static final ProtoAdapter<RGU> ADAPTER = new RE4();
    public Integer button_type;
    public Integer platform;
    public Boolean platform_selected_by_user;
    public String song_id;
    public C69444RNg token;

    public RGU() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RGU, C69327RIt> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RGU, C69327RIt> newBuilder2() {
        newBuilder2();
        return null;
    }
}
