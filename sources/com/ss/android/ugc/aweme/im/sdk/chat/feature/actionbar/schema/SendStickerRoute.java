package com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.schema;

import X.AbstractC91523iW;
import X.C113554cx;
import X.C16880lQ;
import X.C47261Igj;
import X.C4FC;
import X.C76800UCe;
import X.C92023jK;
import X.C92033jL;
import X.InterfaceC88472Yns;
import X.OSZ;
import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SendStickerRoute extends AbstractC91523iW {
    @Override // X.AbstractC91523iW
    public List<String> getParamsList() {
        return C47261Igj.LJJIJIIJI("conversation_id", "sticker_id");
    }

    private final void asyncGetEmoji(boolean z, long j, InterfaceC88472Yns<? super Emoji, C76800UCe> interfaceC88472Yns) {
        if (z) {
            C4FC.LIZ(j, new AqS167S0100000_1(interfaceC88472Yns, (InterfaceC88472Yns<? super FrameLayout, C76800UCe>) 59));
        } else {
            C4FC.LIZ(j, interfaceC88472Yns);
        }
    }

    @Override // X.AbstractC91523iW
    public boolean doAction(Context context, String str, Bundle bundle) {
        String str2;
        boolean z;
        o.LJIIIZ(bundle, "bundle");
        OSZ[] oszArr = new OSZ[1];
        Object LLJJIII = C16880lQ.LLJJIII(bundle, "a:src");
        if (LLJJIII == null || (str2 = LLJJIII.toString()) == null) {
            str2 = "action_bar:sticker";
        }
        oszArr[0] = new OSZ("a:src", str2);
        Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        LinkedHashMap linkedHashMap = (LinkedHashMap) LJJLIIIIJ;
        if (o.LJ(linkedHashMap.get("a:src"), "action_bar:nudge") || o.LJ(linkedHashMap.get("a:src"), "action_bar:nudge_back")) {
            z = true;
        } else {
            z = false;
        }
        String param = getParam("sticker_id");
        if (param == null) {
            return false;
        }
        long parseLong = CastLongProtector.parseLong(param);
        asyncGetEmoji(z, parseLong, new C92033jL(this, context, bundle, z, parseLong, LJJLIIIIJ));
        return true;
    }

    public final Map<String, String> getLocalExtMap(String str, Bundle bundle, boolean z, long j) {
        String obj;
        Map<String, String> LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("interaction_type", "quick_reaction"), new OSZ("interaction_name", str), new OSZ("sticker_id", String.valueOf(j)));
        if (!z) {
            return LJJLIIIIJ;
        }
        for (String str2 : C92023jK.LIZIZ) {
            Object LLJJIII = C16880lQ.LLJJIII(bundle, str2);
            if (LLJJIII != null && (obj = LLJJIII.toString()) != null) {
                LJJLIIIIJ.put(str2, obj);
            } else {
                LJJLIIIIJ.remove(str2);
            }
        }
        return LJJLIIIIJ;
    }
}
