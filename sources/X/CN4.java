package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;

/* loaded from: classes6.dex */
public final class CN4 implements InterfaceC28728BPg {
    public final Keva LIZ;

    @Override // X.InterfaceC28728BPg
    public final String LIZJ() {
        return this.LIZ.getString("current_video_path", "");
    }

    @Override // X.InterfaceC28728BPg
    public final int LJI() {
        return this.LIZ.getInt("current_video_height", 0);
    }

    @Override // X.InterfaceC28728BPg
    public final boolean LJII() {
        return this.LIZ.getBoolean("should_mute", false);
    }

    @Override // X.InterfaceC28728BPg
    public final String LJIIIIZZ() {
        return this.LIZ.getString("live_wall_paper_list", "");
    }

    @Override // X.InterfaceC28728BPg
    public final int LJIIJ() {
        return this.LIZ.getInt("current_video_width", 0);
    }

    @Override // X.InterfaceC28728BPg
    public final String getSource() {
        return this.LIZ.getString("source", "");
    }

    @Override // X.InterfaceC28728BPg
    public final float getVolume() {
        return this.LIZ.getFloat("volume", 0.0f);
    }

    public CN4(Context context) {
        this.LIZ = KevaImpl.getRepoFromSp(context, "LiveWallPaper", 0);
    }

    @Override // X.InterfaceC28728BPg
    public final void LIZ(String str) {
        this.LIZ.storeString("source", str);
    }

    @Override // X.InterfaceC28728BPg
    public final void LIZIZ(int i) {
        this.LIZ.storeInt("current_video_height", i);
    }

    @Override // X.InterfaceC28728BPg
    public final void LIZLLL(String str) {
        this.LIZ.storeString("current_video_path", str);
    }

    @Override // X.InterfaceC28728BPg
    public final void LJ(boolean z) {
        this.LIZ.storeBoolean("should_mute", z);
    }

    @Override // X.InterfaceC28728BPg
    public final void LJFF(String str) {
        this.LIZ.storeString("live_wall_paper_list", str);
    }

    @Override // X.InterfaceC28728BPg
    public final void LJIIIZ(int i) {
        this.LIZ.storeInt("current_video_width", i);
    }

    @Override // X.InterfaceC28728BPg
    public final void setVolume(float f) {
        this.LIZ.storeFloat("volume", f);
    }
}
