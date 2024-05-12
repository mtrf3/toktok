package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ihj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47323Ihj implements XU4 {
    public final String LJLIL;
    public InterfaceC47328Iho LJLILLLLZI;
    public InterfaceC47329Ihp LJLJI;
    public InterfaceC47330Ihq LJLJJI;
    public InterfaceC47327Ihn LJLJJL;
    public C47325Ihl LJLJJLL;
    public SimVideoUrlModel LJLJL;
    public long LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public IWH LJLLI;

    @Override // X.XU4
    public final boolean isPlaying() {
        I90 playState;
        IWH iwh = this.LJLLI;
        if (iwh != null && (playState = iwh.getPlayState()) != null) {
            return ((C46751IWl) playState).LIZ();
        }
        return false;
    }

    @Override // X.XU4
    public final void release() {
        IWH iwh = this.LJLLI;
        if (iwh != null) {
            iwh.stop();
        }
        IWH iwh2 = this.LJLLI;
        if (iwh2 != null) {
            iwh2.release();
        }
        this.LJLILLLLZI = null;
        this.LJLJI = null;
        this.LJLJJI = null;
    }

    @Override // X.XU4
    public final void resume() {
        IWH iwh = this.LJLLI;
        if (iwh != null) {
            iwh.resume();
        }
    }

    @Override // X.XU4
    public final void pause() {
        IWH iwh;
        if ((!C34284Dcu.LIZ() || this.LJLL) && (iwh = this.LJLLI) != null) {
            iwh.pause();
        }
    }

    @Override // X.XU4
    public final void stop() {
        IWH iwh;
        if ((!C34284Dcu.LIZ() || this.LJLL) && (iwh = this.LJLLI) != null) {
            iwh.stop();
        }
    }

    public C47323Ihj(String str) {
        this.LJLIL = str;
    }

    @Override // X.XU4
    public final void LIZIZ(InterfaceC47330Ihq interfaceC47330Ihq) {
        this.LJLJJI = interfaceC47330Ihq;
    }

    @Override // X.XU4
    public final void LIZJ(InterfaceC47328Iho interfaceC47328Iho) {
        this.LJLILLLLZI = interfaceC47328Iho;
    }

    @Override // X.XU4
    public final void LIZLLL(C47325Ihl c47325Ihl) {
        if (!this.LJLL) {
            IXL LJFF = ISimPlayerService.LIZ.get().LJFF(true, false);
            LJFF.LIZLLL().LJ(new C78609UtB());
            LJFF.LIZLLL().LIZLLL(new O5Y());
            LJFF.LJJJLL(new C47324Ihk(this));
            this.LJLLI = LJFF;
            this.LJLL = true;
        }
        List<String> list = c47325Ihl.LIZIZ;
        if (list == null) {
            list = new ArrayList<>();
        }
        String str = c47325Ihl.LIZ;
        if (str != null && str.length() != 0) {
            list.add(c47325Ihl.LIZ);
        }
        String str2 = c47325Ihl.LJFF;
        if (str2 == null) {
            str2 = C38352F3k.LIZJ((String) ORZ.LJLLLL(list));
        }
        c47325Ihl.LJFF = str2;
        this.LJLJLJ = SystemClock.elapsedRealtime();
        this.LJLJLLL = c47325Ihl.LJI;
        this.LJLJJLL = c47325Ihl;
        String str3 = c47325Ihl.LJFF;
        String obj = list.toString();
        String str4 = this.LJLIL;
        String str5 = (String) ORZ.LJLLLL(list);
        String str6 = "";
        if (str5 == null) {
            str5 = "";
        }
        C48137Iur.LJ(str3, obj, Long.valueOf(c47325Ihl.LIZLLL), str4, str5);
        SimVideoUrlModel simVideoUrlModel = new SimVideoUrlModel();
        VideoUrlModel videoUrlModel = new VideoUrlModel();
        videoUrlModel.setUrlKey(c47325Ihl.LJFF);
        videoUrlModel.setUrlList(list);
        videoUrlModel.setSourceId(c47325Ihl.LJFF);
        simVideoUrlModel.origin = videoUrlModel;
        simVideoUrlModel.setSourceId(c47325Ihl.LJFF);
        simVideoUrlModel.setUrlKey(c47325Ihl.LJFF);
        simVideoUrlModel.setUrlList(list);
        this.LJLJL = simVideoUrlModel;
        IWH iwh = this.LJLLI;
        if (iwh != null) {
            C46745IWf c46745IWf = new C46745IWf();
            c46745IWf.LJJJJZ = false;
            c46745IWf.LJIILL = c47325Ihl.LJI;
            int i = c47325Ihl.LJII;
            if (i > 0) {
                c46745IWf.LJJJJJ = i;
            }
            int i2 = c47325Ihl.LJIIIIZZ;
            if (i2 > 0) {
                c46745IWf.LJJJJJL = i2;
            }
            c46745IWf.LJIIJ = -1;
            HashMap<String, Object> hashMap = new HashMap<>();
            String str7 = this.LJLIL;
            if (str7 != null) {
                str6 = str7;
            }
            hashMap.put("enter_from", str6);
            c46745IWf.LJJJJLI = hashMap;
            c46745IWf.LJIJJLI = true;
            c46745IWf.LJI = this.LJLJL;
            c46745IWf.LJJJJL = true;
            c46745IWf.LJJJLZIJ = true;
            if (!TextUtils.isEmpty(c47325Ihl.LJIIIZ)) {
                c46745IWf.LJJJZ = c47325Ihl.LJIIIZ;
            }
            c46745IWf.LJJL = c47325Ihl.LJIIJ;
            iwh.LJIIL(c46745IWf);
        }
    }

    @Override // X.XU4
    public final void LJ(XUV xuv) {
        this.LJLJJL = xuv;
    }

    @Override // X.XU4
    public final void LJFF(InterfaceC47329Ihp interfaceC47329Ihp) {
        this.LJLJI = interfaceC47329Ihp;
    }

    @Override // X.XU4
    public final void LIZ(String str, String destPath, C84862XSg c84862XSg) {
        o.LJIIIZ(destPath, "destPath");
        C13870gZ.LIZ().LIZ(str, destPath, c84862XSg);
    }
}
