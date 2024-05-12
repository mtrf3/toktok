package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8SZ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8SZ {
    public static final java.util.Map<? extends Object, Integer> LIZ;

    static {
        EnumC42934Gt8 enumC42934Gt8 = EnumC42934Gt8.TIKTOK_GAME;
        LIZ = C113554cx.LJJL(new OSZ(Integer.valueOf(EnumC42934Gt8.ARTICLE_PHOTO_MODE.getTYPE()), 1), new OSZ(Integer.valueOf(EnumC42934Gt8.ANCHOR_AIGC_AVATAR.getTYPE()), 1), new OSZ(Integer.valueOf(EnumC42934Gt8.ANCHOR_SHOP_WINDOW.getTYPE()), 1), new OSZ(Integer.valueOf(EnumC42934Gt8.ANCHOR_SHOP_LINK.getTYPE()), 1), new OSZ(Integer.valueOf(EnumC42934Gt8.ANCHOR_SHOP_MIX.getTYPE()), 1), new OSZ(Integer.valueOf(enumC42934Gt8.getTYPE()), 2), new OSZ(EnumC42934Gt8.VERTICAL_SOLUTION_GAME, 2), new OSZ(Integer.valueOf(EnumC42934Gt8.PROP.getTYPE()), 4), new OSZ(Integer.valueOf(EnumC42934Gt8.ANCHOR_EDIT_EFFECT.getTYPE()), 4), new OSZ(Integer.valueOf(EnumC42934Gt8.POI.getTYPE()), 3), new OSZ(Integer.valueOf(enumC42934Gt8.getTYPE()), 5), new OSZ(Integer.valueOf(EnumC42934Gt8.ANCHOR_LIBRARY.getTYPE()), 6), new OSZ(Integer.valueOf(EnumC42934Gt8.MV_TEMPLATE.getTYPE()), 7), new OSZ(Integer.valueOf(EnumC42934Gt8.LIVE_EVENT.getTYPE()), 9), new OSZ(Integer.valueOf(EnumC42934Gt8.NEWS.getTYPE()), 10), new OSZ(Integer.valueOf(EnumC42934Gt8.SHOUTOUT.getTYPE()), 11), new OSZ(Integer.valueOf(EnumC42934Gt8.TTS_VOICE.getTYPE()), 12), new OSZ(Integer.valueOf(EnumC42934Gt8.DONATION_STICKER.getTYPE()), 13), new OSZ(Integer.valueOf(EnumC42934Gt8.GREEN_SCREEN.getTYPE()), 14), new OSZ(EnumC42934Gt8.PAID_COLLECTION, 15), new OSZ(EnumC42934Gt8.MUSIC_DSP, 19), new OSZ(EnumC42934Gt8.CAPCUT, 20), new OSZ(EnumC42934Gt8.VIA_MAKER, 20), new OSZ(EnumC42934Gt8.WIKIPEDIA, 26), new OSZ(EnumC42934Gt8.WIKI_ON_EDIT, 29), new OSZ(EnumC42934Gt8.THIRD_PART_GENERAL, 30), new OSZ(Integer.valueOf(EnumC42934Gt8.COMMON_TYPE.getTYPE()), 99), new OSZ(Integer.valueOf(EnumC42934Gt8.NO_TYPE.getTYPE()), 100));
    }

    public static int LIZ(int i) {
        java.util.Map<? extends Object, Integer> map = LIZ;
        if (map.keySet().contains(Integer.valueOf(i))) {
            Integer num = map.get(Integer.valueOf(i));
            o.LJI(num);
            return num.intValue();
        }
        return 101;
    }
}
