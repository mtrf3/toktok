package com.ss.android.ugc.aweme.upvote.event;

import X.F9E;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class UpvotePublishMobParam extends F9E implements Parcelable {
    public static final Parcelable.Creator<UpvotePublishMobParam> CREATOR = new Parcelable.Creator<UpvotePublishMobParam>() { // from class: X.7HC
        @Override // android.os.Parcelable.Creator
        public final UpvotePublishMobParam createFromParcel(Parcel parcel) {
            boolean z;
            o.LJIIIZ(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new UpvotePublishMobParam(readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, z, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UpvotePublishMobParam[] newArray(int i) {
            return new UpvotePublishMobParam[i];
        }
    };
    public String authorId;
    public String enterFrom;
    public String enterMethod;
    public String followStatus;
    public String groupId;
    public boolean isAiDecision;
    public String isFirst;
    public String isRecommend;
    public String panelSource;
    public String recommendCount;
    public String traceId;
    public String trigger;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UpvotePublishMobParam() {
        /*
            r12 = this;
            r1 = 0
            r9 = 0
            r11 = 4095(0xfff, float:5.738E-42)
            r0 = r12
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r1
            r10 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.enterFrom, this.enterMethod, this.groupId, this.authorId, this.followStatus, this.isFirst, this.isRecommend, this.recommendCount, this.trigger, this.panelSource, Boolean.valueOf(this.isAiDecision), this.traceId};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.enterFrom);
        out.writeString(this.enterMethod);
        out.writeString(this.groupId);
        out.writeString(this.authorId);
        out.writeString(this.followStatus);
        out.writeString(this.isFirst);
        out.writeString(this.isRecommend);
        out.writeString(this.recommendCount);
        out.writeString(this.trigger);
        out.writeString(this.panelSource);
        out.writeInt(this.isAiDecision ? 1 : 0);
        out.writeString(this.traceId);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ UpvotePublishMobParam(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, boolean r23, java.lang.String r24, int r25) {
        /*
            r14 = this;
            r1 = r25
            r12 = r23
            r11 = r22
            r10 = r21
            r3 = r16
            r2 = r15
            r4 = r17
            r5 = r18
            r6 = r19
            r8 = r20
            r0 = r1 & 1
            java.lang.String r13 = ""
            if (r0 == 0) goto L1a
            r2 = r13
        L1a:
            r0 = r1 & 2
            if (r0 == 0) goto L1f
            r3 = r13
        L1f:
            r0 = r1 & 4
            if (r0 == 0) goto L24
            r4 = r13
        L24:
            r0 = r1 & 8
            if (r0 == 0) goto L29
            r5 = r13
        L29:
            r0 = r1 & 16
            if (r0 == 0) goto L2e
            r6 = r13
        L2e:
            r0 = r1 & 32
            r9 = 0
            if (r0 == 0) goto L59
            r7 = r13
        L34:
            r0 = r1 & 64
            if (r0 == 0) goto L39
            r8 = r13
        L39:
            r0 = r1 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L3e
            r9 = r13
        L3e:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L43
            r10 = r13
        L43:
            r0 = r1 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L48
            r11 = r13
        L48:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L4d
            r12 = 0
        L4d:
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L56
        L51:
            r1 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L56:
            r13 = r24
            goto L51
        L59:
            r7 = r9
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int):void");
    }

    public UpvotePublishMobParam(String enterFrom, String enterMethod, String groupId, String authorId, String followStatus, String isFirst, String isRecommend, String recommendCount, String trigger, String panelSource, boolean z, String traceId) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(groupId, "groupId");
        o.LJIIIZ(authorId, "authorId");
        o.LJIIIZ(followStatus, "followStatus");
        o.LJIIIZ(isFirst, "isFirst");
        o.LJIIIZ(isRecommend, "isRecommend");
        o.LJIIIZ(recommendCount, "recommendCount");
        o.LJIIIZ(trigger, "trigger");
        o.LJIIIZ(panelSource, "panelSource");
        o.LJIIIZ(traceId, "traceId");
        this.enterFrom = enterFrom;
        this.enterMethod = enterMethod;
        this.groupId = groupId;
        this.authorId = authorId;
        this.followStatus = followStatus;
        this.isFirst = isFirst;
        this.isRecommend = isRecommend;
        this.recommendCount = recommendCount;
        this.trigger = trigger;
        this.panelSource = panelSource;
        this.isAiDecision = z;
        this.traceId = traceId;
    }
}
