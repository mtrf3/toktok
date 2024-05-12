package X;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EAN implements Serializable {
    public String LJLIL;
    public List<Long> LJLILLLLZI;
    public List<Integer> LJLJI;
    public List<Integer> LJLJJI;
    public int LJLJJL;
    public double LJLJJLL;
    public String LJLJL;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SelectBitrateInput(aweme_id='");
        LIZ.append(this.LJLIL);
        LIZ.append("', played_dur=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", video_dur=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", video_format='");
        LIZ.append(this.LJLJL);
        LIZ.append("',cached_size=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", bitrate_set=");
        LIZ.append(this.LJLJI);
        LIZ.append(", quality_set=");
        return C1NE.LIZIZ(LIZ, this.LJLJJI, ')', LIZ);
    }

    public final String getAweme_id() {
        return this.LJLIL;
    }

    public final List<Integer> getBitrate_set() {
        return this.LJLJI;
    }

    public final List<Long> getCached_size() {
        return this.LJLILLLLZI;
    }

    public final int getPlayed_dur() {
        return this.LJLJJL;
    }

    public final List<Integer> getQuality_set() {
        return this.LJLJJI;
    }

    public final double getVideo_dur() {
        return this.LJLJJLL;
    }

    public final String getVideo_format() {
        return this.LJLJL;
    }

    public final void setAweme_id(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLIL = str;
    }

    public final void setBitrate_set(List<Integer> list) {
        o.LJIIIZ(list, "<set-?>");
        this.LJLJI = list;
    }

    public final void setCached_size(List<Long> list) {
        o.LJIIIZ(list, "<set-?>");
        this.LJLILLLLZI = list;
    }

    public final void setPlayed_dur(int i) {
        this.LJLJJL = i;
    }

    public final void setQuality_set(List<Integer> list) {
        o.LJIIIZ(list, "<set-?>");
        this.LJLJJI = list;
    }

    public final void setVideo_dur(double d) {
        this.LJLJJLL = d;
    }

    public final void setVideo_format(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLJL = str;
    }

    public EAN(String aweme_id, List<Long> cached_size, List<Integer> bitrate_set, List<Integer> quality_set) {
        o.LJIIIZ(aweme_id, "aweme_id");
        o.LJIIIZ(cached_size, "cached_size");
        o.LJIIIZ(bitrate_set, "bitrate_set");
        o.LJIIIZ(quality_set, "quality_set");
        this.LJLIL = aweme_id;
        this.LJLILLLLZI = cached_size;
        this.LJLJI = bitrate_set;
        this.LJLJJI = quality_set;
        this.LJLJL = "mp4";
    }
}
