package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class RFG extends Message<RFG, C69306RHy> {
    public static final ProtoAdapter<RFG> ADAPTER = new C69182RDe();
    public String author;
    public C69429RMr chorus_info;
    public REV cover_medium;
    public String h5_url;
    public String id;
    public List<RHG> performers;
    public String title;

    public RFG() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.performers = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RFG, C69306RHy> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RFG, C69306RHy> newBuilder2() {
        newBuilder2();
        return null;
    }
}
