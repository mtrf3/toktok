package X;

import com.ss.android.ugc.aweme.relation.experiment.RecMoreExperiment;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Mnx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC57901Mnx {
    public static final EnumC57901Mnx CARD;
    public static final /* synthetic */ EnumC57901Mnx[] LJLIL;
    public static final EnumC57901Mnx VIDEO;

    public EnumC57901Mnx() {
        throw null;
    }

    public static EnumC57901Mnx valueOf(String str) {
        return (EnumC57901Mnx) V0N.LJJJ(EnumC57901Mnx.class, str);
    }

    public static EnumC57901Mnx[] values() {
        return (EnumC57901Mnx[]) LJLIL.clone();
    }

    public abstract String getKeyForCount();

    public abstract String getKeyForStart();

    public abstract Integer getMaxCount();

    public abstract int getPeriod();

    static {
        EnumC57901Mnx enumC57901Mnx = new EnumC57901Mnx() { // from class: X.Mny
            public final String LJLILLLLZI;

            {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("card_follow_cnt_");
                LIZ.append(RecMoreExperiment.LIZLLL());
                this.LJLILLLLZI = X1D.LIZIZ(LIZ);
            }

            @Override // X.EnumC57901Mnx
            public final String getKeyForStart() {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("card_follow_start_");
                LIZ.append(RecMoreExperiment.LIZLLL());
                return X1D.LIZIZ(LIZ);
            }

            @Override // X.EnumC57901Mnx
            public final Integer getMaxCount() {
                RecMoreExperiment.CardStrategy cardStrategy = RecMoreExperiment.LJI().cardStrategy;
                if (cardStrategy != null) {
                    return cardStrategy.maxFollowCount;
                }
                return null;
            }

            @Override // X.EnumC57901Mnx
            public final int getPeriod() {
                Integer num;
                RecMoreExperiment.CardStrategy cardStrategy = RecMoreExperiment.LJI().cardStrategy;
                if (cardStrategy != null && (num = cardStrategy.followPeriodHours) != null) {
                    return num.intValue();
                }
                return -1;
            }

            @Override // X.EnumC57901Mnx
            public final String getKeyForCount() {
                return this.LJLILLLLZI;
            }
        };
        CARD = enumC57901Mnx;
        EnumC57901Mnx enumC57901Mnx2 = new EnumC57901Mnx() { // from class: X.Mo0
            public final String LJLILLLLZI;

            {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("video_follow_cnt_");
                LIZ.append(RecMoreExperiment.LIZLLL());
                this.LJLILLLLZI = X1D.LIZIZ(LIZ);
            }

            @Override // X.EnumC57901Mnx
            public final String getKeyForStart() {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("video_follow_start_");
                LIZ.append(RecMoreExperiment.LIZLLL());
                return X1D.LIZIZ(LIZ);
            }

            @Override // X.EnumC57901Mnx
            public final Integer getMaxCount() {
                RecMoreExperiment.VideoStrategy videoStrategy = RecMoreExperiment.LJI().videoStrategy;
                if (videoStrategy != null) {
                    return videoStrategy.maxFollowCount;
                }
                return null;
            }

            @Override // X.EnumC57901Mnx
            public final int getPeriod() {
                Integer num;
                RecMoreExperiment.VideoStrategy videoStrategy = RecMoreExperiment.LJI().videoStrategy;
                if (videoStrategy != null && (num = videoStrategy.followPeriodHours) != null) {
                    return num.intValue();
                }
                return -1;
            }

            @Override // X.EnumC57901Mnx
            public final String getKeyForCount() {
                return this.LJLILLLLZI;
            }
        };
        VIDEO = enumC57901Mnx2;
        LJLIL = new EnumC57901Mnx[]{enumC57901Mnx, enumC57901Mnx2};
    }

    public EnumC57901Mnx(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
