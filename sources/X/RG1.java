package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RG1 extends Message<RG1, C69286RHe> {
    public static final ProtoAdapter<RG1> ADAPTER = new C69188RDk();
    public String action_id;
    public Integer code;
    public String extra;
    public Boolean mute;
    public String platform_id;
    public String popup_msg;
    public Integer show_type;
    public String toast_msg;
    public Integer transcode;

    public RG1() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RG1, C69286RHe> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RG1, C69286RHe> newBuilder2() {
        newBuilder2();
        return null;
    }
}
