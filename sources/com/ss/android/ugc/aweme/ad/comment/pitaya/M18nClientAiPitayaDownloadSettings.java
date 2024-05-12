package com.ss.android.ugc.aweme.ad.comment.pitaya;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class M18nClientAiPitayaDownloadSettings {
    public static final /* synthetic */ int LIZ = 0;

    /* loaded from: classes2.dex */
    public static final class PitayaKeyNameModel {

        @InterfaceC65349Pkn("client_ai_download_names")
        public final List<String> keyNameList;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PitayaKeyNameModel) && o.LJ(this.keyNameList, ((PitayaKeyNameModel) obj).keyNameList);
        }

        public final int hashCode() {
            return this.keyNameList.hashCode();
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PitayaKeyNameModel(keyNameList=");
            return C1NE.LIZIZ(LIZ, this.keyNameList, ')', LIZ);
        }

        public PitayaKeyNameModel(List<String> keyNameList) {
            o.LJIIIZ(keyNameList, "keyNameList");
            this.keyNameList = keyNameList;
        }
    }
}
