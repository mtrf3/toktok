package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LiveTwoMatchLinkOptSettingData_OptTypeAdapter extends TypeAdapter<LiveTwoMatchLinkOptSettingData> {
    public LiveTwoMatchLinkOptSettingData_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveTwoMatchLinkOptSettingData read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveTwoMatchLinkOptSettingData liveTwoMatchLinkOptSettingData = new LiveTwoMatchLinkOptSettingData(0, 0, 0, 0, 0, 0, 0, 0, 255, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1954395717:
                        if (!LJJ.equals("permission_retry_duration")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveTwoMatchLinkOptSettingData.permission_retry_duration = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1523311032:
                        if (!LJJ.equals("permission_retry_count")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveTwoMatchLinkOptSettingData.permission_retry_count = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 26042609:
                        if (!LJJ.equals("invitee_open_delay")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveTwoMatchLinkOptSettingData.invitee_open_delay = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1014360984:
                        if (!LJJ.equals("inviter_battle_info_retry_count")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveTwoMatchLinkOptSettingData.inviter_battle_info_retry_count = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1129863832:
                        if (!LJJ.equals("invitee_battle_info_retry_duration")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveTwoMatchLinkOptSettingData.invitee_battle_info_retry_duration = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1331092395:
                        if (!LJJ.equals("cancel_invite_info_retry_duration")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveTwoMatchLinkOptSettingData.cancel_invite_info_retry_duration = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1704117956:
                        if (!LJJ.equals("inviter_open_delay")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveTwoMatchLinkOptSettingData.inviter_open_delay = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 2113256043:
                        if (!LJJ.equals("inviter_battle_info_retry_duration")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveTwoMatchLinkOptSettingData.inviter_battle_info_retry_duration = reader.LJIJI();
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
        return liveTwoMatchLinkOptSettingData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveTwoMatchLinkOptSettingData liveTwoMatchLinkOptSettingData) {
        LiveTwoMatchLinkOptSettingData liveTwoMatchLinkOptSettingData2 = liveTwoMatchLinkOptSettingData;
        o.LJIIIZ(writer, "writer");
        if (liveTwoMatchLinkOptSettingData2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("invitee_open_delay");
        C79062V1e.LJFF(liveTwoMatchLinkOptSettingData2.invitee_open_delay, writer, "inviter_open_delay");
        C79062V1e.LJFF(liveTwoMatchLinkOptSettingData2.inviter_open_delay, writer, "inviter_battle_info_retry_duration");
        C79062V1e.LJFF(liveTwoMatchLinkOptSettingData2.inviter_battle_info_retry_duration, writer, "invitee_battle_info_retry_duration");
        C79062V1e.LJFF(liveTwoMatchLinkOptSettingData2.invitee_battle_info_retry_duration, writer, "cancel_invite_info_retry_duration");
        C79062V1e.LJFF(liveTwoMatchLinkOptSettingData2.cancel_invite_info_retry_duration, writer, "inviter_battle_info_retry_count");
        C79062V1e.LJFF(liveTwoMatchLinkOptSettingData2.inviter_battle_info_retry_count, writer, "permission_retry_count");
        C79062V1e.LJFF(liveTwoMatchLinkOptSettingData2.permission_retry_count, writer, "permission_retry_duration");
        C77339UWx.LJFF(liveTwoMatchLinkOptSettingData2.permission_retry_duration, writer);
    }
}
