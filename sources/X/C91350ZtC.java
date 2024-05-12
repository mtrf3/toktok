package X;

import com.ss.android.ugc.aweme.dsp.playerservice.plugin.AudioEventLoggerPlugin;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.ZtC, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91350ZtC implements InterfaceC91292ZsG {
    public C91605ZxJ LJLIL;
    public final LinkedHashMap<Class<?>, InterfaceC91459Zux> LJLILLLLZI;

    @Override // X.InterfaceC91292ZsG
    public final void onAttach() {
        LJII(new C91498Zva());
        LJII(new C91481ZvJ());
        LJII(new AudioEventLoggerPlugin());
        LJII(new C91485ZvN());
        LJII(new C91499Zvb());
        L41.LIZ.getClass();
        if (L41.LIZ()) {
            LJII(new C91502Zve(0));
        }
        LJII(new C91497ZvZ());
        LJII(new C91483ZvL());
        LJII(new C91482ZvK());
    }

    @Override // X.InterfaceC91292ZsG
    public final void onDetach() {
        Iterator<Map.Entry<Class<?>, InterfaceC91459Zux>> it = this.LJLILLLLZI.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().onDetach();
        }
        this.LJLILLLLZI.clear();
    }

    public C91350ZtC(EnumC91322Zsk scene) {
        o.LJIIIZ(scene, "scene");
        this.LJLILLLLZI = new LinkedHashMap<>();
    }

    public final void LJII(InterfaceC91459Zux interfaceC91459Zux) {
        C91605ZxJ c91605ZxJ = this.LJLIL;
        if (c91605ZxJ != null) {
            interfaceC91459Zux.setMediaPlayerService(c91605ZxJ);
            interfaceC91459Zux.onAttach();
            this.LJLILLLLZI.put(interfaceC91459Zux.getClass(), interfaceC91459Zux);
            return;
        }
        o.LJIJI("mediaPlayerService");
        throw null;
    }
}
