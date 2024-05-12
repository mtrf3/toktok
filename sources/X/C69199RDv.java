package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RDv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69199RDv extends Message<C69199RDv, C69334RJa> {
    public static final ProtoAdapter<C69199RDv> ADAPTER = new C69176RCy();
    public Integer bool_persist;
    public String button_display_stratege_source;
    public String goods_rec_url;
    public String manage_goods_url;
    public Integer share_button_display_mode;
    public String share_desc;
    public String share_desc_info;
    public REV share_image_url;
    public String share_link_desc;
    public REV share_qrcode_url;
    public String share_quote;
    public String share_signature_desc;
    public String share_signature_url;
    public String share_title;
    public String share_title_myself;
    public String share_title_other;
    public String share_url;
    public String share_weibo_desc;
    public String whatsapp_desc;

    public C69199RDv() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69199RDv, C69334RJa> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69199RDv, C69334RJa> newBuilder2() {
        newBuilder2();
        return null;
    }
}
