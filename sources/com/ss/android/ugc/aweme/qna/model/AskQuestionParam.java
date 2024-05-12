package com.ss.android.ugc.aweme.qna.model;

import X.X1D;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qna.model.AskQuestionParam;
import defpackage.q;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AskQuestionParam implements Serializable, IRouteArg {
    public static final Parcelable.Creator<AskQuestionParam> CREATOR = new Parcelable.Creator<AskQuestionParam>() { // from class: X.4lW
        @Override // android.os.Parcelable.Creator
        public final AskQuestionParam createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            boolean z;
            boolean z2;
            boolean z3;
            o.LJIIIZ(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(parcel.readSerializable());
                }
            }
            String readString4 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new AskQuestionParam(readString, readString2, readString3, arrayList, readString4, z, z2, z3, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AskQuestionParam[] newArray(int i) {
            return new AskQuestionParam[i];
        }
    };
    public boolean autoInvite;
    public boolean bannerShow;
    public String bannerText;
    public String enterFrom;
    public String enterMethod;
    public ArrayList<User> invitedUsers;
    public String qaOrigin;
    public String question;
    public boolean recordShow;
    public String uid;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AskQuestionParam() {
        /*
            r13 = this;
            r1 = 0
            r6 = 0
            r11 = 1023(0x3ff, float:1.434E-42)
            r0 = r13
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r7 = r6
            r8 = r6
            r9 = r1
            r10 = r1
            r12 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.qna.model.AskQuestionParam.<init>():void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AskQuestionParam(java.lang.String r14) {
        /*
            r13 = this;
            r2 = 0
            r6 = 0
            r11 = 1022(0x3fe, float:1.432E-42)
            r0 = r13
            r1 = r14
            r3 = r2
            r4 = r2
            r5 = r2
            r7 = r6
            r8 = r6
            r9 = r2
            r10 = r2
            r12 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.qna.model.AskQuestionParam.<init>(java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AskQuestionParam(java.lang.String r14, java.lang.String r15) {
        /*
            r13 = this;
            r3 = 0
            r6 = 0
            r11 = 1020(0x3fc, float:1.43E-42)
            r1 = r14
            r2 = r15
            r0 = r13
            r4 = r3
            r5 = r3
            r7 = r6
            r8 = r6
            r9 = r3
            r10 = r3
            r12 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.qna.model.AskQuestionParam.<init>(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AskQuestionParam(java.lang.String r14, java.lang.String r15, java.lang.String r16) {
        /*
            r13 = this;
            r4 = 0
            r6 = 0
            r11 = 1016(0x3f8, float:1.424E-42)
            r1 = r14
            r0 = r13
            r3 = r16
            r2 = r15
            r5 = r4
            r7 = r6
            r8 = r6
            r9 = r4
            r10 = r4
            r12 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.qna.model.AskQuestionParam.<init>(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AskQuestionParam(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.util.ArrayList<com.ss.android.ugc.aweme.profile.model.User> r17) {
        /*
            r13 = this;
            r5 = 0
            r6 = 0
            r11 = 1008(0x3f0, float:1.413E-42)
            r1 = r14
            r0 = r13
            r2 = r15
            r4 = r17
            r3 = r16
            r7 = r6
            r8 = r6
            r9 = r5
            r10 = r5
            r12 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.qna.model.AskQuestionParam.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AskQuestionParam(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.util.ArrayList<com.ss.android.ugc.aweme.profile.model.User> r17, java.lang.String r18) {
        /*
            r13 = this;
            r6 = 0
            r9 = 0
            r11 = 992(0x3e0, float:1.39E-42)
            r1 = r14
            r0 = r13
            r2 = r15
            r3 = r16
            r5 = r18
            r4 = r17
            r7 = r6
            r8 = r6
            r10 = r9
            r12 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.qna.model.AskQuestionParam.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AskQuestionParam(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.util.ArrayList<com.ss.android.ugc.aweme.profile.model.User> r17, java.lang.String r18, boolean r19) {
        /*
            r13 = this;
            r7 = 0
            r9 = 0
            r11 = 960(0x3c0, float:1.345E-42)
            r5 = r18
            r1 = r14
            r6 = r19
            r0 = r13
            r2 = r15
            r3 = r16
            r4 = r17
            r8 = r7
            r10 = r9
            r12 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.qna.model.AskQuestionParam.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.lang.String, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AskQuestionParam(String str, String str2, String str3, ArrayList<User> arrayList, String str4, boolean z, boolean z2) {
        this(str, str2, str3, arrayList, str4, z, z2, false, null, 0 == true ? 1 : 0, 896, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AskQuestionParam(String str, String str2, String str3, ArrayList<User> arrayList, String str4, boolean z, boolean z2, boolean z3) {
        this(str, str2, str3, arrayList, str4, z, z2, z3, null, 0 == true ? 1 : 0, 768, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AskQuestionParam(String str, String str2, String str3, ArrayList<User> arrayList, String str4, boolean z, boolean z2, boolean z3, String str5) {
        this(str, str2, str3, arrayList, str4, z, z2, z3, str5, null, 512, 0 == true ? 1 : 0);
    }

    public static AskQuestionParam __fromBundle(Bundle bundle) {
        int i;
        String str;
        String str2;
        String str3;
        ArrayList arrayList;
        String str4;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        String str5;
        String str6 = null;
        if (bundle == null) {
            return null;
        }
        if (bundle.containsKey("enter_from")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("enter_from"), String.class);
            i = 0;
        } else {
            i = 1;
            str = null;
        }
        if (bundle.containsKey("enter_method")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("enter_method"), String.class);
        } else {
            i += 2;
            str2 = null;
        }
        if (bundle.containsKey("question")) {
            str3 = (String) RouteParser.INSTANCE.parse(bundle.get("question"), String.class);
        } else {
            i += 4;
            str3 = null;
        }
        if (bundle.containsKey("invited_users")) {
            arrayList = (ArrayList) RouteParser.INSTANCE.parse(bundle.get("invited_users"), ArrayList.class);
        } else {
            i += 8;
            arrayList = null;
        }
        if (bundle.containsKey("banner_text")) {
            str4 = (String) RouteParser.INSTANCE.parse(bundle.get("banner_text"), String.class);
        } else {
            i += 16;
            str4 = null;
        }
        if (bundle.containsKey("banner_show")) {
            bool = (Boolean) RouteParser.INSTANCE.parse(bundle.get("banner_show"), Boolean.class);
            if (bool == null) {
                i += 32;
            }
        } else {
            i += 32;
            bool = null;
        }
        if (bundle.containsKey("record_show")) {
            bool2 = (Boolean) RouteParser.INSTANCE.parse(bundle.get("record_show"), Boolean.class);
            if (bool2 == null) {
                i += 64;
            }
        } else {
            i += 64;
            bool2 = null;
        }
        if (bundle.containsKey("auto_invite")) {
            bool3 = (Boolean) RouteParser.INSTANCE.parse(bundle.get("auto_invite"), Boolean.class);
            if (bool3 == null) {
                i += 128;
            }
        } else {
            i += 128;
            bool3 = null;
        }
        if (bundle.containsKey("uid")) {
            str5 = (String) RouteParser.INSTANCE.parse(bundle.get("uid"), String.class);
        } else {
            i += 256;
            str5 = null;
        }
        if (bundle.containsKey("qa_origin")) {
            str6 = (String) RouteParser.INSTANCE.parse(bundle.get("qa_origin"), String.class);
        } else {
            i += 512;
        }
        return new AskQuestionParam(str, str2, str3, arrayList, str4, bool != null ? bool.booleanValue() : false, bool2 != null ? bool2.booleanValue() : false, bool3 != null ? bool3.booleanValue() : false, str5, str6, i, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AskQuestionParam copy$default(AskQuestionParam askQuestionParam, String str, String str2, String str3, ArrayList arrayList, String str4, boolean z, boolean z2, boolean z3, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = askQuestionParam.enterFrom;
        }
        if ((i & 2) != 0) {
            str2 = askQuestionParam.enterMethod;
        }
        if ((i & 4) != 0) {
            str3 = askQuestionParam.question;
        }
        if ((i & 8) != 0) {
            arrayList = askQuestionParam.invitedUsers;
        }
        if ((i & 16) != 0) {
            str4 = askQuestionParam.bannerText;
        }
        if ((i & 32) != 0) {
            z = askQuestionParam.bannerShow;
        }
        if ((i & 64) != 0) {
            z2 = askQuestionParam.recordShow;
        }
        if ((i & 128) != 0) {
            z3 = askQuestionParam.autoInvite;
        }
        if ((i & 256) != 0) {
            str5 = askQuestionParam.uid;
        }
        if ((i & 512) != 0) {
            str6 = askQuestionParam.qaOrigin;
        }
        return askQuestionParam.copy(str, str2, str3, arrayList, str4, z, z2, z3, str5, str6);
    }

    public final AskQuestionParam copy(String str, String str2, String str3, ArrayList<User> arrayList, String str4, boolean z, boolean z2, boolean z3, String str5, String str6) {
        return new AskQuestionParam(str, str2, str3, arrayList, str4, z, z2, z3, str5, str6);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AskQuestionParam)) {
            return false;
        }
        AskQuestionParam askQuestionParam = (AskQuestionParam) obj;
        return o.LJ(this.enterFrom, askQuestionParam.enterFrom) && o.LJ(this.enterMethod, askQuestionParam.enterMethod) && o.LJ(this.question, askQuestionParam.question) && o.LJ(this.invitedUsers, askQuestionParam.invitedUsers) && o.LJ(this.bannerText, askQuestionParam.bannerText) && this.bannerShow == askQuestionParam.bannerShow && this.recordShow == askQuestionParam.recordShow && this.autoInvite == askQuestionParam.autoInvite && o.LJ(this.uid, askQuestionParam.uid) && o.LJ(this.qaOrigin, askQuestionParam.qaOrigin);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.enterFrom;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.enterMethod;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.question;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ArrayList<User> arrayList = this.invitedUsers;
        int hashCode4 = (hashCode3 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        String str4 = this.bannerText;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        boolean z = this.bannerShow;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode5 + i) * 31;
        boolean z2 = this.recordShow;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (((i2 + i3) * 31) + (this.autoInvite ? 1 : 0)) * 31;
        String str5 = this.uid;
        int hashCode6 = (i4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.qaOrigin;
        return hashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.enterFrom);
        out.writeString(this.enterMethod);
        out.writeString(this.question);
        ArrayList<User> arrayList = this.invitedUsers;
        if (arrayList == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(arrayList.size());
            Iterator<User> it = arrayList.iterator();
            while (it.hasNext()) {
                out.writeSerializable(it.next());
            }
        }
        out.writeString(this.bannerText);
        out.writeInt(this.bannerShow ? 1 : 0);
        out.writeInt(this.recordShow ? 1 : 0);
        out.writeInt(this.autoInvite ? 1 : 0);
        out.writeString(this.uid);
        out.writeString(this.qaOrigin);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AskQuestionParam(enterFrom=");
        LIZ.append(this.enterFrom);
        LIZ.append(", enterMethod=");
        LIZ.append(this.enterMethod);
        LIZ.append(", question=");
        LIZ.append(this.question);
        LIZ.append(", invitedUsers=");
        LIZ.append(this.invitedUsers);
        LIZ.append(", bannerText=");
        LIZ.append(this.bannerText);
        LIZ.append(", bannerShow=");
        LIZ.append(this.bannerShow);
        LIZ.append(", recordShow=");
        LIZ.append(this.recordShow);
        LIZ.append(", autoInvite=");
        LIZ.append(this.autoInvite);
        LIZ.append(", uid=");
        LIZ.append(this.uid);
        LIZ.append(", qaOrigin=");
        return q.LIZIZ(LIZ, this.qaOrigin, ')', LIZ);
    }

    public final boolean getAutoInvite() {
        return this.autoInvite;
    }

    public final boolean getBannerShow() {
        return this.bannerShow;
    }

    public final String getBannerText() {
        return this.bannerText;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final ArrayList<User> getInvitedUsers() {
        return this.invitedUsers;
    }

    public final String getQaOrigin() {
        return this.qaOrigin;
    }

    public final String getQuestion() {
        return this.question;
    }

    public final boolean getRecordShow() {
        return this.recordShow;
    }

    public final String getUid() {
        return this.uid;
    }

    public final void setAutoInvite(boolean z) {
        this.autoInvite = z;
    }

    public final void setBannerShow(boolean z) {
        this.bannerShow = z;
    }

    public final void setBannerText(String str) {
        this.bannerText = str;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setEnterMethod(String str) {
        this.enterMethod = str;
    }

    public final void setInvitedUsers(ArrayList<User> arrayList) {
        this.invitedUsers = arrayList;
    }

    public final void setQaOrigin(String str) {
        this.qaOrigin = str;
    }

    public final void setQuestion(String str) {
        this.question = str;
    }

    public final void setRecordShow(boolean z) {
        this.recordShow = z;
    }

    public final void setUid(String str) {
        this.uid = str;
    }

    public AskQuestionParam(String str, String str2, String str3, ArrayList<User> arrayList, String str4, boolean z, boolean z2, boolean z3, String str5, String str6) {
        this.enterFrom = str;
        this.enterMethod = str2;
        this.question = str3;
        this.invitedUsers = arrayList;
        this.bannerText = str4;
        this.bannerShow = z;
        this.recordShow = z2;
        this.autoInvite = z3;
        this.uid = str5;
        this.qaOrigin = str6;
    }

    public /* synthetic */ AskQuestionParam(String str, String str2, String str3, ArrayList arrayList, String str4, boolean z, boolean z2, boolean z3, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : arrayList, (i & 16) == 0 ? str4 : null, (i & 32) != 0 ? false : z, (i & 64) != 0 ? true : z2, (i & 128) == 0 ? z3 : false, (i & 256) != 0 ? "" : str5, (i & 512) == 0 ? str6 : "");
    }
}
