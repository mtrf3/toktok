package X;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class HFB implements Serializable {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public String LJLJLJ;
    public boolean LJLL;
    public boolean LJLLI;
    public long LJLLILLLL;
    public long LJLLJ;
    public int LJLJJI = -1;
    public List<Integer> LJLJJL = C61878OQg.INSTANCE;
    public int LJLJJLL = -1;
    public int LJLJL = -1;
    public List<HFD> LJLJLLL = new ArrayList();

    public final String toJSONString() {
        int i;
        int i2;
        try {
            JSONObject jSONObject = new JSONObject();
            int i3 = 0;
            if (this.LJLIL) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("video_check", i);
            if (this.LJLILLLLZI) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put("audio_check", i2);
            if (!this.LJLJJL.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator<Integer> it = this.LJLJJL.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().intValue());
                }
                jSONObject.put("photo_time", jSONArray.toString());
            }
            jSONObject.put("video_type", this.LJLJL);
            jSONObject.put("content_type", this.LJLJLJ);
            jSONObject.put("origin", this.LJLJJI);
            jSONObject.put("aweme_type", this.LJLJJLL);
            if (this.LJLL) {
                i3 = 1;
            }
            jSONObject.put("is_greenscreen_duet", i3);
            return jSONObject.toString();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public final int getAwemeType() {
        return this.LJLJJLL;
    }

    public final boolean getCheckAudioFrame() {
        return this.LJLILLLLZI;
    }

    public final boolean getCheckImageFrame() {
        return this.LJLJI;
    }

    public final boolean getCheckVideoFrame() {
        return this.LJLIL;
    }

    public final String getContentType() {
        return this.LJLJLJ;
    }

    public final long getEndTime() {
        return this.LJLLJ;
    }

    public final List<Integer> getPhotoDurationList() {
        return this.LJLJJL;
    }

    public final long getStartTime() {
        return this.LJLLILLLL;
    }

    public final List<HFD> getUploadFrameInfoList() {
        return this.LJLJLLL;
    }

    public final int getVideoOrigin() {
        return this.LJLJJI;
    }

    public final int getVideoType() {
        return this.LJLJL;
    }

    public final boolean isGreenDuet() {
        return this.LJLL;
    }

    public final boolean isOnlyLibrary() {
        return this.LJLLI;
    }

    public final void setAwemeType(int i) {
        this.LJLJJLL = i;
    }

    public final void setCheckAudioFrame(boolean z) {
        this.LJLILLLLZI = z;
    }

    public final void setCheckImageFrame(boolean z) {
        this.LJLJI = z;
    }

    public final void setCheckVideoFrame(boolean z) {
        this.LJLIL = z;
    }

    public final void setContentType(String str) {
        this.LJLJLJ = str;
    }

    public final void setEndTime(long j) {
        this.LJLLJ = j;
    }

    public final void setGreenDuet(boolean z) {
        this.LJLL = z;
    }

    public final void setOnlyLibrary(boolean z) {
        this.LJLLI = z;
    }

    public final void setPhotoDurationList(List<Integer> list) {
        o.LJIIIZ(list, "<set-?>");
        this.LJLJJL = list;
    }

    public final void setStartTime(long j) {
        this.LJLLILLLL = j;
    }

    public final void setUploadFrameInfoList(List<HFD> list) {
        o.LJIIIZ(list, "<set-?>");
        this.LJLJLLL = list;
    }

    public final void setVideoOrigin(int i) {
        this.LJLJJI = i;
    }

    public final void setVideoType(int i) {
        this.LJLJL = i;
    }
}
