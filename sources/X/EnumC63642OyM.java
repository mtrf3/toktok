package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: X.OyM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC63642OyM implements WireEnum {
    CmdTypeUnknown(0),
    CmdTypeMarkConversationRead(1),
    CmdTypeDeleteMessage(2),
    CmdTypeDeleteConversation(3),
    CmdTypeUpdateConvSetting(4),
    CmdTypeUpdateConvCoreInfo(6),
    CmdTypeUpdateConvParticipant(7),
    CmdTypeFirstMessage(8),
    CmdTypeTriggerConvPull(100),
    CmdTypeSyncMsgIntoStrangerInbox(101);

    public static final ProtoAdapter<EnumC63642OyM> ADAPTER = new EnumAdapter<EnumC63642OyM>() { // from class: X.OyN
        @Override // com.squareup.wire.EnumAdapter
        public final EnumC63642OyM LIZ(int i) {
            return EnumC63642OyM.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC63642OyM fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 6) {
                                if (i != 7) {
                                    if (i != 8) {
                                        if (i != 100) {
                                            if (i != 101) {
                                                return null;
                                            }
                                            return CmdTypeSyncMsgIntoStrangerInbox;
                                        }
                                        return CmdTypeTriggerConvPull;
                                    }
                                    return CmdTypeFirstMessage;
                                }
                                return CmdTypeUpdateConvParticipant;
                            }
                            return CmdTypeUpdateConvCoreInfo;
                        }
                        return CmdTypeUpdateConvSetting;
                    }
                    return CmdTypeDeleteConversation;
                }
                return CmdTypeDeleteMessage;
            }
            return CmdTypeMarkConversationRead;
        }
        return CmdTypeUnknown;
    }

    public static EnumC63642OyM valueOf(String str) {
        return (EnumC63642OyM) V0N.LJJJ(EnumC63642OyM.class, str);
    }

    EnumC63642OyM(int i) {
        this.LJLIL = i;
    }
}
