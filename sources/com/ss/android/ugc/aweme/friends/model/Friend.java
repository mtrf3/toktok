package com.ss.android.ugc.aweme.friends.model;

import X.C16880lQ;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.reflect.Field;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class Friend extends User {
    public static final Companion Companion = new Companion();
    public boolean isFirstOne;
    public boolean isInvited;

    @InterfaceC65349Pkn("phone_number")
    public String phoneNumber;
    public transient String photoUri;
    public String section = "";

    @InterfaceC65349Pkn("social_name")
    public String socialName;

    @Override // com.ss.android.ugc.aweme.profile.model.User
    public int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        String str = this.socialName;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        String str2 = this.phoneNumber;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final Friend copyFrom(User user) {
            if (user == null) {
                return null;
            }
            if (user instanceof Friend) {
                return (Friend) user;
            }
            Friend friend = new Friend(null);
            Field[] declaredFields = User.class.getDeclaredFields();
            o.LJIIIIZZ(declaredFields, "User::class.java.declaredFields");
            for (Field field : declaredFields) {
                if (field.getAnnotation(InterfaceC65349Pkn.class) != null) {
                    field.setAccessible(true);
                    try {
                        field.set(friend, field.get(user));
                    } catch (IllegalAccessException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
            friend.setRequestId(user.getRequestId());
            return friend;
        }
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final String getPhotoUri() {
        return this.photoUri;
    }

    public final String getSection() {
        return this.section;
    }

    public final String getSocialName() {
        return this.socialName;
    }

    public final boolean isFirstOne() {
        return this.isFirstOne;
    }

    public final boolean isInvited() {
        return this.isInvited;
    }

    public Friend(String str) {
        this.socialName = str;
    }

    @Override // com.ss.android.ugc.aweme.profile.model.User
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !o.LJ(Friend.class, obj.getClass()) || !super.equals(obj)) {
            return false;
        }
        Friend friend = (Friend) obj;
        if (o.LJ(this.socialName, friend.socialName) && o.LJ(this.phoneNumber, friend.phoneNumber)) {
            return true;
        }
        return false;
    }

    public final void setFirstOne(boolean z) {
        this.isFirstOne = z;
    }

    public final void setInvited(boolean z) {
        this.isInvited = z;
    }

    public final void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public final void setPhotoUri(String str) {
        this.photoUri = str;
    }

    public final void setSection(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.section = str;
    }

    public final void setSocialName(String str) {
        this.socialName = str;
    }
}
