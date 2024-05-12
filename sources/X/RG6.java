package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class RG6 extends Message<RG6, RJA> {
    public static final ProtoAdapter<RG6> ADAPTER = new REZ();
    public List<RHP> emoji_recommend_list;
    public String empty_list_text;
    public String non_zero_input_box_text;
    public String zero_icon_text;
    public String zero_input_box_text;

    public RG6() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.emoji_recommend_list = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RG6, RJA> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RG6, RJA> newBuilder2() {
        newBuilder2();
        return null;
    }
}
