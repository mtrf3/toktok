package X;

import com.ss.ugc.effectplatform.model.CategoryEffectModel;
import com.ss.ugc.effectplatform.model.CategoryPageModel;
import com.ss.ugc.effectplatform.model.DiffEffect;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.PanelInfoModel;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import com.ss.ugc.effectplatform.model.UrlModel;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import defpackage.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes16.dex */
public final class XDM {
    public static final XDM LIZ = new XDM();

    public static String LIZLLL(ProviderEffect effect) {
        String video_360p_url;
        String video_480p_url;
        String video_720p_url;
        String video_1080p_url;
        String url;
        o.LJIIJ(effect, "effect");
        if (o.LJ(effect.getMedia_source(), String.valueOf(EnumC35455Dvn.TopTiktok.ordinal() + 1))) {
            ProviderEffect.Video video = effect.getVideo();
            if (video == null) {
                return null;
            }
            return video.getVideo_toptiktok_url();
        }
        Integer library_material_type = effect.getLibrary_material_type();
        int typeOrdinal = XDQ.VIDEO_CLIP.getTypeOrdinal();
        if (library_material_type == null || library_material_type.intValue() != typeOrdinal) {
            Integer library_material_type2 = effect.getLibrary_material_type();
            int typeOrdinal2 = XDQ.GIF.getTypeOrdinal();
            if (library_material_type2 == null || library_material_type2.intValue() != typeOrdinal2) {
                ProviderEffect.StickerBean sticker_info = effect.getSticker_info();
                if (sticker_info == null || (url = sticker_info.getUrl()) == null) {
                    return "";
                }
                return url;
            }
            String material_mp4_url = effect.getMaterial_mp4_url();
            if (material_mp4_url == null) {
                return "";
            }
            return material_mp4_url;
        }
        ProviderEffect.Video video2 = effect.getVideo();
        if (video2 == null || (video_1080p_url = video2.getVideo_1080p_url()) == null || ujb.o.LJJJJJL(video_1080p_url)) {
            ProviderEffect.Video video3 = effect.getVideo();
            if (video3 == null || (video_720p_url = video3.getVideo_720p_url()) == null || ujb.o.LJJJJJL(video_720p_url)) {
                ProviderEffect.Video video4 = effect.getVideo();
                if (video4 == null || (video_480p_url = video4.getVideo_480p_url()) == null || ujb.o.LJJJJJL(video_480p_url)) {
                    ProviderEffect.Video video5 = effect.getVideo();
                    if (video5 == null || (video_360p_url = video5.getVideo_360p_url()) == null || ujb.o.LJJJJJL(video_360p_url)) {
                        return "";
                    }
                    ProviderEffect.Video video6 = effect.getVideo();
                    if (video6 == null) {
                        return null;
                    }
                    return video6.getVideo_360p_url();
                }
                ProviderEffect.Video video7 = effect.getVideo();
                if (video7 == null) {
                    return null;
                }
                return video7.getVideo_480p_url();
            }
            ProviderEffect.Video video8 = effect.getVideo();
            if (video8 == null) {
                return null;
            }
            return video8.getVideo_720p_url();
        }
        ProviderEffect.Video video9 = effect.getVideo();
        if (video9 == null) {
            return null;
        }
        return video9.getVideo_1080p_url();
    }

    public static List LJ(UrlModel urlModel) {
        if (urlModel == null || LJI(urlModel)) {
            return new ArrayList();
        }
        return urlModel.getUrl_list();
    }

    public static boolean LJFF(Effect effect) {
        UrlModel urlModel;
        if (effect == null) {
            return false;
        }
        if (C78966Uyw.LJIILL(effect)) {
            DiffEffect file_diff = effect.getFile_diff();
            UrlModel urlModel2 = null;
            if (file_diff != null) {
                urlModel = file_diff.getBase_url();
            } else {
                urlModel = null;
            }
            DiffEffect file_diff2 = effect.getFile_diff();
            if (file_diff2 != null) {
                urlModel2 = file_diff2.getDiff_url();
            }
            if (urlModel == null || urlModel2 == null || LJI(urlModel) || LJI(urlModel2)) {
                return false;
            }
            return true;
        }
        return !LJI(effect.getFile_url());
    }

    public static boolean LJI(UrlModel urlModel) {
        List<String> url_list;
        if (urlModel == null || (url_list = urlModel.getUrl_list()) == null || url_list.isEmpty()) {
            return true;
        }
        return false;
    }

