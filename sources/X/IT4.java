package X;

import java.io.Serializable;

/* loaded from: classes9.dex */
public final class IT4 implements Serializable {
    public String LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public long LJLJJL;
    public boolean LJLJJLL;
    public int LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public long LJLLLL;
    public long LJLLLLLL;
    public long LJLZ;
    public boolean LJZ;
    public int LJZI;
    public boolean LJZL;
    public int LL;
    public String actionType;
    public boolean hasSetToken;
    public String subTag;

    public boolean isBytevc1() {
        if (1 == this.LJLILLLLZI) {
            return true;
        }
        return false;
    }

    public boolean isPlayerSdkEventTrackingDisabled() {
        return !this.LJZ;
    }

    public int getAccertSessionPrepareType() {
        return this.LJLJL;
    }

    public int getCodecType() {
        return this.LJLILLLLZI;
    }

    public long getCurrentTimeMillis() {
        return this.LJLZ;
    }

    public long getElapsedRealtime() {
        return this.LJLLLLLL;
    }

    public int getEngineState() {
        return this.LJLJJI;
    }

    public int getHwDecErrReason() {
        return this.LJLJI;
    }

    public String getId() {
        return this.LJLIL;
    }

    public long getOnRenderTime() {
        return this.LJLLLL;
    }

    public int getPlayJavaThreadPriority() {
        return this.LJLLI;
    }

    public int getPlayerArchVersion() {
        return this.LJLLL;
    }

    public int getPlayerSessionCnt() {
        return this.LJZI;
    }

    public int getPrerenderJavaThreadPriority() {
        return this.LJLL;
    }

    public int getRecyclerType() {
        return this.LJLLILLLL;
    }

    public boolean getRenderDisplayed() {
        return this.LJLJJLL;
    }

    public int getSessionStatus() {
        return this.LJLLJ;
    }

    public long getTid() {
        return this.LJLJJL;
    }

    public int getUrlProtocolType() {
        return this.LL;
    }

    public boolean isCodecTypeChanged() {
        return this.LJLJLJ;
    }

    public boolean isMute() {
        return this.LJZL;
    }

    public boolean isPlayerSdkEventTrackingEnabled() {
        return this.LJZ;
    }

    public boolean isTextureRender() {
        return this.LJLJLLL;
    }

    public void setAccertSessionPrepareType(int i) {
        this.LJLJL = i;
    }

    public void setBytevc1(boolean z) {
        this.LJLILLLLZI = z ? 1 : 0;
    }

    public void setCodecType(int i) {
        this.LJLILLLLZI = i;
    }

    public void setCodecTypeChanged(boolean z) {
        this.LJLJLJ = z;
    }

    public void setCurrentTimeMillis(long j) {
        this.LJLZ = j;
    }

    public void setElapsedRealtime(long j) {
        this.LJLLLLLL = j;
    }

    public void setEnablePlayerSdkEventTracking(boolean z) {
        this.LJZ = z;
    }

    public void setEngineState(int i) {
        this.LJLJJI = i;
    }

    public void setHwDecErrReason(int i) {
        this.LJLJI = i;
    }

    public void setId(String str) {
        this.LJLIL = str;
    }

    public void setMute(boolean z) {
        this.LJZL = z;
    }

    public void setOnRenderTime(long j) {
        this.LJLLLL = j;
    }

    public void setPlayJavaThreadPriority(int i) {
        this.LJLLI = i;
    }

    public void setPlayerArchVersion(int i) {
        this.LJLLL = i;
    }

    public void setPlayerSessionCnt(int i) {
        this.LJZI = i;
    }

    public void setPrerenderJavaThreadPriority(int i) {
        this.LJLL = i;
    }

    public void setRecyclerType(int i) {
        this.LJLLILLLL = i;
    }

    public void setRenderDisplayed(boolean z) {
        this.LJLJJLL = z;
    }

    public void setSessionStatus(int i) {
        this.LJLLJ = i;
    }

    public void setTextureRender(boolean z) {
        this.LJLJLLL = z;
    }

    public void setTid(long j) {
        this.LJLJJL = j;
    }

    public void setUrlProtocolType(int i) {
        this.LL = Math.max(i, -1);
    }

    public IT4(String str, int i, boolean z) {
        this.LJLJJI = -1;
        this.LJLJJL = -1L;
        this.LJLLLL = -1L;
        this.LJLLLLLL = -1L;
        this.LJLZ = -1L;
        this.LL = -1;
        this.actionType = "";
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJJLL = z;
    }

    public IT4(String str, boolean z, boolean z2) {
        this(str, z ? 1 : 0, z2);
    }
}
