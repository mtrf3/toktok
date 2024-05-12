package com.ss.android.ugc.aweme.shortvideo.subtitle;

import X.AbstractC73672Svk;
import X.E4Q;
import X.InterfaceC64989Pez;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public interface MusicCopyrightApi {
    @E4Q("/tiktok/ugc_sound/check/")
    AbstractC73672Svk<MusicCopyrightCheckResponse> checkMusicCopyright(@InterfaceC64989Pez("music_id") String str);

    /* loaded from: classes2.dex */
    public static final class MusicCopyrightCheckResponse extends BaseResponse {

        @InterfaceC65349Pkn("music_identification")
        public final Integer musicIdentification;

        /* JADX WARN: Multi-variable type inference failed */
        public MusicCopyrightCheckResponse() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MusicCopyrightCheckResponse) && o.LJ(this.musicIdentification, ((MusicCopyrightCheckResponse) obj).musicIdentification);
        }

        public final int hashCode() {
            Integer num = this.musicIdentification;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MusicCopyrightCheckResponse(musicIdentification=");
            return s0.LIZJ(LIZ, this.musicIdentification, ')', LIZ);
        }

        public MusicCopyrightCheckResponse(Integer num) {
            this.musicIdentification = num;
        }

        public /* synthetic */ MusicCopyrightCheckResponse(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num);
        }
    }
}
