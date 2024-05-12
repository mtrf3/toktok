package X;

import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import kotlin.jvm.internal.o;

/* renamed from: X.WrP, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83595WrP implements InterfaceC79152V4q {
    public boolean LJLIL;
    public float LJLILLLLZI;
    public EnumC83605WrZ LJLJI;
    public int LJLJJI;
    public final String LJLJJL;
    public final CameraComponentModel LJLJJLL;

    @Override // X.InterfaceC79152V4q
    public final boolean LJ() {
        return false;
    }

    @Override // X.InterfaceC79152V4q
    public final float LJII() {
        return 1.0f;
    }

    @Override // X.InterfaceC79152V4q
    public final boolean LIZJ() {
        if (this.LJLJJLL.mHardEncode == 1) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC79152V4q
    public final boolean LIZ() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC79152V4q
    public final float LIZIZ() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC79152V4q
    public final int LIZLLL() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC79152V4q
    public final String LJFF() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC79152V4q
    public final EnumC83605WrZ LJI() {
        return this.LJLJI;
    }

    public C83595WrP(CameraComponentModel cameraComponentModel) {
        o.LJIIIZ(cameraComponentModel, "cameraComponentModel");
        this.LJLJJLL = cameraComponentModel;
        this.LJLILLLLZI = 4.0f;
        this.LJLJI = EnumC83605WrZ.AS_ENCODE_PROFILE_MAIN;
        this.LJLJJI = 15;
        this.LJLJJL = "";
    }
}
