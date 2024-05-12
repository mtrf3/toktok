package com.bytedance.android.livesdk.livesetting.gift;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PostRechargeRetentionParams_OptTypeAdapter extends TypeAdapter<PostRechargeRetentionParams> {
    public final Gson LIZ;

    public PostRechargeRetentionParams_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final PostRechargeRetentionParams read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        PostRechargeRetentionParams postRechargeRetentionParams = new PostRechargeRetentionParams(false, 0, 0L, 0L, 15, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1609594047:
                        if (!LJJ.equals("enabled")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            postRechargeRetentionParams.enabled = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -147170547:
                        if (!LJJ.equals("max_sheet_close_count")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            postRechargeRetentionParams.maxSheetCloseCount = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1544891323:
                        if (!LJJ.equals("retention_type")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            postRechargeRetentionParams.retentionType = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1838774495:
                        if (!LJJ.equals("retention_popup_cooldown")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            postRechargeRetentionParams.popupCooldown = reader.LJIJJ();
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
        return postRechargeRetentionParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, PostRechargeRetentionParams postRechargeRetentionParams) {
        PostRechargeRetentionParams postRechargeRetentionParams2 = postRechargeRetentionParams;
        o.LJIIIZ(writer, "writer");
        if (postRechargeRetentionParams2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enabled");
        writer.LJJIII(postRechargeRetentionParams2.enabled);
        writer.LJI("retention_type");
        C79062V1e.LJFF(postRechargeRetentionParams2.retentionType, writer, "retention_popup_cooldown");
        writer.LJIJ(postRechargeRetentionParams2.popupCooldown);
        writer.LJI("max_sheet_close_count");
        writer.LJIJ(postRechargeRetentionParams2.maxSheetCloseCount);
        writer.LJFF();
    }
}
