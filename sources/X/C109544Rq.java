package X;

import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.PropertyItem;
import com.bytedance.im.core.proto.PropertyItemList;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.4Rq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C109544Rq implements Serializable, Comparable<C109544Rq>, Cloneable {
    public List<C117824jq> attachments;

    @InterfaceC65381PlJ
    public String content;

    @InterfaceC65381PlJ
    public C64537PUn contentPB = C64537PUn.EMPTY;
    public int convRankUpdateRule;
    public String conversationId;
    public long conversationShortId;
    public int conversationType;
    public long createdAt;
    public int deleted;
    public java.util.Map<String, String> ext;
    public long index;
    public long indexInConversationV2;
    public Boolean isSelf;
    public transient SparseArray<Object> localCache;
    public java.util.Map<String, String> localExt;
    public transient SparseArray<WeakReference<Object>> mKeyedTags;
    public EnumC109604Rw messageStatus;
    public long msgId;
    public int msgStatus;
    public int msgType;
    public long orderIndex;
    public java.util.Map<String, List<C32H>> propertyItemListMap;
    public int readStatus;
    public ReferenceInfo referenceInfo;
    public long rowid;
    public String scene;
    public String secSender;
    public long sender;
    public C116914iN senderInfo;
    public int svrStatus;
    public long tableFlag;
    public String uuid;
    public long version;

    public synchronized java.util.Map<String, String> getExt() {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        return this.ext;
    }

    public String getExtStr() {
        return C63682Oz0.LIZ(this.ext);
    }

    public String getLocalExtStr() {
        return C63682Oz0.LIZ(this.localExt);
    }

    public List<Long> getMentionIds() {
        java.util.Map<String, String> map = this.ext;
        ArrayList arrayList = null;
        if (map != null && map.containsKey("a:mentioned_uids")) {
            String str = this.ext.get("a:mentioned_uids");
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String[] split = str.split(",");
            arrayList = new ArrayList();
            for (String str2 : split) {
                try {
                    arrayList.add(Long.valueOf(CastLongProtector.parseLong(str2)));
                } catch (Exception unused) {
                }
            }
        }
        return arrayList;
    }

    public EnumC109604Rw getMessageStatus() {
        EnumC109604Rw enumC109604Rw = this.messageStatus;
        if (enumC109604Rw == null) {
            if (isDeleted()) {
                return EnumC109604Rw.DELETED;
            }
            if (isRecalled()) {
                return EnumC109604Rw.RECALLED;
            }
            return EnumC109604Rw.AVAILABLE;
        }
        return enumC109604Rw;
    }

    public String getPropertyItemListMapString() {
        try {
            java.util.Map<String, List<C32H>> map = this.propertyItemListMap;
            return (map == null || map.size() <= 0) ? "" : C63682Oz0.LIZ.LJIILL(this.propertyItemListMap);
        } catch (Throwable unused) {
            return "";
        }
    }

    public String getSecSender() {
        if (TextUtils.isEmpty(this.secSender)) {
            this.secSender = "";
        }
        return this.secSender;
    }

    public int hashCode() {
        String str = this.uuid;
        if (str != null) {
            return str.hashCode();
        }
        return super.hashCode();
    }

    public boolean invalid() {
        if (this.sender <= 0 || TextUtils.isEmpty(this.conversationId) || TextUtils.isEmpty(this.uuid)) {
            return true;
        }
        return false;
    }

    public boolean isDeleted() {
        if (this.deleted == 1) {
            return true;
        }
        return false;
    }

    public boolean isSuccessOrNormal() {
        int i = this.msgStatus;
        if (i == 2 || i == 5) {
            return true;
        }
        return false;
    }

    public C109544Rq() {
        if (C54840Lfg.LJJ().LJIJJLI()) {
            this.localExt = new ConcurrentHashMap();
        }
    }

    public static Gson getToStringGsonByLogPrivacy() {
        if (C54840Lfg.LJJ().LJLI()) {
            return C63682Oz0.LIZIZ;
        }
        return C63682Oz0.LIZ;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public C109544Rq m16clone() {
        try {
            return (C109544Rq) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public String getCreationUuid() {
        return getLocalExt().get("s:media_creation_uuid");
    }

    public boolean getHasMention() {
        if (getLocalExt().get("a:mentioned") != null) {
            return true;
        }
        return false;
    }

    public java.util.Map<String, String> getLocalExt() {
        if (C54840Lfg.LJJ().LJIJJLI()) {
            return this.localExt;
        }
        if (this.localExt == null) {
            this.localExt = new HashMap();
        }
        return this.localExt;
    }

    public String getLogContent() {
        if (C54840Lfg.LJJ().LJLI()) {
            return "";
        }
        return this.content;
    }

    public long getRefMsgId() {
        String str = getLocalExt().get("s:sdk_ref_msg_id");
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        try {
            return CastLongProtector.parseLong(str);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return -1L;
        }
    }

    public boolean hasMsgPropertyToUpdate() {
        return "true".equals(getLocalExt().get("s:modify_msg_property_refresh"));
    }

    public boolean isIndexLocal() {
        return "1".equals(getLocalExt().get("s:message_index_is_local"));
    }

    public boolean isMention() {
        List<Long> mentionIds = getMentionIds();
        if (mentionIds != null && (mentionIds.contains(Long.valueOf(C54840Lfg.LJJ().LJJLIL())) || mentionIds.contains(0L))) {
            return true;
        }
        return false;
    }

    public boolean isRecalled() {
        if ("true".equals(getExt().get("s:is_recalled")) || "true".equals(getExt().get("s:recalled"))) {
            return true;
        }
        return false;
    }

    public boolean isSelf() {
        boolean z = true;
        if (C54840Lfg.LJJ().LJIL()) {
            if (this.isSelf == null) {
                if (C54840Lfg.LJJ().LJJLIL() != this.sender) {
                    z = false;
                }
                this.isSelf = Boolean.valueOf(z);
            }
            return this.isSelf.booleanValue();
        }
        if (C54840Lfg.LJJ().LJJLIL() == this.sender) {
            return true;
        }
        return false;
    }

    public String toString() {
        return GsonProtectorUtils.toJson(getToStringGsonByLogPrivacy(), this);
    }

    public void updateMentionLocalExt() {
        if (isMention()) {
            addLocalExt("a:mentioned", "");
        }
    }

    public List<C117824jq> getAttachments() {
        return this.attachments;
    }

    public String getContent() {
        return this.content;
    }

    public C64537PUn getContentPB() {
        return this.contentPB;
    }

    public int getConvRankUpdateRule() {
        return this.convRankUpdateRule;
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

    public long getCreatedAt() {
        return this.createdAt;
    }

    public int getDeleted() {
        return this.deleted;
    }

    public long getIndex() {
        return this.index;
    }

    public long getIndexInConversationV2() {
        return this.indexInConversationV2;
    }

    public long getMsgId() {
        return this.msgId;
    }

    public int getMsgStatus() {
        return this.msgStatus;
    }

    public int getMsgType() {
        return this.msgType;
    }

    public long getOrderIndex() {
        return this.orderIndex;
    }

    public java.util.Map<String, List<C32H>> getPropertyItemListMap() {
        return this.propertyItemListMap;
    }

    public int getReadStatus() {
        return this.readStatus;
    }

    public ReferenceInfo getReferenceInfo() {
        return this.referenceInfo;
    }

    public long getRowId() {
        return this.rowid;
    }

    public String getScene() {
        return this.scene;
    }

    public long getSender() {
        return this.sender;
    }

    public C116914iN getSenderInfo() {
        return this.senderInfo;
    }

    public int getSvrStatus() {
        return this.svrStatus;
    }

    public long getTableFlag() {
        return this.tableFlag;
    }

    public String getUuid() {
        return this.uuid;
    }

    public long getVersion() {
        return this.version;
    }

    private void setRefMsgId(String str) {
        getLocalExt().put("s:sdk_ref_msg_id", str);
    }

    public void clearLocalExt(String str) {
        if (C54840Lfg.LJJ().LJIJJLI()) {
            this.localExt.remove(str);
            return;
        }
        synchronized (this) {
            java.util.Map<String, String> map = this.localExt;
            if (map != null) {
                map.remove(str);
            }
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(C109544Rq c109544Rq) {
        if (equals(c109544Rq)) {
            return 0;
        }
        long orderIndex = c109544Rq.getOrderIndex() - getOrderIndex();
        if (orderIndex > 0) {
            return 1;
        }
        if (orderIndex < 0) {
            return -1;
        }
        long createdAt = c109544Rq.getCreatedAt() - getCreatedAt();
        if (createdAt > 0) {
            return 1;
        }
        if (createdAt >= 0) {
            return 0;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.uuid;
        String str2 = ((C109544Rq) obj).uuid;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public String getExtValue(String str) {
        return getMapValue(this.ext, str);
    }

    public synchronized Object getLocalCache(int i) {
        SparseArray<Object> sparseArray = this.localCache;
        if (sparseArray == null) {
            return null;
        }
        return sparseArray.get(i);
    }

    public String getLocalExtValue(String str) {
        return getMapValue(this.localExt, str);
    }

    public Object getTag(int i) {
        SparseArray<WeakReference<Object>> sparseArray = this.mKeyedTags;
        if (sparseArray != null && sparseArray.get(i) != null) {
            return this.mKeyedTags.get(i).get();
        }
        return null;
    }

    public synchronized void putExt(java.util.Map<String, String> map) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.putAll(map);
    }

    public void putLocalExt(java.util.Map<String, String> map) {
        if (C54840Lfg.LJJ().LJIJJLI()) {
            this.localExt.putAll(map);
            return;
        }
        synchronized (this) {
            if (this.localExt == null) {
                this.localExt = new HashMap();
            }
            this.localExt.putAll(map);
        }
    }

    public void setAttachments(List<C117824jq> list) {
        this.attachments = list;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setContentPB(C64537PUn c64537PUn) {
        this.contentPB = c64537PUn;
    }

    public void setConvRankUpdateRule(int i) {
        this.convRankUpdateRule = i;
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

    public void setCreatedAt(long j) {
        this.createdAt = j;
    }

    public void setCreationUuid(String str) {
        addLocalExt("s:media_creation_uuid", str);
    }

    public void setDeleted(int i) {
        this.deleted = i;
    }

    public void setExt(java.util.Map<String, String> map) {
        this.ext = map;
    }

    public void setExtStr(String str) {
        this.ext = C63682Oz0.LIZIZ(str);
    }

    public void setIndex(long j) {
        if (this.index < j) {
            this.index = j;
        }
    }

    public void setIndexInConversationV2(long j) {
        if (this.indexInConversationV2 < j) {
            this.indexInConversationV2 = j;
        }
    }

    public void setLocalExt(java.util.Map<String, String> map) {
        if (C54840Lfg.LJJ().LJIJJLI()) {
            this.localExt.clear();
            this.localExt.putAll(map);
        } else {
            this.localExt = map;
        }
    }

    public void setLocalExtStr(String str) {
        if (C54840Lfg.LJJ().LJIJJLI()) {
            java.util.Map<String, String> LIZIZ = C63682Oz0.LIZIZ(str);
            this.localExt.clear();
            if (LIZIZ == null) {
                return;
            }
            this.localExt.putAll(LIZIZ);
            return;
        }
        this.localExt = C63682Oz0.LIZIZ(str);
    }

    public void setMessageStatus(EnumC109604Rw enumC109604Rw) {
        this.messageStatus = enumC109604Rw;
    }

    public void setMsgId(long j) {
        this.msgId = j;
    }

    public void setMsgStatus(int i) {
        this.msgStatus = i;
    }

    public void setMsgType(int i) {
        this.msgType = i;
    }

    public void setOrderIndex(long j) {
        if (this.orderIndex < j) {
            this.orderIndex = j;
        }
    }

    public void setPropertyItemListMap(java.util.Map<String, List<C32H>> map) {
        this.propertyItemListMap = map;
    }

    public void setPropertyItemListMapByString(String str) {
        try {
            this.propertyItemListMap = (java.util.Map) C63682Oz0.LIZ.LJII(str, new TypeToken<java.util.Map<String, PropertyItemList>>() { // from class: X.4Rr
            }.getType());
        } catch (Throwable unused) {
            this.propertyItemListMap = null;
        }
    }

    public void setReadStatus(int i) {
        this.readStatus = i;
    }

    public void setRefMsg(ReferenceInfo referenceInfo) {
        if (referenceInfo == null || referenceInfo.referenced_message_id.longValue() <= 0) {
            this.referenceInfo = null;
            setRefMsgId("");
            return;
        }
        this.referenceInfo = referenceInfo.newBuilder2().build();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(referenceInfo.referenced_message_id);
        LIZ.append("");
        setRefMsgId(X1D.LIZIZ(LIZ));
    }

    public void setRowId(long j) {
        this.rowid = j;
    }

    public void setScene(String str) {
        this.scene = str;
    }

    public void setSecSender(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.secSender = str;
    }

    public void setSender(long j) {
        this.sender = j;
    }

    public void setSenderInfo(C116914iN c116914iN) {
        this.senderInfo = c116914iN;
    }

    public void setSvrStatus(int i) {
        this.svrStatus = i;
    }

    public void setTableFlag(long j) {
        this.tableFlag = j;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    public void setVersion(long j) {
        this.version = j;
    }

    public void updatePropertyFromServer(MessageBody messageBody) {
        Long l;
        C32H c32h;
        long j;
        if (messageBody == null || (l = messageBody.version) == null || l.longValue() < this.version) {
            return;
        }
        String str = this.uuid;
        String str2 = this.conversationId;
        HashMap hashMap = null;
        if (messageBody.property_list != null) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry<String, PropertyItemList> entry : messageBody.property_list.entrySet()) {
                String key = entry.getKey();
                if (key != null) {
                    ArrayList arrayList = new ArrayList();
                    hashMap2.put(key, arrayList);
                    PropertyItemList value = entry.getValue();
                    List<PropertyItem> list = value.Items;
                    if (list != null && !list.isEmpty()) {
                        for (PropertyItem propertyItem : value.Items) {
                            if (propertyItem == null) {
                                c32h = null;
                            } else {
                                c32h = new C32H();
                                c32h.msgUuid = str;
                                c32h.conversationId = str2;
                                c32h.uid = propertyItem.uid;
                                c32h.sec_uid = propertyItem.sec_uid;
                                c32h.create_time = propertyItem.create_time;
                                c32h.idempotent_id = propertyItem.idempotent_id;
                                c32h.value = propertyItem.value;
                                Long l2 = propertyItem.create_time_micro;
                                if (l2 != null) {
                                    j = l2.longValue();
                                } else {
                                    j = 0;
                                }
                                c32h.create_time_v2 = Long.valueOf(j);
                                c32h.key = key;
                            }
                            arrayList.add(c32h);
                        }
                    }
                }
            }
            hashMap = hashMap2;
        }
        this.propertyItemListMap = hashMap;
    }

    private String getMapValue(java.util.Map<String, String> map, String str) {
        if (map == null || map.isEmpty() || TextUtils.isEmpty(str)) {
            return null;
        }
        return map.get(str);
    }

    public synchronized void addExt(String str, String str2) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.put(str, str2);
    }

    public void addLocalExt(String str, String str2) {
        if (C54840Lfg.LJJ().LJIJJLI()) {
            this.localExt.put(str, str2);
            return;
        }
        synchronized (this) {
            if (this.localExt == null) {
                this.localExt = new HashMap();
            }
            this.localExt.put(str, str2);
        }
    }

    public synchronized void putLocalCache(int i, Object obj) {
        if (this.localCache == null) {
            this.localCache = new SparseArray<>(1);
        }
        this.localCache.put(i, obj);
    }

    public void setTag(int i, Object obj) {
        if (this.mKeyedTags == null) {
            this.mKeyedTags = new SparseArray<>(2);
        }
        this.mKeyedTags.put(i, new WeakReference<>(obj));
    }
}
