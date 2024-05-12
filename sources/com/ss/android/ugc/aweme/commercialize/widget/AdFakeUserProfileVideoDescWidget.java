package com.ss.android.ugc.aweme.commercialize.widget;

import X.AnonymousClass636;
import X.C16880lQ;
import X.C17N;
import X.C187807Yq;
import X.C201577vd;
import X.C2065688u;
import X.C2065988x;
import X.C221108m2;
import X.C36922EeM;
import X.C59672NbQ;
import X.C62822Ol8;
import X.C8F5;
import X.C90193gN;
import X.InterfaceC203977zV;
import X.KL2;
import Y.ACListenerS23S0100000_3;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AdFakeUserProfileVideoDescWidget extends AbsAdProfileWidget {
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 165));

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    public final void LJIILJJIL(C59672NbQ c59672NbQ) {
        String desc;
        List<TextExtraStruct> textExtra;
        int i;
        super.LJIILJJIL(c59672NbQ);
        Aweme aweme = this.LJLJLJ;
        if (aweme == null || (desc = aweme.getDesc()) == null) {
            return;
        }
        C201577vd c201577vd = (C201577vd) this.LJLLI.getValue();
        if (c201577vd != null) {
            c201577vd.setText(desc);
            Aweme aweme2 = this.LJLJLJ;
            if (aweme2 == null || (textExtra = aweme2.getTextExtra()) == null) {
                return;
            }
            for (TextExtraStruct textExtraStruct : textExtra) {
                if (textExtraStruct != null) {
                    if (textExtraStruct.getStart() < 0) {
                        textExtraStruct.setStart(0);
                    }
                    if (textExtraStruct.getEnd() > desc.length()) {
                        textExtraStruct.setEnd(desc.length());
                    }
                }
            }
            if (this.LJLIL == null) {
                return;
            }
            Aweme aweme3 = this.LJLJLJ;
            if (aweme3 != null && aweme3.isAd()) {
                i = 200;
            } else {
                i = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
            }
            c201577vd.setMaxSize(i);
            c201577vd.setSpanSize(C17N.LJJJLL(15.0d));
            c201577vd.setSpanColor(c201577vd.getCurrentTextColor());
            c201577vd.setSpanStyle(1);
            c201577vd.setOnSpanClickListener(new InterfaceC203977zV() { // from class: X.7vW
                /* JADX WARN: Code restructure failed: missing block: B:176:0x0408, code lost:
                
                    if (r2 == null) goto L174;
                 */
                @Override // X.InterfaceC203977zV
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(com.ss.android.ugc.aweme.model.TextExtraStruct r20) {
                    /*
                        Method dump skipped, instructions count: 1118
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C201507vW.LIZ(com.ss.android.ugc.aweme.model.TextExtraStruct):void");
                }
            });
            c201577vd.LJJIZ(textExtra, new C187807Yq(), null);
            if (desc.length() > 0) {
                for (TextExtraStruct textExtraStruct2 : textExtra) {
                    o.LJIIIIZZ(textExtraStruct2, "textExtraStruct");
                    if (LJIIZILJ(textExtraStruct2, desc) && textExtraStruct2.getType() == 0 && (!TextUtils.isEmpty(textExtraStruct2.getAwemeId()) || 2 == textExtraStruct2.getSubtype())) {
                        Aweme aweme4 = this.LJLJLJ;
                        o.LJI(aweme4);
                        if (aweme4.getDesc().charAt(textExtraStruct2.getStart()) == '@') {
                            Context mContext = this.LJLIL;
                            o.LJIIIIZZ(mContext, "mContext");
                            float LJIIJJI = KL2.LJIIJJI(this.LJLIL) - (this.LJLIL.getResources().getDimension(R.dimen.ajx) + KL2.LIZJ(this.LJLIL, 100.0f));
                            Context mContext2 = this.LJLIL;
                            o.LJIIIIZZ(mContext2, "mContext");
                            C8F5 c8f5 = new C8F5(mContext, LJIIJJI, AnonymousClass636.LJIIIIZZ(R.attr.dg, mContext2), -1, textExtraStruct2, false, false, false, false, 480);
                            c8f5.LJLLI = KL2.LIZJ(this.LJLIL, 12.0f);
                            c8f5.LJLLILLLL = KL2.LIZJ(this.LJLIL, 2.0f);
                            c8f5.LJLJLLL = KL2.LIZJ(this.LJLIL, 13.0f);
                            c201577vd.LJJIL(textExtraStruct2.getStart(), textExtraStruct2.getEnd(), c8f5);
                            break;
                        }
                    }
                }
            }
            try {
                if (C90193gN.LIZIZ(this.LJLIL)) {
                    if (C2065688u.LIZ == null) {
                        C2065688u.LIZ = new C2065688u();
                    }
                    c201577vd.setMovementMethod(C2065688u.LIZ);
                } else {
                    c201577vd.setMovementMethod(C2065988x.LIZ());
                }
            } catch (IndexOutOfBoundsException e) {
                C36922EeM.LIZ(e);
            }
        }
        View view = this.LJLJI;
        if (view == null) {
            return;
        }
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 203), view);
    }

    public final boolean LJIIZILJ(TextExtraStruct textExtraStruct, String str) {
        if (str != null && textExtraStruct.getStart() >= 0 && textExtraStruct.getEnd() >= 0 && textExtraStruct.getEnd() <= str.length() && textExtraStruct.getStart() < str.length() && textExtraStruct.getStart() < textExtraStruct.getEnd()) {
            return true;
        }
        return false;
    }
}
