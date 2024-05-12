package X;

import android.text.TextUtils;
import com.bytedance.apm.impl.DefaultTTNetImpl;
import defpackage.i0;
import java.util.HashSet;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.FTp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39033FTp {
    public boolean LIZ;
    public boolean LIZIZ;
    public PEV LJI;
    public DefaultTTNetImpl LJII;
    public InterfaceC64117PEj LJIIJ;
    public FUF LJIIJJI;
    public InterfaceC58333Muv LJIIL;
    public FU0 LJIILIIL;
    public InterfaceC64046PBq LJIILL;
    public List<String> LIZJ = C39038FTu.LIZ;
    public List<String> LIZLLL = C39038FTu.LIZJ;
    public List<String> LJ = C39038FTu.LJFF;
    public final JSONObject LJFF = new JSONObject();
    public final java.util.Set<InterfaceC64110PEc> LJIIIIZZ = new HashSet();
    public long LJIIIZ = 0;
    public final C39039FTv LJIILJJIL = new C39039FTv();
    public final C48002Isg LJIILLIIL = new C48002Isg();

    public final C39034FTq LIZ() {
        if (!TextUtils.isEmpty(this.LJFF.optString("aid"))) {
            TextUtils.isEmpty(this.LJFF.optString("app_version"));
            TextUtils.isEmpty(this.LJFF.optString("update_version_code"));
            TextUtils.isEmpty(this.LJFF.optString("device_id"));
            TextUtils.isEmpty(this.LJFF.optString("release_build"));
            return new C39034FTq(this);
        }
        throw new IllegalArgumentException(i0.LJFF("aid", " must not be empty"));
    }
}
