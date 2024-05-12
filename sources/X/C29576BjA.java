package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCoHostMatchCapsuleGovernanceSetting;
import com.bytedance.android.livesdk.model.message.BattleNoticeCommonGuide;
import com.bytedance.android.livesdk.model.message.LinkMicBattleNoticeMessage;
import com.bytedance.android.livesdk.model.message.battle.BattleNoticeAnchorGiftGuide;
import com.bytedance.android.livesdk.model.message.battle.BattleNoticeAnchorGuide;
import com.bytedance.android.livesdk.model.message.battle.BattleNoticeRuleGuide;
import com.bytedance.android.livesdk.model.message.battle.BattleNoticeText;
import com.bytedance.android.livesdk.model.message.battle.BattleNoticeToast;
import kotlin.jvm.internal.o;

/* renamed from: X.BjA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29576BjA implements InterfaceC31330CRi<LinkMicBattleNoticeMessage> {
    @Override // X.InterfaceC31330CRi
    public final boolean LIZ(LinkMicBattleNoticeMessage linkMicBattleNoticeMessage, CQQ context) {
        BattleNoticeText battleNoticeText;
        BattleNoticeText battleNoticeText2;
        BattleNoticeToast battleNoticeToast;
        BattleNoticeText battleNoticeText3;
        String str;
        BattleNoticeText battleNoticeText4;
        int i;
        LinkMicBattleNoticeMessage message = linkMicBattleNoticeMessage;
        o.LJIIIZ(message, "message");
        o.LJIIIZ(context, "context");
        if (!LiveCoHostMatchCapsuleGovernanceSetting.INSTANCE.coHostMatchCapsuleDefault() && ((i = message.noticeType) == 5 || i == 0 || i == 4)) {
            return true;
        }
        int i2 = message.noticeType;
        try {
            if (i2 != 0 && i2 != 5) {
                if (i2 == 4) {
                    BattleNoticeRuleGuide battleNoticeRuleGuide = message.battleRuleGuide;
                    if (battleNoticeRuleGuide != null && battleNoticeRuleGuide.contentText != null) {
                        if (battleNoticeRuleGuide != null && battleNoticeRuleGuide.buttonContentText != null) {
                            if (battleNoticeRuleGuide != null && battleNoticeRuleGuide.ruleUrl != null) {
                                Boolean LIZJ = InterfaceC30442Bx8.LLJJIJIL.LIZJ();
                                o.LJIIIIZZ(LIZJ, "LIVE_SHOULD_SHOW_BATTLE_RULE_GUIDE_MESSAGE.value");
                                if (LIZJ.booleanValue()) {
                                    if (context.LJFF) {
                                        if (message.battleRuleGuide.exceptAnchor) {
                                            return true;
                                        }
                                        C75832TpU.LIZ.LJJIIZI(message.noticeType);
                                    }
                                } else {
                                    "Check failed.".toString();
                                    throw new IllegalStateException("Check failed.");
                                }
                            } else {
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else if (i2 == 3) {
                    BattleNoticeAnchorGiftGuide battleNoticeAnchorGiftGuide = message.anchorGiftGuide;
                    if (battleNoticeAnchorGiftGuide == null || (battleNoticeText4 = battleNoticeAnchorGiftGuide.content) == null || battleNoticeText4.text == null) {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else if (i2 == 6) {
                    BattleNoticeCommonGuide battleNoticeCommonGuide = message.commonGuide;
                    if (battleNoticeCommonGuide != null && battleNoticeCommonGuide.displayText != null) {
                        if (context.LJFF && battleNoticeCommonGuide.exceptAnchor) {
                            return true;
                        }
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    if (i2 != 1 || (battleNoticeToast = message.toast) == null || (battleNoticeText3 = battleNoticeToast.content) == null || (str = battleNoticeText3.text) == null || TextUtils.isEmpty(str)) {
                        return true;
                    }
                    C30868C9o.LJI(str);
                    return true;
                }
            } else {
                BattleNoticeAnchorGuide battleNoticeAnchorGuide = message.anchorGuide;
                if (battleNoticeAnchorGuide != null && (battleNoticeText = battleNoticeAnchorGuide.content) != null && battleNoticeText.text != null) {
                    if (battleNoticeAnchorGuide != null && (battleNoticeText2 = battleNoticeAnchorGuide.buttonContent) != null && battleNoticeText2.text != null) {
                        C75832TpU.LIZ.LJJIIZI(i2);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            return false;
        } catch (IllegalArgumentException | IllegalStateException | Exception unused) {
            return true;
        }
    }
}
