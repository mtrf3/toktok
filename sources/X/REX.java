package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class REX extends Message<REX, C69299RHr> {
    public static final ProtoAdapter<REX> ADAPTER = new RDM();
    public Integer c_rsp_type;
    public List<Long> client_gid_list;
    public String consistency_extra_info;
    public String consistency_groups;
    public String consistency_req_extra_info;
    public String consistency_user_extra_info;
    public List<Long> final_gid_list;
    public List<Long> fyp_gid_list;
    public List<String> rerank_reason_list;
    public List<Long> sati_gid_list;
    public List<Long> sort_gid_list;

    public REX() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.final_gid_list = C63685Oz3.LJIIIIZZ();
        this.sort_gid_list = C63685Oz3.LJIIIIZZ();
        this.sati_gid_list = C63685Oz3.LJIIIIZZ();
        this.fyp_gid_list = C63685Oz3.LJIIIIZZ();
        this.client_gid_list = C63685Oz3.LJIIIIZZ();
        this.rerank_reason_list = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<REX, C69299RHr> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<REX, C69299RHr> newBuilder2() {
        newBuilder2();
        return null;
    }
}
