package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* renamed from: X.REj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69213REj extends Message<C69213REj, RK2> {
    public static final ProtoAdapter<C69213REj> ADAPTER = new RE0();
    public RG1 download_general;
    public RG1 download_mask_panel;
    public RG1 download_share_panel;
    public List<RG1> platform_list;
    public List<RG1> press_action_list;
    public List<RG1> share_action_list;
    public RG1 share_general;
    public Integer share_list_status;
    public RG1 share_third_platform;

    public C69213REj() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.platform_list = C63685Oz3.LJIIIIZZ();
        this.share_action_list = C63685Oz3.LJIIIIZZ();
        this.press_action_list = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69213REj, RK2> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69213REj, RK2> newBuilder2() {
        newBuilder2();
        return null;
    }
}
