package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C113554cx;
import X.C47261Igj;
import X.C51029K0z;
import X.EnumC74991Tbv;
import X.OSZ;
import android.graphics.RectF;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcMixBitrateSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes14.dex */
public final class DslLayoutKt {
    public static final Layout FLOAT;
    public static final Layout FLOAT_FIX;
    public static final Layout GRID_FIX;
    public static final Layout GRID_FLOAT;
    public static final DslLayout defaultDsl;
    public static final Layout normalDsl;

    static {
        Insets insets = new Insets(null, C47261Igj.LJJIJIIJI(0, 130, 0, 56), 0.66f, "center", "top_center", "fill_width", 0.0f, 64, null);
        Insets insets2 = new Insets(null, C47261Igj.LJJIJIIJI(0, 0, 0, 0), 0.66f, "center", "center", "fill_width", 0.0f, 64, null);
        Insets insets3 = new Insets(null, C47261Igj.LJJIJIIJI(0, 130, 0, 56), 0.66f, "center", "top_center", "fill_width", 0.0f, 64, null);
        Insets insets4 = new Insets(null, C47261Igj.LJJIJIIJI(0, 130, 0, 64), 0.66f, "center", "top_center", "fill_width", 0.0f, 64, null);
        Insets insets5 = new Insets(null, C47261Igj.LJJIJIIJI(0, 130, 0, 56), 0.66f, "center", "top_center", "fill_width", 0.0f, 64, null);
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(0.331f);
        Float valueOf3 = Float.valueOf(0.498f);
        Float valueOf4 = Float.valueOf(0.336f);
        Float valueOf5 = Float.valueOf(0.667f);
        Float valueOf6 = Float.valueOf(0.672f);
        Float valueOf7 = Float.valueOf(1.0f);
        Float valueOf8 = Float.valueOf(0.502f);
        Layout layout = new Layout(6, "fix", "1004", "9002", "1004", insets, insets2, insets3, insets4, insets5, C51029K0z.LJJIIZI(new OSZ("c6", C113554cx.LJJL(new OSZ("1", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf, valueOf, valueOf2, valueOf3), "res", null, null, 12, null)), new OSZ("2", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf4, valueOf, valueOf5, valueOf3), "res", null, null, 12, null)), new OSZ("3", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf6, valueOf, valueOf7, valueOf3), "res", null, null, 12, null)), new OSZ("4", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf, valueOf8, valueOf2, valueOf7), "res", null, null, 12, null)), new OSZ("5", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf4, valueOf8, valueOf5, valueOf7), "res", null, null, 12, null)), new OSZ("6", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf6, valueOf8, valueOf7, valueOf7), "res", null, null, 12, null))))), C51029K0z.LJJIIZI(new OSZ("c6", C47261Igj.LJJIJIIJI(new RectF(0.0f, 0.498f, 1.0f, 0.502f), new RectF(0.331f, 0.0f, 0.336f, 1.0f), new RectF(0.667f, 0.0f, 0.672f, 1.0f)))), C51029K0z.LJJIIZI(new OSZ("res", new Resolution(240, 540, 15, LiveMaxRetainAlogMessageSizeSetting.DEFAULT, "linkmic_grid_fix_6", 240, 540, null, 128, null))), 0, 0, false, "grid_fix", null, 188416, null);
        GRID_FIX = layout;
        Insets insets6 = new Insets(null, C47261Igj.LJJIJIIJI(0, 130, 0, 58), 0.666f, "center", "top_center", "fill_width", 0.0f, 64, null);
        Insets insets7 = new Insets(null, C47261Igj.LJJIJIIJI(0, 0, 0, 0), 0.666f, "center", "center", "fill_width", 0.0f, 64, null);
        Insets insets8 = new Insets(null, C47261Igj.LJJIJIIJI(0, 130, 0, 58), 0.666f, "center", "top_center", "fill_width", 0.0f, 64, null);
        Insets insets9 = new Insets(null, C47261Igj.LJJIJIIJI(0, 130, 0, 66), 0.666f, "center", "top_center", "fill_width", 0.0f, 64, null);
        Insets insets10 = new Insets(null, C47261Igj.LJJIJIIJI(0, 130, 0, 58), 0.666f, "center", "top_center", "fill_width", 0.0f, 64, null);
        OSZ[] oszArr = {new OSZ("1", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf, valueOf, valueOf7, valueOf3), "res_2", null, null, 12, null)), new OSZ("2", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf, valueOf8, valueOf7, valueOf7), "res_2", null, null, 12, null))};
        Float valueOf9 = Float.valueOf(0.499f);
        Float valueOf10 = Float.valueOf(0.504f);
        Layout layout2 = new Layout(6, "float", "1003", "9002", "1003", insets6, insets7, insets8, insets9, insets10, C113554cx.LJJL(new OSZ("c1", C51029K0z.LJJIIZI(new OSZ("1", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf, valueOf, valueOf7, valueOf7), "res_1", null, null, 12, null)))), new OSZ("c2", C113554cx.LJJL(oszArr)), new OSZ("c3", C113554cx.LJJL(new OSZ("1", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf, valueOf, valueOf7, valueOf3), "res_3_main", null, null, 12, null)), new OSZ("2", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf, valueOf8, valueOf9, valueOf7), "res_3", null, null, 12, null)), new OSZ("3", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf10, valueOf8, valueOf7, valueOf7), "res_3", null, null, 12, null)))), new OSZ("c4", C113554cx.LJJL(new OSZ("1", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf, valueOf, valueOf9, valueOf3), "res_4", null, null, 12, null)), new OSZ("2", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf10, valueOf, valueOf7, valueOf3), "res_4", null, null, 12, null)), new OSZ("3", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf, valueOf8, valueOf9, valueOf7), "res_4", null, null, 12, null)), new OSZ("4", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf10, valueOf8, valueOf7, valueOf7), "res_4", null, null, 12, null)))), new OSZ("c5", C113554cx.LJJL(new OSZ("1", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf, valueOf, valueOf9, valueOf3), "res_5_main", null, null, 12, null)), new OSZ("2", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf10, valueOf, valueOf7, valueOf3), "res_5_main", null, null, 12, null)), new OSZ("3", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf, valueOf8, valueOf2, valueOf7), "res_5", null, null, 12, null)), new OSZ("4", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf4, valueOf8, valueOf5, valueOf7), "res_5", null, null, 12, null)), new OSZ("5", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf6, valueOf8, valueOf7, valueOf7), "res_5", null, null, 12, null)))), new OSZ("c6", C113554cx.LJJL(new OSZ("1", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf, valueOf, valueOf2, valueOf3), "res_6", null, null, 12, null)), new OSZ("2", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf4, valueOf, valueOf5, valueOf3), "res_6", null, null, 12, null)), new OSZ("3", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf6, valueOf, valueOf7, valueOf3), "res_6", null, null, 12, null)), new OSZ("4", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf, valueOf8, valueOf2, valueOf7), "res_6", null, null, 12, null)), new OSZ("5", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf4, valueOf8, valueOf5, valueOf7), "res_6", null, null, 12, null)), new OSZ("6", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf6, valueOf8, valueOf7, valueOf7), "res_6", null, null, 12, null))))), C113554cx.LJJL(new OSZ("c2", C47261Igj.LJJIJ(new RectF(0.0f, 0.498f, 1.0f, 0.502f))), new OSZ("c3", C47261Igj.LJJIJIIJI(new RectF(0.0f, 0.498f, 1.0f, 0.502f), new RectF(0.499f, 0.502f, 0.504f, 1.0f))), new OSZ("c4", C47261Igj.LJJIJIIJI(new RectF(0.0f, 0.498f, 1.0f, 0.502f), new RectF(0.499f, 0.0f, 0.504f, 1.0f))), new OSZ("c5", C47261Igj.LJJIJIIJI(new RectF(0.0f, 0.498f, 1.0f, 0.502f), new RectF(0.499f, 0.0f, 0.504f, 0.498f), new RectF(0.331f, 0.502f, 0.336f, 1.0f), new RectF(0.667f, 0.502f, 0.672f, 1.0f))), new OSZ("c6", C47261Igj.LJJIJIIJI(new RectF(0.0f, 0.498f, 1.0f, 0.502f), new RectF(0.331f, 0.0f, 0.336f, 1.0f), new RectF(0.667f, 0.0f, 0.672f, 1.0f)))), C113554cx.LJJL(new OSZ("res_1", new Resolution(720, 1280, 15, LiveNetAdaptiveHurryTimeSetting.DEFAULT, "linkmic_grid_float_1", 720, 1280, null, 128, null)), new OSZ("res_2", new Resolution(720, 540, 15, LinkMicRtcMixBitrateSetting.DEFAULT, "linkmic_grid_float_2", 720, 540, null, 128, null)), new OSZ("res_3_main", new Resolution(720, 540, 15, LinkMicRtcMixBitrateSetting.DEFAULT, "linkmic_grid_float_3_main", 720, 540, null, 128, null)), new OSZ("res_3", new Resolution(360, 540, 15, 650, "linkmic_grid_float_3", 360, 540, null, 128, null)), new OSZ("res_4", new Resolution(360, 540, 15, 650, "linkmic_grid_float_4", 360, 540, null, 128, null)), new OSZ("res_5_main", new Resolution(360, 540, 15, 650, "linkmic_grid_float_5_main", 360, 540, null, 128, null)), new OSZ("res_5", new Resolution(240, 240, 15, LiveMaxRetainAlogMessageSizeSetting.DEFAULT, "linkmic_grid_float_5", 240, 240, null, 128, null)), new OSZ("res_6", new Resolution(240, 540, 15, LiveMaxRetainAlogMessageSizeSetting.DEFAULT, "linkmic_grid_float_6", 240, 540, null, 128, null))), 0, 0, false, "grid_float", null, 188416, null);
        GRID_FLOAT = layout2;
        Insets insets11 = new Insets(null, C47261Igj.LJJIJIIJI(0, 130, 0, 56), 0.909f, "center", "right_center", "fill_height", 0.0f, 64, null);
        Insets insets12 = new Insets(null, C47261Igj.LJJIJIIJI(0, 0, 0, 0), 0.909f, "center", "center", "fit", 0.0f, 64, null);
        Insets insets13 = new Insets(null, C47261Igj.LJJIJIIJI(0, 130, 0, 56), 0.909f, "center", "right_center", "fill_height", 0.0f, 64, null);
        Insets insets14 = new Insets(null, C47261Igj.LJJIJIIJI(0, 130, 0, 64), 0.909f, "center", "right_center", "fill_height", 0.0f, 64, null);
        Insets insets15 = new Insets(null, C47261Igj.LJJIJIIJI(0, 130, 0, 56), 0.909f, "center", "right_center", "fill_height", 0.0f, 64, null);
        Float[] fArr = {valueOf, valueOf, Float.valueOf(0.772f), valueOf7};
        Float valueOf11 = Float.valueOf(0.778f);
        Layout layout3 = new Layout(5, "fix", "1002", "9001", "1002", insets11, insets12, insets13, insets14, insets15, C51029K0z.LJJIIZI(new OSZ("c5", C113554cx.LJJL(new OSZ("1", new LayoutArray(C47261Igj.LJJIJIIJI(fArr), "res_main", null, null, 12, null)), new OSZ("2", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf11, valueOf, valueOf7, Float.valueOf(0.245f)), "res", null, null, 12, null)), new OSZ("3", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf11, Float.valueOf(0.25f), valueOf7, Float.valueOf(0.495f)), "res", null, null, 12, null)), new OSZ("4", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf11, Float.valueOf(0.5f), valueOf7, Float.valueOf(0.747f)), "res", null, null, 12, null)), new OSZ("5", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf11, Float.valueOf(0.753f), valueOf7, valueOf7), "res", null, null, 12, null))))), C51029K0z.LJJIIZI(new OSZ("c5", C47261Igj.LJJIJIIJI(new RectF(0.772f, 0.0f, 0.778f, 1.0f), new RectF(0.778f, 0.245f, 1.0f, 0.25f), new RectF(0.778f, 0.495f, 1.0f, 0.5f), new RectF(0.778f, 0.747f, 1.0f, 0.753f)))), C113554cx.LJJL(new OSZ("res_main", new Resolution(540, 960, 15, LinkMicRtcMixBitrateSetting.DEFAULT, "linkmic_panel_fix_5_main", 540, 960, null, 128, null)), new OSZ("res", new Resolution(240, 320, 15, LiveChatShowDelayForHotLiveSetting.DEFAULT, "linkmic_panel_fix_5", 240, 320, null, 128, null))), 0, 0, false, "panel_fix", null, 188416, null);
        FLOAT_FIX = layout3;
        Insets insets16 = new Insets(null, C47261Igj.LJJIJIIJI(0, 0, 0, 0), 0.5625f, "center", "right_center", "fill_height", 0.0f, 64, null);
        Insets insets17 = new Insets(null, C47261Igj.LJJIJIIJI(0, 0, 0, 0), 0.5625f, "center", "center", "fit", 0.0f, 64, null);
        Insets insets18 = new Insets(null, C47261Igj.LJJIJIIJI(0, 0, 0, 0), 0.5625f, "center", "right_center", "fill_height", 0.0f, 64, null);
        Insets insets19 = new Insets(null, C47261Igj.LJJIJIIJI(0, 0, 0, 0), 0.5625f, "center", "right_center", "fill_height", 0.0f, 64, null);
        Insets insets20 = new Insets(null, C47261Igj.LJJIJIIJI(0, 0, 0, 0), 0.5625f, "center", "right_center", "fill_height", 0.0f, 64, null);
        Float valueOf12 = Float.valueOf(0.75f);
        Float valueOf13 = Float.valueOf(0.728f);
        Float valueOf14 = Float.valueOf(0.978f);
        Float valueOf15 = Float.valueOf(0.878f);
        Layout layout4 = new Layout(5, "float", "1001", "9001", "1001", insets16, insets17, insets18, insets19, insets20, C113554cx.LJJL(new OSZ("c1", C51029K0z.LJJIIZI(new OSZ("1", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf, valueOf, valueOf7, valueOf7), "res_main", null, null, 12, null)))), new OSZ("c2", C113554cx.LJJL(new OSZ("1", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf, valueOf, valueOf7, valueOf7), "res_main", null, null, 12, null)), new OSZ("2", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf12, valueOf13, valueOf14, valueOf15), "res", null, null, 12, null)))), new OSZ("c3", C113554cx.LJJL(new OSZ("1", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf, valueOf, valueOf7, valueOf7), "res_main", null, null, 12, null)), new OSZ("2", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf12, valueOf13, valueOf14, valueOf15), "res", null, null, 12, null)), new OSZ("3", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf12, Float.valueOf(0.572f), valueOf14, Float.valueOf(0.722f)), "res", null, null, 12, null)))), new OSZ("c4", C113554cx.LJJL(new OSZ("1", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf, valueOf, valueOf7, valueOf7), "res_main", null, null, 12, null)), new OSZ("2", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf12, valueOf13, valueOf14, valueOf15), "res", null, null, 12, null)), new OSZ("3", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf12, Float.valueOf(0.572f), valueOf14, Float.valueOf(0.722f)), "res", null, null, 12, null)), new OSZ("4", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf12, Float.valueOf(0.416f), valueOf14, Float.valueOf(0.566f)), "res", null, null, 12, null)))), new OSZ("c5", C113554cx.LJJL(new OSZ("1", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf, valueOf, valueOf7, valueOf7), "res_main", null, null, 12, null)), new OSZ("2", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf12, valueOf13, valueOf14, valueOf15), "res", null, null, 12, null)), new OSZ("3", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf12, Float.valueOf(0.572f), valueOf14, Float.valueOf(0.722f)), "res", null, null, 12, null)), new OSZ("4", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf12, Float.valueOf(0.416f), valueOf14, Float.valueOf(0.566f)), "res", null, null, 12, null)), new OSZ("5", new LayoutArray(C47261Igj.LJJIJIIJI(valueOf12, Float.valueOf(0.26f), valueOf14, Float.valueOf(0.41f)), "res", null, null, 12, null))))), C113554cx.LJJJLIIL(), C113554cx.LJJL(new OSZ("res_main", new Resolution(720, 1280, 15, LiveNetAdaptiveHurryTimeSetting.DEFAULT, "linkmic_panel_float_5_main", 720, 1280, null, 128, null)), new OSZ("res", new Resolution(360, 360, 15, LiveMaxRetainAlogMessageSizeSetting.DEFAULT, "linkmic_panel_float_5", 360, 360, null, 128, null))), 0, 0, false, "panel_float", null, 188416, null);
        FLOAT = layout4;
        defaultDsl = new DslLayout(4, -1, C113554cx.LJJL(new OSZ(EnumC74991Tbv.GRID_FIX.getBusinessType(), layout), new OSZ(EnumC74991Tbv.GRID_FLOAT.getBusinessType(), layout2), new OSZ(EnumC74991Tbv.FLOAT.getBusinessType(), layout4), new OSZ(EnumC74991Tbv.FLOAT_FIX.getBusinessType(), layout3)));
        normalDsl = new Layout(1, "fix", CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, new Insets(null, C47261Igj.LJIIZILJ(), 1.0f, "", "", "fill", 0.0f, 64, null), new Insets(null, C47261Igj.LJIIZILJ(), 1.0f, "", "", "fit", 0.0f, 64, null), new Insets(null, C47261Igj.LJIIZILJ(), 1.0f, "", "", "fit", 0.0f, 64, null), new Insets(null, C47261Igj.LJIIZILJ(), 1.0f, "", "", "fit", 0.0f, 64, null), new Insets(null, C47261Igj.LJIIZILJ(), 1.0f, "", "", "fit", 0.0f, 64, null), C113554cx.LJJJLIIL(), C113554cx.LJJJLIIL(), C113554cx.LJJJLIIL(), 0, 0, true, "normal", null, 155648, null);
    }

    public static final DslLayout getDefaultDsl() {
        return defaultDsl;
    }

    public static final Layout getNormalLayout() {
        return normalDsl;
    }
}
