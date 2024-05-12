package com.ss.android.ugc.aweme.relation.experiment;

import X.C221018lt;
import X.C221108m2;
import X.C57758Mle;
import X.C62822Ol8;
import X.EnumC57901Mnx;
import X.HG3;
import X.InterfaceC65349Pkn;
import X.RBX;
import X.X1D;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.profile.model.User;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class RecMoreExperiment {
    public static final Value LIZ = new Value(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C57758Mle.LJLIL);
    public static final Keva LIZJ = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME);
    public static String LIZLLL;
    public static int LJ;

    /* loaded from: classes10.dex */
    public static final class CardStrategy {

        @InterfaceC65349Pkn("enable")
        public final Integer enable;

        @InterfaceC65349Pkn("follow_period_hours")
        public final Integer followPeriodHours;

        @InterfaceC65349Pkn("high")
        public final Integer high;

        @InterfaceC65349Pkn("low")
        public final Integer low;

        @InterfaceC65349Pkn("max_follow_count")
        public final Integer maxFollowCount;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CardStrategy)) {
                return false;
            }
            CardStrategy cardStrategy = (CardStrategy) obj;
            return o.LJ(this.enable, cardStrategy.enable) && o.LJ(this.low, cardStrategy.low) && o.LJ(this.high, cardStrategy.high) && o.LJ(this.maxFollowCount, cardStrategy.maxFollowCount) && o.LJ(this.followPeriodHours, cardStrategy.followPeriodHours);
        }

        public final int hashCode() {
            Integer num = this.enable;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.low;
            int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.high;
            int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.maxFollowCount;
            int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.followPeriodHours;
            return hashCode4 + (num5 != null ? num5.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CardStrategy(enable=");
            LIZ.append(this.enable);
            LIZ.append(", low=");
            LIZ.append(this.low);
            LIZ.append(", high=");
            LIZ.append(this.high);
            LIZ.append(", maxFollowCount=");
            LIZ.append(this.maxFollowCount);
            LIZ.append(", followPeriodHours=");
            return s0.LIZJ(LIZ, this.followPeriodHours, ')', LIZ);
        }

        public CardStrategy(Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
            this.enable = num;
            this.low = num2;
            this.high = num3;
            this.maxFollowCount = num4;
            this.followPeriodHours = num5;
        }
    }

    /* loaded from: classes10.dex */
    public static final class VideoStrategy {

        @InterfaceC65349Pkn("disable_function_days")
        public final Integer disableDays;

        @InterfaceC65349Pkn("enable")
        public final Integer enable;

        @InterfaceC65349Pkn("follow_period_hours")
        public final Integer followPeriodHours;

        @InterfaceC65349Pkn("high")
        public final Integer high;

        @InterfaceC65349Pkn("low")
        public final Integer low;

        @InterfaceC65349Pkn("max_follow_count")
        public final Integer maxFollowCount;

        @InterfaceC65349Pkn("max_show_count")
        public final Integer maxShowCount;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VideoStrategy)) {
                return false;
            }
            VideoStrategy videoStrategy = (VideoStrategy) obj;
            return o.LJ(this.enable, videoStrategy.enable) && o.LJ(this.low, videoStrategy.low) && o.LJ(this.high, videoStrategy.high) && o.LJ(this.maxShowCount, videoStrategy.maxShowCount) && o.LJ(this.disableDays, videoStrategy.disableDays) && o.LJ(this.maxFollowCount, videoStrategy.maxFollowCount) && o.LJ(this.followPeriodHours, videoStrategy.followPeriodHours);
        }

        public final int hashCode() {
            Integer num = this.enable;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.low;
            int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.high;
            int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.maxShowCount;
            int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.disableDays;
            int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.maxFollowCount;
            int hashCode6 = (hashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
            Integer num7 = this.followPeriodHours;
            return hashCode6 + (num7 != null ? num7.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VideoStrategy(enable=");
            LIZ.append(this.enable);
            LIZ.append(", low=");
            LIZ.append(this.low);
            LIZ.append(", high=");
            LIZ.append(this.high);
            LIZ.append(", maxShowCount=");
            LIZ.append(this.maxShowCount);
            LIZ.append(", disableDays=");
            LIZ.append(this.disableDays);
            LIZ.append(", maxFollowCount=");
            LIZ.append(this.maxFollowCount);
            LIZ.append(", followPeriodHours=");
            return s0.LIZJ(LIZ, this.followPeriodHours, ')', LIZ);
        }

        public VideoStrategy(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
            this.enable = num;
            this.low = num2;
            this.high = num3;
            this.maxShowCount = num4;
            this.disableDays = num5;
            this.maxFollowCount = num6;
            this.followPeriodHours = num7;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        LIZLLL = curUserId;
        LJ = -1;
    }

    public static Value LJI() {
        return (Value) LIZIZ.getValue();
    }

    public static void LIZ() {
        int i;
        RBX rbx = (RBX) HG3.LJIILL();
        String curUserId = rbx.getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        int i2 = 0;
        if (!o.LJ(curUserId, LIZLLL)) {
            LIZLLL = curUserId;
            User curUser = rbx.getCurUser();
            if (curUser != null) {
                i = curUser.getFriendCount();
            } else {
                i = 0;
            }
            LJ = i;
        }
        if (LJ == -1) {
            User curUser2 = rbx.getCurUser();
            if (curUser2 != null) {
                i2 = curUser2.getFriendCount();
            }
            LJ = i2;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("check friends_cnt: ");
        LIZ2.append(LJ);
        C221018lt.LJFF("RecMore", X1D.LIZIZ(LIZ2));
    }

    public static String LIZLLL() {
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        if (curUserId == null) {
            return "";
        }
        return curUserId;
    }

    public static String LJ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("video_recuser_disable_time_");
        LIZ2.append(LIZLLL());
        return X1D.LIZIZ(LIZ2);
    }

    public static String LJFF() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("video_recuser_show_key_");
        LIZ2.append(LIZLLL());
        return X1D.LIZIZ(LIZ2);
    }

    public static int LIZJ(EnumC57901Mnx enumC57901Mnx) {
        Keva keva = LIZJ;
        long j = keva.getLong(enumC57901Mnx.getKeyForStart(), -1L);
        int i = 0;
        int i2 = keva.getInt(enumC57901Mnx.getKeyForCount(), 0);
        long currentTimeMillis = System.currentTimeMillis();
        int period = enumC57901Mnx.getPeriod() * 60 * 60 * 1000;
        if (j == -1 || currentTimeMillis - j > period) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(enumC57901Mnx);
            LIZ2.append(", reset time and follow cnt");
            C221018lt.LJFF("RecMore", X1D.LIZIZ(LIZ2));
            keva.storeLong(enumC57901Mnx.getKeyForStart(), currentTimeMillis);
            keva.storeInt(enumC57901Mnx.getKeyForCount(), 0);
        } else {
            i = i2;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(enumC57901Mnx);
        LIZ3.append(", current follow cnt: ");
        LIZ3.append(i);
        C221018lt.LJFF("RecMore", X1D.LIZIZ(LIZ3));
        return i;
    }

    public static void LJII(EnumC57901Mnx enumC57901Mnx) {
        o.LJIIIZ(enumC57901Mnx, "<this>");
        if (enumC57901Mnx.getPeriod() == -1 || enumC57901Mnx.getMaxCount() == null) {
            return;
        }
        Keva keva = LIZJ;
        if (keva.getLong(enumC57901Mnx.getKeyForStart(), -1L) == -1) {
            keva.storeLong(enumC57901Mnx.getKeyForStart(), System.currentTimeMillis());
        }
        int LIZJ2 = LIZJ(enumC57901Mnx) + 1;
        keva.storeInt(enumC57901Mnx.getKeyForCount(), LIZJ2);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("record followCnt: ");
        LIZ2.append(LIZJ2);
        C221018lt.LJFF("RecMore", X1D.LIZIZ(LIZ2));
    }

    /* loaded from: classes10.dex */
    public static final class Value {

        @InterfaceC65349Pkn("card_rec_more")
        public final CardStrategy cardStrategy;

        @InterfaceC65349Pkn("video_rec_more")
        public final VideoStrategy videoStrategy;

        /* JADX WARN: Multi-variable type inference failed */
        public Value() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Value)) {
                return false;
            }
            Value value = (Value) obj;
            return o.LJ(this.cardStrategy, value.cardStrategy) && o.LJ(this.videoStrategy, value.videoStrategy);
        }

        public final int hashCode() {
            CardStrategy cardStrategy = this.cardStrategy;
            int hashCode = (cardStrategy == null ? 0 : cardStrategy.hashCode()) * 31;
            VideoStrategy videoStrategy = this.videoStrategy;
            return hashCode + (videoStrategy != null ? videoStrategy.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Value(cardStrategy=");
            LIZ.append(this.cardStrategy);
            LIZ.append(", videoStrategy=");
            LIZ.append(this.videoStrategy);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public Value(CardStrategy cardStrategy, VideoStrategy videoStrategy) {
            this.cardStrategy = cardStrategy;
            this.videoStrategy = videoStrategy;
        }

        public /* synthetic */ Value(CardStrategy cardStrategy, VideoStrategy videoStrategy, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : cardStrategy, (i & 2) != 0 ? null : videoStrategy);
        }
    }

    public static boolean LIZIZ(EnumC57901Mnx enumC57901Mnx, Integer num) {
        if (num != null) {
            if (LIZJ(enumC57901Mnx) >= num.intValue()) {
                return false;
            }
        }
        return true;
    }
}
