package X;

import com.ss.android.ugc.aweme.dsp.experiment.MusicArtistCertificationConfig;
import com.ss.android.ugc.aweme.profile.model.ClaimStatus;
import com.ss.android.ugc.aweme.profile.model.MusicTabClaimInfo;
import com.ss.android.ugc.aweme.profile.model.MusicTabInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.9lJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C246139lJ {
    public static final MusicArtistCertificationConfig LIZ = new MusicArtistCertificationConfig(null, null, null, null, 15, null);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C246179lN.LJLIL);

    public static MusicArtistCertificationConfig LIZJ() {
        return (MusicArtistCertificationConfig) LIZIZ.getValue();
    }

    public static String LIZ(EnumC246169lM from, ClaimStatus claimStatus) {
        o.LJIIIZ(from, "from");
        o.LJIIIZ(claimStatus, "claimStatus");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LIZJ().getLandingUrl());
        LIZ2.append("&enter_from=");
        LIZ2.append(from.getFrom());
        LIZ2.append("&user_status=");
        LIZ2.append(claimStatus.getValue());
        return X1D.LIZIZ(LIZ2);
    }

    public static String LIZIZ(EnumC246169lM from, User currUser) {
        MusicTabClaimInfo musicTabClaimInfo;
        int value;
        o.LJIIIZ(from, "from");
        o.LJIIIZ(currUser, "currUser");
        MusicTabInfo musicTabInfo = currUser.getMusicTabInfo();
        if (musicTabInfo != null) {
            musicTabClaimInfo = musicTabInfo.getMusicTabClaimInfo();
        } else {
            musicTabClaimInfo = null;
        }
        if (currUser.getShowArtistPlaylist() == 1) {
            value = ClaimStatus.APPROVED.getValue();
        } else if (musicTabClaimInfo != null) {
            value = musicTabClaimInfo.getStatus();
        } else {
            value = ClaimStatus.UNCLAIMED.getValue();
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LIZJ().getStatusUrl());
        LIZ2.append("&enter_from=");
        LIZ2.append(from.getFrom());
        LIZ2.append("&user_status=");
        LIZ2.append(value);
        StringBuilder sb = new StringBuilder(X1D.LIZIZ(LIZ2));
        if (musicTabClaimInfo != null) {
            String titleKey = musicTabClaimInfo.getTitleKey();
            if (titleKey != null && titleKey.length() > 0) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("&starling_key_title=");
                LIZ3.append(musicTabClaimInfo.getTitleKey());
                sb.append(X1D.LIZIZ(LIZ3));
            }
            String descKey = musicTabClaimInfo.getDescKey();
            if (descKey != null && descKey.length() > 0) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("&starling_key_description=");
                LIZ4.append(musicTabClaimInfo.getDescKey());
                sb.append(X1D.LIZIZ(LIZ4));
            }
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sb.toString()");
        return sb2;
    }
}
