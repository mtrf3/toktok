package X;

import android.util.Pair;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.dsp.common.model.DspStruct;
import com.ss.android.ugc.aweme.dsp.common.model.DspUpsellRessoStruct;
import com.ss.android.ugc.aweme.music.model.TTMStoreLink;
import kotlin.jvm.internal.o;

/* renamed from: X.Zu6, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91406Zu6 implements InterfaceC91296ZsK {
    public final String LIZ;

    @Override // X.InterfaceC91296ZsK
    public final String LIZIZ() {
        return "";
    }

    @Override // X.InterfaceC91296ZsK
    public final void LIZJ(C91465Zv3 c91465Zv3) {
    }

    @Override // X.InterfaceC91296ZsK
    public final boolean LIZLLL() {
        return false;
    }

    @Override // X.InterfaceC91296ZsK
    public final String LJFF() {
        return "";
    }

    @Override // X.InterfaceC91296ZsK
    public final void LJI(Integer num) {
    }

    @Override // X.InterfaceC91296ZsK
    public final int LJIIIZ() {
        return 0;
    }

    @Override // X.InterfaceC91296ZsK
    public final boolean LJIIJ() {
        return false;
    }

    @Override // X.InterfaceC91296ZsK
    public final void LJIIJJI(int i) {
    }

    @Override // X.InterfaceC91296ZsK
    public final String LJIIL() {
        return "";
    }

    @Override // X.InterfaceC91296ZsK
    public final boolean LJIILIIL() {
        return false;
    }

    @Override // X.InterfaceC91296ZsK
    public final String LJIILJJIL() {
        return "";
    }

    @Override // X.InterfaceC91296ZsK
    public final Integer LJIILL() {
        return 0;
    }

    @Override // X.InterfaceC91296ZsK
    public final void LJIJ(int i) {
    }

    @Override // X.InterfaceC91296ZsK
    public final String getAlbumName() {
        return "";
    }

    @Override // X.InterfaceC91296ZsK
    public final String getArtistName() {
        return "";
    }

    @Override // X.InterfaceC91296ZsK
    public final String getCoverUrl() {
        return "";
    }

    @Override // X.InterfaceC91296ZsK
    public final int getDuration() {
        return 0;
    }

    @Override // X.InterfaceC91296ZsK
    public final int getMediaType() {
        return -1;
    }

    @Override // X.InterfaceC91296ZsK
    public final String getSongName() {
        return "";
    }

    @Override // X.InterfaceC91296ZsK
    public final int w4() {
        return 0;
    }

    @Override // X.InterfaceC91296ZsK
    public final InterfaceC91298ZsM LIZ() {
        return new C91405Zu5();
    }

    @Override // X.InterfaceC91296ZsK
    public final Pair<Integer, Integer> LJ() {
        return new Pair<>(0, 0);
    }

    @Override // X.InterfaceC91296ZsK
    public final DspUpsellRessoStruct LJII() {
        DspUpsellRessoStruct dspUpsellRessoStruct = new DspUpsellRessoStruct();
        dspUpsellRessoStruct.setAppLink(YBK.LIZ().links.getAppLink());
        dspUpsellRessoStruct.setDeepLink(YBK.LIZ().links.getDeepLink());
        dspUpsellRessoStruct.setDownloadLink(YBK.LIZ().links.getDownloadLink());
        YBK.LIZ.getClass();
        dspUpsellRessoStruct.setStoreLink((TTMStoreLink) YBK.LIZLLL.getValue());
        return dspUpsellRessoStruct;
    }

    @Override // X.InterfaceC91296ZsK
    public final DspStruct LJIIIIZZ() {
        return new DspStruct();
    }

    @Override // X.InterfaceC91296ZsK
    public final Pair<Integer, Integer> LJIILLIIL() {
        return new Pair<>(0, 0);
    }

    @Override // X.InterfaceC91296ZsK
    public final UrlModel LJIIZILJ() {
        return new UrlModel();
    }

    @Override // X.InterfaceC91296ZsK
    public final UrlModel getAvatarThumb() {
        return new UrlModel();
    }

    @Override // X.InterfaceC91296ZsK
    public final C91301ZsP getEventData() {
        return new C91301ZsP();
    }

    @Override // X.InterfaceC91296ZsK
    public final String getId() {
        return this.LIZ;
    }

    public C91406Zu6(String idStr) {
        o.LJIIIZ(idStr, "idStr");
        this.LIZ = idStr;
    }
}
