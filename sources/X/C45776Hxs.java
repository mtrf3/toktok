package X;

import Y.IDHandlerS20S0100000_7;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.music.StickPointMusicAlg;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Hxs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45776Hxs {
    public Context LIZ;
    public int LIZIZ;
    public InterfaceC142075hr LJ;
    public StickPointMusicAlg LJFF;
    public boolean LJI;
    public final ArrayList<String> LIZJ = new ArrayList<>();
    public final ArrayList<String> LIZLLL = new ArrayList<>();
    public final ArrayList<String> LJII = new ArrayList<>();
    public final IDHandlerS20S0100000_7 LJIIIIZZ = new IDHandlerS20S0100000_7(this, C16880lQ.LLJJJJ(), 1);

    public final void LIZ() {
        if (this.LIZIZ >= this.LIZJ.size()) {
            InterfaceC142075hr interfaceC142075hr = this.LJ;
            if (interfaceC142075hr != null) {
                interfaceC142075hr.LIZ(this.LJFF, this.LJI);
            }
            this.LJIIIIZZ.removeCallbacksAndMessages(null);
            return;
        }
        String str = (String) ListProtector.get(this.LIZJ, this.LIZIZ);
        String str2 = (String) ListProtector.get(this.LIZLLL, this.LIZIZ);
        Object obj = ListProtector.get(this.LJII, this.LIZIZ);
        o.LJIIIIZZ(obj, "algNameList[downloadFileIndex]");
        String str3 = (String) obj;
        if (TextUtils.isEmpty(str)) {
            this.LJIIIIZZ.sendEmptyMessage(1);
        } else if (C39579Fg7.LIZIZ(str2)) {
            this.LJI |= true;
            this.LJIIIIZZ.sendEmptyMessage(1);
        } else {
            C45422HsA.LIZ(this.LIZ, (String) ListProtector.get(this.LIZJ, this.LIZIZ), (String) ListProtector.get(this.LIZLLL, this.LIZIZ), new C45780Hxw(this, str, str3));
        }
    }

    public final void LIZIZ(Context context, StickPointMusicAlg stickPointMusicAlg) {
        o.LJIIIZ(context, "context");
        if (stickPointMusicAlg == null) {
            InterfaceC142075hr interfaceC142075hr = this.LJ;
            if (interfaceC142075hr != null) {
                interfaceC142075hr.LIZ(stickPointMusicAlg, this.LJI);
                return;
            }
            return;
        }
        this.LJFF = stickPointMusicAlg;
        this.LIZ = context;
        this.LJI = false;
        this.LIZJ.clear();
        this.LIZLLL.clear();
        this.LIZIZ = 0;
        if (!TextUtils.isEmpty(stickPointMusicAlg.getVeBeatsUrl())) {
            this.LIZJ.add(stickPointMusicAlg.getVeBeatsUrl());
            this.LIZLLL.add(stickPointMusicAlg.getVeBeatsPath());
            this.LJII.add("ve-beats");
        }
        if (!TextUtils.isEmpty(stickPointMusicAlg.getDownBeatsUrl())) {
            this.LIZJ.add(stickPointMusicAlg.getDownBeatsUrl());
            this.LIZLLL.add(stickPointMusicAlg.getDownBeatsPath());
            this.LJII.add("down-beats");
        }
        if (!TextUtils.isEmpty(stickPointMusicAlg.getNoStrengthBeatsUrl())) {
            this.LIZJ.add(stickPointMusicAlg.getNoStrengthBeatsUrl());
            this.LIZLLL.add(stickPointMusicAlg.getNoStrengthBeatsPath());
            this.LJII.add("no-strength-beats");
        }
        if (!TextUtils.isEmpty(stickPointMusicAlg.getManModeBeatsUrl())) {
            this.LIZJ.add(stickPointMusicAlg.getManModeBeatsUrl());
            this.LIZLLL.add(stickPointMusicAlg.getManModeBeatsPath());
            this.LJII.add("man_mode");
        }
        if (this.LIZJ.size() == 0) {
            InterfaceC142075hr interfaceC142075hr2 = this.LJ;
            if (interfaceC142075hr2 != null) {
                interfaceC142075hr2.LIZ(stickPointMusicAlg, this.LJI);
                return;
            }
            return;
        }
        LIZ();
    }
}
