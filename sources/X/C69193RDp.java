package X;

import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RDp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69193RDp extends ProtoAdapter<C69235RFf> {
    public C69193RDp() {
        super(FieldEncoding.LENGTH_DELIMITED, C69235RFf.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69235RFf decode(ProtoReader protoReader) {
        C69235RFf c69235RFf = new C69235RFf();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c69235RFf.allow_download = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 2:
                        c69235RFf.share_type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 3:
                        c69235RFf.show_progress_bar = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 4:
                        c69235RFf.draft_progress_bar = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 5:
                        c69235RFf.allow_duet = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 6:
                        c69235RFf.allow_react = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 7:
                        c69235RFf.prevent_download_type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 8:
                        c69235RFf.allow_dynamic_wallpaper = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 9:
                        c69235RFf.timer_status = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 10:
                        c69235RFf.allow_music = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        c69235RFf.allow_stitch = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69235RFf;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69235RFf c69235RFf) {
        C69235RFf c69235RFf2 = c69235RFf;
        ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c69235RFf2.allow_download);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        return c69235RFf2.unknownFields().size() + protoAdapter.encodedSizeWithTag(11, c69235RFf2.allow_stitch) + protoAdapter.encodedSizeWithTag(10, c69235RFf2.allow_music) + protoAdapter2.encodedSizeWithTag(9, c69235RFf2.timer_status) + protoAdapter.encodedSizeWithTag(8, c69235RFf2.allow_dynamic_wallpaper) + protoAdapter2.encodedSizeWithTag(7, c69235RFf2.prevent_download_type) + protoAdapter.encodedSizeWithTag(6, c69235RFf2.allow_react) + protoAdapter.encodedSizeWithTag(5, c69235RFf2.allow_duet) + protoAdapter2.encodedSizeWithTag(4, c69235RFf2.draft_progress_bar) + protoAdapter2.encodedSizeWithTag(3, c69235RFf2.show_progress_bar) + protoAdapter2.encodedSizeWithTag(2, c69235RFf2.share_type) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69235RFf c69235RFf) {
        C69235RFf c69235RFf2 = c69235RFf;
        ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 1, c69235RFf2.allow_download);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 2, c69235RFf2.share_type);
        protoAdapter2.encodeWithTag(protoWriter, 3, c69235RFf2.show_progress_bar);
        protoAdapter2.encodeWithTag(protoWriter, 4, c69235RFf2.draft_progress_bar);
        protoAdapter.encodeWithTag(protoWriter, 5, c69235RFf2.allow_duet);
        protoAdapter.encodeWithTag(protoWriter, 6, c69235RFf2.allow_react);
        protoAdapter2.encodeWithTag(protoWriter, 7, c69235RFf2.prevent_download_type);
        protoAdapter.encodeWithTag(protoWriter, 8, c69235RFf2.allow_dynamic_wallpaper);
        protoAdapter2.encodeWithTag(protoWriter, 9, c69235RFf2.timer_status);
        protoAdapter.encodeWithTag(protoWriter, 10, c69235RFf2.allow_music);
        protoAdapter.encodeWithTag(protoWriter, 11, c69235RFf2.allow_stitch);
        protoWriter.writeBytes(c69235RFf2.unknownFields());
    }
}
