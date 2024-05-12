package com.ss.android.ugc.aweme.innerpush.api.model;

import X.C08880Wm;
import X.C221108m2;
import X.C62822Ol8;
import X.C86503XxD;
import X.C86524XxY;
import X.EnumC86508XxI;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.ORY;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class InnerPushMessage implements Serializable {
    public transient Serializable LJLIL;
    public transient boolean LJLILLLLZI;
    public final transient Map<String, Object> LJLJI;
    public transient boolean LJLJJI;
    public transient EnumC86508XxI LJLJJL;
    public final transient C62822Ol8 LJLJJLL;

    @InterfaceC65349Pkn("biz_extra")
    public final String bizExtraJsonStr;

    @InterfaceC65349Pkn("command_type")
    public final int commandType;

    @InterfaceC65349Pkn("config")
    public final InnerPushConfig config;

    @InterfaceC65349Pkn("use_converter")
    public final boolean convertFromExternal;

    @InterfaceC65349Pkn("create_time")
    public final long createTime;

    @InterfaceC65349Pkn("id")
    public final long id;

    @InterfaceC65349Pkn("is_notice")
    public final boolean isNotice;

    @InterfaceC65349Pkn("push_label")
    public final String label;

    @InterfaceC65349Pkn("mark_status")
    public final boolean markStatus;

    @InterfaceC65349Pkn("event_tracker")
    public final String mobEventJsonStr;

    @InterfaceC65349Pkn("notice_info")
    public final NoticeInfo noticeInfo;

    @InterfaceC65349Pkn("pre_message_create_time")
    public final long preMessageCreateTime;

    @InterfaceC65349Pkn("protocol")
    public final int protocol;

    @InterfaceC65349Pkn("rule_id")
    public long rid;

    @InterfaceC65349Pkn("setting_key")
    public String settingKey;

    @InterfaceC65349Pkn("integrity_check")
    public final boolean shouldCheckIntegrity;

    @InterfaceC65349Pkn("type")
    public final int type;

    @InterfaceC65349Pkn("ui_template")
    public final InnerPushUITemplate uiTemplate;

    @InterfaceC65349Pkn("version")
    public final int version;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public InnerPushMessage() {
        /*
            r30 = this;
            r1 = 0
            r3 = 0
            r7 = 0
            r28 = 8388607(0x7fffff, float:1.1754942E-38)
            r0 = r30
            r2 = r1
            r5 = r3
            r8 = r1
            r9 = r1
            r10 = r7
            r11 = r3
            r13 = r1
            r14 = r7
            r15 = r7
            r16 = r7
            r17 = r1
            r18 = r7
            r19 = r1
            r20 = r1
            r21 = r1
            r22 = r7
            r23 = r7
            r24 = r3
            r26 = r7
            r27 = r1
            r29 = r7
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r27, r28, r29)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage.<init>():void");
    }

    public static /* synthetic */ InnerPushMessage copy$default(InnerPushMessage innerPushMessage, int i, int i2, long j, long j2, Serializable serializable, int i3, int i4, String str, long j3, boolean z, InnerPushUITemplate innerPushUITemplate, InnerPushConfig innerPushConfig, String str2, boolean z2, NoticeInfo noticeInfo, boolean z3, boolean z4, boolean z5, Map map, String str3, long j4, String str4, boolean z6, int i5, Object obj) {
        long j5 = j3;
        String str5 = str;
        int i6 = i4;
        int i7 = i2;
        boolean z7 = z;
        int i8 = i;
        int i9 = i3;
        InnerPushUITemplate innerPushUITemplate2 = innerPushUITemplate;
        long j6 = j;
        long j7 = j2;
        Serializable serializable2 = serializable;
        String str6 = str3;
        Map map2 = map;
        boolean z8 = z6;
        boolean z9 = z5;
        String str7 = str4;
        String str8 = str2;
        long j8 = j4;
        boolean z10 = z4;
        InnerPushConfig innerPushConfig2 = innerPushConfig;
        boolean z11 = z2;
        boolean z12 = z3;
        NoticeInfo noticeInfo2 = noticeInfo;
        if ((i5 & 1) != 0) {
            i8 = innerPushMessage.protocol;
        }
        if ((i5 & 2) != 0) {
            i7 = innerPushMessage.version;
        }
        if ((i5 & 4) != 0) {
            j6 = innerPushMessage.id;
        }
        if ((i5 & 8) != 0) {
            j7 = innerPushMessage.createTime;
        }
        if ((i5 & 16) != 0) {
            serializable2 = innerPushMessage.LJLIL;
        }
        if ((i5 & 32) != 0) {
            i9 = innerPushMessage.type;
        }
        if ((i5 & 64) != 0) {
            i6 = innerPushMessage.commandType;
        }
        if ((i5 & 128) != 0) {
            str5 = innerPushMessage.label;
        }
        if ((i5 & 256) != 0) {
            j5 = innerPushMessage.preMessageCreateTime;
        }
        if ((i5 & 512) != 0) {
            z7 = innerPushMessage.shouldCheckIntegrity;
        }
        if ((i5 & 1024) != 0) {
            innerPushUITemplate2 = innerPushMessage.uiTemplate;
        }
        if ((i5 & 2048) != 0) {
            innerPushConfig2 = innerPushMessage.config;
        }
        if ((i5 & 4096) != 0) {
            str8 = innerPushMessage.bizExtraJsonStr;
        }
        if ((i5 & FileUtils.BUFFER_SIZE) != 0) {
            z11 = innerPushMessage.isNotice;
        }
        if ((i5 & 16384) != 0) {
            noticeInfo2 = innerPushMessage.noticeInfo;
        }
        if ((32768 & i5) != 0) {
            z12 = innerPushMessage.markStatus;
        }
        if ((65536 & i5) != 0) {
            z10 = innerPushMessage.convertFromExternal;
        }
        if ((131072 & i5) != 0) {
            z9 = innerPushMessage.LJLILLLLZI;
        }
        if ((262144 & i5) != 0) {
            map2 = innerPushMessage.LJLJI;
        }
        if ((524288 & i5) != 0) {
            str6 = innerPushMessage.mobEventJsonStr;
        }
        if ((1048576 & i5) != 0) {
            j8 = innerPushMessage.rid;
        }
        if ((2097152 & i5) != 0) {
            str7 = innerPushMessage.settingKey;
        }
        if ((i5 & 4194304) != 0) {
            z8 = innerPushMessage.LJLJJI;
        }
        return innerPushMessage.copy(i8, i7, j6, j7, serializable2, i9, i6, str5, j5, z7, innerPushUITemplate2, innerPushConfig2, str8, z11, noticeInfo2, z12, z10, z9, map2, str6, j8, str7, z8);
    }

    public final InnerPushMessage copy(int i, int i2, long j, long j2, Serializable serializable, int i3, int i4, String str, long j3, boolean z, InnerPushUITemplate innerPushUITemplate, InnerPushConfig innerPushConfig, String str2, boolean z2, NoticeInfo noticeInfo, boolean z3, boolean z4, boolean z5, Map<String, ? extends Object> map, String str3, long j4, String str4, boolean z6) {
        return new InnerPushMessage(i, i2, j, j2, serializable, i3, i4, str, j3, z, innerPushUITemplate, innerPushConfig, str2, z2, noticeInfo, z3, z4, z5, map, str3, j4, str4, z6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InnerPushMessage)) {
            return false;
        }
        InnerPushMessage innerPushMessage = (InnerPushMessage) obj;
        return this.protocol == innerPushMessage.protocol && this.version == innerPushMessage.version && this.id == innerPushMessage.id && this.createTime == innerPushMessage.createTime && o.LJ(this.LJLIL, innerPushMessage.LJLIL) && this.type == innerPushMessage.type && this.commandType == innerPushMessage.commandType && o.LJ(this.label, innerPushMessage.label) && this.preMessageCreateTime == innerPushMessage.preMessageCreateTime && this.shouldCheckIntegrity == innerPushMessage.shouldCheckIntegrity && o.LJ(this.uiTemplate, innerPushMessage.uiTemplate) && o.LJ(this.config, innerPushMessage.config) && o.LJ(this.bizExtraJsonStr, innerPushMessage.bizExtraJsonStr) && this.isNotice == innerPushMessage.isNotice && o.LJ(this.noticeInfo, innerPushMessage.noticeInfo) && this.markStatus == innerPushMessage.markStatus && this.convertFromExternal == innerPushMessage.convertFromExternal && this.LJLILLLLZI == innerPushMessage.LJLILLLLZI && o.LJ(this.LJLJI, innerPushMessage.LJLJI) && o.LJ(this.mobEventJsonStr, innerPushMessage.mobEventJsonStr) && this.rid == innerPushMessage.rid && o.LJ(this.settingKey, innerPushMessage.settingKey) && this.LJLJJI == innerPushMessage.LJLJJI;
    }

    public final InnerPushMessage deepCopy() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);
        objectOutputStream.flush();
        Object readObject = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray())).readObject();
        o.LJII(readObject, "null cannot be cast to non-null type com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage");
        return (InnerPushMessage) readObject;
    }

    public final C86503XxD getTracker() {
        return (C86503XxD) this.LJLJJLL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int LIZJ = JBR.LIZJ(this.createTime, JBR.LIZJ(this.id, ((this.protocol * 31) + this.version) * 31, 31), 31);
        Serializable serializable = this.LJLIL;
        int i = 0;
        if (serializable == null) {
            hashCode = 0;
        } else {
            hashCode = serializable.hashCode();
        }
        int i2 = (((((LIZJ + hashCode) * 31) + this.type) * 31) + this.commandType) * 31;
        String str = this.label;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int LIZJ2 = JBR.LIZJ(this.preMessageCreateTime, (i2 + hashCode2) * 31, 31);
        boolean z = this.shouldCheckIntegrity;
        int i3 = 1;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        int i5 = (LIZJ2 + i4) * 31;
        InnerPushUITemplate innerPushUITemplate = this.uiTemplate;
        if (innerPushUITemplate == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = innerPushUITemplate.hashCode();
        }
        int i6 = (i5 + hashCode3) * 31;
        InnerPushConfig innerPushConfig = this.config;
        if (innerPushConfig == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = innerPushConfig.hashCode();
        }
        int i7 = (i6 + hashCode4) * 31;
        String str2 = this.bizExtraJsonStr;
        if (str2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str2.hashCode();
        }
        int i8 = (i7 + hashCode5) * 31;
        boolean z2 = this.isNotice;
        int i9 = z2;
        if (z2 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        NoticeInfo noticeInfo = this.noticeInfo;
        if (noticeInfo == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = noticeInfo.hashCode();
        }
        int i11 = (i10 + hashCode6) * 31;
        boolean z3 = this.markStatus;
        int i12 = z3;
        if (z3 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z4 = this.convertFromExternal;
        int i14 = z4;
        if (z4 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        boolean z5 = this.LJLILLLLZI;
        int i16 = z5;
        if (z5 != 0) {
            i16 = 1;
        }
        int i17 = (i15 + i16) * 31;
        Map<String, Object> map = this.LJLJI;
        if (map == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = map.hashCode();
        }
        int i18 = (i17 + hashCode7) * 31;
        String str3 = this.mobEventJsonStr;
        if (str3 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str3.hashCode();
        }
        int LIZJ3 = JBR.LIZJ(this.rid, (i18 + hashCode8) * 31, 31);
        String str4 = this.settingKey;
        if (str4 != null) {
            i = str4.hashCode();
        }
        int i19 = (LIZJ3 + i) * 31;
        if (!this.LJLJJI) {
            i3 = 0;
        }
        return i19 + i3;
    }

    public final boolean isFromPlatform() {
        EnumC86508XxI.Companion.getClass();
        return ORY.LJJIJIIJIL(this.LJLJJL, EnumC86508XxI.PLATFORMS$delegate.getValue());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InnerPushMessage(protocol=");
        sb.append(this.protocol);
        sb.append(", version=");
        sb.append(this.version);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", createTime=");
        sb.append(this.createTime);
        sb.append(", payload=");
        sb.append(this.LJLIL);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", commandType=");
        sb.append(this.commandType);
        sb.append(", label=");
        sb.append(this.label);
        sb.append(", preMessageCreateTime=");
        sb.append(this.preMessageCreateTime);
        sb.append(", shouldCheckIntegrity=");
        sb.append(this.shouldCheckIntegrity);
        sb.append(", uiTemplate=");
        sb.append(this.uiTemplate);
        sb.append(", config=");
        sb.append(this.config);
        sb.append(", bizExtraJsonStr=");
        sb.append(this.bizExtraJsonStr);
        sb.append(", isNotice=");
        sb.append(this.isNotice);
        sb.append(", noticeInfo=");
        sb.append(this.noticeInfo);
        sb.append(", markStatus=");
        sb.append(this.markStatus);
        sb.append(", convertFromExternal=");
        sb.append(this.convertFromExternal);
        sb.append(", isDMPushReusedContainerShowed=");
        sb.append(this.LJLILLLLZI);
        sb.append(", extrasMap=");
        sb.append(this.LJLJI);
        sb.append(", mobEventJsonStr=");
        sb.append(this.mobEventJsonStr);
        sb.append(", rid=");
        sb.append(this.rid);
        sb.append(", settingKey=");
        sb.append(this.settingKey);
        sb.append(", hasAvoidanceWaited=");
        return C08880Wm.LIZJ(sb, this.LJLJJI, ')');
    }

    public final String getBizExtraJsonStr() {
        return this.bizExtraJsonStr;
    }

    public final int getCommandType() {
        return this.commandType;
    }

    public final InnerPushConfig getConfig() {
        return this.config;
    }

    public final boolean getConvertFromExternal() {
        return this.convertFromExternal;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final Map<String, Object> getExtrasMap() {
        return this.LJLJI;
    }

    public final EnumC86508XxI getFrom() {
        return this.LJLJJL;
    }

    public final boolean getHasAvoidanceWaited() {
        return this.LJLJJI;
    }

    public final long getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final boolean getMarkStatus() {
        return this.markStatus;
    }

    public final String getMobEventJsonStr() {
        return this.mobEventJsonStr;
    }

    public final NoticeInfo getNoticeInfo() {
        return this.noticeInfo;
    }

    public final Serializable getPayload() {
        return this.LJLIL;
    }

    public final long getPreMessageCreateTime() {
        return this.preMessageCreateTime;
    }

    public final int getProtocol() {
        return this.protocol;
    }

    public final long getRid() {
        return this.rid;
    }

    public final String getSettingKey() {
        return this.settingKey;
    }

    public final boolean getShouldCheckIntegrity() {
        return this.shouldCheckIntegrity;
    }

    public final int getType() {
        return this.type;
    }

    public final InnerPushUITemplate getUiTemplate() {
        return this.uiTemplate;
    }

    public final int getVersion() {
        return this.version;
    }

    public final boolean isDMPushReusedContainerShowed() {
        return this.LJLILLLLZI;
    }

    public final boolean isNotice() {
        return this.isNotice;
    }

    public final void markReceiveFrom(EnumC86508XxI from) {
        o.LJIIIZ(from, "from");
        this.LJLJJL = from;
        getTracker().LJIIL = System.currentTimeMillis();
        getTracker().LJIILIIL = System.currentTimeMillis() - this.createTime;
        getTracker().LIZ = from;
    }

    public final void setDMPushReusedContainerShowed(boolean z) {
        this.LJLILLLLZI = z;
    }

    public final void setHasAvoidanceWaited(boolean z) {
        this.LJLJJI = z;
    }

    public final void setPayload(Serializable serializable) {
        this.LJLIL = serializable;
    }

    public final void setRid(long j) {
        this.rid = j;
    }

    public final void setSettingKey(String str) {
        this.settingKey = str;
    }

    public InnerPushMessage(int i, int i2, long j, long j2, Serializable serializable, int i3, int i4, String str, long j3, boolean z, InnerPushUITemplate innerPushUITemplate, InnerPushConfig innerPushConfig, String str2, boolean z2, NoticeInfo noticeInfo, boolean z3, boolean z4, boolean z5, Map<String, ? extends Object> map, String str3, long j4, String str4, boolean z6) {
        this.protocol = i;
        this.version = i2;
        this.id = j;
        this.createTime = j2;
        this.LJLIL = serializable;
        this.type = i3;
        this.commandType = i4;
        this.label = str;
        this.preMessageCreateTime = j3;
        this.shouldCheckIntegrity = z;
        this.uiTemplate = innerPushUITemplate;
        this.config = innerPushConfig;
        this.bizExtraJsonStr = str2;
        this.isNotice = z2;
        this.noticeInfo = noticeInfo;
        this.markStatus = z3;
        this.convertFromExternal = z4;
        this.LJLILLLLZI = z5;
        this.LJLJI = map;
        this.mobEventJsonStr = str3;
        this.rid = j4;
        this.settingKey = str4;
        this.LJLJJI = z6;
        this.LJLJJL = EnumC86508XxI.FROM_PULLER;
        this.LJLJJLL = C221108m2.LIZIZ(C86524XxY.LJLIL);
    }

    public /* synthetic */ InnerPushMessage(int i, int i2, long j, long j2, Serializable serializable, int i3, int i4, String str, long j3, boolean z, InnerPushUITemplate innerPushUITemplate, InnerPushConfig innerPushConfig, String str2, boolean z2, NoticeInfo noticeInfo, boolean z3, boolean z4, boolean z5, Map map, String str3, long j4, String str4, boolean z6, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 1 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0L : j, (i5 & 8) != 0 ? 0L : j2, (i5 & 16) != 0 ? null : serializable, (i5 & 32) != 0 ? 0 : i3, (i5 & 64) != 0 ? 0 : i4, (i5 & 128) != 0 ? null : str, (i5 & 256) != 0 ? 0L : j3, (i5 & 512) != 0 ? false : z, (i5 & 1024) != 0 ? null : innerPushUITemplate, (i5 & 2048) != 0 ? null : innerPushConfig, (i5 & 4096) != 0 ? null : str2, (i5 & FileUtils.BUFFER_SIZE) != 0 ? false : z2, (i5 & 16384) != 0 ? null : noticeInfo, (32768 & i5) != 0 ? true : z3, (65536 & i5) != 0 ? false : z4, (131072 & i5) != 0 ? false : z5, (262144 & i5) != 0 ? null : map, (524288 & i5) != 0 ? null : str3, (1048576 & i5) != 0 ? 0L : j4, (2097152 & i5) != 0 ? null : str4, (i5 & 4194304) != 0 ? false : z6);
    }
}
