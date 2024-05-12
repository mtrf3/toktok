package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import kotlin.jvm.internal.o;

/* renamed from: X.XUk, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84918XUk implements InterfaceC84870XSo {
    public final /* synthetic */ C84917XUj LIZ;

    @Override // X.InterfaceC84870XSo
    public final void onCancel() {
    }

    @Override // X.InterfaceC84870XSo
    public final void onProgress(int i) {
    }

    @Override // X.InterfaceC84870XSo
    public final void onStart() {
    }

    public C84918XUk(C84917XUj c84917XUj) {
        this.LIZ = c84917XUj;
    }

    @Override // X.InterfaceC84870XSo
    public final void LIZ(XSX error) {
        o.LJIIIZ(error, "error");
        this.LIZ.LIZ();
    }

    @Override // X.InterfaceC84870XSo
    public final void LIZIZ(String musicFile, MusicWaveBean musicWaveBean, Boolean bool) {
        o.LJIIIZ(musicFile, "musicFile");
        this.LIZ.LIZ();
    }
}
