package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.festival.FestivalService;
import com.ss.android.vesdk.VEWaterMarkPosition;
import java.io.File;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HNA implements HOW {
    public static final /* synthetic */ int LJI = 0;
    public final CreativeInfo LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final java.util.Map<String, String[]> LJFF;

    @Override // X.HOW
    public final HNB LIZLLL() {
        int i = (int) (24 * (this.LIZJ / 1080.0f));
        HNB hnb = new HNB();
        hnb.xOffset = i;
        hnb.yOffset = i;
        hnb.position = VEWaterMarkPosition.TL_BR;
        StringBuilder LIZJ = C06460Ne.LIZJ("WaterMarkPositionConfig xOffset:", i, " yOffset:", i, " videoWidth:");
        LIZJ.append(this.LIZJ);
        H7B.LIZ(X1D.LIZIZ(LIZJ));
        return hnb;
    }

    @Override // X.HOW
    public final void reset() {
        ((HashMap) this.LJFF).clear();
    }

    @Override // X.HOW
    public final CreativeInfo LIZIZ() {
        return this.LIZ;
    }

    @Override // X.HOW
    public final void LIZ(boolean z, InterfaceC45930I0w user) {
        o.LJIIIZ(user, "user");
        LJFF(z, user);
    }

    @Override // X.HOW
    public final String[] LIZJ(String text, InterfaceC45930I0w user) {
        boolean z;
        int i;
        o.LJIIIZ(text, "text");
        o.LJIIIZ(user, "user");
        if (C41326GJu.LIZIZ(user) && !TextUtils.isEmpty(text)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(text);
            LIZ.append(this.LIZJ);
            LIZ.append(this.LIZLLL);
            LIZ.append(SettingServiceImpl.LIZ().getAppLanguage());
            String LIZIZ = X1D.LIZIZ(LIZ);
            String[] strArr = (String[]) ((HashMap) this.LJFF).get(LIZIZ);
            if (strArr != null && strArr.length > 0) {
                return strArr;
            }
            String filePrefix = C38352F3k.LIZJ(LIZIZ);
            File file = new File(C41326GJu.LIZ(this.LIZ));
            if (file.exists() || file.mkdirs()) {
                z = true;
            } else {
                z = false;
            }
            int i2 = this.LIZJ;
            if (i2 != 0 && (i = this.LIZLLL) != 0) {
                if (!z) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("provide error ");
                    LIZ2.append(z);
                    LIZ2.append(' ');
                    LIZ2.append(this.LIZJ);
                    LIZ2.append(' ');
                    LIZ2.append(this.LIZLLL);
                    C170666ms.LIZJ(new IllegalStateException(X1D.LIZIZ(LIZ2)));
                    return null;
                }
                CreativeInfo creativeInfo = this.LIZ;
                o.LJIIIIZZ(filePrefix, "filePrefix");
                String[] LJJJJLL = C76917UGr.LJJJJLL(creativeInfo, i2, i, text, filePrefix);
                ((HashMap) this.LJFF).put(LIZIZ, LJJJJLL);
                return LJJJJLL;
            }
        }
        return null;
    }

    @Override // X.HOW
    public final void LJ(String text, InterfaceC45930I0w user) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(user, "user");
        LIZJ(text, user);
    }

    @Override // X.HOW
    public final String[] LJFF(boolean z, InterfaceC45930I0w user) {
        String uniqueId;
        boolean z2;
        int i;
        boolean z3;
        String str;
        o.LJIIIZ(user, "user");
        if (TextUtils.isEmpty(user.getUniqueId())) {
            uniqueId = user.getShortId();
        } else {
            uniqueId = user.getUniqueId();
        }
        if (uniqueId == null) {
            uniqueId = "";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(uniqueId);
        LIZ.append(z);
        LIZ.append(this.LIZJ);
        LIZ.append(this.LIZLLL);
        String LIZIZ = X1D.LIZIZ(LIZ);
        String[] strArr = (String[]) ((HashMap) this.LJFF).get(LIZIZ);
        if (strArr == null || strArr.length == 0) {
            String filePrefix = C38352F3k.LIZJ(this.LIZIZ);
            if (TextUtils.isEmpty(uniqueId)) {
                C170666ms.LIZJ(new IllegalArgumentException("userId is empty"));
                return null;
            }
            File file = new File(C5YW.LIZIZ().LJJIIZ(this.LIZ));
            if (file.exists() || file.mkdirs()) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i2 = this.LIZJ;
            if (i2 == 0 || (i = this.LIZLLL) == 0) {
                return null;
            }
            if (!z2) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("provide error ");
                LIZ2.append(z2);
                LIZ2.append(' ');
                LIZ2.append(this.LIZJ);
                LIZ2.append(' ');
                LIZ2.append(this.LIZLLL);
                C170666ms.LIZJ(new IllegalStateException(X1D.LIZIZ(LIZ2)));
                return null;
            }
            CreativeInfo creativeInfo = this.LIZ;
            int i3 = this.LJ;
            o.LJIIIIZZ(filePrefix, "filePrefix");
            o.LJIIIZ(creativeInfo, "creativeInfo");
            HN5 hn5 = new HN5();
            String LIZ3 = FestivalService.LIZIZ().LIZ();
            o.LJIIIIZZ(LIZ3, "get().getService(IFestiv…::class.java).waterPicDir");
            hn5.LIZIZ = LIZ3;
            String LJJII = C76917UGr.LJJII(user);
            boolean LIZIZ2 = C41326GJu.LIZIZ(user);
            if (i3 == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            H72[] LIZ4 = HN0.LIZ(i2, i, LJJII, LIZIZ2, z3, z, new HN4(hn5.LIZ, hn5.LIZIZ));
            String LJJIIZ = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJIIZ(creativeInfo);
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append(filePrefix);
            if (z) {
                str = "_leftalign";
            } else {
                str = "_rightalign";
            }
            LIZ5.append(str);
            String[] LIZIZ3 = HN0.LIZIZ(LIZ4, LJJIIZ, X1D.LIZIZ(LIZ5));
            ((HashMap) this.LJFF).put(LIZIZ, LIZIZ3);
            return LIZIZ3;
        }
        return strArr;
    }

    public HNA(CreativeInfo creativeInfo, String str, int i, int i2, int i3) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        this.LIZ = creativeInfo;
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = i3;
        this.LJFF = new HashMap();
    }
}
