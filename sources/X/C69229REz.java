package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* renamed from: X.REz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69229REz extends Message<C69229REz, C69346RJm> {
    public static final ProtoAdapter<C69229REz> ADAPTER = new RDW();
    public Boolean has_sub_arrow;
    public List<Integer> hide_list;
    public Integer sub_tag_exp_time;
    public Integer sub_tag_exp_type;
    public List<RHC> sub_tags;
    public String suffix;
    public String track_info;

    public C69229REz() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.sub_tags = C63685Oz3.LJIIIIZZ();
        this.hide_list = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69229REz, C69346RJm> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69229REz, C69346RJm> newBuilder2() {
        newBuilder2();
        return null;
    }
}
