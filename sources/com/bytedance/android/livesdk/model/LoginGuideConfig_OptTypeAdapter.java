package com.bytedance.android.livesdk.model;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class LoginGuideConfig_OptTypeAdapter extends TypeAdapter<LoginGuideConfig> {
    public LoginGuideConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LoginGuideConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LoginGuideConfig loginGuideConfig = new LoginGuideConfig();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1563308546:
                        if (!LJJ.equals("image_url_from_comment")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            loginGuideConfig.imageUrlFromComment = reader.LJJIIZI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1341829932:
                        if (!LJJ.equals("from_home_upper_right")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            loginGuideConfig.fromHomeUpperRight = reader.LJJIIZI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -968903200:
                        if (!LJJ.equals("image_url_from_default")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            loginGuideConfig.imageUrlFromDefault = reader.LJJIIZI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -164819482:
                        if (!LJJ.equals("from_follow")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            loginGuideConfig.fromFollow = reader.LJJIIZI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 435281373:
                        if (!LJJ.equals("image_url_from_favorite")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            loginGuideConfig.imageUrlFromFavorite = reader.LJJIIZI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 818963146:
                        if (!LJJ.equals("from_comment")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            loginGuideConfig.fromComment = reader.LJJIIZI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1079458848:
                        if (!LJJ.equals("image_url_from_home_upper_right")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            loginGuideConfig.imageUrlFromHomeUpperRight = reader.LJJIIZI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1271259793:
                        if (!LJJ.equals("from_favorite")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            loginGuideConfig.fromFavorite = reader.LJJIIZI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1413368492:
                        if (!LJJ.equals("from_default")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            loginGuideConfig.fromDefault = reader.LJJIIZI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1836543026:
                        if (!LJJ.equals("image_url_from_follow")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            loginGuideConfig.imageUrlFromFollow = reader.LJJIIZI();
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
        return loginGuideConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LoginGuideConfig loginGuideConfig) {
        LoginGuideConfig loginGuideConfig2 = loginGuideConfig;
        o.LJIIIZ(writer, "writer");
        if (loginGuideConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("from_default");
        writer.LJJ(loginGuideConfig2.fromDefault);
        writer.LJI("from_home_upper_right");
        writer.LJJ(loginGuideConfig2.fromHomeUpperRight);
        writer.LJI("from_follow");
        writer.LJJ(loginGuideConfig2.fromFollow);
        writer.LJI("from_favorite");
        writer.LJJ(loginGuideConfig2.fromFavorite);
        writer.LJI("from_comment");
        writer.LJJ(loginGuideConfig2.fromComment);
        writer.LJI("image_url_from_default");
        writer.LJJ(loginGuideConfig2.imageUrlFromDefault);
        writer.LJI("image_url_from_home_upper_right");
        writer.LJJ(loginGuideConfig2.imageUrlFromHomeUpperRight);
        writer.LJI("image_url_from_follow");
        writer.LJJ(loginGuideConfig2.imageUrlFromFollow);
        writer.LJI("image_url_from_favorite");
        writer.LJJ(loginGuideConfig2.imageUrlFromFavorite);
        writer.LJI("image_url_from_comment");
        writer.LJJ(loginGuideConfig2.imageUrlFromComment);
        writer.LJFF();
    }
}
