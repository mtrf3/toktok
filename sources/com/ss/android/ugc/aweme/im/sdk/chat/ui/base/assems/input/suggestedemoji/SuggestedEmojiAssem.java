package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.suggestedemoji;

import X.C100683xI;
import X.C1043747t;
import X.C17N;
import X.C214298b3;
import X.C221108m2;
import X.C4BH;
import X.C4BI;
import X.C5H3;
import X.C62822Ol8;
import X.XKQ;
import Y.IDObjectS174S0100000_1;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionIconHideTextMinimumDimensionSetting;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.edittext.ChatRoomEditTextAbility;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;

/* loaded from: classes2.dex */
public final class SuggestedEmojiAssem extends UIContentAssem {
    public final C5H3 LJLIL;
    public final C214298b3 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C100683xI LJLL;
    public C4BI LJLLI;
    public XKQ LJLLILLLL;
    public final IDObjectS174S0100000_1 LJLLJ;

    public SuggestedEmojiAssem() {
        new LinkedHashMap();
        this.LJLIL = C17N.LJJIJL(new AqS151S0100000_1(this, 389));
        this.LJLILLLLZI = C1043747t.LIZ(this);
        this.LJLJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 391));
        this.LJLJJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 392));
        this.LJLJJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, SubscriptionIconHideTextMinimumDimensionSetting.DEFAULT));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 388));
        this.LJLJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 385));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 386));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 387));
        this.LJLL = new C100683xI();
        this.LJLLJ = new IDObjectS174S0100000_1(this, 2);
    }

    public final ChatRoomEditTextAbility A3() {
        return (ChatRoomEditTextAbility) this.LJLIL.getValue();
    }

    public final SuggestedEmojiViewModel C3() {
        return (SuggestedEmojiViewModel) this.LJLILLLLZI.getValue();
    }

    public final void v3() {
        C4BI c4bi = this.LJLLI;
        if (c4bi != null && c4bi.isShowing()) {
            C4BI c4bi2 = this.LJLLI;
            if (c4bi2 != null) {
                c4bi2.dismiss();
            }
            this.LJLLI = null;
        }
        C4BH c4bh = C3().LJLILLLLZI;
        if (c4bh != null) {
            c4bh.LLFZ();
        }
    }

    public final int x3() {
        return ((Number) this.LJLJJLL.getValue()).intValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        ChatRoomEditTextAbility A3 = A3();
        if (A3 != null) {
            A3.Uc0(this.LJLLJ);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        v3();
        ChatRoomEditTextAbility A3 = A3();
        if (A3 != null) {
            A3.BN(this.LJLLJ);
        }
        XKQ xkq = this.LJLLILLLL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
    }
}
