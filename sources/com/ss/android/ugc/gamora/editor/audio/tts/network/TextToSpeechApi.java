package com.ss.android.ugc.gamora.editor.audio.tts.network;

import X.AbstractC73672Svk;
import X.C139005cu;
import X.C221108m2;
import X.C62822Ol8;
import X.E8M;
import X.InterfaceC195737mD;
import X.InterfaceC36228EJs;
import X.InterfaceC64986Pew;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import defpackage.q;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class TextToSpeechApi {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C139005cu.LJLIL);

    /* loaded from: classes3.dex */
    public interface Api {
        @E8M("/media/api/text/speech/invoke/")
        AbstractC73672Svk<FetchTextAudioResponse> requestAudio(@InterfaceC64986Pew("req_text") String str, @InterfaceC64986Pew("speaker_map_type") int i, @InterfaceC36228EJs Map<String, String> map, @InterfaceC195737mD Object obj);
    }

    /* loaded from: classes3.dex */
    public static final class TextAudioData {

        @InterfaceC65349Pkn("v_str")
        public final String audio;

        @InterfaceC65349Pkn("s_key")
        public final String key;

        /* JADX WARN: Multi-variable type inference failed */
        public TextAudioData() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ TextAudioData copy$default(TextAudioData textAudioData, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = textAudioData.key;
            }
            if ((i & 2) != 0) {
                str2 = textAudioData.audio;
            }
            return textAudioData.copy(str, str2);
        }

        public final TextAudioData copy(String str, String str2) {
            return new TextAudioData(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextAudioData)) {
                return false;
            }
            TextAudioData textAudioData = (TextAudioData) obj;
            return o.LJ(this.key, textAudioData.key) && o.LJ(this.audio, textAudioData.audio);
        }

        public int hashCode() {
            String str = this.key;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.audio;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("TextAudioData(key=");
            LIZ.append(this.key);
            LIZ.append(", audio=");
            return q.LIZIZ(LIZ, this.audio, ')', LIZ);
        }

        public final String getAudio() {
            return this.audio;
        }

        public final String getKey() {
            return this.key;
        }

        public TextAudioData(String str, String str2) {
            this.key = str;
            this.audio = str2;
        }

        public /* synthetic */ TextAudioData(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }
    }

    /* loaded from: classes3.dex */
    public static final class FetchTextAudioResponse extends BaseNetResponse {
        public final TextAudioData data;

        public final TextAudioData getData() {
            return this.data;
        }
    }
}
