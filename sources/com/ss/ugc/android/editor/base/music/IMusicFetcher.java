package com.ss.ugc.android.editor.base.music;

import X.C2YQ;
import X.C48339Iy7;
import X.X1D;
import com.ss.ugc.android.editor.base.data.MusicItem;
import defpackage.b0;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public interface IMusicFetcher {

    /* loaded from: classes2.dex */
    public static final class MusicCustomRequest {
        public final C2YQ config;
        public final int pageIndex;
        public final int pageSize;

        public static /* synthetic */ MusicCustomRequest copy$default(MusicCustomRequest musicCustomRequest, C2YQ c2yq, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                c2yq = musicCustomRequest.config;
            }
            if ((i3 & 2) != 0) {
                i = musicCustomRequest.pageIndex;
            }
            if ((i3 & 4) != 0) {
                i2 = musicCustomRequest.pageSize;
            }
            return musicCustomRequest.copy(c2yq, i, i2);
        }

        public final MusicCustomRequest copy(C2YQ config, int i, int i2) {
            o.LJIIIZ(config, "config");
            return new MusicCustomRequest(config, i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MusicCustomRequest)) {
                return false;
            }
            MusicCustomRequest musicCustomRequest = (MusicCustomRequest) obj;
            return o.LJ(this.config, musicCustomRequest.config) && this.pageIndex == musicCustomRequest.pageIndex && this.pageSize == musicCustomRequest.pageSize;
        }

        public int hashCode() {
            return (((this.config.hashCode() * 31) + this.pageIndex) * 31) + this.pageSize;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MusicCustomRequest(config=");
            LIZ.append(this.config);
            LIZ.append(", pageIndex=");
            LIZ.append(this.pageIndex);
            LIZ.append(", pageSize=");
            return b0.LIZJ(LIZ, this.pageSize, ')', LIZ);
        }

        public final C2YQ getConfig() {
            return this.config;
        }

        public final int getPageIndex() {
            return this.pageIndex;
        }

        public final int getPageSize() {
            return this.pageSize;
        }

        public MusicCustomRequest(C2YQ config, int i, int i2) {
            o.LJIIIZ(config, "config");
            this.config = config;
            this.pageIndex = i;
            this.pageSize = i2;
        }
    }

    /* loaded from: classes2.dex */
    public static final class MusicCustomResponse {
        public final List<MusicItem> data;
        public final boolean hasMore;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MusicCustomResponse copy$default(MusicCustomResponse musicCustomResponse, List list, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                list = musicCustomResponse.data;
            }
            if ((i & 2) != 0) {
                z = musicCustomResponse.hasMore;
            }
            return musicCustomResponse.copy(list, z);
        }

        public final MusicCustomResponse copy(List<MusicItem> list, boolean z) {
            return new MusicCustomResponse(list, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MusicCustomResponse)) {
                return false;
            }
            MusicCustomResponse musicCustomResponse = (MusicCustomResponse) obj;
            return o.LJ(this.data, musicCustomResponse.data) && this.hasMore == musicCustomResponse.hasMore;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            List<MusicItem> list = this.data;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            boolean z = this.hasMore;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MusicCustomResponse(data=");
            LIZ.append(this.data);
            LIZ.append(", hasMore=");
            return C48339Iy7.LIZJ(LIZ, this.hasMore, ')', LIZ);
        }

        public final List<MusicItem> getData() {
            return this.data;
        }

        public final boolean getHasMore() {
            return this.hasMore;
        }

        public MusicCustomResponse(List<MusicItem> list, boolean z) {
            this.data = list;
            this.hasMore = z;
        }
    }
}
