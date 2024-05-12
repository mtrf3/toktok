package com.ss.android.ugc.aweme.im.message.template.component;

import X.C05040Hs;
import X.C1FJ;
import X.C1FL;
import X.C221108m2;
import X.C5H3;
import X.C62849OlZ;
import X.C78920UyC;
import X.C79129V3t;
import X.C79135V3z;
import X.RUF;
import X.V2Z;
import X.V36;
import X.V37;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class BaseUserComponent implements BaseComponent<C79129V3t> {
    public ImageComponent avatar;
    public TextComponent description;
    public Integer followerCount;
    public Boolean isVerify;
    public final ActionLinkComponent linkComponent;
    public TextComponent nickname;
    public Long userId;
    public TextComponent username;
    public static final C62849OlZ Companion = new C62849OlZ();
    public static final Parcelable.Creator<BaseUserComponent> CREATOR = new V2Z();
    public static final C5H3<BaseUserComponent> EMPTY_USER_INFO$delegate = C221108m2.LIZIZ(V37.LJLIL);

    /* JADX WARN: Multi-variable type inference failed */
    public BaseUserComponent() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseUserComponent)) {
            return false;
        }
        BaseUserComponent baseUserComponent = (BaseUserComponent) obj;
        return o.LJ(this.userId, baseUserComponent.userId) && o.LJ(this.nickname, baseUserComponent.nickname) && o.LJ(this.description, baseUserComponent.description) && o.LJ(this.avatar, baseUserComponent.avatar) && o.LJ(this.linkComponent, baseUserComponent.linkComponent) && o.LJ(this.username, baseUserComponent.username) && o.LJ(this.followerCount, baseUserComponent.followerCount) && o.LJ(this.isVerify, baseUserComponent.isVerify);
    }

    public final int hashCode() {
        Long l = this.userId;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        TextComponent textComponent = this.nickname;
        int hashCode2 = (hashCode + (textComponent == null ? 0 : textComponent.hashCode())) * 31;
        TextComponent textComponent2 = this.description;
        int hashCode3 = (hashCode2 + (textComponent2 == null ? 0 : textComponent2.hashCode())) * 31;
        ImageComponent imageComponent = this.avatar;
        int hashCode4 = (this.linkComponent.hashCode() + ((hashCode3 + (imageComponent == null ? 0 : imageComponent.hashCode())) * 31)) * 31;
        TextComponent textComponent3 = this.username;
        int hashCode5 = (hashCode4 + (textComponent3 == null ? 0 : textComponent3.hashCode())) * 31;
        Integer num = this.followerCount;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isVerify;
        return hashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public final C79129V3t LIZ() {
        RUF ruf;
        RUF ruf2;
        C79135V3z c79135V3z;
        V36 v36 = new V36();
        v36.LIZLLL = this.userId;
        TextComponent textComponent = this.nickname;
        RUF ruf3 = null;
        if (textComponent != null) {
            ruf = textComponent.L();
        } else {
            ruf = null;
        }
        v36.LJ = ruf;
        TextComponent textComponent2 = this.description;
        if (textComponent2 != null) {
            ruf2 = textComponent2.L();
        } else {
            ruf2 = null;
        }
        v36.LJFF = ruf2;
        ImageComponent imageComponent = this.avatar;
        if (imageComponent != null) {
            c79135V3z = imageComponent.LIZIZ();
        } else {
            c79135V3z = null;
        }
        v36.LJI = c79135V3z;
        v36.LJII = this.linkComponent.M();
        TextComponent textComponent3 = this.username;
        if (textComponent3 != null) {
            ruf3 = textComponent3.L();
        }
        v36.LJIIIIZZ = ruf3;
        v36.LJIIIZ = this.followerCount;
        v36.LJIIJ = this.isVerify;
        return v36.build();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BaseUserComponent(userId=");
        LIZ.append(this.userId);
        LIZ.append(", nickname=");
        LIZ.append(this.nickname);
        LIZ.append(", description=");
        LIZ.append(this.description);
        LIZ.append(", avatar=");
        LIZ.append(this.avatar);
        LIZ.append(", linkComponent=");
        LIZ.append(this.linkComponent);
        LIZ.append(", username=");
        LIZ.append(this.username);
        LIZ.append(", followerCount=");
        LIZ.append(this.followerCount);
        LIZ.append(", isVerify=");
        return C78920UyC.LIZIZ(LIZ, this.isVerify, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Long l = this.userId;
        if (l == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l);
        }
        TextComponent textComponent = this.nickname;
        if (textComponent == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            textComponent.writeToParcel(out, i);
        }
        TextComponent textComponent2 = this.description;
        if (textComponent2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            textComponent2.writeToParcel(out, i);
        }
        ImageComponent imageComponent = this.avatar;
        if (imageComponent == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            imageComponent.writeToParcel(out, i);
        }
        this.linkComponent.writeToParcel(out, i);
        TextComponent textComponent3 = this.username;
        if (textComponent3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            textComponent3.writeToParcel(out, i);
        }
        Integer num = this.followerCount;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Boolean bool = this.isVerify;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ BaseUserComponent(java.lang.Long r10, com.ss.android.ugc.aweme.im.message.template.component.TextComponent r11, com.ss.android.ugc.aweme.im.message.template.component.TextComponent r12, com.ss.android.ugc.aweme.im.message.template.component.ImageComponent r13, int r14) {
        /*
            r9 = this;
            r4 = r13
            r3 = r12
            r1 = r10
            r2 = r11
            r0 = r14 & 1
            r5 = 0
            if (r0 == 0) goto La
            r1 = r5
        La:
            r0 = r14 & 2
            if (r0 == 0) goto Lf
            r2 = r5
        Lf:
            r0 = r14 & 4
            if (r0 == 0) goto L14
            r3 = r5
        L14:
            r0 = r14 & 8
            if (r0 == 0) goto L19
            r4 = r5
        L19:
            r0 = r14 & 16
            if (r0 == 0) goto L26
            X.OzX r0 = com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent r5 = X.C63715OzX.LIZ()
        L26:
            r6 = 0
            r0 = r9
            r7 = r6
            r8 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent.<init>(java.lang.Long, com.ss.android.ugc.aweme.im.message.template.component.TextComponent, com.ss.android.ugc.aweme.im.message.template.component.TextComponent, com.ss.android.ugc.aweme.im.message.template.component.ImageComponent, int):void");
    }

    public BaseUserComponent(Long l, TextComponent textComponent, TextComponent textComponent2, ImageComponent imageComponent, ActionLinkComponent linkComponent, TextComponent textComponent3, Integer num, Boolean bool) {
        o.LJIIIZ(linkComponent, "linkComponent");
        this.userId = l;
        this.nickname = textComponent;
        this.description = textComponent2;
        this.avatar = imageComponent;
        this.linkComponent = linkComponent;
        this.username = textComponent3;
        this.followerCount = num;
        this.isVerify = bool;
    }
}
