package com.ss.android.ugc.tiktok.location_api.service.experiment;

import X.C35908E7k;
import X.HG3;
import X.InterfaceC65349Pkn;
import X.RBX;
import X.X1D;
import com.bytedance.keva.Keva;
import defpackage.b0;
import defpackage.i0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiReviewFrequencyControl {
    public static final PoiReviewFrequencyControl LIZ = new PoiReviewFrequencyControl();
    public static final Keva LIZIZ = C35908E7k.LIZIZ();

    /* loaded from: classes4.dex */
    public static final class Frequency {

        @InterfaceC65349Pkn("frequency_day")
        public final int frequencyDay;

        @InterfaceC65349Pkn("frequency_times")
        public final int frequencyTimes;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Frequency)) {
                return false;
            }
            Frequency frequency = (Frequency) obj;
            return this.frequencyDay == frequency.frequencyDay && this.frequencyTimes == frequency.frequencyTimes;
        }

        public final int hashCode() {
            return (this.frequencyDay * 31) + this.frequencyTimes;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Frequency(frequencyDay=");
            LIZ.append(this.frequencyDay);
            LIZ.append(", frequencyTimes=");
            return b0.LIZJ(LIZ, this.frequencyTimes, ')', LIZ);
        }

        public Frequency(int i, int i2) {
            this.frequencyDay = i;
            this.frequencyTimes = i2;
        }
    }

    public static InnerConfig LIZ() {
        return (InnerConfig) i0.LJ(false, "poi_review_frequency_control", 31744, InnerConfig.class, null);
    }

    /* loaded from: classes4.dex */
    public static final class FriendPage {

        @InterfaceC65349Pkn("poi")
        public final Frequency poi;

        /* JADX WARN: Multi-variable type inference failed */
        public FriendPage() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FriendPage) && o.LJ(this.poi, ((FriendPage) obj).poi);
        }

        public final int hashCode() {
            Frequency frequency = this.poi;
            if (frequency == null) {
                return 0;
            }
            return frequency.hashCode();
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("FriendPage(poi=");
            LIZ.append(this.poi);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public FriendPage(Frequency frequency) {
            this.poi = frequency;
        }

        public /* synthetic */ FriendPage(Frequency frequency, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : frequency);
        }
    }

    /* loaded from: classes4.dex */
    public static final class InnerConfig {

        @InterfaceC65349Pkn("friend_page")
        public final FriendPage friendPage;

        @InterfaceC65349Pkn("profile_page")
        public final ProfilePage profilePage;

        /* JADX WARN: Multi-variable type inference failed */
        public InnerConfig() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InnerConfig)) {
                return false;
            }
            InnerConfig innerConfig = (InnerConfig) obj;
            return o.LJ(this.friendPage, innerConfig.friendPage) && o.LJ(this.profilePage, innerConfig.profilePage);
        }

        public final int hashCode() {
            FriendPage friendPage = this.friendPage;
            int hashCode = (friendPage == null ? 0 : friendPage.hashCode()) * 31;
            ProfilePage profilePage = this.profilePage;
            return hashCode + (profilePage != null ? profilePage.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("InnerConfig(friendPage=");
            LIZ.append(this.friendPage);
            LIZ.append(", profilePage=");
            LIZ.append(this.profilePage);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public InnerConfig(FriendPage friendPage, ProfilePage profilePage) {
            this.friendPage = friendPage;
            this.profilePage = profilePage;
        }

        public /* synthetic */ InnerConfig(FriendPage friendPage, ProfilePage profilePage, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : friendPage, (i & 2) != 0 ? null : profilePage);
        }
    }

    /* loaded from: classes4.dex */
    public static final class ProfilePage {

        @InterfaceC65349Pkn("poi")
        public final Frequency poi;

        @InterfaceC65349Pkn("video")
        public final Frequency video;

        /* JADX WARN: Multi-variable type inference failed */
        public ProfilePage() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProfilePage)) {
                return false;
            }
            ProfilePage profilePage = (ProfilePage) obj;
            return o.LJ(this.video, profilePage.video) && o.LJ(this.poi, profilePage.poi);
        }

        public final int hashCode() {
            Frequency frequency = this.video;
            int hashCode = (frequency == null ? 0 : frequency.hashCode()) * 31;
            Frequency frequency2 = this.poi;
            return hashCode + (frequency2 != null ? frequency2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ProfilePage(video=");
            LIZ.append(this.video);
            LIZ.append(", poi=");
            LIZ.append(this.poi);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public ProfilePage(Frequency frequency, Frequency frequency2) {
            this.video = frequency;
            this.poi = frequency2;
        }

        public /* synthetic */ ProfilePage(Frequency frequency, Frequency frequency2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : frequency, (i & 2) != 0 ? null : frequency2);
        }
    }

    public static String LIZIZ(String str, String str2) {
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append('_');
        LIZ2.append(curUserId);
        LIZ2.append('_');
        LIZ2.append(str2);
        return X1D.LIZIZ(LIZ2);
    }
}
