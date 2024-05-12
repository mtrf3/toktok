package X;

import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLiveSeekableRange;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;

/* renamed from: X.Zed, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90447Zed {
    public C90639Zhj LIZ;

    public final int LIZ() {
        C90639Zhj c90639Zhj = this.LIZ;
        if (c90639Zhj == null || !c90639Zhj.LJIIIZ()) {
            return 0;
        }
        C90639Zhj c90639Zhj2 = this.LIZ;
        if (!c90639Zhj2.LJIIJJI() && c90639Zhj2.LJIIL()) {
            return 0;
        }
        int LIZJ = (int) (c90639Zhj2.LIZJ() - LJ());
        if (c90639Zhj2.LJJIFFI()) {
            int LIZLLL = LIZLLL();
            LIZJ = Math.min(Math.max(LIZJ, LIZLLL), LIZJ());
        }
        return Math.min(Math.max(LIZJ, 0), LIZIZ());
    }

    public final int LIZIZ() {
        C90639Zhj c90639Zhj;
        MediaInfo LJ;
        MediaMetadata mediaMetadata;
        Long LJII;
        MediaInfo mediaInfo;
        C90639Zhj c90639Zhj2 = this.LIZ;
        long j = 1;
        if (c90639Zhj2 != null && c90639Zhj2.LJIIIZ()) {
            C90639Zhj c90639Zhj3 = this.LIZ;
            if (!c90639Zhj3.LJIIJJI()) {
                if (c90639Zhj3.LJIIL()) {
                    MediaQueueItem LIZLLL = c90639Zhj3.LIZLLL();
                    if (LIZLLL != null && (mediaInfo = LIZLLL.zzb) != null) {
                        j = Math.max(mediaInfo.zzg, 1L);
                    }
                } else {
                    j = Math.max(c90639Zhj3.LJIIIIZZ(), 1L);
                }
            } else {
                C90639Zhj c90639Zhj4 = this.LIZ;
                if (c90639Zhj4 != null && c90639Zhj4.LJIIIZ() && this.LIZ.LJIIJJI() && (c90639Zhj = this.LIZ) != null && c90639Zhj.LJIIIZ() && (LJ = this.LIZ.LJ()) != null && (mediaMetadata = LJ.zzf) != null && mediaMetadata.LJJJJL("com.google.android.gms.cast.metadata.SECTION_DURATION") && (LJII = LJII()) != null) {
                    long longValue = LJII.longValue();
                    MediaMetadata.LJJJJZI(5, "com.google.android.gms.cast.metadata.SECTION_DURATION");
                    Long valueOf = Long.valueOf(longValue + mediaMetadata.LJLIL.getLong("com.google.android.gms.cast.metadata.SECTION_DURATION"));
                    if (valueOf != null) {
                        j = valueOf.longValue();
                    }
                }
                Long LJFF = LJFF();
                j = LJFF != null ? LJFF.longValue() : Math.max(c90639Zhj3.LIZJ(), 1L);
            }
        }
        return Math.max((int) (j - LJ()), 1);
    }

    public final int LIZJ() {
        C90639Zhj c90639Zhj = this.LIZ;
        if (c90639Zhj == null || !c90639Zhj.LJIIIZ() || !this.LIZ.LJIIJJI()) {
            return LIZIZ();
        }
        if (!this.LIZ.LJJIFFI()) {
            return 0;
        }
        Long LJFF = LJFF();
        QH7.LJIIIIZZ(LJFF);
        int longValue = (int) (LJFF.longValue() - LJ());
        return Math.min(Math.max(longValue, 0), LIZIZ());
    }

    public final int LIZLLL() {
        C90639Zhj c90639Zhj = this.LIZ;
        if (c90639Zhj == null || !c90639Zhj.LJIIIZ() || !this.LIZ.LJIIJJI() || !this.LIZ.LJJIFFI()) {
            return 0;
        }
        Long LJI = LJI();
        QH7.LJIIIIZZ(LJI);
        int longValue = (int) (LJI.longValue() - LJ());
        return Math.min(Math.max(longValue, 0), LIZIZ());
    }

    public final long LJ() {
        C90639Zhj c90639Zhj = this.LIZ;
        if (c90639Zhj == null || !c90639Zhj.LJIIIZ() || !this.LIZ.LJIIJJI()) {
            return 0L;
        }
        C90639Zhj c90639Zhj2 = this.LIZ;
        Long LJII = LJII();
        if (LJII != null) {
            return LJII.longValue();
        }
        Long LJI = LJI();
        if (LJI != null) {
            return LJI.longValue();
        }
        return c90639Zhj2.LIZJ();
    }

    public final Long LJFF() {
        C90639Zhj c90639Zhj;
        MediaStatus LJI;
        long LJIILJJIL;
        C90639Zhj c90639Zhj2 = this.LIZ;
        if (c90639Zhj2 == null || !c90639Zhj2.LJIIIZ() || !this.LIZ.LJIIJJI() || !this.LIZ.LJJIFFI() || (LJI = (c90639Zhj = this.LIZ).LJI()) == null || LJI.zzu == null) {
            return null;
        }
        synchronized (c90639Zhj.LIZ) {
            QH7.LJ("Must be called from the main thread.");
            LJIILJJIL = c90639Zhj.LIZJ.LJIILJJIL();
        }
        return Long.valueOf(LJIILJJIL);
    }

    public final Long LJI() {
        C90639Zhj c90639Zhj;
        MediaStatus LJI;
        MediaLiveSeekableRange mediaLiveSeekableRange;
        long j;
        C90639Zhj c90639Zhj2 = this.LIZ;
        if (c90639Zhj2 == null || !c90639Zhj2.LJIIIZ() || !this.LIZ.LJIIJJI() || !this.LIZ.LJJIFFI() || (LJI = (c90639Zhj = this.LIZ).LJI()) == null || LJI.zzu == null) {
            return null;
        }
        synchronized (c90639Zhj.LIZ) {
            QH7.LJ("Must be called from the main thread.");
            C90827Zkl c90827Zkl = c90639Zhj.LIZJ;
            MediaStatus mediaStatus = c90827Zkl.LJFF;
            if (mediaStatus != null && (mediaLiveSeekableRange = mediaStatus.zzu) != null) {
                j = mediaLiveSeekableRange.zzb;
                if (mediaLiveSeekableRange.zzd) {
                    j = c90827Zkl.LJ(1.0d, j, -1L);
                }
                if (mediaLiveSeekableRange.zze) {
                    j = Math.min(j, mediaLiveSeekableRange.zzc);
                }
            }
            j = 0;
        }
        return Long.valueOf(j);
    }

    public final Long LJII() {
        MediaMetadata mediaMetadata;
        MediaInfo LJ;
        C90639Zhj c90639Zhj = this.LIZ;
        if (c90639Zhj != null && c90639Zhj.LJIIIZ() && this.LIZ.LJIIJJI()) {
            C90639Zhj c90639Zhj2 = this.LIZ;
            MediaInfo LJ2 = c90639Zhj2.LJ();
            C90639Zhj c90639Zhj3 = this.LIZ;
            if (c90639Zhj3 == null || !c90639Zhj3.LJIIIZ() || (LJ = this.LIZ.LJ()) == null) {
                mediaMetadata = null;
            } else {
                mediaMetadata = LJ.zzf;
            }
            if (LJ2 != null && mediaMetadata != null && mediaMetadata.LJJJJL("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA") && (mediaMetadata.LJJJJL("com.google.android.gms.cast.metadata.SECTION_DURATION") || c90639Zhj2.LJJIFFI())) {
                MediaMetadata.LJJJJZI(5, "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA");
                return Long.valueOf(mediaMetadata.LJLIL.getLong("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA"));
            }
        }
        return null;
    }
}
