package com.bytedance.android.livesdk.livesetting.subscription;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveSubscriptionAnchorSubathonUrlConfig_OptTypeAdapter extends TypeAdapter<LiveSubscriptionAnchorSubathonUrlConfig> {
    public LiveSubscriptionAnchorSubathonUrlConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveSubscriptionAnchorSubathonUrlConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveSubscriptionAnchorSubathonUrlConfig liveSubscriptionAnchorSubathonUrlConfig = new LiveSubscriptionAnchorSubathonUrlConfig(null, null, null, null, null, null, 63, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -2037153461:
                        if (!LJJ.equals("subathon_faq")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                            liveSubscriptionAnchorSubathonUrlConfig.setSubathonFaq(LJJIIZI);
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1681781650:
                        if (!LJJ.equals("subathon_management")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI2 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI2, "reader.nextString()");
                            liveSubscriptionAnchorSubathonUrlConfig.setSubathonManagement(LJJIIZI2);
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1463291363:
                        if (!LJJ.equals("subathon_management_live")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI3 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI3, "reader.nextString()");
                            liveSubscriptionAnchorSubathonUrlConfig.setSubathonManagementLive(LJJIIZI3);
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1004242436:
                        if (!LJJ.equals("subathon_detail")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI4 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI4, "reader.nextString()");
                            liveSubscriptionAnchorSubathonUrlConfig.setSubathonDetail(LJJIIZI4);
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1138622304:
                        if (!LJJ.equals("subathon_faq_live")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI5 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI5, "reader.nextString()");
                            liveSubscriptionAnchorSubathonUrlConfig.setSubathonFaqLive(LJJIIZI5);
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1613876559:
                        if (!LJJ.equals("subathon_detail_live")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI6 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI6, "reader.nextString()");
                            liveSubscriptionAnchorSubathonUrlConfig.setSubathonDetailLive(LJJIIZI6);
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
        return liveSubscriptionAnchorSubathonUrlConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveSubscriptionAnchorSubathonUrlConfig liveSubscriptionAnchorSubathonUrlConfig) {
        LiveSubscriptionAnchorSubathonUrlConfig liveSubscriptionAnchorSubathonUrlConfig2 = liveSubscriptionAnchorSubathonUrlConfig;
        o.LJIIIZ(writer, "writer");
        if (liveSubscriptionAnchorSubathonUrlConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("subathon_management");
        writer.LJJ(liveSubscriptionAnchorSubathonUrlConfig2.getSubathonManagement());
        writer.LJI("subathon_detail");
        writer.LJJ(liveSubscriptionAnchorSubathonUrlConfig2.getSubathonDetail());
        writer.LJI("subathon_management_live");
        writer.LJJ(liveSubscriptionAnchorSubathonUrlConfig2.getSubathonManagementLive());
        writer.LJI("subathon_detail_live");
        writer.LJJ(liveSubscriptionAnchorSubathonUrlConfig2.getSubathonDetailLive());
        writer.LJI("subathon_faq");
        writer.LJJ(liveSubscriptionAnchorSubathonUrlConfig2.getSubathonFaq());
        writer.LJI("subathon_faq_live");
        writer.LJJ(liveSubscriptionAnchorSubathonUrlConfig2.getSubathonFaqLive());
        writer.LJFF();
    }
}
