package X;

import java.util.HashMap;

/* loaded from: classes9.dex */
public enum IWI implements ITS {
    Normal(true, "prepare_time", "first_frame_time"),
    Local(true, "prepare_time", "first_frame_time"),
    Story(false, "story_prepare_time", "story_first_frame_time");

    public static final java.util.Map<String, String> LJLJLJ;
    public final boolean LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public boolean LJLJJI = true;
    public boolean LJLJJL = IZ8.LJJIJLIJ();
    public String LJLJJLL;
    public String LJLJL;

    static {
        HashMap hashMap = new HashMap();
        LJLJLJ = hashMap;
        hashMap.put("prepare_time", "video_bitrate_prepare_time");
        hashMap.put("story_prepare_time", "story_video_bitrate_prepare_time");
        hashMap.put("first_frame_time", "aweme_video_bitrate_first_frame_log");
        hashMap.put("story_first_frame_time", "story_video_bitrate_first_frame_time");
    }

    @Override // X.ITS
    public String getFirstFrameKey() {
        if (IUB.LIZIZ().videoBitRateEnabled()) {
            return (String) ((HashMap) LJLJLJ).get(this.LJLJI);
        }
        return this.LJLJI;
    }

    @Override // X.ITS
    public String getPrepareKey() {
        if (IUB.LIZIZ().videoBitRateEnabled()) {
            return (String) ((HashMap) LJLJLJ).get(this.LJLILLLLZI);
        }
        return this.LJLILLLLZI;
    }

    public String getSubTag() {
        return this.LJLJL;
    }

    public String getTag() {
        return this.LJLJJLL;
    }

    @Override // X.ITS
    public boolean isLoop() {
        return this.LJLIL;
    }

    @Override // X.ITS
    public boolean isPlayLoop() {
        return this.LJLJJI;
    }

    public boolean isUseSuperResolution() {
        return this.LJLJJL;
    }

    public static IWI valueOf(String str) {
        return (IWI) V0N.LJJJ(IWI.class, str);
    }

    public void setLoop(boolean z) {
        this.LJLJJI = z;
    }

    public void setSubTag(String str) {
        this.LJLJL = str;
    }

    public void setTag(String str) {
        this.LJLJJLL = str;
    }

    public void setUseSuperResolution(boolean z) {
        this.LJLJJL = z;
    }

    IWI(boolean z, String str, String str2) {
        this.LJLIL = z;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }
}