    public static List LIZ(List list, String str) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(str2);
                LIZ2.append(str);
                arrayList.add(X1D.LIZIZ(LIZ2));
            }
            return arrayList;
        }
        return null;
    }

    public static void LJIIIIZZ(String parentDir, ProviderEffect effect) {
        String str;
        String LIZIZ;
        String video_360p_url;
        o.LJIIJ(parentDir, "parentDir");
        o.LJIIJ(effect, "effect");
        Integer library_material_type = effect.getLibrary_material_type();
        int typeOrdinal = XDQ.VIDEO_CLIP.getTypeOrdinal();
        if (library_material_type == null || library_material_type.intValue() != typeOrdinal) {
            LIZIZ = effect.getId();
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(effect.getId());
            ProviderEffect.Video video = effect.getVideo();
            if (video != null) {
                String video_1080p_url = video.getVideo_1080p_url();
                if (video_1080p_url == null || ujb.o.LJJJJJL(video_1080p_url)) {
                    if (video != null) {
                        String video_720p_url = video.getVideo_720p_url();
                        if (video_720p_url == null || ujb.o.LJJJJJL(video_720p_url)) {
                            if (video != null) {
                                String video_480p_url = video.getVideo_480p_url();
                                if (video_480p_url == null || ujb.o.LJJJJJL(video_480p_url)) {
                                    if (video != null && (video_360p_url = video.getVideo_360p_url()) != null && !ujb.o.LJJJJJL(video_360p_url)) {
                                        str = "360p";
                                    }
                                } else {
                                    str = "480p";
                                }
                            }
                        } else {
                            str = "720p";
                        }
                    }
                } else {
                    str = "1080p";
                }
                LIZ2.append(str);
                LIZIZ = X1D.LIZIZ(LIZ2);
            }
            str = "";
            LIZ2.append(str);
            LIZIZ = X1D.LIZIZ(LIZ2);
        }
        if (effect.getLibrary_material_type() != null) {
            Integer library_material_type2 = effect.getLibrary_material_type();
            int typeOrdinal2 = XDQ.GIPHY_GIFS.getTypeOrdinal();
            if (library_material_type2 == null || library_material_type2.intValue() != typeOrdinal2) {
                Integer library_material_type3 = effect.getLibrary_material_type();
                int typeOrdinal3 = XDQ.GIPHY_STICKERS.getTypeOrdinal();
                if (library_material_type3 == null || library_material_type3.intValue() != typeOrdinal3) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(parentDir);
                    LIZ3.append(C10820be.LIZ);
                    LIZ3.append(LIZIZ);
                    LIZ3.append(".mp4");
                    effect.setPath(X1D.LIZIZ(LIZ3));
                    return;
                }
            }
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(parentDir);
        LIZ4.append(C10820be.LIZ);
        LIZ4.append(LIZIZ);
        LIZ4.append(".gif");
        effect.setPath(X1D.LIZIZ(LIZ4));
    }

    public static void LJIIIZ(String parentDir, List list) {
        String str;
        UrlModel diff_url;
        o.LJIIJ(parentDir, "parentDir");
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Effect effect = (Effect) it.next();
            DiffEffect file_diff = effect.getFile_diff();
            if (file_diff != null && (diff_url = file_diff.getDiff_url()) != null) {
                str = diff_url.getMd5();
            } else {
                str = null;
            }
            if (C78966Uyw.LJIILL(effect) && !C107244Iu.LIZIZ(str)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(parentDir);
                String str2 = C10820be.LIZ;
                LIZ2.append(str2);
                LIZ2.append(str);
                LIZ2.append(".zip");
                effect.setZipPath(X1D.LIZIZ(LIZ2));
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(parentDir);
                LIZ3.append(str2);
                LIZ3.append(str);
                effect.setUnzipPath(X1D.LIZIZ(LIZ3));
            } else {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append(parentDir);
                String str3 = C10820be.LIZ;
                LIZ4.append(str3);
                LIZ4.append(ujb.o.LJJJJZ(ujb.o.LJJJJZ(effect.getId(), "\"", "_", false), "/", "_", false));
                LIZ4.append(".zip");
                effect.setZipPath(X1D.LIZIZ(LIZ4));
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append(parentDir);
                LIZ5.append(str3);
                LIZ5.append(ujb.o.LJJJJZ(ujb.o.LJJJJZ(effect.getId(), "\"", "_", false), "/", "_", false));
                effect.setUnzipPath(X1D.LIZIZ(LIZ5));
            }
            LJIIJJI(effect, parentDir);
        }
    }

    public static void LJIIJ(String str, List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Effect effect = (Effect) it.next();
            if (!C107244Iu.LIZIZ(str)) {
                if (str != null) {
                    effect.setRecId(str);
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            }
        }
    }

    public static void LJIIJJI(Effect effect, String parentDir) {
        String uri;
        o.LJIIJ(parentDir, "parentDir");
        o.LJIIJ(effect, "effect");
        UrlModel trans_file_url = effect.getTrans_file_url();
        if (trans_file_url == null || (uri = trans_file_url.getUri()) == null || ujb.o.LJJJJJL(uri)) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(parentDir);
        LIZ2.append(C10820be.LIZ);
        LIZ2.append(effect.getId());
        LIZ2.append("_trans_");
        LIZ2.append(uri);
        effect.setTransResPath(X1D.LIZIZ(LIZ2));
    }

    public static void LJIIL(String parentDir, List list) {
        String str;
        o.LJIIJ(parentDir, "parentDir");
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InfoStickerEffect infoStickerEffect = (InfoStickerEffect) it.next();
                Integer source = infoStickerEffect.getSource();
                if (source != null) {
                    if (source.intValue() == 1) {
                        Effect loki_effect = infoStickerEffect.getLoki_effect();
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(parentDir);
                        String str2 = C10820be.LIZ;
                        LIZ2.append(str2);
                        LIZ2.append(infoStickerEffect.getLoki_effect().getId());
                        LIZ2.append(".zip");
                        loki_effect.setZipPath(X1D.LIZIZ(LIZ2));
                        Effect loki_effect2 = infoStickerEffect.getLoki_effect();
                        StringBuilder LIZJ = b1.LIZJ(parentDir, str2);
                        LIZJ.append(infoStickerEffect.getLoki_effect().getId());
                        loki_effect2.setUnzipPath(X1D.LIZIZ(LIZJ));
                        XDM xdm = LIZ;
                        Effect loki_effect3 = infoStickerEffect.getLoki_effect();
                        xdm.getClass();
                        LJIIJJI(loki_effect3, parentDir);
                    } else if (source.intValue() == 2) {
                        XDM xdm2 = LIZ;
                        ProviderEffect sticker = infoStickerEffect.getSticker();
                        xdm2.getClass();
                        String LIZLLL = LIZLLL(sticker);
                        if (LIZLLL != null) {
                            int LJJLIIJ = s.LJJLIIJ(LIZLLL, "/", 6);
                            int LJJLIIJ2 = s.LJJLIIJ(LIZLLL, ".", 6);
                            if (1 <= LJJLIIJ && LJJLIIJ2 > LJJLIIJ) {
                                str = LIZLLL.substring(LJJLIIJ2, LIZLLL.length());
                                o.LJFF(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                ProviderEffect sticker2 = infoStickerEffect.getSticker();
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append(parentDir);
                                LIZ3.append(C10820be.LIZ);
                                LIZ3.append(infoStickerEffect.getSticker().getId());
                                LIZ3.append(str);
                                sticker2.setPath(X1D.LIZIZ(LIZ3));
                            }
                        }
                        str = "";
                        ProviderEffect sticker22 = infoStickerEffect.getSticker();
                        StringBuilder LIZ32 = X1D.LIZ();
                        LIZ32.append(parentDir);
                        LIZ32.append(C10820be.LIZ);
                        LIZ32.append(infoStickerEffect.getSticker().getId());
                        LIZ32.append(str);
                        sticker22.setPath(X1D.LIZIZ(LIZ32));
                    }
                }
            }
        }
    }

    public static void LJIILIIL(List list, List list2) {
        List list3;
        List list4;
        List list5;
        Integer url_sub_type;
        Integer url_sub_type2;
        Integer url_sub_type3;
        if (list2 == null) {
            return;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Effect effect = (Effect) it.next();
            if (effect.getFile_url().getUrl_sub_type() == null || ((url_sub_type3 = effect.getFile_url().getUrl_sub_type()) != null && url_sub_type3.intValue() == 0)) {
                if (effect.getFile_url().getUri() != null) {
                    if (effect.getFile_url().getUrl_prefix() != null && (!r0.isEmpty())) {
                        list3 = effect.getFile_url().getUrl_prefix();
                    } else {
                        list3 = list;
                    }
                    if (list3 != null && !list3.isEmpty()) {
                        UrlModel file_url = effect.getFile_url();
                        XDM xdm = LIZ;
                        String uri = effect.getFile_url().getUri();
                        xdm.getClass();
                        List<String> LIZ2 = LIZ(list3, uri);
                        if (LIZ2 == null) {
                            LIZ2 = new ArrayList<>();
                        }
                        file_url.setUrl_list(LIZ2);
                    }
                } else {
                    C12310e3 c12310e3 = C12310e3.LIZIZ;
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("effect ");
                    LIZ3.append(effect.getId());
                    LIZ3.append(" file uri is null");
                    String LIZIZ = X1D.LIZIZ(LIZ3);
                    c12310e3.getClass();
                    C12310e3.LIZIZ("EffectUtils", LIZIZ, null);
                }
            }
            if (effect.getIcon_url().getUrl_sub_type() == null || ((url_sub_type2 = effect.getIcon_url().getUrl_sub_type()) != null && url_sub_type2.intValue() == 0)) {
                if (effect.getIcon_url().getUri() != null) {
                    if (effect.getIcon_url().getUrl_prefix() != null && (!r0.isEmpty())) {
                        list4 = effect.getIcon_url().getUrl_prefix();
                    } else {
                        list4 = list;
                    }
                    if (list4 != null && !list4.isEmpty()) {
                        UrlModel icon_url = effect.getIcon_url();
                        XDM xdm2 = LIZ;
                        String uri2 = effect.getIcon_url().getUri();
                        xdm2.getClass();
                        List<String> LIZ4 = LIZ(list4, uri2);
                        if (LIZ4 == null) {
                            LIZ4 = new ArrayList<>();
                        }
                        icon_url.setUrl_list(LIZ4);
                    }
                } else {
                    C12310e3 c12310e32 = C12310e3.LIZIZ;
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("effect ");
                    LIZ5.append(effect.getId());
                    LIZ5.append(" icon uri is null");
                    String LIZIZ2 = X1D.LIZIZ(LIZ5);
                    c12310e32.getClass();
                    C12310e3.LIZIZ("EffectUtils", LIZIZ2, null);
                }
            }
            List<String> url_list = effect.getHint_icon().getUrl_list();
            if (url_list != null && !url_list.isEmpty() && (effect.getHint_icon().getUrl_sub_type() == null || ((url_sub_type = effect.getHint_icon().getUrl_sub_type()) != null && url_sub_type.intValue() == 0))) {
                if (effect.getHint_icon().getUrl_prefix() != null && (!r0.isEmpty())) {
                    list5 = effect.getHint_icon().getUrl_prefix();
                } else {
                    list5 = list;
                }
                if (list5 != null && !list5.isEmpty()) {
                    UrlModel hint_icon = effect.getHint_icon();
                    List<String> LIZ6 = LIZ(list5, effect.getHint_icon().getUri());
                    if (LIZ6 == null) {
                        LIZ6 = new ArrayList<>();
                    }
                    hint_icon.setUrl_list(LIZ6);
                }
            }
            UrlModel trans_file_url = effect.getTrans_file_url();
            if (trans_file_url != null) {
                String uri3 = trans_file_url.getUri();
                if (uri3 == null || ujb.o.LJJJJJL(uri3)) {
                    return;
                }
                XDM xdm3 = LIZ;
                String uri4 = trans_file_url.getUri();
                xdm3.getClass();
                List<String> LIZ7 = LIZ(list, uri4);
                if (LIZ7 != null) {
                    trans_file_url.setUrl_list(LIZ7);
                }
            }
        }
    }

    public static void LJII(String parentDir, String str, List list) {
        String str2;
        String str3;
        UrlModel diff_url;
        o.LJIIJ(parentDir, "parentDir");
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Effect effect = (Effect) it.next();
            DiffEffect file_diff = effect.getFile_diff();
            if (file_diff != null && (diff_url = file_diff.getDiff_url()) != null) {
                str2 = diff_url.getMd5();
            } else {
                str2 = null;
            }
            if (C78966Uyw.LJIILL(effect) && !C107244Iu.LIZIZ(str2)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(parentDir);
                String str4 = C10820be.LIZ;
                LIZ2.append(str4);
                LIZ2.append(str2);
                LIZ2.append(".zip");
                effect.setZipPath(X1D.LIZIZ(LIZ2));
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(parentDir);
                LIZ3.append(str4);
                LIZ3.append(str2);
                effect.setUnzipPath(X1D.LIZIZ(LIZ3));
            } else {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append(parentDir);
                String str5 = C10820be.LIZ;
                LIZ4.append(str5);
                LIZ4.append(effect.getId());
                LIZ4.append(".zip");
                effect.setZipPath(X1D.LIZIZ(LIZ4));
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append(parentDir);
                LIZ5.append(str5);
                LIZ5.append(effect.getId());
                effect.setUnzipPath(X1D.LIZIZ(LIZ5));
            }
            if (str != null) {
                str3 = str;
            } else {
                str3 = "";
            }
            effect.setPanel(str3);
            LJIIJJI(effect, parentDir);
        }
    }

    public static void LIZIZ(XCG effectConfig, String panel, CategoryPageModel categoryPageModel, boolean z) {
        String rec_id;
        List<Effect> list;
        List<Effect> list2;
        o.LJIIJ(effectConfig, "effectConfig");
        o.LJIIJ(panel, "panel");
        CategoryEffectModel category_effects = categoryPageModel.getCategory_effects();
        if (category_effects != null) {
            LJII(effectConfig.LJIIIIZZ, panel, category_effects.getCategory_effects());
            LJII(effectConfig.LJIIIIZZ, panel, category_effects.getCollection());
            LJII(effectConfig.LJIIIIZZ, panel, category_effects.getBind_effects());
            if (z || effectConfig.LJIIZILJ == 2) {
                LJIILIIL(categoryPageModel.getUrl_prefix(), category_effects.getCategory_effects());
                LJIILIIL(categoryPageModel.getUrl_prefix(), category_effects.getCollection());
                LJIILIIL(categoryPageModel.getUrl_prefix(), category_effects.getBind_effects());
            }
            CategoryPageModel.Extra extra = categoryPageModel.getExtra();
            if (extra != null && (rec_id = extra.getRec_id()) != null) {
                XDM xdm = LIZ;
                CategoryEffectModel category_effects2 = categoryPageModel.getCategory_effects();
                List<Effect> list3 = null;
                if (category_effects2 != null) {
                    list = category_effects2.getCategory_effects();
                } else {
                    list = null;
                }
                xdm.getClass();
                LJIIJ(rec_id, list);
                CategoryEffectModel category_effects3 = categoryPageModel.getCategory_effects();
                if (category_effects3 != null) {
                    list2 = category_effects3.getCollection();
                } else {
                    list2 = null;
                }
                LJIIJ(rec_id, list2);
                CategoryEffectModel category_effects4 = categoryPageModel.getCategory_effects();
                if (category_effects4 != null) {
                    list3 = category_effects4.getBind_effects();
                }
                LJIIJ(rec_id, list3);
            }
        }
    }

    public static void LIZJ(XCG effectConfig, String panel, PanelInfoModel panelInfoModel, boolean z) {
        String rec_id;
        o.LJIIJ(effectConfig, "effectConfig");
        o.LJIIJ(panel, "panel");
        CategoryEffectModel category_effects = panelInfoModel.getCategory_effects();
        if (category_effects != null) {
            LJII(effectConfig.LJIIIIZZ, panel, category_effects.getCategory_effects());
            LJII(effectConfig.LJIIIIZZ, panel, category_effects.getCollection());
            LJII(effectConfig.LJIIIIZZ, panel, category_effects.getBind_effects());
            if (z || effectConfig.LJIIZILJ == 2) {
                LJIILIIL(panelInfoModel.getUrl_prefix(), category_effects.getCategory_effects());
                LJIILIIL(panelInfoModel.getUrl_prefix(), category_effects.getCollection());
                LJIILIIL(panelInfoModel.getUrl_prefix(), category_effects.getBind_effects());
            }
            PanelInfoModel.Extra extra = panelInfoModel.getExtra();
            if (extra != null && (rec_id = extra.getRec_id()) != null) {
                XDM xdm = LIZ;
                List<Effect> category_effects2 = category_effects.getCategory_effects();
                xdm.getClass();
                LJIIJ(rec_id, category_effects2);
                LJIIJ(rec_id, category_effects.getCollection());
                LJIIJ(rec_id, category_effects.getBind_effects());
            }
        }
    }
}
