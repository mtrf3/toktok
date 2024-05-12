package com.bytedance.android.livesdk.livesetting.performance;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LikeOptModel_OptTypeAdapter extends TypeAdapter<LikeOptModel> {
    public final Gson LIZ;

    public LikeOptModel_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LikeOptModel read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LikeOptModel likeOptModel = new LikeOptModel();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1856156702:
                        if (!LJJ.equals("like_num_textview_size_fixed")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            likeOptModel.likeNumTextviewSizeFixed = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1637380656:
                        if (!LJJ.equals("like_queue_capacity")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            likeOptModel.likeQueueCapacity = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 128377084:
                        if (!LJJ.equals("interpolator_reuse")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            likeOptModel.interpolatorReuse = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 277517247:
                        if (!LJJ.equals("audience_num_and_public_screen_textview_opt")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            likeOptModel.otherTextViewWidthOpt = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 548545342:
                        if (!LJJ.equals("like_share_transference")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            likeOptModel.likeShareTransference = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return likeOptModel;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LikeOptModel likeOptModel) {
        LikeOptModel likeOptModel2 = likeOptModel;
        o.LJIIIZ(writer, "writer");
        if (likeOptModel2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("like_queue_capacity");
        C79062V1e.LJFF(likeOptModel2.likeQueueCapacity, writer, "interpolator_reuse");
        writer.LJJIII(likeOptModel2.interpolatorReuse);
        writer.LJI("like_num_textview_size_fixed");
        writer.LJJIII(likeOptModel2.likeNumTextviewSizeFixed);
        writer.LJI("like_share_transference");
        writer.LJJIII(likeOptModel2.likeShareTransference);
        writer.LJI("audience_num_and_public_screen_textview_opt");
        writer.LJJIII(likeOptModel2.otherTextViewWidthOpt);
        writer.LJFF();
    }
}
