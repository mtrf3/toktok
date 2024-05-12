package X;

import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.services.editeffect.EditEffectAnchorManager;
import com.ss.android.ugc.aweme.services.editeffect.EffectAnchorServiceImpl;
import com.ss.android.ugc.aweme.services.editeffect.model.EditEffectAnchorInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class H8G {
    public static OSZ LIZ(VideoPublishEditModel videoPublishEditModel, String str) {
        EditEffectAnchorManager data;
        String str2;
        if (str != null && (data = EffectAnchorServiceImpl.createIEffectAnchorServicebyMonsterPlugin(false).getData(str)) != null && (str2 = videoPublishEditModel.mShootWay) != null) {
            int hashCode = str2.hashCode();
            if (hashCode != -1452478460) {
                if (hashCode != 1441490006) {
                    if (hashCode == 1820168897 && str2.equals("editing_effect_template")) {
                        return new OSZ("is_default_effect_template", LIZIZ(videoPublishEditModel, data.getData()));
                    }
                } else if (str2.equals("editing_effect_page")) {
                    return new OSZ("is_default_effect", LIZIZ(videoPublishEditModel, data.getData()));
                }
            } else if (str2.equals("editing_prop_page")) {
                if (C140395f9.LIZ) {
                    return new OSZ("is_default_effect", LIZIZ(videoPublishEditModel, data.getData()));
                }
                return new OSZ("prop_selected_from", videoPublishEditModel.mShootWay);
            }
        }
        return null;
    }

    public static String LIZIZ(VideoPublishEditModel videoPublishEditModel, List list) {
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((EditEffectAnchorInfo) it.next()).getEffectId());
        }
        ArrayList<EffectPointModel> arrayList2 = videoPublishEditModel.getEditEffectModel().effectList;
        ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList2, 10));
        Iterator<EffectPointModel> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(it2.next().getKey());
        }
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (!arrayList3.contains(it3.next())) {
                    return CardStruct.IStatusCode.DEFAULT;
                }
            }
        }
        return "1";
    }

    public static void LIZLLL(VideoPublishEditModel videoPublishEditModel, boolean z) {
        C145995oB LIZ = C279017q.LIZ(videoPublishEditModel, "model");
        LIZ.LJI("content_source", H7R.LJIIIIZZ(videoPublishEditModel));
        LIZ.LJI("content_type", H7R.LJIIIZ(videoPublishEditModel));
        LIZ.LJI("creation_id", videoPublishEditModel.getCreationId());
        LIZ.LJI("enter_from", videoPublishEditModel.enterFrom);
        LIZ.LJI("shoot_way", videoPublishEditModel.mShootWay);
        LIZ.LIZ(z ? 1 : 0, "is_virtual_feed");
        LIZ.LJI("status", "enterbackground");
        FMX.LJIIL("preview_page_exit_background", LIZ.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0844  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0852  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x087c  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x089d  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x08ad  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x08d1  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x08e8  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0907  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x094d  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0967  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x09b4  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x09cf  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x09da  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0d3a  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x09f8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0a0a  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0a20  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0a46  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0a55  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0a64  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0a6b  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0a91  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0a9d  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0abd  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0ac9  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0ad8  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0b44  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0b70  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0b88  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0bab  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0bc2  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0be0  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0bfe  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0c31  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0c6a  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0c7b  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0cb3  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0ce8  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0cef  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0cf2  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0d0a  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0d0d  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0d10  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0d58  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0d81  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0d84  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0d8d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0d9a  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0da9  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0dbe  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0dc1  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0dde  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0de1  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0de4  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0ded  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0df0  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0df3  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0df6  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0e17  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0e1a  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0e1d  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0e23  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0e26  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0e2c  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0e3c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0e48  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0e4b  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x0e52  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0e65  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0e6b  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0e6e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02c0  */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.5oB] */
    /* JADX WARN: Type inference failed for: r25v1, types: [X.Yns] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r25, boolean r26, boolean r27, java.lang.String r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 3763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H8G.LIZJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, boolean, boolean, java.lang.String, java.lang.String):void");
    }
}
