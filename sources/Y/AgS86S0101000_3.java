package Y;

import X.AbstractC73672Svk;
import X.C10I;
import X.C10K;
import X.C203727z6;
import X.C84935XVb;
import X.M8L;
import X.T16;
import X.XVW;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.music.model.MusicCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class AgS86S0101000_3 implements C10I {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            default:
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x009f, code lost:
    
        if (r4 != 2) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6 A[Catch: all -> 0x00ce, TryCatch #2 {all -> 0x00ce, blocks: (B:8:0x0026, B:12:0x00ca, B:13:0x0038, B:17:0x0040, B:20:0x004c, B:22:0x0056, B:25:0x00a2, B:29:0x00b6, B:31:0x00bc, B:35:0x00c7, B:37:0x00c3, B:41:0x0067, B:43:0x0071, B:45:0x007b, B:49:0x008a, B:51:0x0094), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object then$0(Y.AgS86S0101000_3 r11, X.C10K r12) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS86S0101000_3.then$0(Y.AgS86S0101000_3, X.10K):java.lang.Object");
    }

    public static final Object then$1(AgS86S0101000_3 agS86S0101000_3, C10K c10k) {
        int i;
        switch (agS86S0101000_3.i1) {
            case 0:
                XVW xvw = (XVW) agS86S0101000_3.l0;
                xvw.getClass();
                if (c10k.LJIILJJIL()) {
                    xvw.LIZIZ.jv0(1, "more_tab_music_sheet_refresh_status");
                    xvw.LIZIZ.jv0(1, "more_tab_refresh_status");
                } else if (c10k.LJIILIIL()) {
                    xvw.LIZIZ.jv0(0, "more_tab_music_sheet_refresh_status");
                    ArrayList arrayList = new ArrayList();
                    MusicCollection musicCollection = (MusicCollection) c10k.LJIIJJI();
                    if (musicCollection.getItems().size() > 0) {
                        arrayList.add(new C84935XVb(musicCollection.getItems()));
                    }
                    Collection collection = (Collection) xvw.LIZIZ.get("more_tab_collection_feed");
                    if (collection == null) {
                        if (((Integer) xvw.LIZIZ.get("more_tab_collection_feed_refresh_status", 2)).intValue() == 2) {
                            xvw.LIZIZ.jv0(arrayList, "more_tab_music_sheet");
                        } else {
                            xvw.LIZIZ.jv0(arrayList, "list");
                            xvw.LIZIZ.jv0(0, "more_tab_refresh_status");
                            xvw.LIZIZ.jv0(Boolean.TRUE, "more_tab_has_fetched");
                        }
                    } else {
                        arrayList.addAll(collection);
                        xvw.LIZIZ.jv0(arrayList, "list");
                        xvw.LIZIZ.jv0(0, "more_tab_refresh_status");
                        xvw.LIZIZ.jv0(Boolean.TRUE, "more_tab_has_fetched");
                    }
                }
                return null;
            default:
                C203727z6 c203727z6 = (C203727z6) agS86S0101000_3.l0;
                if (c203727z6.LJLJJL == 2) {
                    if (c10k.LJIILJJIL() || c10k.LJIIL()) {
                        M8L.LIZIZ("/aweme/v1/aweme/collect/", c10k.LJIIJ());
                    } else {
                        M8L.LIZJ("/aweme/v1/aweme/collect/", "net", (BaseResponse) c10k.LJIIJJI());
                    }
                }
                if (c10k.LJIILJJIL() || c10k.LJIIL()) {
                    if (c203727z6.LJLJJL == 2 && (((i = c203727z6.LJLJJI) == 1 || i == 0) && !TextUtils.equals(c203727z6.LJLJJLL, "music_dsp"))) {
                        int i2 = c203727z6.LJLJLLL;
                        c203727z6.LJLJLLL = i2 + 1;
                        if (i2 < 3) {
                            AbstractC73672Svk.LJJLIIIJLJLI(3000L, TimeUnit.MILLISECONDS).LJJL(T16.LIZ()).LIZ(new IDxS304S0100000_3(c203727z6, 2));
                        }
                    }
                    c203727z6.onFailed(c10k.LJIIJ());
                } else {
                    c203727z6.onSuccess();
                }
                return null;
        }
    }

    public AgS86S0101000_3(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
