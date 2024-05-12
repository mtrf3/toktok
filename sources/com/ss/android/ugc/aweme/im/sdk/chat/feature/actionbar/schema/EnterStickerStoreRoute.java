package com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.schema;

import X.AbstractC91523iW;
import X.ActivityC45651qj;
import X.C113644d6;
import X.C45804HyK;
import X.C47261Igj;
import X.C84683Ua;
import X.C87393br;
import X.C88003cq;
import X.C88113d1;
import X.C91093hp;
import X.EnumC91113hr;
import android.content.Context;
import android.os.Bundle;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class EnterStickerStoreRoute extends AbstractC91523iW {
    @Override // X.AbstractC91523iW
    public List<String> getParamsList() {
        return C47261Igj.LJJIJ("conversation_id");
    }

    @Override // X.AbstractC91523iW
    public boolean doAction(Context context, String str, Bundle bundle) {
        ActivityC45651qj LJJIFFI;
        String param;
        List LJJIJ;
        o.LJIIIZ(bundle, "bundle");
        if (context == null || (LJJIFFI = C45804HyK.LJJIFFI(context)) == null || (param = getParam("conversation_id")) == null) {
            return false;
        }
        if (C113644d6.LIZIZ()) {
            LJJIJ = C47261Igj.LJJIJIIJI(Integer.valueOf(EnumC91113hr.VIDEO_STICKER.getType()), Integer.valueOf(EnumC91113hr.STICKER_SET.getType()));
        } else {
            LJJIJ = C47261Igj.LJJIJ(Integer.valueOf(EnumC91113hr.STICKER_SET.getType()));
        }
        C88113d1.LIZJ(LJJIFFI, LJJIJ, param, bundle);
        C91093hp.LJI();
        C84683Ua.LJFF.LIZIZ(new C88003cq(), true);
        C91093hp.LJIIIIZZ();
        String string = bundle.getString("enter_from");
        if (string == null) {
            string = "chat";
        }
        String string2 = bundle.getString("enter_method");
        if (string2 == null) {
            string2 = "action_bar";
        }
        C87393br.LJIJJ(string, string2);
        return true;
    }
}
