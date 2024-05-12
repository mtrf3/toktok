package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact;

import X.C164806dQ;
import X.C79004UzY;
import X.EnumC164816dR;
import X.InterfaceC65349Pkn;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes3.dex */
public class InteractStickerTracksContext implements Serializable {
    public String LJLIL;

    @InterfaceC65349Pkn("multi_edit_map")
    public LinkedHashMap<String, List<InteractStickerStruct>> multiEditMap = new LinkedHashMap<>();

    @InterfaceC65349Pkn("multi_record_map")
    public LinkedHashMap<String, List<InteractStickerStruct>> multiRecordMap = new LinkedHashMap<>();

    public String getExtra() {
        return this.LJLIL;
    }

    public final LinkedHashMap<String, List<InteractStickerStruct>> LIZ(EnumC164816dR enumC164816dR) {
        int i = C164806dQ.LIZ[enumC164816dR.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return new LinkedHashMap<>();
            }
            return this.multiEditMap;
        }
        return this.multiRecordMap;
    }

    public List<InteractStickerStruct> getStickerStructsByPage(EnumC164816dR... enumC164816dRArr) {
        ArrayList arrayList = new ArrayList();
        for (EnumC164816dR enumC164816dR : enumC164816dRArr) {
            LinkedHashMap<String, List<InteractStickerStruct>> LIZ = LIZ(enumC164816dR);
            Iterator<String> it = LIZ.keySet().iterator();
            while (it.hasNext()) {
                List<InteractStickerStruct> list = LIZ.get(it.next());
                if (list != null) {
                    arrayList.addAll(list);
                }
            }
        }
        return arrayList;
    }

    public boolean isEmpty(EnumC164816dR... enumC164816dRArr) {
        for (EnumC164816dR enumC164816dR : enumC164816dRArr) {
            if (!LIZ(enumC164816dR).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public void setExtra(String str) {
        this.LJLIL = str;
    }

    public List<InteractStickerStruct> getStickerStructByPageAndType(Integer num, EnumC164816dR enumC164816dR) {
        LinkedHashMap<String, List<InteractStickerStruct>> LIZ = LIZ(enumC164816dR);
        if (LIZ.isEmpty()) {
            return null;
        }
        return LIZ.get(String.valueOf(num));
    }

    public boolean removeStickerStructByPage(EnumC164816dR enumC164816dR, int i) {
        LinkedHashMap<String, List<InteractStickerStruct>> LIZ = LIZ(enumC164816dR);
        if (LIZ.get(String.valueOf(i)) != null) {
            LIZ.remove(String.valueOf(i));
            return true;
        }
        return false;
    }

    public void upDateStickerStructs(List<InteractStickerStruct> list, EnumC164816dR enumC164816dR) {
        int i;
        LinkedHashMap<String, List<InteractStickerStruct>> LIZ = LIZ(enumC164816dR);
        LIZ.clear();
        if (!C79004UzY.LJJIFFI(list)) {
            for (InteractStickerStruct interactStickerStruct : list) {
                int type = interactStickerStruct.getType();
                if (type != 17) {
                    if (type != 20) {
                        if (type != 22) {
                            if (type != 23) {
                                switch (type) {
                                    case 3:
                                        i = 1;
                                        break;
                                    case 4:
                                        i = 2;
                                        break;
                                    case 5:
                                        i = 3;
                                        break;
                                    case 6:
                                        i = 4;
                                        break;
                                    case 7:
                                        i = 5;
                                        break;
                                    case 8:
                                        i = 8;
                                        break;
                                    case 9:
                                        i = 9;
                                        break;
                                    case 10:
                                        i = 10;
                                        break;
                                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                        break;
                                    default:
                                        i = -1;
                                        break;
                                }
                            } else {
                                i = 14;
                            }
                        } else {
                            i = 13;
                        }
                    }
                    i = 11;
                } else {
                    i = 12;
                }
                if (LIZ.get(String.valueOf(i)) == null) {
                    LIZ.put(String.valueOf(i), new ArrayList());
                }
                LIZ.get(String.valueOf(i)).add(interactStickerStruct);
            }
        }
    }
}
