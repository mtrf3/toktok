package X;

import android.text.SpannableString;
import android.util.ArrayMap;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.model.message.SubNotifyMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.model.message.common.TextPieceUser;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.C6f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30781C6f extends CQO<SubNotifyMessage> {
    @Override // X.CQL, X.InterfaceC29967BpT
    public final int LJJJ() {
        return R.drawable.d5g;
    }

    @Override // X.CQL, X.InterfaceC31347CRz
    public final boolean LJJLIIIIJ() {
        if (((SubNotifyMessage) this.LJIJJLI).exhibitionType == 1) {
            return true;
        }
        return false;
    }

    @Override // X.CQL
    public final CharSequence LJJZZIII() {
        int LIZ;
        int i;
        String LIZ2 = C05170If.LIZ(((SubNotifyMessage) this.LJIJJLI).user);
        if (((SubNotifyMessage) this.LJIJJLI).subMonth == null) {
            return "";
        }
        if (this.LJI && (i = this.LJIIIIZZ) > 0) {
            LIZ2 = (String) C78840Uwu.LJJIJLIJ(i, LIZ2);
        }
        String LJIIIIZZ = C15380j0.LJIIIIZZ(R.plurals.pq, ((SubNotifyMessage) this.LJIJJLI).subMonth.intValue(), LIZ2, ((SubNotifyMessage) this.LJIJJLI).subMonth);
        ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).m90().getClass();
        User user = ((SubNotifyMessage) this.LJIJJLI).user;
        if (this.LJI) {
            LIZ = this.LJII;
        } else {
            LIZ = CPR.LIZ(R.color.aao);
        }
        C30777C6b LJIILJJIL = LJIILJJIL(LIZ, user);
        SpannableString spannableString = new SpannableString(LJIIIIZZ);
        int indexOf = LJIIIIZZ.indexOf(LIZ2);
        spannableString.setSpan(LJIILJJIL, indexOf, LIZ2.length() + indexOf, 33);
        return spannableString;
    }

    @Override // X.CQL
    public final boolean LJZI() {
        if (((SubNotifyMessage) this.LJIJJLI).exhibitionType < 2) {
            return true;
        }
        return false;
    }

    @Override // X.CQO, X.CQL
    public final boolean LL() {
        MESSAGE message = this.LJIJJLI;
        if (message.baseMessage != null && message.baseMessage.displayText != null) {
            return true;
        }
        return false;
    }

    public final java.util.Map<String, String> LLFF() {
        String str;
        String str2;
        ArrayMap arrayMap = new ArrayMap();
        MESSAGE message = this.LJIJJLI;
        if (((SubNotifyMessage) message).subscribeType == 0) {
            str = "one_month";
        } else if (((SubNotifyMessage) message).subscribeType != 1) {
            str = "";
        } else {
            str = "auto_sub";
        }
        int i = ((SubNotifyMessage) message).oldSubscribeStatus;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        str2 = "";
                    } else {
                        str2 = "resubscribe_beyond_grace_period";
                    }
                } else {
                    str2 = "resubscribe_within_grace_period";
                }
            } else {
                str2 = "resubscribe";
            }
        } else {
            str2 = "first_subscribe";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(((SubNotifyMessage) this.LJIJJLI).subscribingStatus);
        LIZ.append("");
        arrayMap.put("subscribing_status", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(((SubNotifyMessage) this.LJIJJLI).subscribeMessageType);
        LIZ2.append("");
        arrayMap.put("new_sub_message_type", X1D.LIZIZ(LIZ2));
        arrayMap.put("subscribe_type", str);
        arrayMap.put("sub_message_type", str2);
        return arrayMap;
    }

    @Override // X.InterfaceC31078CHq, X.CXK
    public final User getUser() {
        return ((SubNotifyMessage) this.LJIJJLI).user;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [X.C6g, O] */
    @Override // X.CQL, X.InterfaceC31368CSu
    public final void onAttach() {
        String str;
        int i;
        SubNotifyMessage subNotifyMessage = (SubNotifyMessage) this.LJIJJLI;
        if (subNotifyMessage.subscribeMessageType == 0 && (((i = subNotifyMessage.oldSubscribeStatus) == 0 || i == 3) && getUser() != null && B83.LIZ().LIZIZ() != null && ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ != null && getUser().getId() != ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getId())) {
            ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C4V.class)).LIZ = new C30782C6g(Long.valueOf(System.currentTimeMillis()), getUser());
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_subscribe_message_show");
        LIZ.LJIJJ(Integer.valueOf(((SubNotifyMessage) this.LJIJJLI).exhibitionType), "fold_type");
        LIZ.LJJIFFI(LLFF());
        LIZ.LJIIZILJ();
        if (LJLJJL()) {
            str = "anchor";
        } else {
            str = "user";
        }
        LIZ.LJIJJ(str, "user_type");
        LIZ.LJJIIJZLJL();
        MESSAGE message = this.LJIJJLI;
        o.LJIIIZ(message, "message");
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJI(jSONObject, "message_from", String.valueOf(message.getMessageFrom()));
        C05630Jz.LJFF(jSONObject, "message_create_time", message.baseMessage.createTime);
        C05630Jz.LJFF(jSONObject, "message_fetch_time", message.timestamp);
        C05630Jz.LJFF(jSONObject, "fetch_delay_time", C31012CFc.LIZIZ() - message.timestamp);
        C05630Jz.LJI(jSONObject, "message", GsonProtectorUtils.toJson(C09650Zl.LIZIZ, message));
        C30929CBx.LJIIZILJ("subscription_notify_message", jSONObject);
    }

    public C30781C6f(SubNotifyMessage subNotifyMessage) {
        super(subNotifyMessage);
    }

    @Override // X.CQL
    public final void LJJZZI(UserProfileEvent userProfileEvent) {
        Text text;
        TextPieceUser textPieceUser;
        User user;
        if (getUser() != null) {
            userProfileEvent.user = getUser();
        }
        if (getUser() == null && (text = this.LJIJJLI.baseMessage.displayText) != null) {
            List<TextPiece> list = text.pieces;
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            CXJ.LJII("", list, arrayList, linkedHashMap, this);
            if (arrayList.size() > 0 && arrayList.size() == linkedHashMap.size()) {
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        break;
                    }
                    ListProtector.get(arrayList, i);
                    TextPiece textPiece = (TextPiece) linkedHashMap.get(Integer.valueOf(i));
                    if (textPiece.type == CXI.USER.getPieceType() && (textPieceUser = textPiece.userValue) != null && (user = textPieceUser.user) != null) {
                        userProfileEvent.user = user;
                        break;
                    }
                    i++;
                }
            }
        }
        userProfileEvent.setClickUserPosition("subscribe_message");
        userProfileEvent.setExtraParams(LLFF());
    }
}
