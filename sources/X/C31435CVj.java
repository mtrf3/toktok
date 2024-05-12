package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.GiftService;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastGameFloatWindowLibra;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftInfoInBox;
import com.bytedance.android.livesdk.model.GiftsBoxInfo;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CVj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31435CVj extends AbstractC029409q<AbstractC31440CVo<? extends CRD>> {
    public final List<CRD> LJLIL;
    public final boolean LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        Object obj = ListProtector.get(this.LJLIL, i);
        if (obj instanceof C31272CPc) {
            return 3;
        }
        if (obj instanceof CQJ) {
            return 0;
        }
        if (obj instanceof C31290CPu) {
            return 4;
        }
        if ((obj instanceof C31276CPg) || (obj instanceof CQ6) || (obj instanceof CQ7) || (obj instanceof C30781C6f) || (obj instanceof C29818Bn4)) {
            return 1;
        }
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C31435CVj(Context context, List<? extends CRD> messageList) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(messageList, "messageList");
        this.LJLIL = messageList;
        this.LJLILLLLZI = BroadcastGameFloatWindowLibra.INSTANCE.isExperimentGroup2();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(AbstractC31440CVo<? extends CRD> abstractC31440CVo, int i) {
        int i2;
        StringBuilder LJFF;
        String LIZIZ;
        String str;
        String valueOf;
        int i3;
        List<GiftInfoInBox> list;
        AbstractC31440CVo<? extends CRD> holder = abstractC31440CVo;
        o.LJIIIZ(holder, "holder");
        CRD message = (CRD) ListProtector.get(this.LJLIL, i);
        if (holder instanceof C31437CVl) {
            C31437CVl c31437CVl = (C31437CVl) holder;
            o.LJII(message, "null cannot be cast to non-null type com.bytedance.android.live.publicscreen.impl.model.game.GameChatMessageModel");
            CQK cqk = (CQK) message;
            c31437CVl.LJLILLLLZI.setText(cqk.LLFII());
            TextView messageView = c31437CVl.LJLIL;
            CharSequence content = cqk.getContent();
            o.LJIIIZ(messageView, "messageView");
            if (content != null) {
                messageView.setVisibility(0);
                messageView.setText(content);
            } else {
                messageView.setVisibility(8);
            }
            Collection<AbstractC31462CWk<? extends AbstractC31467CWp>> LLFFF = cqk.LLFFF();
            if (LLFFF.isEmpty()) {
                c31437CVl.LJLJI.setVisibility(8);
                return;
            } else {
                c31437CVl.LJLJI.setBadges(C65777Prh.LIZIZ(LLFFF));
                c31437CVl.LJLJI.setVisibility(0);
                return;
            }
        }
        if (holder instanceof C31438CVm) {
            C31438CVm c31438CVm = (C31438CVm) holder;
            o.LJII(message, "null cannot be cast to non-null type com.bytedance.android.live.publicscreen.impl.model.chat.ChatMessageModel");
            CQK cqk2 = (CQK) message;
            c31438CVm.LJLILLLLZI.setText(cqk2.LLFII());
            TextView messageView2 = c31438CVm.LJLIL;
            CharSequence content2 = cqk2.getContent();
            o.LJIIIZ(messageView2, "messageView");
            if (content2 != null) {
                messageView2.setVisibility(0);
                messageView2.setText(content2);
                return;
            } else {
                messageView2.setVisibility(8);
                return;
            }
        }
        if (holder instanceof C31436CVk) {
            ((C31436CVk) holder).L(message);
            return;
        }
        if (holder instanceof C31439CVn) {
            C31439CVn c31439CVn = (C31439CVn) holder;
            o.LJII(message, "null cannot be cast to non-null type com.bytedance.android.live.publicscreen.impl.model.game.GameGiftMessageModel");
            C31291CPv c31291CPv = (C31291CPv) message;
            MESSAGE message2 = c31291CPv.LJIJJLI;
            o.LJII(message2, "null cannot be cast to non-null type com.bytedance.android.livesdk.model.message.GiftMessage");
            GiftMessage giftMessage = (GiftMessage) message2;
            Gift findGiftById = GiftService.LJLILLLLZI.findGiftById(giftMessage.giftId);
            if (findGiftById == null) {
                findGiftById = giftMessage.mGift;
            }
            Gift gift = giftMessage.mGift;
            if (gift != null) {
                i2 = gift.diamondCount;
            } else {
                i2 = 0;
            }
            int i4 = i2 * giftMessage.comboCount;
            if (gift != null && gift.isBoxGift) {
                GiftsBoxInfo giftsBoxInfo = giftMessage.giftsInBox;
                if (giftsBoxInfo != null && (list = giftsBoxInfo.gifts) != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<GiftInfoInBox> it = list.iterator();
                    while (it.hasNext()) {
                        Gift findGiftById2 = GiftService.LJLILLLLZI.findGiftById(it.next().giftId);
                        if (findGiftById2 != null) {
                            arrayList.add(findGiftById2);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    i3 = 0;
                    while (it2.hasNext()) {
                        i3 += ((Gift) it2.next()).diamondCount;
                    }
                } else {
                    i3 = 0;
                }
                i4 += i3;
            }
            TextView textView = c31439CVn.LJLIL;
            String str2 = "";
            if (TextUtils.isEmpty(c31291CPv.LJIL)) {
                String LIZ = C05170If.LIZ(c31291CPv.getUser());
                c31291CPv.LJIL = LIZ;
                if (TextUtils.isEmpty(LIZ)) {
                    Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
                    HashMap hashMap = new HashMap();
                    CommonMessageData commonMessageData = c31291CPv.LJIJJLI.baseMessage;
                    if (commonMessageData == null) {
                        valueOf = "";
                    } else {
                        valueOf = String.valueOf(commonMessageData.messageId);
                    }
                    hashMap.put("message_id", valueOf);
                    if (c31291CPv.getUser() == null) {
                        hashMap.put("reason", "User is null.");
                    } else if (room == null) {
                        hashMap.put("reason", "Room is null.");
                    } else {
                        User user = c31291CPv.getUser();
                        if (user != null && room.getOwnerUserId() == user.getId() && TextUtils.isEmpty(C05170If.LJ(c31291CPv.getUser()))) {
                            hashMap.put("reason", "User is anchor, but displayId is empty.");
                        } else if (room.getNameMode() == 1 && TextUtils.isEmpty(C05170If.LIZLLL(c31291CPv.getUser()))) {
                            hashMap.put("reason", "User is audience and display nickname, but nickname is empty.");
                        } else if (TextUtils.isEmpty(C05170If.LJ(c31291CPv.getUser()))) {
                            hashMap.put("reason", "User is audience, but displayId is empty.");
                        }
                    }
                    C28733BPl.LJIILIIL().LIZIZ("ttlive_text_message_not_display_name", hashMap);
                }
            }
            textView.setText(c31291CPv.LJIL);
            TextView textView2 = c31439CVn.LJLILLLLZI;
            ImageModel imageModel = null;
            if (findGiftById != null && (str = findGiftById.describe) != null) {
                str2 = str;
            }
            textView2.setText(str2);
            boolean z = giftMessage.isFirstSendGift;
            if (z) {
                C87277YNd.LJJIJ(c31439CVn.LJLJJL);
                TextView textView3 = c31439CVn.LJLJJL;
                Context LIZLLL = C15380j0.LIZLLL();
                o.LJIIIIZZ(LIZLLL, "getContext()");
                textView3.setBackground(C31456CWe.LIZJ(i4, LIZLLL));
            } else {
                C87277YNd.LJJIIZ(c31439CVn.LJLJJL);
            }
            if (C15380j0.LJIIZILJ()) {
                c31439CVn.LJLJL.setScaleX(-1.0f);
            }
            View view = c31439CVn.LJLJL;
            Context LIZLLL2 = C15380j0.LIZLLL();
            o.LJIIIIZZ(LIZLLL2, "getContext()");
            view.setBackground(C31456CWe.LIZIZ(LIZLLL2, i4, 8, z));
            String valueOf2 = String.valueOf(giftMessage.comboCount);
            if (C15380j0.LJIIZILJ()) {
                LJFF = X1D.LIZ();
                LJFF.append(' ');
                LJFF.append(valueOf2);
            } else {
                LJFF = C72972SkS.LJFF(valueOf2, ' ');
            }
            c31439CVn.LJLJJI.setText(X1D.LIZIZ(LJFF));
            c31439CVn.LJLJJI.setTypeface(C8HI.LIZJ().LIZLLL("bold"), 2);
            String LJIILJJIL = C15380j0.LJIILJJIL(R.string.l8n);
            TextView textView4 = c31439CVn.LJLJJL;
            if (C15380j0.LJIIZILJ()) {
                LIZIZ = C78920UyC.LIZ(' ', LJIILJJIL, ' ');
            } else {
                LIZIZ = C42398GkU.LIZIZ(LJIILJJIL, ' ');
            }
            textView4.setText(LIZIZ);
            c31439CVn.LJLJJL.setTypeface(C8HI.LIZJ().LIZLLL("bold"), 2);
            c31439CVn.LJLJJLL.setText(C42398GkU.LIZIZ(C15380j0.LJIILJJIL(R.string.oqf), ' '));
            c31439CVn.LJLJJLL.setTypeface(C8HI.LIZJ().LIZLLL("bold"), 2);
            BQO LIZ2 = C15650jR.LIZ();
            if (findGiftById != null) {
                imageModel = findGiftById.image;
            }
            C78720Uuy LJIIIZ = LIZ2.LJIIIZ(imageModel);
            LJIIIZ.LJIIL = Boolean.TRUE;
            LJIIIZ.LJIIJJI(c31439CVn.LJLJI);
            c31439CVn.LJLILLLLZI.requestLayout();
            c31439CVn.LJLILLLLZI.invalidate();
            return;
        }
        o.LJIIIZ(message, "message");
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final AbstractC31440CVo<? extends CRD> com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        AbstractC31440CVo<? extends CRD> c31438CVm;
        o.LJIIIZ(parent, "parent");
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    if (i != 4) {
                        c31438CVm = new C31441CVp(parent);
                    } else if (this.LJLILLLLZI) {
                        c31438CVm = new C31439CVn(C1FL.LIZIZ(parent, R.layout.d7k, parent, false, "from(parent.context).inf…(layoutId, parent, false)"));
                    } else {
                        c31438CVm = new C31436CVk(parent);
                    }
                } else {
                    c31438CVm = new C31437CVl(parent);
                }
            } else {
                c31438CVm = new C31436CVk(parent);
            }
        } else {
            c31438CVm = new C31438CVm(parent);
        }
        C0AX.LIZ(parent, c31438CVm.itemView, R.id.lj7);
        View view = c31438CVm.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c31438CVm.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c31438CVm.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c31438CVm.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c31438CVm.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c31438CVm.getClass().getName();
        return c31438CVm;
    }
}
