package X;

import android.view.Surface;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public interface IWH {
    Object LIZ(AbstractC46667ITf abstractC46667ITf);

    InterfaceC46645ISj LIZJ();

    IWK LIZLLL();

    IHR LJ();

    void LJFF(float f);

    void LJI(float f);

    void LJII(Surface surface, boolean z);

    void LJIIIIZZ(C46745IWf c46745IWf);

    void LJIIIZ(IMonitor iMonitor);

    void LJIIJ();

    void LJIIJJI(C47548IlM c47548IlM);

    void LJIIL(C46745IWf c46745IWf);

    void LJIILIIL();

    Object LJIILJJIL(String str);

    void LJJJLL(OnUIPlayListener onUIPlayListener);

    void LJJL();

    void LJJLIIIIJ(InterfaceC46803IYl interfaceC46803IYl);

    void LJJLIIIJ(int i, JSONObject jSONObject);

    void LJJLIIIJILLIZJL(int i);

    void LJJLIIIJJI();

    void LJJLIIIJJIZ(InterfaceC46826IZi interfaceC46826IZi);

    void LJJLIIIJL();

    void LJJLIIIJLLLLLLLZ(int i);

    String LJJLIIJ(int i);

    I90 getPlayState();

    void pause();

    void release();

    void reset();

    void resume();

    void setSurface(Surface surface);

    void stop();
}
