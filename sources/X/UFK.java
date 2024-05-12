package X;

import com.bytedance.android.livesdk.chatroom.api.SubPinCard;
import com.bytedance.android.livesdk.model.message.SubPinEventMessage;
import com.google.android.play.core.appupdate.u;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS155S0100000_5;

/* loaded from: classes14.dex */
public final class UFK implements OnMessageListener, InterfaceC72822Si2 {
    public static final UFK LJLIL = new UFK();
    public static final C0MB<UFJ> LJLILLLLZI = new C0MB<>();
    public static final C0MB<Integer> LJLJI = new C0MB<>();

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        SubPinCard subPinCard;
        if (iMessage instanceof SubPinEventMessage) {
            SubPinEventMessage subPinEventMessage = (SubPinEventMessage) iMessage;
            int i = subPinEventMessage.actionType;
            if (i != 1) {
                if (i != 2 || (subPinCard = subPinEventMessage.card) == null) {
                    return;
                }
                long j = subPinEventMessage.operatorUserId;
                int i2 = subPinCard.type;
                UFH ufh = UFH.UNPIN;
                Long valueOf = Long.valueOf(j);
                UFJ LJ = LJLILLLLZI.LJ(i2, null);
                if (LJ == null) {
                    return;
                }
                LJ.LJJJJIZL(ufh, valueOf);
                return;
            }
            SubPinCard subPinCard2 = subPinEventMessage.card;
            if (subPinCard2 == null) {
                return;
            }
            LIZ(subPinCard2, Long.valueOf(subPinEventMessage.operatorUserId), null, 4);
        }
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        int LJJIJIIJI;
        UFJ LJ;
        InterfaceC78280Uns LJJIJIIJIL;
        UFL LIZ;
        String str;
        InterfaceC78280Uns LJJIJIIJIL2;
        InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
        if (interfaceC78280Uns == null || (LJJIJIIJI = u.LJJIJIIJI(interfaceC78280Uns, "pinCardType", 1)) == 0) {
            return;
        }
        String str2 = c199097rd.LJLIL;
        int hashCode = str2.hashCode();
        if (hashCode != -1022424635) {
            if (hashCode != -12284843) {
                if (hashCode != 1308327340 || !str2.equals("subscription_pin_card_request")) {
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                InterfaceC78280Uns interfaceC78280Uns2 = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns2 != null && (LJJIJIIJIL = u.LJJIJIIJIL(interfaceC78280Uns2, "logParams")) != null && (LIZ = LJJIJIIJIL.LIZ()) != null) {
                    while (LIZ.hasNextKey()) {
                        String nextKey = LIZ.nextKey();
                        InterfaceC78280Uns interfaceC78280Uns3 = c199097rd.LJLILLLLZI;
                        if (interfaceC78280Uns3 != null && (LJJIJIIJIL2 = u.LJJIJIIJIL(interfaceC78280Uns3, "logParams")) != null && LJJIJIIJIL2.hasKey(nextKey)) {
                            InterfaceC78505UrV interfaceC78505UrV = LJJIJIIJIL2.get(nextKey);
                            if (interfaceC78505UrV.getType() == EnumC78522Urm.String) {
                                str = interfaceC78505UrV.asString();
                            } else if (interfaceC78505UrV.getType() == EnumC78522Urm.Int) {
                                str = String.valueOf(interfaceC78505UrV.asInt());
                            } else if (interfaceC78505UrV.getType() == EnumC78522Urm.Number) {
                                str = String.valueOf(interfaceC78505UrV.asDouble());
                            } else if (interfaceC78505UrV.getType() == EnumC78522Urm.Boolean) {
                                str = String.valueOf(interfaceC78505UrV.asBoolean());
                            }
                            if (str != null) {
                                linkedHashMap.put(nextKey, str);
                            }
                        }
                        str = "";
                        linkedHashMap.put(nextKey, str);
                    }
                }
                UFJ LJ2 = LJLILLLLZI.LJ(LJJIJIIJI, null);
                if (LJ2 == null) {
                    return;
                }
                LJ2.LJLJJL(linkedHashMap);
                return;
            }
            if (!str2.equals("subscription_pin_card_close")) {
                return;
            }
            UFH ufh = UFH.CLOSE;
            UFJ LJ3 = LJLILLLLZI.LJ(LJJIJIIJI, null);
            if (LJ3 == null) {
                return;
            }
            LJ3.LJJJJIZL(ufh, null);
            return;
        }
        if (!str2.equals("subscription_unpin_card_request") || (LJ = LJLILLLLZI.LJ(LJJIJIIJI, null)) == null) {
            return;
        }
        LJ.LJJJLIIL();
    }

    public static void LIZIZ(List list, int i, EnumC30915CBj enumC30915CBj) {
        boolean z;
        EnumC30915CBj enumC30915CBj2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            C0MB<Integer> c0mb = LJLJI;
            Integer LJ = c0mb.LJ(intValue, null);
            if (LJ != null) {
                c0mb.LJI(intValue, Integer.valueOf(LJ.intValue() & (~i)));
            }
            Integer LJ2 = c0mb.LJ(intValue, null);
            if (LJ2 == null || LJ2.intValue() != 0) {
                z = false;
                enumC30915CBj2 = enumC30915CBj;
            } else {
                z = true;
                enumC30915CBj2 = EnumC30915CBj.NULL;
            }
            UFJ LJ3 = LJLILLLLZI.LJ(intValue, null);
            if (LJ3 != null) {
                LJ3.LJLIIIL(z, enumC30915CBj2);
            }
        }
    }

    public static void LIZJ(List list, int i, EnumC30915CBj enumC30915CBj) {
        boolean z;
        EnumC30915CBj enumC30915CBj2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            C0MB<Integer> c0mb = LJLJI;
            Integer LJ = c0mb.LJ(intValue, null);
            if (LJ != null) {
                c0mb.LJI(intValue, Integer.valueOf(LJ.intValue() | i));
            }
            Integer LJ2 = c0mb.LJ(intValue, null);
            if (LJ2 == null || LJ2.intValue() != 0) {
                z = false;
                enumC30915CBj2 = enumC30915CBj;
            } else {
                z = true;
                enumC30915CBj2 = EnumC30915CBj.NULL;
            }
            UFJ LJ3 = LJLILLLLZI.LJ(intValue, null);
            if (LJ3 != null) {
                LJ3.LJLIIIL(z, enumC30915CBj2);
            }
        }
    }

    public static void LIZ(SubPinCard subPinCard, Long l, AqS155S0100000_5 aqS155S0100000_5, int i) {
        if ((i & 2) != 0) {
            l = null;
        }
        if ((i & 4) != 0) {
            aqS155S0100000_5 = null;
        }
        UFJ LJ = LJLILLLLZI.LJ(subPinCard.type, null);
        if (LJ != null) {
            LJ.LJJLL(subPinCard, l, aqS155S0100000_5);
        }
    }
}
