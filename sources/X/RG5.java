package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RG5 extends Message<RG5, C69312RIe> {
    public static final ProtoAdapter<RG5> ADAPTER = new C69187RDj();
    public Boolean can_translate_realtime;
    public Boolean can_translate_realtime_skip_translation_lang_check;
    public Boolean is_burnin_caption;
    public String lang;
    public String language_code;
    public Long language_id;
    public Integer original_caption_type;

    public RG5() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RG5, C69312RIe> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RG5, C69312RIe> newBuilder2() {
        newBuilder2();
        return null;
    }
}
