package X;

import android.text.TextUtils;
import com.bytedance.im.core.proto.ModifyPropertyContent;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.OrX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63219OrX implements Serializable, Cloneable {
    public String clientMessageId;
    public String conversationId;
    public long conversationShortId;
    public int conversationType;
    public int inboxType;
    public boolean isResend;
    public EnumC63233Orl modifyMsgPropertyStatus;
    public int msgType;
    public boolean mute;
    public List<ModifyPropertyContent> propertyContentList;
    public long serverMessageId;

    public C63219OrX copy() {
        C63219OrX c63219OrX = new C63219OrX();
        c63219OrX.conversationId = getConversationId();
        c63219OrX.conversationShortId = getConversationShortId();
        c63219OrX.conversationType = getConversationType();
        c63219OrX.inboxType = getInboxType();
        c63219OrX.serverMessageId = getServerMessageId();
        c63219OrX.clientMessageId = getClientMessageId();
        c63219OrX.msgType = getMsgType();
        c63219OrX.propertyContentList = getPropertyContentList();
        c63219OrX.modifyMsgPropertyStatus = getModifyMsgPropertyStatus();
        c63219OrX.isResend = isResend();
        return c63219OrX;
    }

    public boolean invalid() {
        return TextUtils.isEmpty(this.conversationId);
    }

    public String toString() {
        return GsonProtectorUtils.toJson(C63682Oz0.LIZ, this);
    }

    public String getClientMessageId() {
        return this.clientMessageId;
    }

    public String getConversationId() {
        return this.conversationId;
    }

    public long getConversationShortId() {
        return this.conversationShortId;
    }

    public int getConversationType() {
        return this.conversationType;
    }

    public int getInboxType() {
        return this.inboxType;
    }

    public EnumC63233Orl getModifyMsgPropertyStatus() {
        return this.modifyMsgPropertyStatus;
    }

    public int getMsgType() {
        return this.msgType;
    }

    public boolean getMute() {
        return this.mute;
    }

    public List<ModifyPropertyContent> getPropertyContentList() {
        return this.propertyContentList;
    }

    public long getServerMessageId() {
        return this.serverMessageId;
    }

    public boolean isResend() {
        return this.isResend;
    }

    public void addPropertyContent(C32H c32h) {
        EnumC63258OsA enumC63258OsA;
        if (c32h == null) {
            return;
        }
        if (c32h.deleted == 1) {
            enumC63258OsA = EnumC63258OsA.REMOVE_PROPERTY_ITEM;
        } else {
            enumC63258OsA = EnumC63258OsA.ADD_PROPERTY_ITEM;
        }
        addPropertyContent(new ModifyPropertyContent(enumC63258OsA, c32h.key, c32h.value, c32h.idempotent_id));
    }

    public void removePropertyContent(C32H c32h) {
        List<ModifyPropertyContent> list;
        if (c32h == null || (list = this.propertyContentList) == null || list.isEmpty()) {
            return;
        }
        int size = this.propertyContentList.size();
        for (int i = 0; i < size; i++) {
            ModifyPropertyContent modifyPropertyContent = (ModifyPropertyContent) ListProtector.get(this.propertyContentList, i);
            if (modifyPropertyContent != null && TextUtils.equals(c32h.key, modifyPropertyContent.key) && TextUtils.equals(c32h.idempotent_id, modifyPropertyContent.idempotent_id)) {
                ListProtector.remove(this.propertyContentList, i);
                return;
            }
        }
    }

    public void setClientMessageId(String str) {
        this.clientMessageId = str;
    }

    public void setConversationId(String str) {
        this.conversationId = str;
    }

    public void setConversationShortId(long j) {
        this.conversationShortId = j;
    }

    public void setConversationType(int i) {
        this.conversationType = i;
    }

    public void setInboxType(int i) {
        this.inboxType = i;
    }

    public void setModifyMsgPropertyStatus(EnumC63233Orl enumC63233Orl) {
        this.modifyMsgPropertyStatus = enumC63233Orl;
    }

    public void setMsgType(int i) {
        this.msgType = i;
    }

    public void setMute(boolean z) {
        this.mute = z;
    }

    public void setPropertyContentList(List<ModifyPropertyContent> list) {
        this.propertyContentList = list;
    }

    public void setResend(boolean z) {
        this.isResend = z;
    }

    public void setServerMessageId(long j) {
        this.serverMessageId = j;
    }

    public void addPropertyContent(ModifyPropertyContent modifyPropertyContent) {
        if (this.propertyContentList == null) {
            this.propertyContentList = new CopyOnWriteArrayList();
        }
        this.propertyContentList.add(modifyPropertyContent);
    }
}
