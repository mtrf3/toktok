package X;

import android.os.BaseBundle;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.lynx.hybrid.service.IResourceService;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.AqS63S1100000_10;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Nss, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC60754Nss implements Runnable {
    public final /* synthetic */ C60753Nsr LJLIL;
    public final /* synthetic */ C08200Tw LJLILLLLZI;
    public final /* synthetic */ QXX LJLJI;
    public final /* synthetic */ long LJLJJI;

    public RunnableC60754Nss(C60753Nsr c60753Nsr, C08200Tw c08200Tw, QXX qxx, long j) {
        this.LJLIL = c60753Nsr;
        this.LJLILLLLZI = c08200Tw;
        this.LJLJI = qxx;
        this.LJLJJI = j;
    }

    public final void LIZ() {
        if (this.LJLIL.LIZ == null) {
            C39048FUe c39048FUe = C39048FUe.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("LynxKitI18nProvider request ");
            C39048FUe.LIZIZ(c39048FUe, JBR.LJFF(LIZ, (String) this.LJLILLLLZI.LIZ, ", but resourceService is null", LIZ), EnumC39866Fkk.E, null, 4);
            return;
        }
        String it = (String) this.LJLILLLLZI.LIZ;
        o.LJFF(it, "it");
        if (!ujb.o.LJJJLIIL(it, "__", false) && !ujb.o.LJJJJ(it, "__", false) && s.LJLJJL(it, new String[]{"__"}, 0, 6).size() == 3 && it != null) {
            String string = ((BaseBundle) this.LJLILLLLZI.LIZIZ).getString("access_key");
            InterfaceC61488OBg interfaceC61488OBg = this.LJLIL.LIZ;
            if (interfaceC61488OBg instanceof IResourceService) {
                IResourceService iResourceService = (IResourceService) interfaceC61488OBg;
                String uri = C78949Uyf.LJJIJ(it).toString();
                o.LJFF(uri, "makeRelativeUri(_channel).toString()");
                O1M o1m = new O1M(0);
                if (string != null) {
                    o1m.LJIILLIIL = string;
                }
                o1m.LJFF = it;
                o1m.LIZLLL = 1;
                iResourceService.loadAsync(uri, o1m, new AqS176S0100000_10(this, 214), new AqS176S0100000_10(this, 215));
                return;
            }
            if (!(interfaceC61488OBg instanceof C39902FlK)) {
                return;
            }
            C39902FlK c39902FlK = (C39902FlK) interfaceC61488OBg;
            String LIZ2 = C60757Nsv.LIZ(it);
            RequestParams requestParams = new RequestParams(EnumC61028NxI.LYNX_I18N);
            if (string != null) {
                requestParams.setAccessKey(string);
            }
            requestParams.setChannel(it);
            requestParams.setBundle("lang.json");
            requestParams.setWaitGeckoUpdate(true);
            requestParams.setWaitLowStorageUpdate(true);
            requestParams.setDisableCdn(true);
            requestParams.setLoadToMemory(true);
            requestParams.setNeedLocalFile(Boolean.FALSE);
            C60737Nsb c60737Nsb = this.LJLIL.LIZIZ;
            if (c60737Nsb != null) {
                requestParams.getCustomParams().put("rl_container_uuid", c60737Nsb.containerId);
            }
            c39902FlK.LIZLLL(LIZ2, requestParams, new AqS63S1100000_10(it, this, 14));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
