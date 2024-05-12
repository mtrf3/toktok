package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RHJ extends Message<RHJ, RJ7> {
    public static final ProtoAdapter<RHJ> ADAPTER = new RFN();
    public String external_song_key;
    public String h5_url;
    public String partner_name;
    public String partner_song_id;

    public RHJ() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RHJ, RJ7> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RHJ, RJ7> newBuilder2() {
        newBuilder2();
        return null;
    }
}
