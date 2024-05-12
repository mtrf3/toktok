package X;

import X.CR6;
import Y.AObjectS134S0100000_5;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import com.bytedance.android.livesdk.dataChannel.LowDevicePerfScalableChannel;
import com.bytedance.android.livesdk.livesetting.level.FansClubBadgeShowEnableSetting;
import com.bytedance.android.livesdk.livesetting.level.UserLevelBadgeShowEnableSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveBadgeLoadOptSetting;
import com.bytedance.android.livesdk.livesetting.other.UserLevelBadgePositionSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveBadgeCodeOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.ScalableDowngradeSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveClickCommentShowReplyPanelSetting;
import com.bytedance.android.livesdk.model.message.PinMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS136S0200000_5;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public abstract class CQK<MESSAGE extends CR6> extends CQO<MESSAGE> implements InterfaceC31337CRp {
    public CharSequence LJIL;
    public C31472CWu LJJ;
    public C31472CWu LJJI;
    public boolean LJJIFFI;
    public final C5H3 LJJII;
    public boolean LJJIII;
    public final AObjectS134S0100000_5 LJJIIJ;

    public User LJJI() {
        return null;
    }

    @Override // X.CQL, X.CRD
    public final boolean LJJIJIIJIL() {
        return true;
    }

    public User LJJJJZI() {
        return null;
    }

    @Override // X.CQL
    public final boolean LJZL() {
        return true;
    }

    @Override // X.CQO, X.CQL
    public boolean LL() {
        return false;
    }

    public String LLFZ() {
        return "report_message";
    }

    public abstract String LLI();

    public void LLIIIILZ(boolean z) {
    }

    public void LLIIIJ() {
    }

    public boolean LLIIJI() {
        return !(this instanceof C31273CPd);
    }

    public long getCreateTime() {
        return 0L;
    }

    public C31304CQi LJJLJLI() {
        return new C31304CQi();
    }

    public final Collection<AbstractC31462CWk<? extends AbstractC31467CWp>> LLFFF() {
        List<AbstractC31462CWk<? extends AbstractC31467CWp>> list;
        C31472CWu c31472CWu = this.LJJ;
        if (c31472CWu != null && (list = c31472CWu.LJ) != null) {
            return list;
        }
        return new ArrayList();
    }

    public final CharSequence LLFII() {
        String valueOf;
        if (TextUtils.isEmpty(this.LJIL)) {
            String LIZ = C05170If.LIZ(getUser());
            this.LJIL = LIZ;
            if (TextUtils.isEmpty(LIZ)) {
                Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
                HashMap hashMap = new HashMap();
                CommonMessageData commonMessageData = this.LJIJJLI.baseMessage;
                if (commonMessageData == null) {
                    valueOf = "";
                } else {
                    valueOf = String.valueOf(commonMessageData.messageId);
                }
                hashMap.put("message_id", valueOf);
                if (getUser() == null) {
                    hashMap.put("reason", "User is null.");
                } else if (room == null) {
                    hashMap.put("reason", "Room is null.");
                } else {
                    User user = getUser();
                    if (user != null && room.getOwnerUserId() == user.getId() && TextUtils.isEmpty(C05170If.LJ(getUser()))) {
                        hashMap.put("reason", "User is anchor, but displayId is empty.");
                    } else if (room.getNameMode() == 1 && TextUtils.isEmpty(C05170If.LIZLLL(getUser()))) {
                        hashMap.put("reason", "User is audience and display nickname, but nickname is empty.");
                    } else if (TextUtils.isEmpty(C05170If.LJ(getUser()))) {
                        hashMap.put("reason", "User is audience, but displayId is empty.");
                    }
                }
                C28733BPl.LJIILIIL().LIZIZ("ttlive_text_message_not_display_name", hashMap);
            }
        }
        return this.LJIL;
    }

    public List<EmoteWithIndex> LLIFFJFJJ() {
        return new ArrayList();
    }

    @Override // X.CQL, X.InterfaceC31368CSu
    public void LJJJJLI() {
        List<BadgeStruct> list;
        super.LJJJJLI();
        if (LiveBadgeLoadOptSetting.INSTANCE.lazyLoad() && LLIIJI() && !this.LJJIII) {
            int i = 1;
            this.LJJIII = true;
            User user = getUser();
            if (user != null) {
                list = user.getBadgeList();
            } else {
                list = null;
            }
            CQQ LJLIIL = LJLIIL();
            if (LJLIIL().LJIIZILJ) {
                i = 3;
            }
            LLII(list, LJLIIL, i);
        }
        C31472CWu c31472CWu = this.LJJ;
        if (c31472CWu != null) {
            c31472CWu.LJIIIIZZ();
        }
        C31472CWu c31472CWu2 = this.LJJI;
        if (c31472CWu2 != null) {
            c31472CWu2.LJIIIIZZ();
        }
        this.LJJIFFI = false;
    }

    @Override // X.CQL
    public final boolean LJLL() {
        C30134BsA c30134BsA;
        if (!LJLJJL()) {
            return false;
        }
        DataChannel dataChannel = LJLIIL().LJIIIIZZ;
        if (ScalableDowngradeSetting.disablePublicScreenAvatarPreload() && dataChannel != null && (c30134BsA = (C30134BsA) dataChannel.kv0(LowDevicePerfScalableChannel.class)) != null && c30134BsA.LIZIZ.compareTo(EnumC30098Bra.LEVEL_SERIOUS) <= 0) {
            return false;
        }
        return true;
    }

    public final boolean LLIIII() {
        ImageModel LJJLJ = LJJLJ();
        if (LJJLJ != null) {
            if (C15380j0.LIZLLL() == null || C32151Nz.LJJIIJZLJL(LJJLJ.getUrls())) {
                return false;
            }
            String str = (String) ListProtector.get(LJJLJ.getUrls(), 0);
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return W8E.LJII().LJI().LJII(UriProtector.parse(str));
        }
        return true;
    }

    public void LLIIIL() {
        if (LJLIIL().LJFF && LiveClickCommentShowReplyPanelSetting.getEnableClick()) {
            C30779C6d c30779C6d = new C30779C6d();
            c30779C6d.LJFF = "comment";
            String LLFZ = LLFZ();
            o.LJIIIZ(LLFZ, "<set-?>");
            c30779C6d.LIZ = LLFZ;
            c30779C6d.LIZIZ = "click";
            LJLIIL().LJIIJ.LJJIIZ(this, c30779C6d);
            return;
        }
        LLIIIZ();
    }

    public void LLIIIZ() {
        CharSequence LLFII = LLFII();
        if (getUser() != null && !TextUtils.isEmpty(LLFII)) {
            C30926CBu c30926CBu = new C30926CBu(String.valueOf(LLFII), "positive_reply", LLI(), LLIFFJFJJ());
            c30926CBu.LJIIIIZZ = "message";
            HashMap hashMap = new HashMap();
            C31301CQf c31301CQf = this.LJIILL;
            if (c31301CQf.LIZIZ && c31301CQf.LIZJ != null) {
                hashMap.put("reply_method", "pin");
                CS6 cs6 = this.LJIILL.LIZJ;
                o.LJI(cs6);
                PinMessage pinMessage = cs6.LJI;
                if (pinMessage != null) {
                    hashMap.put("pin_msg_id", String.valueOf(pinMessage.getMessageId()));
                    hashMap.put("pin_id", String.valueOf(pinMessage.pinId));
                }
            } else if (LJLJJLL()) {
                hashMap.put("reply_method", "anchor");
            } else {
                hashMap.put("reply_method", "viewer");
            }
            hashMap.put("reply_event_page", "click_msg");
            ISendCommentEvent.Sender sender = ISendCommentEvent.Sender.REPLY;
            sender.setLogArgs(hashMap);
            c30926CBu.LJIIIZ = sender;
            c30926CBu.LIZLLL = getUser();
            c30926CBu.LJIIJJI = getMessageId();
            c30926CBu.LJIIL = this.LJIILLIIL.LIZ;
            C73943T0h.LIZ().LIZIZ(c30926CBu);
            if (!LJLIIL().LJFF) {
                LLIIIJ();
            }
        }
        CR3.LIZLLL(this.LJIJJLI);
    }

    @Override // X.CQL, X.CRD
    public void dispose() {
        super.dispose();
        C31472CWu c31472CWu = this.LJJ;
        if (c31472CWu != null) {
            c31472CWu.LIZJ();
        }
        this.LJJ = null;
        C31472CWu c31472CWu2 = this.LJJI;
        if (c31472CWu2 != null) {
            c31472CWu2.LIZJ();
        }
        this.LJJI = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CQK(MESSAGE baseChatMessage) {
        super(baseChatMessage);
        o.LJIIIZ(baseChatMessage, "baseChatMessage");
        this.LJJII = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 404));
        this.LJJIIJ = new AObjectS134S0100000_5(this, 4);
    }

    @Override // X.CQL, X.InterfaceC31341CRt
    public void LJIILLIIL(CQQ publicScreenContext) {
        o.LJIIIZ(publicScreenContext, "publicScreenContext");
        super.LJIILLIIL(publicScreenContext);
        this.LJIL = null;
        if (!LiveBadgeLoadOptSetting.INSTANCE.lazyLoad()) {
            LLFF(publicScreenContext);
        }
    }

    @Override // X.CQL, X.InterfaceC31341CRt
    public void LJJJI(CQQ publicScreenContext) {
        o.LJIIIZ(publicScreenContext, "publicScreenContext");
        super.LJJJI(publicScreenContext);
        if (!LiveBadgeLoadOptSetting.INSTANCE.lazyLoad()) {
            LLFF(publicScreenContext);
        } else {
            this.LJJIII = false;
        }
    }

    public final void LLFF(CQQ cqq) {
        List<BadgeStruct> list;
        int i;
        if (LLIIJI()) {
            User user = getUser();
            if (user != null) {
                list = user.getBadgeList();
            } else {
                list = null;
            }
            if (cqq.LJIIZILJ) {
                i = 3;
            } else {
                i = 1;
            }
            LLII(list, cqq, i);
        }
    }

    public final void LLII(List<BadgeStruct> list, CQQ publicScreenContext, int i) {
        C31472CWu c31472CWu;
        C31472CWu c31472CWu2;
        boolean z;
        o.LJIIIZ(publicScreenContext, "publicScreenContext");
        boolean z2 = false;
        if (this.LJJ == null) {
            C31472CWu c31472CWu3 = new C31472CWu(this.LJIJ, null, false, publicScreenContext.LIZJ);
            c31472CWu3.LJIIIIZZ = new AqS136S0200000_5(publicScreenContext, (CQQ) this, 54);
            this.LJJ = c31472CWu3;
        } else if (LiveBadgeCodeOptSetting.INSTANCE.useOpt() && (c31472CWu = this.LJJ) != null) {
            c31472CWu.LJI();
        }
        if (this.LJJI == null) {
            C31472CWu c31472CWu4 = new C31472CWu(this.LJIJ, null, false, publicScreenContext.LIZJ);
            c31472CWu4.LJIIIIZZ = new AqS136S0200000_5(publicScreenContext, (CQQ) this, 55);
            this.LJJI = c31472CWu4;
        } else if (LiveBadgeCodeOptSetting.INSTANCE.useOpt() && (c31472CWu2 = this.LJJI) != null) {
            c31472CWu2.LJI();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int value = UserLevelBadgePositionSetting.INSTANCE.getValue();
        if (list != null) {
            z2 = false;
            for (BadgeStruct badgeStruct : list) {
                if (badgeStruct != null) {
                    if (badgeStruct.badgeScene != 8 || !UserLevelBadgeShowEnableSetting.INSTANCE.getValue()) {
                        if (badgeStruct != null) {
                            if (badgeStruct.badgeScene != 4) {
                                if (badgeStruct != null) {
                                    if (badgeStruct.badgeScene == 10) {
                                        if (FansClubBadgeShowEnableSetting.INSTANCE.getValue()) {
                                            arrayList2.add(badgeStruct);
                                            z2 = true;
                                        } else if (badgeStruct == null) {
                                        }
                                    }
                                    if (badgeStruct.badgeScene == 8) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z || (badgeStruct != null && (badgeStruct.badgeScene == 10 || badgeStruct.badgeScene == 4 || badgeStruct.badgeScene == 6))) {
                                        if (badgeStruct.badgeScene == 6) {
                                            if (value != 0) {
                                                if (value == 1) {
                                                    arrayList2.add(badgeStruct);
                                                }
                                            } else {
                                                arrayList.add(badgeStruct);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    arrayList2.add(badgeStruct);
                }
                arrayList.add(badgeStruct);
            }
        }
        if (value == 0) {
            if (z2) {
                C31472CWu c31472CWu5 = this.LJJI;
                if (c31472CWu5 != null) {
                    c31472CWu5.LJIIJ = 3;
                }
            } else {
                C31472CWu c31472CWu6 = this.LJJI;
                if (c31472CWu6 != null) {
                    c31472CWu6.LJIIJ = 2;
                }
            }
            C31472CWu c31472CWu7 = this.LJJ;
            if (c31472CWu7 != null) {
                c31472CWu7.LJIIJ = 3;
            }
        } else {
            C31472CWu c31472CWu8 = this.LJJI;
            if (c31472CWu8 != null) {
                c31472CWu8.LJIIJ = 3;
            }
            C31472CWu c31472CWu9 = this.LJJ;
            if (c31472CWu9 != null) {
                c31472CWu9.LJIIJ = 2;
            }
        }
        C31472CWu c31472CWu10 = this.LJJ;
        if (c31472CWu10 != null) {
            C31472CWu.LJIIL(c31472CWu10, publicScreenContext.LJFF, publicScreenContext.LIZ, arrayList, new AqS136S0200000_5(publicScreenContext, (CQQ) this, 56), i, getUser());
        }
        C31472CWu c31472CWu11 = this.LJJI;
        if (c31472CWu11 != null) {
            C31472CWu.LJIIL(c31472CWu11, publicScreenContext.LJFF, publicScreenContext.LIZ, arrayList2, new AqS136S0200000_5(publicScreenContext, (CQQ) this, 57), i, getUser());
        }
    }
}
