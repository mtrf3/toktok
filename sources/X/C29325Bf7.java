package X;

import Y.ACListenerS24S0101000_5;
import Y.ACListenerS31S0300000_5;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.livesdk.dataChannel.PublicScreenShrinkChannel;
import com.bytedance.android.livesdk.model.message.LinkMicBattleNoticeMessage;
import com.bytedance.android.livesdk.model.message.battle.BattleNoticeAnchorGuide;
import com.bytedance.android.livesdk.model.message.battle.BattleNoticeRuleGuide;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Bf7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29325Bf7 extends CSX<C29572Bj6> {
    public final View LJLJLLL;
    public final ImageView LJLL;
    public final C47121t6 LJLLI;
    public final C47121t6 LJLLILLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29325Bf7(View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        View findViewById = itemView.findViewById(R.id.bst);
        o.LJIIIIZZ(findViewById, "itemView.findViewById<View>(R.id.content)");
        this.LJLJLLL = findViewById;
        View findViewById2 = itemView.findViewById(R.id.brd);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.connect)");
        this.LJLL = (ImageView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.e0n);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.guide_content)");
        this.LJLLI = (C47121t6) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.erq);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.invite)");
        this.LJLLILLLL = (C47121t6) findViewById4;
    }

    @Override // X.CSF
    public final void L(CQQ cqq, CRD crd) {
        boolean z;
        float f;
        String str;
        Boolean bool;
        CQO model = (CQO) crd;
        o.LJIIIZ(model, "model");
        this.LJLL.setImageResource(R.drawable.d1k);
        DataChannel dataChannel = cqq.LJIIIIZZ;
        if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(PublicScreenShrinkChannel.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        ViewGroup.LayoutParams layoutParams = this.LJLJLLL.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        C018905p c018905p = (C018905p) layoutParams;
        if (z) {
            f = 0.99f;
        } else {
            f = 0.8f;
        }
        c018905p.matchConstraintPercentWidth = f;
        this.LJLJLLL.setLayoutParams(c018905p);
        LinkMicBattleNoticeMessage linkMicBattleNoticeMessage = (LinkMicBattleNoticeMessage) model.LJIJJLI;
        int i = linkMicBattleNoticeMessage.noticeType;
        if (i != 0) {
            if (i != 4) {
                if (i != 5) {
                    return;
                }
            } else {
                BattleNoticeRuleGuide battleNoticeRuleGuide = linkMicBattleNoticeMessage.battleRuleGuide;
                o.LJIIIIZZ(battleNoticeRuleGuide, "model.message.battleRuleGuide");
                C47121t6 c47121t6 = this.LJLLI;
                C86881Y7x LIZIZ = C86881Y7x.LIZIZ();
                Text text = battleNoticeRuleGuide.contentText;
                String str2 = null;
                if (text != null) {
                    str = text.key;
                } else {
                    str = null;
                }
                String LIZ = LIZIZ.LIZ(str);
                String str3 = "";
                if (LIZ == null) {
                    LIZ = "";
                }
                c47121t6.setText(LIZ);
                C47121t6 c47121t62 = this.LJLLILLLL;
                C86881Y7x LIZIZ2 = C86881Y7x.LIZIZ();
                Text text2 = battleNoticeRuleGuide.buttonContentText;
                if (text2 != null) {
                    str2 = text2.key;
                }
                String LIZ2 = LIZIZ2.LIZ(str2);
                if (LIZ2 != null) {
                    str3 = LIZ2;
                }
                c47121t62.setText(str3);
                C16880lQ.LJIIJ(new ACListenerS31S0300000_5(cqq, this, battleNoticeRuleGuide, 40), this.LJLJLLL);
                return;
            }
        }
        BattleNoticeAnchorGuide battleNoticeAnchorGuide = linkMicBattleNoticeMessage.anchorGuide;
        o.LJIIIIZZ(battleNoticeAnchorGuide, "model.message.anchorGuide");
        int i2 = ((LinkMicBattleNoticeMessage) model.LJIJJLI).noticeType;
        this.LJLLI.setText(battleNoticeAnchorGuide.content.text);
        this.LJLLILLLL.setText(battleNoticeAnchorGuide.buttonContent.text);
        C16880lQ.LJIIJ(new ACListenerS24S0101000_5(i2, cqq, 19), this.LJLJLLL);
    }
}
