package X;

import java.io.Serializable;

/* renamed from: X.32H, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C32H implements Serializable {
    public String conversationId;
    public Long create_time;
    public Long create_time_v2;
    public int deleted;
    public String idempotent_id;
    public String key;
    public String msgUuid;
    public String sec_uid;
    public int status;
    public Long uid;
    public String value;
    public long version;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LocalPropertyItem(msgUuid: ");
        LIZ.append(this.msgUuid);
        LIZ.append(",conversationId: ");
        LIZ.append(this.conversationId);
        LIZ.append(",uid: ");
        LIZ.append(this.uid);
        LIZ.append(",sec_uid: ");
        LIZ.append(this.sec_uid);
        LIZ.append(",create_time: ");
        LIZ.append(this.create_time);
        LIZ.append(",create_time_v2: ");
        LIZ.append(this.create_time_v2);
        LIZ.append(",idempotent_id: ");
        LIZ.append(this.idempotent_id);
        LIZ.append(",key: ");
        LIZ.append(this.key);
        LIZ.append(",version: ");
        LIZ.append(this.version);
        LIZ.append(",status: ");
        LIZ.append(this.status);
        LIZ.append(",deleted: ");
        return C08380Uo.LIZ(LIZ, this.deleted, ")", LIZ);
    }
}
