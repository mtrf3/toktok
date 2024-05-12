package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* renamed from: X.RFa, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69230RFa extends Message<C69230RFa, C69343RJj> {
    public static final ProtoAdapter<C69230RFa> ADAPTER = new C69231RFb();
    public String HDR_bit;
    public String HDR_type;
    public Long bandwidth;
    public Integer bit_rate;
    public List<ROG> dub_infos;
    public String format;
    public Long fps;
    public String gear_name;
    public Integer is_bytevc1;
    public REV play_addr;
    public REV play_addr_265;
    public REV play_addr_bytevc1;
    public Integer quality_type;
    public String video_extra;

    public C69230RFa() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.dub_infos = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69230RFa, C69343RJj> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69230RFa, C69343RJj> newBuilder2() {
        newBuilder2();
        return null;
    }
}
