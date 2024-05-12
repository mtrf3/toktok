package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;

/* loaded from: classes7.dex */
public final class FR9 implements InterfaceC56896MUq {
    public final Keva LIZ;

    @Override // X.InterfaceC56896MUq
    public final String LIZLLL() {
        return this.LIZ.getString("tutorial_video_msg_id", "");
    }

    @Override // X.InterfaceC56896MUq
    public final String LJ() {
        return this.LIZ.getString("tutorial_video_icon", "");
    }

    @Override // X.InterfaceC56896MUq
    public final String LJIIJJI() {
        return this.LIZ.getString("tutorial_video_deep_link", "");
    }

    public FR9(Context context) {
        this.LIZ = KevaImpl.getRepoFromSp(context, "TutorialVideoPreference", 0);
    }

    @Override // X.InterfaceC56896MUq
    public final String LIZ(String str) {
        return this.LIZ.getString("tutorial_video_title", str);
    }

    @Override // X.InterfaceC56896MUq
    public final String LIZIZ(String str) {
        return this.LIZ.getString("tutorial_video_button", str);
    }

    @Override // X.InterfaceC56896MUq
    public final void LIZJ(String str) {
        this.LIZ.storeString("tutorial_video_icon", str);
    }

    @Override // X.InterfaceC56896MUq
    public final void LJFF(String str) {
        this.LIZ.storeString("tutorial_video_title", str);
    }

    @Override // X.InterfaceC56896MUq
    public final void LJI(String str) {
        this.LIZ.storeString("tutorial_video_deep_link", str);
    }

    @Override // X.InterfaceC56896MUq
    public final void LJII(String str) {
        this.LIZ.storeString("tutorial_video_msg_id", str);
    }

    @Override // X.InterfaceC56896MUq
    public final void LJIIIIZZ(String str) {
        this.LIZ.storeString("tutorial_video_button", str);
    }

    @Override // X.InterfaceC56896MUq
    public final String LJIIIZ(String str) {
        return this.LIZ.getString("tutorial_video_desc", str);
    }

    @Override // X.InterfaceC56896MUq
    public final void LJIIJ(String str) {
        this.LIZ.storeString("tutorial_video_desc", str);
    }
}
