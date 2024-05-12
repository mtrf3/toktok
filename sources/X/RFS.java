package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class RFS extends Message<RFS, C69332RIy> {
    public static final ProtoAdapter<RFS> ADAPTER = new RDQ();
    public String extra_info;
    public String hint_text;
    public REV icon_url;
    public String qrec_virtual_enable;
    public Integer redirect_page;
    public String scene;
    public List<RHV> words;

    public RFS() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.words = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RFS, C69332RIy> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RFS, C69332RIy> newBuilder2() {
        newBuilder2();
        return null;
    }
}
