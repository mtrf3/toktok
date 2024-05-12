package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C110614Vt;
import X.C2068389v;
import X.C246349le;
import X.C250709sg;
import X.C250929t2;
import X.C26338AVi;
import X.C47261Igj;
import X.C51764KTg;
import X.C61328O5c;
import X.C76800UCe;
import X.C7MY;
import X.C86550Xxy;
import X.FKM;
import X.InterfaceC65784Pro;
import X.J1N;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.assem.music.mute.OpenOnMuteImpl;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushConfig;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class AqS104S0101000_4 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AqS104S0101000_4 aqS104S0101000_4) {
        boolean z;
        boolean z2;
        int i;
        Activity LIZIZ = FKM.LIZIZ();
        if (LIZIZ != null) {
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.cf);
            c110614Vt.LJII = C7MY.LIZIZ(48);
            c110614Vt.LJI = C7MY.LIZIZ(48);
            c110614Vt.LIZJ = C61328O5c.LIZJ(24);
            Drawable LIZ = c110614Vt.LIZ(LIZIZ);
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZIZ = C7MY.LIZIZ(24);
            c2068389v.LIZJ = C7MY.LIZIZ(24);
            c2068389v.LIZ = R.raw.icon_speaker_x_mark_fill_ltr;
            LayerDrawable LJIIJ = C26338AVi.LJIIJ(c2068389v.LIZ(LIZIZ), LIZ);
            String LIZIZ2 = ((OpenOnMuteImpl) aqS104S0101000_4.l0).LIZIZ(null);
            if (o.LJ(LIZIZ2, "homepage_hot") || o.LJ(LIZIZ2, "homepage_follow")) {
                z = true;
            } else {
                z = false;
            }
            if (aqS104S0101000_4.i1 == 25) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (J1N.LJIIIZ && z2 && z && (!C250929t2.LIZJ || !C86550Xxy.LIZIZ.LIZLLL(false))) {
                Resources resources = LIZIZ.getResources();
                int i2 = 0;
                InnerPushConfig innerPushConfig = new InnerPushConfig(10L, null, i2, C47261Igj.LJJIJ(6), i2, 22, null == true ? 1 : 0);
                List LJJIJ = C47261Igj.LJJIJ(LJIIJ);
                String string = resources.getString(R.string.jc7);
                if (C250709sg.LIZ) {
                    i = 3;
                } else {
                    i = 4;
                }
                float f = 0.0f;
                Object[] objArr = null == true ? 1 : 0;
                Object[] objArr2 = null == true ? 1 : 0;
                Object[] objArr3 = null == true ? 1 : 0;
                Object[] objArr4 = null == true ? 1 : 0;
                Object[] objArr5 = null == true ? 1 : 0;
                Object[] objArr6 = null == true ? 1 : 0;
                Object[] objArr7 = null == true ? 1 : 0;
                Object[] objArr8 = null == true ? 1 : 0;
                Object[] objArr9 = null == true ? 1 : 0;
                Object[] objArr10 = null == true ? 1 : 0;
                new C51764KTg(1001, "click_push_unmute", innerPushConfig, new InnerPushUITemplate(i2, objArr, i2, i2, i2, i2, objArr2, objArr3, objArr4, objArr5, objArr6, objArr7, LJJIJ, objArr8, i2, i2, f, f, objArr9, i2, i2, objArr10, 2, null == true ? 1 : 0, i2, i2, null == true ? 1 : 0, null == true ? 1 : 0, string, null == true ? 1 : 0, i2, null == true ? 1 : 0, i, resources.getString(R.string.jc6), null == true ? 1 : 0, i2, i2, i2, i2, null == true ? 1 : 0, null == true ? 1 : 0, f, i2, null == true ? 1 : 0, null == true ? 1 : 0, "aweme://setting/playback", i2, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, -272633857, 1040380, null == true ? 1 : 0), null, null, 204).LIZ();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS104S0101000_4 aqS104S0101000_4) {
        List list = (List) aqS104S0101000_4.l0;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        Keva.getRepo("artist_new_release_highlight_repo").storeStringArray(C246349le.LIZJ("artist_new_released_musics"), (String[]) arrayList.toArray(new String[0]));
        Keva.getRepo("artist_new_release_highlight_repo").storeInt(C246349le.LIZJ("artist_new_release_show_times"), aqS104S0101000_4.i1 + 1);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS104S0101000_4(OpenOnMuteImpl openOnMuteImpl, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = openOnMuteImpl;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS104S0101000_4(List list, List<Long> list2, int i) {
        super(0);
        this.$t = i;
        this.l0 = list;
        this.i1 = list2;
    }
}
